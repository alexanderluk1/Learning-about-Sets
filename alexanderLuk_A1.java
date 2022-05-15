import java.util.ArrayList;
import java.util.Scanner;

enum Zodiac {

    Rat("RAT", 1948), 
    Ox("OX", 1949),
    Tiger("TIGER", 1950),
    Rabbit("RABBIT", 1951),
    Dragon("DRAGON", 1952),
    Snake("SNAKE", 1953),
    Horse("HORSE", 1954),
    Goat("GOAT", 1955),
    Monkey("MONKEY", 1956),
    Rooster("ROOSTER", 1957),
    Dog("DOG", 1958),
    Pig("PIG", 1959);

    private final String upperCase;
    private final int year;

    private Zodiac(String upperCase, int year)
    {
        this.upperCase = upperCase;
        this.year = year;
    }

    public String getUpperCase() {
        return upperCase;
    }

    public int getYear() {
        return year;
    }
}

public class alexanderLuk_A1 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int menuInput;

        displayZodiacInfo();
        do 
        {
            displayMainMenu();
            System.out.print("Your option: ");

            while (!input.hasNextInt())
            {
                System.out.print("Please enter a number: ");
                input.next();
            }
            menuInput = input.nextInt();

            switch (menuInput)
            {
                case 0 : setProperties(); break;
                case 1 : unionExample(); break;
                case 2 : intersectionExample(); break;
                case 3 : subsetExample(); break;
                case 4 : differenceExample(); break;
                case 5 : complementExample(); break;
                case 6 : setsEqualityExample(); break;
                case 7 : distributive1(); break;
                case 8 : distributive2(); break;
            }
        } 
        while (menuInput != 9);
    }

    // ------------------- CASE 0 -------------------
    static void setProperties()
    {
        Scanner input = new Scanner(System.in);
        int menuInput;

        Set propertiesSet = getASet();

        System.out.println("\nHere is an example of set");

        System.out.print("\tA = ");
        displaySet(propertiesSet);
        System.out.println("\tAll elements in set are distinct and random order");
        
        do
        {
            propertiesMenu();
            System.out.print("\nEnter your option: ");

            while (!input.hasNextInt())
            {
                System.out.print("Please enter a number: ");
                input.next();
            }
            menuInput = input.nextInt();

            switch (menuInput)
            {
                case 1 : addElement(propertiesSet); break;
                case 2 : checkElement(propertiesSet); break;
                case 3 : cardinality(propertiesSet); break;
                case 4 : enumFormat(propertiesSet); break;
                case 5 : yearFormat(propertiesSet); break;
            }
        }
        while (menuInput != 9);
    }

    // ------------------- CASE 1 -------------------
    static void unionExample() // Union
    {
        Set demoSet1 = getASet();
        Set demoSet2 = getASet();

        displayAandB(demoSet1, demoSet2);

        System.out.print("\tUnion of A and B = ");
        demoSet1.union(demoSet2);
    }

    // ------------------- CASE 2 -------------------
    static void intersectionExample() // Intersection
    {
        Set demoSet1 = getASet();
        Set demoSet2 = getASet();

        displayAandB(demoSet1, demoSet2);

        System.out.print("\tIntersection of A and B = ");
        demoSet1.intersection(demoSet2);
    }

    // ------------------- CASE 3 -------------------
    static void subsetExample()
    {
        Set demoSet1 = getASet();
        Set demoSet2 = getASet();

        displayAandB(demoSet1, demoSet2);

        System.out.println("Conclusion");
        System.out.println("\tA subset of B: " + demoSet1.subset(demoSet2));
        System.out.println("\tB subset of A: " + demoSet2.subset(demoSet1));
    }

    // ------------------- CASE 4 -------------------
    static void differenceExample() // Whatever is in A, is not in B
    {
        Set demoSet1 = getASet();
        Set demoSet2 = getASet();

        displayAandB(demoSet1, demoSet2);

        System.out.print("\tA - B = ");
        demoSet1.difference(demoSet2);
    }

    // ------------------- CASE 5 -------------------
    static void complementExample()
    {
        Set demoSet1 = getASet();
        Set complementSet = demoSet1.complement();

        System.out.println("\nGiven set");
        System.out.print("\tA = ");
        displaySet(demoSet1);

        System.out.println();
        System.out.print("\tA' = ");
        displaySet(complementSet);
    }

    // ------------------- CASE 6 -------------------
    static void setsEqualityExample()
    {
        Set demoSet1 = getASet();
        Set demoSet2 = getASet();

        displayAandB(demoSet1, demoSet2);
        System.out.println();

        System.out.println("Analysis");
        System.out.print("\tA subset of B: " + demoSet1.subset(demoSet2) + "\n");
        System.out.print("\tB subset of A: " + demoSet2.subset(demoSet1) + "\n");
        System.out.println();

        System.out.println("Conclusion");
        if (demoSet1.equality(demoSet2))
        {
            System.out.println("\tA equal to B: true");
        }
        else
        {
            System.out.println("\tA equal to B: false");
        }
        
    }

    // ------------------- CASE 7 -------------------
    static void distributive1()
    {
        Set demoSet1 = getASet();
        Set demoSet2 = getASet();
        Set demoSet3 = getASet();

        System.out.println("We wish to prove: A U (B I C) = (A U B) I (A U C)");
        System.out.println();

        displayAandBandC(demoSet1, demoSet2, demoSet3);
        System.out.println();

        System.out.println("LHS Analysis");
        Set lhs = lhsAnalysis(demoSet1, demoSet2, demoSet3);
        System.out.print("\tLHS = ");
        displaySet(lhs);
        System.out.println();

        System.out.println("RHS Analysis");
        Set rhs = rhsAnalysis(demoSet1, demoSet2, demoSet3);
        System.out.print("\tRHS = ");
        displaySet(rhs);
        System.out.println();

        System.out.println("Conclusion");
        if (lhs.s.equals(rhs.s))
        {
            System.out.println("\tLHS = RHS is true");
        }
        else
        {
            System.out.println("\tLHS = RHS is false");
        }
        System.out.println();
    }

    // ------------------- CASE 8 -------------------
    static void distributive2()
    {
        Set demoSet1 = getASet();
        Set demoSet2 = getASet();
        Set demoSet3 = getASet();

        System.out.println("We wish to prove: A I (B U C) = (A I B) U (A I C)");
        System.out.println();

        displayAandBandC(demoSet1, demoSet2, demoSet3);
        System.out.println();

        System.out.println("LHS Analysis");
        Set lhs = lhsAnalysis2(demoSet1, demoSet2, demoSet3);
        System.out.print("\tLHS = ");
        displaySet(lhs);
        System.out.println();

        System.out.println("RHS Analysis");
        Set rhs = lhsAnalysis2(demoSet1, demoSet2, demoSet3);
        System.out.print("\tRHS = ");
        displaySet(rhs);
        System.out.println();

        System.out.println("Conclusion");
        if (lhs.s.equals(rhs.s))
        {
            System.out.println("\tLHS = RHS is true");
        }
        else
        {
            System.out.println("\tLHS = RHS is false");
        }
        System.out.println();
    }

    // ------------------- SUB MENU OF OPTION 0 -------------------

    static void propertiesMenu()
    {
        System.out.println("\nSome basic operations in set");
        System.out.println("\t1. Add an element");
        System.out.println("\t2. Check an element");
        System.out.println("\t3. Cardinality");
        System.out.println("\t4. Enum format");
        System.out.println("\t5. Year format");
        System.out.println("\t9. Quit");

        System.out.println();
    }

    // ------------------- Option 1 -------------------
    static void addElement(Set propertiesSet)
    {
        Scanner input = new Scanner(System.in);
        int counter = 0; // To display Zodiac not found

        System.out.print("Enter an element: ");
        String inputElement = input.next().toLowerCase();

        // To get rid of LowerCap issue
        String firstPart = inputElement.substring(0, 1).toUpperCase();
        String secondPart = inputElement.substring(1).toLowerCase();
        String finalInput = firstPart + secondPart;

        for (Zodiac eachZodiac : Zodiac.values())
        {
            if (inputElement.equals(eachZodiac.getUpperCase().toLowerCase()))
            {
                counter++;
                propertiesSet.addElement(Zodiac.valueOf(finalInput));
            }
        }
        if (counter == 0)
        {
            System.out.println("No such Zodiac!");
        }

        System.out.print("\tA = ");
        displaySet(propertiesSet);
    }

    // ------------------- Option 2 -------------------
    static void checkElement(Set propertiesSet)
    {
        Scanner input = new Scanner(System.in);
        int counter = 0; // To display Zodiac not found

        System.out.print("Enter an element: ");
        String inputElement = input.next();

        // To get rid of LowerCap issue
        String firstPart = inputElement.substring(0, 1).toUpperCase();
        String secondPart = inputElement.substring(1).toLowerCase();
        String finalInput = firstPart + secondPart;

        if (propertiesSet.belongTo(Zodiac.valueOf(finalInput)))
        {
            counter++;
            System.out.printf("Element %s is in set%n", finalInput);
        }

        if (counter == 0)
        {
            System.out.printf("Element %s is not in set%n", inputElement);
        }

        System.out.print("\tA = ");
        displaySet(propertiesSet);
    }

    // ------------------- Option 3 -------------------
    static void cardinality(Set propertiesSet)
    {
        System.out.printf("No. of elements in set is %d%n", propertiesSet.cardinality());
    }

    // ------------------- Option 4 -------------------
    static void enumFormat(Set propertiesSet)
    {
        System.out.println("\nNotation in enum format");
        System.out.println(propertiesSet.getEnumFormat());
    }

    // ------------------- Option 5 -------------------
    static void yearFormat(Set propertiesSet)
    {
        System.out.println("\nNotation in year format");
        System.out.println(propertiesSet.getYearFormat());
    }

    // ------------------- END OF SUB MENU OF OPTION 0 -------------------

    // ------------------- Creation of Sets -------------------
    static Zodiac getAnElement()
    {
        int size = Zodiac.values().length;
        int rand = (int)(Math.random() * size); // To get a random num

        return Zodiac.values()[rand];
    }

    static Set getASet() // Must generate a rand num of Zodiac elements. All must be unique
    {
        Set randSet = new Set(); // Create an empty set

        int rand = (int)(Math.random() * (Zodiac.values().length));

        for (int i = 0; i < rand; i++)
        {
            Zodiac element = getAnElement();

            if (!randSet.s.contains(element))
            {
                randSet.s.add(element);
            }
        }
        return randSet;
    }
    // ------------------- End of Creation of Sets -------------------

    // ------------------- Displays -------------------
    // To Display the Zodiac Info
    static void displayZodiacInfo()
    {
        System.out.println("----------------------------------------");
        System.out.println("\nUniversal set info");
        System.out.println();

        System.out.println("Zodiac Sign\tKnown as\tFor example");
        
        for (Zodiac eachAnimal : Zodiac.values())
        {
            System.out.println(eachAnimal + "\t\t" + eachAnimal.getUpperCase() + "\t\t" + eachAnimal.getYear());
        }
    }

    static void displayMainMenu()
    {
        System.out.println("----------------------------------------");
        System.out.println("\nWelcome to SIM Set Theory Lesson");
        System.out.println();

        System.out.println("0. Properties of set");
        System.out.println("1. Union example");
        System.out.println("2. Intersection example");
        System.out.println("3. Subset example");
        System.out.println("4. Difference example");
        System.out.println("5. Complement example");
        System.out.println("6. Sets equality example");
        System.out.println("7. Distributive Law 1");
        System.out.println("8. Distributive Law 2");
        System.out.println("9. Quit");
    }

    // To Display the contents of the current set
    public static void displaySet(Set propertiesSet)
    {
        System.out.print("{");
        for (int i = 0; i < propertiesSet.s.size(); i++)
        {
            if(i == propertiesSet.s.size() - 1)
            {
                System.out.print(propertiesSet.s.get(i).getUpperCase());
            }
            else
            {
                System.out.print(propertiesSet.s.get(i).getUpperCase() + ", ");
            }
        }
        System.out.print("}\n");
    }

    // To display 2 randomly generated Sets
    static void displayAandB(Set demoSet1, Set demoSet2)
    {
        System.out.println("\nGiven sets");

        System.out.print("\tA = ");
        displaySet(demoSet1);

        System.out.print("\tB = ");
        displaySet(demoSet2);
        
        System.out.println();
    }

    // To display 3 randomly generated Sets
    static void displayAandBandC(Set demoSet1, Set demoSet2, Set demoSet3)
    {
        System.out.println("\nGiven sets");

        System.out.print("\tA = ");
        displaySet(demoSet1);

        System.out.print("\tB = ");
        displaySet(demoSet2);

        System.out.print("\tC = ");
        displaySet(demoSet3);
    }
    // ------------------- End of Displays -------------------

    // ------------------- LHS ANALYSIS -------------------
    static Set lhsAnalysis(Set demoSet1, Set demoSet2, Set demoSet3)
    {
        Set bIc = new Set();
        Set aUbIc = new Set();

        // Calculate (B I C)
        for (Zodiac eachZodiac : demoSet2.s)
        {
            if (demoSet3.belongTo(eachZodiac))
            {
                bIc.s.add(eachZodiac);
            }
        }

        // (A U (B I C))
        aUbIc.s.addAll(demoSet1.s);

        for (Zodiac eachZodiac : bIc.s)
        {
            if (!aUbIc.belongTo(eachZodiac))
            {
                aUbIc.s.add(eachZodiac);
            }
        }

        return aUbIc;
    }

    // ------------------- RHS ANALYSIS -------------------
    static Set rhsAnalysis(Set demoSet1, Set demoSet2, Set demoSet3)
    {
        Set aUb = new Set();
        Set aUc = new Set();
        Set aUbIaUc = new Set();

        // (A U B)
        aUb.s.addAll(demoSet1.s);
        for (Zodiac eachZodiac : demoSet2.s)
        {
            if (!aUb.belongTo(eachZodiac))
            {
                aUb.s.add(eachZodiac);
            }
        }

        // (A U C)
        aUc.s.addAll(demoSet1.s);
        for (Zodiac eachZodiac : demoSet3.s)
        {
            if (!aUc.belongTo(eachZodiac))
            {
                aUc.s.add(eachZodiac);
            }
        }

        // (A U B) I (A U C)
        for (Zodiac eachZodiac : aUb.s)
        {
            if (aUc.belongTo(eachZodiac))
            {
                aUbIaUc.s.add(eachZodiac);
            }
        }
        return aUbIaUc;
    }

    // ------------------- LHS ANALYSIS 2 -------------------
    static Set lhsAnalysis2(Set demoSet1, Set demoSet2, Set demoSet3)
    {
        Set bUc = new Set();
        Set aIbUc = new Set();

        // (B U C)
        bUc.s.addAll(demoSet2.s);
        for (Zodiac eachZodiac : demoSet3.s)
        {
            if (!bUc.belongTo(eachZodiac))
            {
                bUc.s.add(eachZodiac);
            }
        }

        // A I (B U C)
        for (Zodiac eachZodiac : demoSet1.s)
        {
            if (bUc.belongTo(eachZodiac))
            {
                aIbUc.s.add(eachZodiac);
            }
        }
        return aIbUc;
    }

    // ------------------- RHS ANALYSIS 2 -------------------
    static Set rhsAnalysis2(Set demoSet1, Set demoSet2, Set demoSet3)
    {
        Set aIb = new Set();
        Set aIc = new Set();
        Set aIbUaIc = new Set();

        // (A I B)
        for (Zodiac eachZodiac : demoSet1.s)
        {
            if (demoSet2.belongTo(eachZodiac))
            {
                aIb.s.add(eachZodiac);
            }
        }

        // (A I C)
        for (Zodiac eachZodiac : demoSet1.s)
        {
            if (demoSet3.belongTo(eachZodiac))
            {
                aIc.s.add(eachZodiac);
            }
        }

        // (A I B) U (A I C)
        aIbUaIc.s.addAll(aIb.s);

        for (Zodiac eachZodiac : aIc.s)
        {
            if (!aIbUaIc.belongTo(eachZodiac))
            {
                aIbUaIc.s.add(eachZodiac);
            }
        }
        return aIbUaIc;
    }
}

