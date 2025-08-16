# Ask the user for two texts
text1 = input("Enter the first text: ")
text2 = input("Enter the second text: ")

# Clean both texts: remove spaces and convert to lowercase
cleaned1 = ''
cleaned2 = ''

for char in text1:
    if char != ' ':
        cleaned1 += char.lower()

for char in text2:
    if char != ' ':
        cleaned2 += char.lower()

# Check for empty inputs
if cleaned1 == '' or cleaned2 == '':
    print("No, they are not anagrams.")
else:
    # Sort and compare both cleaned strings
    if sorted(cleaned1) == sorted(cleaned2):
        print("Yes, they are anagrams!")
    else:
        print("No, they are not anagrams.")
