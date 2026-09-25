# 1. Describe the lab objective
The objective of the lab is to build a pizza factory using java factory patterns creating an interesting scenario for running the pizza factory. The program makes different pizzas including Cheese, Gluten Free,Greek, & Pepperoni pizza.

# 2. Describe the design and architecture of your solution
The lab is built from the base class Pizza. Pizza does not create but instead defines how a pizza is made with the four methods: prepare, bake, cut, & box. The name fields is made with getName() and setName in order to have each pizza carry themselves and extend pizza by providing their own version of the 4 methods. 
The PizzaFactory class is made to create the correct pizza object. the only method it haas takes a string and returns the match. If "cheese" returns a new CheesePizza and "pepperoni" returns a new PepperoniPizza. Else then the factory returns a null. 
The PizzaStore class uses PizzaFactory to order the pizza. The orderPizza(String) asks the factory for a pizza and if the pizza != null it calls the method and gives the pizza.
Finally the main clas has everything together. It makes A PizzaFactory and PizzaStore, then calls orderPizza for each pizza to run the program

# 3. Any notable implementation details for your soltuion such as patterns
I used the facotry pattern for this lab. The factory creates the pizza objects which keeps the objects seperate from the Pizza store. Instead of the PizzaStore creating the Pizza itself, the factory does it for me. The factory then figures out which pizza to make out of all the options. The Lab uses the Liskov substitution by showing that each specific pizza class can be used anywhere a pizza object is expected because each inherits from the Pizza class and uses the methods prepare, bake, cut, and box for each type.

# 4. Your test strategty and mention Edge Cases
I used Junit 4 to write the 4 classes inplementing as much of the program as possible (PizzaTest, PizzaFactoryTest, PizzaStoreTest, and CheesePizzaTest.) Each test has the same premise make an object, call the method, and then check to see if its true. PizzaTest tests the base Pizza class by making a different typ and checking the name which should both return true, setting the name, and setting a null which should return null. I set some other edge cases such as PizzaFactoryTest which has 
createPizza("hawaiian") for a pizza type that does not exits. In PizzaStoreTest the factory orders olive oil for an invalid type and for CheesePizza the setName(null) returns as null.

# 5. Your conclusion including a brief analysis of your solution
The lab shows the Liskov principlce by showing every pizza subclass (Cheese, Gluten Free, Greek, Pepperoni) can be used in place of a pizza object and still follows the instructions of prepare, bake, cut, and box. The lab builds a factory using the factory pattern and runs from the pizza store.

# AI Section

# 1. Indicate which AI system you used
For this lab Deepseek was used

# 2. All AI Prompts
without giving me ANY code helo me undertand this lab
Understanding the Lab (No Code)
Since you haven't told me which lab you're working on, I'll give you a general framework for how to approach almost any programming lab. If you paste the lab instructions or describe the task, I'll tailor this to your specific lab.

1. Identify the Goal
Ask yourself:

What is the program supposed to DO? (Input → Process → Output)

What is the deliverable? (a function? a whole program? a report? a working demo?)

What am I being graded on? (correctness, efficiency, style, edge cases?)

2. Break It Into Pieces
Most labs are really 2–5 small problems wearing a trench coat. For each one ask:

What are the inputs?

What are the outputs?

What's the rule connecting them?

What happens at the edges (empty input, huge input, negative numbers, duplicates)?

3. Identify the Concepts Being Tested
Labs usually target one or two big ideas. Common ones:

Loops/conditionals — iterating, branching

Data structures — arrays, lists, maps, trees, queues

Recursion — a function calling itself on a smaller problem

Complexity — is O(n²) fast enough, or do you need O(n log n)?

File I/O or parsing

Object-oriented design — classes, inheritance, encapsulation

Look at the lab title and the sample problems — they usually scream the concept.

4. Plan Before Writing
For each piece, describe in plain English the steps you'd take. This is your algorithm. If you can't explain it in words, you can't code it.

