package ifpb.edu.calculadoraapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView textView;

    private TextView alg0, alg1, alg2, alg3, alg4, alg5, alg6, alg7, alg8, alg9;

    private Button limpa, igual;

    private Button btnSoma, btnDivide, btnMultiplica, btnSubtrai;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        receberViews();
        difinirEventos();
    }

    private void receberViews(){

        textView =  (TextView) findViewById(R.id.resultado);
        alg0 =      (TextView) findViewById(R.id.alg0);
        alg1 =      (TextView) findViewById(R.id.alg1);
        alg2 =      (TextView) findViewById(R.id.alg2);
        alg3 =      (TextView) findViewById(R.id.alg3);
        alg4 =      (TextView) findViewById(R.id.alg4);
        alg5 =      (TextView) findViewById(R.id.alg5);
        alg6 =      (TextView) findViewById(R.id.alg6);
        alg7 =      (TextView) findViewById(R.id.alg7);
        alg8 =      (TextView) findViewById(R.id.alg8);
        alg9 =      (TextView) findViewById(R.id.alg9);

        btnSoma =       (Button) findViewById(R.id.soma);
        btnDivide =     (Button) findViewById(R.id.divisao);
        btnMultiplica = (Button) findViewById(R.id.multiplicacao);
        btnSubtrai =    (Button) findViewById(R.id.subtracao);
        limpa =         (Button) findViewById(R.id.limpa);
        igual =         (Button) findViewById(R.id.igual);

    }

    private void difinirEventos(){

        btnSoma         .setOnClickListener(event -> adicionarCalculos(" + "));
        btnDivide       .setOnClickListener(event -> adicionarCalculos(" / "));
        btnMultiplica   .setOnClickListener(event -> adicionarCalculos(" * "));
        btnSubtrai      .setOnClickListener(event -> adicionarCalculos(" - "));

        alg0    .setOnClickListener(event -> adicionarCalculos("0"));
        alg1    .setOnClickListener(event -> adicionarCalculos("1"));
        alg2    .setOnClickListener(event -> adicionarCalculos("2"));
        alg3    .setOnClickListener(event -> adicionarCalculos("3"));
        alg4    .setOnClickListener(event -> adicionarCalculos("4"));
        alg5    .setOnClickListener(event -> adicionarCalculos("5"));
        alg6    .setOnClickListener(event -> adicionarCalculos("6"));
        alg7    .setOnClickListener(event -> adicionarCalculos("7"));
        alg8    .setOnClickListener(event -> adicionarCalculos("8"));
        alg9    .setOnClickListener(event -> adicionarCalculos("9"));

        limpa.setOnClickListener(event -> adicionarCalculos("limpa"));
        igual.setOnClickListener(event -> adicionarCalculos("igual"));

    }

    private void adicionarCalculos(String tipo){

        switch (tipo){
            case "limpa":
                textView.setText("");
                break;

            case "igual":
                calcularNumeros();
                break;

            default:
                textView.setText(
                        textView.getText() + tipo
                );
        }


    }

    private void calcularNumeros(){

        String[] resultado = textView.getText().toString().split(" ");
        int[] nums = new int[2];
        int num = 0;
        int i = 1;

        nums[0] = Integer.valueOf(resultado[i-1]);

        num = nums[0];

        while (i<resultado.length){
            if (resultado[i].equals("*")){
                nums[1] = Integer.valueOf(resultado[i+1]);

                num *= nums[1];
            }

            if (resultado[i].equals("/")){
                nums[1] = Integer.valueOf(resultado[i+1]);

                num /= nums[1];
            }

            if (resultado[i].equals("+")){
                nums[1] = Integer.valueOf(resultado[i+1]);

                num += nums[1];
            }

            if (resultado[i].equals("-")){
                nums[1] = Integer.valueOf(resultado[i+1]);

                num -= nums[1];
            }
            i+=2;
        }

        textView.setText(String.valueOf(num));

        //Toast.makeText(this, "tipo:"+resultado[1]+".", Toast.LENGTH_LONG).show();

    }
}
