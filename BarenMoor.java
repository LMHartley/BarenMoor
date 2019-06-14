import java.util.Scanner;

public class BarenMoor {
    public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your player name:");
		String playerName=input.nextLine();
		System.out.println("Hello "+playerName);
		System.out.println("Would you like to play a game?");
		String gameChoice="";
            while(gameChoice.equals("")){
                String gameStartChoice=input.nextLine();
                switch(gameStartChoice){
                    case "yes": System.out.println("Great, let's begin");gameChoice="los geht!";break;
                    case "no": System.out.println("I'm sorry, "+playerName+", I'm afraid I can't do that.");
                                      System.out.println("Try again.");break;
                    default: System.out.println("Sorry, buddy, this isn't Bandersnatch. Try again.");
                }
            }
		System.out.println("--------------------------------");
		System.out.println("You've woken up in a baren moor. Your arms are sweaty, knees weak, arms are heavy.");
		System.out.println("Now that you've woken up. You'll have to decide what to do.");
		System.out.println("Do you 'look' around the area or 'cry'?");
        String decisionOne="";
            while(decisionOne.equals("")){
                String firstChoice=input.nextLine();
                switch(firstChoice){
                    case "look": System.out.println("This place is very foggy. Must be Scotland.");decisionOne="done";break;
                    case "cry": System.out.println("Well, that won't solve anything. Will it,"+playerName+"?");
                                      System.out.println("Try again.");break;
                    default: System.out.println("Invalid answer, try again.");
                }
            }
        System.out.println("There seems to be something heavy in your pocket.");
        System.out.println("Maybe you should 'use' it?");
        String decisionTwo="";
            while(decisionTwo.equals("")){
                String secondChoice=input.nextLine();
                switch(secondChoice){
                    case "use": System.out.println("It appears to be a compass. You can use this for directions.");decisionTwo="done";break;
                    default: System.out.println("Don't be an idiot. Try again.");
                }
            }
        String directionEnd="";
        while(directionEnd.equals("")){
            System.out.println("How about you be a smart cookie and choose a direction to go?");
            String directionChoiceOne="";
            while(directionChoiceOne.equals("")){
                String thirdChoice=input.nextLine();
                switch(thirdChoice){
                    case "north": System.out.println("let's go north");
                                System.out.println("It seems to be getting colder. Maybe you should go 'back'.");
                                directionChoiceOne="done";break;
                    case "east": System.out.println("let's go east");
                                System.out.println("Hmm, there seems to be something in the distance. You should 'continue'.");
                                directionChoiceOne="done";break;
                    case "south": System.out.println("let's go south");
                                System.out.println("Nothing but nothing down here, go 'back'.");
                                directionChoiceOne="done";break;
                    case "west": System.out.println("let's go west");
                                System.out.println("Country roads, take me home, West Virginia. Go 'back'.");
                                directionChoiceOne="done";break;
                    default: System.out.println("Never Eat Shredded Wheat. Try again.");
                }
            }
            String directionChoiceTwo="";
            while(directionChoiceTwo.equals("")){
                String fourthChoice=input.nextLine();
                switch(fourthChoice){
                    case "continue": System.out.println("Good choice");directionEnd="yes";directionChoiceTwo="done";break;
                    case "back": System.out.println("I knew you'd be scared. Try again.");
                                 directionChoiceTwo="back";break;
                    default: System.out.println("What a shame, looks like you don't have free will. Try again.");
                }
            }
        }
        System.out.println("How odd. There seems to be a treasure box. Here, in the middle of nowhere? What a coincidence.");
        System.out.println("You should definitely 'open' it or you could 'walk away' but I doubt that'll achieve anything.");
        String treasureChoice="";
            while(treasureChoice.equals("")){
                String endgameChoice=input.nextLine();
                switch(endgameChoice){
                    case "open": System.out.println("Wow, it seems to be filled with cookies. Get in!");treasureChoice="completed it mate";break;
                    case "walk away": System.out.println("Don't be a baby. What's the worst that could happen?");
                                      System.out.println("Try again.");break;
                    default: System.out.println("Stop trying to break this code. Try again.");
                }
            }
        System.out.println("Well, it seems you've completed this game. I'm sure someone will be coming to save you soon. In the meantime, you can live on cookies.");
    }
}