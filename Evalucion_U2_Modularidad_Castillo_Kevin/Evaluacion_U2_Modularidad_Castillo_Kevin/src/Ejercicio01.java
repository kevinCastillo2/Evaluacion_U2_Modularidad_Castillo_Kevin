/*
Nombre: Kevin Castillo 
Fecha: 25-11-2026
*/

public class Ejercicio01 {
    static int f(int x){
        return x * x; 
    }

    static int g(int x){
        return f(x) + f(x + 1); 
    }

    public static void main(String[] args) {
        int x = 2; 
        
        System.out.println(g(x) + " " + f(g(1)));
        System.out.println(x); 
    }
    
}
/*
Salida del programa: La salida exacta es es que en la primera salida ya que hay dos lineas de salida en la primera es el g(x): 13 con f(g(x:1)): 25 
y en la segunda salida da el int 2 ya que pide salir x. 
*/