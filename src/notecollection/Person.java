package notecollection;

/**
 * Created by Administrator on 2017/6/29.
 */

public class Person {
    private String name;
    private int weight;
    private int height;
    private boolean sex;
    public Person(){}
    public Person(String name, int weight, int height, boolean sex) {
        this.name = name;
        this.weight = weight;
        this.height = height;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }
}
