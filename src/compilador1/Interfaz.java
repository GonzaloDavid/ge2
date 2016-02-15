
package compilador1;
import java.io.BufferedReader;
import java_cup.runtime.*; 
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class Interfaz extends javax.swing.JFrame {
    private String vector[];
  
     public Interfaz() {
        initComponents(); 
        this.vector = new String[200];
  }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        compilar = new javax.swing.JButton();
        abrir = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        Ingreso = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        Csalida = new javax.swing.JTextArea();
        jScrollPane6 = new javax.swing.JScrollPane();
        error1 = new javax.swing.JTextArea();
        salir = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        Generacion = new javax.swing.JTextArea();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        compilar.setText("COMPILAR");
        compilar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                compilarActionPerformed(evt);
            }
        });

        abrir.setText("SELECCIONAR DE ARCHIVO");
        abrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abrirActionPerformed(evt);
            }
        });

        Ingreso.setColumns(20);
        Ingreso.setRows(5);
        jScrollPane3.setViewportView(Ingreso);

        Csalida.setColumns(20);
        Csalida.setRows(5);
        jScrollPane2.setViewportView(Csalida);

        error1.setColumns(20);
        error1.setRows(5);
        jScrollPane6.setViewportView(error1);

        salir.setText("Sacar a un archivo CSV");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });

        tabla.setColumns(20);
        tabla.setRows(5);
        jScrollPane4.setViewportView(tabla);

        Generacion.setColumns(20);
        Generacion.setRows(5);
        jScrollPane5.setViewportView(Generacion);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(112, Short.MAX_VALUE)
                        .addComponent(abrir)
                        .addGap(97, 97, 97))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 565, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(compilar, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75)
                        .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 154, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 565, Short.MAX_VALUE)
                    .addComponent(jScrollPane4)
                    .addComponent(jScrollPane5))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane6))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(compilar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(abrir, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(85, 85, 85))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
//String cadena =

	public void VCaracterEspecial()
{
	String cadena =this.Ingreso.getText();
                StringTokenizer st =new StringTokenizer(cadena);
		
         for(int i=0;i<vector.length&&st.hasMoreTokens();i++)
	{                       Pattern pat = Pattern.compile("[+|;|:|(|)|{|[|]||}|,|-|`|*|/|>|<|=|!|&|$|·]");
                                String s2;
				s2 = st.nextToken();
                                this.vector[i]=s2;
				Matcher mat = pat.matcher(s2);
				if (mat.matches()==true)
				{
                                    this.Csalida.append("Caracter especial : "+this.vector[i]+" ");
                                  
                                    this.Csalida.append("\n");
                                    
				} 
                                
        }	
} 
        
        
	public void VComentarios()
	{
		String cadena =this.Ingreso.getText();
                StringTokenizer st =new StringTokenizer(cadena);
		
         for(int i=0;i<vector.length&&st.hasMoreTokens();i++)
	{                       Pattern pat = Pattern.compile("^//.*");
                                String s2;
				s2 = st.nextToken();
                                this.vector[i]=s2;
				Matcher mat = pat.matcher(s2);
				if (mat.matches()==true)
				{
                                    this.Csalida.append("Comentario"+this.vector[i]+" ");
                                   
                                    this.Csalida.append("\n");
                                    
				} 
                                
        }	
        }
	public void VIdentificador()
	{
		String cadena =this.Ingreso.getText();
                StringTokenizer st =new StringTokenizer(cadena);
		
         for(int i=0;i<vector.length&&st.hasMoreTokens();i++)
	{                                   
                              String s2=st.nextToken();
                                this.vector[i]=s2;
                                Pattern pat1 = Pattern.compile("int|float|boolean|true|false|char|String|if|then|else|while|do|input|output|return|private|protect|public");
                                Pattern pat = Pattern.compile("[a-z]+(\\d*|_*|[a-z]*)(\\d*|[a-z]*)" );    
				Matcher mat = pat.matcher(s2); 
                                Matcher mat1 = pat1.matcher(s2); 
				if (mat.matches()==true&&mat1.matches()==false)
				{
                                    this.Csalida.append("identificador : "+this.vector[i]+" ");
                                
                                
                                    this.Csalida.append("\n");
                                 
				} 
                                    
                              
        }
        
}   public void VOperadorCompuestos()
	{
		String cadena =this.Ingreso.getText();
                StringTokenizer st =new StringTokenizer(cadena);
		
         for(int i=0;i<vector.length&&st.hasMoreTokens();i++)
	{                       Pattern pat = Pattern.compile("&&|==|!=|<=|>=");
                                String s2;
				s2 = st.nextToken();
                                this.vector[i]=s2;
				Matcher mat = pat.matcher(s2);
				if (mat.matches()==true)
				{
                                    this.Csalida.append("Operador compuesto : "+this.vector[i]+" ");
                                
                                    this.Csalida.append("\n");
                                    
				} 
                                
        }	
}
        public void VPalabraReservada()
	{
		String cadena =this.Ingreso.getText();
                StringTokenizer st =new StringTokenizer(cadena);
		
         for(int i=0;i<vector.length&&st.hasMoreTokens();i++)
            {                   Pattern pat = Pattern.compile("int|float|boolean|char|String|if|then|else|while|do|input|output|return|public|private|protect");
                                String s2;
				s2 = st.nextToken();
                                this.vector[i]=s2;
				Matcher mat = pat.matcher(s2);
				if (mat.matches()==true)
				{
                                    this.Csalida.append("palabra reservada : "+this.vector[i]+" "); 
                                 
                                    this.Csalida.append("\n");
                                    
				} 
                                
        }	
}
	public void VNumeros()
	{
		String cadena =this.Ingreso.getText();
                StringTokenizer st =new StringTokenizer(cadena);
		
         for(int i=0;i<vector.length&&st.hasMoreTokens();i++)
	{                      Pattern pat = Pattern.compile("-*\\d+");
                                String s2;
				s2 = st.nextToken();
                                this.vector[i]=s2;
				Matcher mat = pat.matcher(s2);
				if (mat.matches()==true)
				{
                                    this.Csalida.append("int : "+this.vector[i]+" "); 
                               
                                    this.Csalida.append("\n");
                                    
				} 
                                
        }	
}
	public void VString()
	{
		String cadena =this.Ingreso.getText();
                StringTokenizer st =new StringTokenizer(cadena);
		
         for(int i=0;i<vector.length&&st.hasMoreTokens();i++)
	{                       Pattern pat = Pattern.compile("''[a-z].*''");
                                String s2;
				s2 = st.nextToken();
                                this.vector[i]=s2;
				Matcher mat = pat.matcher(s2);
				if (mat.matches()==true)
				{
                                    this.Csalida.append("String : "+this.vector[i]+" "); 
                                 
                                    this.Csalida.append("\n");
                                    
				} 
                                
        }	
}
	public void VCharacteres()
	{
		String cadena =this.Ingreso.getText();
                StringTokenizer st =new StringTokenizer(cadena);
		
         for(int i=0;i<vector.length&&st.hasMoreTokens();i++)
            {                   Pattern pat = Pattern.compile("'.'");
                                String s2;
				s2 = st.nextToken();
                                this.vector[i]=s2;
				Matcher mat = pat.matcher(s2);
				if (mat.matches()==true)
				{
                                    this.Csalida.append("Char : "+this.vector[i]+" ");
                                
                                    this.Csalida.append("\n");
                                    
				} 
                                
        }	
}


	public void VBoleano()
{
		String cadena =this.Ingreso.getText();
                StringTokenizer st =new StringTokenizer(cadena);
		
         for(int i=0;i<vector.length&&st.hasMoreTokens();i++)
	{                      Pattern pat = Pattern.compile("true|false");
                                String s2;
				s2 = st.nextToken();
                                this.vector[i]=s2;
				Matcher mat = pat.matcher(s2);
				if (mat.matches()==true)
				{
                                    this.Csalida.append("Boolean : "+this.vector[i]+" "); 
                                    this.Csalida.append("\n");
                                    
				} else{}
                                
        }	
}
	public void VDecimal()
	{
		String cadena =this.Ingreso.getText();
                StringTokenizer st =new StringTokenizer(cadena);
		
         for(int i=0;i<vector.length&&st.hasMoreTokens();i++)
	{                       Pattern pat = Pattern.compile("-*\\d+,\\d+");
                                String s2;
				s2 = st.nextToken();
                                this.vector[i]=s2;
				Matcher mat = pat.matcher(s2);
				if (mat.matches()==true)
				{
                                    this.Csalida.append("Float :"+this.vector[i]+" "); 
                                  
                                    this.Csalida.append("\n");
                                    
				} 
                                
        }	
         
}     
       
        public void VErorr()
         {
         String cadena =this.Ingreso.getText();
                StringTokenizer st =new StringTokenizer(cadena);
		
         for(int i=0;i<vector.length&&st.hasMoreTokens();i++){
            Pattern pat = Pattern.compile("[+|;|:|(|)|[|]|{|}|,|-|`|*|/|>|<|=|!|&|$]");
            Pattern pat1 = Pattern.compile("^//.*");
            Pattern pat2 = Pattern.compile("[a-z]+(\\d*|_*|[a-z]*)(\\d*|[a-z]*)" ); 
            Pattern pat3 = Pattern.compile("&&|==|!=|<=|>=");
            Pattern pat4 = Pattern.compile("int|float|bool|char|String|if|then|else|while|do|input|output|return|private|public|protect");
            Pattern pat5 = Pattern.compile("-*\\d+");
            Pattern pat6 = Pattern.compile("''[a-z].*''");
            Pattern pat7 = Pattern.compile("'.'");
            Pattern pat8 = Pattern.compile("true|false");
            Pattern pat9 = Pattern.compile("-*\\d+,\\d+");
                                String s2;
				s2 = st.nextToken();
                                this.vector[i]=s2;
            Matcher mat = pat.matcher(s2);
            Matcher mat1 = pat1.matcher(s2);
            Matcher mat2 = pat2.matcher(s2);
            Matcher mat3 = pat3.matcher(s2);
            Matcher mat4 = pat4.matcher(s2);
            Matcher mat5 = pat5.matcher(s2);
            Matcher mat6 = pat6.matcher(s2);
            Matcher mat7 = pat7.matcher(s2); 
            Matcher mat8 = pat8.matcher(s2);
            Matcher mat9 = pat9.matcher(s2);
		if (mat.matches()==false&&mat1.matches()==false&&mat2.matches()==false&&mat3.matches()==false
                     &&mat4.matches()==false&&mat5.matches()==false&&mat6.matches()==false&&mat7.matches()==false
                     &&mat8.matches()==false&&mat9.matches()==false)
		{
                         this.Csalida.append("Error Lexico: "+this.vector[i]+" "); 
                         this.error1.append("El Error Lexico es el siguiente: "+this.vector[i]+"\n");
                         this.Csalida.append("\n");
                                    
		} 
                                
        }	
     }
	
  //*******************************************************************************************************************
        //SINTACTICO
         public void EDeclaracion()
        {
            String cadena =this.Ingreso.getText();
           StringTokenizer st =new StringTokenizer(cadena,"`");
		 for(int i=0;i<vector.length&&st.hasMoreTokens();i++)
	{ 
                            Pattern pat = Pattern.compile("[\\s]*(int|float|boolean|char|String)[\\s][a-z]+(\\d*|_*|[a-z]*)(\\d*|[a-z]*)[\\s][;|;][\\s]*");
                                String s2;
				s2 = st.nextToken();
                                Matcher mat = pat.matcher(s2);
                
				if (mat.matches()==true)
				{
                                    this.error1.append("Estructura_Declaracion\n"); 
                                                                     
				} 
        	
        }
        
        }
           public void EDeclaracionVector()
        {
            String cadena =this.Ingreso.getText();
           StringTokenizer st =new StringTokenizer(cadena,"`");
		 for(int i=0;i<vector.length&&st.hasMoreTokens();i++)
	{ 
                            Pattern pat = Pattern.compile("[\\s]*(int|float|boolean|char|String)[\\s]([a-z]*)[\\s]([)[\\s](\\d+)[\\s](])[\\s][;][\\s]*");
                                String s2;
				s2 = st.nextToken();
                                Matcher mat = pat.matcher(s2);
                
				if (mat.matches()==true)
				{
                                    this.error1.append("Estructura_Declaracion vector\n"); 
                                   
                                    
				} 
        	
        }
        
        }
     public void EDeclaracionFuncion()
        {
            String cadena =this.Ingreso.getText();
            StringTokenizer st =new StringTokenizer(cadena,"`");
 for(int i=0;i<vector.length&&st.hasMoreTokens();i++)
	{ 
Pattern pat1 = Pattern.compile("[\\s]*(private|public|protect)[\\s](void|int|float|String|char|boolean)[\\s][a-z]+(\\d*|_*|[a-z]*)(\\d*|[a-z]*)[\\s]*[(][\\s](((int|float|boolean|char|String)[\\s][a-z]+(\\d*|_*|[a-z]*)(\\d*|[a-z]*)[\\s])|((int|float|boolean|char|String)[\\s][{][\\s](-*\\d+)[\\s][}][\\s]))[)][\\s][{][\\s]*(int|float|boolean|char|String)[\\s][a-z]+(\\d*|_*|[a-z]*)(\\d*|[a-z]*)[\\s][;|;][\\s]*[}][\\s]*");
                                String s2 ;
                                s2 = st.nextToken();
                                Matcher mat = pat1.matcher(s2);
                     
				if (mat.matches()==true)
				{
                                   
                                    this.error1.append("Estructura_de_funcion\n"); 
                                  
                                    
				} 
        }
        
        }
        public void EDeclaracionIf()
        {
            String cadena =this.Ingreso.getText();
            StringTokenizer st =new StringTokenizer(cadena,"`");
		
         for(int i=0;i<vector.length&&st.hasMoreTokens();i++)
	{                    
                                String s2;
				s2 = st.nextToken();
                                this.vector[i]=s2;
   Pattern pat = Pattern.compile("[\\s]*(if)[\\s]*[(][\\s]-*\\d+[\\s](&&|==|!=|<=|>=|<|>)[\\s]-*\\d+[\\s][)][\\s][{][\\s]*then[\\s][a-z]+(\\d*|_*|[a-z]*)(\\d*|[a-z]*)[\\s][=][\\s]-*\\d+[\\s][+|-|*|/|][\\s]-*\\d+[\\s][;][\\s]*[}][\\s]*");
                            
                               
       				Matcher mat = pat.matcher(s2);
                               
				if (mat.matches()==true)
				{
                                    
                                    this.error1.append("Estructura_if\n"); 
                  
				} 
        }	
   }
     public void EDeclaracionWhile()
        {
            String cadena =this.Ingreso.getText();
            StringTokenizer st =new StringTokenizer(cadena,"`");
		
         for(int i=0;i<vector.length&&st.hasMoreTokens();i++)
	{                    
                                String s2;
				s2 = st.nextToken();
   Pattern pat = Pattern.compile("[\\s]*(while)[\\s]*[(][\\s]-*\\d+[\\s](&&|==|!=|<=|>=|<|>)[\\s]-*\\d+[\\s][)][\\s][{][\\s]*do[\\s][a-z]+(\\d*|_*|[a-z]*)(\\d*|[a-z]*)[\\s][=][\\s]-*\\d+[\\s][+|-|*|/|][\\s]-*\\d+[\\s][;][\\s]*[}][\\s]*");
                                Matcher mat = pat.matcher(s2);
				if (mat.matches()==true)
				{
                                    
                                    this.error1.append("Estructura_while\n"); 
                  
				} 
        }	
       
        
        }
      public void EDeclaracionDoWhile()
        {
            String cadena =this.Ingreso.getText();
            StringTokenizer st =new StringTokenizer(cadena,"`");
		
         for(int i=0;i<vector.length&&st.hasMoreTokens();i++)
	{                    
                                 String s2;
				s2 = st.nextToken();
                                this.vector[i]=s2;
Pattern pat = Pattern.compile("[\\s]*(do)[\\s][{][\\s]*[a-z]+(\\d*|_*|[a-z]*)(\\d*|[a-z]*)[\\s][=][\\s]-*\\d+[\\s][+|-|*|/|][\\s]-*\\d+[\\s][;][\\s]*[}][\\s]*(while)[\\s][(][\\s]-*\\d+[\\s](&&|==|!=|<=|>=|<|>)[\\s]-*\\d+[\\s][)][\\s]*");
       				Matcher mat = pat.matcher(s2);
                               
				if (mat.matches()==true)
				{
                                    
                                 this.error1.append("Estructura_do_while\n"); 
                                   
                                    
				} 
        }	
       }
      public void EDeclaracionIfElse()
        {
            String cadena =this.Ingreso.getText();
            StringTokenizer st =new StringTokenizer(cadena,"`");
		
         for(int i=0;i<vector.length&&st.hasMoreTokens();i++)
	{                    
                                String s2;
				s2 = st.nextToken();
 this.vector[i]=s2;
Pattern pat = Pattern.compile("[\\s]*(if)[\\s]*[(][\\s]-*\\d+[\\s](&&|==|!=|<=|>=|<|>)[\\s]-*\\d+[\\s][)][\\s][{][\\s]*then[\\s][a-z]+(\\d*|_*|[a-z]*)(\\d*|[a-z]*)[\\s][=][\\s]-*\\d+[\\s][+|-|*|/|][\\s]-*\\d+[\\s][;][\\s]*[}][\\s](else)[\\s][{][\\s]*[a-z]+(\\d*|_*|[a-z]*)(\\d*|[a-z]*)[\\s][=][\\s]-*\\d+[\\s][+|-|*|/][\\s]-*\\d+[\\s][;][\\s]*[}][\\s]*");
    
                               
       				Matcher mat = pat.matcher(s2);
                               
				if (mat.matches()==true)
				{
                                    
                                    this.error1.append("Estructura_if_else\n"); 
                                   
                                    
				} 
        }	
       
        
        }
       public void EAritetica()
     {
         String cadena =this.Ingreso.getText();
          StringTokenizer st =new StringTokenizer(cadena,"`");
		
         for(int i=0;i<vector.length&&st.hasMoreTokens();i++)
	{                    String s2;
				s2 = st.nextToken();
 Pattern pat = Pattern.compile("[\\s]*((-*\\d+)|(-*\\d+,\\d+)|([a-z]+(\\d*|_*|[a-z]*)(\\d*|[a-z]*)))[\\s]+[+|-|*|/][\\s]((-*\\d+)|(-*\\d+,\\d+)|([a-z]+(\\d*|_*|[a-z]*)(\\d*|[a-z]*)))[\\s][=][\\s]((-*\\d+)|(-*\\d+,\\d+)|[a-z]+(\\d*|_*|[a-z]*)(\\d*|[a-z]*))[\\s][;][\\s]*");
                               
				Matcher mat = pat.matcher(s2);
                               
				if (mat.matches()==true)
                               {
                                    this.error1.append("Estructura_Aritmetica\n"); 
                                   
                                    
				} 
     
     }
     }
        public void ELogica()
     {
         String cadena =this.Ingreso.getText();
          StringTokenizer st =new StringTokenizer(cadena,"`");
		
         for(int i=0;i<vector.length&&st.hasMoreTokens();i++)
	{                    String s2;
				s2 = st.nextToken();

 Pattern pat = Pattern.compile("[\\s]*((-*\\d+)|(-*\\d+,\\d+)|([a-z]+(\\d*|_*|[a-z]*)(\\d*|[a-z]*)))[\\s]+[+|-|*|/][\\s]((-*\\d+)|(-*\\d+,\\d+)|([a-z]+(\\d*|_*|[a-z]*)(\\d*|[a-z]*)))[\\s][=|<|>|!][=][\\s]((-*\\d+)|(-*\\d+,\\d+)|[a-z]+(\\d*|_*|[a-z]*)(\\d*|[a-z]*))[\\s][;][\\s]*");
                                
				Matcher mat = pat.matcher(s2);
                               
				if (mat.matches()==true)
                               {
                                    this.error1.append("Estructura_Logica\n"); 
                                   
                                    
				} 
     
     }
     }
         public void EAsignacion()
     {
         String cadena =this.Ingreso.getText();
          StringTokenizer st =new StringTokenizer(cadena,"`");
		
         for(int i=0;i<vector.length&&st.hasMoreTokens();i++)
	{                    String s2;
				s2 = st.nextToken();
 Pattern pat = Pattern.compile("[\\s]*(int)[\\s][a-z]+(\\d*|_*|[a-z]*)(\\d*|[a-z]*)[\\s][=][\\s](-*\\d+)[\\s][;][\\s]*");
 Pattern pat1 = Pattern.compile("[\\s]*[a-z]+(\\d*|_*|[a-z]*)(\\d*|[a-z]*)[\\s][=][\\s](-*\\d+)[\\s][;][\\s]*");
 Pattern pat2 = Pattern.compile("[\\s]*(float)[\\s][a-z]+(\\d*|_*|[a-z]*)(\\d*|[a-z]*)[\\s][=][\\s](-*\\d+,\\d+)[\\s][;][\\s]*");
 Pattern pat3 = Pattern.compile("[\\s]*(char)[\\s][a-z]+(\\d*|_*|[a-z]*)(\\d*|[a-z]*)[\\s][=][\\s]('.')[\\s][;][\\s]*");
 Pattern pat4 = Pattern.compile("[\\s]*(String)[\\s][a-z]+(\\d*|_*|[a-z]*)(\\d*|[a-z]*)[\\s][=][\\s](''[a-z].*'')[\\s][;][\\s]*");
 Pattern pat5 = Pattern.compile("[\\s]*[\\s][a-z]+(\\d*|_*|[a-z]*)(\\d*|[a-z]*)[\\s][=][\\s](-*\\d+,\\d+)[\\s][;][\\s]*");
 Pattern pat6 = Pattern.compile("[\\s]*[\\s][a-z]+(\\d*|_*|[a-z]*)(\\d*|[a-z]*)[\\s][=][\\s]('.')[\\s][;][\\s]*");
 Pattern pat7 = Pattern.compile("[\\s]*[\\s][a-z]+(\\d*|_*|[a-z]*)(\\d*|[a-z]*)[\\s][=][\\s](''[a-z].*'')[\\s][;][\\s]*");
 
                               Matcher mat = pat.matcher(s2);
                               Matcher mat1 = pat1.matcher(s2);
                               Matcher mat2 = pat2.matcher(s2);
                               Matcher mat3 = pat3.matcher(s2);
                               Matcher mat4 = pat4.matcher(s2);
                               Matcher mat5 = pat5.matcher(s2);
                               Matcher mat6 = pat6.matcher(s2);
                               Matcher mat7 = pat7.matcher(s2);
				if (mat.matches()==true|mat1.matches()==true|mat2.matches()==true|mat3.matches()==true
                                       | mat4.matches()==true|mat5.matches()==true|mat6.matches()==true|mat7.matches()==true)
                               {
                                    this.error1.append("Estructura_Asignacion\n"); 
                                   
                                    
				} 
     
     }
     }
     public void ErrorSintactico()
     {
          String cadena =this.Ingreso.getText();
            StringTokenizer st =new StringTokenizer(cadena,"`");
        for(int i=0;i<vector.length&&st.hasMoreTokens();i++)
	{ 
                String s2;
                s2 = st.nextToken();
 Pattern pat = Pattern.compile("[\\s]*(int|float|boolean|char|String)[\\s][a-z]+(\\d*|_*|[a-z]*)(\\d*|[a-z]*)[\\s][;|;][\\s]*");
Pattern pat1 = Pattern.compile("[\\s]*(private|public|protect)[\\s](void|int|float|String|char|boolean)[\\s][a-z]+(\\d*|_*|[a-z]*)(\\d*|[a-z]*)[\\s]*[(][\\s](((int|float|boolean|char|String)[\\s][a-z]+(\\d*|_*|[a-z]*)(\\d*|[a-z]*)[\\s])|((int|float|boolean|char|String)[\\s][{][\\s](-*\\d+)[\\s][}][\\s]))[)][\\s][{][\\s]*(int|float|boolean|char|String)[\\s][a-z]+(\\d*|_*|[a-z]*)(\\d*|[a-z]*)[\\s][;|;][\\s]*[}][\\s]*");
  Pattern pat2 = Pattern.compile("[\\s]*(if)[\\s]*[(][\\s]-*\\d+[\\s](&&|==|!=|<=|>=|<|>)[\\s]-*\\d+[\\s][)][\\s][{][\\s]*then[\\s][a-z]+(\\d*|_*|[a-z]*)(\\d*|[a-z]*)[\\s][=][\\s]-*\\d+[\\s][+|-|*|/|][\\s]-*\\d+[\\s][;][\\s]*[}][\\s]*");
 Pattern pat3 = Pattern.compile("[\\s]*(while)[\\s]*[(][\\s]-*\\d+[\\s](&&|==|!=|<=|>=|<|>)[\\s]-*\\d+[\\s][)][\\s][{][\\s]*(do)[\\s][a-z]+(\\d*|_*|[a-z]*)(\\d*|[a-z]*)[\\s][=][\\s]-*\\d+[\\s][+|-|*|/|][\\s]-*\\d+[\\s][;][\\s]*[}][\\s]*");
 Pattern pat4 = Pattern.compile("[\\s]*(do)[\\s][{][\\s]*[a-z]+(\\d*|_*|[a-z]*)(\\d*|[a-z]*)[\\s][=][\\s]-*\\d+[\\s][+|-|*|/|][\\s]-*\\d+[\\s][;][\\s]*[}][\\s]*(while)[\\s][(][\\s]-*\\d+[\\s](&&|==|!=|<=|>=|<|>)[\\s]-*\\d+[\\s][)][\\s]*");
 Pattern pat5 = Pattern.compile("[\\s]*(if)[\\s]*[(][\\s]-*\\d+[\\s](&&|==|!=|<=|>=|<|>)[\\s]-*\\d+[\\s][)][\\s][{][\\s]*then[\\s][a-z]+(\\d*|_*|[a-z]*)(\\d*|[a-z]*)[\\s][=][\\s]-*\\d+[\\s][+|-|*|/|][\\s]-*\\d+[\\s][;][\\s]*[}][\\s](else)[\\s][{][\\s]*[a-z]+(\\d*|_*|[a-z]*)(\\d*|[a-z]*)[\\s][=][\\s]-*\\d+[\\s][+|-|*|/][\\s]-*\\d+[\\s][;][\\s]*[}][\\s]*");
 Pattern pat6 = Pattern.compile("[\\s]*((-*\\d+)|(-*\\d+,\\d+)|([a-z]+(\\d*|_*|[a-z]*)(\\d*|[a-z]*)))[\\s]+[+|-|*|/][\\s]((-*\\d+)|(-*\\d+,\\d+)|([a-z]+(\\d*|_*|[a-z]*)(\\d*|[a-z]*)))[\\s][=][\\s]((-*\\d+)|(-*\\d+,\\d+)|[a-z]+(\\d*|_*|[a-z]*)(\\d*|[a-z]*))[\\s][;][\\s]*");
  Pattern pat7 = Pattern.compile("[\\s]*((-*\\d+)|(-*\\d+,\\d+)|([a-z]+(\\d*|_*|[a-z]*)(\\d*|[a-z]*)))[\\s]+[+|-|*|/][\\s]((-*\\d+)|(-*\\d+,\\d+)|([a-z]+(\\d*|_*|[a-z]*)(\\d*|[a-z]*)))[\\s][=|<|>|!][=][\\s]((-*\\d+)|(-*\\d+,\\d+)|[a-z]+(\\d*|_*|[a-z]*)(\\d*|[a-z]*))[\\s][;][\\s]*");
 Pattern pat8 = Pattern.compile("[\\s]*(int|float|boolean|char|String)[\\s]([)[\\s](-*\\d+)[\\s](])[\\s][;][\\s]*");
 Pattern pat9 = Pattern.compile("[\\s]*(int)[\\s][a-z]+(\\d*|_*|[a-z]*)(\\d*|[a-z]*)[\\s][=][\\s](-*\\d+)[\\s][;][\\s]*");
 Pattern pat10 = Pattern.compile("[\\s]*[a-z]+(\\d*|_*|[a-z]*)(\\d*|[a-z]*)[\\s][=][\\s](-*\\d+)[\\s][;][\\s]*");
 Pattern pat11 = Pattern.compile("[\\s]*(float)[\\s][a-z]+(\\d*|_*|[a-z]*)(\\d*|[a-z]*)[\\s][=][\\s](-*\\d+,\\d+)[\\s][;][\\s]*");
 Pattern pat12 = Pattern.compile("[\\s]*(char)[\\s][a-z]+(\\d*|_*|[a-z]*)(\\d*|[a-z]*)[\\s][=][\\s]('.')[\\s][;][\\s]*");
 Pattern pat13 = Pattern.compile("[\\s]*(String)[\\s][a-z]+(\\d*|_*|[a-z]*)(\\d*|[a-z]*)[\\s][=][\\s](''[a-z].*'')[\\s][;][\\s]*");
 Pattern pat14 = Pattern.compile("[\\s]*[\\s][a-z]+(\\d*|_*|[a-z]*)(\\d*|[a-z]*)[\\s][=][\\s](-*\\d+,\\d+)[\\s][;][\\s]*");
 Pattern pat15 = Pattern.compile("[\\s]*[\\s][a-z]+(\\d*|_*|[a-z]*)(\\d*|[a-z]*)[\\s][=][\\s]('.')[\\s][;][\\s]*");
 Pattern pat16 = Pattern.compile("[\\s]*[\\s][a-z]+(\\d*|_*|[a-z]*)(\\d*|[a-z]*)[\\s][=][\\s](''[a-z].*'')[\\s][;][\\s]*");
 
                              
                                                                                                   
                                  Matcher mat = pat.matcher(s2);
                                  Matcher mat1 = pat1.matcher(s2);
                                  Matcher mat2 = pat2.matcher(s2); 
                                  Matcher mat3 = pat3.matcher(s2);
                                  Matcher mat4 = pat4.matcher(s2);
                                  Matcher mat5 = pat5.matcher(s2);
                                  Matcher mat6 = pat6.matcher(s2);
                                  Matcher mat7 = pat7.matcher(s2);
                                  Matcher mat8 = pat8.matcher(s2);
                                   Matcher mat9 = pat9.matcher(s2);
                               Matcher mat10 = pat10.matcher(s2);
                               Matcher mat11 = pat11.matcher(s2);
                               Matcher mat12 = pat12.matcher(s2);
                               Matcher mat13 = pat13.matcher(s2);
                               Matcher mat14 = pat14.matcher(s2);
                               Matcher mat15 = pat15.matcher(s2);
                               Matcher mat16 = pat16.matcher(s2);
                                   
                                  
				if (mat.matches()==false&&mat1.matches()==false&&mat2.matches()==false&&mat3.matches()==false&&mat4.matches()==false&&mat5.matches()==false&&mat6.matches()==false&&mat7.matches()==false&&mat8.matches()==false&&mat9.matches()==false&&mat10.matches()==false&&mat11.matches()==false&&mat12.matches()==false
                                        &&mat13.matches()==false&&mat14.matches()==false&&mat15.matches()==false&&mat16.matches()==false)
				{
                                   
                                    this.error1.append("\nError sintactico bloque :\n "+s2+"\n\n"); 
                                  
                                   
				}   
        }
     }
     public void Vtabla()
     {
         String cadena =this.error1.getText();
          StringTokenizer st =new StringTokenizer(cadena);
		
         for(int i=0;i<vector.length&&st.hasMoreTokens();i++)
	{                    String s2;
				s2 = st.nextToken();
                            Pattern pat = Pattern.compile("Estructura_Declaracion");
                            Pattern pat1 = Pattern.compile("Estructura_de_funcion");
                            Pattern pat2 = Pattern.compile("Estructura_if");
                            Pattern pat3 = Pattern.compile("Estructura_while");
                            Pattern pat4 = Pattern.compile("Estructura_do_while");
                            Pattern pat5 = Pattern.compile("Estructura_if_else");
                            Pattern pat6 = Pattern.compile("Estructura_Aritmetica");
                            Pattern pat7 = Pattern.compile("Estructura_Logica");
				Matcher mat = pat.matcher(s2);
                                Matcher mat1 = pat1.matcher(s2);
                                Matcher mat2 = pat2.matcher(s2);
                                Matcher mat3 = pat3.matcher(s2);
                                Matcher mat4 = pat4.matcher(s2);
                                Matcher mat5 = pat5.matcher(s2);
                                Matcher mat6 = pat6.matcher(s2);
                                Matcher mat7 = pat7.matcher(s2);
                               
				if (mat.matches()==true)
                               {
                                   this.tabla.append("\nEstructura declaracion :\ntipo de dato\t identificador\tCaracter especialT\n"); 
                               } 
                                if (mat1.matches()==true)
                                {
                                   this.tabla.append("Estructura funcion:\ntipo de privacidad\ttipo de dato\t identificador\t Caracter especialPI\t Caracter especialPD\t Caracter especialLLI\ttipo de dato\t identificador\tCaracter especialT \tCaracter especialLLD\n"); 
                               } 
                                if (mat2.matches()==true)
                               {
                                   this.tabla.append("Estructura if:\npalabra reservadaIF\tCaracter especialPI\t int\toperador compuesto\t int\t Caracter especialPD\tCaracter especialLLI\tpalabra reservadaTHEN\tidentificador\tCaracter especialIgual\tint \t Caracter especialOperador\tint\tCaracter especialT\tCaracter especialLLD\n"); 
                               } 
                                if (mat3.matches()==true)
                               {
                                   this.tabla.append("Estructura while :\npalabra reservadaWHILE\tCaracter especialPI\t int\toperador compuesto\t int\t Caracter especialPD\tCaracter especialLLI\tpalabra reservadaDO\tidentificador\tCaracter especialIgual\tint \t Caracter especialOperador\tint\tCaracter especialT\tCaracter especialLLD\n"); 
                               } 
                                if (mat4.matches()==true)
                               {
                                   this.tabla.append("Estructura do while:\npalabra reservadaDO\tCaracter especialLLI\tidentificador\tCaracter especialIgual\tint \t Caracter especialOperador\tint\tCaracter especialT\tCaracter especialLLD\tpalabra reservadaWHILE\tCaracter especialPI\t int\toperador compuesto\t int\t Caracter especialPD\n"); 
                               } 
                                if (mat5.matches()==true)
                               {
                                   this.tabla.append("Estructura if else:\npalabra reservadaIF\tCaracter especialPI\t int\toperador compuesto\t int\t Caracter especialPD\tCaracter especialLLI\tpalabra reservadaTHEN\tidentificador\tCaracter especialIgual\tint \t Caracter especialOperador\tint\tCaracter especialT\tCaracter especialLLD\tpalabra reservadaELSE\tCaracter especialLLI\tidentificador\tCaracter especialIGUAL\tint\tCaracter especialOPERADOR\tint\tCaracter especialT\tCaracter especialLLD\n"); 
                              } 
                                if (mat6.matches()==true)
                               {
                                   this.tabla.append("Estructura Aritmetica:\nint o float\tCaracter especialLOPERADOR\tint o float\tOperador CompuestoARITMETICO\tint o float\tCaracter especialT\n"); 
                               } 
                                if (mat7.matches()==true)
                               {
                                   this.tabla.append("Estructura Logica:\nint o float\tCaracter especialLOPERADOR\tint o float\tOperador Logico\tint o float\tCaracter especialT\n"); 
                            } 
                                if (mat.matches()==false&&mat1.matches()==false&&mat2.matches()==false&&mat3.matches()==false&&mat4.matches()==false&&mat5.matches()==false&&mat6.matches()==false&&mat7.matches()==false)
				{
                                   
                                    this.tabla.setText("\nHay un error Sintactico\n "); 
                                  
                                   
				} 
                               
                                
     
     }
     
     }
    //************************************************************************************************************************
     //GENERACION DE CODIGO
     public void GeneradorArchivo()
         {
             try{
            String direccion1="C:\\Users\\DAVID PROAÑO\\Documents\\NetBeansProjects\\Compilador1\\GeneradorArchivo.txt";
		
		String cadena="\r\n";
		File abrir=new File (direccion1);
		FileWriter  w=new FileWriter(abrir);
		BufferedWriter bw = new BufferedWriter(w);
		PrintWriter wr =new PrintWriter(bw);
                String aux=this.error1.getText();	
		wr.write(cadena+aux);
                
            
		wr.close();
		bw.close();
	}catch(Exception ex)
	{
		JOptionPane.showMessageDialog(null, "La direccion del archivo esta incorrecta");
	}
             
         }
    public int Verificar()
            
    {
        int x =0;
    try{
          String direccion="C:\\Users\\DAVID PROAÑO\\Documents\\NetBeansProjects\\Compilador1\\GeneradorArchivo.txt";
			FileReader abrir=new FileReader(direccion);
			BufferedReader br = new BufferedReader(abrir);
			String cadena="";
                       
                        while((cadena=br.readLine())!=null) {
                         Pattern pat = Pattern.compile(".*Error.*");
                         Matcher mat = pat.matcher(cadena);
                        if (mat.matches()) {
                        x=1;
     JOptionPane.showMessageDialog(null, "NO SE PUEDE GENERAR CODIGO DEBIDO A QUE HAY ERRORES CORRIJA LOS ERRORES");
                break;
                
                    }      
                 }   
                   abrir.close();    
		}catch(Exception ex)
		{
			JOptionPane.showMessageDialog(null, "hay un error"+ex);
		}
    return x;
    }   
    
    
    
    public void CrearDeclaracion()
    {
    String cadena =this.Ingreso.getText();
             if(this.Verificar()==0)
             {
            
                StringTokenizer st =new StringTokenizer(cadena,"`");
		
         for(int i=0;i<vector.length&&st.hasMoreTokens();i++)
	{      Pattern pat = Pattern.compile("[\\s]*(int|float|boolean|char|String)[\\s][a-z]+(\\d*|_*|[a-z]*)(\\d*|[a-z]*)[\\s][;|;][\\s]*");
                            String s2;
				s2 = st.nextToken();
                                this.vector[i]=s2;
				Matcher mat = pat.matcher(s2);
				if (mat.matches()==true)
				{String aux ;
                                   aux="\nR"+(i+1);
                                   Generacion.append(aux);
                                    
		} 
            }	
    }
                             
                      
                        }   
                  
     public void CrearExpresionesAritmeticas()
    {
    String cadena =this.Ingreso.getText();
             if(this.Verificar()==0)
             {
            
                StringTokenizer st =new StringTokenizer(cadena,"`");
		
         for(int i=0;i<vector.length&&st.hasMoreTokens();i++)
	{     Pattern pat = Pattern.compile("[\\s]*((-*\\d+)|(-*\\d+,\\d+)|([a-z]+(\\d*|_*|[a-z]*)(\\d*|[a-z]*)))[\\s]+[+|-|*|/][\\s]((-*\\d+)|(-*\\d+,\\d+)|([a-z]+(\\d*|_*|[a-z]*)(\\d*|[a-z]*)))[\\s][=][\\s]((-*\\d+)|(-*\\d+,\\d+)|[a-z]+(\\d*|_*|[a-z]*)(\\d*|[a-z]*))[\\s][;][\\s]*");
                                String s2;
				s2 = st.nextToken();
                                this.vector[i]=s2;
				Matcher mat = pat.matcher(s2);
				if (mat.matches()==true)
				{
                          StringTokenizer st1 =new StringTokenizer(s2);
                           for(int j=0;j<vector.length&&st1.hasMoreTokens();j++)
                            {
                         Pattern pat1 = Pattern.compile("-*\\d+");
                         String s4;
                         s4 = st1.nextToken();
                         this.vector[i]=s4;
                        Matcher mat1 = pat1.matcher(s4);
                        if (mat1.matches()==true)
                        {    String  aux="";
                             aux+="\nStore R"+(i+1)+"->"+s4;
                         aux+="\nLoad R"+(i+1)+"->"+s4;
                        Generacion.append(aux);
                            }
                           
                            }
                          } 
                    }	
            }
      }  
     public void CrearExpresionesLogica()
    {
    String cadena =this.Ingreso.getText();
             if(this.Verificar()==0)
             {
           StringTokenizer st =new StringTokenizer(cadena,"`");
           for(int i=0;i<vector.length&&st.hasMoreTokens();i++)
	{     
  Pattern pat = Pattern.compile("[\\s]*((-*\\d+)|(-*\\d+,\\d+)|([a-z]+(\\d*|_*|[a-z]*)(\\d*|[a-z]*)))[\\s]+[+|-|*|/][\\s]((-*\\d+)|(-*\\d+,\\d+)|([a-z]+(\\d*|_*|[a-z]*)(\\d*|[a-z]*)))[\\s][=|<|>|!][=][\\s]((-*\\d+)|(-*\\d+,\\d+)|[a-z]+(\\d*|_*|[a-z]*)(\\d*|[a-z]*))[\\s][;][\\s]*");
                                String s2;
				s2 = st.nextToken();
                                this.vector[i]=s2;
				Matcher mat = pat.matcher(s2);
				if (mat.matches()==true)
				{
                           StringTokenizer st1 =new StringTokenizer(s2);
                           for(int j=0;j<vector.length&&st1.hasMoreTokens();j++)
                            {
                        Pattern pat1 = Pattern.compile("-*\\d+");
                        String s4;
                        s4 = st1.nextToken();
                        this.vector[i]=s4;
                        Matcher mat1 = pat1.matcher(s4);
                        if (mat1.matches()==true)
                        {    String  aux="";
                             aux+="\nStore R"+(i+1)+"->"+s4;
                         aux+="\nLoad R"+(i+1)+"->"+s4;
                        Generacion.append(aux);
                            }
                           
                            }
                          } 
                    }	
            }
      }  
                   
    private void compilarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_compilarActionPerformed
    this.Csalida.setText("");
    this.error1.setText("");
    this.tabla.setText("");
    this.Generacion.setText("");
    this.VPalabraReservada();
    this.VString();
    this.VBoleano();
    this.VCaracterEspecial();
    this.VCharacteres();
    this.VComentarios();
    this.VDecimal();
    this.VIdentificador();
    this.VNumeros();
    this.VOperadorCompuestos();
    this.VErorr();
    this.EDeclaracion();   
    this.EDeclaracionFuncion();
    this.ErrorSintactico();
    this.EDeclaracionIf();
    this.EDeclaracionWhile();
   this.EDeclaracionIfElse();
    this.EDeclaracionDoWhile();
    this.EAritetica();
    this.ELogica();
    this.EAsignacion();
    this.Vtabla(); 
    this.GeneradorArchivo();
    this.CrearDeclaracion();
    this.CrearExpresionesAritmeticas();
   //this.EDeclaracionVector();
    
    
    }//GEN-LAST:event_compilarActionPerformed

    private void abrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abrirActionPerformed
     try{
          String direccion="C:\\Users\\DAVID PROAÑO\\Documents\\NetBeansProjects\\Compilador1\\ejemplo.c.txt";
			FileReader abrir=new FileReader(direccion);
			BufferedReader br = new BufferedReader(abrir);
			String cadena="";
                        Ingreso.setText(" ");
                        while((cadena=br.readLine())!=null)     {
                           
                             Ingreso.append(cadena);
                             Ingreso.append("\n");
                      
                        }   
                   abrir.close();    
		}catch(Exception ex)
		{
			JOptionPane.showMessageDialog(null, "hay un error"+ex);
		}
    }//GEN-LAST:event_abrirActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        
	try{
            String direccion1="C:\\Users\\DAVID PROAÑO\\Documents\\NetBeansProjects\\Compilador1\\csv.txt";
		
		String cadena="\r\n";
		File abrir=new File (direccion1);
		FileWriter  w=new FileWriter(abrir);
		BufferedWriter bw = new BufferedWriter(w);
		PrintWriter wr =new PrintWriter(bw);
                String aux=this.Csalida.getText();	
		wr.write(cadena+aux);
                
            
		wr.close();
		bw.close();
	}catch(Exception ex)
	{
		JOptionPane.showMessageDialog(null, "La direccion del archivo esta incorrecta");
	}
    }//GEN-LAST:event_salirActionPerformed

    public static void main(String args[]) {
  
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Csalida;
    private javax.swing.JTextArea Generacion;
    private javax.swing.JTextArea Ingreso;
    private javax.swing.JButton abrir;
    private javax.swing.JButton compilar;
    private javax.swing.JTextArea error1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton salir;
    private javax.swing.JTextArea tabla;
    // End of variables declaration//GEN-END:variables
}
