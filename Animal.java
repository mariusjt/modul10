public class Animal {
    private int idNum;
    private int age;

    public Animal(){
        int idNum;
        int age;
    }

    public Animal(int idNum, int age){
        this.idNum = idNum;
        this.age = age;
    }

    public int getIdNum() {
        return idNum;
    }

    public void setIdNum(int idNum) {
        this.idNum = idNum;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
