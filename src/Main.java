import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        Var11 bus1 = new Var11("Иванов", "Иван Иванович", 101, 5, "Volvo", 2015, 150000);
        Var11 bus2 = new Var11("Петров", "Петр Петрович", 102, 7, "Mercedes", 2018, 100000);
        Var11 bus3 = new Var11("Сидоров", "Сергей Сергеевич", 103, 5, "Scania", 2012, 200000);
        Var11 bus4 = new Var11("Кузнецов", "Андрей Андреевич", 104, 8, "MAN", 2020, 50000);
        Var11 bus5 = new Var11("Смирнов", "Алексей Алексеевич", 105, 5, "DAF", 2016, 120000);

        bus2.getDataByInfo();




        List<Var11B> fractions = new ArrayList<>();
        fractions.add(new Var11B(1, 2)); // 1/2
        fractions.add(new Var11B(1, 3)); // 1/3
        fractions.add(new Var11B(2, 5)); // 2/5
        fractions.add(new Var11B(3, 4)); // 3/4
        fractions.add(new Var11B(7, 8)); // 7/8


        System.out.println("Исходный массив дробей:");
        fractions.forEach(System.out::println);

        modifyFractionArray(fractions);

        System.out.println("\nМассив дробей после изменений:");
        fractions.forEach(System.out::println);
        List<Var11C> var11CS = new ArrayList<>();
        var11CS.add(new Var11C(1, 2, 3));
        var11CS.add(new Var11C(4, 5, 6));
        var11CS.add(new Var11C(7, 8, 9));
        var11CS.add(new Var11C(10, 11, 12));

        System.out.println("Исходные векторы:");
        var11CS.forEach(System.out::println);

        var11CS.get(0).increment();
        var11CS.get(1).decrement();
        System.out.println("\nПосле инкремента первого и декремента второго вектора:");
        var11CS.forEach(System.out::println);

        System.out.println("\nСкалярное произведение и углы между парами векторов:");
        for (int i = 0; i < var11CS.size() - 1; i++) {
            for (int j = i + 1; j < var11CS.size(); j++) {
                Var11C v1 = var11CS.get(i);
                Var11C v2 = var11CS.get(j);

                double dotProduct = Var11C.dotProduct(v1, v2);
                double angle = Math.toDegrees(Var11C.angleBetween(v1, v2));
                System.out.printf("Векторы %s и %s:\n", v1, v2);
                System.out.printf("- Скалярное произведение: %.2f\n", dotProduct);
                System.out.printf("- Угол между ними: %.2f°\n", angle);
            }
        }
    }

    public static void modifyFractionArray(List<Var11B> fractions) {
        for (int i = 0; i < fractions.size() - 1; i += 2) {
            fractions.set(i, fractions.get(i).add(fractions.get(i + 1)));
        }
    }











    }


