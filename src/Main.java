import transport.Car;

public class Main {
    public static void main(String[] args) {
        Car ladaGranta = new Car(""," Granta",2015,"сборка в России","желтого цвета",1.7,"автоматическая коробка передач","sedan","м100мм","4","Летняя");
        Car audiA850LTDIQuattro = new Car("Audi "," A 8 50 L TDI quattro ",2020,"сборка в Германии","черный цвет",3.0,"автоматическая коробка передач","sedan","м101мм","4","Летняя");
        Car bMWZ8 = new Car("BMW ","Z8 ",2021,"сборка в Германии","черный цвет",3.0,"автоматическая коробка передач","sedan","м102мм","4","Летняя");
        Car kiaSportage = new Car("Kia","Sportage", 2018,"сборка в Южной Корее","цвет кузова — красный",2.4,"автоматическая коробка передач","sedan","м103мм","4","Летняя");
        Car hyundaiAvante = new Car("Hyundai "," Avante",2016,"сборка в Южной Корее","цвет кузова — оранжевый",1.6,"автоматическая коробка передач","sedan","м103мм","4","Летняя");
        Car nulL = new Car(null,null,-3333,null,null,-1.3,"автоматическая коробка передач","sedan","м104мм","4","Летняя");
        System.out.println(ladaGranta.toString());
        System.out.println(audiA850LTDIQuattro.toString());
        System.out.println(bMWZ8.toString());
        System.out.println(kiaSportage.toString());
        System.out.println(hyundaiAvante.toString());
        System.out.println(nulL.toString());


    }
}



