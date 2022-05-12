# code-challenge

HOW-TO

This is a maven project.
To build the project , Inside the folder challenge-code ( not in the first folder), run 'mvn clean install'. This command also runs the tests. 

To run the application you have to launch the jar (using the following command) ,passing the path of the file to process by parameter.
(if no path is specified, it is assumed that there is a mowers.csv file in the same path as the jar, which it will take as input.)

Will be generated the output  with the required result, in a file called 'mowersOutput.csv';

java -jar mowers-0.0.1-SNAPSHOT.jar nameFile.csv

To try different combinations, just change the contents of the default file 'mowers.csv'. 


KATA EXPLAIN

A green grass plateau, which is curiously rectangular, must be navigated by the mowers so
they can cut the grass and that their on-board cameras can get a complete view of the
surrounding terrain to send to the Office.
A mower’s position and location are represented by a combination of X and Y coordinates
and a letter representing one of the four cardinal compass points (N, E, S, W). The plateau
is divided up into a grid to simplify navigation. An example position might be 0, 0, N, which
means the mower is in the bottom left corner and facing North.
In order to control a mower, Maintenance Office sends a simple string of letters. The
possible letters are “L”, “R” and ”M”. “L” and “R” make the mower spin 90 degrees left or
right respectively, without moving from its current spot. “M” means to move forward one
grid point and maintain the same Heading.
Assume that the square directly North from (X, Y) is (X, Y + 1).

Input
The first line of input is the upper-right coordinates of the plateau, the bottom-left
coordinates are assumed to be 0, 0.
The rest of the input is information pertaining to the mowers that have been deployed.
Each mower has two lines of input. The first line gives the mower’s position, and the
second line is a series of instructions telling the mower how to explore the plateau. The
position is made up of two integers and a letter separated by spaces, corresponding to the
X and Y coordinates and the mower’s orientation.
Each mower will be finished sequentially, which means that the second mower won’t start
to move until the first one has finished moving.

