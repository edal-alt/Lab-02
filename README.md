# Lab-02
The objective of the lab is to build a pizza factory using java factory patterns creating an interesting scenario for running the pizza factory.

# Build
The lab an needs both Java and JUnit 4 installed (sudo apt install junit4) in Codespace. Compile all files in the Pizza and Store folders together with the Test folder(Junit4 ) being run by javac on the same path. This will compile everything into the three folders on the same location.


# Test
The Lab uses the following JUnit 4 test classes in the Test folder:
PizzaTest.java - tests the base pizza (get, set, and null)
PizzaFactoryTest.java - tests the fctory returns the right pizza
PizzaStoreTest.java - testes the store order correct/ incorrect
CheesePizzaTest.java - tests one concrete pizza

Expected results 
OK (16 tests)

# Run
When the source files have been compiled
Run the program with the following code:

java -cp src Main

the program will create the pizza factory and pass it to the pizza store. The store then will order each type throught the facotry, which will then show the output of each step it has to go through which include;
Prepare
Bake
Cut
Box