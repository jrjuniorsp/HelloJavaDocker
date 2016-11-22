FROM tomcat:8.0.39-jre8

#Create app directory
RUN mkdir -p /usr/local/tomcat/webapps

#Copy WAR file
COPY target/HelloJavaDocker.war /usr/local/tomcat/webapps/
