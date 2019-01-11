## Spring Boot Lab Exercise
Spring Boot is an open source Java-based framework used to create a Micro Service. It is developed by Pivotal Team. It is easy to create a stand-alone and production ready spring applications using Spring Boot. Spring Boot contains a comprehensive infrastructure support for developing a micro service and enables you to develop enterprise-ready applications that you can “just run”.

#### Bootstraping new spring boot project
One of the ways to Bootstrapping a Spring Boot application is by using Spring Initializer. To do this, you will have to visit the Spring Initializer web page www.start.spring.io and choose your Build, Spring Boot Version and platform. Also, you need to provide a Group, Artifact and required dependencies to run the application.
Once you provided the Group, Artifact, Dependencies, Build Project, Platform and Version, click Generate Project button. The zip file will download and the files will be extracted.

#### Keep note that as we enabled HTTPS in port 443 for app using keystore.

### Controllers

#### Hello Controller 
~~~
/hello this controller is simple hello world controller.
~~~
#### Products Controller 
~~~
/deleteproducts/{id} DELETE request is to delete any product by passing id.
/updateproducts/{id} PUT Request is to update  any product by passing id and new Product object.
/getproducts GET request is to get all products available.
/createproduct POST request is to create any product in repo by passing Product object.
~~~

#### File Handler Controller 
~~~
/upload POST request is to invoke upload endpoint.
/download GET request is to invoke download endpoint.
~~~

#### Web Controller 
~~~
/index to show Thymeleaf index.html web page.
~~~