package com.miracakkoyun.oopproject;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        /*User myUser=new User();
        myUser.job="Data Analyst";
        myUser.name="Miraç";

        User newUser=new User();
        newUser.name="Kirk";
        newUser.job="Musician";*/

        User myUser=new User("Data Analyst","Miraç");
        System.out.println(myUser.name+" "+myUser.job);



        Musicians james=new Musicians("James","guitar",50);
       /*System.out.println(james.age);
        james.age=60;
        System.out.println(james.age);*/
        // eğer değişkenleri private yapsaydık sadece sınıf içerisinden değiştirebilir olurduk yani yukarıdaki gibi değiştiremezdik
        //Buna enchapsulation denir. Hatta sout ile çıktı bile alamıyrouz

        // get set metodları ile değiştirebilriiz ancak
        System.out.println(james.getAge());// görüldüğü gibi get metodları ile çağırabiliyoruz


        james.setAge(60);// bu sefer set metodu ile yaşı değiştirebiliriz
        System.out.println(james.getAge());


        SuperMusician lars=new SuperMusician("Miraç","Trampet",21);
        System.out.println(lars.sing());
        System.out.println(lars.getInstrument());


        //Polymorphism

        //Static Polymorphism
            //aynı sınıfın içerisinde aynı addaki farklı metodları kullanmaya statşc polymorphism denir
        Mathematics mathematics=new Mathematics();
        System.out.println(mathematics.sum());
        System.out.println(mathematics.sum(5,13));
        System.out.println(mathematics.sum(8,24,7));



        //Dynamic Polymorphism
            Animal myAnimal=new Animal();
            myAnimal.sing();
            Dog barley=new Dog();
            barley.sing();
            barley.test();
    }
}