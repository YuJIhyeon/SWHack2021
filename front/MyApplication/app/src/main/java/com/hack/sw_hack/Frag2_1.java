package com.hack.sw_hack;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Text;

public class Frag2_1 extends AppCompatActivity {
    TextView wishText, name;
    Button button1, Button2, Button3, Button4, Button5, Button6;
    Button finishButton;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.frag2_1);

        Intent intent = getIntent();

        String wish = intent.getStringExtra("wish");
        wishText = (TextView) findViewById(R.id.wise_saying);
        wishText.setText(wish);

        button1 = (Button) findViewById(R.id.freg2_1_1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Select Button number 1 ", Toast.LENGTH_SHORT).show();
            }
        });

        finishButton = (Button) findViewById(R.id.finishButton);
        finishButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "명언 : "+wish, Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
