package com.fr4gus.android.oammblo.data;

import java.util.List;

import android.content.Context;
import android.net.Uri;

import com.fr4gus.android.oammblo.bo.Tweet;

/**
 * Abstracccion del servicio del API twitter
 * 
 * @author Franklin Garcia
 *
 * Mobiquity Inc. 2012
 */
public interface TwitterService {

    /**
     * Obtiene el timeline actual. TODO puede que sea necesario agregar 
     * parametros para no traer todo en una sola llamada
     * @return una lista de tweets del timeline del usuario
     * 
     */
    public List<Tweet> getTimeline();

    /**
     * Verifica la existencia de datos salvados relacionados con el login. 
     * En caso de que exista devuelve verdadero, falso en caso contrario. Utilice este metodo para no tener que solicitar de nuevo un token de acceso.
     * @return
     */
    public boolean checkForSavedLogin(Context ctx);

    
    /**
     * Al utilizar OAuth, el método invocara al browser para que el usuario se 
     * autentique con Twitter. Luego el usuario volvera a la aplicacion
     * Es necesario que la aplicacion acepte el protocolo <aqui protocolo> para
     * poder recibir el token de accesso
     * @return
     */
    public void requestOAuthAccessToken(Context ctx);
    
    public boolean authorize(Context context, Uri uriData);
}
