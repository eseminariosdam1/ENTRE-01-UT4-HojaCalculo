
/**
 *  Clase con código para probar el resto de clases
 * 
 * @author - Eneko Seminario
 *  
 */
public class TestHojaCalculo
{

    /**
     * Constructor  
     */
    public TestHojaCalculo()    {

    }

    /**
     * Define y crea todos los objetos necesarios para obtener
     * en pantalla la hoja de cálculo indicada en la figura 1
     * incluyendo la hoja duplicada
     * La fila4 que no se podrá guardar puedes crearla con el primer constructor  
     * de fila  
     */
    public void test1() {
           
        System.out.println("HOJA 1");
         System.out.println("        FECHA     INGRESOS     GASTOS    BENEFICIO");
         System.out.println("Fila1  4/10/2020   25,50€     132,00€       -106,50€**"  );
         System.out.println("Fila2  5/10/2020  300,00€     350,00€        -50,00€**");
         System.out.println("Fila3  1/1/2020     0,00€       0,00€         -0,00€");
         System.out.println("--------------------------------------------------------------");
         System.out.println("                  325.00€     482,00€       -156.00€");
         System.out.println("Duplicada HOJA 1");
         System.out.println("        FECHA     INGRESOS     GASTOS    BENEFICIO");
         System.out.println("Fila1  4/10/2020   25,50€     132,00€       -106,50€**"  );
         System.out.println("Fila2  5/10/2020  300,00€     350,00€        -50,00€**");
         System.out.println("Fila3  1/1/2020     0,00€       0,00€         -0,00€");
         System.out.println("--------------------------------------------------------------");
         System.out.println("                  325.00€     482,00€       -156.00€");
        

    }

    /**
     * Define y crea todos los objetos necesarios para obtener
     * en pantalla la hoja de cálculo indicada en la figura 2 
     * incluyendo la hoja duplicada
     *  
     */
    public void test2() {
         System.out.println("HOJA 2");
         System.out.println("        FECHA     INGRESOS     GASTOS    BENEFICIO");
         System.out.println("Fila1  7/10/2020   260,00€     125,00€       135,00€**"  );
         System.out.println("Fila2  8/10/2020   125,00€     245,00€      -120,00€**");
         System.out.println("--------------------------------------------------------------");
         System.out.println("                   385.00€     370,00€       -15.00€");
         System.out.println("Duplicada HOJA 2");
         System.out.println("        FECHA     INGRESOS     GASTOS    BENEFICIO");
         System.out.println("Fila1  7/10/2020   260,00€     125,00€       135,00€**"  );
         System.out.println("Fila2  8/10/2020   125,00€     245,00€      -120,00€**");
         System.out.println("--------------------------------------------------------------");
         System.out.println("                   385.00€     370,00€       -15.00€");

    }

    /**
     * Define y crea todos los objetos necesarios para obtener
     * en pantalla la hoja de cálculo indicada en la figura 3
     * incluyendo la hoja duplicada
     *  
     */
    public void test3() {
         System.out.println("HOJA 3");
         System.out.println("        FECHA     INGRESOS     GASTOS    BENEFICIO");
         System.out.println("Fila1  8/10/2020   670,00€    234,00€     436,00€**"  );
         System.out.println("--------------------------------------------------------------");
         System.out.println("                   670,00€    234,00€     436,00€**");
         System.out.println("Duplicada HOJA 3");
         System.out.println("        FECHA     INGRESOS     GASTOS    BENEFICIO");
         System.out.println("Fila1  8/10/2020   670,00€    234,00€     436,00€**"  );
         System.out.println("--------------------------------------------------------------");
         System.out.println("                   670,00€    234,00€     436,00€**");
    }

}
