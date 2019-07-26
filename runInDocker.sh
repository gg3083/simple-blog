#!/bin/bash

if [ $1 == 'web' ];then
 docker run --name blog-web  -p 8443:8443 -t springboot/blog-web
elif [ $1 == 'admin' ];then
 docker run --name blog-admin  -p 8001:8001 -t springboot/blog-admin
else
 echo "参数有误！"
fi
