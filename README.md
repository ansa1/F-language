# Syntax Analyzer

Team: Azat Belgibaev, Sergey Shin, Petr Nikolaev, Ansat Abirov, Ruslan Kim
Language: F

## Dependencies

To be able to build and run the application you are supposed to have the following software installed:

 * Oracle JDK 8 ver. 181
 * Maven ver. 3.5.4  
 
 
  and the appropriate environment variables set.


## How to run

To run the program you can use the following scripts:

* `run.bat` for Windows OS
* `run.sh` for Unix based OS 

Or you can type the following commands by yourself in the project root directory:

`mvn package`
<br/>
`cd target`
<br/>
`java -jar CSyntaxAnalyzer-1.0.jar`

After that the syntax analysis results will be written to `out.txt` 
line by line based on the provided input sources in `in.txt`.  

In order to run only the implemented JUnit tests you can simply use:


`mvn test` 

## For developers 

In order to generate syntax analyzer via ANTLR you need to:

1. Describe the language grammar in the appropriate format in .g4 file
2. Install ANLTR plugin in Intellij IDEA 
3. Right click on .g4 file and choose ```generate ANLTR Recognizer```
4. Copy the generated files to ```src/main/java/anltr```