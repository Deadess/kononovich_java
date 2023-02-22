import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in,  "Cp866");

        boolean boo = true;
        while(boo){
            System.out.println("\nВведите номер задания (1-4) или (0) для выхода:");
            int input = s.nextInt();
            
            switch(input){
                case 0:
                    boo = false;
                    break;
                case 1:
                    System.out.println("\nВведите число:");
                    int t1_input = s.nextInt();
                    Task1(t1_input);
                    break;
                case 2:
                    System.out.println("\nВведите имя:");
                    String t2_input = s.next();
                    Task2(t2_input);
                    break;
                case 3:
                    System.out.println("\nВведите длину массива:");
                    int len = s.nextInt();

                    int[] mas = new int[len];
                    //enter len elements
                    
                    for(int i = 0; i < len; i++){
                        System.out.println("\nВведите "+ (i+1) +"-e число:");
                        mas[i] = s.nextInt(); 
                    }

                    Task3(mas);
                    break;
                case 4:
                    Task4();
                    break;
                default: 
                    System.out.println("\nНеверный номер задания");
            }
        }
        s.close();    
    }

    //task1
    public static void Task1(int num){
        if(num > 7){
            System.out.println("Привет");
        }
    }
    //task2 
    public static void Task2(String name){
        if(name.equals("Вячеслав")) {
            System.out.println("Привет, " + name);
        }
        else {
            System.out.println("Нет такого имени");
        }
    }

    //task3
    public static void Task3(int[] mas){
        System.out.println("Числа кратные 3-м: ");
        int count = 0;
        for(int i = 0; i < mas.length; i++){
            if(mas[i] % 3 == 0){
                System.out.print(mas[i] + " ");
                count++;
            }
        }
        if(count == 0) System.out.print("n/a");
    }
    //task4
    public static void Task4(){
        System.out.println("\nДана скобочная последовательность: [((())()(())]]" +
                            "\nМожно ли считать эту последовательность правильной?" +
                            "\n\nНет, нельзя. Для того чтобы исправить данную последовательность, необъодимо заменить заменить следующую скобку, после открывающей квадратной, на такую же квадратную " +
                            "\n[[(())()(())]]");
    }
}

