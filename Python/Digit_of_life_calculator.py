
#s1
# Ask the user for their birthday
birthday = input("Enter your birthday as 8 digits (e.g., YYYYMMDD): ")

# Ensure the input has exactly 8 digits and only digits
if len(birthday) != 8 or not birthday.isdigit():
    print("Invalid input. Please enter exactly 8 digits (numbers only).")
else:
    # Keep summing digits until only one digit remains
    while len(birthday) > 1:
        total = 0
        for digit in birthday:
            total += int(digit)
        birthday = str(total)

    print("Your Digit of Life is:", birthday)
#s2
date = input("Enter your birthday date (in the following format: YYYYMMDD or YYYYDDMM, 8 digits): ")
if len(date) != 8 or not date.isdigit():
    print("Invalid date format.")
else:
    while len(date) > 1:
        the_sum = 0
        for dig in date:
            the_sum += int(dig)
        print(date)
        date = str(the_sum)
    print("Your Digit of Life is: " + date)