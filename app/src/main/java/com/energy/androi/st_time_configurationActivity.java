package com.energy.androi;

import android.app.Activity;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.telephony.SmsManager;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.text.Editable;
import android.widget.Toast;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.energy.common.activities.SampleActivityBase;
//import com.subtle.android.view.java.CommonShapeButton;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URLDecoder;
import java.net.URLEncoder;

import android.widget.AdapterView;

import androidx.appcompat.app.AppCompatActivity;


public class st_time_configurationActivity extends SampleActivityBase {



    String[] mobileArray = {"1 second", "1 minute", "1 hour"};

    String[] mobileArray_name = new String[100]; //validating string lenght
    String[] mobileArray_tel = new String[100];

    char[] cbuff = new char[200];
    //char[] buf_165_char = new char[165];
    char[] data_str = new char[6];

    String filename_time = "sel_time.enn";
    String fileContents = "";
    //----------------------------------------------------------------
    File file_pos_name_dastgah;
    String filename_pos_name_dastgah = "pos_name_dastgah.drg";
    int pos_name_dastgah=0;
    //----------------------------------------------------------------
    File file_time;

    int i=0, j=0, pos_star_1=0, pos_star_2=0, pos_tot=0, tedad_setareh=0, cnt_param=0;


    String filename_dastgah = "name_dastgah_ID_TEL_tmp9.drg";

    Spinner spn_sel_time = null;  //user adjusts a value in a text box 

    //String star_square_sh1= "#";
    //String file_path;
    //Editable edit_name, edit_tel;



    int tedade_name=0;



    @Override  // informs compiler an element is overriding.
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_st_time_configuration);

        spn_sel_time = (Spinner) findViewById(R.id.spn_sel_time);
        ArrayAdapter dataAdapter = new ArrayAdapter(this, R.layout.activity_listview, mobileArray);
        spn_sel_time.setAdapter(dataAdapter);

        //Typeface font = Typeface.createFromAsset(getAssets(), "B_Yekan.ttf");
        //---------------------------------------------------

        //---------------------------------------------------
        Context context = getApplicationContext(); //Returns the context for the entire application 
        file_time = new File(context.getFilesDir(), filename_time); //file directory

        //file exists
        i = 0;
        j = 0;
        cnt_param = 0;
        pos_star_1 = 0;
        pos_star_2 = 0;

        if(file_time.exists())
        {
            try {
                FileReader Reader = new FileReader(file_time);
                int num = Reader.read(cbuff);
                Reader.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
            spn_sel_time = (Spinner) findViewById(R.id.spn_sel_time);
            spn_sel_time.setSelection((cbuff[0] - 0x30)-1);
        }else
        {
            try {
                FileWriter writer = new FileWriter(file_time);
                writer.append("1");
                writer.close();
            }catch (Exception e) {
                e.printStackTrace();
            }
            spn_sel_time = (Spinner) findViewById(R.id.spn_sel_time);
            spn_sel_time.setSelection(1-1);
        }



        //----------------------------------------------------------------------------------------
        //pushing cancel buttnon
        Button btn_CANCEL = (Button) findViewById(R.id.btn_CANCEL);
        //btn_CANCEL.setTypeface(font);
        btn_CANCEL.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                finish();
            }

        });


        //----------------------------------------------------------------------------------------
        //saving the time which has been setted up.
        Button btn_OK = (Button) findViewById(R.id.btn_OK);
        //btn_OK.setTypeface(font);
        btn_OK.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                final Spinner spn_sel_time = (Spinner) findViewById(R.id.spn_sel_time);

                //-------------------------------------------------------------------------
                //actually a file exists
                if(file_time.exists())
                {
                    fileContents  = String.valueOf(spn_sel_time.getSelectedItemPosition()+1);
                    try
                    {
                        FileWriter writer = new FileWriter(file_time);
                        writer.append(fileContents);
                        writer.close();
                        toastNow("save...OK", getApplicationContext());
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }

                //finish();

            }

        });


    }



    //----------------------------------------------------------------------------------
    public void toastNow(String message, Context context)//making a text
    {
        Typeface font = Typeface.createFromAsset(getAssets(), "inter_bold.ttf");
        Toast toast = Toast.makeText(context,message, Toast.LENGTH_LONG);
        toast.setGravity(Gravity.BOTTOM, toast.getXOffset() / 2, toast.getYOffset() / 2);

        TextView textView = new TextView(context);
        textView.setBackgroundColor(Color.DKGRAY);
        textView.setTextColor(Color.WHITE);
        textView.setTextSize(20);
        textView.setTypeface(font);
        textView.setPadding(10, 10, 10, 10);
        textView.setText(message);

        toast.setView(textView);
        toast.show();
    }

}
