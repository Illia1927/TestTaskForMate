import java.util.Scanner;
public class Professor//класс
{
    Scanner innn = new Scanner(System.in);//В классе сканер определяем объект innn.

    public void privet()//Создание метода Класса
    {
        System.out.println("Добрый день, я профессор Магди, давайте узнаем что-то о вас, первокурсники! ");
        System.out.println("Как вы думаете, делить на 0 не можно(1) или да(2)?" +
                " Сделайте ваш выбор! Если да, то давайте поделим 2 на 0!");
        //Тут моя неудачная шутка :)
        int shutka =innn.nextInt();//Объявляем переменную shutka и присваеваем ей ранее соданый объект innn со считыанием строкового значения

        if(shutka == 1)//Условный оператор
        {
            System.out.println("Неудачная шутка, правда??");
            System.out.println(" ");
        }else// в другом случае
        {
            try {//Обработка ошибки с помощью блока TRY CATCH
                System.out.println(2/0);

            } catch (Exception e) {
                System.err.println("Делить на 0 не можна :D");

            }
    }

}
    public void pereklichka() {//Создание метода
        System.out.println("Сейчас мы проведем перекличку!");

        System.out.println(" ");//перенос строки
        //Дальше с помощью условных оператора проводим перекличку сутдентов
        System.out.println("Мороз Илья есть(1 - да, 2 - нет)?");
        int perek = innn.nextInt();
        if (perek == 1) {
            System.out.println("Отлично, идем дальше...");

        } else
            {
                System.out.println("Студент отсутствует - это очень плохо!");
            }
        System.out.println("Елена Белоус есть(1 - да, 2 - нет)?");
        int perekk = innn.nextInt();
        if (perekk == 1) {
            System.out.println("Хорошо, следующий...");

        } else
        {
            System.out.println("Студент отсутствует - это очень плохо!");
        }
        System.out.println("Александр Сойко есть(1 - да, 2 - нет)?");
        int perekkk = innn.nextInt();
        if (perekkk == 1) {
            System.out.println("Хорошо, молодцы...");

        } else
        {
            System.out.println("Студент отсутствует - ясно...");
        }
        System.out.println("Антон Шастун на месте(1 - да, 2 - нет)?");
        int  perekkkk = innn.nextInt();
        if (perekkkk == 1) {
            System.out.println(" ");

        } else
        {
            System.out.println("Студент отсутствует - понял...");
        }
        System.out.println("Алина Колонтаева(1 - да, 2 - нет)?");
        int  perekkkkk = innn.nextInt();
        if (perekkkkk == 1) {
            System.out.println("Здорово!");
            System.out.println(" ");
        } else
        {
            System.out.println("Студент отсутствует ...");
        }

    }
}
