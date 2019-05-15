# challenge
1. Install jdk1.8, add JAVA_HOME and update path.  More information available here:
    https://www.mkyong.com/java/how-to-set-java_home-on-windows-10/
2. Install Maven 3.6.1 add MAVEN_HOME and update path.  More information available here:
    https://www.mkyong.com/maven/how-to-install-maven-in-windows/    
3. Clone master branch and cd into the project where pom.xml is located.
4. run the following command:
    mvn test -Dsurefire.suiteXmlFiles=MyUITestSuite.xml
