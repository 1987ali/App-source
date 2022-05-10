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
import java.net.URLDecoder;
import java.net.URLEncoder;

import android.widget.AdapterView;

import androidx.appcompat.app.AppCompatActivity;


public class st_ipActivity extends SampleActivityBase {



    /*
    String[] mobileArray = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"
                          , "11", "12", "13", "14", "15", "16", "17", "18", "19", "20"
                          , "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32"};
     */

    //String[] mobileArray_name = new String[100];
    //String[] mobileArray_tel = new String[100];

    char[] cbuff = new char[200];
    //char[] buf_165_char = new char[165];
    char[] data_str = new char[60];

    String filename_ip = "sel_ip.enn";
    String fileContents = "";
    //----------------------------------------------------------------
    //File file_pos_unit_name;
    //String filename_pos_unit_name = "pos_unit_name.drg";
    //int pos_name_name=0;
    //----------------------------------------------------------------
    File file_ip;

    int i=0, j=0, pos_star_1=0, pos_star_2=0, pos_tot=0, tedad_setareh=0, cnt_param=0;


    //EditText ip1,ip2,ip3,ip4;

    //String filename_unit = "name_unit_ID_TEL_tmp9.drg";

    //Spinner spn_sel_kpi = null;

    //String star_square_sh1= "#";
    //String file_path;
    //Editable edit_name, edit_tel;



    //int number_name=0;



    @Override // informs compiler an element is overriding.
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_st_ip);


        //ip1 = (EditText) findViewById(R.id.edt_ip1);
        //ip2 = (EditText) findViewById(R.id.edt_ip2);
        //ip3 = (EditText) findViewById(R.id.edt_ip3);
        //ip4 = (EditText) findViewById(R.id.edt_ip4);

        /*
        spn_sel_kpi = (Spinner) findViewById(R.id.spn_sel_kpi);
        ArrayAdapter dataAdapter = new ArrayAdapter(this, R.layout.activity_listview, mobileArray);
        spn_sel_kpi.setAdapter(dataAdapter);
        */
        //Typeface font = Typeface.createFromAsset(getAssets(), "B_Yekan.ttf");
        //---------------------------------------------------

        //---------------------------------------------------
        Context context = getApplicationContext(); //taking and returning the whole process of ip address
        file_ip = new File(context.getFilesDir(), filename_ip);
        if(file_ip.exists())
        {
            try {
                FileReader Reader = new FileReader(file_ip);
                int num = Reader.read(cbuff);
                Reader.close();

                i = 0;
                j = 0;
                cnt_param = 0;
                pos_star_1 = 0;
                pos_star_2 = 0;
                tedad_setareh = 0;
                pos_tot = 0;

                if(cbuff[0] != 0) {

                    while (cbuff[i] != 0) {
                        if (cbuff[i] == '*') {
                            tedad_setareh++;
                            if (tedad_setareh == 1) {
                                pos_star_1 = i;
                            }
                            if (tedad_setareh == 2) {
                                pos_star_2 = i;
                                tedad_setareh = 0;
                                for (j = 0; j < 60; j++) {
                                    data_str[j] = 0;
                                }
                                pos_tot = ((pos_star_2 - pos_star_1) - 1);
                                for (j = 0; j < pos_tot; j++) {
                                    data_str[j] = cbuff[(pos_star_1 + 1) + j];
                                }
                                cnt_param++;
                                switch (cnt_param) {
                                    case 1://ip1
                                        EditText edt_ip1 = (EditText) findViewById(R.id.edt_ip1);
                                        edt_ip1.setText(data_str, 0, pos_tot);
                                        edt_ip1.setSelection(edt_ip1.length());
                                        fileContents = "*" + edt_ip1.getText().toString().trim() + "*";
                                        break;

                                    case 2://ip2
                                        EditText edt_ip2 = (EditText) findViewById(R.id.edt_ip2);
                                        edt_ip2.setText(data_str, 0, pos_tot);
                                        edt_ip2.setSelection(edt_ip2.length());
                                        fileContents += edt_ip2.getText().toString().trim() + "*";
                                        break;

                                    case 3://ip3
                                        EditText edt_ip3 = (EditText) findViewById(R.id.edt_ip3);
                                        edt_ip3.setText(data_str, 0, pos_tot);
                                        edt_ip3.setSelection(edt_ip3.length());
                                        fileContents += edt_ip3.getText().toString().trim() + "*";
                                        break;

                                    case 4://ip4
                                        EditText edt_ip4 = (EditText) findViewById(R.id.edt_ip4);
                                        edt_ip4.setText(data_str, 0, pos_tot);
                                        edt_ip4.setSelection(edt_ip4.length());
                                        fileContents += edt_ip4.getText().toString().trim() + "*";
                                        break;
                                }
                                i--;
                            }
                        }
                        i++;
                    }
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }else
        {
            try {
                FileWriter writer = new FileWriter(file_ip);
                writer.append("*192*168*10*10*");
                writer.close();
            }catch (Exception e) {
                e.printStackTrace();
            }

            EditText edt_ip1 = (EditText) findViewById(R.id.edt_ip1);
            edt_ip1.setText("192");
            edt_ip1.setSelection(edt_ip1.length());

            EditText edt_ip2 = (EditText) findViewById(R.id.edt_ip2);
            edt_ip2.setText("168");
            edt_ip2.setSelection(edt_ip2.length());

            EditText edt_ip3 = (EditText) findViewById(R.id.edt_ip3);
            edt_ip3.setText("10");
            edt_ip3.setSelection(edt_ip3.length());

            EditText edt_ip4 = (EditText) findViewById(R.id.edt_ip4);
            edt_ip4.setText("10");
            edt_ip4.setSelection(edt_ip4.length());

        }


        //----------------------------------------------------------------------------------------
        //if we push the cancel button
        Button btn_CANCEL_ip = (Button) findViewById(R.id.btn_CANCEL_ip);
        //btn_CANCEL.setTypeface(font);
        btn_CANCEL_ip.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                finish();
            }

        });


        //----------------------------------------------------------------------------------------
        //saving the time which has been setted up.
        Button btn_OK_ip = (Button) findViewById(R.id.btn_OK_ip);
        //btn_OK.setTypeface(font);
        btn_OK_ip.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                //final Spinner spn_sel_kpi = (Spinner) findViewById(R.id.spn_sel_kpi);

                //-------------------------------------------------------------------------
                //actually we have a file
                if(file_ip.exists())
                {
                    EditText edt_ip1 = (EditText) findViewById(R.id.edt_ip1);
                    fileContents = "*" + edt_ip1.getText().toString() + "*";

                    EditText edt_ip2 = (EditText) findViewById(R.id.edt_ip2);
                    fileContents += edt_ip2.getText().toString() + "*";

                    EditText edt_ip3 = (EditText) findViewById(R.id.edt_ip3);
                    fileContents += edt_ip3.getText().toString() + "*";

                    EditText edt_ip4 = (EditText) findViewById(R.id.edt_ip4);
                    fileContents += edt_ip4.getText().toString() + "*";

                    try
                    {
                        FileWriter writer = new FileWriter(file_ip);
                        writer.append(fileContents);
                        writer.close();
                        toastNow("save...OK", getApplicationContext());
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }


            }

        });


    }


    //----------------------------------------------------------------------------------
    public void toastNow(String message, Context context) //text making 
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
