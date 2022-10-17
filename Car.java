public class Car {
    private String brand;
    private String model;
    private float engineVolume;
    private String color;
    private int productionYear;
    private String productionCountry;

    public Car (String brand, String model, float engineVolume, String color, int productionYear, String productionCountry) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.color = color;
        this.productionYear = productionYear;
        this.productionCountry = productionCountry;
    }

    public String getBrand () {
        return brand;
    }

    public String getModel () {
        return model;
    }

    public float getEngineVolume () {
        return engineVolume;
    }

    public String getColor () {
        return color;
    }

    public int getProductionYear () {
        return productionYear;
    }

    public String getProductionCountry () {
        return productionCountry;
    }

    public void informationOfTheCar () {
        System.out.println(brand + " " + model + ", " + productionYear + " год выпуска" + ", сборка - " + productionCountry + ", цвет кузова - " + color + ", объем двигателя - " + engineVolume + " л.");
    }
}
