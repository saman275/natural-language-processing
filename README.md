# Unit 6 - Natural Language Processing Project

## Introduction

Natural language processing (NLP) is used in many apps and devices to interact with users and make meaning of text to determine how to respond, find information, or to create new text. Your goal is to use natural language processing techniques to identify structure, patterns, and meaning in a text to have conversations with a user, execute commands, perform manipulations on the text, or generate new text.

## Requirements

Use your knowledge of object-oriented programming, ArrayLists, the String class, and algorithms to create a program that uses natural language processing techniques:

- **Create at least two ArrayLists** – Create at least two ArrayLists to store the data used in your program, such as data from text files or entered by the user.
- **Implement one or more algorithms** – Implement one or more algorithms that use loops and conditionals to find or manipulate elements in an ArrayList or String object.
- **Use methods in the String classs** - Use one or more methods in the String class in your program, such as to divide text into sentences or phrases.
- **Use at least one natural language processing technique** – Use a natural language processing technique to process, analyze, and/or generate text.
- **Document your code** – Use comments to explain the purpose of the methods and code segments and note any preconditions and postconditions.

## UML Diagram

Put and image of your UML Diagram here. Upload the image of your UML Diagram to your repository, then use the Markdown syntax to insert your image here. Make sure your image file name is one word, otherwise it might not properly get display on this README.

![UML Diagram for my project](umldiagramNLP.png)

## Video

Record a short video of your project to display here on your README. You can do this by:

- Screen record your project running on Code.org.
- Upload that recording to YouTube.
- Take a thumbnail for your image.
- Upload the thumbnail image to your repo.
- Use the following markdown code:

[![Thumbnail for my projet](nameOfThumbnail.png)](https://youtu.be/1fXZVmX5kO4)

## Project Description

The goal of this application is to evaluate the strength of a user’s password by analyzing its composition. The program checks whether the password contains at least one uppercase letter, one lowercase letter, and one number. To achieve this, the application reads from three text files (characterslower.txt, charactersupper.txt, and numbers.txt) that store lists of lowercase letters, uppercase letters, and numbers, respectively. When a user enters a password, the program compares each character against these lists to determine if it meets the necessary criteria. The results are then used to classify the password as weak, medium, or strong, providing users with feedback on its security level.

## NLP Techniques

The natural language processing (NLP) technique implemented in this project involves **text classification** by analyzing character patterns within a password. The key method associated with this is **checker()**, which scans the user’s input and determines whether it contains lowercase letters, uppercase letters, and numbers. This method loops through each character of the input and compares it against predefined lists loaded from text files (**characterslower.txt, charactersupper.txt, and numbers.txt**). By categorizing the password based on character types, the application applies a basic form of NLP to classify and assess password strength. This technique is necessary because it helps automate text analysis, allowing the program to process and evaluate passwords efficiently.