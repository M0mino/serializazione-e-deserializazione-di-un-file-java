package it.momo;

import java.io.File;
import java.io.IOException;
import java.sql.Date;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {

        classe momo = new classe();
        alunno a1= new alunno("momo","momino",new Date(2003, 12, 24));
        alunno a2= new alunno("bob","bianchi",new Date(2004, 5, 16));
        alunno a3= new alunno("marco","rossi",new Date(2005, 2, 5));
        alunno a4= new alunno("gianni","verdi",new Date(3030, 7, 20));

        momo.LAlunni.add(a1);
        momo.LAlunni.add(a2);
        momo.LAlunni.add(a3);
        momo.LAlunni.add(a4);


        XmlMapper xmlMapper = new XmlMapper();
        xmlMapper.writeValue(new File("Classe.xml"), momo);


    }

}
