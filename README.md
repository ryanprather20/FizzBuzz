# FizzBuzz / Git-Test

## Purpose
I used the FizzBuzz problem as a way to learn source control through Git. Source Control is crucial to be able to track changes and 
collaborate with others on a project. 

## FizzBuzz Problem
Fizzbuzz is a classic programming interview problem that allows the interviewer to learn about the applicants coding style and habits on 
a simple question. I followed the guidelines as found listed on [LeetCode](leetcode.com/problems/fizz-buzz/), with the addition of user input functionality. 
The problem requires the user to edit numbers in a list based on the conditions listed below. In this implementation the program has a scanner to 
receive the user inputted integer 'number' from the terminal. The input is then used to create a list named 'fizzbuzz' indexed (1-number). A for loop is used to iterate 
through the list and adds to the edits into a new list 'answer' following the rules listed below:
* Numbers divisible by 3 are replaced with "Fizz"
* Numbers divisible by 5 are replaced with "Buzz"
* Numbers divisible by both 3 and 5 are replaced with "FizzBuzz"

After the original list of numbers is iterated through, the completed list 'solution' is printed out in console with the correct replacements made.
