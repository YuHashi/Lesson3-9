package to.msn.wings.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Human tanaka = new Human("田中", 40, "ボルダリング");
        tanaka.say();
        tanaka.think();


    }


}