Example: "Read each line, split it on commas, store the first field as a key and the rest as values, then for each key print the values sorted."

5. Trace It by Hand
Pick the smallest example from the lab. Walk through your plan step by step on paper. Where does it break? That's where your bugs will be.

6. Think About Testing
Before coding, list:

One normal case

One edge case (empty, one element, max size)

One tricky case (the one the professor clearly designed to catch people)

7. Common Lab Traps
Off-by-one errors in loops

Not handling the empty input

Mutating data you shouldn't

Assuming input is sorted/valid

Forgetting to return vs print

Ignoring the required output format exactly

If you paste the lab prompt (or describe the task), I'll walk you through:

What concept it's really testing

How to break it into sub-problems

What your algorithm should look like in plain English

What edge cases to watch for

How to know when you're done

What's the lab?

Understanding Lab 2: Factory Pattern
Here's a plain-English walkthrough of what this lab is really asking you to do.

The Big Picture
You're building a pizza ordering simulation. The point isn't really the pizza — it's to practice the Factory design pattern and the Liskov Substitution Principle (LSP). The pizza is just a fun wrapper.

What You Actually Need to Build
There are four main characters in this story:

1. Pizza (abstract base)
A general blueprint for any pizza. It declares four lifecycle steps that every pizza must support:

prepare()

bake()

cut()

box()

You'll also want somewhere to store the pizza's name/type so you can print it.

2. Concrete Pizzas
Four specific kinds that each inherit from Pizza and fill in their own behavior:

Cheese

Greek

Pepperoni

GlutenFree

Each one might prepare differently (different toppings), bake at different temps, cut differently, box differently. This is where LSP comes in — the store should be able to treat all four the same way without knowing which one it has.

3. PizzaFactory
The factory's only job: given an order (a string like "cheese"), return a Pizza object. It's a switch/if-else dispatcher that hides the new CheesePizza() details from the rest of the code. If someone later adds a "Hawaiian" pizza, only the factory changes.

4. PizzaStore
The "client." It has-a PizzaFactory (composition, not inheritance). Its orderPizza(type) method does the classic template:

Ask the factory for a pizza

prepare()

bake()

cut()

box()

Return/hand it to the customer

The store never says new CheesePizza() — that's the whole point.

The Flow (Plain English)
text
Customer → PizzaStore.orderPizza("greek")
              ↓
           PizzaFactory.createPizza("greek")
              ↓
           returns a GreekPizza object (as a Pizza)
              ↓
           Store calls prepare/bake/cut/box on it
              ↓
           Done
The Liskov Principle, Concretely
LSP says: anywhere code expects a Pizza, it should work with Cheese, Greek, Pepperoni, or GlutenFree without surprise.

Practically this means:

Every subclass must implement all four methods meaningfully.

No subclass should throw "not supported" for bake().

The store's code must not check if (pizza instanceof GreekPizza) — that would violate LSP.

If your store's orderPizza method works identically no matter which pizza comes back, you've demonstrated LSP.

"Interesting Scenario"
The lab says make it interesting — don't just print four lines. Ideas:

A customer orders multiple pizzas in a loop.

An invalid order (e.g., "anchovy") triggers an error or a default.

Different pizzas print different prep steps ("Adding fresh mozzarella…", "Using gluten-free crust…").

The main Method
Somewhere you need a driver class with main that:

Creates a PizzaFactory

Creates a PizzaStore with that factory

Orders a few pizzas of different types

Prints the output

This is what the 1-minute video should show running.

Directory Structure the Lab Wants
Two separate places:

One directory for source code

One directory for unit tests (JUnit 4)

So typically:

text
src/        ← Pizza, CheesePizza, PizzaFactory, PizzaStore, Main
test/       ← PizzaFactoryTest, PizzaStoreTest, etc.
Unit Test Strategy
Think about what could go wrong and test those:

