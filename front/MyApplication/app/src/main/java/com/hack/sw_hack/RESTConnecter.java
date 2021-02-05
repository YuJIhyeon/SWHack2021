package com.hack.sw_hack;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class RESTConnecter {

    static private final String urlStr = "http://54.83.44.224";

    static private void writeJSON(HttpURLConnection connection, JSONObject jsonObject) {
        try (OutputStream os = connection.getOutputStream()) {
            byte[] input = jsonObject.toString().getBytes("utf-8");
            os.write(jsonObject.toString().getBytes("utf-8"));
            os.flush();
            os.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static private JSONObject readJSON(HttpURLConnection connection) {
        InputStream inputStream = null;
        try {
            int status = connection.getResponseCode();
            if (status == HttpURLConnection.HTTP_OK) {
                inputStream = connection.getInputStream();
            } else {
                inputStream = connection.getErrorStream();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        try (BufferedReader br = new BufferedReader(new InputStreamReader(inputStream, "utf-8"))) {
            StringBuilder response = new StringBuilder();
            String responseLine = null;
            while((responseLine = br.readLine()) != null) {
                response.append(responseLine.trim());
            }
            return new JSONObject(response.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    static private HttpURLConnection initConnection(String url, String method) {
        HttpURLConnection result = null;
        try {
            URL u = new URL(url);
            result = (HttpURLConnection) u.openConnection();
            result.setRequestMethod(method);
            result.setRequestProperty("content-type", "application/json");
            result.setDoOutput(true);
            result.setDoInput(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    static public JSONObject login(String id, String password) {
        final JSONObject[] result = new JSONObject[1];
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    HttpURLConnection connection = initConnection(urlStr+"/auth/login", "POST");
                    JSONObject params = new JSONObject();
                    params.put("id", id);
                    params.put("password", password);
                    writeJSON(connection, params);
                    result[0] = readJSON(connection);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        thread.start();
        try {
            thread.join();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result[0];
    }

//    static public JSONObject register(String id, String password, String age, String sex) {
//
//    }
}