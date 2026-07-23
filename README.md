# **Lab 18: DACArecipient Class - Part 3: Default and Full Constructor**

# DACA Goes Digital : Back-End Setup

You are almost done making the `DACArecipient` class! All you need now is to implement a default and full constructor.

**Part 1: Create the Default Constructor**

Add the default constructor `DACArecipient()` to your UML diagram.
- The default constructor should set the instance variables to the following default values:
  - Set `surname` to "Unknown"
  - Set `givenName` to "Unknown"
  - Set `uscisNumber` to "Unknown"
  - Set `countryOfOrigin` to "Unknown"
  - Set `birthday` to 2415021 (Corresponds to 1/1/1900)
  - Set `validFromDate` to 2415021;
  - Set `expirationDate` to 2415021;
  - Set `sex` to 'X';


**Part 2: Create the Full Constructor**

Add the full constructor  to your UML diagram.
- The purpose of the full constructor is to set the values of all instance variables to the values passed in the parameter list. For the purposes of testing, the parameter list in the header should be listed in the same order as your instance variables (i.e. `surname`, `givenName`, `uscisNumber`, `countryOfOrigin`, `birthday`, `validFromDate`, `expirationDate`, `sex`).

**Part 3:**

Test both the default and full constructor in the main method.

