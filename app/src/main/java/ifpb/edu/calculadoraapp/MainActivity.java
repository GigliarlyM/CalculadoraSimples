package ifpb.edu.calculadoraapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
    private Button btnSoma;
    private Button btnDivide;
    private Button btnMultiplica;
    private Button btnSubtrai;
    private float resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        textView =  (TextView) findViewById(R.id.resultado);

        btnSoma =       (Button) findViewById(R.id.soma);
        btnDivide =     (Button) findViewById(R.id.divisao);
        btnMultiplica = (Button) findViewById(R.id.btn_multiplicar);
        btnSubtrai =    (Button) findViewById(R.id.subtracao);

        btnSoma         .setOnClickListener(event -> calcularNumeros("+"));
        btnDivide       .setOnClickListener(event -> calcularNumeros("/"));
        btnMultiplica   .setOnClickListener(event -> calcularNumeros("*"));
        btnSubtrai      .setOnClickListener(event -> calcularNumeros("-"));
    }

    private void calcularNumeros(String tipo){

        switch (tipo){

            case "+":
                break;
            case "/":
                break;
            case "*":
                break;
            case "-":
                break;
        }

    }

    private void adicionarNumeros(int num){

        switch (num){
            case 1:
                break;
        }

    }

}