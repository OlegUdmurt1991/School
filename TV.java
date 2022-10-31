package exercises.interfake;

public class TV implements IPowerSwitch {
    private String name;
    private Boolean isOn;

    TV(String nameTV) {
        this.name = nameTV;
        this.isOn = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void model() {
        System.out.println("��������" + this.name);
    }


    @Override
    public void powerOn() {
        if (!isOn) {
            this.isOn = true;
            System.out.println(this.name + "  ���������");
        } else {
            System.out.println(this.name + "  �������");
        }
    }

    @Override
    public void powerOff() {
        if (isOn) {
            this.isOn = false;
            System.out.println(this.name + " ����������");
        } else {
            System.out.println(this.name + "  ��������");
        }
    }
}







//    public TV(String nameTV) { // ����������� �� ��������� ���������� name
//        this.nameTV = nameTV;
//    }
//    public String getName() {
//        return nameTV;
//    }
//    public void setName(String nameTV) {
//
//        this.nameTV = nameTV;
//    }
//    public void sayNameTV() { // ��������� �����
//        System.out.println("�����" + this.nameTV ); // ������ �������� �� ���� Name
//    }