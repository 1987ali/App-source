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


public class st_kpiActivity extends SampleActivityBase {



   //introducing KPI's//
	String[] mobileArray = {"1: CPU Frequency",
                            "2: Screen",
                            "3: Wi-Fi",
                            "4: Radio(3G/4G)",
                            "5: Bluetooth",
                            "6: Current App",
                            "7: Battery Charge",
                            "8: CPU Usage",
                            "9: CPU Temerature",
                            "10: Mobile Signal Strength",
                            "11: Wi-Fi Signal Strength",
                            "12: Mobile RX Byte",
                            "13: Mobile TX Byte",
                            "14: Wi-Fi RX Byte",
                            "15: Wi-Fi TX Byte",
                            "16: Kb Read Per Second(Disk)",
                            "17: Kb Write Per Second(Disk)",
                            "18: Kb Read(Disk)",
                            "19: Kb Write(Disk)",
                            "20: Swap In",
                            "21: Swap Out",
                            "22: Context Switches",
                            "23: Red Mean",
                            "24: Red Std",
                            "25: Green Mean",
                            "26: Green Std",
                            "27: Blue Mean",
                            "28: Blue Std",
                            "29: Brightness",
                            "30: Orientation",
                            "31: -",
                            "32: VA"};

    //String[] mobileArray_name = new String[100]; //defining string lenght
    //String[] mobileArray_tel = new String[100];

    char[] cbuff = new char[200];// buffering the characters
    //char[] buf_165_char = new char[165];
    //char[] data_str = new char[6];

    String filename = "sel_kpi.enn";
    String fileContents = "";
    //----------------------------------------------------------------
    File file_pos_name_dastgah;
    //String filename_pos_name_unit = "pos_name_unit.drg";
    //int pos_name_unit=0;
    //----------------------------------------------------------------
    File file;

    //int i=0, j=0, pos_star_1=0, pos_star_2=0, pos_tot=0, tedad_setareh=0, cnt_param=0;


    //String filename_unit = "name_unit_ID_TEL_tmp9.drg";

    Spinner spn_sel_kpi = null;  //user adjusts a value in a text box 

    //String Star_square_sh1= "#";
    //String file_path;
    //Editable edit_name, edit_tel;



    //int number_name=0;



    @Override // informs compiler an element is overriding.
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_st_kpi);

        spn_sel_kpi = (Spinner) findViewById(R.id.spn_sel_kpi);
        ArrayAdapter dataAdapter = new ArrayAdapter(this, R.layout.activity_listview, mobileArray);
        spn_sel_kpi.setAdapter(dataAdapter);

        //Typeface font = Typeface.createFromAsset(getAssets(), "B_Yekan.ttf");
        //---------------------------------------------------

        //---------------------------------------------------
        Context context = getApplicationContext(); //Returns the context for the entire application 
        file = new File(context.getFilesDir(), filename); //file directory
        if(file.exists())
        {
            try {
                FileReader Reader = new FileReader(file);
                int num = Reader.read(cbuff);
                Reader.close();

                spn_sel_kpi = (Spinner) findViewById(R.id.spn_sel_kpi);

                if(cbuff[0] >= '0' && cbuff[0] <= '9')
                {
                    if(cbuff[1] >= '0' && cbuff[1] <= '9')
                    {
                        int tmp = ((cbuff[0] - 0x30)*10) + (cbuff[1] - 0x30);
                        spn_sel_kpi.setSelection(tmp-1);
                    }else
                    {
                        int tmp = (cbuff[0] - 0x30);
                        spn_sel_kpi.setSelection(tmp-1);
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }else
        {
            try {
                FileWriter writer = new FileWriter(file);
                writer.append("1");
                writer.close();
            }catch (Exception e) {
                e.printStackTrace();
            }
            spn_sel_kpi = (Spinner) findViewById(R.id.spn_sel_kpi);
            spn_sel_kpi.setSelection(1-1);
            //fileContents = "1";
        }





        //----------------------------------------------------------------------------------------
        //if we push cancel button
        Button btn_CANCEL_kpi = (Button) findViewById(R.id.btn_CANCEL_kpi);
        //btn_CANCEL.setTypeface(font);
        btn_CANCEL_kpi.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                finish();
            }

        });


        //----------------------------------------------------------------------------------------
        //saving the time which has been setted up.
        Button btn_OK_kpi = (Button) findViewById(R.id.btn_OK_kpi);
        //btn_OK.setTypeface(font);
        btn_OK_kpi.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                final Spinner spn_sel_kpi = (Spinner) findViewById(R.id.spn_sel_kpi);

                //-------------------------------------------------------------------------
                //actually a file exists.
                if(file.exists())
                {
                    fileContents  = String.valueOf(spn_sel_kpi.getSelectedItemPosition()+1);
                    try
                    {
                        FileWriter writer = new FileWriter(file);
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
