package com.android.espanol.listapersonalizada;

import java.util.List;

import android.R.anim;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class AdaptadorDeLista extends ArrayAdapter<Contacto> { //Debe de extender de ArrayAdapter 

	public AdaptadorDeLista(Context context,List<Contacto> ColeccionDeContactos)  
	//el constructor con el contexto y la coleccion de datoss
	{
		super(context, 0, ColeccionDeContactos);
	}
	
	//aquí es donde está "la magia"
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		//obtenemos el inflater que nos permitirá incluir un archivo xml dentro de la lista.
		View view = inflater.inflate(R.layout.list_item, null);
		/**obtenemos el archivo xml que creamos list_item.xml (si le ponen otro nombre, deben de cambiarlo)
		 *y ahora debemos de invocar a cada uno de los compoenentes del layout list_item.xml para que puedan
		 *interactuar con los atributos de la clase que queremos implementar, aquí es donde se decide donde va
		 *cada uno de los atributos de la clase y si se quiere cambiar algo específico.*/
		TextView textNombre = (TextView)view.findViewById(R.id.list_item_text_name); //es una instancia normal, solo que "view" es el que nos permite encontrar el componente gráfico
		TextView textMensaje = (TextView)view.findViewById(R.id.list_item_text_message); 
		TextView textFecha = (TextView)view.findViewById(R.id.list_item_text_date); //igual para ambos componentes
		
		/**Ahora, a asignar valores:
		 * con getItem(position) obtenemos el objeto (Contacto) de la colección que corresponde a la posición
		 * "position"  y con esto todos los atributos de dicha clase.
		 * Contaco.getNombre() = getItem(position).getNombre()
		 */
		textNombre.setText(getItem(position).getNombre());
		textMensaje.setText(getItem(position).getUltimoMensaje()); 
		textFecha.setText(getItem(position).getFechaUltimoMensaje());
		
		if(position%2!=0) //recordemos que inicia en 0, por lo que la posición 1 visualmente es 0 en la programación
		{
			textNombre.setTextColor(Color.RED);
			textMensaje.setTextColor(Color.RED); 
			textFecha.setTextColor(Color.RED);
		}		
		//En este ejemplo no utilizaremos el ImageView, pero se emplea de la misma forma que los textViews
		
		return view; //se retorna el layout instanciado para que sea "encajado" dentro de la lista
	}
}
