# CISC275-Fall2018-first-git
1. Create java files to make this code compile and run.

2. What five objects are created in the main?

	An array of dogs.
	Dog (¡°Fido¡±, 4)
	Dog (¡°Fido¡±, 3)
	Dog (¡°Alfie¡±, 4)
	A Comparator<Animal>

3. Can you spot the comparator constructor call? Where is the class definition for the comparator?

The comparator constructor call is within Line 18: 
Collections.sort(dogs, new Comparator<Animal>(){
More specifically, it¡¯s the new Comparator<Animal>() function.

The class definition for the comparator is built in to the java.util.Comparator library. We¡¯ve imported the library in our java file. Thus we can call its constructor without having to redefine it.
