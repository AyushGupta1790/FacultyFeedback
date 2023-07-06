/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Designing;

import db.DBConnection;
import javax.swing.JOptionPane;

/**
 *
 * @author asus
 */
public class Student extends javax.swing.JFrame {
    
    String user;
    String faculty;
    String sub;

    /**
     * Creates new form Student
     */
    public Student() {
        initComponents();
    }
    
    public Student(String str) {
        user = str;
        initComponents();
        jLabel2.setText(user);
        DBConnection db = new DBConnection();
        try {
            String course = null, sem = null, branch = null;
            db.pstmt = db.con.prepareStatement("select * from student_info where user_id=?");
            db.pstmt.setString(1, str);
            db.rst = db.pstmt.executeQuery();
            while (db.rst.next()) {
                course = db.rst.getString(1);
                branch = db.rst.getString(3);
                sem = db.rst.getString(2);
                jTextField2.setText(db.rst.getString(1));
                jTextField3.setText(db.rst.getString(3));
                jTextField4.setText(db.rst.getString(2));
            }
            db.pstmt = db.con.prepareStatement("select sub_name from subject_regist where course=? and sem=? and branch=?");
            db.pstmt.setString(1, course);
            db.pstmt.setString(2, sem);
            db.pstmt.setString(3, branch);
            db.rst = db.pstmt.executeQuery();
            while (db.rst.next()) {
                jComboBox1.addItem(db.rst.getString(1));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        SubjectDetail = new javax.swing.JInternalFrame();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        Feedback = new javax.swing.JInternalFrame();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        jComboBox6 = new javax.swing.JComboBox<>();
        jComboBox10 = new javax.swing.JComboBox<>();
        jComboBox14 = new javax.swing.JComboBox<>();
        jComboBox12 = new javax.swing.JComboBox<>();
        jComboBox15 = new javax.swing.JComboBox<>();
        jComboBox4 = new javax.swing.JComboBox<>();
        jLabel23 = new javax.swing.JLabel();
        jComboBox9 = new javax.swing.JComboBox<>();
        jLabel26 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jComboBox5 = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        jComboBox7 = new javax.swing.JComboBox<>();
        jLabel22 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jComboBox13 = new javax.swing.JComboBox<>();
        jLabel19 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jComboBox16 = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox8 = new javax.swing.JComboBox<>();
        jComboBox11 = new javax.swing.JComboBox<>();
        jLabel24 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(102, 224, 209));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1920, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 920, 1920, 90));

