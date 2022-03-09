/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alpha
 */
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.io.*;
import java.util.*;
public class MainFrame extends javax.swing.JFrame implements Serializable {
    private String[] languageArtList = {"ESL","ENGL 908","ENGL 1A","ENGL 1B","ENGL 1C","MUS 5","COMM 1","REA 54", "HIS 17A/B", "POL 1"};
    private String[] mathList = {"Math 903/C","Math 10","Math 12","Math 19","Math 3A","Math 3B","Math 4A","Math 4B","Math 4C","Math G"};
    private String[] stemList = {"CHEM 2", "CHEM 1A/B", "PHYS 4A", "PHYS 4B", "PHYS 4C", "EGR 25", "EGR 30", "CIS 37", "CIS 40", "CIS 43/44"};
    
    private String[] titleItem = {"Student", "Course"};
    private JRadioButton[] languageArtButton;
    private JRadioButton[] mathButton;
    private JRadioButton[] stemButton;

    private EditStudent editStudent;
    private Data data = new Data();
    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        read();
        initComponents();
        setLocationRelativeTo(null);
        updateTable(languageArtTable, this.data.getLanguageArtStudent());
        updateTable(mathTable, this.data.getMathStudent());
        updateTable(stemTable, this.data.getStemStudent());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        courseRadioButton = new javax.swing.ButtonGroup();
        titleLabel = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        newStudentTab = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        languageArtPanel = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        mathPanel = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        stemPanel = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        studentNameTextField = new javax.swing.JTextField();
        addButton = new javax.swing.JButton();
        studentListTab = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        languageArtTable = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        mathTable = new javax.swing.JTable();
        jPanel8 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        stemTable = new javax.swing.JTable();
        editButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();

        languageArtButton = new JRadioButton[languageArtList.length];
        mathButton = new JRadioButton[mathList.length];
        stemButton = new JRadioButton[stemList.length];
        for (int i = 0; i < languageArtList.length; i++) {
            languageArtButton[i] = new JRadioButton(languageArtList[i]);
            languageArtButton[i].setActionCommand(languageArtList[i]);
            courseRadioButton.add(languageArtButton[i]);
        }

        for (int i = 0; i < mathList.length; i++) {
            mathButton[i] = new JRadioButton(mathList[i]);
            mathButton[i].setActionCommand(mathList[i]);
            courseRadioButton.add(mathButton[i]);
        }

        for (int i = 0; i < stemList.length; i++) {
            stemButton[i] = new JRadioButton(stemList[i]);
            stemButton[i].setActionCommand(stemList[i]);
            courseRadioButton.add(stemButton[i]);
        }

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Student Check-in");
        setResizable(false);

        titleLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setText("MISSION COLLEGE TUTORING CENTER");
        titleLabel.setAlignmentX(0.5F);
        titleLabel.setAutoscrolls(true);
        titleLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel1.setLayout(new java.awt.GridLayout(1, 3, 5, 5));

        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Language & Art");

