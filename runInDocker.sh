#!/bin/bash

if [ $1 == 'web' ];then
 docker run --name blog-web -it -v /root/git-rep/docker-jar/web:/data -d -p 8443:8443 -p springboot/blog-web
elif [ $1 == 'admin' ];then
 docker run --name blog-admin -it -v /root/git-rep/docker-jar/admin:/data -d -p 8001:8001 -p springboot/blog-admin
else
 echo "参数有误！"
fi
