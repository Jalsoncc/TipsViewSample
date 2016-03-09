package cn.jalson.tipsviewsample;

import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import cn.jalson.tipsview.TipsBuilder;
import cn.jalson.tipsview.TipsView;
import cn.jalson.tipsview.TipsViewInterface;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        TextView textView = (TextView)findViewById(R.id.text);
        TipsView tipsView  = new TipsBuilder(this)
                .setCircle(false)
                .setCallback(new TipsViewInterface() {
                    @Override
                    public void gotItClicked() {
                        Toast.makeText(getApplicationContext(),"click",Toast.LENGTH_LONG).show();
                    }
                })
                .setDescription("This is helloworld")
                .setDescriptionColor(Color.parseColor("#ffffff"))
                .setBackgroundColor(Color.parseColor("#88000000"))
                .setTarget(textView)
                .setButtonVisibble(true)
                .setButtonTextColor(Color.parseColor("#000000"))
                .setButtonText("click me")
                .setTitle("This is Title")
                .setTitleColor(Color.parseColor("#ffffff"))
                .build();
        tipsView.show(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
