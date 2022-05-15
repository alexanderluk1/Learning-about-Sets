This project randomly generates Zodiac Animals in an effort to showcase to users how Sets work

This project involves using

1. ENUMS (To hold the Zodiacs, Uppercase Zodiacs & Corresponding years)
2. All the sets are randomly generated & unique
3. Validation to ensure user doesn't key in an incorrect input


# Main Menu:

0. Set Properties
1. Union Examples
2. Intersection Examples
3. Subset Examples
4. Difference Examples
5. Complement Examples
6. Sets Equality Examples
7. Distributive Law 1
8. Distributive Law 2
9. Quit


## **Set Examples**

A set is randomly generated and displayed in UpperCase format:
```
Here is an example of set
        A = {MONKEY, GOAT, PIG, TIGER, OX}
        All elements in set are distinct and random order
```
You are then able to manipulate the set through a sub-menu

# Sub Menu:

1. Add Element
2. Check if Element is in the Set
3. Cardinality (No. of elements in set is 6)
4. Display in Enum format (A = {Rat, Horse, Dog, Rabbit, Ox, Dragon})
5. Display in Year format (A = {1948, 1954, 1958, 1951, 1949, 1952})
9. Quit


## **Union Examples**
```
Given sets
        A = {SNAKE, DOG, TIGER, RABBIT, ROOSTER, PIG, DRAGON}
        B = {ROOSTER, GOAT}

        Union of A and B = {SNAKE, DOG, TIGER, RABBIT, ROOSTER, PIG, DRAGON, GOAT}
```      
## **Intersection Example**
```
Given sets
        A = {DOG, TIGER, GOAT}
        B = {TIGER, DOG, DRAGON, ROOSTER, PIG, RAT}

        Intersection of A and B = {DOG, TIGER}
```
## **Subset Example**
```
Given sets
        A = {HORSE, MONKEY, DRAGON, PIG, DOG, OX, RAT, SNAKE}
        B = {RAT, HORSE, TIGER, ROOSTER, SNAKE}

Conclusion
        A subset of B: false
        B subset of A: false
```
## **Difference Example**
```
Given sets
        A = {SNAKE}
        B = {DOG, HORSE, DRAGON}

        A - B = {Snake}
```
## **Complement Example**
```
Given set
        A = {HORSE, GOAT}

        A' = {RAT, OX, TIGER, RABBIT, DRAGON, SNAKE, MONKEY, ROOSTER, DOG, PIG}
```

## **Set Equality Example**
```
Given sets
        A = {ROOSTER, RABBIT, MONKEY}
        B = {GOAT, SNAKE, RAT, TIGER, OX, DRAGON, MONKEY, RABBIT}


Analysis
        A subset of B: false
        B subset of A: false

Conclusion
        A equal to B: false
```
## **Distributive Law 1**
```
We wish to prove: A U (B I C) = (A U B) I (A U C)


Given sets
        A = {RABBIT, DOG, SNAKE, MONKEY, OX}
        B = {DOG, OX, HORSE, RABBIT, ROOSTER, RAT, GOAT}
        C = {DOG, GOAT, DRAGON, HORSE}

LHS Analysis
        LHS = {RABBIT, DOG, SNAKE, MONKEY, OX, HORSE, GOAT}

RHS Analysis
        RHS = {RABBIT, DOG, SNAKE, MONKEY, OX, HORSE, GOAT}

Conclusion
        LHS = RHS is true
```

## **Distributive Law 2**
```
We wish to prove: A I (B U C) = (A I B) U (A I C)


Given sets
        A = {MONKEY, RAT, SNAKE, DOG, OX, DRAGON, ROOSTER, GOAT, HORSE}
        B = {}
        C = {ROOSTER, DOG, MONKEY, RABBIT, RAT, HORSE, GOAT, SNAKE, OX}

LHS Analysis
        LHS = {MONKEY, RAT, SNAKE, DOG, OX, ROOSTER, GOAT, HORSE}

RHS Analysis
        RHS = {MONKEY, RAT, SNAKE, DOG, OX, ROOSTER, GOAT, HORSE}

Conclusion
        LHS = RHS is true
```










