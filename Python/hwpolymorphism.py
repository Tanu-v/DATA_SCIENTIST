"""___________________________________________________________________________________________

                      ~~~~~ Hw of python polymoprphism ~~~~~~~

                      ********  made by : TANU VERMA  ********


____________________________________________________________________________________________"""

class Women:
  def __init__(self, roll, task):
    self.roll = roll
    self.task = task

  def move(self):
    print(" ")

class Daughter(Women):
  pass

class Studnt(Women):
  def move(self):
    print("  ")

class Mother(Women):
  def move(self):
    print("  ")
    
class Doctor(Women):
  pass

class Writer(Women):
  def move(self):
    print("  ") 
       
class Contentcreator(Women):
  pass
    
daughter1 = Daughter("ROLL OF A DAUGHTER:LISTEN TO THEIR PARENTS", "TASK:CARE FOR PARENTS.") #Create a Car object
studnt1 = Studnt("ROLL OF STUDENT:DO STUDIES", "TASK:PASS THE EXAMS") #Create a Boat object
mother1= Mother("ROLL OF MOTHER:LOOK AFTER CHILDREN", "TASK:PROVIDE THEM GOOD MANNERS") #Create a Plane object
doctor1= Doctor("ROLL OF DOCTOR:TREAT THE PATIENTS", "TASK:PROVIDE THEM GOOD WITH GOOD TREATMENT.") 
writer1= Writer("ROLL OF WRITER:WRITE INTERESTING STORIES", "TASK:PROVIDE READERS SOMETHING INTERESTING TO READ.") 
contentcreator1= Contentcreator("ROLL OF CONTENTCREATOR:CREATE CONTENT", "TASK:PROVIDE WITH USEFUL AND INTESTING CONTENT.") 
for x in (daughter1,studnt1,mother1,doctor1,writer1,contentcreator1):
  print(x.roll)
  print(x.task)
  x.move()
