#!/bin/bash

if [ $1 == 'web' ];then
 docker run --name blog-web  -p 8443:8443 -v /etc/localtime:/etc/localtime:ro -t springboot/blog-web
elif [ $1 == 'admin' ];then
 docker run --name blog-admin  -p 8001:8001 -v /etc/localtime:/etc/localtime:ro -t springboot/blog-admin
else
 echo "参数有误！"
fi
