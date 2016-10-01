#!/bin/bash

#----------------------------------------CUSTOMIZE VARIABLES HERE!
ARTIFACT_NAME=spring-mvc-1.0-SNAPSHOT
PORT=8080
PAGE=web/i
TOMCAT_HOME='/c/Program\ Files/Apache\ Software\ Foundation/Tomcat\ 8.0'
BROWSER='/c/Program\ Files\ \(x86\)/Google/Chrome/Application/chrome'

#----------------------------------------EXECUTE
export JPDA_ADDRESS=8000
export JPDA_TRANSPORT=dt_socket

eval find $TOMCAT_HOME/webapps -mindepth 1 -delete
eval cp target/$ARTIFACT_NAME.war $TOMCAT_HOME/webapps/
eval find $TOMCAT_HOME/logs  -mindepth 1 -delete
eval find $TOMCAT_HOME/conf/Catalina/localhost -mindepth 1 -delete
eval $TOMCAT_HOME/bin/catalina.bat jpda run &
eval start $BROWSER http://localhost:$PORT/$ARTIFACT_NAME/$PAGE
