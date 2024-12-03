package org.example.lesson6;

public class Park {

    public class Attractions {
        public String name;
        public String work_schedule;
        public double price;

        public Attractions() {
            this.name = name;
            this.work_schedule = work_schedule;
            this.price = price;
        }

        public void infoAttractions() {
            System.out.printf("//Третье задание: " + "\n" + "Наименование аттракциона: " + name + "\n" + "График работы: " + work_schedule + "\n" + "Цена: " + price + "\n");
        }
    }

}
