import java.util.Scanner;
public class Main//Главный класс
{
    public static void main(String[] args)
    {
        Scanner ir = new Scanner(System.in);//В классе сканер определяем объект ir.
        System.out.println("Здравствуйте, в наш университет добавилась новая группа."+
        " Давайте с нею знакомиться!");

        System.out.println(" ");//Перенос строки

        Professor professor = new Professor();//Выделение памяти и вызов класса Professor
        professor.privet();//Обращение к методу класса (Тут просто приветствие)


        System.out.println("Сейчас я узнаю название вашей группы : ");
        Group group=new Group();//Выделение памяти и вызов класса Group
        group.nameofgtoup();//Обращение к методу класса для вывода названия группы


        System.out.println("Теперь мне нужен список вашей группы!");

        System.out.println(" ");//Перенос строки

        System.out.println("У вас есть список( 1 - да / 2 - нет ) ?");//Подальшее общение професора со студентами
        int spisok = ir.nextInt();//Объявляем переменную spisok и присваеваем ей ранее соданый объект ir со считыанием интового значения
        if(spisok == 1)// Используется условный оператор - если TRUE то выполняется условее
        {
            Student student = new Student();// Выделение памяти и вызов класса Student
            student.showstud(); //обращение к методу showstud
        }else// в другом случае, если условее = FOLCE
        {
            System.out.println("Плохо!");
        }

        System.out.println(" ");//Перенос строки

        professor.pereklichka();//Обращение к методу pereklichka класса Professor


        System.out.println("Отлично, приятно познакомиться!");

        System.out.println("Теперь выберем старосту : ");

        Starosta starosta = new Starosta();// Выделение памяти и вызов класса Starosta
        starosta.vibor();//обращение к методу vibor

        System.out.println("Шикарно, добро пожаловать!");
    }

    }

