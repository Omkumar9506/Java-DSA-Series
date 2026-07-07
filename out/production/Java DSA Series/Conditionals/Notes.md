# Types of Conditionals in Java

1. if statement
2. if-else statement
3. if-else-if ladder
4. Nested if-else
5. Ternary operator
6. Switch statement

## 1. if Statement

**Used to check a condition. If the condition is true, the block of code inside if runs.**

>Example

```
public class Main {
    public static void main(String[] args) {

        int dailyPractice = 12;

        if (dailyPractice >= 10) {
            System.out.println("Good consistency!");
        }
    }
}
```

## 2.  if-else Statement

**Used when there are two choices. If condition is true, if block runs, otherwise else block runs.**

>Example

```
public class Main {
    public static void main(String[] args) {

        int score = 42;

        if (score >= 50) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
    }
}
```

## 3. if-else-if Ladder

**Used to check multiple conditions one by one. If one condition is true, its block runs, otherwise next condition is checked.**

>Example

```
public class Main {
    public static void main(String[] args) {

        int accuracy = 78;

        if (accuracy >= 90) {
            System.out.println("Excellent");
        }
        else if (accuracy >= 75) {
            System.out.println("Good");
        }
        else if (accuracy >= 60) {
            System.out.println("Average");
        }
        else {
            System.out.println("Needs Improvement");
        }
    }
}
```

## 4. Nested if-else

**An if-else statement placed inside another if or else block. Used for checking multiple dependent conditions.**

>Example

```
public class Main {
    public static void main(String[] args) {

        boolean hasSubscription = true;
        int solvedProblems = 220;

        if (hasSubscription) {

            if (solvedProblems >= 200) {
                System.out.println("Unlock Advanced Sheet");
            } else {
                System.out.println("Practice More Problems");
            }

        } else {
            System.out.println("Upgrade to Premium");
        }
    }
}
```

## 5. Ternary Operator

**A short form of if-else used to choose one value based on a condition using ? :.**

>Example

```
public class Main {
    public static void main(String[] args) {

        int streakDays = 35;

        String status = (streakDays >= 30) ? "Consistent" : "Irregular";

        System.out.println(status);
    }
}
```

## 6. Switch Statement

**Used to select one block of code from many options based on the value of a variable.**

>Example

```
public class Main {
    public static void main(String[] args) {

        int dayNumber = 3;

        switch (dayNumber) {
            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            default:
                System.out.println("Invalid day");
        }
    }
}
```