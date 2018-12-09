package in.kikmic.oopjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);





    }

    void list(View logView){

        KickBoxer kboxer= new KickBoxer(12,50);

        kboxer.setA(20);
        int c = kboxer.getA();

        Log.i("MyTag",c+"");


        //Log.i("myTag","value of a : "+ kboxer.a + " value of b :" + kboxer.b);

        Toast.makeText(MainActivity.this, "hello worlds",Toast.LENGTH_LONG).show();



    }
}


