package com.example.mobilesoftwareengineeringlab;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.bumptech.glide.Glide;
import com.example.mobilesoftwareengineeringlab.Models.User;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity3 extends AppCompatActivity {

    TextView firstname;
    TextView lastname;
    ImageView avatar;
    String currentUser;
    String currentAvatar;
    String currentUserLastName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        firstname = findViewById(R.id.first_name_text_view);
        lastname = findViewById(R.id.last_name_text_view);
        avatar = findViewById(R.id.image_view);

        String url = "https://reqres.in/api/users";


        Bundle extras = getIntent().getExtras();
        this.currentUser = extras.getString("CurrentUser");
        this.currentAvatar = extras.getString("CurrentAvatar");
        this.currentUserLastName = extras.getString("CurrentUserLastName");


        RequestQueue queue = Volley.newRequestQueue(this);
        queue.add(getStringRequest(url));
    }

    private StringRequest getStringRequest(String url){
        return new StringRequest(Request.Method.GET, url, (response) -> {
            try{
                JSONObject object = new JSONObject(response);
                JSONArray array = object.getJSONArray("data");
                JSONObject user = array.getJSONObject(0);

                firstname.setText(currentUser);
                lastname.setText(currentUserLastName);


                Glide.with(this)
                        .load(currentAvatar)
                        .circleCrop()
                        .into(avatar);

            } catch (JSONException e){
                e.printStackTrace();
            }

        }, (error) -> {

        });
    }
}