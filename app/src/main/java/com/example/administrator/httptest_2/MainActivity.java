package com.example.administrator.httptest_2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.administrator.httptest_2.JsonTest.JSONTest;
import com.example.administrator.httptest_2.xmlTest.HttpXmlTest;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }

    public void onClick(View v){
        switch (v.getId()){
            case R.id.loadWebView:
                startActivity(new Intent(MainActivity.this,LoadWebView.class));
                break;

            case R.id.download_image_bt:
                startActivity(new Intent(MainActivity.this,DownloadImage.class));
                break;

            case R.id.http_get_post_test:
                startActivity(new Intent(MainActivity.this,Http_Get_and_Post_Test.class));
                break;

            case R.id.httpClient_test:
                startActivity(new Intent(MainActivity.this,HttpClientTest.class));
                break;

            case R.id.json_test_button:
                startActivity(new Intent(MainActivity.this, JSONTest.class));

            case R.id.http_xml_test:
                startActivity(new Intent(MainActivity.this, HttpXmlTest.class));

            default:
                break;
        }
    }
}