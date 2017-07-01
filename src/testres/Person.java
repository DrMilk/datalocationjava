package testres;

/**
 * Created by Administrator on 2017/6/29.
 */

public class Person implements Comparable{
    private String name;
    private Integer weight;
    private Integer height;
    private Boolean sex;
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

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", height=" + height +
                ", sex=" + sex +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        if(o instanceof Person){
            Person person= (Person) o;
            return this.height.compareTo(person.height);
        }else {
            throw new ClassCastException("不能转为Person对象");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (name != null ? !name.equals(person.name) : person.name != null) return false;
        if (weight != null ? !weight.equals(person.weight) : person.weight != null) return false;
        if (height != null ? !height.equals(person.height) : person.height != null) return false;
        return sex != null ? sex.equals(person.sex) : person.sex == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (weight != null ? weight.hashCode() : 0);
        result = 31 * result + (height != null ? height.hashCode() : 0);
        result = 31 * result + (sex != null ? sex.hashCode() : 0);
        return result;
    }
}
