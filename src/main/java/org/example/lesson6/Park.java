package org.example.lesson6;

public class Park {

    public class Attractions {
        private String name;
        private String work_schedule;
        private double price;

        public Attractions(String name, String work_schedule, double price) {
            this.name = name;
            this.work_schedule = work_schedule;
            this.price = price;
        }

        public void infoAttractions() {
            System.out.printf("Наименование аттракциона: " + name + "\n" + "График работы: " + work_schedule + "\n" + "Цена: " + price + "\n");
        }
    }

}
