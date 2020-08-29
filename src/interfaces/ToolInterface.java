package interfaces;

import forms.AccelerationForm;
import forms.VelocityForm;
import forms.PositionForm;

public class ToolInterface extends javax.swing.JFrame {

    public ToolInterface() {
        initComponents();
    }

    private void initComponents() {

        parent_layout = new javax.swing.JPanel();
        header = new javax.swing.JPanel();
        title_label = new javax.swing.JLabel();
        body = new javax.swing.JPanel();
        divider1 = new javax.swing.JPanel();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel29 = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        xvector_data = new javax.swing.JPanel();
        data1 = new javax.swing.JPanel();
        x0_label = new javax.swing.JLabel();
        x0_field = new javax.swing.JTextField();
        data2 = new javax.swing.JPanel();
        v0x_label = new javax.swing.JLabel();
        v0x_field1 = new javax.swing.JTextField();
        data3 = new javax.swing.JPanel();
        ax_label = new javax.swing.JLabel();
        ax_field = new javax.swing.JTextField();
        yvector_data = new javax.swing.JPanel();
        data4 = new javax.swing.JPanel();
        y0_label = new javax.swing.JLabel();
        y0_field = new javax.swing.JTextField();
        data5 = new javax.swing.JPanel();
        v0y_label = new javax.swing.JLabel();
        voy_field = new javax.swing.JTextField();
        data6 = new javax.swing.JPanel();
        ay_label = new javax.swing.JLabel();
        ay_field = new javax.swing.JTextField();
        create_ball_button = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        divider2 = new javax.swing.JPanel();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel28 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        processing_layout = new javax.swing.JPanel();
        start_button = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        restart_button = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        divider3 = new javax.swing.JPanel();
        jSeparator9 = new javax.swing.JSeparator();
        jLabel30 = new javax.swing.JLabel();
        jSeparator10 = new javax.swing.JSeparator();
        data_layout = new javax.swing.JPanel();
        position_x_label = new javax.swing.JLabel();
        position_x_data = new javax.swing.JLabel();
        position_y_label = new javax.swing.JLabel();
        position_y_data = new javax.swing.JLabel();
        velocity_x_label = new javax.swing.JLabel();
        velocity_x_data = new javax.swing.JLabel();
        velocity_y_label = new javax.swing.JLabel();
        velocity_y_data = new javax.swing.JLabel();
        acceleration_x_label = new javax.swing.JLabel();
        acceleration_x_data = new javax.swing.JLabel();
        acceleration_y_label = new javax.swing.JLabel();
        acceleration_y_data = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cinematic Tools");
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.Y_AXIS));

        parent_layout.setBackground(new java.awt.Color(248, 249, 250));

        header.setBackground(new java.awt.Color(51, 51, 51));

        title_label.setBackground(new java.awt.Color(55, 71, 79));
        title_label.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        title_label.setForeground(new java.awt.Color(255, 255, 255));
        title_label.setText("Cinematic Simulator");
        title_label.setIconTextGap(15);

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(title_label)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(title_label)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        body.setBackground(new java.awt.Color(248, 249, 250));

        divider1.setBackground(new java.awt.Color(248, 249, 250));

        jSeparator7.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator7.setForeground(new java.awt.Color(117, 117, 117));

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(117, 117, 117));
        jLabel29.setText("Ball Settings");

        jSeparator8.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator8.setForeground(new java.awt.Color(117, 117, 117));

        javax.swing.GroupLayout divider1Layout = new javax.swing.GroupLayout(divider1);
        divider1.setLayout(divider1Layout);
        divider1Layout.setHorizontalGroup(
            divider1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(divider1Layout.createSequentialGroup()
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel29)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator8))
        );
        divider1Layout.setVerticalGroup(
            divider1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, divider1Layout.createSequentialGroup()
                .addContainerGap(9, Short.MAX_VALUE)
                .addGroup(divider1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29)
                    .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        xvector_data.setBackground(new java.awt.Color(248, 249, 250));
        xvector_data.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 30, 0));

        data1.setBackground(new java.awt.Color(248, 249, 250));
        data1.setLayout(new java.awt.GridLayout(2, 1, 0, 5));

        x0_label.setBackground(new java.awt.Color(248, 249, 250));
        x0_label.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        x0_label.setForeground(new java.awt.Color(33, 33, 33));
        x0_label.setText("x0: ");
        x0_label.setIconTextGap(12);
        data1.add(x0_label);

        x0_field.setEditable(false);
        x0_field.setBackground(new java.awt.Color(255, 255, 255));
        x0_field.setColumns(7);
        x0_field.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        x0_field.setForeground(new java.awt.Color(33, 33, 33));
        x0_field.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        x0_field.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(189, 189, 189)), javax.swing.BorderFactory.createEmptyBorder(7, 7, 7, 7)));
        x0_field.setMargin(new java.awt.Insets(10, 10, 10, 10));
        x0_field.setName(""); // NOI18N
        data1.add(x0_field);

        xvector_data.add(data1);

        data2.setBackground(new java.awt.Color(248, 249, 250));
        data2.setLayout(new java.awt.GridLayout(2, 1, 0, 5));

        v0x_label.setBackground(new java.awt.Color(248, 249, 250));
        v0x_label.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        v0x_label.setForeground(new java.awt.Color(33, 33, 33));
        v0x_label.setText("v0x:");
        v0x_label.setIconTextGap(12);
        data2.add(v0x_label);

        v0x_field1.setBackground(new java.awt.Color(255, 255, 255));
        v0x_field1.setColumns(7);
        v0x_field1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        v0x_field1.setForeground(new java.awt.Color(33, 33, 33));
        v0x_field1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        v0x_field1.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(189, 189, 189)), javax.swing.BorderFactory.createEmptyBorder(7, 7, 7, 7)));
        v0x_field1.setMargin(new java.awt.Insets(10, 10, 10, 10));
        v0x_field1.setName(""); // NOI18N
        data2.add(v0x_field1);

        xvector_data.add(data2);

        data3.setBackground(new java.awt.Color(248, 249, 250));
        data3.setLayout(new java.awt.GridLayout(2, 1, 0, 5));

        ax_label.setBackground(new java.awt.Color(248, 249, 250));
        ax_label.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ax_label.setForeground(new java.awt.Color(33, 33, 33));
        ax_label.setText("ax:");
        ax_label.setIconTextGap(12);
        data3.add(ax_label);

        ax_field.setBackground(new java.awt.Color(255, 255, 255));
        ax_field.setColumns(7);
        ax_field.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ax_field.setForeground(new java.awt.Color(33, 33, 33));
        ax_field.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        ax_field.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(189, 189, 189)), javax.swing.BorderFactory.createEmptyBorder(7, 7, 7, 7)));
        ax_field.setMargin(new java.awt.Insets(10, 10, 10, 10));
        ax_field.setName(""); // NOI18N
        data3.add(ax_field);

        xvector_data.add(data3);

        yvector_data.setBackground(new java.awt.Color(248, 249, 250));
        yvector_data.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 30, 0));

        data4.setBackground(new java.awt.Color(248, 249, 250));
        data4.setLayout(new java.awt.GridLayout(2, 1, 0, 5));

        y0_label.setBackground(new java.awt.Color(248, 249, 250));
        y0_label.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        y0_label.setForeground(new java.awt.Color(33, 33, 33));
        y0_label.setText("y0: ");
        y0_label.setIconTextGap(12);
        data4.add(y0_label);

        y0_field.setEditable(false);
        y0_field.setBackground(new java.awt.Color(255, 255, 255));
        y0_field.setColumns(7);
        y0_field.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        y0_field.setForeground(new java.awt.Color(33, 33, 33));
        y0_field.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        y0_field.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(189, 189, 189)), javax.swing.BorderFactory.createEmptyBorder(7, 7, 7, 7)));
        y0_field.setMargin(new java.awt.Insets(10, 10, 10, 10));
        y0_field.setName(""); // NOI18N
        data4.add(y0_field);

        yvector_data.add(data4);

        data5.setBackground(new java.awt.Color(248, 249, 250));
        data5.setLayout(new java.awt.GridLayout(2, 1, 0, 5));

        v0y_label.setBackground(new java.awt.Color(248, 249, 250));
        v0y_label.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        v0y_label.setForeground(new java.awt.Color(33, 33, 33));
        v0y_label.setText("v0y:");
        v0y_label.setIconTextGap(12);
        data5.add(v0y_label);

        voy_field.setBackground(new java.awt.Color(255, 255, 255));
        voy_field.setColumns(7);
        voy_field.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        voy_field.setForeground(new java.awt.Color(33, 33, 33));
        voy_field.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        voy_field.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(189, 189, 189)), javax.swing.BorderFactory.createEmptyBorder(7, 7, 7, 7)));
        voy_field.setMargin(new java.awt.Insets(10, 10, 10, 10));
        voy_field.setName(""); // NOI18N
        data5.add(voy_field);

        yvector_data.add(data5);

        data6.setBackground(new java.awt.Color(248, 249, 250));
        data6.setLayout(new java.awt.GridLayout(2, 1, 0, 5));

        ay_label.setBackground(new java.awt.Color(248, 249, 250));
        ay_label.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ay_label.setForeground(new java.awt.Color(33, 33, 33));
        ay_label.setText("ay:");
        ay_label.setIconTextGap(12);
        data6.add(ay_label);

        ay_field.setBackground(new java.awt.Color(255, 255, 255));
        ay_field.setColumns(7);
        ay_field.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ay_field.setForeground(new java.awt.Color(33, 33, 33));
        ay_field.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        ay_field.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(189, 189, 189)), javax.swing.BorderFactory.createEmptyBorder(7, 7, 7, 7)));
        ay_field.setMargin(new java.awt.Insets(10, 10, 10, 10));
        ay_field.setName(""); // NOI18N
        data6.add(ay_field);

        yvector_data.add(data6);

        create_ball_button.setBackground(new java.awt.Color(38, 50, 56));
        create_ball_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        create_ball_button.setName("Home"); // NOI18N
        create_ball_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                onCreateBallButton(evt);
            }
        });
        create_ball_button.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 20, 10));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Create");
        jLabel4.setIconTextGap(15);
        create_ball_button.add(jLabel4);

        divider2.setBackground(new java.awt.Color(248, 249, 250));

        jSeparator5.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator5.setForeground(new java.awt.Color(117, 117, 117));

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(117, 117, 117));
        jLabel28.setText("Processing");

        jSeparator6.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator6.setForeground(new java.awt.Color(117, 117, 117));

        javax.swing.GroupLayout divider2Layout = new javax.swing.GroupLayout(divider2);
        divider2.setLayout(divider2Layout);
        divider2Layout.setHorizontalGroup(
            divider2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(divider2Layout.createSequentialGroup()
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel28)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator6))
        );
        divider2Layout.setVerticalGroup(
            divider2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, divider2Layout.createSequentialGroup()
                .addContainerGap(9, Short.MAX_VALUE)
                .addGroup(divider2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28)
                    .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        processing_layout.setBackground(new java.awt.Color(248, 249, 250));
        processing_layout.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 25, 0));

        start_button.setBackground(new java.awt.Color(40, 167, 69));
        start_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        start_button.setName("Home"); // NOI18N
        start_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                onStartSimulation(evt);
            }
        });
        start_button.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 20, 10));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Start/Stop");
        jLabel5.setIconTextGap(15);
        start_button.add(jLabel5);

        processing_layout.add(start_button);

        restart_button.setBackground(new java.awt.Color(38, 50, 56));
        restart_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        restart_button.setName("Home"); // NOI18N
        restart_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                onRestartSimulation(evt);
            }
        });
        restart_button.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 20, 10));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Restart");
        jLabel6.setIconTextGap(15);
        restart_button.add(jLabel6);

        processing_layout.add(restart_button);

        divider3.setBackground(new java.awt.Color(248, 249, 250));

        jSeparator9.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator9.setForeground(new java.awt.Color(117, 117, 117));

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(117, 117, 117));
        jLabel30.setText("Data");

        jSeparator10.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator10.setForeground(new java.awt.Color(117, 117, 117));

        javax.swing.GroupLayout divider3Layout = new javax.swing.GroupLayout(divider3);
        divider3.setLayout(divider3Layout);
        divider3Layout.setHorizontalGroup(
            divider3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(divider3Layout.createSequentialGroup()
                .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel30)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator10, javax.swing.GroupLayout.DEFAULT_SIZE, 311, Short.MAX_VALUE))
        );
        divider3Layout.setVerticalGroup(
            divider3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, divider3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(divider3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel30)
                    .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63))
        );

        data_layout.setBackground(new java.awt.Color(248, 249, 250));
        data_layout.setLayout(new java.awt.GridLayout(6, 2, 0, 5));

        position_x_label.setBackground(new java.awt.Color(247, 249, 249));
        position_x_label.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        position_x_label.setForeground(new java.awt.Color(33, 33, 33));
        position_x_label.setText("Position-x: ");
        data_layout.add(position_x_label);

        position_x_data.setBackground(new java.awt.Color(247, 249, 249));
        position_x_data.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        position_x_data.setForeground(new java.awt.Color(33, 33, 33));
        position_x_data.setText("x");
        data_layout.add(position_x_data);

        position_y_label.setBackground(new java.awt.Color(247, 249, 249));
        position_y_label.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        position_y_label.setForeground(new java.awt.Color(33, 33, 33));
        position_y_label.setText("Position-y: ");
        data_layout.add(position_y_label);

        position_y_data.setBackground(new java.awt.Color(247, 249, 249));
        position_y_data.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        position_y_data.setForeground(new java.awt.Color(33, 33, 33));
        position_y_data.setText("y");
        data_layout.add(position_y_data);

        velocity_x_label.setBackground(new java.awt.Color(247, 249, 249));
        velocity_x_label.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        velocity_x_label.setForeground(new java.awt.Color(33, 33, 33));
        velocity_x_label.setText("Velocity-x: ");
        data_layout.add(velocity_x_label);

        velocity_x_data.setBackground(new java.awt.Color(247, 249, 249));
        velocity_x_data.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        velocity_x_data.setForeground(new java.awt.Color(33, 33, 33));
        velocity_x_data.setText("vx");
        data_layout.add(velocity_x_data);

        velocity_y_label.setBackground(new java.awt.Color(247, 249, 249));
        velocity_y_label.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        velocity_y_label.setForeground(new java.awt.Color(33, 33, 33));
        velocity_y_label.setText("Velocity-y: ");
        data_layout.add(velocity_y_label);

        velocity_y_data.setBackground(new java.awt.Color(247, 249, 249));
        velocity_y_data.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        velocity_y_data.setForeground(new java.awt.Color(33, 33, 33));
        velocity_y_data.setText("vy");
        data_layout.add(velocity_y_data);

        acceleration_x_label.setBackground(new java.awt.Color(247, 249, 249));
        acceleration_x_label.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        acceleration_x_label.setForeground(new java.awt.Color(33, 33, 33));
        acceleration_x_label.setText("Aceleration-x:");
        data_layout.add(acceleration_x_label);

        acceleration_x_data.setBackground(new java.awt.Color(247, 249, 249));
        acceleration_x_data.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        acceleration_x_data.setForeground(new java.awt.Color(33, 33, 33));
        acceleration_x_data.setText("ax");
        data_layout.add(acceleration_x_data);

        acceleration_y_label.setBackground(new java.awt.Color(247, 249, 249));
        acceleration_y_label.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        acceleration_y_label.setForeground(new java.awt.Color(33, 33, 33));
        acceleration_y_label.setText("Aceleration-y:");
        data_layout.add(acceleration_y_label);

        acceleration_y_data.setBackground(new java.awt.Color(247, 249, 249));
        acceleration_y_data.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        acceleration_y_data.setForeground(new java.awt.Color(33, 33, 33));
        acceleration_y_data.setText("ay");
        data_layout.add(acceleration_y_data);

        javax.swing.GroupLayout bodyLayout = new javax.swing.GroupLayout(body);
        body.setLayout(bodyLayout);
        bodyLayout.setHorizontalGroup(
            bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(divider2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(xvector_data, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(yvector_data, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(processing_layout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(divider3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(bodyLayout.createSequentialGroup()
                .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bodyLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(create_ball_button, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(bodyLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(data_layout, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(bodyLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(divider1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        bodyLayout.setVerticalGroup(
            bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodyLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(xvector_data, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(yvector_data, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(create_ball_button, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(divider2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(processing_layout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(divider3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(data_layout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
            .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(bodyLayout.createSequentialGroup()
                    .addGap(10, 10, 10)
                    .addComponent(divider1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(501, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout parent_layoutLayout = new javax.swing.GroupLayout(parent_layout);
        parent_layout.setLayout(parent_layoutLayout);
        parent_layoutLayout.setHorizontalGroup(
            parent_layoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(body, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        parent_layoutLayout.setVerticalGroup(
            parent_layoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(parent_layoutLayout.createSequentialGroup()
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(body, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(parent_layout);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void onCreateBallButton(java.awt.event.MouseEvent evt) {
        
        VelocityForm velocityForm = new VelocityForm("", "");
        if (velocityForm.isDataValid){
            
        }

    }

    private void onStartSimulation(java.awt.event.MouseEvent evt) {
        
    }

    private void onRestartSimulation(java.awt.event.MouseEvent evt) {
        
    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ToolInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ToolInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ToolInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ToolInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ToolInterface().setVisible(true);
            }
        });
    }

    private javax.swing.JLabel acceleration_x_data;
    private javax.swing.JLabel acceleration_x_label;
    private javax.swing.JLabel acceleration_y_data;
    private javax.swing.JLabel acceleration_y_label;
    private javax.swing.JTextField ax_field;
    private javax.swing.JLabel ax_label;
    private javax.swing.JTextField ay_field;
    private javax.swing.JLabel ay_label;
    private javax.swing.JPanel body;
    private javax.swing.JPanel create_ball_button;
    private javax.swing.JPanel data1;
    private javax.swing.JPanel data2;
    private javax.swing.JPanel data3;
    private javax.swing.JPanel data4;
    private javax.swing.JPanel data5;
    private javax.swing.JPanel data6;
    private javax.swing.JPanel data_layout;
    private javax.swing.JPanel divider1;
    private javax.swing.JPanel divider2;
    private javax.swing.JPanel divider3;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JPanel parent_layout;
    private javax.swing.JLabel position_x_data;
    private javax.swing.JLabel position_x_label;
    private javax.swing.JLabel position_y_data;
    private javax.swing.JLabel position_y_label;
    private javax.swing.JPanel processing_layout;
    private javax.swing.JPanel restart_button;
    private javax.swing.JPanel start_button;
    private javax.swing.JLabel title_label;
    private javax.swing.JTextField v0x_field1;
    private javax.swing.JLabel v0x_label;
    private javax.swing.JLabel v0y_label;
    private javax.swing.JLabel velocity_x_data;
    private javax.swing.JLabel velocity_x_label;
    private javax.swing.JLabel velocity_y_data;
    private javax.swing.JLabel velocity_y_label;
    private javax.swing.JTextField voy_field;
    private javax.swing.JTextField x0_field;
    private javax.swing.JLabel x0_label;
    private javax.swing.JPanel xvector_data;
    private javax.swing.JTextField y0_field;
    private javax.swing.JLabel y0_label;
    private javax.swing.JPanel yvector_data;
}
