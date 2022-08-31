package com.zantung.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText chieuCao, canNang;
    Button btnTinhBMI;
    TextView txtketQua, txtNhanXet;
    double chiSo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        chieuCao = findViewById(R.id.chieuCao);
        canNang = findViewById(R.id.canNang);
        btnTinhBMI = findViewById(R.id.btnTinhBMI);
        txtketQua = findViewById(R.id.result);
        txtNhanXet = findViewById(R.id.nhanXet);

        btnTinhBMI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double chieucao = Double.parseDouble(chieuCao.getText().toString()) / 100;
                double cannang = Double.parseDouble(canNang.getText().toString());
                chiSo = Math.round((cannang/Math.pow(chieucao,2))*10.0) / 10.0;
                if (chiSo < 16){
                    txtketQua.setText(String.valueOf(chiSo));
                    txtNhanXet.setText("Độ gầy III");
                }
                else if (chiSo <= 16 && chiSo < 17){
                    txtketQua.setText(String.valueOf(chiSo));
                    txtNhanXet.setText("Độ gầy II");
                }
                else if (chiSo <= 17 && chiSo < 18.5){
                    txtketQua.setText(String.valueOf(chiSo));
                    txtNhanXet.setText("Độ gầy I");
                }
                else if (chiSo <= 18.5 && chiSo < 25){
                    txtketQua.setText(String.valueOf(chiSo));
                    txtNhanXet.setText("Bình thường");
                }
                else if (chiSo <= 25 && chiSo < 30){
                    txtketQua.setText(String.valueOf(chiSo));
                    txtNhanXet.setText("Thừa cân");
                }
                else if (chiSo <= 30 && chiSo < 35){
                    txtketQua.setText(String.valueOf(chiSo));
                    txtNhanXet.setText("Béo phì I");
                }
                else if (chiSo <= 35 && chiSo < 40){
                    txtketQua.setText(String.valueOf(chiSo));
                    txtNhanXet.setText("Béo phì II");
                }
                else if (chiSo > 40){
                    txtketQua.setText(String.valueOf(chiSo));
                    txtNhanXet.setText("Béo phì III");
                }
            }
        });
        }
    }