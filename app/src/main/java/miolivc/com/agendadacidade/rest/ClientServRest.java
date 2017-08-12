package miolivc.com.agendadacidade.rest;
import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.os.AsyncTask;
import android.util.Log;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import com.google.gson.Gson;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.json.JSONObject;

import miolivc.com.agendadacidade.MainActivity;
import miolivc.com.agendadacidade.model.AlfabectResult;
import miolivc.com.agendadacidade.model.PessoaSimple;


/**
 * Created by laerton on 7/30/17.
 */

public class ClientServRest extends AsyncTask{
    private  int HTTP_COD_SUCESSO = 200;
    private  URL url ;
    private  MainActivity main;
    private ProgressDialog load;

    public ClientServRest(MainActivity main) {
        this.main = main;
    }

    private AlfabectResult buscaPorTermo(String termo)  {


        String urlString = "http://138.219.68.202:8081/api/busca/BuscaTermo/informatica";
        try {
            URL u = new URL(urlString);
            HttpURLConnection urlConnection = (HttpURLConnection) u.openConnection();

            InputStream in = urlConnection.getInputStream();
            BufferedReader streamReader = new BufferedReader(new InputStreamReader(in, "UTF-8"));

            StringBuilder responseStrBuilder = new StringBuilder();

            String inputStr;
            while((inputStr = streamReader.readLine()) != null){
                responseStrBuilder.append(inputStr);
            }

            Gson g = new Gson();
            AlfabectResult alfa = g.fromJson(responseStrBuilder.toString(),AlfabectResult.class);
            return  alfa;

        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    private String toString(InputStream is) throws IOException {

        byte[] bytes = new byte[1024];
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        int lidos;
        while ((lidos = is.read(bytes)) > 0) {
            baos.write(bytes, 0, lidos);
        }
        return new String(baos.toByteArray());
    }

    @Override
    protected void onPreExecute(){
        // Chamada do ProgressDialog
        load = ProgressDialog.show(this.main, "Por favor Aguarde ...", "Realizando Consulta ...");
    }


    @Override
    protected Object doInBackground(Object[] objects) {
        this.main.setResultado(buscaPorTermo(objects[0].toString()));
        return this.main.getResultado();
    }




}
