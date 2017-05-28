package david.com.restorestatedemo;

import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ButtonBarLayout;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = MainActivity.class.getSimpleName();
    TextView txtSavedText;
    EditText etxtUserInput;
    Button btnSaveText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtSavedText = (TextView) findViewById(R.id.txt_change_text);
        etxtUserInput = (EditText) findViewById(R.id.etxt_user_input);
        btnSaveText = (Button) findViewById(R.id.btn_change_text);
        btnSaveText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                saveText(v);
            }
        });
    }

    private void saveText(View v) {
        String userInput = etxtUserInput.getText().toString();
        txtSavedText.setText(userInput);
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "entering onResume()");
        Log.d(TAG, "exiting onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "entering onPause()");
        Log.d(TAG, "exiting onPause()");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "entering onStart()");
        Log.d(TAG, "exiting onStart()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "entering onDestroy()");
        Log.d(TAG, "exiting onDestroy()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "entering onRestart()");
        Log.d(TAG, "exiting onRestart()");
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.d(TAG, "entering protected void onRestoreInstanceState(Bundle)");
        if(savedInstanceState != null){
            String userInput = savedInstanceState.getString("userInput");
            txtSavedText.setText(userInput);
        }
        Log.d(TAG, "exiting protected void onRestoreInstanceState(Bundle)");
    }

    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onRestoreInstanceState(savedInstanceState, persistentState);
        Log.d(TAG, "entering public void onRestoreInstanceState(Bundle, PersistableBundle)");
        Log.d(TAG, "exiting public void onRestoreInstanceState(Bundle, PersistableBundle)");
    }

    @Override
    public void onSaveInstanceState(Bundle outState, PersistableBundle outPersistentState) {
        super.onSaveInstanceState(outState, outPersistentState);
        Log.d(TAG, "entering public void onSaveInstanceState(Bundle, PersistantBundle)");
        Log.d(TAG, "exiting public void onSaveInstanceState(Bundle, PersistantBundle)");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.d(TAG, "entering protected void onSaveInstanceState(Bundle)");
        //outState.putString("userInput", txtSavedText.getText().toString());
        Log.d(TAG, "exiting protected void onSaveInstanceState(Bundle)");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "entering onStop()");
        Log.d(TAG, "exiting onStop()");
    }
}
