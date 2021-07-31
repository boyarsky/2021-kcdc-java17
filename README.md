This repository includes the code samples used in my KCDC Java 17 presentation along with the lab solutions. The lab assignment is as follows.

# Module 1

1. Use a text block to print a tic tac toe grid that looks something like this:
```
-------------------------------
|         |         |         |
-------------------------------
|         |         |         |
-------------------------------
|         |         |         |
-------------------------------
```
2. Add a title to the beginning of your text block that includes quotes. For example "My board"
3. Add a description to the end of your text block that includes \ and \s and essential whitespace
4. Add incidental whitespace to your text block if it isn't already there
5. Explore using strip(), stripIndent(), stripLeading() and stripTrailing() on your code
6. Look at the solution of a neighbor to see what your code has in common/different. (Yes, I'm asking you to actually talk to another human being.)

# Module 2
1. Create an enum for the days of the week.
2. Write a method using a traditional switch statement and exactly one "return" that takes a day of the week and returns and int. If a weekend is passed in, the method should return 1. If a weekday is passed in, the method should return the number of letters in the name of that day of the week.
3. Write a method that returns the same data however uses a switch expression and is as short as possible.
4. Add yield to both of these methods in any case/default.
5. Write a method that takes an object and returns the same as the prior methods if the parameter is your enum. Otherwise, have it return -1.
6. Write a method that behaves the same as the previous method. However, negate your if statement to see different behavior. 