package ejemplos.mis.miscontactoslistados;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView reciclador;
    private RecyclerView.LayoutManager lmanager;
    private RecyclerView.Adapter adaptador;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Producto> datos = new ArrayList<Producto>();



        datos.add(new Producto(R.drawable.perro1,"Perro1","perrito1"));
        datos.add(new Producto(R.drawable.perro2,"Perro2","perrito2"));
        datos.add(new Producto(R.drawable.perro3,"perro3","perrito3"));
        datos.add(new Producto(R.drawable.perro4,"Perro4","perrito4"));


        reciclador = (RecyclerView)findViewById(R.id.reciclador);
        lmanager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false);
        reciclador.setLayoutManager(lmanager);

        adaptador = new ProductoAdaptador(datos);
        reciclador.setAdapter(adaptador);
    }
}
