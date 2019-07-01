package edu.br.whatsapp;

import edu.br.whatsapp.modelo.Mensagem;
import edu.br.whatsapp.modelo.Usuario;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
		Usuario user1 = new Usuario("Zé", "8299583012");
		Usuario user2 = new Usuario("Maria", "7999583012");
        
        Mensagem msg = new Mensagem("Oi",user1,user2);
        System.out.println(msg.getTexto());
        System.out.println(msg.getHorario());
        
        
   
    }
}
