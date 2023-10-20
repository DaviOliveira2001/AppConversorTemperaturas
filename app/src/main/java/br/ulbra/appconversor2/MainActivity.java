package br.ulbra.appconversor2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText edtCel, edtFaren;

    TextView txtResultado;
    double v1, v2, calculo;
    Button btnConverter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtCel = (EditText) findViewById(R.id.edtCelcius);
        edtFaren = (EditText) findViewById(R.id.edtFar);
        btnConverter = (Button) findViewById(R.id.btnConverter);
        txtResultado = (TextView)findViewById(R.id.txtResposta);
        btnConverter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(edtCel.getText().toString().equals("")){
                    v2 = Double.parseDouble(edtFaren.getText().toString());
                    calculo = (v2 - 32)* 5/9;
                    txtResultado.setText(v2+" fahrenheit em celcius é "+calculo);
                }else{
                    v1 = Double.parseDouble(edtCel.getText().toString());
                    calculo = (v1 * 9/5)+ 32;
                    txtResultado.setText(v1+" celcius em fahrenheit é "+calculo);
                }
            }
        });
    }
}