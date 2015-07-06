package br.unifor.hellochampz;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {
    EditText text;
    EditText textPassword;
    public static final String EMAIL_EXTRA = "Email";
    public static final String PASSWORD_EXTRA = "Password";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_relative);
        text = (EditText)findViewById(R.id.editTextEmail);
        textPassword = (EditText) findViewById(R.id.editTextPassword);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

   /* public void saySomething(View v){
        //EditText text = (EditText)findViewById(R.id.editTextEmail);
       /* Toast toast = Toast.makeText(MainActivity.this,text.getText(),Toast.LENGTH_LONG);
        toast.show();
        Toast toast = Toast.makeText(getApplicationContext(),textPassword.getText(),Toast.LENGTH_LONG);
        toast.show();

    }*/

    public void saySomething(View v){
        String email = text.getText().toString();
        String password = textPassword.getText().toString();

        Intent intent = new Intent(this,ActivityDetail.class );
        intent.putExtra(EMAIL_EXTRA, email);
        intent.putExtra(PASSWORD_EXTRA, password);
        startActivity(intent);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            Intent intent = new Intent(this,activity_settings.class);
            startActivity(intent);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
