package arksoft.com.textdzenleyici;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {

    EditText et;
    String mesaj;
    Button yesil, mavi, pembe, normal, bold, italic, arti, eksi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et = (EditText) findViewById(R.id.editText);
        yesil = (Button) findViewById(R.id.yesil);
        mavi = (Button) findViewById(R.id.mavi);
        pembe = (Button) findViewById(R.id.pembe);

        normal = (Button) findViewById(R.id.normal);
        bold = (Button) findViewById(R.id.bold);
        italic = (Button) findViewById(R.id.italic);
        arti = (Button) findViewById(R.id.arti);
        eksi = (Button) findViewById(R.id.eksi);

        mesaj = et.getText().toString();


        yesil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et.setTextColor(Color.parseColor("#4CAF50"));
            }
        });

        mavi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et.setTextColor(Color.BLUE);
            }
        });

        pembe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et.setTextColor(Color.parseColor("#E91E63"));
            }
        });


        normal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et.setTypeface(null, Typeface.NORMAL);
            }
        });

        bold.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et.setTypeface(null, Typeface.BOLD);
            }
        });
        italic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et.setTypeface(null, Typeface.ITALIC);
            }
        });

        arti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                float textSizeInPx = et.getTextSize();
                float textSizeInSp = (textSizeInPx / (getResources().getDisplayMetrics().scaledDensity)) + 1;
                et.setTextSize(textSizeInSp);
            }
        });

        eksi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                float textSizeInPx = et.getTextSize();
                float textSizeInSp = (textSizeInPx / (getResources().getDisplayMetrics().scaledDensity)) - 1;
                et.setTextSize(textSizeInSp);
            }
        });


    }


}
