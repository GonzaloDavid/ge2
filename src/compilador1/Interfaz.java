
package compilador1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class Interfaz extends javax.swing.JFrame {

    public Interfaz() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        limpiar = new javax.swing.JButton();
        compilar = new javax.swing.JButton();
        abrir = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        Ingreso = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        Csalida = new javax.swing.JTextArea();
        jScrollPane6 = new javax.swing.JScrollPane();
        error1 = new javax.swing.JTextArea();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        limpiar.setText("CLEAR");
        limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(255, 255, 255)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(compilar, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(abrir)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(221, 221, 221)
                        .addComponent(limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 381, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addComponent(compilar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(abrir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
public void Verificar()
	{
                         if(this.VPalabraReservada()==true)
			{
				this.Csalida.append("Palabra reservada  ");
			}
                          if(this.VIdentificador()==true)
			{
				
				this.Csalida.append("Identificador  ");
			}
			if(this.VCaracterEspecial()==true)
			{
				
				this.Csalida.append("Caracter especial  ");
			}
			if(this.VOperadorCompuestos()==true)
			{
				
				this.Csalida.append("Operador compuesto  ");
			}
			if(this.VNumeros()==true)
			{
				
				this.Csalida.append("Int  ");
			}
			if(this.VDecimal()==true)
			{
				
				this.Csalida.append("Float  ");
			}
			if(this.VBoleano()==true)
			{
				
				this.Csalida.append("Boolean  ");
			}
			if(this.VCharacteres()==true)
			{
				
				this.Csalida.append("Char  ");
			}
			if(this.VComentarios()==true)
			{
				
				this.Csalida.append("");
			}
                        if(this.VString()==true)
			{
				
				this.Csalida.append("String  ");
			}
        if(this.VPalabraReservada()==false&&this.VComentarios()==false&&this.VCharacteres()==false&&this.VBoleano()==false
        &&this.VDecimal()==false&&this.VNumeros()==false&&this.VOperadorCompuestos()==false&&this.VCaracterEspecial()==false
                           &&this.VIdentificador()==false&&this.VString()==false )
                        {
                            this.Csalida.append("error  ");
                        }
            
	}
	public boolean VCaracterEspecial()
	{
		String cadena =this.Ingreso.getText();
			StringTokenizer st =new StringTokenizer(cadena);
			
				while (st.hasMoreTokens())
			{

				String s2;
				s2 = st.nextToken();
				Pattern pat = Pattern.compile("[+|;|:|(|)|[|]|{|}|,|-|*|/|>|<|=|!|&|$]");

				Matcher mat = pat.matcher(s2);
				if (mat.matches()==true)
				{
             					return true; 
				} 

			}

		return false;

	}
	public boolean VComentarios()
	{
		String cadena =this.Ingreso.getText();
			StringTokenizer st =new StringTokenizer(cadena);
			while (st.hasMoreTokens())
			{
				String s2;
				s2 = st.nextToken();
				Pattern pat = Pattern.compile("^//.*");

				Matcher mat = pat.matcher(s2);
				if (mat.matches()==true)
				{      
					return true; 
				} 

			}
		
		return false;

	}
	public boolean VIdentificador()
	{
		String cadena =this.Ingreso.getText();
			StringTokenizer st =new StringTokenizer(cadena);
			while (st.hasMoreTokens())
			{
				String s2;
				s2 = st.nextToken();
                               
				Pattern pat = Pattern.compile("[a-z]+(\\d*|_*|[a-z]*)(\\d*|[a-z]*)[^boolintchartruefalsestring]");

				Matcher mat = pat.matcher(s2);
				if (mat.matches()==true)
				{
					return true; 
                                
                                } 

			}
		return false;

	}


	public boolean VOperadorCompuestos()
	{
		String cadena =this.Ingreso.getText();
			StringTokenizer st =new StringTokenizer(cadena);
			while (st.hasMoreTokens())
			{
				String s2;
				s2 = st.nextToken();
				Pattern pat = Pattern.compile("&&|==|!=|<=|>=");
				Matcher mat = pat.matcher(s2);

				if (mat.matches()==true) {
			 
					return true;
				} 
			}
		
		return false;
	}


	public boolean VPalabraReservada()
	{
		String cadena =this.Ingreso.getText();
			StringTokenizer st =new StringTokenizer(cadena);
			while (st.hasMoreTokens())
			{
				String s2;
				s2 = st.nextToken();
				Pattern pat = Pattern.compile("int|float|bool|char|string|if|then|else|while|do|input|output|return");
				Matcher mat = pat.matcher(s2);
				if (mat.matches()==true) {
					return true;
				} else {

				}
			}
		return false;

	}
	public boolean VNumeros()
	{
	String cadena =this.Ingreso.getText();	
			StringTokenizer st =new StringTokenizer(cadena);
			while (st.hasMoreTokens())
			{
				String s2;
				s2 = st.nextToken();
				Pattern pat = Pattern.compile("-*\\d+");
				Matcher mat = pat.matcher(s2);
				if (mat.matches()==true) {
					
					return true;
				} else {

				}
			}
		return false;

	}
	public boolean VString()
	{
		String cadena =this.Ingreso.getText();
			StringTokenizer st =new StringTokenizer(cadena);
			while (st.hasMoreTokens())
			{
				String s2;
				s2 = st.nextToken();
				Pattern pat = Pattern.compile("''[a-z].*''");
				Matcher mat = pat.matcher(s2);
       				if (mat.matches()==true) {
				
					return true;
				} else {

				}
                        }
		return false;

	}
	public boolean VCharacteres()
	{
		String cadena =this.Ingreso.getText();
			StringTokenizer st =new StringTokenizer(cadena);
			while (st.hasMoreTokens())
			{
				String s2;
				s2 = st.nextToken();
				Pattern pat = Pattern.compile("'.'");
				Matcher mat = pat.matcher(s2);
				if (mat.matches()==true) {
                                    return true;
				} else {

				}

			}
		return false;

	}


	public boolean VBoleano()
	{String cadena =this.Ingreso.getText();
		StringTokenizer st =new StringTokenizer(cadena);
		while (st.hasMoreTokens())
		{
			String s2;

			Pattern pat = Pattern.compile("true|false");
			s2 = st.nextToken();
			Matcher mat = pat.matcher(s2);
			if (mat.matches()==true) {
		
				return true;
			} else {

			}
		}
	return false;

	}
	public boolean VDecimal()
	{String cadena =this.Ingreso.getText();
			StringTokenizer st =new StringTokenizer(cadena);
			
			while (st.hasMoreTokens())
			{
				String s2;
				s2 = st.nextToken();
				Pattern pat = Pattern.compile("-*\\d+,\\d+");
				Matcher mat = pat.matcher(s2);
				if (mat.matches()==true) {
			
					return true;
				} else {

				}

			}
		return false;

	}
	
	
	public void ErrorLinea()
	{
    
         int numero=1;
	String aux=Csalida.getText();
        StringTokenizer st =new StringTokenizer(aux);
			
			while (st.hasMoreTokens())
			{
				String s2;
				s2 = st.nextToken();
				Pattern pat = Pattern.compile("error");
				Matcher mat = pat.matcher(s2);
				if (mat.matches()==true) {
			String aux1="hay un error en la linea :"+numero;
                       
                        this.error1.setText(aux1);
            
	} else {
                      this.error1.setText("no hay ningun error");

				}

			}
		
        }
    private void compilarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_compilarActionPerformed
    this.Verificar();
    this.ErrorLinea();      
    }//GEN-LAST:event_compilarActionPerformed

    private void abrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abrirActionPerformed
     try{
          String direccion="C:\\Users\\DAVID PROAÑO\\Desktop\\CompiladoresAnalisador\\input.txt";
			FileReader abrir=new FileReader(direccion);
			BufferedReader br = new BufferedReader(abrir);
			String cadena=" ";
                        while((cadena=br.readLine())!=null)
                        
                      Ingreso.append(cadena);
                       abrir.close();
		}catch(Exception ex)
		{
			JOptionPane.showMessageDialog(null, "La direccion del archivo esta incorrecta"+ex);
		}
    
    }//GEN-LAST:event_abrirActionPerformed

    private void limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarActionPerformed
        this.Ingreso.setText("");
        this.Csalida.setText("");
        this.error1.setText("");
    }//GEN-LAST:event_limpiarActionPerformed

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
    private javax.swing.JButton limpiar;
    // End of variables declaration//GEN-END:variables
}
