/**
 * Created by Srudent-26 on 07.03.2017.
 */
public class WorkBook1_14 {
    public static void main(String[] args) {
        char c='A';
        switch(c){
            case 'A':
                System.out.println(c+" - Отлично!");
                break;
            case 'B':
                System.out.println(c+" - Хорошо поработали!");
                break;
            case 'C':
                System.out.println(c+" - Хорошо поработали!");
                break;
            case 'D':
                System.out.println(c+" - Неплохо! Пройдено!");
                break;
            case 'E':
                System.out.println(c+" - Пройдено!");
                break;
            case 'F':
                System.out.println(c+" - Следующая пересдача - черезе 4 дня!");
                break;
            default:
                System.out.println("Введена не верная оценка!");
        }
    }
}
