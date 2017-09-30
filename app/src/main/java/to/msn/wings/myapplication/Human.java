package to.msn.wings.myapplication;
import android.util.Log;
/**
 * Created by Yuto on 2017/09/23.
 */

public class Human extends Animal implements Thinkable{

    String hobby;

    public Human(String name, int age, String hobby){
        this.name=name;
        this.age=age;
        this.hobby=hobby;
    };

    public void say(){
        Log.d("javatest","「私の名前は" + name +"です。年は" + age + "歳です。」");
    }

    public void think(){
        Log.d("javatest", "「私は" + hobby + "について考える。」");
    }

}