class Set {

    ArrayList<Zodiac> s;

    // Default Constructor to construct an empty set
    public Set()
    {
        this.s = new ArrayList<Zodiac>();
    }

    // Copy Constructor for Deep Copying 
    public Set(Set otherSet)
    {
        // Using deep copy
        s = new ArrayList<Zodiac>(otherSet.s);
    }

    public boolean isEmpty() // Check if the ArrayList is empty
    {
        return (s.size() == 0) ? true : false;
    }

    public int cardinality() // Check size of ArrayList
    {
        return s.size();
    }
       
    public boolean belongTo(Zodiac element) // Takes in a Zodiac & check if it's inside the ArrayList
    {
        for (Zodiac eachZod : this.s)
        {
            if (eachZod == element)
            {
                return true;
            }
        }
        return false;
    }

    public void addElement(Zodiac element) // Adds a Zodiac into the ArrayList
    {
        for (Zodiac eachZodiac : Zodiac.values())
        {
            if (eachZodiac.equals(element))
            {
                if (s.contains(eachZodiac))
                {
                    System.out.printf("%s is already in the set!%n", eachZodiac.getUpperCase());
                }
                else
                {
                    s.add(eachZodiac);
                }
            }
        }
    }

    public String getEnumFormat()
    {
        
        String a = "\tA = {";

        for (int i = 0; i < s.size(); i++)
        {
            if (i == s.size() - 1)
            {
                a += s.get(i);
            }
            else
            {
                a += s.get(i) + ", ";
            }
        }

        a += "}";

        return a;
    }

