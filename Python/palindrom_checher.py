#s1

# Ask for user input
text = input("Enter text to check if it's a palindrome: ")

# Remove spaces and convert to lowercase
cleaned = ''
for char in text:
    if char != ' ':
        cleaned += char.lower()

# Check if the cleaned text is not empty
if cleaned == '':
    print("No, it's not a palindrome.")
else:
    # Compare the string to its reverse
    if cleaned == cleaned[::-1]:
        print("Yes, it's a palindrome!")
    else:
        print("No, it's not a palindrome.")
   
   
   
# s2
txt = input("Enter text: ")

# Remove all spaces...
txt = txt.replace(' ','')

# ... and check if the word is equal to reversed itself
if len(txt) > 1 and txt.upper() == txt[::-1].upper():
	print("It's a palindrome")
else:
	print("It's not a palindrome")