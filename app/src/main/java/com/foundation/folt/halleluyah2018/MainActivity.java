package com.foundation.folt.halleluyah2018;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class MainActivity  extends AppCompatActivity {
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        listView = (ListView) findViewById(R.id.list);
        String[] values = new String[]{"Salvation Message","Opening Prayer","Call to Worship",
                "Praises and Worship : Ara Music","Opening Hymn : In Christ Alone - Halleluyah Choir", "Welcome Address","Song Ministration 1",
                "Bible Reading : 1st Chronicle 29:13", "Song Ministration 2","Exhortation - Adeoti Adedotun", "Praises : Ara Music","Song Ministration 3", "Instrumentals","Song Ministration 4",
                "Song Ministration 5", "Closing Remarks", "Closing Hymn : Let Others see Jesus in You - Halleluyah Choir", "Closing Prayer and Benediction - Rev. Dr. Femi Aderibigbe", "Closing Rendition"
        };

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, values);


        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
//                if (position == 0) {
//                    Intent myIntent = new Intent(MainActivity.this, hymn1.class);
//                    startActivity (myIntent);
//                    finish();
//                }

                if (position == 4) {
                   Intent myIntent = new Intent(MainActivity.this, hymn1.class);
                    startActivity (myIntent);

                }

                if (position == 16) {
                    Intent myIntent = new Intent(view.getContext(), hymn2.class);
                    startActivityForResult(myIntent, 0);
                }
//
                if (position == 7) {
                    Intent myIntent = new Intent(view.getContext(), BibleReading.class);
                    startActivityForResult(myIntent, 0);
                }
//
                if (position == 0) {
                    Intent myIntent = new Intent(view.getContext(), SalvationMessage.class);
                    startActivityForResult(myIntent, 0);
                }

//                if (position == 5) {
//                    Intent myIntent = new Intent(view.getContext(), ListItemActivity2.class);
//                    startActivityForResult(myIntent, 0);
//                }
//
//                if (position == 6) {
//                    Intent myIntent = new Intent(view.getContext(), ListItemActivity1.class);
//                    startActivityForResult(myIntent, 0);
//                }
//
//                if (position == 7) {
//                    Intent myIntent = new Intent(view.getContext(), ListItemActivity2.class);
//                    startActivityForResult(myIntent, 0);
//                }
            }

        });
    }
}