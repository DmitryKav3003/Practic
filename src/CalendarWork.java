import java.text.DateFormat;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.*;

public class CalendarWork {
        public static void main(String[] args) {
            Calendar calendar = Calendar.getInstance();
            //значение месяца начинается с 0, чтобы не путаться, можно ввести месяц константой через Calendar
            System.out.println(calendar.getTime());

            calendar.set(Calendar.YEAR, 2017);
            calendar.set(Calendar.MONTH, 0);
            calendar.set(Calendar.DAY_OF_MONTH, 25);
            calendar.set(Calendar.HOUR_OF_DAY, 19);
            calendar.set(Calendar.MINUTE, 42);
            calendar.set(Calendar.SECOND, 12);

            System.out.println(calendar.getTime());


            calendar.add(Calendar.YEAR, -2);//чтобы отнять значение - нужно передать отрицательное число
            System.out.println(calendar.getTime());

            calendar.roll(Calendar.DAY_OF_MONTH, -2);
            System.out.println(calendar.getTime());    //чтобы остальные поля приотнятии или сложении не менялись
            //используем метод roll

            //с помощью метода get
            System.out.println("Mounth: " + calendar.get(Calendar.MONTH)); //можно выводить значения по отдельности

/*
Вывод даты с эрой, до или после ERA
            calendar.set(calendar.ERA, GregorianCalendar.BC);
            SimpleDateFormat df = new SimpleDateFormat("dd MMM yyy GG");  //GG отвечает именно за эру
            System.out.println(df.format(calendar.getTime()));

            https://javarush.ru/groups/posts/1941-kak-ne-poterjatjhsja-vo-vremeni--datetime-i-calendar

 */

            calendar.set(2020,3,23,12,14,54);
            System.out.println("полнолуние было" +" " + calendar.getTime());



        }
    }

