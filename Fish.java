public class Fish extends Animal{

    private String pond;
    private boolean saltWater;

    public Fish(){
        String pond;
        boolean saltWater;
    }

    public Fish(String pond, boolean saltWater){
        this.pond = pond;
        this.saltWater = saltWater;
    }

    public String getPond() {
        return pond;
    }

    public void setPond(String pond) {
        this.pond = pond;
    }

    public boolean isSaltWater() {
        return saltWater;
    }

    public void setSaltWater(boolean saltWater) {
        this.saltWater = saltWater;
    }
}
