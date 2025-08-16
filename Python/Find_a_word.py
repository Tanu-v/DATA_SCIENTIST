#s1
# Get input from the user
word = input("Enter the word to find: ").lower()
text = input("Enter the text to search in: ").lower()

# Initialize the index pointer for the word
index = 0

# Loop through each character in the text
for char in text:
    if index < len(word) and char == word[index]:
        index += 1

# After the loop, check if all characters of word were found in order
if index == len(word):
    print("Yes, the word is hidden in the text.")
else:
    print("No, the word is not hidden in the text.")
    
#s2
words = input("Enter the word you wish to find: ").upper()
strn = input("Enter the string you wish to search through: ").upper()

found = True
start = 0

for ch in words:
	pos = strn.find(ch, start) 
	if pos < 0:
		found = False
		break
	start = pos + 1
if found:
	print("Yes")
else:
	print("No")