# CSIS-1400

In this repository, I showcase solutions I have created for my labs in my CSIS-1400 class. 

For contenxt of my journey and continued education in the course, assignments will be ordered from oldest to newest in the table of contents

## Table of Contents

1. Lab v. Assignment
2. People's Weight Lab
3. Exact Change Lab
4. Soccer Team Roster
5. Fibonacci Sequence

## Lab v. Assignment

Labs are different from the assignments in the fact that Labs typically have a bit of starter code, I will designate my code block from the starter code if a directory is designated as a '-lab'. Assignmnets are 100% from scratch.

Labs are done originally in ZyBooks, the online textbook used for my CSIS-1400 class. When the lab successfully passes all of the unit tests, its code will then be added to the repository within a named directory

## People's Weight Lab

The objective of this lab is to save 5 inputs into an array. From there we calculate the total weight, average, and max weight

## Exact Change Lab

The objective of this lab is to take a number (ex: 123), and then return the exact change in dollars, quarters, dimes, nickles, and pennies. So, for the example of 123, the program would return 1 dollar, 2 dimes, and 3 pennies.

## Soccer Team Roster

The objective of this assignment is to get user input for 5 players. Each with their respective jersey number and rating.

Ratings are between 1-9 and jerseys are between 0-99

Once all players are assigned a jersey and rating a menu pops up indicating a list of commands a user can choose from

> MENU

> u - Update player rating

> a - Output players above a rating

> r - Replace player 

> o - Output roster

> q - quit

> Choose an option: 

### Update Player Rating

This command will ask for a jersey, the program will then loop through all players for a match. If a match is found, the user will be asked to give a new rating for the player, which will then be updated in the roster

### Output All Above Rating

This command will ask the user for a minimum rating, the program will then loop through all players and display the information of the players equal to or greater than the given rating

### Replace Player

This command will ask the user for a jersey number, the program will then loop through all players and find a matching jersey number. Once the jersey is found, the user will then be asked for a new jersey and rating, with which the program will then change that respective player's jersey and rating

### Output Roster

This commnad will list all players, displaying the jersey and the rating

## Fibonacci Sequence

The objective of this lab is to create a method that gives the fibonnaci of a given user number. 

> Example: Fibonnacci of 7 is 13

Fibonnacci sequence is calculated by the first two places 0 and 1, and each place is calculated by the two previous places. With this logic the sequence follows as:

> 0,1,1,2,3,5,8,13 ...and so on

So a fibonacci of 8 is 21 because 13 and 8 (the two previous place values), equals to 21.

## Array Sorting Lab

Given the input from a user of:

> 5 35 21 22 6 18

The program would take the first number to determine the size of the array and send it through a method to then be sorted from greatest to least