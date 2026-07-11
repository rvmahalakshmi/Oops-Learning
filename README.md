# Day-1 learned points
* If the program does not have any public class then the file name can be anything.
* But in case of having public class then the compulsory file name and class name should be same.
* "import" statement are 2 types implicit and explicit.
* There are 2 packages we are not require to import:(i)java.lang package
                                                   (ii) default pacakage.i.e.class working in same directory.
* Whenever we are importing java package all classes in java is available but not subpackages of it.

# Day-2 learned points
* package is an encapsulation mechanism ,to group related classes and interfaces into a single unit.
* Rules:(i)we cannot write multiple packages at a single program.we can write atmost only one package.
 (ii)We cannot write package statement after import statememnt. 
* By using appropriate class modifier we can describe class behaviour.
* For top class we can use public,default,abstract,final,strictfp
* For inner class we use private,protected,static.
* If a class is public then it can be imported into another classes even if it is not belongs to same package.
* If a class is default only same package classes can be imported.
* Abstract method having only declaration but nor implementation.
* It should ended with semicolon.

# Day-3 Learned points
* Abstract class is nothing but partially implemented classes.
* purpose of abstract class is " The method which should implemented compulsory at child classes then that method is declared as abstract at parent class.
* Before checking visiblity of a member  we need to check class visiblity.If class is visible then only we can think about method.
* If a member declares as public we can access either within or outsie of the package but the corresponding class also should public.
* If a variable or method declares as default we can access them only in current package.
* Private is a class level modifier.
* Protected is a modifier which is only accessble at anywhere in same package and child class of another package.

# Day-4 Learned points
* interface is nothing but a "Service Requirement Specification(SRS).
* Whenever we are implementing interface class then the methods should declare with public, and aslo implement all methods.
* Data Hiding:By declaring variable as private we can implement Data HIding.
* but with getters and setters we can access them.
* Abstraction: Hiding the internal logic and at the same time time Highlight the set  of services of them.

# Day-5 Learned points
* Encapsulation:datahiding+abstraction
* If every variable inside a classs is declared as a private then it called as "Tightly encapsulated class".
* If parent class is not tightly encapsulated then no child class will also encapsulated.
# Day-6 Learned Points
* Inheritance:Getting the parents property.
* parent refernce= child object
* it is used for code resuability
* The java API are based on inheritance that means in java every class automatically extends onject class unless you specify the superclass.
* Types of inheritance: 1).single level  inheritance 2)Multiple level Inheritance 3)multilevel inheritance 4)hierachical inheritance  5)Hybrid inheitance
* Java  does not support multiple level inheritance but it can possible eith interface.
* Cyclic inheritance is also not supported