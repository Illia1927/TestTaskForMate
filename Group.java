import java.util.Scanner;
public class Group//класс
{
    Scanner inn = new Scanner(System.in);//В классе сканер определяем объект inn.
    public void nameofgtoup()//создание метода класса
    {
    System.out.println("Введите название вашей группы : ");
    String namegroup = inn.nextLine();//Объявляем переменную namegroup и присваеваем ей ранее соданый объект inn со считыанием строкового значения
    System.out.println("Рады вам приветствовать группа - "+namegroup);
    }

}
