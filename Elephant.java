public class Elephant extends Animal implements Sick{
    private int tuskLength;
    private int children;
    private String name;
    private int hashCode;


public Elephant(){
    int tuskLength = 0;
    int children = 0;
    String name = null;

    }
    public Elephant(int tuskLength, int children, String name){
        this.tuskLength = tuskLength;
        this.children = children;
        this.name = name;
    }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getTuskLength() {
            return tuskLength;
        }

        public void setTuskLength(int tuskLength) {
            this.tuskLength = tuskLength;
        }

        public int getChildren() {
            return children;
        }

        public void setChildren(int children) {
            this.children = children;
        }

    @Override
    public void getDisease() {

    }

    @Override
    public void getTreatment() {

    }

    @Override
    public void setDisease() {

    }

    @Override
    public void setTreatment() {

    }

    @Override
    public void setIsSick() {

    }

    public static class Child extends Elephant {
                String parent;
            }
}
