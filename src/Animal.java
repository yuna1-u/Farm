public abstract class Animal {
    private String weight;
    private String age;
    private String gender;
    private String nikeName;
    private String color;

    public Animal() {
    }

    public Animal(String weight, String age, String gender, String nikeName) {
        this.weight = weight;
        this.age = age;
        this.gender = gender;
        this.nikeName = nikeName;
    }

    public Animal(String weight, String age, String gender, String nikeName, String color) {
        this.weight = weight;
        this.age = age;
        this.gender = gender;
        this.nikeName = nikeName;
        this.color = color;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNikeName() {
        return nikeName;
    }

    public void setNikeName(String nikeName) {
        this.nikeName = nikeName;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "weight='" + weight + '\'' +
                ", age='" + age + '\'' +
                ", gender='" + gender + '\'' +
                ", nikeName='" + nikeName + '\'' +
                ", color='" + color + '\'' +
                '}' + '\n';
    }
}
