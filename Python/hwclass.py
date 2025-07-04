print("~~~~~~~~~~ WELCOME TO BARSI FUCTION ~~~~~~~~~~")
print("*********In memory of belated 'Mr DHANUK LAL LODHI'********")
print("~~~~~ Information about guests ~~~~~")
class guests: 
  def __init__(self, name, title, inf):
    self.name = name
    self.title = title
    self.inf = inf
  def __str__(self):
    return f"{self.name}({self.title}) {self.inf}"    

p1 =guests("Mrs. Meena bai verma", "Big daughter", "and family")#do not know weird and quite type

print(p1)
p2 =guests("Mrs. Uma bai verma", "Second daughter" , "and Family")#caring buaa always loves us 
print(p2)
p3 =guests("Mrs. Gayatri verma", "Third daughter" , "and family")#don't know what to say , she's good i think
print(p3)
p4 =guests("Mrs. Yashoda Verma", "Fourth Daughter" , "and family ")#our youngest buaa who is always like a snake ready to bite us anytime
print(p4)
p5 =guests("Guests from belargondi","Dadi's maternal family ","with their family ")
print(p5)
p6 =guests("Mr Mahaveer verma ","First son ","and their family ")#gossip collects always judge others and free loaders , do none of the works and only do eating
print(p6)
p7 =guests("Mr Bhagwati janghel ", "second son ","and their family ")#always ready for fighting get angry easily
print(p7)
p8 =guests("Mr. Shiv das ","Mom's father", "with family")#workoholic
print(p8)
p9 =guests("Guests from Bharda","Chachi's maternal family","with their family")
print(p9)
p10 =guests("Mr. Pankaj kumar sahu", " My brother","with family")#we will always be happy to receive you as our guest pankaj , by coming with everyone you'll make us happiest!
print(p10)
print("Many other guests are coming and all of you all welcome here")
print("~~~~~~Information about workers~~~~~")
class workers: 
  def __init__(other, name,workis , inf):
    other.name = name
    other.workis = workis
    other.inf = inf
  def __str__(other):
    return f"{other.name}({other.workis}) {other.inf}"   
w3 =workers("Catering","all catering work","has many workers") 
print(w3)
w4 =workers("food ", "made by villagers ", "helps in food distribution also ")
print(w4)
w1 =workers("Mr. Rati Yadav","helper ","comes with his family ")
print(w1)
w2 =workers("Mr. Sudama Verma ", "helper","comes with his family")
print(w2)
print("And many works are done and handled by many people")
print("~~~~~~~~  OWNED BY  ~~~~~~~")
class owner: 
  def __init__(self, name, title, ):
    self.name = name
    self.title = title
    
  def __str__(self):
    return f"{self.name}({self.title})"   
o1 =owner("Mrs Binda bai Lodhi", "Wife")
print(o1) 
o2 =owner("Mr. Heera Ram Verma and Mrs Kanti Verma","third son and wife")
print(o2)
o3 =owner("Mr. ShivRam Janghel and Mrs Pramila janghel","fourth son and wife")
print(o3)
print(" In waiting you all to come and in making this ocasion joyful ") 
print("'THANKYOU'")



    