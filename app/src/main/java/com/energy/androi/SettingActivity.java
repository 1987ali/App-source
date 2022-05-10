package com.energy.androi;


import static java.lang.String.*;
//import static java.lang.Thread.interrupted;
//import static java.lang.Thread.sleep;
//import static java.util.concurrent.TimeUnit.SECONDS;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.annotation.SuppressLint;
//import android.app.AlertDialog;
//import android.content.BroadcastReceiver;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.graphics.Typeface;
//import android.net.ConnectivityManager;
//import android.net.TelephonyNetworkSpecifier;
//import android.net.wifi.WifiInfo;
//import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Bundle;

//import org.bson.BSON;
//import org.bson.BsonDocument;
//import org.bson.BsonInt32;
//import org.bson.BsonInt64;
//import org.bson.conversions.Bson;
//import org.bson.BsonInt32;
//import org.bson.types.ObjectId;
//import org.json.JSONArray;
//import org.bson.BsonInt32;
//import org.bson.types.ObjectId;
import org.json.JSONException;
import org.json.JSONObject;
//import org.w3c.dom.Document;

import java.io.IOException;
//import java.io.InputStream;
//import java.util.ArrayList;
//import java.util.Arrays;

//import com.mongodb.ConnectionString;
//import com.mongodb.MongoClientSettings;
//import com.mongodb.ServerApi;
//import com.mongodb.ServerApiVersion;
//import com.mongodb.reactivestreams.client.MongoClient;
//import com.mongodb.reactivestreams.client.MongoClients;

/*
import com.mongodb.*;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
*/

//import com.mongodb.client.model.Filters;

//import com.mongodb.client.model.UpdateOptions;
//import com.mongodb.client.result.*;
//import org.bson.Document;
//import org.bson.types.ObjectId;

//import java.util.List;
//import java.util.Arrays;
//import java.util.ArrayList;

//import static com.mongodb.client.model.Filters.*;
//import static com.mongodb.client.model.Updates.*;

//import com.mongodb.ConnectionString;
//import com.mongodb.MongoClientSettings;
//import com.mongodb.MongoClientSettings;
//import com.mongodb.MongoClientURI;
//import com.mongodb.MongoCredential;
//import com.mongodb.MongoException;
//import com.mongodb.ServerAddress;

//import com.mongodb.client.MongoIterable;
//import com.mongodb.client.result.*;


//import com.mongodb.client.MongoClient;
//import com.mongodb.client.MongoClients;
//import com.mongodb.client.MongoClients;
//import com.mongodb.client.MongoDatabase;
//import com.mongodb.client.MongoCollection;
//import com.mongodb.client.MongoCollection;
//import com.mongodb.client.MongoDatabase;

//import com.mongodb.BasicDBObject;
//import com.mongodb.BulkWriteOperation;
//import com.mongodb.BulkWriteResult;
//import com.mongodb.Cursor;
//import com.mongodb.DB;
//import com.mongodb.DBCollection;
//import com.mongodb.DBCursor;
//import com.mongodb.DBObject;

//import org.bson.Document;
//import org.bson.types.ObjectId;

//import org.bson.Document;
//import java.util.Arrays;
//import com.mongodb.Block;

//import com.mongodb.client.MongoCursor;
//import static com.mongodb.client.model.Filters.*;

//import com.mongodb.client.model.InsertManyOptions;
//import com.mongodb.client.model.InsertOneModel;
//import com.mongodb.client.model.InsertOneModel;
//import com.mongodb.client.result.InsertOneResult;
//import com.mongodb.client.result.*;
//import com.mongodb.client.result.DeleteResult;
//import static com.mongodb.client.model.Updates.*;
//import com.mongodb.client.result.UpdateResult;
//import com.mongodb.connection.ClusterConnectionMode;
//import com.mongodb.connection.ClusterDescription;
//import com.mongodb.connection.ClusterSettings;
//import com.mongodb.connection.ClusterType;

//import java.util.ArrayList;
//import java.util.List;

import android.os.Environment;
import android.os.Looper;
import android.os.SystemClock;
//import android.telephony.TelephonyManager;
//import android.util.Log;

import android.os.Handler;
//import android.app.ProgressDialog;
//import android.app.Activity;
//import android.os.Handler;
//import android.os.Handler;
//import android.net.TrafficStats;
//import android.os.SystemClock;
//import android.util.Log;
//import android.util.SparseArray;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;

//import android.app.Activity;
//import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.BatteryManager;
//import android.os.Bundle;
//import android.view.View;
//import android.widget.Button;
//import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
//import android.app.Activity;
import android.app.ProgressDialog;
//import android.os.Bundle;
//import android.util.Log;
//import android.view.View;
import android.view.View.OnClickListener;
//import android.widget.Button;
//import android.widget.TextView;
import android.widget.Toast;

//import com.edu.umich.PowerTutor.service.IterationData;
//import com.edu.umich.PowerTutor.service.PowerData;
//import com.edu.umich.PowerTutor.util.BatteryStats;
//import com.edu.umich.PowerTutor.util.HistoryBuffer;
//import com.edu.umich.PowerTutor.util.SystemInfo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
//import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
//import java.io.IOException;
import java.util.Timer;

public class SettingActivity extends AppCompatActivity {


    @RequiresApi(api = Build.VERSION_CODES.Q)
    @Override
    //setting foundations
  //reference for a object which passed into the 'onCreate' method for all activities//
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);


        Button btn_log =  (Button)findViewById(R.id.btn_logging);
        Button btn_adr_ser =  (Button)findViewById(R.id.btn_address_server);
        Button btn_sel_of_KPIs =  (Button)findViewById(R.id.btn_sel_of_KPIs);



        btn_log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent st_time_configurationActivity_form = new Intent(SettingActivity.this, st_time_configurationActivity.class);
                startActivity(st_time_configurationActivity_form);

            }
        });

        btn_adr_ser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent st_ipActivity_form = new Intent(SettingActivity.this, st_ipActivity.class);
                startActivity(st_ipActivity_form);

            }
        });

        btn_sel_of_KPIs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent st_kpiActivity_form = new Intent(SettingActivity.this, st_kpiActivity.class);
                startActivity(st_kpiActivity_form);

            }
        });

    }

    //========================================================
    public String convert_number(String number) //converting between numbers and strings
    {

        return number.replace("1","١").replace("2","٢").replace("2","٢").replace("3","٣");

    }

    public void toastNow(String message, Context context) //making a text
    {
        Typeface font = Typeface.createFromAsset(getAssets(), "B_Yekan.ttf");
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
    //=========================================================



}
