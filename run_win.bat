SET JAVA_BIN=c:\Users\%USERNAME%\.jdks\openjdk-15.0.1\bin\java.exe
SET CLASSPATH=C:\Users\%USERNAME%\.m2\repository\org\testng\testng\7.3.0\testng-7.3.0.jar;C:\Users\%USERNAME%\.m2\repository\com\beust\jcommander\1.78\jcommander-1.78.jar;C:\Users\%USERNAME%\IdeaProjects\AutotestsJavaBooking\out\artifacts\AutoTests_jar\AutoTests.jar;%CLASSPATH%
SET SUITES=testing.xml testing_parallel.xml

%JAVA_BIN% -classpath %CLASSPATH% org.testng.TestNG %SUITES%