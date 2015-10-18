/**
 *
 * @author Carlos Soto
 */

package Calculadora;


public class Operaciones {
    
    //Funcion para convertir de romano a arabico
    public int ConvertRomaninArabic(String Num){
       
        int ArabicNum=0;
        
        if(Num.length()>1){
        
            int Val0=ArabicNum=Convert(Num,Num.length()-1);
            
            int Val1=0;
            
            for(int i=Num.length()-2;i>=0;i--){
            Val1=Convert(Num,i);
            if(Val1>=Val0){ArabicNum+=Val1;}
            else{ArabicNum-=Val1;}
            Val0=Val1;}
        }
        else
        {
            ArabicNum=Convert(Num,Num.length()-1);
        }
        
        return ArabicNum;}
    
    //Devulve el equivalente en numeros arabicos de cualquier numero romano
    public int Convert (String Var, int Index){
        
        int Out=0;
        
        if(Var.charAt(Index)=='I'){Out=1;}
        else if(Var.charAt(Index)=='V'){Out=5;}
        else if(Var.charAt(Index)=='X'){Out=10;}
        else if(Var.charAt(Index)=='L'){Out=50;}
        else if(Var.charAt(Index)=='C'){Out=100;}
        else if(Var.charAt(Index)=='D'){Out=500;}
        else if(Var.charAt(Index)=='M'){Out=1000;}
        
        return Out;}
    
    //Funcion para convertir de arabico a romano
    public String ConvertArabicinRoman(int Num){
     
      String Unidad[]={"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};  
      String Decena[]={"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};  
      String Centena[]={"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};  

      int u=Num%10;  
      int d=(Num/10)%10;  
      int c=Num/100; 
      
      String RomanNum=new String();
      
      if(Num>=100){
          RomanNum = Centena[c] + Decena[d] + Unidad[u];}
      else{  
          if(Num>=10){
              RomanNum = Decena[d] + Unidad[u];}
          else{
              RomanNum = Unidad[Num];}}
    return RomanNum;}
    
    //Funcion para sumar el primer y el segundo numero de la clase principal
    public String Sumar(int NumA, int NumB){
        return Integer.toString(NumA+NumB);}
    
    //Funcion para restar el primer y el segundo numero de la clase principal
    public String Restar(int NumA, int NumB){
        return Integer.toString(NumA-NumB);}
    
    //Funcion para multiplicar el primer y el segundo numero de la clase principal
    public String Multiplicar(int NumA, int NumB){
        return Integer.toString(NumA*NumB);}
    
    //Funcion para dividir el primer y el segundo numero de la clase principal
    public String Dividir(int NumA, int NumB){
        return Integer.toString(NumA/NumB);}   
}
