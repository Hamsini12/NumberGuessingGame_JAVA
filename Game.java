import java.util.Scanner;
public class Game 
{
public static void guessingNumberGame1()
{
Scanner read=new Scanner(System.in);
int n=1+(int)(100* Math.random());
int K = 7;
int c=K;
int i, g1;
System.out.println();
System.out.println();
System.out.println();
System.out.println("___ROUND::1___");
System.out.println();
System.out.println(":::YOU GOT "+K*100+" POINTS FOR PLAYING THIS ROUND:::");
System.out.println("You have to choose a number between 1 to 100.");
System.out.println("You have to guess within "+K+" attempts.");
for (i = 0; i < K; i++) 
{
System.out.println("You have");
System.out.println("/"+"\\"+"_"+"/"+"\\");
System.out.println("(. .)");
System.out.println("( "+c+" )"+"chances to guess!");
System.out.println("_______________________");
System.out.println("Guess the number:");
g1=read.nextInt();
if (n == g1) 
{
System.out.println("Congratulations! Your guess is right.");
System.out.println("Now you have"+((c*100)+50)+" points!");
break;
}
else if (n > g1 && i != K - 1) 
{
System.out.println("The number is "+ "greater than " + g1);
c=c-1;
}
else if (n < g1 && i != K - 1) 
{
System.out.println("The number is"+ " less than " + g1);
c=c-1;
}
} 
if (i == K) 
{
System.out.println("You have exhausted "+K+" trials.");
System.out.println("The number was " + n);
System.out.println(" Oops! You lost all your points");
}
}
public static void guessingNumberGame2()
{
Scanner read=new Scanner(System.in);
int o=1+(int)(100* Math.random());
int L=5;
int d=L;
int j,g2;
System.out.println();
System.out.println();
System.out.println();
System.out.println("___ROUND::2___");
System.out.println();
System.out.println(":::YOU GOT "+L*100+" POINTS FOR PLAYING THIS ROUND:::");
System.out.println("You have to choose a number between 1 to 100.");
System.out.println("Guess have to guess within "+L+" trials.");
for (j = 0; j < L; j++) 
{
System.out.println("You have");
System.out.println("/"+"\\"+"_"+"/"+"\\");
System.out.println("(. .)");
System.out.println("( "+d+" )"+"chances to guess now!");
System.out.println("_______________________");
System.out.println("Guess the number:");
g2=read.nextInt();
if (o == g2) 
{
System.out.println("Congratulations! Your guess is right.");
System.out.println("Now you have"+((d*100)+50)+" points!");
break;
}
else if (o > g2 && j != L - 1) 
{
System.out.println("The number is "+ "greater than " + g2);
d=d-1;
}
else if (o < g2 && j != L - 1) 
{
System.out.println("The number is"+ " less than " + g2);
d=d-1;
}
} 
if (j == L) 
{
System.out.println("You have exhausted "+L+" trials.");
System.out.println("The number was " + o);
System.out.println(" Oops! You lost all your points");
}
}
public static void guessingNumberGame3()
{
Scanner read=new Scanner(System.in);
int p=1+(int)(100* Math.random());
int M=3;
int e=M;
int k,g3;
System.out.println();
System.out.println();
System.out.println();
System.out.println("___ROUND::3___");
System.out.println();
System.out.println(":::YOU GOT "+M*100+" POINTS FOR PLAYING THIS ROUND:::");
System.out.println("You have to choose a number between 1 to 100.");
System.out.println("You have to guess within "+M+" attempts.");
for (k = 0; k < M; k++) 
{
System.out.println("You have");
System.out.println("/"+"\\"+"_"+"/"+"\\");
System.out.println("(. .)");
System.out.println("( "+e+" )"+"chances to guess now!");
System.out.println("_______________________");
System.out.println("Guess the number:");
g3=read.nextInt();
if (p == g3) 
{
System.out.println("Congratulations! Your guess is right.");
System.out.println("Now you have"+((e*100)+50)+" points!");
break;
}
else if (p > g3 && k != M - 1) 
{
System.out.println("The number is "+ "greater than " + g3);
e=e-1;
}
else if (p < g3 && k != M - 1) 
{
System.out.println("The number is"+ " less than " + g3);
e=e-1;
}
} 
if (k == M) 
{
System.out.println("You have exhausted "+M+" trials.");
System.out.println("The number was " + p);
System.out.println(" Oops! You lost all your points");
}
}
public static void main(String arg[])
{
        guessingNumberGame1();
        guessingNumberGame2();
        guessingNumberGame3();
}
}