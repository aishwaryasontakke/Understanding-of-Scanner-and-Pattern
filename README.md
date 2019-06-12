# Understanding-of-Scanner-and-Pattern

Given a file, each line of the file has a single word. A word consist of printable, visible characters. </br>
The file is read and the word from it is printed and checked if the word has specific properties.</br>
Pattern class is used to determine if a word has a specific property, and own method are written to determine if a word has a specific property.

Each word, i.e. each line, is tested for the following properties:
- 'a' is part of the word.
- Palindrome anchored at the beginning and end of line.
- Include a palindrome which is 2 characters long.
- Include a palindrome which is 3 characters long.
- The word has at least one ’a’ in it.
- The word consist only of ’a’s or ’b’s.
- 'a's or ’b’s can not be part of the word.
- The word is == '.'.
- The word includes a ’.’.

Explanation:</br>
The file is as follows:</br>
a</br>
aba</br>
abb</br>
cd</br>
Hello World.</br>

Output should be:</br>
- 'a' has an ’a’ as part of the word.
- 'a' is a palindrome anchored at the beginning and end of line
- 'abb' includes a palindrome which is 2 characters long
- 'cd' is a word which does not include ’a’s or ’b’s.
- '.' is == to ’.’.
