package ejemplos.mis.miscontactoslistados;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by nicopro on 15/5/16.
 */
public class ProductoAdaptador extends RecyclerView.Adapter<ProductoAdaptador.productoViewHolder>{



    public ProductoAdaptador(ArrayList<Producto> item) {
        this.item = item;
    }
    private ArrayList <Producto> item;



    @Override
    public productoViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {


        //tengo que inflar el layout que quiero mostrar
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_productos,parent,false);
        productoViewHolder producto = new productoViewHolder(v);
        return producto;
    }

    @Override
    public void onBindViewHolder(productoViewHolder productoViewHolder, int i) {
        //trae la informacion uno a uno muestro cada item

        productoViewHolder.nombre.setText(item.get(i).getNombre_p());
        productoViewHolder.precio.setText(item.get(i).getPrecio_p());
        productoViewHolder.imagen.setImageResource(item.get(i).getImagen_p());

        productoViewHolder.imagen.setBackgroundColor(item.get(i).getColor_p());

    }

    @Override
    public int getItemCount() {
        return item.size();
        //cuanto va a ser el tamaño de los items
    }

    public class productoViewHolder extends RecyclerView.ViewHolder{

        TextView nombre,precio;
        ImageView imagen;


        public productoViewHolder(View itemView) {
            super(itemView);

            nombre = (TextView)itemView.findViewById(R.id.TextView_nombre);
            precio = (TextView)itemView.findViewById(R.id.TextView_precio);
            imagen = (ImageView)itemView.findViewById(R.id.ImageView_producto);


        }
    }
}
