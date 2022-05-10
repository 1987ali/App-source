package com.energy.androi; //Building & Naming our package

//import static android.service.controls.ControlsProviderService.TAG;
import static java.lang.String.*;
//import static java.lang.Thread.interrupted;
//import static java.lang.Thread.sleep;
//import static java.util.concurrent.TimeUnit.SECONDS;
//import all necessary classes
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest; //creating a file contains data for Android app
import android.annotation.SuppressLint;//Lint ignores annotated element warnings 
//import android.app.AlertDialog;
//import android.content.BroadcastReceiver;
import android.content.pm.PackageManager;//manages application install, uninstall and ...
import android.graphics.Color;
import android.graphics.Typeface; //create a new font family or text style and...
//import android.net.ConnectivityManager;
//import android.net.TelephonyNetworkSpecifier;
//import android.net.wifi.WifiInfo;
//import android.net.wifi.WifiManager;
import android.os.Build;//Building OS in a version of the Linux kernel
import android.os.Bundle;//passing data between activities.

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
import org.json.JSONException;//for showing a problem with the JSON
import org.json.JSONObject;//collection of name or value pairs
//import org.w3c.dom.Document;

import java.io.IOException;// for ignoring basic failures in Input & Output operations
//import java.io.InputStream;
//import java.util.ArrayList;
//import java.util.Arrays;

//import com.mongodb.ConnectionString;
//import com.mongodb.MongoClientSettings;
//import com.mongodb.ServerApi;
//import com.mongodb.ServerApiVersion;
//import com.mongodb.reactivestreams.client.MongoClient;
//import com.mongodb.reactivestreams.client.MongoClients;

import java.sql.Timestamp;//for identifying TIMESTAMP value

/*
//import com.mongodb.*;
//import com.mongodb.client.MongoClients;
//import com.mongodb.client.MongoClient;
//import com.mongodb.client.MongoCollection;
//import com.mongodb.client.MongoDatabase;
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
/*
import com.mongodb.client.gridfs.GridFSBucket;
import com.mongodb.client.gridfs.GridFSBuckets;
import com.mongodb.connection.ClusterType;
import com.mongodb.gridfs.GridFS;
import com.mongodb.gridfs.GridFSFile;
*/
//import java.util.ArrayList;
//import java.util.List;

import android.os.Environment;//access to environment variables
import android.os.Looper;//used to run a message loop for a thread
//import android.telephony.TelephonyManager;
//import android.util.Log;

import android.os.Handler;//allows to send and process Messages
//import android.app.ProgressDialog;
//import android.app.Activity;
//import android.os.Handler;
//import android.os.Handler;
//import android.net.TrafficStats;
//import android.os.SystemClock;
//import android.util.Log;
//import android.util.SparseArray;
import android.view.Gravity;// used to arrange text position
import android.view.View;//used to build the GUI elements
import android.widget.Button;//subclass of TextView class

//import android.app.Activity;
//import android.content.BroadcastReceiver;
import android.content.Context;//connection to the Android system
import android.content.Intent; //msg passed between components
import android.content.IntentFilter;//specifies the type of intents the components would like to receive.
import android.os.BatteryManager;//gives methods for battery and charging properties.
//import android.os.Bundle;
//import android.view.View;
//import android.widget.Button;
//import android.widget.EditText;
import android.widget.EditText;
import android.widget.ImageView;// for displaying an image file
import android.widget.TextView;

import java.io.File;//directory pathname
//import java.io.FileNotFoundException;
//import android.app.Activity;
import android.app.ProgressDialog;
//import android.os.Bundle;
//import android.util.Log;
//import android.view.View;
//import android.widget.Button;
//import android.widget.TextView;
import android.widget.Toast;

//import com.edu.umich.PowerTutor.service.IterationData;
//import com.edu.umich.PowerTutor.service.PowerData;
//import com.edu.umich.PowerTutor.util.BatteryStats;
//import com.edu.umich.PowerTutor.util.HistoryBuffer;
//import com.edu.umich.PowerTutor.util.SystemInfo;

import java.io.BufferedReader;//reads text from a character-input
import java.io.BufferedWriter;//write text to a character-output
//import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
//import java.io.IOException;
import java.util.Locale;//represents a specific location
//import java.util.TimerTask;
//import java.util.*;

import com.android.volley.AuthFailureError;//Error indicator when performing a Request without authentication
import com.android.volley.DefaultRetryPolicy;//makes networking for Android apps easier
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
//import com.google.gson.Gson;

import java.util.HashMap;//stores the data in (Key, Value) pairs
import java.util.Map;//maps a key to a value.
import java.util.concurrent.atomic.AtomicBoolean;

