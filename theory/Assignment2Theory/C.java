package theory.Assignment2Theory;
/*public class C { 
    private int p;

    // Incorrect: 'this(0);' must be the first statement in the constructor
    public C() { 
        System.out.println("C's no-arg constructor invoked"); // This should be after 'this(0);'
        this(0); // Constructor call must be the first statement
    }

    // Incorrect: The parameter 'p' is assigned to itself, not to the instance variable
    public C(int p) { 
        p = p; // This does nothing. It should be 'this.p = p;'
    }

    // Incorrect: The setter method assigns the parameter to itself, not updating the instance variable
    public void setP(int p) { 
        p = p; // This does nothing. It should be 'this.p = p;'
    }
}
*/

public class C { 
    private int p;

    // No-argument constructor invoking parameterized constructor correctly
    public C() { 
        this(0); // Must be the first statement
        System.out.println("C's no-arg constructor invoked");
    }

    // Corrected parameterized constructor
    public C(int p) { 
        this.p = p; // Correct assignment to instance variable
    }

    // Corrected setter method
    public void setP(int p) { 
        this.p = p; // Correct assignment to instance variable
    }
}
