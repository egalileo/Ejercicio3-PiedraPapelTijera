package ejercicio3.piedrapapeltijera;

import javax.swing.JOptionPane;

public class Ejercicio3PiedraPapelTijera {

    public static void main(String[] args) {
        int jugador=1, ganador1=0, ganador2=0, turno=1, intento1, intento2, opcion;
        boolean ganador = false;
        
        while(ganador == false ){
            while(turno <=3){
                do{
                    intento1 = Integer.parseInt(JOptionPane.showInputDialog("Jugador #"+jugador+" Ingrese su movimiento\n"
                            + "1. Piedra\n2. Papel\n3. Tijera"));
                    if((intento1<1) || (intento1>3)){
                        JOptionPane.showMessageDialog(null, "Jugador #"+jugador+" Ingrese un valor valido");
                    }
                }while((intento1<1) || (intento1>3));
                jugador = 2;
                do{
                    intento2 = Integer.parseInt(JOptionPane.showInputDialog("Jugador #"+jugador+" Ingrese su movimiento\n"
                            + "1. Piedra\n2. Papel\n3. Tijera"));
                    if((intento2<1) || (intento2>3)){
                        JOptionPane.showMessageDialog(null, "Jugador #"+jugador+" Ingrese un valor valido");
                    }
                }while((intento2<1) || (intento2>3));
                jugador = 1;
                
                if((intento1 == 1 && intento2 == 1) || (intento1 == 2 && intento2 == 2) || (intento1 == 3 && intento2 == 3)){
                    JOptionPane.showMessageDialog(null, "Empate.");
                }else if((intento1 == 1 && intento2 == 3) || (intento1 == 2 && intento2 == 1) || (intento1 == 3 && intento2 == 2)){
                    ganador1++;
                    turno++;
                    JOptionPane.showMessageDialog(null, "Ganador Jugador 1\nJugador1 ["+ganador1+"-"+ganador2+"] Jugador2");
                }else if((intento2 == 1 && intento1 == 3) || (intento2 == 2 && intento1 == 1) || (intento2 == 3 && intento1 == 2)){
                    ganador2++;
                    turno++;
                    JOptionPane.showMessageDialog(null, "Ganador Jugador 2\nJugador1 ["+ganador1+"-"+ganador2+"] Jugador2");
                }
                
                if(turno == 3){
                        if(ganador1>ganador2){
                            JOptionPane.showMessageDialog(null, "Ganador Jugador #1. Felicidades");
                            ganador=true;
                        }else if(ganador1<ganador2){
                            JOptionPane.showMessageDialog(null, "Ganador Jugador #2. Felicidades");
                            ganador=true;
                        }
                        opcion = Integer.parseInt(JOptionPane.showInputDialog("Desea seguir jugando? \n1.si\nCualquier otro para salir "));
                        if(opcion == 1 ){
                            jugador=1; turno=0; ganador1=0; ganador2=0; ganador=false;  
                        }else{
                            break;
                        }
                    }
            }
        }
    }
    
}

