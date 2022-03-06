package sv.edu.udb.ejercicio2discusionderesultadosguia2tb181979;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView txtNombre;
    private TextView txtHoras;
    final double hora = 8.5;
    final double isss = 0.02;
    final double afp = 0.03;
    final double renta = 0.04;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtNombre=findViewById(R.id.txtNombre);
        txtHoras=findViewById(R.id.txtHoras);
    }

    public void calculos(View tv){
        String nombres = String.valueOf(txtNombre.getText());
        int numhoras=Integer.parseInt(String.valueOf(txtHoras.getText()));
        //hora = $8.5
        //ISSS 2%
        //AFP 3%
        //Renta 4%
        double resultado= numhoras*hora;
        double resultadoisss=numhoras*isss;
        double resultadoafp=numhoras*afp;
        double resultadorenta=numhoras*renta;
        double resultadofinal=resultado-resultadoisss-resultadoafp-resultadorenta;
        Intent intent = new Intent(MainActivity.this, DescuentosEstablecidosTB181979.class);
        intent.putExtra("NOMBRE", nombres);
        intent.putExtra("RESULTADO",resultado);
        intent.putExtra("RESULTADOISSS",resultadoisss);
        intent.putExtra("RESULTADOAFP",resultadoafp);
        intent.putExtra("RESULTADORENTA",resultadorenta);
        intent.putExtra("RESULTADOFINAL",resultadofinal);
        startActivity(intent);
    }
}