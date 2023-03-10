# Java-17
This repo includes all the new features added in Java from Version 8 till the latest 17 version

# NullPointerException Variable Identification
Precise identification of variables which was null when the NullPointerException is generated by JVM. All we need to do is to add “XX:+ShowCodeDetailsInExceptionMessages” to enable this feature. Let’s understand by a simple example:

NullPointerException example
![1639292276383](https://user-images.githubusercontent.com/118440197/211538224-8b912b48-732d-4c1a-a9fa-de0b9e67fc7d.png)

Results in:
![1639292297644](https://user-images.githubusercontent.com/118440197/211538249-e91ec862-7d7a-41c1-ae90-eba33bc05701.png)

-Released version: Java 14

# Switch Expression
From Java 14 onwards, switch expression can return values, this was the preview feature in 12 and 13. This enhancement is extremely important from a Pattern Matching perspective, all the features which have been released in every release are the building blocks of a complete feature that will be released in the future. For example, this feature is the building block for Pattern matching which is a preview feature as of Java 17.

Switch expression feature
![1639292422387](https://user-images.githubusercontent.com/118440197/211538652-db3a9ecf-8df3-4a13-b567-c752991910cb.png)

Please note: 

The ‘yield’ keyword should be used to return the value from the switch expression.
All the blocks inside every case statement are multiline blocks. 
-Released version: Java 14

# Record Type
Record types are the container classes that come with implicit getters/setters, constructor, equals/hashcode, and toString methods, also record container classes are Immutable in nature and are identical to Lombok. If your application is running on Java 16 onwards you can easily use record classes as DTO’s, to begin with. Use the keyword ‘record’ to create the record classes.

Record type feature 
![1639292513609](https://user-images.githubusercontent.com/118440197/211538869-229d124c-cef3-4fe1-906b-62cb96a4f2a3.png)

Released version: Java 16

# The Enhanced instanceof Operator
Prior to Java 16 we must check the type of Object first then we have to cast the object to a variable, but the enhanced ‘instanceof’ can check the type and implicitly cast the object to a variable. I feel this enhancement is required for ‘Pattern Guards’, in the pattern matching section we will see how enhanced instanceof operator will play a role. 

Prior to Java 16:
![1639292569832](https://user-images.githubusercontent.com/118440197/211538973-b14bb470-da78-49d0-9367-93c417fe66cd.png)
Object casting prior to Java 16 

Java 16 onwards:
![1639292586582](https://user-images.githubusercontent.com/118440197/211539036-75665be5-3a0a-4d74-9a20-7660108bcdf7.png)

-Released version: Java 16

# CompactNumberFormat
CompactNumberFormat class is the subclass of NumberFormat class in java.text package, NumberFormat class formats a number in compact form. 

The NumberFormat Style, SHORT would display 1000 as 1K and 10000 as 10K. Whereas the Style LONG will display 1000 as 1 thousand and 10000 as 10 thousand.  
![1639292615717](https://user-images.githubusercontent.com/118440197/211539415-3a875302-59a2-4fbf-9391-c2a3419ec2c1.png)

Output: 1K
![1639292631989](https://user-images.githubusercontent.com/118440197/211539468-40c47c69-f0c4-4561-8650-500df0481b21.png)

Output: 1 thousand
![1639321989016](https://user-images.githubusercontent.com/118440197/211539517-a6207459-921e-464b-8fc0-0530790de1d4.png)

Similarly, the parse method should be used to parse the compact number to a long  pattern
![1639292665691](https://user-images.githubusercontent.com/118440197/211539573-3d6ad21c-b007-42e8-abf1-f8e785138b02.png)

-Released version: Java 12

# Pattern Matching
As of Java 17, Pattern matching is a preview feature. To understand and execute this feature use –enable-preview option, or if you are an Eclipse user then the “Enable the preview features” option. 
![1639292698545](https://user-images.githubusercontent.com/118440197/211540008-3b9b9d39-4175-46b4-ad59-ebfe0f33f4d3.png)

Two features that we saw earlier, “Switch Expression” and “Enhanced Instanceof Operator” were the building blocks for the Pattern matching feature. First, we will execute a simple program using the Switch Expression then will utilize the “Enhanced Instanceof” as a Pattern Guard in our program. 

With the enhanced pattern matching coming up in the upcoming versions, we can avoid using instanceof and instead can write:
![1639292720485](https://user-images.githubusercontent.com/118440197/211540206-5a7085c8-61b4-4c04-8690-bf2f1a0ef381.png)
![1639292737084](https://user-images.githubusercontent.com/118440197/211540232-8a33c789-4fca-4b38-8157-93be5c9f3b2d.png)

Since we are passing double the result is Double. If we pass integer 10 then the output will be Integer. 

The enhanced ‘instanceof’ can check the type and implicitly cast the object to a variable, the same feature now can be used for pattern guard. 
![1639292756992](https://user-images.githubusercontent.com/118440197/211540311-c9f7f31c-a0be-478e-81cc-7fb8402dea25.png)

We have put a guard in the Integer block, that returns “Integer” only if the value is greater than 20.
![1639292775165](https://user-images.githubusercontent.com/118440197/211540335-e9c25b80-3910-4bb4-a392-59e4e42c6e69.png)

-Released version: Java 17 (preview) Java 18 (complete)

# Text Block
From Java 15 onwards text block is available to use, with Text Block we can easily express multi-line Strings which enhances the code readability. Text block uses tripe quotes (“””). 

Prior to Java 15: 
![1639292844574](https://user-images.githubusercontent.com/118440197/211540423-ea516b85-657e-4456-a810-83ede2ef9095.png)
Multi-line string expression prior to Java 15

Java 15 onwards: 
![1639292859943](https://user-images.githubusercontent.com/118440197/211540445-fa165496-2e20-4f1b-9175-975e5f10a780.png)
Multi-line string expression from Java 15 onwards

-Released version: Java 15

# New String Methods
In Java 11 and 12 versions, there are certain new String methods are added that are extremely useful. 

repeat() - 11

isBlank() - 11

strip() - 11

lines() - 11

indent() - 12

transform() - 12
