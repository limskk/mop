package com.example.jihye.hommm;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void alert1(View v) {
            AlertDialog.Builder alert = new AlertDialog.Builder(this);
            alert.setTitle("긴급전화"); //메시지 창 제목

        alert.setPositiveButton("취소", new DialogInterface.OnClickListener() { //오른쪽 버튼
            @Override
            public void onClick(DialogInterface dialog, int which) { //오른쪽 버튼 눌렀을 때
                Toast.makeText(MainActivity.this, "취소", Toast.LENGTH_SHORT).show();
            }
        });

        // alert.setIcon(R.drawable.ic_launcher); 타이틀 옆 이미지

        alert.setNegativeButton("전화", new DialogInterface.OnClickListener() { //왼쪽 버튼
        @Override
        public void onClick(DialogInterface dialog, int which) { //왼쪽 버튼 눌렀을 때
            Intent mlntent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:/119"));
            startActivity(mlntent);
        }
    });

        alert.setMessage("119 전화 연결"); //메시지 창 내용
        alert.show();
    }


}
