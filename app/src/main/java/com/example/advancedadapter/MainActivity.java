package com.example.advancedadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ListView listView;

    Student studentOne = new Student("Wyatt", "Slominski", "CS");
    Student studentTwo = new Student("Logan", "Slominski", "English");
    Student studentThree = new Student ("Derek", "Slominski", "undecided");
    Student studentFour = new Student ("Michael", "Buzzelli", "BioChem");
    Student studentFive = new Student ("Ben", "Clay", "idk");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.student);

        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(studentOne);
        studentList.add(studentTwo);
        studentList.add(studentThree);
        studentList.add(studentFour);
        studentList.add(studentFive);

    }

}


