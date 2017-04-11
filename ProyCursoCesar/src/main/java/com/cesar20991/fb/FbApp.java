package com.cesar20991.fb;

import java.util.List;

import com.restfb.Connection;
import com.restfb.DefaultFacebookClient;
import com.restfb.FacebookClient;
import com.restfb.Parameter;
import com.restfb.Version;
import com.restfb.types.GraphResponse;
import com.restfb.types.Page;
import com.restfb.types.Post;
import com.restfb.types.User;

public class FbApp {

	public static void main(String[] args) throws InterruptedException {
		// https://developers.facebook.com/tools/explorer/145634995501895/
		
		String token =" "; //poner su token aquí
		
		FacebookClient cliente = new DefaultFacebookClient(token, Version.LATEST);
		
		// Para usuario normal
		//User usuario = cliente.fetchObject("me?fields=id,name", User.class);
		System.out.println("======================================== ");
		User usuario = cliente.fetchObject("me", User.class, Parameter.with("fields", "name, birthday"));
		System.out.println(usuario.getName());
		System.out.println(usuario.getBirthday());
		
		// Para post de muro
		System.out.println("======================================== ");
		Connection<Post> muro = cliente.fetchConnection("me/feed", Post.class);
		int cont = 0;
		for(List<Post> elemento : muro){
			for(Post post : elemento){
				if(cont==44){
					break;
				}
				System.out.println("Post: " + post.getMessage());
				cont++;
			}
		}
		
		// Para fan page
		System.out.println("======================================== ");
		Page pagina = cliente.fetchObject("lifehacker", Page.class, Parameter.with("fields", "fan_count"));		
		System.out.println("La pagina lifehacker tiene "+pagina.getFanCount());
		
		
		// Hacer un post en tu muro y luego se elimina a los 3 segundos
		System.out.println("======================================== ");
		GraphResponse response = cliente.publish("me/feed", GraphResponse.class, Parameter.with("message","TEST FACEBOOK API "));
		System.out.println("el ID de GraphResponse response es: " + response.getId());
		Thread.sleep(3000);
		cliente.deleteObject(response.getId());
		// Si quieres postear como fan page, poner el token del fanpage
		
		 
		// POSTEAR EN EL MURO DE ALGUIEN - IMPORTANTE TENER EL ID DE LA OTRA PERSONA http://findmyfbid.com/ - ESTO NO FUNCIONA PQ LO TIENEN DESACTIVADO
		System.out.println("======================================== ");
		GraphResponse response_ = cliente.publish("1171262242/feed", GraphResponse.class, Parameter.with("message","PUBLICANDO EN OTRO USUARIO - FACEBOOK API "));
		System.out.println("el ID de GraphResponse response_ es: " + response_.getId());
		Thread.sleep(3000);
		cliente.deleteObject(response_.getId());
		
		
	}

}
