package exercises.interfake;


import java.util.ArrayList;

public  class Main  {
    public static void main(String[] args) {

        var tvs2 = new ArrayList<IPowerSwitch>();
        tvs2.add(new Samsung());
        tvs2.add(new LG());
        Rabotyga.DoSwitchPower(tvs2);










//        TV [] tvik = new TV[2];  //������� ������ ������ ���
//        tvik[0] = new Samsung("hbjk"); //������� ������� ������ ������
//        tvik[1] = new Rabotyga("tuzik");
//        for (int i = 0; i < tvik.length; i++) {
//            tvik[i].setNameTV();
//        }



//TV telik = new TV("������������");
//telik.sayNameTV();


        }



}

