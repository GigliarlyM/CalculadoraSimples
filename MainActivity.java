package ifpb.edu.calculadoraapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText editText;
    private EditText editText2;
    private TextView textView;
    private Button btnSoma;
    private float resultadoSoma;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        editText = findViewById(R.id.number1);
        editText2 = findViewById(R.id.number2);
        textView = findViewById(R.id.resultado);
        btnSoma = findViewById(R.id.btn_soma);

        btnSoma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float num1 = 0;
                float num2 = 0;


                num1 = Float.valueOf(String.valueOf(editText.getText()));
                num2 = Float.valueOf(String.valueOf(editText2.getText()));

                calcNumeros(num1, num2);

            }
        });
    }

    public void calcNumeros(float num1, float num2){
        this.resultadoSoma = num1 + num2;
        String resultadoString = String.valueOf(this.resultadoSoma);

        textView.setText(resultadoString);
    }

}