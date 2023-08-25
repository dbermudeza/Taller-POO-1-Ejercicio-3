
package com.mycompany.pootaller1ej3;
//Este codigo calcula el salario bruto, salario neto y retencion de la fuente de un trabajador en base a las horas que trabaja, el valor de dichas horas y el porcentaje de retencion de la fuente
public class POOtaller1ej3 {

    public static void main(String[] args) {
        float h,p,s,x,P,f;
        h = 48;            //Cantidad de horas que trabaja el trabajador
        p = 5000;          //Valor en $ de cada hora de trabajo
        s = h*p;           //Salario brutoi del trabajador
        P = (float) 12.5;  //Porcentaje de retención de la fuente
        x = ((s*P)/100);   //Cantidad de dindero que retiene la fuente
        f = s-x;           //Salario final del trabajador
        System.out.println("El salario bruto del trabajador es de " + s + "$");
        System.out.println("La retencion de la fuente es de " + x + "$");
        System.out.println("El salario neto del trabajador es de " + f + "$");
        
    }
}
