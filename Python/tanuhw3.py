print("Q1.")
print("Hello, World!")
name = str(input("Enter your name:"))
txt = f"Hello {name}!"
print(txt)

print("Q3. ")
for x in range(1,11):
    print(x)
    
print("Q5. ")
my_fruits=["Apple","Banana","Mango","Pineapple","Guava"]
for x in my_fruits:
    print(x)

print("Q4.")
def sum(add_numbers):
    sums=[]
    for I in add_numbers:
        sums.append(I+4)
    return sums    
add_numbers=[2,4,8,9,14,16,18]
my_result= sum(add_numbers)
print("add_numbers list sum with 4 is:", my_result)

print("Q2.")
num=int(input("Enter your num with sign:"))
txt=f"It is {'Positive'if num+ 'negative' else}
print(txt)
    
    