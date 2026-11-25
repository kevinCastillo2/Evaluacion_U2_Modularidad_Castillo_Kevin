/*
Nombre: Kevin Castillo 
Fecha: 25-11-2026
*/

public class Ejercicio05 {
    static int sumaPares(int n){
        for(int i = 0; i < n; i++){
            System.out.println(i);

        }

    }

    static  Boolean esCapicua(String s){
        if(String.length() <= 1){
            return true; 
        }
        if(String.charAt(0) != String.chartAt(String length() -1)){
             return false; 

        }else{
            return esCapicua(String.Substring(1, String.length() -1))
        }
             

    }

    public static void main(String[] args) {
        int n; 
        sumaPares(10); 
        sumaPares(7); 

        esCapicua(12321);
    }


    
}
