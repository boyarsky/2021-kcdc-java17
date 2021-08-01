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

# Module 3
1. Create a record named Weekday that takes in a String for the day of the week. Call it from a main method that prints the day using the getter and also using toString().
2. Customize the getter so it formats the result as "Day: Monday"
3. Add a compact constructor to the method that throws an exception if a weekend is passed in
4. Create a sealed interface called AnyDay and have your existing record be the sole implementer.
5. Create a non-sealed implmentation called Weekend to implement AnyDay
6. Try making your sealed interface, a sealed class. What goes wrong?

# Module 4
1. Create a class with a method that takes a String and returns a Stream<String> of 0 elements (if null) and 1 element (if not null)
2. Write a stream that counts down from 10 to 1. Use this stream to print a countdown followed by “blast off”
3. Write a stream that counts odd numbers starting with 1. Print out the 40th element of the stream.
4. Create a method that takes a varargs of strings. Print all the words until you get to one that is six characters or more. (Do not print the six character word.)
5. Create a method that takes a varargs of strings. This time print the first word that is six characters or more followed by the next three words of any length.
6. Implement the method below so that it returns a record with the unique elements that start with a specific letter along with the total (non-unique count of matches). For this question, you can exclusively use method chaining. Only one semicolon is allowed in the method implementation.
```
 System.out.println(getPageOfData('a', "apple", "apple", "strawberry", "chocolate"));
 // outputs Page[set=[apple], count=2]
```