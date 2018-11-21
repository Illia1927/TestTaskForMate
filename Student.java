public class Student//Класс
{

    public void showstud()//Метод класса
    {
        String [] studName= new String[5];//Массив строк
        //Заполненый массив по индексам элементов
        studName[0]= "Илья Мороз, ";
        studName[1]= "Елена Белоус, ";
        studName[2]= "Александр Сойко, ";
        studName[3]= "Антон Шастун, ";
        studName[4]= "Алина Колонтаева. ";
        System.out.println("Список студентов : ");//с помощью цыкличного оператора FOR заполняем массив
        for(int i=0;i<studName.length;i++)
        {
            System.out.println(studName[i]);//Вывод массива в консоль

        }
    }

}