Test idea	Why
Factory returns Cheese when asked for "cheese"	Basic dispatch works
Factory returns null (or throws) for unknown type	Bad input handled
Case-insensitivity ("Cheese" vs "cheese")	Robustness
Returned object is instanceof Pizza	LSP — subclasses substitutable
Each pizza's prepare() prints/does expected thing	Subclass correctness
PizzaStore.orderPizza calls all 4 steps in order	Template method works
Edge cases to mention in your report:

Unknown pizza name

null or empty string

Mixed case input

Ordering many pizzas

Deliverables Checklist
□ Java source in one folder
□ JUnit 4 tests in a separate folder
□ README.md — how to build/test/run
□ LAB_REPORT.md — 1–2 pages with the 5 required sections
□ Video ≤ 1 min in the top directory of the ZIP
□ If you used AI: name the system, list every prompt, mark which code came from it
The 5 Report Sections (mapped to what you do)
Objective — paraphrase the top of the lab

Design & architecture — describe the 4 classes and their relationships

Notable implementation details — explain Factory pattern + LSP in your own words

Test strategy — the table above, plus edge cases

Conclusion — what worked, what you'd improve

The Trap to Avoid
Don't let PizzaStore construct pizzas directly. If you ever write new CheesePizza() outside the factory, you've broken the pattern. The only place that knows about concrete pizza classes is the factory.

Want me to go deeper on any piece — the LSP part, how to structure the JUnit tests, or how to phrase the report sections?

alright jsut let me make sure i understood only respond with 2-3 sentences max, The lab is to create 4 different files, MakePizz.java, PizzaFactory..java, PizzaStore,java, and PreparePizza.java so far so good?
Not quite — the lab wants a Pizza abstract base plus four concrete pizza subclasses (Cheese, Greek, Pepperoni, GlutenFree), a PizzaFactory, a PizzaStore, and a driver/main class — so more like 8+ files, not 4.

The names you listed (MakePizz.java, PreparePizza.java) aren't required by the lab; you can name things however you want as long as the four pizza types, the factory, the store, and the four lifecycle methods (prepare/bake/cut/box) exist.

so a folder of pizza with 4 files, cheesepizza.java, glutenfreepizza.java, greekpizza.java, pepperoniPizza.java
Yes, those 4 concrete pizza subclasses in one folder is correct — but each of them needs to extend a shared abstract Pizza class, so you also need a Pizza.java in that folder (5 files total there).

