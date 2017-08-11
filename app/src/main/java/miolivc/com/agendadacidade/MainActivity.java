package miolivc.com.agendadacidade;

import android.support.design.widget.TabItem;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        TabItem tabContatos = (TabItem) findViewById(R.id.tab_contatos);
        TabItem tabFavoritos = (TabItem) findViewById(R.id.tab_favoritos);
        TabItem tabUsuario = (TabItem) findViewById(R.id.tab_usuario);

    }
}
