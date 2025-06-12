package max;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Finch bird = new Finch();
        int[] led = new int[25];
        System.out.print("Enter an led position to turn on (1 to 25) and it must me either a 1 or a 0: ");
        int userInput = scanner.nextInt();
        if (userInput < 1 || userInput > 25) {
            System.out.println("Invalid input. Please enter a number from 1 to 25.");
            return;
        }
        setDisplay(led, userInput, 1);
        bird.setDisplay(led);
        while (!bird.isShaking()) {
            System.out.println("Compass Heading: " + bird.getCompass());
            bird.setMove("F", 999, 50);
            bird.pause(10);
        }
        
        bird.setDisplay(new int[25]);
    }
    public static void setDisplay(int[] led, int set, int value) {
        if (set >= 1 && set <= led.length) {
            led[set - 1] = value; 
        }
    }
}