        languageArtPanel.setLayout(new java.awt.GridLayout(5, 2, 15, 15));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(jLabel1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(languageArtPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(80, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(languageArtPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(205, Short.MAX_VALUE))
        );

        jLabel1.getAccessibleContext().setAccessibleName("");
        for (int i = 0; i < languageArtList.length; i++) {
            languageArtPanel.add(languageArtButton[i]);
        }

        jPanel1.add(jPanel2);

        jPanel4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Math");

        mathPanel.setLayout(new java.awt.GridLayout(5, 2, 15, 15));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(114, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(104, 104, 104))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(mathPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(mathPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(205, Short.MAX_VALUE))
        );

        for (int i = 0; i < mathList.length; i++) {
            mathPanel.add(mathButton[i]);
        }

        jPanel1.add(jPanel4);

        jPanel5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("STEM");

        stemPanel.setLayout(new java.awt.GridLayout(5, 2, 15, 15));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(stemPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(stemPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(205, Short.MAX_VALUE))
        );

        for (int i = 0; i < stemList.length; i++) {
            stemPanel.add(stemButton[i]);
        }

        jPanel1.add(jPanel5);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel7.setText("Student Name:");

        studentNameTextField.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        addButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        addButton.setText("Add");
        addButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout newStudentTabLayout = new javax.swing.GroupLayout(newStudentTab);
        newStudentTab.setLayout(newStudentTabLayout);
        newStudentTabLayout.setHorizontalGroup(
            newStudentTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(newStudentTabLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 783, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(newStudentTabLayout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(studentNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        newStudentTabLayout.setVerticalGroup(
            newStudentTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(newStudentTabLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(newStudentTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(newStudentTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(studentNameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(addButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("New Student", newStudentTab);

        jPanel3.setLayout(new java.awt.GridLayout(1, 3, 5, 0));

        jPanel6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Language & Art");

        languageArtTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        languageArtTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(languageArtTable);
        loadData(languageArtTable);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(jLabel4))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.add(jPanel6);

        jPanel7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Math");

        mathTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(mathTable);
        loadData(mathTable);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(104, 104, 104))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.add(jPanel7);

        jPanel8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("STEM");

        stemTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane3.setViewportView(stemTable);
        loadData(stemTable);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.add(jPanel8);

        editButton.setText("EDIT");
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });

        deleteButton.setText("DELETE");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout studentListTabLayout = new javax.swing.GroupLayout(studentListTab);
        studentListTab.setLayout(studentListTabLayout);
        studentListTabLayout.setHorizontalGroup(
            studentListTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(studentListTabLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 783, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, studentListTabLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(editButton, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );
        studentListTabLayout.setVerticalGroup(
            studentListTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(studentListTabLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(studentListTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editButton, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(deleteButton, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Student List", studentListTab);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(194, 194, 194)
                        .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTabbedPane1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        // TODO add your handling code here:
        String name = studentNameTextField.getText();
        if (name.trim().equals("") || courseRadioButton.getSelection() == null) {
            JOptionPane.showMessageDialog(null, "Please enter your name and pick a course!");
            return;
        }
        String course = courseRadioButton.getSelection().getActionCommand();
        String group = "";
        
        Student student = new Student(name, group, course);
        boolean found = false;
        for (int i = 0; !found && i < languageArtList.length; i++) {
            if (languageArtList[i].equals(course)) {
                found = true;
                student.setGroup("Language & Art");
                data.getLanguageArtStudent().add(student);
                updateTable(languageArtTable, data.getLanguageArtStudent());
            }
        }

        for (int i = 0; !found && i < mathList.length; i++) {
            if (mathList[i].equals(course)) {
                found = true;
                student.setGroup("Math");
                data.getMathStudent().add(student);
                updateTable(mathTable, data.getMathStudent());
            }
        }

        for (int i = 0; !found && i < stemList.length; i++) {
            if (stemList[i].equals(course)) {
                found = true;
                student.setGroup("STEM");
                data.getStemStudent().add(student);
                updateTable(stemTable, data.getStemStudent());
            }
        }
        studentNameTextField.setText("");
        courseRadioButton.clearSelection();
    }//GEN-LAST:event_addButtonActionPerformed

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        // TODO add your handling code here:
        int index = languageArtTable.getSelectedRow();
        if (index >= 0) {
            Student s = data.getLanguageArtStudent().get(index);

            if (editStudent == null) {
                editStudent = new EditStudent(this, s);
            } else {
                editStudent.setStudent(s);
            }

            editStudent.display(true);
        } else {
            index = mathTable.getSelectedRow();
            if (index >= 0) {
                Student s = data.getMathStudent().get(index);

                if (editStudent == null) {
                    editStudent = new EditStudent(this, s);
                } else {
                    editStudent.setStudent(s);
                }
                editStudent.display(true);
            } else {
                index = stemTable.getSelectedRow();
                if (index >= 0) {
                    Student s = data.getStemStudent().get(index);

                    if (editStudent == null) {
                        editStudent = new EditStudent(this, s);
                    } else {
                        editStudent.setStudent(s);
                    }
                    editStudent.display(true);
                } else {
                    JOptionPane.showMessageDialog(null, "No student selected!");
                }
            }
        }
    }//GEN-LAST:event_editButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        // TODO add your handling code here:
        delete(1);
    }//GEN-LAST:event_deleteButtonActionPerformed

    public void delete(int s) {
        int index = languageArtTable.getSelectedRow();
        int select = s;
        if (index >= 0) {
            if (select == 1) {
                select = JOptionPane.showOptionDialog(null,
                        "Are you sure to delete "
                                + data.getLanguageArtStudent().get(index).getName() + " ?",
                        "Delete", JOptionPane.YES_NO_OPTION,
                        JOptionPane.QUESTION_MESSAGE, null, null, null);
            }
            if (select == 0) {
                data.getLanguageArtStudent().remove(index);
                updateTable(languageArtTable, data.getLanguageArtStudent());
            }
        } else {
            index = mathTable.getSelectedRow();
            if (index >= 0) {
                if (select == 1) {
                    select = JOptionPane.showOptionDialog(null,
                            "Are you sure to delete "
                                    + data.getMathStudent().get(index).getName() + " ?",
                            "Delete", JOptionPane.YES_NO_OPTION,
                            JOptionPane.QUESTION_MESSAGE, null, null, null);
                }
                if (select == 0) {
                    data.getMathStudent().remove(index);
                    updateTable(mathTable, data.getMathStudent());
                }
            } else {
                index = stemTable.getSelectedRow();
                if (index >= 0) {
                    if (select == 1) {
                        select = JOptionPane.showOptionDialog(null,
                                "Are you sure to delete "
                                        + data.getStemStudent().get(index).getName() + " ?",
                                "Delete", JOptionPane.YES_NO_OPTION,
                                JOptionPane.QUESTION_MESSAGE, null, null, null);
                    }
                    if (select == 0) {
                        data.getStemStudent().remove(index);
                        updateTable(stemTable, data.getStemStudent());
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "No student selected!");
                }
            }
        }
    }
    private void loadData(JTable table) {
        String data[][] = null;
        // don't edit table
        DefaultTableModel tableModel = new DefaultTableModel(data, titleItem) {
            @Override
            public boolean isCellEditable(int row, int column) {
            // all cells false
		    return false;
            }
	    };
	    table.setModel(tableModel);
    }
    
    public void updateTable(JTable table, ArrayList<Student> list) {
        write();
        String data[][] = convertData(list);
        DefaultTableModel tableModel = new DefaultTableModel(data, titleItem) {
            @Override
            public boolean isCellEditable(int row, int column) {
                // all cells false
                return false;
            }
        };
        table.setModel(tableModel);
    }
    
    private String[][] convertData(ArrayList<Student> list) {
        int size = list.size();
        String data[][] = new String[size][titleItem.length];

        for (int i = 0; i < size; i++) {
            Student s = list.get(i);
            data[i][0] = s.getName();
            data[i][1] = s.getCourse();
        }

        return data;
    }

    public Data getData() {
        return this.data;
    }

    public JTable getLanguageArtTable() {
        return languageArtTable;
    }

    public void setLanguageArtTable(JTable languageArtTable) {
        this.languageArtTable = languageArtTable;
    }

    public JTable getMathTable() {
        return mathTable;
    }

    public void setMathTable(JTable mathTable) {
        this.mathTable = mathTable;
    }

    public JTable getStemTable() {
        return stemTable;
    }

    public void setStemTable(JTable stemTable) {
        this.stemTable = stemTable;
    }

    public String[] getLanguageArtList() {
        return languageArtList;
    }

    public void setLanguageArtList(String[] languageArtList) {
        this.languageArtList = languageArtList;
    }

    public String[] getMathList() {
        return mathList;
    }

    public void setMathList(String[] mathList) {
        this.mathList = mathList;
    }

    public String[] getStemList() {
        return stemList;
    }

    public void setStemList(String[] stemList) {
        this.stemList = stemList;
    }


    public void write() {
        try {
            FileOutputStream f = new FileOutputStream("data");
            ObjectOutputStream oStream = new ObjectOutputStream(f);
            oStream.writeObject(data);
            oStream.close();
        } catch (IOException e) {
            System.out.println("Error Write file");
        }
    }

    public void read() {
        Data data = null;
        try {
            File file = new File("data");
            if (!file.exists()) {
                file.createNewFile();
            }
            FileInputStream is = new FileInputStream(file);
            ObjectInputStream inStream = new ObjectInputStream(is);
            data = (Data) inStream.readObject();
            this.data = data;
            inStream.close();
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found");
        } catch (IOException e) {
            System.out.println("Error Read file");
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.ButtonGroup courseRadioButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton editButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel languageArtPanel;
    private javax.swing.JTable languageArtTable;
    private javax.swing.JPanel mathPanel;
    private javax.swing.JTable mathTable;
    private javax.swing.JPanel newStudentTab;
    private javax.swing.JPanel stemPanel;
    private javax.swing.JTable stemTable;
    private javax.swing.JPanel studentListTab;
    private javax.swing.JTextField studentNameTextField;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}