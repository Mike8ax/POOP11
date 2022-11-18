/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop11;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import static java.lang.Float.parseFloat;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author poo01alu09
 */
public class POOP11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        Alumno alumno = new Alumno();
        
        // TODO code application logic here
        System.out.println("########### File ##########");
        File archivo=new File("archivo.txt");
        System.out.println(archivo.exists());
        boolean seCreo;
        // el archivo debe estar en la carpeta src   
        try {
            seCreo =archivo.createNewFile();
            //si ya existe antes aqui te va a lanzar un falso xd
            System.out.println(seCreo);
            System.out.println(archivo.exists());
        } catch (IOException ex) {
            Logger.getLogger(POOP11.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
        System.out.println("########## FileWriter");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Escribe texto para el archivo: ");
        String texto =br.readLine();
        System.out.println(texto);
        } catch(IOException ex){
            Logger.getLogger(POOP11.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("##################");
        try{
        FileWriter fw= new FileWriter("fw.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter salida =new PrintWriter(bw);
        salida.println("esto es una impresion de texto en el archivo");
        salida.println("esto es la segunda linea");
        for(int i=0; i<10; i++){
            salida.println("Linea Escrita por el for "+i);
        }
        salida.close();
        
        } catch (IOException ex){
            Logger.getLogger(POOP11.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        System.out.println("######### file reaDER########");
        try{
        FileReader fr = new FileReader("fw.txt");
        BufferedReader br = new BufferedReader (fr);
            System.out.println("El texto del archivo es :");
            String linea =br.readLine();
            while(linea != null){
                System.out.println(linea);
                linea=br.readLine();
            }
            br.close();
        }catch(FileNotFoundException ex){
            Logger.getLogger(POOP11.class.getName()).log(Level.SEVERE, null, ex);
            
        } catch(IOException ex){
        Logger.getLogger(POOP11.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("################ sout alumno ########");
        try{
        FileWriter fw= new FileWriter("listaAlumnos.csv");
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter salida =new PrintWriter(bw);
        salida.println("Diego Leonardo,Castillo,Martinez,319041538,10,9.4");
        salida.close();
        
        } catch (IOException ex){
            Logger.getLogger(POOP11.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        System.out.println("######### file reaDER########");
        try{
        FileReader fr = new FileReader("listaAlumnos.csv");
        BufferedReader br = new BufferedReader (fr);
            System.out.println("El texto del archivo es :");
            String linea =br.readLine();
            StringTokenizer tokenizador=new StringTokenizer(linea,",");
            String [] aux = new String [6];
            int i=0;
            while(tokenizador.hasMoreTokens()){
                String token=tokenizador.nextToken();
                aux[i]=token;
                
                System.out.println(token);
                i=i+1;
                
            }
           alumno.setNombre(aux[0]);
           alumno.setApePaterno(aux[1]);
           alumno.setApeMaterno(aux[2]);
           alumno.setNumCuenta(Integer.parseInt(aux[3]));
           alumno.setEdad(Integer.parseInt(aux[4]));
           alumno.setPrimedio(parseFloat(aux[5]));
              br.close();
        }catch(FileNotFoundException ex){
            Logger.getLogger(POOP11.class.getName()).log(Level.SEVERE, null, ex);
            
        } catch(IOException ex){
        Logger.getLogger(POOP11.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        System.out.println(alumno);
        
        
        
        
        
        
        
    }
    
}
