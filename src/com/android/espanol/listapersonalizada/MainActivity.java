package com.android.espanol.listapersonalizada;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;


public class MainActivity extends Activity {

	private  ArrayList<Contacto> miColeccionDeContactos = new ArrayList<Contacto>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CrearContactos();        //se llena la colección
        ListView miListaDeContactos = (ListView)findViewById(R.id.custom_list); //se instacia la lista
        AdaptadorDeLista miAdapatadorPersonalizado = new AdaptadorDeLista(getApplicationContext(), miColeccionDeContactos); //se instacia el adaptador
        miListaDeContactos.setAdapter(miAdapatadorPersonalizado);      // se incrusta el adaptador en la lista
        
    }

    public void CrearContactos()
    {
    	 Contacto contacto1 = new Contacto("Alejandro","Nos Vemos","25/09/2014");
         Contacto contacto2 = new Contacto("Jaime","OK","24/09/2014");
         Contacto contacto3 = new Contacto("Juan","Ya aprendiste","23/09/2014");
         Contacto contacto4 = new Contacto("Pedro","Buenos tutoriales","24/09/2014");
        
        miColeccionDeContactos.add(contacto1);
        miColeccionDeContactos.add(contacto2);
        miColeccionDeContactos.add(contacto3);       
        miColeccionDeContactos.add(contacto4);
    }        
}