public class MainActivity extends AppCompatActivity {

	// defining the variables
	Timestamp timestamp;

	Handler handler;

	boolean flag_start_stop = false;

	String st = "+";

	int permissionCheck = 0;
	// request permissions
	int MY_PERMISSIONS_REQUEST_ACCESS_MEDIA_LOCATION = 1;
	int MY_PERMISSIONS_REQUEST_WRITE_EXTERNAL_STORAGE = 2;
	int MY_PERMISSIONS_REQUEST_READ_EXTERNAL_STORAGE = 3;
	int MY_PERMISSIONS_REQUEST_BATTERY_STATS = 4;
    //defining time intervals
	int SECOND_TIME = 1;
	int MINUTE_TIME = 2;
	int HOUR_TIME = 3;

	String content_f = "*"; //Creating string from content

	Button btnStartService, btnStopService;

	TextView txttime;

	TextView messageText;
	Button uploadButton;

	ProgressDialog dialog = null;

	/********** File Path *************/
	final String uploadFilePath = "storage/emulated/0/Download/"; //file path
	final String uploadFileName = "log.txt";

	long cnt_sec = 0, cnt_min = 0, cnt_hour = 0; //Counting different intervals

	int cur = 0, type_time = 1;
	double curmAf = 0.0;
	int voltage = 0;
	double voltagef = 0.0;

	Button b, btn_stop, btn_send_data;/* from www . dem o 2s . c o m */
	TextView t;

	boolean condition = false;

	Context application;
	BatteryManager batteryManager;
	IntentFilter ifilter;
	Intent batteryStatus;

	ImageView start_stop;

	char[] data_str = new char[60];

	char[] cbuff = new char[200];

	File file_time, file_ip;

	String filename_time = "sel_time.enn", filename_ip = "sel_ip.enn", ip1 = null, ip2 = null, ip3 = null, ip4 = null,
			resp = null;

	int i = 0, j = 0, pos_star_1 = 0, pos_star_2 = 0, pos_tot = 0, tedad_setareh = 0, cnt_param = 0;

	@RequiresApi(api = Build.VERSION_CODES.N_MR1)
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		// request access from user
		permissionCheck = ContextCompat.checkSelfPermission(this, Manifest.permission.ACCESS_MEDIA_LOCATION);
		if (permissionCheck != PackageManager.PERMISSION_GRANTED) {
			ActivityCompat.requestPermissions(this, new String[] { Manifest.permission.ACCESS_MEDIA_LOCATION },
					MY_PERMISSIONS_REQUEST_ACCESS_MEDIA_LOCATION);
		}

		// Preparation for timestamp displaying
		timestamp = new Timestamp(System.currentTimeMillis());

		// displaying start/stop button
		start_stop = (ImageView) findViewById(R.id.imgv_start);

		b = (Button) findViewById(R.id.buttonBatteryVol);
		btn_send_data = (Button) findViewById(R.id.btn_send_data);
		btn_stop = (Button) findViewById(R.id.btn_stop);
		t = (TextView) findViewById(R.id.textViewBatteryVol);

		txttime = (TextView) findViewById(R.id.txt_time);

		uploadButton = (Button) findViewById(R.id.uploadButton);
		messageText = (TextView) findViewById(R.id.messageText);

		// get system status [voltage & jaryan]
		application = getApplicationContext();
		batteryManager = (BatteryManager) application.getSystemService(BATTERY_SERVICE);
		ifilter = new IntentFilter(Intent.ACTION_BATTERY_CHANGED);
		batteryStatus = application.registerReceiver(null, ifilter);

		// ------------------------------------------------------------
		read_time_file();

		// ------------------------------------------------------------------
		read_ip_file();
		// =====================================================================

		// ------------------------------------------------------
		btnStartService = findViewById(R.id.buttonStartService);
		btnStopService = findViewById(R.id.buttonStopService);

		// ------------------------------------------------------
		btnStartService.setOnClickListener(v -> startService());

		// ------------------------------------------------------
		btnStopService.setOnClickListener(v -> stopService());

		// ------------------------------------------------------
		/*
		 * uploadButton.setOnClickListener(v -> {
		 * 
		 * dialog = ProgressDialog.show(MainActivity.this, "", "Uploading file...",
		 * true);
		 * 
		 * new Thread(() -> { runOnUiThread(() ->
		 * messageText.setText("uploading started....."));
		 * 
		 * uploadFile(uploadFilePath + "" + uploadFileName);
		 * 
		 * }).start(); });
		 */
		// ------------------------------------------------------
		
		
		// Concerning sending infos when we push stop
		btn_send_data.setOnClickListener(v -> {

			dialog = ProgressDialog.show(MainActivity.this, "", "sending data to mongodb...", true);

			new Thread(() -> {
				// runOnUiThread(() -> messageText.setText("sending started....."));

				// send_data();
				final String[] str_kpi = new String[32];

				send(content_f, str_kpi);

			}).start();
		});

