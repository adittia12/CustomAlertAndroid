package com.example.customdialog;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btShow = (Button) findViewById(R.id.bt_showdialog);
        btShow.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                /**
                 * Initiate custom dialog
                 */
                final Dialog dialog = new Dialog(MainActivity.this);
                dialog.setContentView(R.layout.layout_customdialog);
                dialog.setTitle("Praktikum Mobile");

                /**
                 * Mengeset komponen dari custom dialog
                 */

                TextView text = (TextView) dialog.findViewById(R.id.tv_desc);
                text.setText("Mobile Development Custom Dialog Sample");
                ImageView image = (ImageView) dialog.findViewById(R.id.iv_icon);
                image.setImageResource(R.mipmap.ic_launcher);

                Button dialogButton = (Button) dialog.findViewById(R.id.bt_ok);

                /**
                 * jika tombol di click, tutup dialog
                 */

                dialogButton.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        dialog.dismiss();
                    }
                });
                dialog.show();
            }
        });
    }
}