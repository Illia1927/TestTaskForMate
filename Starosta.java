import java.util.Scanner;
public class Starosta//Класс
{
    Scanner in = new Scanner(System.in);//В классе сканер определяем объект in.
    public void vibor()//Метод класса
    {
        System.out.println("Сделайте выбор старосты по номеру в списке от 1 до 5 : ");
        int starostaName =in.nextInt();//Объявляем переменную spisok и присваеваем ей ранее соданый объект in со считыанием интового значения
        switch (starostaName)//С помощью оператора выбора SWITCH мы выбираем старосту по номеру.
        {
            case 1:
                System.out.println("Старостой назначен стдент Илья Мороз!");
                break;// Выход из программы если мы выбрали 1 и так далее
            case 2:
                System.out.println("Старостой назначен стдент Елена Белоус!");
                break;
            case 3:
                System.out.println("Старостой назначен стдент Александр Сойко!");
                break;
            case 4:
                System.out.println("Старостой назначен стдент Антон Шастун!");
                break;
            case 5:
                System.out.println("Старостой назначен стдент Алина Колонтаева!");
                break;
        }
    }

}
