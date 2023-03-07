import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        /**Задание 1
         //Напишите реализации функционального интерфейса
         //Predicate
         //, которые проверяют, является ли число положительным. Если число положительное, то предикат должен возвращать
         //true
         //, в противном случае —
         //false
         //Реализуйте
         //Predicate
         // в двух вариантах:
         //
         //через анонимный класс,
         //через лямбду.*/
        System.out.println("Задание 1");
        List<Integer> number = new ArrayList<>();
        number.add(1);
        number.add(3);
        number.add(-3);
        number.add(-4);
        number.add(3);

        Predicate<Integer> predicate = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer <= 0;
            }
        };
        for (Integer n : number) {
            System.out.println(predicate.test(n));
        }
        Predicate<Integer> predicate1 = (t -> t < 0);
        {
            ;
        }
        ;
        number.removeIf(predicate1);
        for (Integer h : number) {
            System.out.println(predicate1.test(h));
        }

/**Задание 2
 //Создайте функциональный интерфейс
 //Consumer
 //, который принимает на вход имя человека и выводит в консоль приветствие в его адрес.
 //
 //Реализуйте его в двух вариантах: через анонимный класс и через лямбду.*/
        System.out.println("Задание 2");
        Person person1 = new Person("Petr", 20);
        Person personKirill = new Person("Kirill", 33);
        Person personAlex = new Person("Alex", 40);

        List<Person> people = new ArrayList<>();
        people.add(person1);
        people.add(personKirill);
        people.add(personAlex);

        Consumer<Person> consumer = new Consumer<Person>() {
            @Override
            public void greetings(Person person) {
                System.out.println("Доброго дня уважаемый " + person.getName());
            }
        };
        for (Person m : people) {
            consumer.greetings(m);
        }

        Consumer<Person> personConsumer = (person -> {
            System.out.println("Доброго дня уважаемый " + person.getName());
        });

        for (Person m : people) {
            personConsumer.greetings(m);
        }

        /**
         * Задание 3
         * Реализуйте функциональный интерфейс
         * Function
         * , который принимает на вход вещественное число типа
         * Double
         * , а возвращает его округленный вариант типа
         * Long
         * .
         *
         * Реализуйте его в двух вариантах: через анонимный класс и через лямбду.
         */
        System.out.println("Задание 3");
        Function<Double, Long> function = new Function<Double, Long>() {
            @Override
            public Long apply(Double aDouble) {
                return aDouble.longValue();
            }
        };

        List<Double> doubles = new ArrayList<>();
        doubles.add(2000.289);
        doubles.add(1.39);
        doubles.add(1.69);
        for (Double d : doubles) {
            System.out.println(function.apply(d));
        }

        Function<Double, Long> function1 = (aDouble -> {
            return aDouble.longValue();
        });
        for (Double d1 : doubles) {
            System.out.println(function1.apply(d1));
        }
        System.out.println("Задание 4");

        Supplier <Integer> supplier = new Supplier<Integer>() {
            @Override
            public Integer get() {
                return (int) (Math.random() * 100);
            }
        };
        System.out.println(supplier.get());
        Supplier <Integer> supplier1 = () -> {
            return (int)(Math.random()*100);
        };
    }

}

