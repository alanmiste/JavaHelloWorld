public class Main {

        public static void main(String[] args)
        {
            String MyName = "Alan";
            String Bootcamp = "Fullstack Java";
            String Location = "Germany";
            String[] Hobbies = {
                    "Programing","Coding",
                    "Photography","Designing",
                    "Drawing","Blogging","Astronomy"};

            System.out.println("Hello World!");
            System.out.println("I am "+MyName+", I will join "
                    +Bootcamp+" Bootcamp, I based in "+Location);
            System.out.println("My hobbies are:");
            for (int i = 0; i < Hobbies.length; i++) {
                System.out.println(Hobbies[i]);
            }
        }
    }