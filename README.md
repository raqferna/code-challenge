# code-challenge

HOW-TO

This is a maven project.
To build the project , Inside the folder seat-challenge-code ( not in the first folder), run 'mvn clean install'. This command also runs the tests. 

To run the application you have to launch the jar (using the following command) ,passing the path of the file to process by parameter.
(if no path is specified, it is assumed that there is a mowers.csv file in the same path as the jar, which it will take as input.)

Will be generated the output  with the required result, in a file called 'mowersOutput.csv';

java -jar mowers-0.0.1-SNAPSHOT.jar nameFile.csv

To try different combinations, just change the contents of the default file 'mowers.csv'. 
