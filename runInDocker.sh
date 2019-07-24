#!/bin/bash

if [$1=='web'];then
 docker run -p 8443:8443 -t springboot/blog-web
else if [$1=='admin'];then
 docker run -p 8001:8001 -t springboot/blog-admin
else
 echo '参数有误！'