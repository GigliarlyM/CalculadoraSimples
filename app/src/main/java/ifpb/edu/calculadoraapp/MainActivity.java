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
    private Button btnDivide;
    private Button btnMultiplica;
    private Button btnSubtrai;
    private float resultadoSoma;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        editText = (EditText) findViewById(R.id.number1);
        editText2 = (EditText) findViewById(R.id.number2);
        textView = (TextView) findViewById(R.id.resultado);
        btnSoma = (Button) findViewById(R.id.btn_soma);
        btnDivide = (Button) findViewById(R.id.btn_dividir);
        btnMultiplica = (Button) findViewById(R.id.btn_multiplicar);
        btnSubtrai = (Button) findViewById(R.id.btn_subtrair);

        btnSoma.setOnClickListener(new CalculoSoma());
        btnDivide.setOnClickListener(new CalculoDivisao());
        btnMultiplica.setOnClickListener(new CalculoMultiplicao());
        btnSubtrai.setOnClickListener(new CalculoSubtracao());
    }

    class CalculoSoma implements View.OnClickListener {

        private float resultadoSoma;

        @Override
        public void onClick(View view) {
            float num1 = 0;
            float num2 = 0;
            String resultadoString;

            num1 = Float.valueOf(String.valueOf(editText.getText()));
            num2 = Float.valueOf(String.valueOf(editText2.getText()));

            this.resultadoSoma = num1 + num2;
            resultadoString = String.valueOf(this.resultadoSoma);

            textView.setText(resultadoString);
        }

    }

    class CalculoDivisao implements View.OnClickListener {

        private float resultadoSoma;

        @Override
        public void onClick(View view) {
            float num1 = 0;
            float num2 = 0;


            num1 = Float.valueOf(String.valueOf(editText.getText()));
            num2 = Float.valueOf(String.valueOf(editText2.getText()));

            this.resultadoSoma = num1 / num2;
            String resultadoString = String.valueOf(this.resultadoSoma);

            textView.setText(resultadoString);
        }

    }

    class CalculoMultiplicao implements View.OnClickListener {

        private float resultadoSoma;

        @Override
        public void onClick(View view) {
            float num1 = 0;
            float num2 = 0;


            num1 = Float.valueOf(String.valueOf(editText.getText()));
            num2 = Float.valueOf(String.valueOf(editText2.getText()));

            this.resultadoSoma = num1 * num2;
            String resultadoString = String.valueOf(this.resultadoSoma);

            textView.setText(resultadoString);
        }

    }

    class CalculoSubtracao implements View.OnClickListener {

        private float resultadoSoma;

        @Override
        public void onClick(View view) {
            float num1 = 0;
            float num2 = 0;


            num1 = Float.valueOf(String.valueOf(editText.getText()));
            num2 = Float.valueOf(String.valueOf(editText2.getText()));

            this.resultadoSoma = num1 - num2;
            String resultadoString = String.valueOf(this.resultadoSoma);

            textView.setText(resultadoString);
        }

    }

}