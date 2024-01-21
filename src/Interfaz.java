import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import static java.awt.Font.PLAIN;

// public class Interfaz extends JFrame {    
//     public Interfaz () {
//         setBounds(70, 70, 400, 500);
//         setDefaultCloseOperation(EXIT_ON_CLOSE);
//         setTitle("Súper Calculadora");
//         iniciarcomponentes();
        
//     }
//     private void iniciarcomponentes(){
//         JPanel panel = new JPanel(); 
//         panel.setBackground(Color.DARK_GRAY);
//         JPanel panel2 = new JPanel(); 
//         panel2.setSize(300, 400);;
//         panel.add(panel2);

//         this.getContentPane().add(panel);
//     }
// }

public class Interfaz extends JFrame {

    //Display para mostrar los números
    JLabel display;
    //Cantidad de botones de calculadora
    int numBotones = 18;
    //Array de botones para números y operaciones
    JButton botones[] = new JButton[numBotones];
    //Array de strings para las etiquetas de los botones
    String textoBotones[] = {"7","8","9","C","4","5","6","x","/","1","2","3","+","-","0",".","Exp","Ans"};
    //Array de posiciones en X de cada botón
    int xBotones[] = {15, 80, 145, 210, 15, 80, 145, 210, 275, 15, 80, 145, 210, 275, 15, 80, 145, 210};
    //Array de posiciones en Y de cada botón
    int yBotones[] = {90, 90, 90, 90, 155, 155, 155, 155, 155, 220, 220, 220, 220, 220, 285, 285, 285, 285};

    //Alto y ancho de cada botón
    int anchoBoton = 50;
    int altoBoton = 50;
    //Para indicar que he terminado de escribir dígitos un número y que voy a añadir el siguiente
    boolean nuevoNumero = true;
    //Para indicar si ya he utilizado el punto decimal en ese número (solo puede haber uno)
    boolean puntoDecimal = false;
    //Para almacenas los resultados parciales y totales de las operaciones realizadas
    double operando1 = 0;
    double operando2 = 0;
    double resultado = 0;
    //Para almacenar el string de la operación realizada (+, -, *, /)
    String operacion = "";



    
    public Interfaz(){

        initDisplay(); //Display de la calculadora
        initBotones(); //Botones de la calculadora
        initPantalla(); //Opciones del JFrame
        eventosNumeros(); //Eventos asociados a los botones de números de la calculadora
        eventoDecimal(); //Eventos asociados al botón decimal "." de la calculadora
        eventosOperaciones(); //Eventos asociados a los botones de operaciones (+,-,*,/) de la calculadora
        eventoResultado();  //Eventos asociados al botón resultado de la calculadora
        eventoLimpiar();  //Eventos asociados al botón de limpiar "C" de la calculadora

    }

    private void initDisplay(){

        display = new JLabel("0"); //Inicio JLabel
        display.setBounds(15, 15, 310, 60); //Posición y dimensiones
        display.setOpaque(true); //Para poder darle un color de fondo
        Color fondoRTA=new Color(132,167,161);
        display.setBackground(fondoRTA); //Color de fondo
        display.setForeground(Color.BLACK); //Color de fuente
        display.setBorder(new LineBorder(Color.DARK_GRAY)); //Borde
        display.setFont(new Font("MONOSPACED", PLAIN, 24)); //Fuente
        display.setHorizontalAlignment(SwingConstants.RIGHT); //Alineamiento horizontal derecha
        add(display); //Añado el JLabel al JFrame
    }

    private void initBotones(){
        System.out.println(textoBotones.length);
        System.out.println(xBotones.length);
        System.out.println(yBotones.length);

        for (int i = 0; i < numBotones; i++){
            botones[i] = new JButton(textoBotones[i]); //Inicializo JButton
            int size = (i == 3) | (i == 17) ? 24 : 16; //EL botón de Resultado tendrá un tamaño de fuente menor que todos los demás
            int ancho = (i == 3) | (i == 17) ? 120 : anchoBoton; //EL botón de Resultado será más ancho que todos los demás

            /*
            La línea anterior es el OPERADOR TERNARIO equivalente a la siguiente estructura if-else
            if (i == 0){
                int ancho = 245;
            }
            else{
                int ancho = anchoBoton;
            }
            */
            botones[i].setBounds(xBotones[i],yBotones[i],ancho,altoBoton); //Posición y dimensiones
            botones[i].setFont(new Font("MONOSPACED",PLAIN,size)); //Fuente
            botones[i].setOpaque(true); //Para poder darle un color de fondo
            botones[i].setFocusPainted(false); //Para que no salga una recuadro azul cuando tenga el foco
            Color fondoRTA=new Color(31,110,140);
            botones[i].setBackground(fondoRTA); //Color de fondo
            botones[i].setForeground(Color.WHITE); //Color de fuente
            // BordeRedondo border = new BordeRedondo(10);
            // botones[i].setBorder(border);
            botones[i].setBorder(new LineBorder(Color.DARK_GRAY)); //Borde
            add(botones[i]); //Añado el JButton al JFrame
        }

    }

    private void initPantalla() {

        setLayout(null); //Layout absoluto
        setTitle("Calculadora"); //Título del JFrame
        setSize(355, 400); //Dimensiones del JFrame
        setResizable(false); //No redimensionable
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Cerrar proceso al cerrar ventana
        Color fondo =new Color(33,53,85);
        getContentPane().setBackground(fondo); //Color de fondo
        setVisible(true); //Mostrar JFrame
    }

    
    private void eventosNumeros() {

    }

    private void eventoDecimal(){

    }

    private void eventosOperaciones() {

    }

    private void eventoResultado() {

    }

    private void eventoLimpiar() {

    }

    public static void main(String[] args) {
        new Interfaz();
    }

}
