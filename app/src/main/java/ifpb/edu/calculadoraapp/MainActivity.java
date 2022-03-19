package ifpb.edu.calculadoraapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText editText1;
    private EditText editText2;
    private TextView textView;
    private Button buttonStart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1 = findViewById(R.id.numero1);
        editText2 = findViewById(R.id.numero2);
        textView = findViewById(R.id.resultado);
        buttonStart = findViewById(R.id.iniciarSoma);

        buttonStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int num1 = Integer.valueOf(String.valueOf(editText1.getText()));
                int num2 = Integer.valueOf(String.valueOf(editText2.getText()));

                calcularSoma(num1, num2);
            }
        });
    }

    private void calcularSoma(int num1, int num2) {

        textView.setText(
                String.valueOf(num1 + num2)
        );

    }

}