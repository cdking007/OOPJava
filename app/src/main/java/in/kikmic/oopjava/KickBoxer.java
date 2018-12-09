package in.kikmic.oopjava;

public class KickBoxer {

    private int a = 10;
    private int b = 20;

    public int getA() {
        return a * 3;
    }

    public void setA(int a){

        this.a = a;

    }

//    public KickBoxer(int num,int bum){
//
//        if (num <= 0 || bum <= 0)
//            return;
//
//        this.a = num;
//        this.b = bum;
//
//
//    }


    public KickBoxer(int a, int b) {
        this.a = a;
       // this.b = b;
    }
}


