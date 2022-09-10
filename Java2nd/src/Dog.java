import java.util.ArrayList;

//4. Разработайте и реализуйте класс Dog (Собака), поля класса описывают
//        кличку и возраст собаки. Необходимо выполнить следующие действия:
//        определить конструктор собаки, чтобы принять и инициализировать данные
//        экземпляра., включить стандартные методы  (аксессоры) для получения и
//        установки для имени и возраста, включить метод для перевода возраста
//        собаки в "человеческий " возраст (возраст семь раз собаки), включите
//        метод ToString, который возвращает описание экземпляра собаки в виде строки.
//        Создание класса тестера под названием ПитомникСобак, реализует массив собак
//        и основной метод этого класса позволяет добавить в него несколько объектов собаки.
public class Dog {

    private  String dogName;
    private  int dogAge;

    public void setAge(int age){
        this.dogAge = age;
    } //Сеттер для возраста
    public void setName(String name){
        this.dogName = name;
    } //Сеттер для имени

    public String getName(){
        return this.dogName;
    } //Геттер для имени
    public int getAge(){
        return this.dogAge;
    } //Геттер для возраста

    public int humanAgeFun(){
        return this.dogAge * 7;
    } //Возврат эквивалетного возраста человека

    public Dog(String name, int age){ //Параметризированный конструктор
        setAge(age);
        setName(name);
    }

    public String toString(){ //Метод toString
        return "Age: " + this.dogAge + "; Name: " + this.dogName;
    }
}

class DogKennel{ //Класс-тестер
    ArrayList<Dog> kennel = new ArrayList<Dog>();
    void addDog(Dog[] dogs){
        for (Dog dog : dogs) {
            this.kennel.add(dog);
        }
    }
}
