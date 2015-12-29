
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
        this.vector = new String[100];
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(97, Short.MAX_VALUE)
                        .addComponent(abrir)
                        .addGap(97, 97, 97))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 345, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(compilar, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75)
                        .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 533, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3))
                .addGap(160, 160, 160)
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
	{                       Pattern pat = Pattern.compile("[+|;|:|(|)|[|]|{|}|,|-|*|/|>|<|=|!|&|$]");
                                String s2;
				s2 = st.nextToken();
                                this.vector[i]=s2;
				Matcher mat = pat.matcher(s2);
				if (mat.matches()==true)
				{
                                    this.Csalida.append("Caracter especial : "+this.vector[i]+" ");
                                  //   this.aux1.append("Caracter especial ");
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
                                  //  this.aux1.append("identificador  ");
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
                                 //  this.aux1.append("Operador compuesto ");
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
                                 //  this.aux1.append("palabra reservada ");
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
                                //   this.aux1.append("int ");
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
                                //   this.aux1.append("String "); 
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
                                 //  this.aux1.append("Char ");
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
                                   // this.aux1.append("Boolean ");
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
                                  //  this.aux1.append("Float "); 
                                    this.Csalida.append("\n");
                                    
				} 
                                
        }	
         
}     
       
        public void VErorr()
         {
         String cadena =this.Ingreso.getText();
                StringTokenizer st =new StringTokenizer(cadena);
		
         for(int i=0;i<vector.length&&st.hasMoreTokens();i++){
            Pattern pat = Pattern.compile("[+|;|:|(|)|[|]|{|}|,|-|*|/|>|<|=|!|&|$]");
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
	public void ErrorLinea()
        {try{
          String direccion="C:\\Users\\DAVID PROAÑO\\Desktop\\CompiladoresAnalisador\\csv.txt";
			FileReader abrir=new FileReader(direccion);
			BufferedReader br = new BufferedReader(abrir);
			String cadena=" ";
                        error1.setText(" ");
                        while((cadena=br.readLine())!=null)     {
                            
                            if(cadena.equals("Error"))
                            {
                            error1.setText("Hay un error en la linea");
                            }else
                            {
                            error1.setText("No hay ningun error");
                            }
                      
                        }   
                   abrir.close();    
		}catch(Exception ex)
		{
			JOptionPane.showMessageDialog(null, "hay un error"+ex);
		}
        }
        
         public void EDeclaracion()
        {
            String cadena =this.Ingreso.getText();
            StringTokenizer st =new StringTokenizer(cadena);
		
         for(int i=0;i<vector.length&&st.hasMoreTokens();i++)
	{                       Pattern pat = Pattern.compile("int|float|boolean|char|string");
                                Pattern pat1 = Pattern.compile("[a-z]+(\\d*|_*|[a-z]*)(\\d*|[a-z]*)");
                                 Pattern pat2 = Pattern.compile("[;]");
                                
                                String s2;
				s2 = st.nextToken();
                                this.vector[i]=s2;
				Matcher mat = pat.matcher(this.vector[0]);
                               
                                Matcher mat1 = pat1.matcher(this.vector[1]);
                                
                                Matcher mat2 = pat2.matcher(this.vector[2]);
                                 
                                
				if (mat.matches()==true&&mat1.matches()==true&&mat2.matches()==true)
				{
                                    this.error1.setText("Estructura Declaracion"); 
                                   
                                    
				} else{
                               // this.error1.setText("error sintactico");
                                }
        }	
   
        
        }
     public void EDeclaracionFuncion()
        {
            String cadena =this.Ingreso.getText();
            StringTokenizer st =new StringTokenizer(cadena);
		
         for(int i=0;i<vector.length&&st.hasMoreTokens();i++)
	{                    
            String s2;
				s2 = st.nextToken();
                                this.vector[i]=s2;
                                Pattern pat = Pattern.compile("public|private|protect");
                                Pattern pat1 = Pattern.compile("void|int|float|String|Char|boolean");
                                Pattern pat2 = Pattern.compile("[a-z]+(\\d*|_*|[a-z]*)(\\d*|[a-z]*)");
                                Pattern pat3 = Pattern.compile("[(]");
                                Pattern pat4 = Pattern.compile("[)]");
                                Pattern pat5 = Pattern.compile("[{]");
                                Pattern pat8 = Pattern.compile("int|float|boolean|char|String");
                                Pattern pat9 = Pattern.compile("[a-z]+(\\d*|_*|[a-z]*)(\\d*|[a-z]*)");
                                Pattern pat10 = Pattern.compile("[;]");
                                Pattern pat6 = Pattern.compile("[}]");
                                
                                
                               
       				Matcher mat = pat.matcher(this.vector[0]);
                                Matcher mat1 = pat1.matcher(this.vector[1]);
                                Matcher mat2 = pat2.matcher(this.vector[2]);
                                Matcher mat3 = pat3.matcher(this.vector[3]);
                                Matcher mat4 = pat4.matcher(this.vector[4]);
                                Matcher mat5 = pat5.matcher(this.vector[5]);
                                Matcher mat6 = pat6.matcher(this.vector[9]);
                                Matcher mat8 = pat8.matcher(this.vector[6]);
                                Matcher mat9 = pat9.matcher(this.vector[7]);
                                Matcher mat10 = pat10.matcher(this.vector[8]);
                               
                                                              
				if (mat.matches()==true&&mat1.matches()==true&&mat2.matches()==true&&mat3.matches()==true
                                        &&mat4.matches()==true&&mat5.matches()==true&&mat6.matches()==true
                                        &&mat8.matches()==true&&mat9.matches()==true&&mat10.matches()==true)
				{
                                   
                                    this.error1.setText("Estructura de funcion"); 
                                  
                                    
				}   else
                                {
                             //   this.error1.setText("error sintactico");
                                }
                                
        }	
       
        
        }
     public void EDeclaracionIf()
        {
            String cadena =this.Ingreso.getText();
            StringTokenizer st =new StringTokenizer(cadena);
		
         for(int i=0;i<vector.length&&st.hasMoreTokens();i++)
	{                    
            String s2;
				s2 = st.nextToken();
                                this.vector[i]=s2;
                                Pattern pat = Pattern.compile("if");
                                Pattern pat1 = Pattern.compile("[(]");
                                Pattern pat2 = Pattern.compile("-*\\d+");
                                Pattern pat3 = Pattern.compile("&&|==|!=|<=|>=|<|>");
                                Pattern pat4 = Pattern.compile("-*\\d+");
                                Pattern pat5 = Pattern.compile("[)]");
                                Pattern pat6 = Pattern.compile("[{]");
                                Pattern pat7 = Pattern.compile("then");
                                Pattern pat8 = Pattern.compile("[a-z]+(\\d*|_*|[a-z]*)(\\d*|[a-z]*)");
                                Pattern pat9 = Pattern.compile("[=]");
                                Pattern pat10 = Pattern.compile("-*\\d+");
                                Pattern pat11 = Pattern.compile("[+|-|*|/|]");
                              Pattern pat12 = Pattern.compile("-*\\d+");
                              Pattern pat13 = Pattern.compile("[;]");
                                Pattern pat14 = Pattern.compile("[}]");
                                
                               
       				Matcher mat = pat.matcher(this.vector[0]);
                               
                                Matcher mat1 = pat1.matcher(this.vector[1]);
                                
                                Matcher mat2 = pat2.matcher(this.vector[2]);
                                Matcher mat3 = pat3.matcher(this.vector[3]);
                                Matcher mat4 = pat4.matcher(this.vector[4]);
                                Matcher mat5 = pat5.matcher(this.vector[5]);
                                Matcher mat6 = pat6.matcher(this.vector[6]);
                                Matcher mat7 = pat7.matcher(this.vector[7]);
                                Matcher mat8 = pat8.matcher(this.vector[8]);
                                Matcher mat9 = pat9.matcher(this.vector[9]);
                                Matcher mat10 = pat10.matcher(this.vector[10]);
                                Matcher mat11 = pat11.matcher(this.vector[11]);
                                Matcher mat12 = pat12.matcher(this.vector[12]);
                                Matcher mat13 = pat13.matcher(this.vector[13]);
                                Matcher mat14 = pat14.matcher(this.vector[14]);
				if (mat.matches()==true&&mat1.matches()==true&&mat2.matches()==true&&mat3.matches()==true
                                        &&mat4.matches()==true&&mat5.matches()==true&&mat6.matches()==true&&mat7.matches()==true
                                        &&mat8.matches()==true&&mat9.matches()==true&&mat10.matches()==true&&mat11.matches()==true
                                        &&mat12.matches()==true&&mat13.matches()==true&&mat14.matches()==true)
				{
                                    
                                    this.error1.setText("Estructura if"); 
                                  
                                    
				} else{
                                this.error1.setText("error sintactico");
                                }
        }	
       
        
        }
          public void EDeclaracionWhile()
        {
            String cadena =this.Ingreso.getText();
            StringTokenizer st =new StringTokenizer(cadena);
		
         for(int i=0;i<vector.length&&st.hasMoreTokens();i++)
	{                    
            String s2;
				s2 = st.nextToken();
                                this.vector[i]=s2;
                                Pattern pat = Pattern.compile("while");
                                Pattern pat1 = Pattern.compile("[(]");
                                Pattern pat2 = Pattern.compile("-*\\d+");
                                Pattern pat3 = Pattern.compile("&&|==|!=|<=|>=|<|>");
                                Pattern pat4 = Pattern.compile("-*\\d+");
                                Pattern pat5 = Pattern.compile("[)]");
                                Pattern pat6 = Pattern.compile("[{]");
                                Pattern pat7 = Pattern.compile("do");
                                Pattern pat8 = Pattern.compile("[a-z]+(\\d*|_*|[a-z]*)(\\d*|[a-z]*)");
                                Pattern pat9 = Pattern.compile("[=]");
                                Pattern pat10 = Pattern.compile("-*\\d+");
                                Pattern pat11 = Pattern.compile("[+|-|*|/|]");
                              Pattern pat12 = Pattern.compile("-*\\d+");
                              Pattern pat13 = Pattern.compile("[;]");
                                Pattern pat14 = Pattern.compile("[}]");
                                
                               
       				Matcher mat = pat.matcher(this.vector[0]);
                               
                                Matcher mat1 = pat1.matcher(this.vector[1]);
                                
                                Matcher mat2 = pat2.matcher(this.vector[2]);
                                Matcher mat3 = pat3.matcher(this.vector[3]);
                                Matcher mat4 = pat4.matcher(this.vector[4]);
                                Matcher mat5 = pat5.matcher(this.vector[5]);
                                Matcher mat6 = pat6.matcher(this.vector[6]);
                                Matcher mat7 = pat7.matcher(this.vector[7]);
                                Matcher mat8 = pat8.matcher(this.vector[8]);
                                Matcher mat9 = pat9.matcher(this.vector[9]);
                                Matcher mat10 = pat10.matcher(this.vector[10]);
                                Matcher mat11 = pat11.matcher(this.vector[11]);
                                Matcher mat12 = pat12.matcher(this.vector[12]);
                                Matcher mat13 = pat13.matcher(this.vector[13]);
                                Matcher mat14 = pat14.matcher(this.vector[14]);
				if (mat.matches()==true&&mat1.matches()==true&&mat2.matches()==true&&mat3.matches()==true
                                        &&mat4.matches()==true&&mat5.matches()==true&&mat6.matches()==true&&mat7.matches()==true
                                        &&mat8.matches()==true&&mat9.matches()==true&&mat10.matches()==true&&mat11.matches()==true
                                        &&mat12.matches()==true&&mat13.matches()==true&&mat14.matches()==true)
				{
                                    
                                    this.error1.setText("Estructura while"); 
                                 
                                    
				} else
                                {
                              //  this.error1.setText("error sintactico");
                                }
        }	
       
        
        }
          
          public void EDeclaracionDoWhile()
        {
            String cadena =this.Ingreso.getText();
            StringTokenizer st =new StringTokenizer(cadena);
		
         for(int i=0;i<vector.length&&st.hasMoreTokens();i++)
	{                    
            String s2;
				s2 = st.nextToken();
                                this.vector[i]=s2;
                                Pattern pat = Pattern.compile("do");
                                Pattern pat1 = Pattern.compile("[{]");
                                Pattern pat2 = Pattern.compile("[a-z]+(\\d*|_*|[a-z]*)(\\d*|[a-z]*)");
                                Pattern pat3 = Pattern.compile("[=]");
                                Pattern pat4 = Pattern.compile("-*\\d+");
                                Pattern pat5 = Pattern.compile("[+|-|*|/|]");
                                Pattern pat6 = Pattern.compile("-*\\d+");
                                Pattern pat7 = Pattern.compile("[;]");
                                Pattern pat8 = Pattern.compile("[}]");
                                Pattern pat9 = Pattern.compile("while");
                                Pattern pat10 = Pattern.compile("[(]");
                                Pattern pat11 = Pattern.compile("-*\\d+");
                                Pattern pat12 = Pattern.compile("&&|==|!=|<=|>=|<|>");
                                Pattern pat13 = Pattern.compile("-*\\d+");
                                Pattern pat14 = Pattern.compile("[)]");
  
       				Matcher mat = pat.matcher(this.vector[0]);
                               
                                Matcher mat1 = pat1.matcher(this.vector[1]);
                                
                                Matcher mat2 = pat2.matcher(this.vector[2]);
                                Matcher mat3 = pat3.matcher(this.vector[3]);
                                Matcher mat4 = pat4.matcher(this.vector[4]);
                                Matcher mat5 = pat5.matcher(this.vector[5]);
                                Matcher mat6 = pat6.matcher(this.vector[6]);
                                Matcher mat7 = pat7.matcher(this.vector[7]);
                                Matcher mat8 = pat8.matcher(this.vector[8]);
                                Matcher mat9 = pat9.matcher(this.vector[9]);
                                Matcher mat10 = pat10.matcher(this.vector[10]);
                                Matcher mat11 = pat11.matcher(this.vector[11]);
                                Matcher mat12 = pat12.matcher(this.vector[12]);
                                Matcher mat13 = pat13.matcher(this.vector[13]);
                                Matcher mat14 = pat14.matcher(this.vector[14]);
				if (mat.matches()==true&&mat1.matches()==true&&mat2.matches()==true&&mat3.matches()==true
                                        &&mat4.matches()==true&&mat5.matches()==true&&mat6.matches()==true&&mat7.matches()==true
                                        &&mat8.matches()==true&&mat9.matches()==true&&mat10.matches()==true&&mat11.matches()==true
                                        &&mat12.matches()==true&&mat13.matches()==true&&mat14.matches()==true)
				{
                                    
                                    this.error1.setText("Estructura do while"); 
                                   
                                    
				} else{
                             //   this.error1.setText("error sintactico");
                                }
        }	
      
        
        }
     public void EDeclaracionIfElse()
        {
            String cadena =this.Ingreso.getText();
            StringTokenizer st =new StringTokenizer(cadena);
		
         for(int i=0;i<vector.length&&st.hasMoreTokens();i++)
	{                    
            String s2;
				s2 = st.nextToken();
                                this.vector[i]=s2;
                                Pattern pat = Pattern.compile("if");
                                Pattern pat1 = Pattern.compile("[(]");
                                Pattern pat2 = Pattern.compile("-*\\d+");
                                Pattern pat3 = Pattern.compile("&&|==|!=|<=|>=|<|>");
                                Pattern pat4 = Pattern.compile("-*\\d+");
                                Pattern pat5 = Pattern.compile("[)]");
                                Pattern pat6 = Pattern.compile("[{]");
                                Pattern pat7 = Pattern.compile("then");
                                Pattern pat8 = Pattern.compile("[a-z]+(\\d*|_*|[a-z]*)(\\d*|[a-z]*)");
                                Pattern pat9 = Pattern.compile("[=]");
                                Pattern pat10 = Pattern.compile("-*\\d+");
                                Pattern pat11 = Pattern.compile("[+|-|*|/|]");
                                Pattern pat12 = Pattern.compile("-*\\d+");
                                Pattern pat13 = Pattern.compile("[;]");
                                Pattern pat14 = Pattern.compile("[}]");
                                Pattern pat15 = Pattern.compile("else");
                                Pattern pat16 = Pattern.compile("[{]");
                                Pattern pat17 = Pattern.compile("[a-z]+(\\d*|_*|[a-z]*)(\\d*|[a-z]*)");
                                Pattern pat18 = Pattern.compile("[=]");
                                Pattern pat19 = Pattern.compile("-*\\d+");
                                Pattern pat20 = Pattern.compile("[+|-|*|/|]");
                              Pattern pat21 = Pattern.compile("-*\\d+");
                              Pattern pat22 = Pattern.compile("[;]");
                               Pattern pat23 = Pattern.compile("[}]");
       				Matcher mat = pat.matcher(this.vector[0]);
                               
                                Matcher mat1 = pat1.matcher(this.vector[1]);
                                
                                Matcher mat2 = pat2.matcher(this.vector[2]);
                                Matcher mat3 = pat3.matcher(this.vector[3]);
                                Matcher mat4 = pat4.matcher(this.vector[4]);
                                Matcher mat5 = pat5.matcher(this.vector[5]);
                                Matcher mat6 = pat6.matcher(this.vector[6]);
                                Matcher mat7 = pat7.matcher(this.vector[7]);
                                Matcher mat8 = pat8.matcher(this.vector[8]);
                                Matcher mat9 = pat9.matcher(this.vector[9]);
                                Matcher mat10 = pat10.matcher(this.vector[10]);
                                Matcher mat11 = pat11.matcher(this.vector[11]);
                                Matcher mat12 = pat12.matcher(this.vector[12]);
                                Matcher mat13 = pat13.matcher(this.vector[13]);
                                Matcher mat14 = pat14.matcher(this.vector[14]);
                                Matcher mat15 = pat15.matcher(this.vector[15]);
                                Matcher mat16 = pat16.matcher(this.vector[16]);
                                Matcher mat17 = pat17.matcher(this.vector[17]);
                                Matcher mat18 = pat18.matcher(this.vector[18]);
                                Matcher mat19 = pat19.matcher(this.vector[19]);
                                Matcher mat20 = pat20.matcher(this.vector[20]);
                                Matcher mat21 = pat21.matcher(this.vector[21]);
                                Matcher mat22 = pat22.matcher(this.vector[22]);
                                Matcher mat23 = pat23.matcher(this.vector[23]);
				if (mat.matches()==true&&mat1.matches()==true&&mat2.matches()==true&&mat3.matches()==true
                                        &&mat4.matches()==true&&mat5.matches()==true&&mat6.matches()==true&&mat7.matches()==true
                                        &&mat8.matches()==true&&mat9.matches()==true&&mat10.matches()==true&&mat11.matches()==true
                                        &&mat12.matches()==true&&mat13.matches()==true&&mat14.matches()==true&&mat15.matches()==true
                                        &&mat16.matches()==true&&mat17.matches()==true&&mat18.matches()==true&&mat19.matches()==true
                                        &&mat20.matches()==true&&mat21.matches()==true&&mat22.matches()==true&&mat23.matches()==true)
				{
                                    
                                    this.error1.setText("Estructura if else"); 
                                   
                                    
				} else
                                {
                              //  this.error1.setText("error sintactico");
                                }
        }	
       
        
        }
  /*   public void Elogica()
     {
         String cadena =this.Ingreso.getText();
          StringTokenizer st =new StringTokenizer(cadena);
		
         for(int i=0;i<vector.length&&st.hasMoreTokens();i++)
	{                    String s2;
				s2 = st.nextToken();
                                 Pattern pat = Pattern.compile("-*\\d+");
                                 Pattern pat1 = Pattern.compile("[+|-|*|/]");
                                 Pattern pat2 = Pattern.compile("-*\\d+");
                                 Pattern pat3 = Pattern.compile("[=]");
                                 Pattern pat4 = Pattern.compile("-*\\d+");
                                 Pattern pat5 = Pattern.compile("[;]");
                                this.vector[i]=s2;
                                System.out.println(this.vector[i]);
				Matcher mat = pat.matcher(this.vector[0]);
                                Matcher mat1 = pat1.matcher(this.vector[1]);
                                
                                Matcher mat2 = pat2.matcher(this.vector[2]);
                                Matcher mat3 = pat3.matcher(this.vector[3]);
                                Matcher mat4 = pat4.matcher(this.vector[4]);
                                Matcher mat5 = pat5.matcher(this.vector[5]);
				if (mat.matches()==true&&mat1.matches()==true&&mat2.matches()==true&&mat3.matches()==true&&mat4.matches()==true&&mat5.matches()==true)
				{
                                    this.error1.setText("Estructura Logica"); 
                                   
                                    
				} else{
                                //this.error1.setText("error sintactico");
                                }
     
     }
     }*/
    private void compilarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_compilarActionPerformed
    this.Csalida.setText("");
    this.error1.setText("");
   // this.aux1.setText("");
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
    this.EDeclaracionIf();
    this.EDeclaracionIfElse();
    this.EDeclaracionDoWhile();
    this.EDeclaracionWhile();
    // this.Elogica();
   //  this.ErrorLinea();     
    }//GEN-LAST:event_compilarActionPerformed

    private void abrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abrirActionPerformed
     try{
          String direccion="C:\\Users\\DAVID PROAÑO\\Desktop\\CompiladoresAnalisador\\ejemplo.c.txt";
			FileReader abrir=new FileReader(direccion);
			BufferedReader br = new BufferedReader(abrir);
			String cadena=" ";
                        Ingreso.setText(" ");
                        while((cadena=br.readLine())!=null)     {
                           
                            Ingreso.append("\n");
                            Ingreso.append(cadena+" ");
                      
                        }   
                   abrir.close();    
		}catch(Exception ex)
		{
			JOptionPane.showMessageDialog(null, "hay un error"+ex);
		}
    }//GEN-LAST:event_abrirActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        
	try{
            String direccion1="C:\\Users\\DAVID PROAÑO\\Desktop\\CompiladoresAnalisador\\csv.txt";
		
		String cadena=" \n";
		File abrir=new File (direccion1);
		FileWriter  w=new FileWriter(abrir);
		BufferedWriter bw = new BufferedWriter(w);
		PrintWriter wr =new PrintWriter(bw);
                String aux=this.Csalida.getText();	
		wr.write(aux);
                
            
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
    private javax.swing.JTextArea Ingreso;
    private javax.swing.JButton abrir;
    private javax.swing.JButton compilar;
    private javax.swing.JTextArea error1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton salir;
    // End of variables declaration//GEN-END:variables
}
