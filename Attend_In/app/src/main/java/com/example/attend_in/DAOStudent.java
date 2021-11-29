package com.example.attend_in;


import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class DAOStudent
    {

    private DatabaseReference databaseReference;

    public DAOStudent(){

        FirebaseDatabase db = FirebaseDatabase.getInstance();
        databaseReference = db.getReference(Student.class.getSimpleName());

    }

    public Task<Void> add(Student std)
    {


        return databaseReference.push().setValue(std);
    }

}
