package g_nomina;

import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Calendar;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class nomina extends javax.swing.JFrame {
    
    public nomina() {
        initComponents();
        int contador = 1;
        String dato = "";
        String[] empleados, sueldos, seguros, empleado = new String [3];
        DefaultTableModel tabla = (DefaultTableModel) Empleados1.getModel();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/imagenes/LOGO SUPER AYALA.png")));
        File archivo1 = new File("..\\G_nomina\\Información\\Empleados.txt");
        File archivo2 = new File("..\\G_nomina\\Información\\Sueldos.txt");
        File archivo3 = new File("..\\G_nomina\\Información\\Seguros.txt");
        
        try {
            BufferedReader reader =  new BufferedReader(new FileReader(archivo1));
            
            while ((dato = reader.readLine()) != null) {
                Empleados2.insertItemAt(dato, contador);                
                contador++;
            }
            
            reader.close();
            reader =  new BufferedReader(new FileReader(archivo1));
            empleados = new String[contador-1];
            sueldos = new String[contador-1];
            seguros = new String[contador-1];
            contador = 0;
            
            while ((dato = reader.readLine()) != null) {
                empleados[contador] = dato;
                contador++;
            }
            
            reader.close();
            reader =  new BufferedReader(new FileReader(archivo2));
            contador = 0;
            
            while ((dato = reader.readLine()) != null) {
                sueldos[contador] = dato;
                contador++;
            }
            
            reader.close();
            reader =  new BufferedReader(new FileReader(archivo3));
            contador = 0;
            
            while ((dato = reader.readLine()) != null) {
                seguros[contador] = dato;
                contador++;
            }
            
            reader.close();
            contador = 0;
            
            for (int i = 0; i < empleados.length; i++) {
                empleado[0] = empleados[i];
                empleado[1] = sueldos[i];
                empleado[2] = seguros[i];
                tabla.insertRow(i, empleado);
            }
            
            reader.close();
        } catch(Exception ex) {
            JOptionPane.showMessageDialog(this, "Ha ocurrido un error en el programa");
            System.out.println("Error registrado: " + ex);
        }
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        Nomina = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Empleados2 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Dias_falto = new javax.swing.JSpinner();
        R_nomina = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        Imprimir = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        Informacion = new javax.swing.JTable();
        Sueldo = new javax.swing.JSpinner();
        Seguro = new javax.swing.JSpinner();
        Descanso = new javax.swing.JSpinner();
        Incentivo = new javax.swing.JSpinner();
        Adeudo = new javax.swing.JSpinner();
        Eliminar = new javax.swing.JButton();
        Empleados = new javax.swing.JPanel();
        Nuevo_emple = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Contratar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        Despedir = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        Empleados1 = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        Sueldo_new = new javax.swing.JSpinner();
        Editar = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        Seguro_new = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTabbedPane1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N

        Nomina.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Nomina.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel2.setText("Empleado: ");

        Empleados2.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        Empleados2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- - - - - - - - - - - - -" }));
        Empleados2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                Empleados2ItemStateChanged(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel1.setText("Sueldo: ");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel4.setText("Seguro: ");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel5.setText("Día de");

        jLabel6.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel6.setText("descanso: ");

        jLabel7.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel7.setText("Incentivo: ");

        jLabel8.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel8.setText("Adeudo: ");

        jLabel9.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel9.setText("Días");

        jLabel10.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel10.setText("que faltó: ");

        Dias_falto.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        Dias_falto.setModel(new javax.swing.SpinnerNumberModel());
        Dias_falto.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        R_nomina.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        R_nomina.setText("Realizar nómina");
        R_nomina.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        R_nomina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R_nominaActionPerformed(evt);
            }
        });

        Imprimir.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        Imprimir.setText("Imprimir");
        Imprimir.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Imprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ImprimirActionPerformed(evt);
            }
        });

        jScrollPane2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jScrollPane2.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N

        Informacion.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        Informacion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NOMBRE DEL EMPLEADO", "SEGURO", "SUELDO", "ADEUDO", "DIA DE DESCANSO", "INCENTIVO", "SUELDOO A PAGAR"
            }
        ));
        Informacion.setRowHeight(30);
        jScrollPane2.setViewportView(Informacion);

        Sueldo.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        Sueldo.setModel(new javax.swing.SpinnerNumberModel(0.0f, null, null, 1.0f));
        Sueldo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Sueldo.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                SueldoStateChanged(evt);
            }
        });

        Seguro.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        Seguro.setModel(new javax.swing.SpinnerNumberModel(0.0f, null, null, 1.0f));
        Seguro.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Descanso.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        Descanso.setModel(new javax.swing.SpinnerNumberModel(0.0f, null, null, 1.0f));
        Descanso.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Incentivo.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        Incentivo.setModel(new javax.swing.SpinnerNumberModel(0.0f, null, null, 1.0f));
        Incentivo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Adeudo.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        Adeudo.setModel(new javax.swing.SpinnerNumberModel(0.0f, null, null, 1.0f));
        Adeudo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Eliminar.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        Eliminar.setText("Eliminar");
        Eliminar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout NominaLayout = new javax.swing.GroupLayout(Nomina);
        Nomina.setLayout(NominaLayout);
        NominaLayout.setHorizontalGroup(
            NominaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NominaLayout.createSequentialGroup()
                .addGroup(NominaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(NominaLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(NominaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(R_nomina, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(NominaLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Empleados2, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(NominaLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(NominaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(NominaLayout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Sueldo, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Seguro, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(NominaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(NominaLayout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addComponent(jLabel8)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Adeudo, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(43, 43, 43)
                                    .addGroup(NominaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                        .addComponent(jLabel10)
                                        .addComponent(jLabel9))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Dias_falto, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(NominaLayout.createSequentialGroup()
                                    .addGroup(NominaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel5))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Descanso, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(22, 22, 22)
                                    .addComponent(jLabel7)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Incentivo, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(NominaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(NominaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.CENTER, NominaLayout.createSequentialGroup()
                        .addComponent(Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69)
                        .addComponent(Imprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jSeparator2))
                .addContainerGap())
        );
        NominaLayout.setVerticalGroup(
            NominaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NominaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(NominaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Empleados2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(NominaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(Seguro, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Sueldo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(NominaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(Incentivo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(NominaLayout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Descanso, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(NominaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(Adeudo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(NominaLayout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Dias_falto, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(R_nomina)
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(NominaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Imprimir)
                    .addComponent(Eliminar))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Nomina", Nomina);

        Empleados.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Empleados.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N

        Nuevo_emple.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        Nuevo_emple.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel3.setText("Nombre de nuevo empleado:");

        Contratar.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        Contratar.setText("Ingresar");
        Contratar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Contratar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContratarActionPerformed(evt);
            }
        });

        Despedir.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        Despedir.setText("Eliminar");
        Despedir.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Despedir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DespedirActionPerformed(evt);
            }
        });

        jScrollPane3.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N

        Empleados1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        Empleados1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Sueldo", "Seguro"
            }
        ));
        Empleados1.setRowHeight(30);
        jScrollPane3.setViewportView(Empleados1);

        jLabel11.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel11.setText("Seguro del");

        Sueldo_new.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        Sueldo_new.setModel(new javax.swing.SpinnerNumberModel(0.0f, null, null, 1.0f));
        Sueldo_new.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Editar.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        Editar.setText("Modificar");
        Editar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel12.setText("empleado: ");

        jLabel13.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel13.setText("Sueldo del ");

        jLabel14.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel14.setText("empleado:");

        Seguro_new.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        Seguro_new.setModel(new javax.swing.SpinnerNumberModel(0.0f, null, null, 1.0f));
        Seguro_new.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout EmpleadosLayout = new javax.swing.GroupLayout(Empleados);
        Empleados.setLayout(EmpleadosLayout);
        EmpleadosLayout.setHorizontalGroup(
            EmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EmpleadosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Editar, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(Despedir, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(EmpleadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(EmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(EmpleadosLayout.createSequentialGroup()
                        .addGroup(EmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Sueldo_new, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addGroup(EmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Seguro_new, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 55, Short.MAX_VALUE))
                    .addGroup(EmpleadosLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Nuevo_emple))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Contratar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        EmpleadosLayout.setVerticalGroup(
            EmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EmpleadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(EmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(Nuevo_emple, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(EmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(EmpleadosLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(EmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(EmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14)))
                    .addGroup(EmpleadosLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(Sueldo_new, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(EmpleadosLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(Seguro_new, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, Short.MAX_VALUE)
                .addComponent(Contratar)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 383, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(EmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(Despedir)
                    .addComponent(Editar))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Empleados", Empleados);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ImprimirActionPerformed
        
        try {
            
            if (Informacion.getRowCount() != 0) {
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                JFileChooser fc = new JFileChooser();
                fc.setAcceptAllFileFilterUsed(false);
                FileFilter ff = new FileNameExtensionFilter("Excel file", "xlsx", "xls");
                fc.addChoosableFileFilter(ff);
                fc.setDialogTitle("Especifica el archivo excel a guardar");
                Calendar fecha = Calendar.getInstance();
                int acept = fc.showSaveDialog(this);
                int datos = Informacion.getRowCount();
                int columnas = Informacion.getColumnCount();
                double total_p = 0.0;
                String info = "";

                if (acept == JFileChooser.APPROVE_OPTION) {
                    FileOutputStream excel = new FileOutputStream(fc.getSelectedFile().toString() + ".xlsx");
                    XSSFWorkbook libro = new XSSFWorkbook();
                    XSSFSheet hoja = libro.createSheet("NOMINA DEL " +fecha.get(Calendar.DAY_OF_MONTH)+ "-" 
                            +(fecha.get(Calendar.MONTH)+1)+ "-" +fecha.get(Calendar.YEAR));

                    for (int i = 0; i < (datos+2); i++) {

                        if (i > 1) {
                            Row row = hoja.createRow(i+1);

                            for (int a = 0; a < columnas; a++) {
                                Cell cell = row.createCell(a);
                                cell.setCellValue(Informacion.getModel().getValueAt(i-2, a).toString());
                            }
                            
                        } else {
                            
                            if (i == 0) {
                                Row row = hoja.createRow(i);
                                Cell cell = row.createCell(0);
                                cell.setCellValue("NOMINA DEL " +fecha.get(Calendar.DAY_OF_MONTH)+ "-" 
                                                  +(fecha.get(Calendar.MONTH)+1)+ "-" +fecha.get(Calendar.YEAR));
                            } else {
                                Row row = hoja.createRow(i+1);

                                for (int a = 0; a < columnas; a++) {
                                    Cell cell = row.createCell(a);
                                    cell.setCellValue(Informacion.getModel().getColumnName(a));
                                }
                                
                                Cell cell = row.createCell(Informacion.getColumnCount());
                                cell.setCellValue("FIRMA DE CONFORMIDAD");
                            }
                            
                        }
                        
                        if (i == (datos+1)) {
                            Row row = hoja.createRow(i+3);
                            Cell cell1 = row.createCell(columnas-2);
                            Cell cell2 = row.createCell(columnas-1);
                            
                            for (int j = 0; j < Informacion.getRowCount(); j++) {
                                total_p += Double.parseDouble(Informacion.getValueAt(j,6).toString());
                            }
                            
                            cell1.setCellValue("TOTAL A PAGAR:");
                            cell2.setCellValue(total_p);
                        }

                    }

                    libro.write(excel);
                    excel.close();
                }
            
            } else {
                JOptionPane.showMessageDialog(this, "No hay ningun dato que imprimir");
            }
            
        } catch(Exception ex) {
            JOptionPane.showMessageDialog(this, "Ha ocurrido un error en el programa");
            System.out.println("Error registrado: " + ex);
        }
       
    }//GEN-LAST:event_ImprimirActionPerformed

    private void ContratarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContratarActionPerformed
        String[] empleados = new String [Empleados1.getRowCount()+1], 
                 sueldos = new String [Empleados1.getRowCount()+1],
                 seguros = new String [Empleados1.getRowCount()+1], empleado_new = new String [3];
        DefaultTableModel tabla = (DefaultTableModel) Empleados1.getModel();
        String dato = "";
        int contador = 0;
        float sueldo = Float.parseFloat(Sueldo_new.getModel().getValue().toString());
        float seguro = Float.parseFloat(Seguro_new.getModel().getValue().toString());
        
        try {
            
            if (("".equalsIgnoreCase(Nuevo_emple.getText()) == false) && (sueldo != 0)) {
                File archivo1 = new File("..\\G_nomina\\Información\\Empleados.txt");
                File archivo2 = new File("..\\G_nomina\\Información\\Sueldos.txt");
                File archivo3 = new File("..\\G_nomina\\Información\\Seguros.txt");
                BufferedReader reader = new BufferedReader(new FileReader(archivo1));
                
                while ((dato = reader.readLine()) != null) {
                    empleados[contador] = dato;
                    contador++;
                }

                reader.close();
                contador = 0;
                reader = new BufferedReader(new FileReader(archivo2));
                
                while ((dato = reader.readLine()) != null) {
                    sueldos[contador] = dato;
                    contador++;
                }

                reader.close();
                contador = 0;
                reader = new BufferedReader(new FileReader(archivo3));
                
                while ((dato = reader.readLine()) != null) {
                    seguros[contador] = dato;
                    contador++;
                }
                
                reader.close();
                contador = 0;
                
                empleados[empleados.length-1] = Nuevo_emple.getText();
                sueldos[sueldos.length-1] = "" +sueldo;
                seguros[seguros.length-1] = "" +seguro;
                BufferedWriter writer =  new BufferedWriter(new FileWriter(archivo1));

                for (int i = 0; i < empleados.length; i++) {

                    if (i == empleados.length-1) {
                        writer.write(empleados[i]);
                    } else {
                        writer.write(empleados[i]+ "\n");
                    }

                }
                
                writer.close();
                writer =  new BufferedWriter(new FileWriter(archivo2));

                for (int i = 0; i < sueldos.length; i++) {

                    if (i == sueldos.length-1) {
                        writer.write(sueldos[i]);
                    } else {
                        writer.write(sueldos[i]+ "\n");
                    }

                }
                
                writer.close();
                writer =  new BufferedWriter(new FileWriter(archivo3));

                for (int i = 0; i < seguros.length; i++) {

                    if (i == seguros.length-1) {
                        writer.write(seguros[i]);
                    } else {
                        writer.write(seguros[i]+ "\n");
                    }

                }
                
                writer.close();
                Nuevo_emple.setText("");
                Sueldo_new.setValue(0.0);
                Seguro_new.setValue(0.0);
                empleado_new[0] = empleados[empleados.length-1];
                empleado_new[1] = sueldos[sueldos.length-1];
                empleado_new[2] = seguros[seguros.length-1];
                tabla.addRow(empleado_new);
                Empleados2.addItem(empleado_new[0]);
            } else {
                
                
                if ("".equalsIgnoreCase(Nuevo_emple.getText()) == true) {
                    JOptionPane.showMessageDialog(this, "Favor de ingresar el nombre del empleado");
                } else {
                    
                    if (sueldo == 0) {
                        JOptionPane.showMessageDialog(this, "Favor de ingresar un sueldo al empleado");
                    } else {
                        JOptionPane.showMessageDialog(this, "No se ha ingresado ningun dato importante del nuevo empleado");
                    }
                    
                }
                
            }
            
        } catch(Exception ex) {
            JOptionPane.showMessageDialog(this, "Ha ocurrido un error en el programa");
            System.out.println("Error registrado: " + ex);
        }
        
    }//GEN-LAST:event_ContratarActionPerformed

    private void DespedirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DespedirActionPerformed
        DefaultTableModel tabla = (DefaultTableModel) Empleados1.getModel();
        String[] empleados = new String [Empleados1.getRowCount()-1], 
                 sueldos = new String [Empleados1.getRowCount()-1],
                 seguros = new String [Empleados1.getRowCount()-1];
        String dato = "";
        int contador = 0, ident = 0, persona_elim1 = Empleados1.getSelectedRow();
        
        try {
            
            if (Empleados1.getSelectedRow() != -1) {
                File archivo1 = new File("..\\G_nomina\\Información\\Empleados.txt");
                File archivo2 = new File("..\\G_nomina\\Información\\Sueldos.txt");
                File archivo3 = new File("..\\G_nomina\\Información\\Seguros.txt");
                BufferedReader reader = new BufferedReader(new FileReader(archivo1));
                
                while ((dato = reader.readLine()) != null) {
                    
                    if (contador != persona_elim1) {
                        
                        if (ident == 0) {
                            empleados[contador] = dato;
                            contador++;
                        } else {
                            contador--;
                            empleados[contador] = dato;
                            contador += 2;
                        }
                        
                    } else {
                        ident++;
                        contador++;
                    }
                    
                }

                reader.close();
                contador = 0;
                ident = 0;
                reader = new BufferedReader(new FileReader(archivo2));
                
                while ((dato = reader.readLine()) != null) {
                    
                    if (contador != persona_elim1) {
                        
                        if (ident == 0) {
                            sueldos[contador] = dato;
                            contador++;
                        } else {
                            contador--;
                            sueldos[contador] = dato;
                            contador += 2;
                        }
                        
                    } else {
                        ident++;
                        contador++;
                    }
                    
                }

                reader.close();
                contador = 0;
                ident = 0;
                reader = new BufferedReader(new FileReader(archivo3));
                
                while ((dato = reader.readLine()) != null) {
                    
                    if (contador != persona_elim1) {
                        
                        if (ident == 0) {
                            seguros[contador] = dato;
                            contador++;
                        } else {
                            contador--;
                            seguros[contador] = dato;
                            contador += 2;
                        }
                        
                    } else {
                        ident++;
                        contador++;
                    }
                    
                }

                reader.close();
                contador = 0;
                ident = 0;
                BufferedWriter writer =  new BufferedWriter(new FileWriter(archivo1));

                for (int i = 0; i < empleados.length; i++) {

                    if (i == empleados.length-1) {
                        writer.write(empleados[i]);
                    } else {
                        writer.write(empleados[i]+ "\n");
                    }

                }

                writer.close();
                writer =  new BufferedWriter(new FileWriter(archivo2));

                for (int i = 0; i < sueldos.length; i++) {

                    if (i == sueldos.length-1) {
                        writer.write(sueldos[i]);
                    } else {
                        writer.write(sueldos[i]+ "\n");
                    }

                }

                writer.close();
                writer =  new BufferedWriter(new FileWriter(archivo3));

                for (int i = 0; i < seguros.length; i++) {

                    if (i == seguros.length-1) {
                        writer.write(seguros[i]);
                    } else {
                        writer.write(seguros[i]+ "\n");
                    }

                }

                writer.close();
                Nuevo_emple.setText("");
                Sueldo_new.setValue(0.0);
                Seguro_new.setValue(0.0);
                Empleados2.removeItemAt(Empleados1.getSelectedRow()+1);
                tabla.removeRow(Empleados1.getSelectedRow());
            } else {
                JOptionPane.showMessageDialog(this, "Favor de seleccionar a un empleado");
            }
            
        } catch(Exception ex) {
            JOptionPane.showMessageDialog(this, "Ha ocurrido un error en el programa");
            System.out.println("Error registrado: " + ex);
        }
        
    }//GEN-LAST:event_DespedirActionPerformed

    private void R_nominaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R_nominaActionPerformed
        DefaultTableModel tabla = (DefaultTableModel) Informacion.getModel();
        int i = tabla.getRowCount();
        float sueldo = Float.parseFloat(Sueldo.getModel().getValue().toString());
        float seguro = Float.parseFloat(Seguro.getModel().getValue().toString());
        float adeudo = Float.parseFloat(Adeudo.getModel().getValue().toString());
        float descanso = Float.parseFloat(Descanso.getModel().getValue().toString());
        float incentivo = Float.parseFloat(Incentivo.getModel().getValue().toString());
        float sueldo_total = 0;
        
        if (Empleados2.getSelectedIndex() != 0) {
        
            if (Dias_falto.getModel().getValue().hashCode() != 0) {
                sueldo_total = (((sueldo - seguro) / 7) * (7 - (Dias_falto.getModel().getValue().hashCode() + 1))) - adeudo + descanso + incentivo;
                String info[] = {Empleados2.getModel().getSelectedItem().toString(),
                                 "" + seguro,
                                 "" + sueldo,
                                 "" + adeudo,
                                 "" + descanso,
                                 "" + incentivo,
                                 "" + sueldo_total};
                tabla.addRow(info);
                Empleados2.setSelectedIndex(0);
                Sueldo.setValue(0.0);
                Seguro.setValue(0.0);
                Adeudo.setValue(0.0);
                Descanso.setValue(0.0);
                Incentivo.setValue(0.0);
                Dias_falto.setValue(0);
            } else {
                sueldo_total = (sueldo - seguro) - adeudo + descanso + incentivo;
                String info[] = {Empleados2.getModel().getSelectedItem().toString(),
                                 "" + seguro,
                                 "" + sueldo,
                                 "" + adeudo,
                                 "" + descanso,
                                 "" + incentivo,
                                 "" + sueldo_total};
                tabla.addRow(info);
                Empleados2.setSelectedIndex(0);
                Sueldo.setValue(0.0);
                Seguro.setValue(0.0);
                Adeudo.setValue(0.0);
                Descanso.setValue(0.0);
                Incentivo.setValue(0.0);
                Dias_falto.setValue(0);
            }
        
        } else {
            JOptionPane.showMessageDialog(this, "Favor de seleccionar a un empleado");
            Sueldo.setValue(0.0);
            Seguro.setValue(0.0);
            Adeudo.setValue(0.0);
            Descanso.setValue(0.0);
            Incentivo.setValue(0.0);
            Dias_falto.setValue(0);
        }
        
    }//GEN-LAST:event_R_nominaActionPerformed

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
        
        try{ 
            
            if (Informacion.getSelectedRow() != -1) {
                int prueba = Informacion.getSelectedRow();
                DefaultTableModel tabla = (DefaultTableModel) Informacion.getModel();
                tabla.removeRow(Informacion.getSelectedRow());
            } else {
                JOptionPane.showMessageDialog(this, "Favor de seleccionar un dato");
            }
            
        } catch(Exception ex) {
            JOptionPane.showMessageDialog(this, "Ha ocurrido un error en el programa");
            System.out.println("Error registrado: " + ex);
        }
        
    }//GEN-LAST:event_EliminarActionPerformed

    private void Empleados2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_Empleados2ItemStateChanged
        File archivo2 = new File("..\\G_nomina\\Información\\Sueldos.txt");
        File archivo3 = new File("..\\G_nomina\\Información\\Seguros.txt");
        int contador = 0;
        float[] sueldos = new float [Empleados2.getItemCount()-1];
        float[] seguros = new float [Empleados2.getItemCount()-1];
        String dato = "";
        
        try {
            
            if (Empleados2.getSelectedIndex() != 0) {
                BufferedReader reader =  new BufferedReader(new FileReader(archivo2));

                while ((dato = reader.readLine()) != null) {
                    sueldos[contador] = Float.parseFloat(dato);
                    contador++;
                }

                reader.close();
                contador = 0;
                reader =  new BufferedReader(new FileReader(archivo3));

                while ((dato = reader.readLine()) != null) {
                    seguros[contador] = Float.parseFloat(dato);
                    contador++;
                }

                reader.close();
                
                Sueldo.setValue(sueldos[Empleados2.getSelectedIndex()-1]);
                Seguro.setValue(seguros[Empleados2.getSelectedIndex()-1]);
            } else {
                Sueldo.setValue(0.0);
                Seguro.setValue(0.0);
            }
            
        } catch(Exception ex) {
            JOptionPane.showMessageDialog(this, "Ha ocurrido un error en el programa");
            System.out.println("Error registrado: " + ex);
        }
        
    }//GEN-LAST:event_Empleados2ItemStateChanged

    private void EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarActionPerformed
        String[] empleados = new String [Empleados1.getRowCount()],
                 sueldos = new String [Empleados1.getRowCount()],
                 seguros = new String [Empleados1.getRowCount()];
        
        try {
            File archivo1 = new File("..\\G_nomina\\Información\\Empleados.txt");
            File archivo2 = new File("..\\G_nomina\\Información\\Sueldos.txt");
            File archivo3 = new File("..\\G_nomina\\Información\\Seguros.txt");
            
            for(int i = 0; i < empleados.length; i++) {
                empleados[i] = Empleados1.getValueAt(i,0).toString();
            }
            
            for(int i = 0; i < sueldos.length; i++) {
                sueldos[i] = Empleados1.getValueAt(i,1).toString();
            }
            
            for(int i = 0; i < seguros.length; i++) {
                seguros[i] = Empleados1.getValueAt(i,2).toString();
            }
            
            BufferedWriter writer =  new BufferedWriter(new FileWriter(archivo1));
            
            for (int i = 0; i < empleados.length; i++) {
                
                if (i == empleados.length-1) {
                    writer.write(empleados[i]);
                } else {
                    writer.write(empleados[i]+ "\n");
                }
            
            }
            
            writer.close();
            writer =  new BufferedWriter(new FileWriter(archivo2));
            
            for (int i = 0; i < sueldos.length; i++) {
                
                if (i == sueldos.length-1) {
                    writer.write(sueldos[i]);
                } else {
                    writer.write(sueldos[i]+ "\n");
                }
            
            }
            
            writer.close();
            writer =  new BufferedWriter(new FileWriter(archivo3));
            
            for (int i = 0; i < seguros.length; i++) {
                
                if (i == seguros.length-1) {
                    writer.write(seguros[i]);
                } else {
                    writer.write(seguros[i]+ "\n");
                }
            
            }
            
            writer.close();
            
            for(int i = 1; i < Empleados1.getRowCount()+1; i++) {
                Empleados2.removeItemAt(1);
            }
            
            for(int i = 0; i < empleados.length; i++) {
                Empleados2.addItem(empleados[i]);
            }
            
            JOptionPane.showMessageDialog(this, "Se han modificado los datos con exito");
        } catch(Exception ex) {
            JOptionPane.showMessageDialog(this, "Ha ocurrido un error en el programa");
            System.out.println("Error registrado: " + ex);
        }
        
    }//GEN-LAST:event_EditarActionPerformed

    private void SueldoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_SueldoStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_SueldoStateChanged
        
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(nomina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(nomina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(nomina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(nomina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new nomina().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSpinner Adeudo;
    private javax.swing.JButton Contratar;
    private javax.swing.JSpinner Descanso;
    private javax.swing.JButton Despedir;
    private javax.swing.JSpinner Dias_falto;
    private javax.swing.JButton Editar;
    private javax.swing.JButton Eliminar;
    private javax.swing.JPanel Empleados;
    private javax.swing.JTable Empleados1;
    private javax.swing.JComboBox<String> Empleados2;
    private javax.swing.JButton Imprimir;
    private javax.swing.JSpinner Incentivo;
    private javax.swing.JTable Informacion;
    private javax.swing.JPanel Nomina;
    private javax.swing.JTextField Nuevo_emple;
    private javax.swing.JButton R_nomina;
    private javax.swing.JSpinner Seguro;
    private javax.swing.JSpinner Seguro_new;
    private javax.swing.JSpinner Sueldo;
    private javax.swing.JSpinner Sueldo_new;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