    public String getYearFormat()
    {
        String a = "\tA = {";

        for (int i = 0; i < s.size(); i++)
        {
            if (i == s.size() - 1)
            {
                a += s.get(i).getYear();
            }
            else
            {
                a += s.get(i).getYear() + ", ";
            }
        }

        a += "}";

        return a;
    }

    public void union(Set otherSet)
    {
        ArrayList<Zodiac> unionSet = new ArrayList<Zodiac>();

        unionSet.addAll(this.s);

        for (Zodiac eachZodiac : otherSet.s)
        {
            if (!this.s.contains(eachZodiac))
            {
                unionSet.add(eachZodiac);
            }
        }

        System.out.print("{");
        for (int i = 0; i < unionSet.size(); i++)
        {
            if (i == unionSet.size() - 1)
            {
                System.out.print(unionSet.get(i).getUpperCase());
            }
            else
            {
                System.out.print(unionSet.get(i).getUpperCase() + ", ");
            }
        }
        System.out.print("}");
    }

    public void intersection(Set otherSet)
    {
        ArrayList<Zodiac> intersectionSet = new ArrayList<Zodiac>();
        for (Zodiac eachZodiac : this.s)
        {
            if (otherSet.belongTo(eachZodiac))
            {
                intersectionSet.add(eachZodiac);
            }
        }

        System.out.print("{");
        for (int i = 0; i < intersectionSet.size(); i++)
        {
            if (i == intersectionSet.size() - 1)
            {
                System.out.print(intersectionSet.get(i).getUpperCase());
            }
            else
            {
                System.out.print(intersectionSet.get(i).getUpperCase() + ", ");
            }
        }
        System.out.print("}");
    }

    public boolean subset(Set otherset)
    {
        int counter = 0;
        for (Zodiac eachZodiac : otherset.s)
        {
            if (belongTo(eachZodiac))
            {
                counter++;
            }
        }
        if (counter == this.s.size())
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public void difference(Set otherSet)
    {
        ArrayList<Zodiac> finalSet = new ArrayList<Zodiac>();

        for (Zodiac eachZodiac : this.s)
        {
            if (!otherSet.belongTo(eachZodiac))
            {
                finalSet.add(eachZodiac);
            }
        }

        System.out.print("{");

        for (int i = 0; i < finalSet.size(); i++)
        {
            if (i == finalSet.size() - 1)
            {
                System.out.print(finalSet.get(i));
            }
            else
            {
                System.out.print(finalSet.get(i) + ", ");
            }
        }
        System.out.print("}\n");
    }

    public Set complement()
    {
        Set complementSet = new Set();

        for (Zodiac eachZodiac : Zodiac.values())
        {
            if (!this.belongTo(eachZodiac))
            {
                complementSet.s.add(eachZodiac);
            }
        }
        return complementSet;
    }

    public boolean equality(Set otherSet)
    {
        if (this.subset(otherSet) && otherSet.subset(this))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}