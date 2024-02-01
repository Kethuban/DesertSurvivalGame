//importing scanner
import java.util.Scanner;

public class Main
{
    //initializng scanner publically so it can be accessed in all methods
    public static final Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args)throws InterruptedException
    {

        //DECLARE VARIBLES
        String choice;
        choice = "";
        // Anything that is within the typingTextEffect function prints letter by letter
        typingTextEffect("Hello, welcome to the Desert Survival Game. This is a game where you will be given a series of choices and you will have to make the right ones to survive!");
        typingTextEffect("Your responses should only be one word, the choices are in brackets next to the question.");

        //creating space for text to be readable
        System.out.println();

        while (choice!= "preston" || choice!= "shaq")
        {
            // Asking the user who they would like to go with
            typingTextEffect("Would you like to go with Preston, Shaq Or Jamal? (Preston, Shaq or Jamal)");
            // Storing user input in the variable choice
            choice = keyboard.nextLine().toLowerCase();
            // If the user chooses Preston the following code will run
            if (choice.equalsIgnoreCase("preston"))
            {
                //Clear console
                System.out.print("\033[H\033[2J");
                //calling on the preston path function
                pathPreston();
            }
            // If the user chooses Shaq the following code will run
            else if (choice.equalsIgnoreCase("shaq"))
            {
                //Clear console
                System.out.print("\033[H\033[2J");
                //calling on the shaq path function
                pathShaq();
            }
            // If the user chooses Shaq the following code will run
            else if (choice.equalsIgnoreCase("jamal"))
            {
                //Clear console
                System.out.print("\033[H\033[2J");
                //calling on the shaq path function
                pathJamal();
            }
            // If the user enters something invalid it will print the following
            else
            {
                typingTextEffect("Invalid input, please try again.");
            }
        }

    }

    ///////////////////////////////// START OF PATH 1 /////////////////////////////////


    //this method is an "entry" to the preston path and its choices
    public static void pathPreston()
    {
        // INITIALIZE VARIABLES
        String choicePreston;

        // Anything that is within the typingTextEffect function prints letter by letter
        typingTextEffect("Do you want to look for a village or food? (Village or food)");
        // Storing user input in the variable choice
        choicePreston = keyboard.nextLine().toLowerCase();

        //Clear console
        System.out.print("\033[H\033[2J");

        // Using a switch to run the coresponding pathway
        switch (choicePreston)
        {
            // if the user input is food the following code will run
            case "food":
                // calling the function that handles the food path
                handleFoodPath();
                // exits the switch
                break;
            // if the user input is village the following code will run
            case "village":
                // calling the function that handles the village path
                handleVillagePath();
                // exits the switch
                break;
            //if the user input is anything else the following code wil run
            default:
                // printing an error message
                typingTextEffect("You entered an invalid input");
                //calling the play again function
                playAgain();
        }
    }

    //this method contains all the dialaogue and choices for the food path
    private static void handleFoodPath()
    {

        typingTextEffect("You walk for a couple of hours and find a ravine. Across the ravine, you see something.");
        //creating space for text to be readable
        System.out.println();
        typingTextEffect("Preston: 'Let's go investigate!'");
        //creating space for text to be readable
        System.out.println();
        typingTextEffect("Preston: 'How can we get across?'");
        //creating space for text to be readable
        System.out.println();
        typingTextEffect("You: Look, a bridge!");
        //creating space for text to be readable
        System.out.println();
        typingTextEffect("You: Let's find some wood to fix it up!");
        //creating space for text to be readable
        System.out.println();
        typingTextEffect("After some time ~");

        // handles errors/exceptions when there is an interuption to the delay (thread.sleep)
        // "try" tells the program to run the following code
        try
        {
            // using sleep to pause the program for the specified time (in miliseconds)
            Thread.sleep(2000);
        }
        // if the code recieves an error, the following handles it preventing the program from crashing and moves on to the following code
        catch (InterruptedException e)
        {

        }
        //creating space for text to be readable
        System.out.println();
        typingTextEffect("You: 'I think this should work!'");
        //creating space for text to be readable
        System.out.println();
        typingTextEffect(
                "You both carefully make your way across a bridge you hear a couple of creaks but you make it across.");
        //creating space for text to be readable
        System.out.println();
        typingTextEffect("You come across some Waffle House waffles.");
        //creating space for text to be readable
        System.out.println();
        //calling the askYesNo function to recieve user input, if the function returns true the following code will run
        if (askYesNo("Do you eat them? (yes or no)"))
        {
            typingTextEffect("They look kind of strange but its better than nothing.🤷 *You eat them anyway*.");
               /* inside the if statement parameters, it is calling on the winLoss function,
               the chance is 10% so anything generated above 90 is a win */
            if (winLoss(90))
            {
                typingTextEffect("They gave you a lot of energy and you feel much better!");
                //creating space for text to be readable
                System.out.println();
                typingTextEffect("POWER UP ⮸ You gained three days of dehydration resistance!");
                //creating space for text to be readable
                System.out.println();
                typingTextEffect("You: 'I'm feeling a lot better!'");
                //creating space for text to be readable
                System.out.println();
                typingTextEffect("Shaq: Me too!");
                //creating space for text to be readable
                System.out.println();
                typingTextEffect("You both find your way to a village and call for help!");
                //creating space for text to be readable
                System.out.println();
                //calling the gameOver function to print the final messsage and ask the user to play again
                gameOver("You sucessfully made it to the village and called for help!");
                //creating space for text to be readable
                System.out.println();
            }
            // anything else is a loss
            else
            {
                typingTextEffect("You feel a bit sick and you start to feel light headed.");
                //creating space for text to be readable
                System.out.println();
                typingTextEffect("You: 'Something seems off.'");
                //creating space for text to be readable
                System.out.println();
                typingTextEffect("Shaq: 'I don't know what it is, but it's probably nothing.'");
                //creating space for text to be readable
                System.out.println();
                typingTextEffect("You both puke and die of dehydration.");
                //creating space for text to be readable
                System.out.println();
                //calling the gameOver function to print the final messsage and ask the user to play again
                gameOver("I guess all that fluid loss did it huh");
                //creating space for text to be readable
                System.out.println();
            }
        }
        // if the user inputs anything other than "yes" the following code will run
        else
        {
            typingTextEffect("You kept walking...");
            //creating space for text to be readable
            System.out.println();
            typingTextEffect("All this walking is making me tired.");
            //creating space for text to be readable
            System.out.println();
            typingTextEffect("You: Maybe we should take a break?");
            //creating space for text to be readable
            System.out.println();
            typingTextEffect("Preston: Yea that sounds like a good idea.");
            //creating space for text to be readable
            System.out.println();
            typingTextEffect("You both find some shade to lie under");
            //creating space for text to be readable
            System.out.println();

            //calling the gameOver function to print the final messsage and ask the user to play again
            gameOver("You both fell asleep and never woke up.😴");

        }
    }

    //this method contains all the dialaogue and choices for the village path
    private static void handleVillagePath()
    {
        // using typingsTextEffect to print text letter by letter
        typingTextEffect(
                "After walking for a couple of hours, you find a small village. You decide to go in and see if anyone is there.");
        //creating space for text to be readable
        System.out.println();

        // handles errors/exceptions when there is an interuption to the delay (thread.sleep)
        // "try" tells the program to run the following code
        try
        {
            // using sleep to pause the program for the specified time (in miliseconds)
            Thread.sleep(2000);
        }
        // if the code recieves an error, the following handles it preventing the program from crashing and moves on to the following code
        catch (InterruptedException e)
        {

        }

        typingTextEffect(
                "You enter a strange hut and find a strange man sitting on a wooden stool. He looks at you and says 'Hello, I am the village elder'");
        //creating space for text to be readable
        System.out.println();

        typingTextEffect("Elder: Can I help you?");
        //creating space for text to be readable
        System.out.println();

        typingTextEffect(
                "You: 'I am not from here, I came on a tour but the guide left us. We need food and a phone to call for help. Can you help me?'");
        //creating space for text to be readable
        System.out.println();

        // if the number generated is equal to or greather than 18 the user wins (82% chance to win)
        if (winLoss(18)) {
            typingTextEffect(
                    "Elder: 'Yes, I can help you. I have a map that shows a way out of the desert. You can follow it, and you will find a phone that can call for help. You can also find food and water.");
            gameOver("You sucessfully made it to the village and found help!");
        }
        // if the number generated is below 18 the user loses (18% chance to lose)
        else {
            typingTextEffect(
                    "GET OUT OF MY VILLAGE ... WE HAVE NO HELP TO GIVE FILTHY CITY FOLK WHO COME TO RUIN OU. I WILL KILL YOU IF YOU DON'T LEAVE.");
            //creating space for text to be readable
            System.out.println();
            typingTextEffect("The elder kills you.");
            //creating space for text to be readable
            System.out.println();
            //calling the gameOver function to print the final messsage and ask the user to play again
            gameOver("You died!");
            //creating space for text to be readable
            System.out.println();
        }
    }

    ///////////////////////////////// END OF PATH 1 /////////////////////////////////

    ///////////////////////////////// START OF PATH 2 /////////////////////////////////

    //this method is an "entry" to the Shaq path and its choices
    public static void pathShaq()
    {
        // INITIALIZE VARIABLES
        String choiceShaq;

        // Anything that is within the typingTextEffect function prints letter by letter
        typingTextEffect("Which direction do you want to go? (North, South, or West)");
        //creating space for text to be readable
        System.out.println();
        // Storing user input in the variable choiceShaq
        choiceShaq = keyboard.nextLine().toLowerCase();

        //Clear console
        System.out.print("\033[H\033[2J");

        // Using a switch to run the coresponding pathway
        switch (choiceShaq)
        {
            // if the user input is west the following code will run
            case "west":
                // calls on the west path function
                handleWestPath();
                // exits the switch
                break;
            // if the user input is north the following code will run
            case "north":
                // calls on the north path function
                handleNorthPath();
                // exits the switch
                break;
            // if the user input is south the following code will run
            case "south":
                // calls on the south path function
                handleSouthPath();
                //exits the switch
                break;
            //catches any other input and prints an error message/asks to play again
            default:
                //printing error message
                typingTextEffect("You entered an invalid input");
                //creating space for text to be readable
                System.out.println();
                // calling on the play again function
                playAgain();
        }
    }

    //this method contains all the dialaogue and choices for the west path
    private static void handleWestPath()
    {
        typingTextEffect("You: Let's head west!");
        //creating space for text to be readable
        System.out.println();
        typingTextEffect("Shaq: Sure.");
        //creating space for text to be readable
        System.out.println();
        typingTextEffect("You both walk for a couple of hours ~");
        //creating space for text to be readable
        System.out.println();
        // handles errors/exceptions when there is an interuption to the delay (thread.sleep)
        // "try" tells the program to run the following code
        try
        {
            // using sleep to pause the program for the specified time (in miliseconds)
            Thread.sleep(4000);
        }
        // if the code recieves an error, the following handles it preventing the program from crashing and moves on to the following code
        catch (InterruptedException e)
        {

        }
        typingTextEffect("The wind is picking up quite a bit.");
        //creating space for text to be readable
        System.out.println();
        typingTextEffect("You: I think we should take a break.");
        //creating space for text to be readable
        System.out.println();
        typingTextEffect("Shaq: What is that????");
        //creating space for text to be readable
        System.out.println();
        typingTextEffect("You: SHAQ RUNNN!");
        //creating space for text to be readable
        System.out.println();
        gameOver("A sandstorm sweeps you both away.");
        //creating space for text to be readable
        System.out.println();
    }

    //this method contains all the dialaogue and choices for the north path
    private static void handleNorthPath()
    {
        typingTextEffect("You head North for a while...");
        //creating space for text to be readable
        System.out.println();
        typingTextEffect("You see some cacti.");
        //creating space for text to be readable
        System.out.println();
        typingTextEffect("Hmm... maybe we should eat them?");
        //creating space for text to be readable
        System.out.println();

        //calling the askYesNo function to recieve user input, if the function returns true the following code will run
        if (askYesNo("Do you eat them? (yes or no)"))
        {
            typingTextEffect("You: My skin feels itchy. ");
            //creating space for text to be readable
            System.out.println();
            typingTextEffect ("Shaq: I don't know about you but my skin feels like its burning too.");
            //creating space for text to be readable
            System.out.println();
            //calling the gameOver function to print the final messsage and ask the user to play again
            gameOver("You both itch and scratch yourselves to death.");
            //creating space for text to be readable
            System.out.println();
        }
        // if the user inputs anything other than "yes" the following code will run
        else
        {
            typingTextEffect("You chose not to eat it.");
            //creating space for text to be readable
            System.out.println();
            typingTextEffect("You both keep searching for help.");
            //creating space for text to be readable
            System.out.println();
            //calling on the winLoss function, if the function returns true, the following code will run
            if (winLoss(70))
            {
                typingTextEffect("You find a village and call for help.");
                //creating space for text to be readable
                System.out.println();
                //calling the gameOver function to print the final messsage and ask the user to play again
                gameOver("You survived");
                //creating space for text to be readable
                System.out.println();
            }
            //if the method returns anything else the following code will run
            else
            {
                typingTextEffect("After hours of seraching, you both succumb to dehydration.");
                //creating space for text to be readable
                System.out.println();
                //calling the gameOver function to print the final messsage and ask the user to play again
                gameOver("You died!");
                //creating space for text to be readable
                System.out.println();
            }
        }
    }

    //this method contains all the dialaogue and choices for the south path
    private static void handleSouthPath()
    {
        typingTextEffect("You: I'm tired of walking.");
        //creating space for text to be readable
        System.out.println();
        typingTextEffect("Shaq: Me too,the sun is startng to set!");
        //creating space for text to be readable
        System.out.println();
        typingTextEffect("You: Let's try and light a fire.");
        //creating space for text to be readable
        System.out.println();

        // if the winLoss function returns true the following code will run (99% chance for the following to occur)
        if (winLoss(1))
        {
            typingTextEffect("You fall into the fire and painfully and slowly cook yourself");
            //creating space for text to be readable
            System.out.println();
            gameOver("You died!");
            //creating space for text to be readable
            System.out.println();
        }
        // if the winLoss function returns anything else the following code will run (1% chance for the following to occur)
        else
        {
            typingTextEffect("A helicopter passing by sees the smoke.");
            //creating space for text to be readable
            System.out.println();
            typingTextEffect("They land and pick you up");
            //creating space for text to be readable
            System.out.println();
            gameOver("You are saved!");
            //creating space for text to be readable
            System.out.println();
        }

    }

    ///////////////////////////////// END OF PATH 2 /////////////////////////////////
    ///////////////////////////////// START OF PATH 3 /////////////////////////////////

    public static void pathJamal() {
        String choiceJamal;

        typingTextEffect("Jamal:Do you want to go to the cave, the smoke in the sky or the sand temple.(Please type cave, smoke or sand)");
        //Take User Input
        choiceJamal = keyboard.nextLine();//user input
        //Clear console
        System.out.print("\033[H\033[2J");

        switch (choiceJamal)
        {
            //Using a switch to run a coresponding path
            case "cave":
                handleCavePath();
                break;
            case "smoke":
                handleSmokePath();
                break;
            case "sand":
                handleSandPath();
                break;
            //If user input is invalid
            default:
                typingTextEffect("You entered an invalid input");
                playAgain();
        }
    }
    private static void handleCavePath()//Has all the diolauge and choices for the cave path
    {
        String Direct;
        typingTextEffect("After a long long walk you find a cave. you are suprised you walk in and see three paths.");
        System.out.println();//creating space for text to be readable
        typingTextEffect("Jamal:Which way do you think we should go? Right, Left or Straight.(type Right, Left or Straight)");
        Direct = keyboard.nextLine();
        if (Direct.equals("Right"))
        {
            typingTextEffect("Jamal:You see a gap you must jump across.");
            System.out.println();//creating space for text to be readable
            if (winLoss(65))//65% chance of winning
            {
                typingTextEffect("You made it across.");
                System.out.println();//creating space for text to be readable
                typingTextEffect("Congrats that gap lead to the exit of the cave you see sunlight. You made it out of the cave.");
                System.out.println();//creating space for text to be readable
                typingTextEffect("You then find two friends...");
                System.out.println();//creating space for text to be readable
                gameOver("You and Jamal survived"); //calling the gameOver function to print the final messsage and ask the user to play again
            }
            else if(winLoss(35))//35% chance of losing
            {
                System.out.println();//creating space for text to be readable
                typingTextEffect("You slipped and fell to your death.");
                System.out.println();//creating space for text to be readable
                gameOver("You died");; //calling the gameOver function to print the final messsage and ask the user to play again
            }
        }
        else if (Direct.equals("Left"))//go left
        {
            typingTextEffect("You and Jamal have been impaled by a stalacite.");
            System.out.println();//creating space for text to be readable
            gameOver("You and Jamal died"); //calling the gameOver function to print the final messsage and ask the user to play again
        }
        else //death
        {
            typingTextEffect("You slip on a rock and fall to your death.");
            System.out.println();//creating space for text to be readable
            gameOver("You and Jamal died"); //calling the gameOver function to print the final messsage and ask the user to play again
        }
    }
    private static void handleSmokePath()//Has all the diolauge and choices for the smoke path
    {

        typingTextEffect("You head towards the smoke in the sky....");

        System.out.println();//creating space for text to be readable
        if (winLoss(45))//45% chance
        {
            typingTextEffect("Jamal: We made it to the smoke!");
            System.out.println(); //creating space for text to be readable
            typingTextEffect("You: Who are the two of you?");
            System.out.println();//creating space for text to be readable
            gameOver("You and Jamal are saved!");
        }
        else
        {
            typingTextEffect("You are bit by something.");
            System.out.println();//creating space for text to be readable
            typingTextEffect("You: Whats happening ");
            System.out.println();//creating space for text to be readable
            gameOver("You died!"); //calling the gameOver function to print the final messsage and ask the user to play again
        }
    }
    private static void handleSandPath()//Has all the diolauge and choices for the sand path
    {
        typingTextEffect("You have chosen to go to the sand temple.");
        System.out.println();//creating space for text to be readable
        typingTextEffect("You walk down a flight of stairs and see a straight path with a golden statue at the end.");
        System.out.println();//creating space for text to be readable
        typingTextEffect("Jamal:We have to run to the end)");
        System.out.println();//creating space for text to be readable
        if (winLoss(10))//10% chance
        {
            typingTextEffect("You made it to the end and grabed the statue.");
            System.out.println();//creating space for text to be readable
            typingTextEffect("Jamal: Maybe we should make a wish?");
            System.out.println();//creating space for text to be readable
            typingTextEffect("Your Wish is not granted. You are now dead.");
            System.out.println();//creating space for text to be readable
            gameOver("You died!"); //calling the gameOver function to print the final messsage and ask the user to play again
        }
        else
        {
            System.out.println();//creating space for text to be readable
            typingTextEffect("You died to a hidden trap. You are now dead.");

            playAgain(); //calling the playAgain function to print the final messsage and ask the user to play again
        }
    }

    ///////////////////////////////// END OF PATH 3 /////////////////////////////////

    // private makes sure only the main class can access this function
    // static allows you to interact with the variables of the class without
    // creating an object
    // void means that the function does not return a value
    private static void typingTextEffect(String text) {
        //looping until the end of the string
        for (int i = 0; i < text.length(); i++) {
            //printing each character that is in the string using indexing
            System.out.print(text.charAt(i));
            // handles errors/exceptions when there is an interuption to the delay (thread.sleep)
            // "try" tells the program to run the following code
            try
            {
                // using sleep to pause the program for the specified time (in miliseconds)
                Thread.sleep(50);
            }
            // if the code recieves an error, the following handles it preventing the program from crashing and moves on to the following code
            //this is especially important here as the program is constantly printing and delaying (more chances for error)
            catch (InterruptedException e)
            {

            }
        }
        // Printing a new line after the typing effect
        System.out.println();
    }

    // pirvate makes sure only the main class can access this function
    // static allows you to interact with the variables of the class without
    // creating an object
    // boolean means that the function returns a boolean value
    private static boolean askYesNo(String prompt) {
        // printing the prompt entered by the user
        typingTextEffect(prompt);
        // receiving an input from the user
        String answer = keyboard.nextLine();
        //Clear console
        System.out.print("\033[H\033[2J");
        // returning
        return answer.equalsIgnoreCase("yes");
    }

    // private makes sure only the main class can access this function
    // static means their is a return
    // boolean is the return type
    // int is the parameter
    //receiving the chance to lose, if the number generated is greater than the chance to lose, the game will return true (a win)
    private static boolean winLoss(int lossRate) {
        //genearting a random number between 1 and 100
        int rand = (int) (Math.random() * 100) + 1;

        //if the number generated is less than or equal to the winRate variable the follwing  code will run
        if (rand > lossRate)
        {
            //returning true
            return true;
        }
        //if the number generated is greater than the winRate variable the follwing  code will run
        else
        {
            //returning false
            return false;
        }
        // return rand <= winRate;
    }

    //this function prints a message specified in the parameters and asks the user to play again
    private static void gameOver(String message)
    {
        // "try" tells the program to run the following code
        try
        {
            // using sleep to pause the program for the specified time (in miliseconds)
            Thread.sleep(2000);
        }
        // if the code recieves an error, the following handles it preventing the program from crashing and moves on to the following code
        catch (InterruptedException e)
        {

        }
        //clearing the console
        System.out.print("\033[H\033[2J");
        //printing the message specified in the parameters
        typingTextEffect(message);
        //calling on the play again function
        playAgain();
    }

    //this function asks the user if they want to play again and either calls the main method to run or exits
    private static void playAgain()
    {
        //calling on the askYesNo function to recieve user input, if the function returns true the following code will run
        if (askYesNo("Would you like to play again? (Yes or No)"))
        {
            //Clear console
            System.out.println("\033[H\033[2J");
            // calling the main function without passing any parameters, restarting the game
            // (adding nothing to the parameters [the brackets at the top after main])
            try
            {
                //restart the game
                main(null);
            }
            //catches any errors that occur and allows the code to contiune as normal
            catch(InterruptedException e)
            {

            }
        }
        //if the function returns anything other than true the following code will run
        else
        {
            //printing a exit greeting
            typingTextEffect("Thanks for playing!");
            //exiting the program
            System.exit(0);
        }
    }
}