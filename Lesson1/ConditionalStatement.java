public class ConditionalStatement

{
	
public static void main (String [] args)


{


int age = 33;
char sex = 'm';
float height = 1.83f;
char firstNameLetter = 'P';


if(age > 20) {
    System.out.println("Вы взрослый человек");
}

if(sex=='m') {
    System.out.println("Вы - мужчина");

if(sex=='f') {
    System.out.println("Вы - женщина");
}

if(height < 1.80) {
    System.out.println("Вы - невысокий");
}  else {
    System.out.println("Вы - высокий");
}

if (firstNameLetter == ‘М’) {
   System.out.println("Ващш имя начинается с буквы ‘М’");
} else if (firstNameLetter == ‘И’) {
     System.out.println("Ващш имя начинается с буквы ‘М’");
} else {
     System.out.println("Ващш имя начинается с другой буквы");
} 



}



}