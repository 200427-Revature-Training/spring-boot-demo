# Spring Boot

## What is Spring Boot

Spring Boot is a 'reimagining' of the Spring Framework.  The Spring Framework itself has been
in development for a long.  Throughout the frameworks development, the team developing has made
progress in understanding how to approach framework design and concurrently the industry
related to Java web development has grown and evolved so the needs of developers now are not the
same as they were with the original development of Spring core, and the team has a lot of ideas
on how to better deliver the framework.

Spring core is too tightly integrated with existing projects to make sweeping changes. Spring core
cannot support the features the team would like to adjust without breaking many projects used by
many developers leveraging the framework. Instead, they decided to make a new framework core in
parallel to Spring Core.  This project became Spring Boot (or maybe Spring Reboot).

## Major Features of Spring Boot

1. Integrated Server - Spring Boot allows for an integrated serving environment.  Most general Java
web applications are dependent upon an external piece of software called a 'web container' or 
'servlet container' (Tomcat).

2. Compiles to .jar file rather than .war - Because it has an integrated server, Spring Boot projects
can be compiled to .jar files rather than .war, making running, testing, and deploying the application
much simpler.

3. "Convention over Configuration", "Opinionated Configuration" - Spring boot should just work.
You should only have to configure to modify how it works. It will assume default configuration.

4. Support for all Spring Modules.

5. More detailed and interconnected logging and monitoring tools - Real applications require 
monitoring. Spring Core's toolset for this was a little rudimentary.  Spring Boot's logging and
monitoring is far more sophisticated.

6. Main methods - Spring boot is bootstrapped in a main method, allowing developers to have a place
to procedurally execute setup steps and bring familiarity to many Java developers.

7. Faster startup times.

8. More configuration setup through .properties or .yaml files.