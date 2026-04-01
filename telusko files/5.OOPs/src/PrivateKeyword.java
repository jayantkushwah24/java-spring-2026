public class PrivateKeyword {
    public static void main(String[] args) {
        CarBrand car = new CarBrand();
        car.setCarName("skoda");
        System.out.println(car.getCarName());
    }
}

class CarBrand{
    private String carName;

    void setCarName(String name){
        this.carName = name;
    }

    String getCarName(){
        return  carName;
    }
}
