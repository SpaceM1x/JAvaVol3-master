
import java.util.ArrayList;
import java.util.Scanner;

public class Var11 {

           /*

       Создать классы, спецификации которых приведены ниже. Определить конструкторы и методы setТип(), getТип(), toString(). Определить дополнительно
        методы в классе, создающем массив объектов. Задать критерий выбора данных
        и вывести эти данные на консоль. В каждом классе, обладающем информацией,
                должно быть объявлено несколько конструкторов.


                11.Bus: Фамилия и инициалы водителя, Номер автобуса, Номер маршрута,
Марка, Год начала эксплуатации, Пробег.
Создать массив объектов. Вывести:
a) список автобусов для заданного номера маршрута;
b) список автобусов, которые эксплуатируются больше заданного срока;
c) список автобусов, пробег у которых больше заданного расстояния.
        */

    private String S_Name;
    private String FIO;

    private int BusNum;
    private int RouteNum;
    
    private String Mark;

    private int StartYear;

    private int Probeg;

    private static ArrayList<Var11> list = new ArrayList<>();



    public void getDataByInfo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Выберите параметр для Поиска:");
        System.out.println("1) Имя\n2) ФИО\n3) Номер автобуса\n4) Марка\n5) Год начала эксплуатации\n6) Пробег");
        int choice = sc.nextInt();
        sc.nextLine();

        System.out.println("Введите искомое значение:");
        String parameter = sc.nextLine();

        for (Var11 var11 : list) {
            boolean match = switch (choice) {
                case 1 -> var11.getS_Name().equals(parameter);
                case 2 -> var11.getFIO().equals(parameter);
                case 3 -> var11.getBusNum() == Integer.parseInt(parameter);
                case 4 -> var11.getMark().equals(parameter);
                case 5 -> var11.getStartYear() == Integer.parseInt(parameter);
                case 6 -> var11.getProbeg() == Integer.parseInt(parameter);
                default -> false;
            };
            if (match) {
                System.out.println(var11);
            }
        }
    }

    public Var11(){
        this.S_Name = "";
        this.FIO = "";
        this.BusNum = 0;
        this.RouteNum = 0;
        this.Mark = "";
        this.StartYear = 0;
        this.Probeg = 0;
        list.add(this);
    }


    public Var11(String S_Name, String FIO, int BusNum, int RouteNum, String Mark, int StartYear, int Probeg){
        this.S_Name = S_Name;
        this.FIO = FIO;
        this.BusNum = BusNum;
        this.RouteNum = RouteNum;
        this.Mark = Mark;
        this.StartYear = StartYear;
        this.Probeg = Probeg;
        list.add(this);
    }



    @Override
    public String toString() {
        return
                " Имя: " + S_Name + '\'' +
                " ФИО: " + FIO + '\'' +
                " Номер автобуса: " + BusNum +
                " Номер Маршрута: " + RouteNum +
                " Марка: " + Mark + '\'' +
                " Год начала эксплуатации: " + StartYear +
                " Пробег: " + Probeg + '\'' +
                '}';
    }

    public String getS_Name() {
        return S_Name;
    }

    public void setS_Name(String s_Name) {
        S_Name = s_Name;
    }

    public String getFIO() {
        return FIO;
    }

    public void setFIO(String FIO) {
        this.FIO = FIO;
    }

    public int getBusNum() {
        return BusNum;
    }

    public void setBusNum(int busNum) {
        BusNum = busNum;
    }

    public int getRouteNum() {
        return RouteNum;
    }

    public void setRouteNum(int routeNum) {
        RouteNum = routeNum;
    }

    public String getMark() {
        return Mark;
    }

    public void setMark(String mark) {
        Mark = mark;
    }

    public int getStartYear() {
        return StartYear;
    }

    public void setStartYear(int startYear) {
        StartYear = startYear;
    }

    public int getProbeg() {
        return Probeg;
    }

    public void setProbeg(int probeg) {
        Probeg = probeg;
    }
}