Alright final time you need 1 folder, CheesePizza.java, GlutenFreePizza.java, greekpizza, pepperoniPizza, Pizza, then seperate its makePizza.java, pizzafacotru.java, pizza store.java, prepare pizza.java (THESE ARE ALL SEPERATE away from the pizza folder correct?
Almost — the classes need to be logically separated but Java requires them to live in packages, and the factory/store still need to reference the pizza classes.

Typically you'd have two packages: pizza (Pizza + 4 subclasses) and something like store (PizzaFactory, PizzaStore, Main). But PreparePizza.java and MakePizza.java aren't required classes — the four lifecycle methods (prepare/bake/cut/box) live inside the Pizza class itself, not in separate files.

dumb this down for me like a lot plz
Got it — super simple version:

Folder 1: pizza

Pizza.java ← the parent (has prepare/bake/cut/box)

CheesePizza.java

GreekPizza.java

PepperoniPizza.java

GlutenFreePizza.java

Folder 2: store

PizzaFactory.java ← makes the pizzas

PizzaStore.java ← orders the pizzas

Main.java ← runs it

That's it. No MakePizza.java and no PreparePizza.java — those aren't real classes in this lab. "Prepare" is just a method inside Pizza.

so there are 2 folders 1 labeled Pizza, 1 labeled Store
pizza hs cheese gluten greek, pepperoni, pizza
store has pizzafactory, pizzastore, and main 
correct?
Yes — that's exactly right. 5 files in Pizza, 3 files in Store, 8 total.

ok now without givine me the code how and wehre do i start>
Start with Pizza.java — it's the foundation everything else depends on.

Order to build:

Pizza.java — make it abstract. Give it a name field, a getName() method, and declare the four methods (prepare, bake, cut, box). Decide: are the four methods abstract (each pizza fills them in) or concrete (shared default + subclasses override)? Either works — abstract is simpler for this lab.

The 4 pizza subclasses — each one extends Pizza and fills in what makes it different (name, and the four methods' behavior — even just printing different text is fine).

PizzaFactory.java — one method like createPizza(String type) that returns a Pizza. Inside: check the string, return the right subclass, return null or throw for unknown.

PizzaStore.java — has a PizzaFactory field (passed in via constructor). One method orderPizza(String type) that gets a pizza from the factory, then calls prepare → bake → cut → box in order.

Main.java — creates a factory, creates a store with that factory, orders a few pizzas.

Before you write anything: open Pizza.java and just write the class skeleton with the four method signatures and a comment for each. That one file tells you what every other file needs to do.

alright lets build this together atleast jsut give me dumbed down versions of what i need to do do not give me the code but really dumb things down for me, lets start with Pizza.java I understnat that it needs a class and a getName() method wtih 4 methods (prepare, bake, cut, and box)
again do not give me the code but help me understand how to make it
Good — you've got the shape right. Here's how to think about building Pizza.java without me writing it:

Step 1 — Decide it's abstract.
Write the keyword abstract before class Pizza. This means "you can't make a plain Pizza, only specific ones like CheesePizza." That's the whole point of the lab.

Step 2 — Add one field.
A String name. Every pizza needs a name so getName() has something to return. Make it protected or private — your choice. Private is cleaner; protected is easier for subclasses to set.

Step 3 — Add getName().
A tiny method that just returns that name field. Nothing fancy.

Step 4 — Add the four method signatures.
For each of prepare, bake, cut, box:

Return type: void (they just do something, don't return a value)

No parameters

Body: either empty {} or abstract (end with ; and no body)

Key decision: abstract or concrete?

Abstract (public abstract void prepare();) → every subclass MUST write its own. Simpler, matches the lab.

Concrete (has {} body) → subclasses only override if they want to.

Pick one and be consistent across all four methods.

Step 5 — Sanity check.
Ask yourself: "If I hand this file to a friend, can they write CheesePizza without asking me questions?" If yes, you're done.

What NOT to put in Pizza.java:

No main method

No factory logic

No "if type equals cheese" stuff — that belongs in the factory later

Your turn: describe back to me in your own words what Pizza.java contains (field, method names, abstract vs concrete) and I'll tell you if you've got it before you type anything.

alright lets do each step at a time do not give me the code jsut yet
only respond with 1 -3 sentences max
step 1 decie its abstract
abstract class Pizza {
}
Yes, that's the right start — abstract class Pizza { } is your opening line and closing brace.

Next: inside those braces, add a String name field and a getName() method that returns it.

step 2 add a string name 
private static void (string args[]) =  new Pizza
Not quite — that's a main method signature, not a field.

A field is just a variable declared at the top of the class, like private String name; — no method, no new, no parentheses.

private static void string args []= Pizza
No — stop. You're mixing up a field with a method again.

A field is one line: access modifier + type + name + semicolon. Nothing else. No void, no static, no (), no [], no =.

Look at your line and remove everything that doesn't belong. What's left?

private string Pizza?
Close — the type is String (capital S) and the name should be name (lowercase), not Pizza.

So: access modifier + type + name + semicolon.

private String name;
Yes! That's the field.

Next: add a getName() method that returns it — modifier, return type String, name getName, empty parentheses, and a return name; inside.

explain the field what is it and what does it do
A field is just a variable that lives inside a class — it's the class's "memory."

private String name; means: every Pizza object gets its own little storage slot called name that holds text. private means only code inside the Pizza class can read or change it (subclasses use getName() or a setter to access it).

Why it exists: without it, getName() would have nothing to return. The field is the data; the method is the action on that data.

abstract class Pizza {

}
private String name; // field (variable within the class)

public String  getName(){ // data field to store your memory
    return name;
like that? if so help with the methods
Almost — two issues:

private String name; is outside the class braces. It needs to be inside Pizza { ... }.

getName() is fine, but it's also sitting outside. Everything for the class goes between the { and }.

Fix the braces so the field and method live inside Pizza, then we'll add the four methods.

For the four methods, each one is just: public abstract void prepare(); — one line, no body, ends with a semicolon. Same pattern for bake, cut, box.

abstract class Pizza {


private String name; // field (variable within the class)

public String {getName()// data field to store your memory
    return name;
}// public --> string --> getname --> reuturn name

//four Methods signitures
}
Two small fixes:

public String {getName() — the { is in the wrong spot. It should be public String getName() { — parenthesis first, then the opening brace.

You're missing the closing brace } for the getName method before the four method signatures.

So the structure should read: class opens → field → getName method (with its own { }) → four method signatures → class closes. Fix those, then add the four public abstract void ...(); lines.

alright lets pivot, once pizza.java is done what do i do and how should i focus on it
Once Pizza.java is locked, pick one concrete pizza — just CheesePizza — and build it alone before touching the other three.

Why: CheesePizza will show you exactly what every subclass needs to do (extend Pizza, set the name, override the four methods). Once Cheese works, Greek/Pepperoni/GlutenFree are copy-paste-and-tweak — you already solved the hard part.

Then move to PizzaFactory (one method, a big if/else on the type string), then PizzaStore (holds a factory, calls the four methods in order), then Main (creates a store and orders a pizza). Don't jump ahead — each file depends on the one before it, so if something breaks you'll know exactly where.

Quick checklist for CheesePizza:

extends Pizza

Constructor (or a block) that sets name = "Cheese Pizza" — use whatever access your field allows

Four @Override methods, each just printing what that step does for cheese

Your turn — tell me in your own words what CheesePizza needs, and I'll confirm before you type it.

this is what i have for Pizza.java
abstract class Pizza {
    private String name; // field (variable within the class)

    public String getName() {
        return name;
    }

    public abstract void prepare();
    public abstract void bake();
    public abstract void cut();
    public abstract void box();

class CheesePizza extends Pizza {
    public void prepare (){
        system.out.println("Prepare Cheese Pizza");
    }
    public void bake () {
        system.out.println("Bake Cheese Pizza");
    }
    public void cut(){
        system.out.println("Cut Cheese Pizza");
    }
    public void box(){
        system.out.println("Box Cheese Pizza");
    }
}
Two problems:

CheesePizza is nested inside Pizza — you never closed Pizza's brace before starting CheesePizza. Add a } to close Pizza first, then start CheesePizza. They need to be separate classes (and really, separate files).

system.out.println should be System.out.println — capital S. Java is case-sensitive.

Also, CheesePizza needs a way to set name (the field is private in Pizza). Easiest fix: add a constructor in CheesePizza like public CheesePizza() { name = "Cheese"; } — but that only works if name is protected or has a setter. You may need to change private to protected in Pizza.

Fix those three things, then show me again.

abstract class Pizza {
    private String name; // field (variable within the class)

    public String getName() {
        return name;
    }

    public abstract void prepare();
    public abstract void bake();
    public abstract void cut();
    public abstract void box();
}
class CheesePizza extends Pizza {
    public void prepare (){
        System.out.println("Prepare Cheese Pizza");
    }
    public void bake () {
        System.out.println("Bake Cheese Pizza");
    }
    public void cut(){
        System.out.println("Cut Cheese Pizza");
    }
    public void box(){
        System.out.println("Box Cheese Pizza");
    }
}
Much better — that compiles as long as both classes are in the same file.

Two things to add before it's truly "done":

@Override above each of the four methods in CheesePizza — it's a label telling Java (and your grader) "this replaces the parent's abstract method."

A constructor in CheesePizza that sets name, so getName() returns something. Right now name is never set — which means you need to change private to protected in Pizza so the subclass can reach it.

Also worth noting: the lab wants these as separate files, so eventually you'll cut CheesePizza out into CheesePizza.java. For now, keeping them together while you experiment is fine.

Want to add the constructor + @Override, or move on to the other three pizzas?

should i move class CheesePizza extends Pizza {...} onto CheesePizza.java?
Yes — that's what the lab wants. Two rules when you do:

The Pizza class must be public in Pizza.java if CheesePizza (in a different file) needs to extend it. Right now yours says abstract class Pizza — add public in front.

CheesePizza.java should start with public class CheesePizza extends Pizza { ... } and nothing else — no Pizza class in that file.

Since both files will be in the same pizza folder (same package), they'll see each other automatically. Do the same split for Greek, Pepperoni, and GlutenFree.

so this is what i have for Pizza.java
abstract class Pizza {
    private String name; // field (variable within the class)

    public String getName() {
        return name;
    }

    public abstract void prepare();
    public abstract void bake();
    public abstract void cut();
    public abstract void box();
}


And this is what i have for Cheese Pizza.java 
public class CheesePizza extends Pizza {
    public void prepare (){
        System.out.println("Prepare Cheese Pizza");
    }
    public void bake () {
        System.out.println("Bake Cheese Pizza");
    }
    public void cut(){
        System.out.println("Cut Cheese Pizza");
    }
    public void box(){
        System.out.println("Box Cheese Pizza");
    }
}
Two fixes before this will compile:

In Pizza.java: change abstract class Pizza to public abstract class Pizza and change private String name; to protected String name;. Without public, CheesePizza (in a separate file) can't see Pizza; without protected, CheesePizza can't set name.

In CheesePizza.java: add a constructor that sets name = "Cheese Pizza";, and add @Override above each of the four methods.

After that, CheesePizza is done and the other three pizzas are just copies with the name and print text swapped.

public abstract class Pizza {
    protected String name; // *field (variable within the class) Line is generated by AI

    public String getName() {
        return name;
    }

    public abstract void prepare();
    public abstract void bake();
    public abstract void cut();
    public abstract void box();
}
public class CheesePizza extends Pizza {
    public CheesePizza () {
        setName("Cheese Pizza")
    }
    @Override
    public void prepare (){
        System.out.println("Prepare Cheese Pizza");
    }
    @Override
    public void bake () {
        System.out.println("Bake Cheese Pizza");
    }
    @Override
    public void cut(){
        System.out.println("Cut Cheese Pizza");
    }
    @Override
    public void box(){
        System.out.println("Box Cheese Pizza");
    }
}

//extends pizza
//construct that sats name = "Cheese Pizza"
//Four @override methods that each just pring what that
now without giving me the code help me conceptuaize visualize dumn down and understand main.java, pizza factory.java, and pizza sotre.java
Almost — one bug: you called setName("Cheese Pizza") but you never wrote a setName method in Pizza. Either add one, or just do name = "Cheese Pizza"; directly (since name is now protected, CheesePizza can touch it). Also missing a semicolon on that line.

Now let's visualize the three remaining files. Think of it like a restaurant:

PizzaFactory.java — the Kitchen

Its only job: take an order word ("cheese") and hand back the right pizza object.

One method: createPizza(String type) → returns a Pizza.

Inside: a big if/else. If type equals "cheese", return new CheesePizza(). If "greek", return new GreekPizza(). Etc. Unknown type → return null or throw.

It knows every pizza type. It's the only place that says new CheesePizza().

PizzaStore.java — the Cashier/Counter

Has one field: a PizzaFactory (passed in through its constructor).

One method: orderPizza(String type).

Inside, in order:

Ask the factory for a pizza → Pizza p = factory.createPizza(type);
p.prepare();
p.bake();
p.cut();
p.box();
Return/hand it out.
Key idea: the store never says new CheesePizza(). It only talks to the factory. That's the whole pattern.

The store treats every pizza the same — that's Liskov in action.

Main.java — the Customer

Just three lines of setup:

Make a PizzaFactory.
Make a PizzaStore, giving it that factory.
Call store.orderPizza("cheese") a few times with different types.
No logic, no if/else — it just runs the show.

The flow, one more time:
Main → tells Store "order cheese" → Store asks Factory "make cheese" → Factory hands back CheesePizza → Store runs prepare/bake/cut/box on it → prints happen → done.

The trap: if Store ever writes new CheesePizza(), you've broken the factory pattern and lost points.

Which one do you want to build first — Factory or Store?
pivot with me for a second give me a run down without any code how how im supposed to do the tests
Testing Rundown (No Code)
The Big Idea
Tests are just little programs that call your code and check the result. If the result matches what you expected, the test passes. If not, it fails. JUnit 4 is the library that gives you the pass/fail structure.

Where Tests Live
A separate folder from your source (the lab requires this). So alongside your pizza and store folders, you have a test folder. Inside are files like PizzaFactoryTest.java and PizzaStoreTest.java.

Each test file mirrors what it's testing — one test file per class you want to check.

The Anatomy of a Test
Every test is just a method with a special label above it. JUnit 4 uses @Test. Inside the method you:

Set up — create the object you want to test.

Act — call the method you're testing.

Assert — state what you expect, and let JUnit check it.

If the assertion is true → pass. If false → fail. That's it.

Common Assertions You'll Use
"Is this null?" — check the factory returns null for bad input

"Is this not null?" — check the factory returns something for good input

"Is this the right type?" — check the returned object is actually a CheesePizza

"Are these equal?" — check getName() returns "Cheese Pizza"

That's really all you need for this lab. No fancy mocking, no setup/teardown, nothing advanced.

What to Actually Test
PizzaFactory tests:

Ask for "cheese" → get back a CheesePizza (not null, correct type)

Ask for "greek" → get back GreekPizza

Ask for "pepperoni" → get PepperoniPizza

Ask for "glutenfree" → get GlutenFreePizza

Ask for "anchovy" (unknown) → get null or an exception

Ask for "" (empty) → handled gracefully

Ask for "CHEESE" (wrong case) → depends on your design; decide and test it

PizzaStore tests:

orderPizza("cheese") returns a Pizza (not null)

The returned pizza's name matches what you ordered

Ordering an unknown type doesn't crash the store

Pizza subclass tests (optional but nice):

Each pizza's getName() returns the expected string

Every pizza instanceof Pizza is true — this is your LSP test

How to Run Them
In your IDE (IntelliJ, Eclipse, VS Code), right-click the test file → Run. Or if using Maven/Gradle, one command. The output tells you green (pass) or red (fail) per test.

What to Write in Your Lab Report
Strategy: "I tested the factory dispatch, the store's ordering flow, and that every subclass is substitutable for Pizza."

Edge cases: unknown type, empty string, wrong case, null input.

Coverage: mention that you tested both happy paths and failure paths.

The Two Big Mistakes to Avoid
Testing nothing meaningful — a test that only checks "1 + 1 = 2" isn't testing your code.

One giant test method — write one small test per behavior, so when something fails you know exactly what broke.

Want me to walk through what a single test looks like conceptually — like, "set up this, call that, assert this" — for the factory's cheese case?



# 3. Indicate which code or test came from the AI prompts
Test CheesePizzaTest.java - edited
Test PizzaStore.java - edited
Test Pizza - edited
pizzastore.java:
public PizzaStore(PizzaFactory factory) {
        this.factory = factory;