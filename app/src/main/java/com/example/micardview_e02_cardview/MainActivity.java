package com.example.micardview_e02_cardview;

import androidx.annotation.LongDef;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

import javax.security.auth.login.LoginException;

public class MainActivity extends AppCompatActivity implements MyAdapter.OnFrutaListener {
    private static final String TAG = "MainActivity";
    private RecyclerView recyclerView;
    private ArrayList<MyModel> models;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.MiRecyclerView);

        LinearLayoutManager llmg = new LinearLayoutManager(this,
                LinearLayoutManager.VERTICAL,
                false);
        recyclerView.setLayoutManager(llmg);

        Log.d(TAG, "onCreate: ");
        models=new ArrayList<>();{
            models.add(new MyModel(R.drawable.cereza,"Cereza","10"));
            models.add(new MyModel(R.drawable.fresa,"fresa","20"));
            models.add(new MyModel(R.drawable.manzana,"Manzana","30"));
            models.add(new MyModel(R.drawable.limon,"Limon","40"));
            models.add(new MyModel(R.drawable.naranja,"Naranja","50"));
            models.add(new MyModel(R.drawable.pera,"Pera","60"));
            models.add(new MyModel(R.drawable.platano,"Platano","70"));
            models.add(new MyModel(R.drawable.sandia,"Sandia","810"));
            models.add(new MyModel(R.drawable.uva,"Uva","90"));

        };

        MyAdapter myAdapter = new MyAdapter(models,this);
        recyclerView.setAdapter(myAdapter);

    }



    @Override
    public void onFrutaClick(int position) {
        Toast.makeText(this,"id: "+models.get(position).getName() , Toast.LENGTH_SHORT).show();
        Log.d(TAG, "onFrutaClick: ");

    }


}

