#!/bin/bash

if [ $1 == 'web' ];then
 docker run -p 8443:8443 --name blog-web -it -v /root/git-rep/docker-jar/web:/tmp springboot/blog-web
elif [ $1 == 'admin' ];then
 docker run -p 8001:8001 --name blog-admin -it -v /root/git-rep/docker-jar/admin:/tmp springboot/blog-admin
else
 echo "参数有误！"
fi
