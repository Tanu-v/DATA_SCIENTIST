print("Answer 1.")

thislist=[1,2,3,4,5]
thislist.sort(reverse=True)
print(thislist)
print("Answer 2.")

stars=["*****","****","***","**","*"]
for x in stars:
    print(x)
print("Answer 3.")    
a="""1
0 1
1 0 1
0 1 0 1
1 0 1 0 1"""
print(a)
numlist=[1,0,1,0,1,0,1,0,1,0,1,0,1,0]
print(numlist[0])
print(numlist[1:3])
print(numlist[2:5])
print(numlist[1:5])
print(numlist[2:7])
print("Answer 4.")
avgmarks=int(input("Enter your marks here:"))
if  avgmarks >= 8200: 
    print("'O'('A+')")
if  avgmarks<8200 and avgmarks<=6279: 
    print("1st division('A')")  
if  avgmarks<6279 and avgmarks<=5259:
    print("2nd division('B')")  
if  avgmarks<5259 and avgmarks<=4249:
    print("3rd division('C')")
if  avgmarks<=239:
    print("Fail")
       