import java.util.*;
public class JavaLibs5026201105 {
    public static void main(String[] args){
        String Nama,Name1,Name2,City,University,NameUniversity,Word1,Word2,Word3,Subject,Operator;
        Name1 = "Kojuro";
        Name2 = "New Mate";
        int x,y,Age;
        double a,b,result;
        Scanner UserInput;
        UserInput = new Scanner(System.in);
       

        // Kojuro met a new mate, his name is Masamune.
        System.out.println("======== A Coversation With My New Mate ========");

        System.out.println(Name1 + "   : Aigh't Mate I'm Katakura Kojuro, please call me " + Name1 + " and I'm from Japan.");
        System.out.println(Name1 + "   : What's Your Name Mate?");
        System.out.print(Name2 + " : Aigh't " + Name1 + " I'm ");
        Nama = UserInput.next();
        System.out.println(Nama + " : And glad to see you " + Name1);
        System.out.println(Name1 + "   : Yeah, glad to see you too " + Nama);
        System.out.println(Name1 + "   : And Where are You from");
        System.out.print(Nama + " : I'm from ");
        City = UserInput.next();
        System.out.println(Name1 + "   : Wow, HORAS!!! " + City);
        System.out.println(Name1 + "   : And How Old Are You " + Nama + " ?");
        System.out.print(Nama + " : I'm ");
        Age = UserInput.nextInt();
        System.out.println(Nama + " : And How About You, " + Name1);
        System.out.println(Name1 + "   : Yeah, I'm " + Age + " As well ");
        System.out.println(Name1 + "   : So You must be a University Student, And which University mate?");
        System.out.print(Nama + " : I'm studying at ");
        NameUniversity = UserInput.next();
        University = UserInput.next();
        System.out.println(Name1 + "   : Waw that's really great, And What major Mate?");
        System.out.print(Nama + " : ");
        Subject = UserInput.next();
        System.out.println(Name1 + "   : Eeee, Sugoi Desu ne , would u like to help me to do my " + Subject + " Homework");
        System.out.print(Nama + " : ");
        Word1 = UserInput.next();
        Word2 = UserInput.next();
        Word3 = UserInput.next();
        System.out.println(Name1 + "   : Cheers Mate, oke I got three questions here :");
        System.out.println(Name1 + "   : first is Multiplication, second is Divition, third one is Modulo");
        System.out.print(Name1 + "   : 1. What is ");
        a = UserInput.nextInt();
        Operator = UserInput.next();
        b = UserInput.nextInt();
        result = a * b;
        System.out.println(Nama + " : Ah, It's " + result);
        System.out.print(Name1 + "   : 2. And What is ");
        a = UserInput.nextInt();
        Operator = UserInput.next();
        b = UserInput.nextInt();
        result =  a / b;
        System.out.println(Nama + " : It's " + result);
        System.out.print(Name1 + "   : 3. And Last one is ");
        a = UserInput.nextInt();
        Operator = UserInput.next();
        b = UserInput.nextInt();
        result = a % b;
        System.out.println(Nama + " : " + result);
        System.out.println(Name1 + "   : Oh yeah, I forgot that there's one last question more mate ");
        System.out.print(Name1 + "   : What's y = (x X 7) - x, if x is ");
        x = UserInput.nextInt();
        y = (x * 7) -  x;
        System.out.println(Nama + " : hmmm piece of cake, it's " + y);
        System.out.println(Name1 + "   : Katajikenai !!! " + Nama + "-Dono");
         System.out.print("\n");
        System.out.println("Aigh't Mates, I wanna tell u a story when I met my best Mate at the first, his name is " + Nama + " He's a student at " + NameUniversity + University + ", So he's so smart, Not just smart but He's really kind too. He helped me doing my " + Subject + " Homework. I'm so chuffed havin' a mate like Him");
    
       }
} 