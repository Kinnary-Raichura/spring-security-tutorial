# spring-security-tutorial

This tutorial uses gradle to build the porject. Reference for the same is 
https://spring.io/guides/gs/accessing-data-rest/

For logging it uses the standarad logging provided by spring boot (logback)
http://docs.spring.io/spring-boot/docs/current/reference/html/howto-logging.html

For Spring security the reference app used is
http://g00glen00b.be/securing-your-rest-api-with-spring-security/
Also for role based security to get the details from an account in repository, used the resource -
http://ryanjbaxter.com/2015/01/06/securing-rest-apis-with-spring-boot/

Also helpful (but not implemnted is )
https://github.com/spring-projects/spring-data-examples/tree/master/rest/security
@PreAuthorize could not be implemented here, because the users themselves have to be taken from a repository and could not
be initialised. Will need to figure out a better way if this can be done. For now have restricted the access in the main 
method.

sample uri s are
http://localhost:8080/account/search/findByUserName?name=user


Since we use a gradle wrapper, on cloing this project, Gradle need not be installed.

To Run this app
----------------
1)Go to the porject folder
2)gradlew build 
3)java -jar build/libs/gs-accessing-data-rest-0.1.0.jar

The default user name is - user
password - password