		handler_exe();
	}
	// =========================================================

	// preparation for timestamp displaying 
	@Override
	public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions,
			@NonNull int[] grantResults) {

		// super.onRequestPermissionsResult(requestCode, permissions, grantResults);

		if (requestCode == MY_PERMISSIONS_REQUEST_ACCESS_MEDIA_LOCATION) {
			if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
				permissionCheck = ContextCompat.checkSelfPermission(this, Manifest.permission.WRITE_EXTERNAL_STORAGE);
				if (permissionCheck != PackageManager.PERMISSION_GRANTED) {
					ActivityCompat.requestPermissions(this, new String[] { Manifest.permission.WRITE_EXTERNAL_STORAGE },
							MY_PERMISSIONS_REQUEST_WRITE_EXTERNAL_STORAGE);
				}
			}
		}
		if (requestCode == MY_PERMISSIONS_REQUEST_WRITE_EXTERNAL_STORAGE) {
			if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
				permissionCheck = ContextCompat.checkSelfPermission(this, Manifest.permission.READ_EXTERNAL_STORAGE);
				if (permissionCheck != PackageManager.PERMISSION_GRANTED) {
					ActivityCompat.requestPermissions(this, new String[] { Manifest.permission.READ_EXTERNAL_STORAGE },
							MY_PERMISSIONS_REQUEST_READ_EXTERNAL_STORAGE);
				}
			}
		}
		if (requestCode == MY_PERMISSIONS_REQUEST_READ_EXTERNAL_STORAGE) {
			if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
				permissionCheck = ContextCompat.checkSelfPermission(this, Manifest.permission.BATTERY_STATS);
				if (permissionCheck != PackageManager.PERMISSION_GRANTED) {
					ActivityCompat.requestPermissions(this, new String[] { Manifest.permission.BATTERY_STATS },
							MY_PERMISSIONS_REQUEST_BATTERY_STATS);
				}
			}
		}
		if (requestCode == MY_PERMISSIONS_REQUEST_BATTERY_STATS) {
			if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
				toastNow("َAll permission accepted", getApplicationContext());
			}
		}
		super.onRequestPermissionsResult(requestCode, permissions, grantResults);
	}
	// ========================================================

	// displaying the text and content of the page
	public void toastNow(String message, Context context) {
		Typeface font = Typeface.createFromAsset(getAssets(), "inter_bold.ttf");
		Toast toast = Toast.makeText(context, message, Toast.LENGTH_LONG);
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
	// =========================================================

	// taking current infos
	public static int getcur(final Context context) {

		int current = 0;

		BatteryManager manager = (BatteryManager) context.getSystemService(Context.BATTERY_SERVICE);
		if (manager != null) {
			current = manager.getIntProperty(BatteryManager.BATTERY_PROPERTY_CURRENT_AVERAGE);
			// current =
			// manager.getIntProperty(BatteryManager.BATTERY_PROPERTY_CURRENT_NOW);
		}

		// return ( current / 1000);
		return current;
	}

	// ====================================================================
	// taking voltage infos
	public static int getvol(final Context context) {
		int voltage = 0;

		Intent receiver = context.registerReceiver(null, new IntentFilter(Intent.ACTION_BATTERY_CHANGED));

		if (receiver == null)
			return -1;

		voltage = receiver.getIntExtra(BatteryManager.EXTRA_VOLTAGE, 0);

		// return (voltage / 1000);
		return voltage;
	}
	// ====================================================================

	// =========================================================
	/*
	 * public static long getCurrent() { long result = -1; FileReader fr = null;
	 * BufferedReader br = null; try { fr = new
	 * FileReader("/sys/class/power_supply/battery/current_now_ua"); br = new
	 * BufferedReader(fr); result = Long.parseLong(br.readLine().trim()); //result =
	 * result / 1000; } catch (FileNotFoundException e) { e.printStackTrace(); }
	 * catch (IOException e) { e.printStackTrace(); } finally { try { if (fr !=
	 * null) { fr.close(); }
	 * 
	 * if (br != null) { br.close(); } } catch (IOException e) {
	 * e.printStackTrace(); } } return result; }
	 */
	// -----------------------------------------------------------------------------------------------------------------------------
	// -----------------------------------------------------------------------------------------------------------------------------
	// -----------------------------------------------------------------------------------------------------------------------------
	// -----------------------------------------------------------------------------------------------------------------------------
	// -----------------------------------------------------------------------------------------------------------------------------
	private final Runnable mRunnable = new Runnable() {

		@Override
		public void run() {

			/*
			 * runOnUiThread(() -> { if (condition) { calculate(); } });
			 * 
			 */
			// beginTime = SystemClock.elapsedRealtime();

			// android.os.Process.setThreadPriority(android.os.Process.THREAD_PRIORITY_MORE_FAVORABLE);

			// IterationData data;
			// TX = (TextView) findViewById(R.id.TX);
			// RX = (TextView) findViewById(R.id.RX);

			// mHandler.postDelayed(mRunnable, 1000);
		}

	};
	// -----------------------------------------------------------

	private void ChangeText(TextView TextView, String String) {
		runOnUiThread(() -> TextView.setText(String));
	}

	// -----------------------------------------------------------
	public void startService() {
		// Intent serviceIntent = new Intent(this, ForegroundService.class);
		// serviceIntent.putExtra("inputExtra", "Foreground Service Example in
		// Android");

		// ContextCompat.startForegroundService(this, serviceIntent);
	}

	public void stopService() {
		// Intent serviceIntent = new Intent(this, ForegroundService.class);
		// stopService(serviceIntent);
	}

	// -----------------------------------------------------------
	// calculating current & voltage & saving it in content_f variable 
	@SuppressLint("DefaultLocale") //ignoring this warning 
	void calculate() {

		// ChangeText(txttime, format("%d:%d:%d", cnt_hour, cnt_min, cnt_sec));

		// timestamp = new Timestamp(System.currentTimeMillis());

		// ChangeText(txttime, String.format(Locale.ENGLISH,"%d", timestamp.getTime()));

		cur = getcur(application);
		curmAf = (double) cur / (double) 1000.000; // (double)((double)cur/(double)1000.000);

		voltage = getvol(application); // batteryStatus.getIntExtra(BatteryManager.EXTRA_VOLTAGE, 0); //nemonegiri az
										// voltage
		voltagef = (double) voltage / (double) 1000.000; // (double)voltage/(double)1000.000;

		// curmAf = (double)curmAf; //taking average from current sample
		// voltagef = (double)voltagef; //taking average from voltage sample

		st = "+";
		if (curmAf < 0) {
			curmAf = -curmAf;
			st = "-";
		}

		if (curmAf < 1000) {
			double powermWf = (double) curmAf * (double) voltagef;

			ChangeText(t, "Current : " + format("%4.3f", curmAf) + " mA" + "\nVoltage: " + format("%4.3f", voltagef)
					+ "V" + "\nPower: " + format("%4.3f", powermWf) + " mW" + st);

			// content_f += String.format(Locale.ENGLISH,"%d", timestamp.getTime()) + "*" +
			// curmAf + "*" + voltagef + "*" + powermWf + "*";
			content_f += String.format(Locale.ENGLISH, "%d", timestamp.getTime()) + "*"
					+ String.format(Locale.ENGLISH, "%4.3f", powermWf) + "*";

		} else if (curmAf > 1000 && curmAf < 1000000) {
			curmAf = (double) curmAf / (double) 1000.000;

			double powermWf = (double) curmAf * (double) voltagef;

			ChangeText(t, "Current : " + format("%4.3f", curmAf) + " A" + "\nVoltage: " + format("%4.3f", voltagef)
					+ "V" + "\nPower: " + format("%4.3f", powermWf) + "W" + st);

			// content_f += String.format(Locale.ENGLISH,"%d", timestamp.getTime()) + "*" +
			// curmAf + "*" + voltagef + "*" + powermWf + "*";
			content_f += String.format(Locale.ENGLISH, "%d", timestamp.getTime()) + "*"
					+ String.format(Locale.ENGLISH, "%4.3f", powermWf) + "*";

		}

	}

	// ============================================================
	// Reading the data related to the saved IP address
	
	void read_ip_file() {
		EditText edittxt_tmp = (EditText) findViewById(R.id.edittxt_tmp);
		// ------------------------------------------------------------------
		Context context = getApplicationContext();//return the context activities running inside IP.
		file_ip = new File(context.getFilesDir(), filename_ip);
		if (file_ip.exists()) {
			try {

				for (j = 0; j < 200; j++) {
					cbuff[j] = 0;
				}
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

				if (cbuff[0] != 0) {

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
								case 1:// ip1 --look some lines beneath
									ip1 = new String(data_str); //reading file content & transforming it into string
									ip1 = ip1.trim();
									break;

								case 2:// ip2
									ip2 = new String(data_str); //reading file content & transforming it into string
									ip2 = ip2.trim();
									break;

								case 3:// ip3
									ip3 = new String(data_str); //reading file content & transforming it into string
									ip3 = ip3.trim();
									break;

								case 4:// ip4
									ip4 = new String(data_str); //reading file content & transforming it into string
									ip4 = ip4.trim();
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
			}//for unexpected errors
		} else {
			try {
				FileWriter writer = new FileWriter(file_ip);
				writer.append("*192*168*10*10*");
				writer.close();
			} catch (Exception e) {
				e.printStackTrace();
			}//for unexpected errors

			ip1 = "192"; //definition of above IP's for exaamples
			ip2 = "168";
			ip3 = "10";
			ip4 = "10";
		}
	}

	// ===========================================================
	void read_time_file() {
		Context context = getApplicationContext();
		file_time = new File(context.getFilesDir(), filename_time);

		// we have a file ... there exists a file
		if (file_time.exists()) {
			try {
				FileReader Reader = new FileReader(file_time);
				int num = Reader.read(cbuff);
				Reader.close();
			} catch (Exception e) {
				e.printStackTrace();
			}

			// 1->second
			// 2->minute
			// 3->hour
			if (cbuff[0] >= '0' && cbuff[0] <= '9') {
				type_time = (cbuff[0] - 0x30);
			}
			// ChangeText(messageText, String.format(Locale.ENGLISH,"%d", type_time));

		} else {
			try {
				FileWriter writer = new FileWriter(file_time);
				writer.append("1");
				writer.close();
			} catch (Exception e) {
				e.printStackTrace();
			}

			type_time = 1; // second
			// ChangeText(messageText, String.format(Locale.ENGLISH, "%d", type_time));

		}
	}

	// ------------------------------------------------------------
	// event related to beginning of activation of start/stop button
	public void start() {

		content_f = "*";

		if (handler != null) {
			if (!condition) {
				condition = true;
			}
			return;
		}

		condition = true;
		handler_exe();//for handling URI scheme

	}

	// -------------------------------------------------------------
	// handler related to displaying timestamp and time functionality for infos saving
	//which is same as 1s/1m/1h 
	
	void handler_exe() {
		handler = new Handler(Looper.getMainLooper());
		handler.post(new Runnable() {
			@Override
			public void run() {
				runOnUiThread(() -> {

					// --------------------------------------------
					timestamp = new Timestamp(System.currentTimeMillis());

					ChangeText(txttime, String.format(Locale.ENGLISH, "%d", timestamp.getTime()));
					// --------------------------------------------
					if (condition) {

						if (type_time == SECOND_TIME) { // <--calculating second interval
							calculate();
						}
						// ------------------------------------
						cnt_sec++; // time counter: second
						if (cnt_sec > 59) {
							cnt_sec = 0;
							if (type_time == MINUTE_TIME) { // <--calculating minute interval
								calculate();
							}
							// ------------------------------------
							cnt_min++;
							if (cnt_min > 59) {
								cnt_min = 0;
								if (type_time == HOUR_TIME) { // <--calculating hour interval
									calculate();
								}

							}
						}
					}
				});
				handler.postDelayed(this, 1000);

			}
		});
	}

	// ============================================================
	// event related to stoping start/stop button
	public void stop() {

		if (condition) {

			condition = false;

			if (content_f.length() > 1) {
				try {
					write("data.txt", content_f);
				} catch (IOException e) {
					toastNow("error: " + e.toString(), getApplicationContext());
				}

				try {
					json("log");
				} catch (JSONException | IOException e) {
					// e.printStackTrace();
					toastNow("error json: " + e.toString(), getApplicationContext());
				}
			}

		}

	}

	// ============================================================
	// writing related infos into file
	public void write(String fname, String fcontent) throws IOException {

		File file_data = new File(
				Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS) + "/" + fname);

		// String temp = read(fname);

		// try {
		// FileWriter writer = new FileWriter(file);
		// writer.write(temp + fcontent);
		// writer.close();
		if (file_data.exists()) {
			FileWriter writer = new FileWriter(file_data);
			BufferedWriter bufferedWriter = new BufferedWriter(writer);
			bufferedWriter.append(fcontent);
			bufferedWriter.close();
		} else {
			FileWriter writer = new FileWriter(file_data);
			BufferedWriter bufferedWriter = new BufferedWriter(writer);
			bufferedWriter.write(fcontent);
			bufferedWriter.close();
		}
		// }catch (Exception e) {
		// e.printStackTrace();
		// }

	}

	// =======================================================================

	// reading related infos from the file
	public String read(String fname) {

		BufferedReader br = null;
		String response = null;

		try {
			StringBuilder output = new StringBuilder();

			// String fpath = "/storage/emulated/0/Download/" + fname + ".txt";
			String fpath = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS) + "/" + fname
					+ ".txt";

			br = new BufferedReader(new FileReader(fpath));
			String line = "";
			while ((line = br.readLine()) != null) {
				output.append(line).append("\n");
			}
			response = output.toString();

		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
		return response;
	}

	// =======================================================================
	// Convert information from string into char array
	public char[] toCharacterArray(String s) {

		if (s == null) {
			return null;
		}

		int len = s.length();
		char[] array = new char[len];
		for (int i = 0; i < len; i++) {
			/*
			 * Character(char) is deprecated since Java SE 9 & JDK 9 Link:
			 * https://docs.oracle.com/javase/9/docs/api/java/lang/Character.html array[i] =
			 * new Character(s.charAt(i));
			 */
			array[i] = s.charAt(i);
		}

		return array;
	}

	// =============================================================================================
	// Convert information into json format and saving in json file
	void json(String FILE_NAME) throws JSONException, IOException {
		String tmp = "";

		char[] data_str = new char[60];

		for (i = 0; i < 60; i++) {
			data_str[i] = 0;
		}

		char[] cbuff = toCharacterArray(content_f); // content_f.toCharArray();

		File file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS) + "/"
				+ FILE_NAME + ".json");
		FileWriter fileWriter = new FileWriter(file);
		BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

		JSONObject jsonObject = new JSONObject();

		// for removing faults and errors
		// ChangeText(messageText, String.format(Locale.ENGLISH, "%c%c%c%c%c-%d",
		// cbuff[0], cbuff[1], cbuff[2], cbuff[3], cbuff[4], cbuff.length));

		i = 0;
		j = 0;
		cnt_param = 0;
		pos_star_1 = 0;
		pos_star_2 = 0;
		tedad_setareh = 0;
		pos_tot = 0;

		while (i < cbuff.length) {
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
					case 1:// time
						tmp = new String(data_str); // reading file content & converting it into string
						tmp = tmp.trim();

						jsonObject.put("time", tmp); //Put a key/value pair in the JSON Objec
						break;

					case 2:// current
						tmp = new String(data_str); // reading file content & converting it into string
						tmp = tmp.trim();

						jsonObject.put("current", tmp);//Put a key/value pair in the JSON Objec
						break;

					case 3:// voltage
						tmp = new String(data_str); // reading file content & converting it into string
						tmp = tmp.trim();

						jsonObject.put("voltage", tmp);//Put a key/value pair in the JSON Objec
						break;

					case 4:// power
						tmp = new String(data_str); // reading file content & converting it into string
						tmp = tmp.trim();

						jsonObject.put("power", tmp);//Put a key/value pair in the JSON Objec

						String userString = jsonObject.toString();
						bufferedWriter.write(userString);

						cnt_param = 0;
						break;

					}
					i--;
				}
			}

			i++;
		}

		// for fault removing
		// jsonObject.put("current", "892.2500003");
		// jsonObject.put("voltage", "122.26454");
		// jsonObject.put("power", "1312.32648");

		// Convert JsonObject to String Format
		// String userString = "sa";

		bufferedWriter.close();

	}
	// =============================================================================================

	void send_data() {
		// final String[] str_t = {""};
		// final String str_c = "";
		// final String str_v = "";
		// final String[] str_p = {""};
		final String[] str_kpi = new String[32];
		// AtomicBoolean exec_loop = new AtomicBoolean(true);

		// char[] data_str = new char[90];

		/*
		 * for(i=0; i<90; i++) { data_str[i] = 0; }
		 */
		send(content_f, str_kpi);

		// content_f =
		// "*21637633*0.121*3.45554*4758.484844*21637633*0.121*3.45554*4758.484844*";
		/*
		 * char[] cbuff = toCharacterArray(content_f);
		 * 
		 * i = 0; j = 0; cnt_param = 0; pos_star_1 = 0; pos_star_2 = 0; tedad_setareh =
		 * 0; pos_tot = 0;
		 * 
		 * 
		 * runOnUiThread(() -> { while (i < cbuff.length) { if (cbuff[i] == '*') {
		 * tedad_setareh++; if (tedad_setareh == 1) { pos_star_1 = i; } if
		 * (tedad_setareh == 2) { pos_star_2 = i; tedad_setareh = 0;
		 * 
		 * for (j = 0; j < 90; j++) { data_str[j] = 0; } pos_tot = ((pos_star_2 -
		 * pos_star_1) - 1); for (j = 0; j < pos_tot; j++) { data_str[j] =
		 * cbuff[(pos_star_1 + 1) + j]; }
		 * 
		 * cnt_param++; switch (cnt_param) { case 1://time str_t[0] = null; str_t[0] =
		 * new String(data_str); //khandane mohtaviyate file va tabdie an be string
		 * str_t[0] = str_t[0].trim();
		 * 
		 * break;
		 * 
		 * case 2://power str_p[0] = null; str_p[0] = new String(data_str); //khandane
		 * mohtaviyate file va tabdie an be string str_p[0] = str_p[0].trim();
		 * 
		 * for (j = 0; j < 31; j++) { str_kpi[j] = "0"; } str_kpi[31] = str_p[0];
		 * 
		 * send(str_t[0], str_kpi);
		 * 
		 * exec_loop.set(true); while(exec_loop.get()) {
		 * 
		 * char[] c_resp = toCharacterArray(resp); if(c_resp[0] == '>' && c_resp[1] ==
		 * 'o' && c_resp[2] == 'k' && c_resp[3] == '<' ) { exec_loop.set(false); }
		 * if(c_resp[0] == '<' && c_resp[1] == 'n' && c_resp[2] == 'o' && c_resp[3] ==
		 * '>' ) { exec_loop.set(false); //return; }
		 * 
		 * }
		 * 
		 * 
		 * //String userString = jsonObject.toString();
		 * //bufferedWriter.write(userString);
		 * 
		 * cnt_param = 0; break;
		 * 
		 * } i--; } }
		 * 
		 * i++; } });
		 */

		// dialog.dismiss();

	}

	// ========================================================================
	// event related to start/stop button
	public void click_start_stop(View view) {
		if (flag_start_stop) {
			flag_start_stop = false;
			start_stop.setImageResource(R.drawable.start);

			stop();
		} else
		// if(!flag_start_stop)
		{
			flag_start_stop = true;
			start_stop.setImageResource(R.drawable.stop);

			read_time_file();
			// ------------------------------------------------------------

			read_ip_file();

			// ChangeText(messageText, ip1 + "." + ip2 + "." + ip3 + "." + ip4);
			toastNow(ip1 + "." + ip2 + "." + ip3 + "." + ip4, getApplicationContext());

			// -------------------------------------------------------------
			start();

		}
	}

	// =======================================================================
	// event related to setting button
	public void click_setting_menu(View view) {
		if (!condition) {
			Intent SettingActivity_form = new Intent(MainActivity.this, SettingActivity.class);
			startActivity(SettingActivity_form);
		} else {
			toastNow("First, please press >STOP< button", getApplicationContext());
		}

	}

	// =======================================================================
	// event related to sending the info to the server
	public void click_send_data_database(View view) {
		if (!condition) {
			if (content_f.length() > 1) {
				dialog = ProgressDialog.show(MainActivity.this, "", "sending data to mongodb...", true);

				new Thread(() -> {
					// runOnUiThread(() -> messageText.setText("sending started....."));

					final String[] str_kpi = new String[32];

					send(content_f, str_kpi);

				}).start();
			} else {
				toastNow("No saved raw data", getApplicationContext());
			}
		} else {
			toastNow("First, please press >STOP< button", getApplicationContext());
		}

	}

	// ========================================================================
	// function corresponding to info sending
	void send(final String data_inp, final String[] kpi) {
		StringRequest request = new StringRequest(1,
				"http://" + ip1 + "." + ip2 + "." + ip3 + "." + ip4 + ":3000/save_data", response -> {
					// Toast.makeText(this, response, Toast.LENGTH_SHORT).show();
					// toastNow(response, getApplicationContext());
					resp = response;
					if (resp.equals("->rec<-")) {
						dialog.dismiss();
					}
					// resp_int =
				}, error -> {
					// Log.e(TAG, "onErrorResponse: "+error.toString());
					dialog.dismiss();
					toastNow("ErrResp: " + error.toString(), getApplicationContext());
				}) {
			@Override
			protected Map<String, String> getParams() throws AuthFailureError { // sending parameters to the server[sending      
																				// using POST method]
				HashMap<String, String> hashMap = new HashMap<>();
				hashMap.put("data", data_inp);
				return hashMap;
			}
		};

		request.setRetryPolicy(new DefaultRetryPolicy(5000, DefaultRetryPolicy.DEFAULT_MAX_RETRIES,
				DefaultRetryPolicy.DEFAULT_BACKOFF_MULT));
		Volley.newRequestQueue(getApplicationContext()).add(request);
	}

}
//===========================================================================================
//just comments
/*
 * public int uploadFile(String sourceFileUri) {
 * 
 * 
 * String fileName = sourceFileUri;
 * 
 * HttpURLConnection conn = null; DataOutputStream dos = null; String lineEnd =
 * "\r\n"; String twoHyphens = "--"; String boundary =
 * "--------------------------148346767321155802481591654054"; int bytesRead,
 * bytesAvailable, bufferSize; byte[] buffer; int maxBufferSize = 1 * 1024 *
 * 1024; File sourceFile = new File(sourceFileUri);
 * 
 * if (!sourceFile.isFile()) {
 * 
 * dialog.dismiss();
 * 
 * //Log.e("uploadFile", "Source File not exist :"+uploadFilePath + "" +
 * uploadFileName);
 * 
 * runOnUiThread(new Runnable() { public void run() {
 * messageText.setText("Source File not exist :"+ uploadFilePath + "" +
 * uploadFileName); } });
 * 
 * return 0;
 * 
 * } else { try {
 * 
 * // open a URL connection to the Servlet FileInputStream fileInputStream = new
 * FileInputStream(sourceFile); URL url = new URL(upLoadServerUri);
 * 
 * // Open a HTTP connection to the URL conn = (HttpURLConnection)
 * url.openConnection(); conn.setDoInput(true); // Allow Inputs
 * conn.setDoOutput(true); // Allow Outputs conn.setUseCaches(false); // Don't
 * use a Cached Copy conn.setRequestMethod("POST");
 * conn.setRequestProperty("Connection", "Keep-Alive");
 * conn.setRequestProperty("ENCTYPE", "multipart/form-data");
 * conn.setRequestProperty("Content-Type", "multipart/form-data;boundary=" +
 * boundary); conn.setRequestProperty("uploaded_file", fileName);
 * 
 * dos = new DataOutputStream(conn.getOutputStream());
 * 
 * dos.writeBytes(twoHyphens + boundary + lineEnd); dos.
 * writeBytes("Content-Disposition: form-data; name=\"uploaded_file\";filename=\""
 * + fileName + "\"" + lineEnd);
 * 
 * 
 * dos.writeBytes(lineEnd);
 * 
 * // create a buffer of maximum size bytesAvailable =
 * fileInputStream.available();
 * 
 * bufferSize = Math.min(bytesAvailable, maxBufferSize); buffer = new
 * byte[bufferSize];
 * 
 * // read file and write it into form... bytesRead =
 * fileInputStream.read(buffer, 0, bufferSize);
 * 
 * while (bytesRead > 0) {
 * 
 * dos.write(buffer, 0, bufferSize); bytesAvailable =
 * fileInputStream.available(); bufferSize = Math.min(bytesAvailable,
 * maxBufferSize); bytesRead = fileInputStream.read(buffer, 0, bufferSize);
 * 
 * }
 * 
 * // send multipart form data necesssary after file data...
 * dos.writeBytes(lineEnd); dos.writeBytes(twoHyphens + boundary + twoHyphens +
 * lineEnd);
 * 
 * // Responses from the server (code and message) serverResponseCode =
 * conn.getResponseCode(); String serverResponseMessage =
 * conn.getResponseMessage();
 * 
 * //Log.i("uploadFile", "HTTP Response is : " + serverResponseMessage + ": " +
 * serverResponseCode);
 * 
 * if(serverResponseCode == 200){
 * 
 * runOnUiThread(new Runnable() { public void run() {
 * 
 * String msg = "File Upload Completed. See uploaded file here :" +
 * " https://subtle-up.ir/uploads/" + uploadFileName;
 * 
 * messageText.setText(msg); Toast.makeText(MainActivity.this,
 * "File Upload Complete.", Toast.LENGTH_LONG).show(); } }); }
 * 
 * //close the streams // fileInputStream.close(); dos.flush(); dos.close();
 * 
 * } catch (MalformedURLException ex) {
 * 
 * dialog.dismiss(); ex.printStackTrace();
 * 
 * runOnUiThread(new Runnable() { public void run() {
 * messageText.setText("MalformedURLException Exception : check script url." +
 * ex.getMessage()); Toast.makeText(MainActivity.this, "MalformedURLException",
 * Toast.LENGTH_SHORT).show(); } });
 * 
 * //Log.e("Upload file to server", "error: " + ex.getMessage(), ex); } catch
 * (Exception e) {
 * 
 * dialog.dismiss(); e.printStackTrace();
 * 
 * runOnUiThread(new Runnable() { public void run() {
 * messageText.setText("Got Exception : see logcat " + e.getMessage());
 * Toast.makeText(MainActivity.this, "Got Exception : see logcat ",
 * Toast.LENGTH_SHORT).show(); } }); //Log.e("Upload file to server Exception",
 * "Exception : "+ e.getMessage(), e); } dialog.dismiss(); return
 * serverResponseCode;
 * 
 * } // End else block }
 */
//========================================================================