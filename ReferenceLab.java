public class ReferenceLab {

    public static void main(String[] args) {

        /*
        Part 4 - Reference Lab: Predict -> Run -> Explain
        Open ReferenceLab.java. For each experiment, make a prediction BEFORE running the code. Then run the lab and explain the result in your own words. Answer the questions in your code using comments. 

        Experiment A - Aliasing
        
        After copy = nemo, how many SeaCreature objects exist?
        Only one SeaCreature object exists. Both nemo and copy are references to the same object in memory.

        Why does changing nemo also appear when you access copy?
        
        Because both nemo and copy point to the same object in memory. 
        When you change the state of that object through one reference, the change is 
        reflected when accessing it through the other reference.


        Experiment B - Separate Objects
        fish1 and fish2 contain matching data. Predict fish1 == fish2.
        
        The expression fish1 == fish2 will evaluate to false because they are two 
        separate objects in memory, even though their data is identical.

        What does == compare when it is used with object references?

        The == operator compares the memory addresses of the two object references,
        not the contents of the objects themselves. It checks if both references point
        to the same object in memory.

        Experiment C - Array References
        After selected = tank[0], how many creature objects exist?

        Only one SeaCreature object exists. Both selected and tank[0] are 
        references to the same object in memory.

        Why does changing selected also change what you observe through tank[0]?

        Because both selected and tank[0] point to the same object in memory. 
        When you change the state of that object through one reference, the change is 
        reflected when accessing it through the other reference.

        */
        
        // ==================================================
        // EXPERIMENT A: ALIASING
        // ==================================================

        SeaCreature nemo = new Fish("Nemo", 5, 3, 1, "><>");
        SeaCreature copy = nemo;

        // PREDICT BEFORE RUNNING:
        // What will copy.getPosition() return after nemo.setPosition(25)?
        // It will return 25, because copy is an alias for nemo, and they refer to the same object.

        nemo.setPosition(25);

        System.out.println("Experiment A - Aliasing");
        System.out.println("nemo position: " + nemo.getPosition());
        System.out.println("copy position: " + copy.getPosition());


        // ==================================================
        // EXPERIMENT B: TWO DIFFERENT OBJECTS
        // ==================================================

        SeaCreature fish1 = new Fish("Fish", 10, 2, 1, "><>");
        SeaCreature fish2 = new Fish("Fish", 10, 2, 1, "><>");

        // PREDICT BEFORE RUNNING:
        // Will fish1 == fish2 be true or false?
        // It will be false, because fish1 and fish2 are two separate objects in memory,
        // even though they have the same data.

        System.out.println();
        System.out.println("Experiment B - Separate Objects");
        System.out.println("fish1 == fish2: " + (fish1 == fish2));


        // ==================================================
        // EXPERIMENT C: ARRAY REFERENCES
        // ==================================================

        SeaCreature[] tank = new SeaCreature[5];
        tank[0] = new Fish("Bubbles", 8, 1, 1, "><((('>");

        SeaCreature selected = tank[0];

        // PREDICT BEFORE RUNNING:
        // What happens to tank[0] if selected is modified?
        // If selected is modified, tank[0] will also reflect that change, because both
        // selected and tank[0] refer to the same object in memory.

        selected.setPosition(35);

        System.out.println();
        System.out.println("Experiment C - Array References");
        System.out.println("selected position: " + selected.getPosition());
        System.out.println("tank[0] position: " + tank[0].getPosition());
    }
}
