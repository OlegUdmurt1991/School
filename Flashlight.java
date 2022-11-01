package exercises.interfake;

public class Flashlight implements IPowerSwitch{
private String name ;
private boolean isOnLight ;

Flashlight (String nameLight) {
    this.name = nameLight;
    this.isOnLight = false;
}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void modelLight () {
    System.out.println("проверка" + this.name);
}

    @Override
    public void powerOn() {
        if (!isOnLight) {
            this.isOnLight = true;
            System.out.println(this.name + "  включился");
        } else {
            System.out.println(this.name + "  включен");
        }
    }

    @Override
    public void powerOff() {
        if (isOnLight) {
            this.isOnLight = false;
            System.out.println(this.name + " выключился");
        } else {
            System.out.println(this.name + "  выключен");
        }
    }
}
