package bay.aqa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    public static int array[] = {3, 5, 2, 9, 27};
    public static void whenSevenReturnHello() {
        try {
            //Создаём объект BufferReader для ввода значений
            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(System.in));
            System.out.print("Введите число: ");
            int enteredNum = Integer.parseInt(reader.readLine());
            //Используя тернарный оператор ? выводим соответсвующий условий ответ
            System.out.println(enteredNum == 7 ? "Привет" : "Это не семь");
        } catch (Exception e) {
            System.out.println("Wrong entered value type");
        }
    }

    public static void whenViacheslavReturnHello() {
        try {
            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(System.in));
            System.out.print("Введите имя: ");
            String enteredName = reader.readLine();
            //Ананлогично предыдущему заданию, для сравнения строк используем CompareTo
            System.out.println(enteredName.compareTo("Вячеслав") == 0 ? "Привет, Вячеслав" : "Нет такого имени");
        } catch (Exception e) {
            System.out.println("Wrong entered value type");
        }
    }

    public static void elementMultipleThree(int[] array)  {
        //{3, 5, 2, 9, 27} array
        for (int elem :
                array) {
            //Используем деление по модулю %, для определения элементов которые делятся на 3
            if (elem % 3 == 0) {
                System.out.println(elem);
            }
        }
    }

    //    Дана скобочная последовательность: [((())()(())]]
    //        - Можно ли считать эту последовательность правильной?
    //        - Если ответ на предыдущий вопрос “нет”, то что необходимо в ней изменить, чтоб она стала правильной?
    //    Answer: Последовательность ошибочна
    //    Answer: Чтобы последовательность была верной нужно уровнять количество левых и правых скобок по их типу
    //    P.S. количество скобок по типам будет выведено в окне консоли при выполнении программы
    public static void checkingBracketSequence() {
        String bracketSequence = "[((())()(())]]";
        int leftBracket = 0, rightBracket = 0, leftSquareBracket = 0, rightSquareBracket = 0;
        //посимвольно пройдём строку и проверим сколько каких скобок
        for (char symbol :
                bracketSequence.toCharArray()) {
            switch (symbol) {
                case '[': {
                    leftSquareBracket++;
                    break;
                }
                case ']': {
                    rightSquareBracket++;
                    break;
                }
                case '(': {
                    leftBracket++;
                    break;
                }
                case ')': {
                    rightBracket++;
                    break;
                }
            }
        }
        System.out.println("BracketTypeCount:");

        System.out.println("leftBracket: " + leftBracket);
        System.out.println("rightBracket: " + rightBracket);
        System.out.println("leftSquareBracket: " + leftSquareBracket);
        System.out.println("rightSquareBracket: " + rightSquareBracket);

        if (leftBracket != rightBracket || leftSquareBracket != rightSquareBracket) {
            System.out.println("Wrong sequence");
        } else {
            System.out.println("Correct sequence");
        }
    }


    public static void main(String[] args) {
        whenSevenReturnHello();
        whenViacheslavReturnHello();
        elementMultipleThree(array);
        checkingBracketSequence();
    }
}