        jDesktopPane1.setBackground(new java.awt.Color(204, 255, 204));
        jDesktopPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SubjectDetail.setVisible(true);
        SubjectDetail.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Microsoft JhengHei", 1, 24)); // NOI18N
        jLabel6.setText("Select Subject");
        SubjectDetail.getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(171, 93, -1, -1));

        jLabel7.setFont(new java.awt.Font("Microsoft JhengHei", 1, 24)); // NOI18N
        jLabel7.setText("Faculty Name");
        SubjectDetail.getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, -1, -1));

        jLabel8.setFont(new java.awt.Font("Microsoft JhengHei", 1, 24)); // NOI18N
        jLabel8.setText("Course");
        SubjectDetail.getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, -1, -1));

        jLabel9.setFont(new java.awt.Font("Microsoft JhengHei", 1, 24)); // NOI18N
        jLabel9.setText("Branch");
        SubjectDetail.getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 340, -1, -1));

        jLabel10.setFont(new java.awt.Font("Microsoft JhengHei", 1, 24)); // NOI18N
        jLabel10.setText("Semester");
        SubjectDetail.getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 420, -1, -1));

        jComboBox1.setBackground(new java.awt.Color(204, 204, 204));
        jComboBox1.setFont(new java.awt.Font("Microsoft JhengHei", 1, 24)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Subject" }));
        jComboBox1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        SubjectDetail.getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 90, 240, -1));

        jTextField1.setBackground(new java.awt.Color(204, 204, 204));
        jTextField1.setFont(new java.awt.Font("Microsoft JhengHei", 1, 24)); // NOI18N
        jTextField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        SubjectDetail.getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 180, 240, -1));

        jTextField2.setBackground(new java.awt.Color(204, 204, 204));
        jTextField2.setFont(new java.awt.Font("Microsoft JhengHei", 1, 24)); // NOI18N
        jTextField2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        SubjectDetail.getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 260, 240, -1));

        jTextField3.setBackground(new java.awt.Color(204, 204, 204));
        jTextField3.setFont(new java.awt.Font("Microsoft JhengHei", 1, 24)); // NOI18N
        jTextField3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        SubjectDetail.getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 340, 240, -1));

        jTextField4.setBackground(new java.awt.Color(204, 204, 204));
        jTextField4.setFont(new java.awt.Font("Microsoft JhengHei", 1, 24)); // NOI18N
        jTextField4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        SubjectDetail.getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 420, 240, -1));

        jButton1.setFont(new java.awt.Font("Microsoft JhengHei", 1, 24)); // NOI18N
        jButton1.setText(" Give Feedback ");
        jButton1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        SubjectDetail.getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 520, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/fbg.jpg"))); // NOI18N
        SubjectDetail.getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1900, 670));

        jDesktopPane1.add(SubjectDetail, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1920, 700));

        Feedback.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        Feedback.setClosable(true);
        Feedback.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        Feedback.setTitle("Feedback Form");
        Feedback.setVisible(false);

        jScrollPane1.setBackground(new java.awt.Color(255, 204, 255));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jComboBox6.setFont(new java.awt.Font("Microsoft JhengHei", 1, 24)); // NOI18N
        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose Any One", "Not at all well", "Not so well", "Somewhat well", "Very well", "Extremely well" }));
        jPanel3.add(jComboBox6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 550, 350, -1));

        jComboBox10.setFont(new java.awt.Font("Microsoft JhengHei", 1, 24)); // NOI18N
        jComboBox10.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose Any One", "Strongly Disagree", "Disagree", "Neutral", "Agree", "Strongly Agree" }));
        jPanel3.add(jComboBox10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 1050, 350, -1));

        jComboBox14.setFont(new java.awt.Font("Microsoft JhengHei", 1, 24)); // NOI18N
        jComboBox14.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose Any One", "Strongly Disagree", "Disagree", "Neutral", "Agree", "Strongly Agree" }));
        jPanel3.add(jComboBox14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 1520, 350, -1));

        jComboBox12.setFont(new java.awt.Font("Microsoft JhengHei", 1, 24)); // NOI18N
        jComboBox12.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose Any One", "Strongly Disagree", "Disagree", "Neutral", "Agree", "Strongly Agree" }));
        jPanel3.add(jComboBox12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 1290, 350, -1));

        jComboBox15.setFont(new java.awt.Font("Microsoft JhengHei", 1, 24)); // NOI18N
        jComboBox15.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose Any One", "Very Poor", "Poor", "Average", "Good", "Excellent", " " }));
        jPanel3.add(jComboBox15, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 1640, 350, -1));

        jComboBox4.setFont(new java.awt.Font("Microsoft JhengHei", 1, 24)); // NOI18N
        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose Any One", "Not at all good", "Not so good", "Somewhat good", "Very good", "Excellent" }));
        jPanel3.add(jComboBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 350, -1));

        jLabel23.setFont(new java.awt.Font("Microsoft JhengHei", 1, 24)); // NOI18N
        jLabel23.setText("12. The instructor's assignments were helpful to my learning?");
        jPanel3.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 1370, -1, -1));

        jComboBox9.setFont(new java.awt.Font("Microsoft JhengHei", 1, 24)); // NOI18N
        jComboBox9.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose Any One", "Strongly Disagree", "Disagree", "Neutral", "Agree", "Strongly Agree" }));
        jPanel3.add(jComboBox9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 930, 350, -1));

        jLabel26.setFont(new java.awt.Font("Microsoft JhengHei", 1, 24)); // NOI18N
        jLabel26.setText("14. The instructor's grading was fair?");
        jPanel3.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 1600, -1, -1));

        jLabel12.setFont(new java.awt.Font("Microsoft JhengHei", 1, 24)); // NOI18N
        jLabel12.setText("1. How knowledgeable is your instructor? ");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 17, -1, -1));

        jComboBox5.setFont(new java.awt.Font("Microsoft JhengHei", 1, 24)); // NOI18N
        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose Any One", "Not at all easy", "Not so easy", "Somewhat easy", "Very easy", "Extremely easy", " ", " ", " ", " " }));
        jPanel3.add(jComboBox5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, 350, -1));

        jLabel16.setFont(new java.awt.Font("Microsoft JhengHei", 1, 24)); // NOI18N
        jLabel16.setText("5. How well did your instructor answer students  questions? ");
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 500, -1, -1));

        jComboBox7.setFont(new java.awt.Font("Microsoft JhengHei", 1, 24)); // NOI18N
        jComboBox7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose Any One", "Strongly Disagree", "Disagree", "Neutral", "Agree", "Strongly Agree" }));
        jPanel3.add(jComboBox7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 670, 350, -1));

        jLabel22.setFont(new java.awt.Font("Microsoft JhengHei", 1, 24)); // NOI18N
        jLabel22.setText("11. The instructor was available for consultation outside of class?");
        jPanel3.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 1250, -1, -1));

        jLabel14.setFont(new java.awt.Font("Microsoft JhengHei", 1, 24)); // NOI18N
        jLabel14.setText("3. How would you rate the instructor's mastery of the material?");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, -1));

        jComboBox13.setFont(new java.awt.Font("Microsoft JhengHei", 1, 24)); // NOI18N
        jComboBox13.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose Any One", "Strongly Disagree", "Disagree", "Neutral", "Agree", "Strongly Agree" }));
        jPanel3.add(jComboBox13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 1410, 350, -1));

        jLabel19.setFont(new java.awt.Font("Microsoft JhengHei", 1, 24)); // NOI18N
        jLabel19.setText("8. The instructor expected a high level of performance?");
        jPanel3.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 880, -1, -1));

        jComboBox3.setFont(new java.awt.Font("Microsoft JhengHei", 1, 24)); // NOI18N
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose Any One", "Not at all clearly", "Not so clearly", "Somewhat clearly", "Very clearly", "Extremely clearly" }));
        jPanel3.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 350, -1));

        jComboBox16.setFont(new java.awt.Font("Microsoft JhengHei", 1, 24)); // NOI18N
        jComboBox16.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose Any One", "Strongly Disagree", "Disagree", "Neutral", "Agree", "Strongly Agree" }));
        jPanel3.add(jComboBox16, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 1760, 350, -1));

        jButton2.setFont(new java.awt.Font("Microsoft JhengHei", 1, 24)); // NOI18N
        jButton2.setText("Submit");
        jButton2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 2110, 150, 50));

        jButton3.setFont(new java.awt.Font("Microsoft JhengHei", 1, 24)); // NOI18N
        jButton3.setText("Reset");
        jButton3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 2110, 150, 50));

        jLabel25.setFont(new java.awt.Font("Microsoft JhengHei", 1, 24)); // NOI18N
        jLabel25.setText("Remarks:");
        jPanel3.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 1860, -1, -1));

        jLabel18.setFont(new java.awt.Font("Microsoft JhengHei", 1, 24)); // NOI18N
        jLabel18.setText("7. The instructor was actively concerned with my progress?");
        jPanel3.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 750, -1, -1));

        jComboBox2.setFont(new java.awt.Font("Microsoft JhengHei", 1, 24)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose any one", "Not at all knowledgeable", "Not so knowledgeable", "Somewhat knowledgeable", "Very knowledgeable", "Extremely knowledgeable" }));
        jPanel3.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, -1));

        jComboBox8.setFont(new java.awt.Font("Microsoft JhengHei", 1, 24)); // NOI18N
        jComboBox8.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose Any One", "Strongly Disagree", "Disagree", "Neutral", "Agree", "Strongly Agree" }));
        jPanel3.add(jComboBox8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 800, 350, -1));

        jComboBox11.setFont(new java.awt.Font("Microsoft JhengHei", 1, 24)); // NOI18N
        jComboBox11.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose Any One", "Strongly Disagree", "Disagree", "Neutral", "Agree", "Strongly Agree" }));
        jPanel3.add(jComboBox11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 1180, 350, -1));

        jLabel24.setFont(new java.awt.Font("Microsoft JhengHei", 1, 24)); // NOI18N
        jLabel24.setText("13. The instructor encouraged students to ask questions and/or express their ideas?");
        jPanel3.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 1480, -1, -1));

        jLabel20.setFont(new java.awt.Font("Microsoft JhengHei", 1, 24)); // NOI18N
        jLabel20.setText("9. The instructor was well prepared for class?");
        jPanel3.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 1000, -1, -1));

        jLabel17.setFont(new java.awt.Font("Microsoft JhengHei", 1, 24)); // NOI18N
        jLabel17.setText("6. The instructor created a stimulating learning atmosphere for critical and independent thinking?");
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 620, -1, -1));

        jLabel13.setFont(new java.awt.Font("Microsoft JhengHei", 1, 24)); // NOI18N
        jLabel13.setText("2.How clearly did your instructor explain the course material?");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        jLabel15.setFont(new java.awt.Font("Microsoft JhengHei", 1, 24)); // NOI18N
        jLabel15.setText("4. How easy was it to approach the instructor with questions or concerns? ");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, -1, -1));

        jLabel21.setFont(new java.awt.Font("Microsoft JhengHei", 1, 24)); // NOI18N
        jLabel21.setText("10. The instructor stimulated my interest in the subject?");
        jPanel3.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 1130, -1, -1));

        jLabel27.setFont(new java.awt.Font("Microsoft JhengHei", 1, 24)); // NOI18N
        jLabel27.setText("15. How would you rate this course overall? ");
        jPanel3.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 1720, -1, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 1920, 350, 90));

        jScrollPane1.setViewportView(jPanel3);

        javax.swing.GroupLayout FeedbackLayout = new javax.swing.GroupLayout(Feedback.getContentPane());
        Feedback.getContentPane().setLayout(FeedbackLayout);
        FeedbackLayout.setHorizontalGroup(
            FeedbackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1918, Short.MAX_VALUE)
        );
        FeedbackLayout.setVerticalGroup(
            FeedbackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 666, Short.MAX_VALUE)
        );

        jDesktopPane1.add(Feedback, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1920, 700));

        jPanel1.add(jDesktopPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 1920, 700));

        jPanel2.setBackground(new java.awt.Color(255, 196, 196));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Microsoft JhengHei", 1, 24)); // NOI18N
        jLabel1.setText("Welcome :");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        jLabel2.setFont(new java.awt.Font("Microsoft JhengHei", 1, 24)); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 160, 30));

        jLabel3.setFont(new java.awt.Font("Lucida Calligraphy", 1, 70)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 51));
        jLabel3.setText("R.R. Group Of Instituitions");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 70, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/download-removebg-preview.png"))); // NOI18N
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1690, 0, -1, -1));

        jLabel5.setFont(new java.awt.Font("Microsoft JhengHei", 1, 24)); // NOI18N
        jLabel5.setText("LogOut");
        jLabel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.gray, java.awt.Color.black, java.awt.Color.lightGray, java.awt.Color.red));
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel5MouseEntered(evt);
            }
        });
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1920, 220));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1920, 1010));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        try {
            sub = (String) jComboBox1.getSelectedItem();
            DBConnection db = new DBConnection();
            db.pstmt = db.con.prepareStatement("select faculty_name from subject_allotment where subject_name=? ");
            db.pstmt.setString(1, sub);
            db.rst = db.pstmt.executeQuery();
            while (db.rst.next()) {
                faculty = db.rst.getString(1);
                jTextField1.setText(db.rst.getString(1));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Feedback.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        try {
            String course, sem, dept;
            course = sem = dept = null;
            String remarks = jTextArea1.getText();
            int que1 = (int) jComboBox2.getSelectedIndex();
            int que2 = (int) jComboBox3.getSelectedIndex();
            int que3 = (int) jComboBox4.getSelectedIndex();
            int que4 = (int) jComboBox5.getSelectedIndex();
            int que5 = (int) jComboBox6.getSelectedIndex();
            int que6 = (int) jComboBox7.getSelectedIndex();
            int que7 = (int) jComboBox8.getSelectedIndex();
            int que8 = (int) jComboBox9.getSelectedIndex();
            int que9 = (int) jComboBox10.getSelectedIndex();
            int que10 = (int) jComboBox11.getSelectedIndex();
            int que11 = (int) jComboBox12.getSelectedIndex();
            int que12 = (int) jComboBox13.getSelectedIndex();
            int que13 = (int) jComboBox14.getSelectedIndex();
            int que14 = (int) jComboBox15.getSelectedIndex();
            int que15 = (int) jComboBox16.getSelectedIndex();
            if (que1 == 0 || que2 == 0 || que3 == 0 || que4 == 0 || que5 == 0 || que6 == 0 || que7 == 0 || que8 == 0 || que9 == 0 || que10 == 0 || que11 == 0 || que12 == 0 || que13 == 0 || que14 == 0 || que15 == 0) {
                JOptionPane.showMessageDialog(this, "Please Answer all the questions!!!!");
                return;
            }
            DBConnection db = new DBConnection();
            db.pstmt = db.con.prepareStatement("select course,semester,dapartment from student_info where user_id=?");
            db.pstmt.setString(1, user);
            db.rst = db.pstmt.executeQuery();
            while (db.rst.next()) {
                course = db.rst.getString(1);
                sem = db.rst.getString(2);
                dept = db.rst.getString(3);
                
            }
            db.pstmt = db.con.prepareStatement("insert into fac_feed_ans(course,sem,faculty,que1,que2,que3,que4,que5,que6,que7,que8,que9,que10,que11,que12,que13,que14,que15,date,subject,remarks) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            db.pstmt.setString(1, course);
            db.pstmt.setString(2, sem);
            db.pstmt.setString(3, faculty);
            db.pstmt.setInt(4, que1);
            db.pstmt.setInt(5, que2);
            db.pstmt.setInt(6, que3);
            db.pstmt.setInt(7, que4);
            db.pstmt.setInt(8, que5);
            db.pstmt.setInt(9, que6);
            db.pstmt.setInt(10, que7);
            db.pstmt.setInt(11, que8);
            db.pstmt.setInt(12, que9);
            db.pstmt.setInt(13, que10);
            db.pstmt.setInt(14, que11);
            db.pstmt.setInt(15, que12);
            db.pstmt.setInt(16, que13);
            db.pstmt.setInt(17, que14);
            db.pstmt.setInt(18, que15);
            db.pstmt.setString(19, new java.util.Date().toString());
            db.pstmt.setString(20, sub);
            if (remarks.equals("")) {
                remarks = null;
            }
            db.pstmt.setString(21, remarks);
            int i = db.pstmt.executeUpdate();
            if (i > 0) {
                JOptionPane.showMessageDialog(this, "Thanks for giving your feedabck.......");
                jComboBox2.setSelectedIndex(0);
                jComboBox3.setSelectedIndex(0);
                jComboBox4.setSelectedIndex(0);
                jComboBox5.setSelectedIndex(0);
                jComboBox6.setSelectedIndex(0);
                jComboBox7.setSelectedIndex(0);
                jComboBox8.setSelectedIndex(0);
                jComboBox9.setSelectedIndex(0);
                jComboBox10.setSelectedIndex(0);
                jComboBox11.setSelectedIndex(0);
                jComboBox12.setSelectedIndex(0);
                jComboBox13.setSelectedIndex(0);
                jComboBox14.setSelectedIndex(0);
                jComboBox15.setSelectedIndex(0);
                jComboBox16.setSelectedIndex(0);
                jTextArea1.setText("");
                
                SubjectDetail.setVisible(true);
                Feedback.hide();
                
            } else {
                JOptionPane.showMessageDialog(this, "Error!!!!!!!!!!");
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        jComboBox2.setSelectedIndex(0);
        jComboBox3.setSelectedIndex(0);
        jComboBox4.setSelectedIndex(0);
        jComboBox5.setSelectedIndex(0);
        jComboBox6.setSelectedIndex(0);
        jComboBox7.setSelectedIndex(0);
        jComboBox8.setSelectedIndex(0);
        jComboBox9.setSelectedIndex(0);
        jComboBox10.setSelectedIndex(0);
        jComboBox11.setSelectedIndex(0);
        jComboBox12.setSelectedIndex(0);
        jComboBox13.setSelectedIndex(0);
        jComboBox14.setSelectedIndex(0);
        jComboBox15.setSelectedIndex(0);
        jComboBox16.setSelectedIndex(0);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
        new LogIn().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel5MouseEntered

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
            java.util.logging.Logger.getLogger(Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Student().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JInternalFrame Feedback;
    private javax.swing.JInternalFrame SubjectDetail;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox10;
    private javax.swing.JComboBox<String> jComboBox11;
    private javax.swing.JComboBox<String> jComboBox12;
    private javax.swing.JComboBox<String> jComboBox13;
    private javax.swing.JComboBox<String> jComboBox14;
    private javax.swing.JComboBox<String> jComboBox15;
    private javax.swing.JComboBox<String> jComboBox16;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JComboBox<String> jComboBox6;
    private javax.swing.JComboBox<String> jComboBox7;
    private javax.swing.JComboBox<String> jComboBox8;
    private javax.swing.JComboBox<String> jComboBox9;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}