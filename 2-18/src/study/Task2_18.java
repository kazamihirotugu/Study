package study;

public class Task2_18 {
    public static void main(String[] args) {

        // 問② Personクラスをインスタンス化し、setterで値を設定
        Person person = new Person();
        person.setName("山田太郎");
        person.setAge(23);
        person.setAddress("東京都");

        // 問③ getterで値を取得して出力
        System.out.println("名前は、" + person.getName() + "です。");
        System.out.println("年齢は、" + person.getAge() + "才です。");
        System.out.println("住所は、" + person.getAddress() + "です。");

    }
}

class Person {
    private String name;
    private int age;
    private String address;

    // 問① getterとsetter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
