package sv.edu.udb.ejercicio2discusionderesultadosguia2tb181979;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class DescuentosEstablecidosTB181979 extends AppCompatActivity {

    TextView txtSalarioBase;
    TextView txtNombreDos;
    TextView txtISSS;
    TextView txtAFP;
    TextView txtRENTA;
    TextView txtSalarioNeto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_descuentos_establecidos_tb181979);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        recibirDatos();
    }

    private void recibirDatos(){
        Bundle extras = getIntent().getExtras();
        double resultado = extras.getDouble("RESULTADO");
        String nombre = extras.getString("NOMBRE");
        double resultadoisss = extras.getDouble("RESULTADOISSS");
        double resultadoafp = extras.getDouble("RESULTADOAFP");
        double resultadorenta = extras.getDouble("RESULTADORENTA");
        double resultadofinal = extras.getDouble("RESULTADOFINAL");
        txtSalarioBase=findViewById(R.id.txtSalarioBase);
        txtSalarioBase.setText(String.valueOf(resultado));
        txtNombreDos=findViewById(R.id.txtNombreDos);
        txtNombreDos.setText(String.valueOf(nombre));
        txtISSS=findViewById(R.id.txtISSS);
        txtISSS.setText(String.valueOf(resultadoisss));
        txtAFP=findViewById(R.id.txtAFP);
        txtAFP.setText(String.valueOf(resultadoafp));
        txtRENTA=findViewById(R.id.txtRENTA);
        txtRENTA.setText(String.valueOf(resultadorenta));
        txtSalarioNeto=findViewById(R.id.txtSalarioNeto);
        txtSalarioNeto.setText(String.valueOf(resultadofinal));
    }
}