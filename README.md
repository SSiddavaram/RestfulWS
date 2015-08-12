## RestfulWS Example using jersey

Jersey is a REST framework that provides JAX-RS Reference Implementation and more. This repository contains basic jersey example. This example also includes how to create a basic json REST API. Before running the application perform

```
mvn clean install -DskipTests
```

This step downloads all the required libraries. The application can be deployed on tomcat.

The url to run the basic test:

```
http://localhost:8080/RestfulWS/rest/hello/soujanya
```

The url to get a pojo in json format: 

```
http://localhost:8080/RestfulWS/rest/json/person/get
```

To run as a Http Client, start the tomcat server and run the ```ApacheHttpClientGet.java``` file as a java application.
