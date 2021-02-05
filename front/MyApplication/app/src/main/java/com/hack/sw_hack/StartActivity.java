package com.hack.sw_hack;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.util.HashMap;
import java.util.Map;

public class StartActivity extends AppCompatActivity {

    EditText editText_id, editText_pw;
    String input_id, input_pw;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        editText_id = (EditText) findViewById(R.id.emailEditText);
        editText_pw = (EditText) findViewById(R.id.passwordEditText);

        Button loginButton = (Button) findViewById(R.id.loginButton);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input_id = editText_id.getText().toString();
                input_pw = editText_pw.getText().toString();

                //sendRequest_login();

                finish();
                startActivity(new Intent(StartActivity.this, SelectActivity.class));
            }
        });

        TextView signUpButton = (TextView) findViewById(R.id.signUpButton);
        signUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(StartActivity.this, SignUpActivity.class));
                finish();
            }
        });

        TextView findButton = (TextView) findViewById(R.id.findButton);
        findButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        //AppHelper.requestQueue = Volley.newRequestQueue(getApplicationContext());
        if(AppHelper.requestQueue == null){
            AppHelper.requestQueue = Volley.newRequestQueue(getApplicationContext());
        }
    }

    public void sendRequest_login(){
        //String url = "http://www.google.co.kr";
        String url ="";
        StringRequest request = new StringRequest(
                //서버 요청 방식
                Request.Method.GET,

                //URL
                url,

                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        //println("응답 : "+response);
                    }
                },

                new Response.ErrorListener(){
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        //println("에러 : "+error.getMessage());
                    }
                }
        )//여기까지는 GET
        {
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                Map<String, String> params = new HashMap<>();
                return params;
            }
        };
        request.setShouldCache(false); // 이전 캐쉬값 무시
        AppHelper.requestQueue.add(request);

        //println("요청 보냄");
    }

    public void println(){

    }
}