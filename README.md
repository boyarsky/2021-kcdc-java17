This repository includes the code samples used in my KCDC Java 17 presentation along with the lab solutions. The lab assignment is as follows.

Note that you are allowed to use Google or the Java 17 JavaDoc for any of these. You are not expected to have memorized the methods from the presentation. 

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

# Module 5
1. Create a property file (resource bundle) named kcdc_en.properties with a single property named location and a value of "Kansas City".
2. Create another property file named kcdc.properties with the name numDays and a value of "{0}"
3. Create a driver program that contains Locale.setDefault(Locale.JAPANESE) and prints "3 days in Kansas City". Use a MessageFormat and appropriate locale to get this output. Be sure to use String.formatted() and not string concatentation.
4. Create a local date and print it using DateTimeFormatter in three different formats. Try using "m" in the format string. What happens?
5. Print the numbers from 1 to 100 one per line so the numbers are left aligned.
6. Write a program that takes the number 5 million and prints it as many ways as you can think of.

# Module 6
1. Create five path objects in the same directory; each a different way. (use relative, resolve and normalize at least once). Print the noramlized absolute path to make sure they are in the same directory:
```
System.out.println(path1.toAbsolutePath().normalize());
```
2. Write a method that calls Files.deleteIfExists(). Your method may not throw a checked exception.
3. Write the text of your choice to each of these files (again a different way). Make sure each file has different text. 
4. Read each file and print the value a different way for each file
5. Call mismatch() on two of your files. Does it return what you expect?
6. Call Files.walk() on the parent directory with your files and print out all the file names. Add a subdirectory (manually is fine). Does the output change?