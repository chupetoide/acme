# acme
Sample Java App to test Jasypt

This app has 2 configuration files: `application-xml.properties` and `application-java.properties`. 
The first one is configured by a xml bean definition and defines property `secret.property.xml`. 
The other one is configured with Java and defines another property with the same value: `secret.property.java`. 

There is a controller to present both values: http://localhost:8080/acme/print

This is the result:

```
Property XML: ENC(DNZhRIqkOs8kTJbiak8GUSibcwO7TKvp+zG+j5bdTYo=)
Property Java: This is a secret"
```

