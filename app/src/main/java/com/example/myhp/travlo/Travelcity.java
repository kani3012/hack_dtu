package com.example.myhp.travlo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by my hp on 2/20/2016.
 */
public class Travelcity extends AppCompatActivity implements View.OnClickListener,AdapterView.OnItemClickListener{
ArrayList<String> list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.travelcity);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_travelcity);
        setSupportActionBar(toolbar);
        String qutubminar="Qutub Minar",delhizoo="Delhi Zoo",redfort="Red Fort",chandnichowk="Chandni Chowk";
        double latqutub=28.524410,latzoo=28.608547,latfort=27.171466,latchandnichowk=28.650594;
        double longqutub=77.185466,longzoo=77.239921,longfort=78.018553,longchandnichowk=77.230328;
        ListView lv=(ListView)findViewById(R.id.listView_attractions);
        list = new ArrayList<String>();
        list.add(qutubminar);
        list.add(delhizoo);
        list.add(redfort);
        list.add(chandnichowk);
        ArrayAdapter items=new CustomListAdapter(Travelcity.this , R.layout.custom_list ,list);
        lv.setAdapter(items);
        lv.setOnItemClickListener(this);
    }

    @Override
    public void onClick(View v) {

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

    }
}
