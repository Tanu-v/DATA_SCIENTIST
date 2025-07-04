print("Hello,World")
Name = str(input("Enter your Name"))
txt = f"Hello{Name }"
print(txt)


num = int(input("Enter your number: "))
if num >0:
    print("The number is positive")
elif num<0:
    print("The number is negative") 
else:
    print("The number is zero")      


for x in range(1,11):
    print(x)
    
    
def addnumbers(a,b):
    return a+b
print(addnumbers(2,3))
print(addnumbers(5,7))
print(addnumbers(10,15))
    
fruits = ("apple","banana","orange","melon")
 for x in fruits:
   print(fruits)