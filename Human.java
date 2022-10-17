public class Human {
    private final String name;
    private int age;
    private String cityOfLife;
    private String position;

    public int yearOfBirth () {
        age = 2022 - age;
        return age;
    }
    public Human (String name, int age, String cityOfLife, String position) {
        this.name = name;
        this.age = age;
        this.cityOfLife = cityOfLife;
        this.position = position;
    }

    private String getName () {
        return name;
    }

    private int getAge () {
        return age;
    }

    public String getCityOfLife () {
        return cityOfLife;
    }

    public String getPosition () {
        return position;
    }

    public void informationOgHuman () {
        System.out.println("Привет! Меня зовут " + name + ". Я из города " + cityOfLife + ". Я родился (ась) в " + yearOfBirth() + " году. Я работаю на должности " + position + ". Будем знакомы!");
    }

}
