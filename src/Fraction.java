/*
Вариант В
Реализовать методы сложения, вычитания, умножения и деления объектов (для
тех классов, объекты которых могут поддерживать арифметические действия).
1. Определить класс Дробь (Рациональная Дробь) в виде пары чисел m и n.
Объявить и инициализировать массив из k дробей, ввести/вывести значения для массива дробей. Создать массив/список/множество объектов и передать его в метод, который изменяет каждый элемент массива с четным
индексом путем добавления следующего за ним элемента


cделал 1 вариант тк у меня 11 вариант а там всего 10.
Задание B
*/




    public class Fraction {
        private int numerator;
        private int denominator;


        public Fraction() {
            this.numerator = 0;
            this.denominator = 1;
        }

        public Fraction(int numerator, int denominator) {
            if (denominator == 0) {
                throw new IllegalArgumentException("Denominator cannot be zero.");
            }
            this.numerator = numerator;
            this.denominator = denominator;
            simplify();
        }


        private void simplify() {
            int gcd = gcd(numerator, denominator);
            this.numerator /= gcd;
            this.denominator /= gcd;
        }


        private int gcd(int a, int b) {
            return b == 0 ? a : gcd(b, a % b);
        }


        public Fraction add(Fraction other) {
            int newNumerator = this.numerator * other.denominator + other.numerator * this.denominator;
            int newDenominator = this.denominator * other.denominator;
            return new Fraction(newNumerator, newDenominator);
        }


        public Fraction subtract(Fraction other) {
            int newNumerator = this.numerator * other.denominator - other.numerator * this.denominator;
            int newDenominator = this.denominator * other.denominator;
            return new Fraction(newNumerator, newDenominator);
        }


        public Fraction multiply(Fraction other) {
            int newNumerator = this.numerator * other.numerator;
            int newDenominator = this.denominator * other.denominator;
            return new Fraction(newNumerator, newDenominator);
        }


        public Fraction divide(Fraction other) {
            if (other.numerator == 0) {
                throw new ArithmeticException("Cannot divide by zero.");
            }
            int newNumerator = this.numerator * other.denominator;
            int newDenominator = this.denominator * other.numerator;
            return new Fraction(newNumerator, newDenominator);
        }


        @Override
        public String toString() {
            return numerator + "/" + denominator;
        }


        public int getNumerator() {
            return numerator;
        }

        public void setNumerator(int numerator) {
            this.numerator = numerator;
            simplify();
        }

        public int getDenominator() {
            return denominator;
        }

        public void setDenominator(int denominator) {
            if (denominator == 0) {
                throw new IllegalArgumentException("Denominator cannot be zero.");
            }
            this.denominator = denominator;
            simplify();
        }
    }


