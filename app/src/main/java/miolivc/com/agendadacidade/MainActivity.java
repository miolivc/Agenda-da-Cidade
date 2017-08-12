package miolivc.com.agendadacidade;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.io.IOException;
import java.util.List;

import miolivc.com.agendadacidade.model.AlfabectResult;
import miolivc.com.agendadacidade.rest.ClientServRest;

public class MainActivity extends AppCompatActivity {
    private AlfabectResult resultado = null;

    public AlfabectResult getResultado() {
        return resultado;
    }

    public void setResultado(AlfabectResult resultado) {
        this.resultado = resultado;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                try {
                    AlfabectResult resulta = buscaTermo("informatica");
                    button.setText("teste");
//                    Toast toast = new Toast(MainActivity.CONTEXT_IGNORE_SECURITY);
//                    toast.makeText(this,resulta.getListaPessoaSimples().get(0).getNome(), Toast.LENGTH_LONG);
                    Log.d("TAG", "onCreate: " + resulta.getListaPessoaSimples());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            };
        });
        //MyService service = new MyService();


    }
    private AlfabectResult buscaTermo(String informatica) {
        ClientServRest cliente = new ClientServRest(MainActivity.this);
        cliente.execute(informatica);
        return MainActivity.this.getResultado();
    }


}
