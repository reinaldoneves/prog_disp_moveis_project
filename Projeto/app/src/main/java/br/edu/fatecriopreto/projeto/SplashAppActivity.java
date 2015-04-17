package br.edu.fatecriopreto.projeto;

import android.graphics.Typeface;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class SplashAppActivity extends ActionBarActivity {

    TextView pizzAppTxtView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_tela_splash);
        setContentView(R.layout.activity_login);

        //Chamar a tela de login aqui

        //Pega a fonte custom
        //Typeface bauhaus93 = Typeface.createFromAsset(getAssets(), "fonts/bauhaus93.ttf");

        pizzAppTxtView = (TextView) findViewById(R.id.pizzAppTxtView);
       // pizzAppTxtView.setTypeface(bauhaus93);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_splash_app, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
