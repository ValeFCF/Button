package com.Valentin.Botones;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class Principal extends Activity implements android.view.View.OnClickListener {

	TextView etiqueta, etiqueta2;
	Button boton,boton2; //ctrl + shift + o , para imprtar todo lo que no se ha importado
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        
        etiqueta=(TextView)findViewById(R.id.TV2);
        etiqueta2=(TextView)findViewById(R.id.TV4);
        boton=(Button)findViewById(R.id.BOTON);
        boton2=(Button)findViewById(R.id.BOTON2);
        boton2.setOnClickListener(this);
              
    }
    
    public void metodo(View V){
    	
    	etiqueta.setText("Texto que yo quiero");
    	
    	
    }

	public void onClick(View v) {  //esta se genera importando y metiendo "implements" en la clase
		// TODO Auto-generated method stub
	etiqueta2.setText("este lo use con el implements");	
		
	}


}
