#!/bin/bash

if [ $1 == 'web' ];then
 docker run -p 8443:8443 --name blog-web -it -v /root/git-rep/docker-jar/web/blog-web-1.0.0.jar:/app.jar --privileged=true -t springboot/blog-web
elif [ $1 == 'admin' ];then
 docker run --name blog-admin  -it -v /root/git-rep/docker-jar:/data -p 8001:8001 springboot/blog-admin

else
 echo "参数有误！"
fi
