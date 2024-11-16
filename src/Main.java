import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        Bus bus1 = new Bus("Иванов", "Иван Иванович", 101, 5, "Volvo", 2015, 150000);
        Bus bus2 = new Bus("Петров", "Петр Петрович", 102, 7, "Mercedes", 2018, 100000);
        Bus bus3 = new Bus("Сидоров", "Сергей Сергеевич", 103, 5, "Scania", 2012, 200000);
        Bus bus4 = new Bus("Кузнецов", "Андрей Андреевич", 104, 8, "MAN", 2020, 50000);
        Bus bus5 = new Bus("Смирнов", "Алексей Алексеевич", 105, 5, "DAF", 2016, 120000);

        bus2.getDataByInfo();




        List<Fraction> fractions = new ArrayList<>();
        fractions.add(new Fraction(1, 2)); // 1/2
        fractions.add(new Fraction(1, 3)); // 1/3
        fractions.add(new Fraction(2, 5)); // 2/5
        fractions.add(new Fraction(3, 4)); // 3/4
        fractions.add(new Fraction(7, 8)); // 7/8


        System.out.println("Исходный массив дробей:");
        fractions.forEach(System.out::println);

        modifyFractionArray(fractions);

        System.out.println("\nМассив дробей после изменений:");
        fractions.forEach(System.out::println);
        List<Vector> vectors = new ArrayList<>();
        vectors.add(new Vector(1, 2, 3));
        vectors.add(new Vector(4, 5, 6));
        vectors.add(new Vector(7, 8, 9));
        vectors.add(new Vector(10, 11, 12));

        System.out.println("Исходные векторы:");
        vectors.forEach(System.out::println);

        vectors.get(0).increment();
        vectors.get(1).decrement();
        System.out.println("\nПосле инкремента первого и декремента второго вектора:");
        vectors.forEach(System.out::println);

        System.out.println("\nСкалярное произведение и углы между парами векторов:");
        for (int i = 0; i < vectors.size() - 1; i++) {
            for (int j = i + 1; j < vectors.size(); j++) {
                Vector v1 = vectors.get(i);
                Vector v2 = vectors.get(j);

                double dotProduct = Vector.dotProduct(v1, v2);
                double angle = Math.toDegrees(Vector.angleBetween(v1, v2));
                System.out.printf("Векторы %s и %s:\n", v1, v2);
                System.out.printf("- Скалярное произведение: %.2f\n", dotProduct);
                System.out.printf("- Угол между ними: %.2f°\n", angle);
            }
        }
    }

    public static void modifyFractionArray(List<Fraction> fractions) {
        for (int i = 0; i < fractions.size() - 1; i += 2) {
            fractions.set(i, fractions.get(i).add(fractions.get(i + 1)));
        }
    }











    }


