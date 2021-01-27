package TSA_App.newpackage;

//Importing packages and classes
import java.awt.Color;
import java.time.*;
import java.time.format.DateTimeFormatter;
import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class App_Home extends javax.swing.JFrame {
    //Creating an object of java.time class
    LocalTime time1 = LocalTime.now();
    DateTimeFormatter time1Formatter = DateTimeFormatter.ofPattern("HH:mm");
    LocalDateTime time2 = LocalDateTime.now();
    DateTimeFormatter DayMonthFormatter = DateTimeFormatter.ofPattern("E, MMM dd yyyy");

    Color obj1 = new Color(0,0,0);
    File obj2 = new File("C:\\Users\\Aayush\\Desktop\\TSA App Icons");

    //Declaring variables
    int c = 0;
    int page1click = 0;
    int page2click = 0;

    public App_Home() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        //Creating objects of classes
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        Close_Button = new javax.swing.JLabel();
        Chat_Room = new javax.swing.JLabel();
        App_Name = new javax.swing.JLabel();
        Time = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Menu_Icon = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        Public_Transportation_Panel = new javax.swing.JPanel();
        Public_Tansportation_Icon = new javax.swing.JLabel();
        Public_Transportation_Word = new javax.swing.JLabel();
        Map_Panel = new javax.swing.JPanel();
        Map_Icon = new javax.swing.JLabel();
        Map_Word = new javax.swing.JLabel();
        Recreation_Panel = new javax.swing.JPanel();
        Recreation_Icon = new javax.swing.JLabel();
        Recreation_Word = new javax.swing.JLabel();
        Food_Panel = new javax.swing.JPanel();
        Food_Icon = new javax.swing.JLabel();
        Food_Word = new javax.swing.JLabel();
        Shopping_Panel = new javax.swing.JPanel();
        Shopping_Icon = new javax.swing.JLabel();
        Shopping_Word = new javax.swing.JLabel();
        Calendar_Panel = new javax.swing.JPanel();
        Calendar_Icon = new javax.swing.JLabel();
        Calendar_Word = new javax.swing.JLabel();
        Schools_Panel = new javax.swing.JPanel();
        Schools_Icon = new javax.swing.JLabel();
        Schools_Word = new javax.swing.JLabel();
        About_Panel = new javax.swing.JPanel();
        About_Icon = new javax.swing.JLabel();
        About_Word = new javax.swing.JLabel();
        Weather_Panel = new javax.swing.JPanel();
        Weather_Icon = new javax.swing.JLabel();
        Weather_Temperature = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel12 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        Add_Chat = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        When1 = new javax.swing.JLabel();
        When2 = new javax.swing.JLabel();
        When3 = new javax.swing.JLabel();
        Where1 = new javax.swing.JLabel();
        Where2 = new javax.swing.JLabel();
        Where3 = new javax.swing.JLabel();
        Cost1 = new javax.swing.JLabel();
        Cost2 = new javax.swing.JLabel();
        Cost3 = new javax.swing.JLabel();
        Directions1 = new javax.swing.JLabel();
        Directions2 = new javax.swing.JLabel();
        Directions3 = new javax.swing.JLabel();
        Calendar1 = new javax.swing.JTextField();
        Calendar2 = new javax.swing.JTextField();
        Calendar3 = new javax.swing.JTextField();
        Transportation1 = new javax.swing.JLabel();
        Transportation2 = new javax.swing.JLabel();
        Transportation3 = new javax.swing.JLabel();
        Step2 = new javax.swing.JLabel();
        Step3 = new javax.swing.JLabel();
        Step4 = new javax.swing.JLabel();
        Step5 = new javax.swing.JLabel();
        Step6 = new javax.swing.JLabel();
        Step7 = new javax.swing.JLabel();
        About2 = new javax.swing.JLabel();
        About3 = new javax.swing.JLabel();
        About4 = new javax.swing.JLabel();
        AboutPic1 = new javax.swing.JLabel();
        AboutPic2 = new javax.swing.JLabel();
        AboutPic3 = new javax.swing.JLabel();
        AboutPic4 = new javax.swing.JLabel();
        AboutPic5 = new javax.swing.JLabel();
        Page_Label = new javax.swing.JLabel();
        Page_1_Label = new javax.swing.JLabel();
        Page_Line = new javax.swing.JLabel();
        Page_2_Label = new javax.swing.JLabel();
        Hours1 = new javax.swing.JLabel();
        Hours2 = new javax.swing.JLabel();
        Hours3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);
        setSize(new java.awt.Dimension(100, 100));

        //Defining parameters of components
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jPanel2.setBackground(new java.awt.Color(0, 153, 0));

        Close_Button.setForeground(new java.awt.Color(240, 240, 240));
        Close_Button.setIcon(new javax.swing.ImageIcon("C:\\Users\\Aayush\\Desktop\\TSA App Icons\\icons8_delete_32px_2.png")); // NOI18N
        Close_Button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Close_ButtonMouseReleased(evt);
            }
        });

        Chat_Room.setForeground(new java.awt.Color(240, 240, 240));
        Chat_Room.setIcon(new javax.swing.ImageIcon("C:\\Users\\Aayush\\Desktop\\TSA App Icons\\icons8_chat_room_30px.png")); // NOI18N
        Chat_Room.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Chat_RoomMouseReleased(evt);
            }
        });

        App_Name.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        App_Name.setForeground(new java.awt.Color(255, 255, 255));
        App_Name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        App_Name.setText("TownMate");
        App_Name.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        App_Name.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                App_NameMouseReleased(evt);
            }
        });

         // NOI18N
        Directions1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Directions1MouseReleased(evt);
            }
        });

        Calendar1.setVisible(false);
        Calendar2.setVisible(false);
        Calendar3.setVisible(false);

        Transportation1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Transportation1MouseReleased(evt);
            }
        });

        Directions3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Directions3MouseReleased(evt);
            }
        });

        LocalDateTime time2 = LocalDateTime.now();
        DateTimeFormatter DayMonthFormatter = DateTimeFormatter.ofPattern("E, MMM dd yyyy");
        String a = String.valueOf(time2);
        String b = time2.format(DayMonthFormatter);
        Time.setText(b);
        Time.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        Time.setForeground(new java.awt.Color(255, 255, 255));
        Time.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Time.setToolTipText("Date");

        LocalTime time1 = LocalTime.now();
        DateTimeFormatter time1Formatter = DateTimeFormatter.ofPattern("HH:mm");
        String i = String.valueOf(time1);
        String o = time1.format(time1Formatter);
        jLabel1.setText(o);
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setToolTipText("Time");

        Menu_Icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Menu_Icon.setIcon(new javax.swing.ImageIcon("C:\\Users\\Aayush\\Desktop\\TSA App Icons\\icons8_menu_32px_1.png")); // NOI18N
        Menu_Icon.setToolTipText("Menu");
        Menu_Icon.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Menu_Icon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Menu_IconMouseReleased(evt);
            }
        });

        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\Aayush\\Desktop\\TSA App Icons\\icons8_settings_32px.png")); // NOI18N

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon("C:\\Users\\Aayush\\Desktop\\TSA App Icons\\icons8_search_16px_1.png")); // NOI18N

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        //Setting the locations of components
        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Menu_Icon, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(625, 625, 625)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(560, 560, 560)
                        .addComponent(Time, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(565,565, 565)
                        .addComponent(App_Name)
                        .addGap(550, 550, 550)
                        .addComponent(jLabel8)))
                .addComponent(Close_Button))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Chat_Room)
                .addGap(15,15,15)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addGap(6, 6, 6))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Close_Button)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel8)
                            .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(App_Name)
                                    .addGap(1, 1, 1)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(Menu_Icon, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE))))))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Time, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Chat_Room)
                        .addComponent(jTextField1)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        Public_Transportation_Panel.setBackground(new java.awt.Color(255, 255, 255));
        Public_Transportation_Panel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Public_Transportation_PanelMouseReleased(evt);
            }
        });

        Public_Tansportation_Icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Public_Tansportation_Icon.setIcon(new javax.swing.ImageIcon("C:\\Users\\Aayush\\Desktop\\TSA App Icons\\icons8_bus_30px.png")); // NOI18N
        Public_Tansportation_Icon.setToolTipText("Bus Icon");
        Public_Tansportation_Icon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Public_Tansportation_IconMouseClicked(evt);
            }
        });

        Public_Transportation_Word.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Public_Transportation_Word.setForeground(new java.awt.Color(255, 255, 255));
        Public_Transportation_Word.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Public_Transportation_Word.setText("Transportation");
        Public_Transportation_Word.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Public_Transportation_WordMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout Public_Transportation_PanelLayout = new javax.swing.GroupLayout(Public_Transportation_Panel);
        Public_Transportation_Panel.setLayout(Public_Transportation_PanelLayout);
        Public_Transportation_PanelLayout.setHorizontalGroup(
            Public_Transportation_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Public_Transportation_PanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(Public_Tansportation_Icon, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3,3,3)
                .addComponent(Public_Transportation_Word, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        Public_Transportation_PanelLayout.setVerticalGroup(
            Public_Transportation_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Public_Transportation_PanelLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(Public_Transportation_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Public_Transportation_Word, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Public_Tansportation_Icon, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Map_Panel.setBackground(new java.awt.Color(255, 255, 255));
        Map_Panel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Map_PanelMouseReleased(evt);
            }
        });

        Map_Icon.setIcon(new javax.swing.ImageIcon("C:\\Users\\Aayush\\Desktop\\TSA App Icons\\icons8_map_32px.png")); // NOI18N
        Map_Icon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Map_IconMouseReleased(evt);
            }
        });

        Map_Word.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Map_Word.setForeground(new java.awt.Color(255, 255, 255));
        Map_Word.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Map_Word.setText("Map");
        Map_Word.setToolTipText("");
        Map_Word.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Map_WordMouseReleased(evt);
            }
        });
        Map_Word.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Map_WordKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout Map_PanelLayout = new javax.swing.GroupLayout(Map_Panel);
        Map_Panel.setLayout(Map_PanelLayout);
        Map_PanelLayout.setHorizontalGroup(
            Map_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Map_PanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(Map_Icon, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(Map_Word, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Map_PanelLayout.setVerticalGroup(
            Map_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Map_PanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(Map_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Map_Icon, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Map_Word, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
        );

        Recreation_Panel.setBackground(new java.awt.Color(255, 255, 255));
        Recreation_Panel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Recreation_PanelMouseReleased(evt);
            }
        });

        Recreation_Icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Recreation_Icon.setIcon(new javax.swing.ImageIcon("C:\\Users\\Aayush\\Desktop\\TSA App Icons\\icons8_volleyball_32px.png")); // NOI18N
        Recreation_Icon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Recreation_IconMouseReleased(evt);
            }
        });
        Recreation_Icon.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Recreation_IconKeyReleased(evt);
            }
        });

        Recreation_Word.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Recreation_Word.setForeground(new java.awt.Color(255, 255, 255));
        Recreation_Word.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Recreation_Word.setText("Recreation");
        Recreation_Word.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Recreation_WordMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout Recreation_PanelLayout = new javax.swing.GroupLayout(Recreation_Panel);
        Recreation_Panel.setLayout(Recreation_PanelLayout);
        Recreation_PanelLayout.setHorizontalGroup(
            Recreation_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Recreation_PanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(Recreation_Icon, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(Recreation_Word)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Recreation_PanelLayout.setVerticalGroup(
            Recreation_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Recreation_PanelLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(Recreation_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Recreation_Word, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Recreation_Icon, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        Food_Panel.setBackground(new java.awt.Color(255, 255, 255));
        Food_Panel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Food_PanelMouseReleased(evt);
            }
        });

        Food_Icon.setIcon(new javax.swing.ImageIcon("C:\\Users\\Aayush\\Desktop\\TSA App Icons\\icons8_food_30px.png")); // NOI18N
        Food_Icon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Food_IconMouseReleased(evt);
            }
        });

        Food_Word.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Food_Word.setForeground(new java.awt.Color(255, 255, 255));
        Food_Word.setText("Food");
        Food_Word.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Food_WordMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout Food_PanelLayout = new javax.swing.GroupLayout(Food_Panel);
        Food_Panel.setLayout(Food_PanelLayout);
        Food_PanelLayout.setHorizontalGroup(
            Food_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Food_PanelLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(Food_Icon, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(Food_Word, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Food_PanelLayout.setVerticalGroup(
            Food_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Food_PanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(Food_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Food_Icon, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                    .addComponent(Food_Word, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        Shopping_Panel.setBackground(new java.awt.Color(255, 255, 255));
        Shopping_Panel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Shopping_PanelMouseReleased(evt);
            }
        });

        Shopping_Icon.setIcon(new javax.swing.ImageIcon("C:\\Users\\Aayush\\Desktop\\TSA App Icons\\icons8_shopping_cart_32px.png")); // NOI18N
        Shopping_Icon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Shopping_IconMouseReleased(evt);
            }
        });

        Shopping_Word.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Shopping_Word.setForeground(new java.awt.Color(255, 255, 255));
        Shopping_Word.setText("Shopping");
        Shopping_Word.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Shopping_WordMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout Shopping_PanelLayout = new javax.swing.GroupLayout(Shopping_Panel);
        Shopping_Panel.setLayout(Shopping_PanelLayout);
        Shopping_PanelLayout.setHorizontalGroup(
            Shopping_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Shopping_PanelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(Shopping_Icon, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(Shopping_Word)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Shopping_PanelLayout.setVerticalGroup(
            Shopping_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Shopping_PanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(Shopping_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Shopping_Word, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Shopping_Icon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)))
        );

        Calendar_Panel.setBackground(new java.awt.Color(255, 255, 255));
        Calendar_Panel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Calendar_PanelMouseReleased(evt);
            }
        });

        Calendar_Icon.setIcon(new javax.swing.ImageIcon("C:\\Users\\Aayush\\Desktop\\TSA App Icons\\icons8_schedule_30px.png")); // NOI18N
        Calendar_Icon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Calendar_IconMouseReleased(evt);
            }
        });

        Calendar_Word.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Calendar_Word.setForeground(new java.awt.Color(255, 255, 255));
        Calendar_Word.setText("Calendar");
        Calendar_Word.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Calendar_WordMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout Calendar_PanelLayout = new javax.swing.GroupLayout(Calendar_Panel);
        Calendar_Panel.setLayout(Calendar_PanelLayout);
        Calendar_PanelLayout.setHorizontalGroup(
            Calendar_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Calendar_PanelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(Calendar_Icon, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(Calendar_Word)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Calendar_PanelLayout.setVerticalGroup(
            Calendar_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Calendar_PanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(Calendar_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Calendar_Word, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Calendar_Icon, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
        );

        Schools_Panel.setBackground(new java.awt.Color(255, 255, 255));
        Schools_Panel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Schools_PanelMouseReleased(evt);
            }
        });

        Schools_Icon.setIcon(new javax.swing.ImageIcon("C:\\Users\\Aayush\\Desktop\\TSA App Icons\\icons8_school_house_32px.png")); // NOI18N
        Schools_Icon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Schools_IconMouseReleased(evt);
            }
        });

        Schools_Word.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Schools_Word.setForeground(new java.awt.Color(255, 255, 255));
        Schools_Word.setText("Schools");
        Schools_Word.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Schools_WordMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout Schools_PanelLayout = new javax.swing.GroupLayout(Schools_Panel);
        Schools_Panel.setLayout(Schools_PanelLayout);
        Schools_PanelLayout.setHorizontalGroup(
            Schools_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Schools_PanelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(Schools_Icon, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(Schools_Word, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Schools_PanelLayout.setVerticalGroup(
            Schools_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Schools_Word, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Schools_Icon, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );

        About_Panel.setBackground(new java.awt.Color(255, 255, 255));
        About_Panel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                About_PanelMouseReleased(evt);
            }
        });

        About_Icon.setIcon(new javax.swing.ImageIcon("C:\\Users\\Aayush\\Desktop\\TSA App Icons\\icons8_info_32px.png")); // NOI18N
        About_Icon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                About_IconMouseReleased(evt);
            }
        });

        About_Word.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        About_Word.setForeground(new java.awt.Color(255, 255, 255));
        About_Word.setText("About");
        About_Word.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                About_WordMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout About_PanelLayout = new javax.swing.GroupLayout(About_Panel);
        About_Panel.setLayout(About_PanelLayout);
        About_PanelLayout.setHorizontalGroup(
            About_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(About_PanelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(About_Icon, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(About_Word)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        About_PanelLayout.setVerticalGroup(
            About_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, About_PanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(About_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(About_Icon, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                    .addComponent(About_Word, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );

        Weather_Panel.setBackground(new java.awt.Color(255, 255, 255));

        Weather_Icon.setIcon(new javax.swing.ImageIcon("C:\\Users\\Aayush\\Desktop\\TSA App Icons\\icons8_sun_30px_1.png")); // NOI18N

        Weather_Temperature.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        Weather_Temperature.setForeground(new java.awt.Color(255, 255, 255));
        Weather_Temperature.setText("64° F");

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("Metuchen, NJ");

        javax.swing.GroupLayout Weather_PanelLayout = new javax.swing.GroupLayout(Weather_Panel);
        Weather_Panel.setLayout(Weather_PanelLayout);
        Weather_PanelLayout.setHorizontalGroup(
            Weather_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Weather_PanelLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(Weather_Icon)
                .addGap(16, 16, 16)
                .addGroup(Weather_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Weather_Temperature)
                    .addComponent(jLabel30))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Weather_PanelLayout.setVerticalGroup(
            Weather_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Weather_PanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(Weather_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Weather_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Weather_Temperature)
                        .addComponent(Weather_Icon))
                    .addComponent(jLabel30, javax.swing.GroupLayout.Alignment.TRAILING)))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Public_Transportation_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Map_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Recreation_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Food_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Shopping_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Calendar_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Schools_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(About_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Weather_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(Public_Transportation_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(Map_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(Recreation_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(Food_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(Shopping_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(Calendar_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(Schools_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(About_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Weather_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel18.setText("What's Happening");

        Add_Chat.setText("");

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel19.setText("Easter Egg Hunt");
        jLabel19.setToolTipText("LimeBike Location");
        jLabel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel19MouseReleased(evt);
            }
        });

        String Easter_Description1 = "Children find plastic eggs containing chocolate.";
        String Easter_Description2 = "When: April 8, 2020 from 12 pm to 3 pm";
        String Easter_Description3 = "Where: Roosevelt Park, Edison NJ";

        String Car_Description1 = "Cars of the late 1900s are showed off.";
        String Car_Description2 = "When: April 9, 2020 from 4 pm to 7 pm";
        String Car_Description3 = "Where: Main Street, Metuchen NJ";

        String Blood_Description1 = "A donation blood drive.";
        String Blood_Description2 = "When: April 10, 2020 from 12 pm to 8 pm";
        String Blood_Description3 = "Where: Cathedral of Saint Francis, Metuchen NJ";

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel20.setText(Easter_Description1);

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel21.setText("Vintage Car Show");

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel22.setText(Car_Description1);

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel23.setText("Metuchen Blood Drive ");

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel24.setText(Blood_Description1);

        jLabel25.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("file:/C:/Users/Aayush/Desktop/TSA%20App%20Icons/EasterEggHunt2.jpg")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());

        jLabel26.setIcon(new javax.swing.ImageIcon("C:\\Users\\Aayush\\Desktop\\TSA App Icons\\Car-Show2.jpg")); // NOI18N

        jLabel27.setIcon(new javax.swing.ImageIcon("C:\\Users\\Aayush\\Desktop\\TSA App Icons\\blood_drive_thumbnail.png")); // NOI18N

        When1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        When1.setText(Easter_Description2);

        When2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        When2.setText(Car_Description2);

        When3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        When3.setText(Blood_Description2);

        Where1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Where1.setText(Easter_Description3);

        Where2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Where2.setText(Car_Description3);

        Where3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Where3.setText(Blood_Description3);

        Cost1.setFont(new java.awt.Font("Tahoma", 1, 18));
        Cost1.setText("Cost: Free");

        Cost2.setFont(new java.awt.Font("Tahoma", 1, 18));
        Cost2.setText("Cost: Free");

        Cost3.setFont(new java.awt.Font("Tahoma", 1, 18));
        Cost3.setText("Cost: Free");

        Directions1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Directions1.setForeground(new java.awt.Color(0, 102, 255));
        Directions1.setText("Directions");

        Transportation1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Transportation1.setForeground(new java.awt.Color(0, 102, 255));
        Transportation1.setText("Transportation");

        Transportation2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Transportation2.setForeground(new java.awt.Color(0, 102, 255));
        Transportation2.setText("Transportation");

        Transportation3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Transportation3.setForeground(new java.awt.Color(0, 102, 255));
        Transportation3.setText("Transportation");

        Directions2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Directions2.setForeground(new java.awt.Color(0, 102, 255));
        Directions2.setText("Directions");

        Directions3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Directions3.setForeground(new java.awt.Color(0, 102, 255));
        Directions3.setText("Directions");

        Step2.setFont(new java.awt.Font("Tahoma", 1, 18));
        Step3.setFont(new java.awt.Font("Tahoma", 1, 18));
        Step4.setFont(new java.awt.Font("Tahoma", 1, 18));
        Step5.setFont(new java.awt.Font("Tahoma", 1, 18));
        Step6.setFont(new java.awt.Font("Tahoma", 1, 18));
        Step7.setFont(new java.awt.Font("Tahoma", 1, 18));

        About2.setFont(new java.awt.Font("Tahoma", 1, 18));
        About3.setFont(new java.awt.Font("Tahoma", 1, 18));
        About4.setFont(new java.awt.Font("Tahoma", 1, 18));

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                            .addGap(725,725,725)
                            .addComponent(Add_Chat)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel23)
                                    .addComponent(jLabel24)
                                    .addComponent(When3)
                                    .addComponent(Where3)
                                        .addComponent(Cost3)
                                    .addComponent(Directions3)
                                    .addComponent(Transportation3)
                                    .addComponent(Hours3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel27))
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel19)
                                    .addComponent(jLabel20)
                                        .addComponent(Step2)
                                        .addComponent(Calendar1)
                                        .addComponent(Step3)
                                        .addComponent(Calendar2)
                                        .addComponent(Step4)
                                        .addComponent(Calendar3)
                                        .addComponent(Step5)
                                        .addComponent(Step6)
                                        .addComponent(Step7)
                                    .addComponent(When1)
                                    .addComponent(Where1)
                                    .addComponent(Cost1)
                                    .addComponent(Directions1)
                                    .addComponent(Transportation1)
                                    .addComponent(Hours1)
                                        .addComponent(AboutPic1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(AboutPic2)
                                    .addComponent(jLabel25)
                                    .addComponent(AboutPic3))
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel21)
                                    .addComponent(jLabel22)
                                        .addComponent(About2)
                                        .addComponent(About3)
                                        .addComponent(About4)
                                    .addComponent(When2)
                                    .addComponent(Where2)
                                        .addComponent(Cost2)
                                    .addComponent(Directions2)
                                    .addComponent(Transportation2)
                                    .addComponent(Hours2)
                                        .addComponent(AboutPic4)
                                    .addComponent(AboutPic5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 495, Short.MAX_VALUE)
                                .addComponent(jLabel26)))
                        .addGap(174, 174, 174))))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18)
                .addComponent(Add_Chat)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel20)
                            .addComponent(Step2)
                            .addComponent(Calendar1)
                            .addComponent(Step3)
                            .addComponent(Calendar2)
                            .addComponent(Step4)
                            .addComponent(Calendar3)
                            .addComponent(Step5)
                            .addComponent(Step6)
                            .addComponent(Step7)
                        .addComponent(When1)
                        .addComponent(Where1)
                            .addComponent(Cost1)
                        .addComponent(Directions1)
                        .addComponent(Transportation1)
                        .addComponent(Hours1)
                        .addComponent(AboutPic1)
                        .addComponent(AboutPic2)
                        .addComponent(AboutPic3))
                    .addComponent(jLabel25))
                .addGap(77, 77, 77)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel22)
                         .addComponent(When2)
                         .addComponent(Where2)
                            .addComponent(Cost2)
                            .addComponent(About2)
                            .addComponent(About3)
                            .addComponent(About4)
                        .addComponent(Directions2)
                        .addComponent(Transportation2)
                        .addComponent(Hours2)
                        .addComponent(AboutPic4)
                        .addComponent(AboutPic5))
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(77, 77, 77)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jLabel23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel24)
                        .addComponent(When3)
                        .addComponent(Where3)
                            .addComponent(Cost3)
                        .addComponent(Directions3)
                        .addComponent(Transportation3)
                        .addComponent(Hours3))
                    .addComponent(jLabel27, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Page_Label.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        Page_Label.setForeground(new java.awt.Color(255, 255, 255));
        Page_Label.setText("Page");

        Page_1_Label.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        Page_1_Label.setForeground(new java.awt.Color(255, 255, 255));
        Page_1_Label.setText(" 1 ");
        Page_1_Label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Page_1_LabelMouseReleased(evt);
            }
        });

        Hours1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Hours1.setForeground(new java.awt.Color(255, 255, 255));
        Hours1.setText("Hours");

        Hours2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Hours2.setForeground(new java.awt.Color(255, 255, 255));
        Hours2.setText("Hours");

        Hours3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Hours3.setForeground(new java.awt.Color(255, 255, 255));
        Hours3.setText("Hours");

        Page_Line.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        Page_Line.setForeground(new java.awt.Color(255, 255, 255));
        Page_Line.setText("|");

        Page_2_Label.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        Page_2_Label.setForeground(new java.awt.Color(255, 255, 255));
        Page_2_Label.setText(" 2 ");
        Page_2_Label.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Page_2_Label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Page_2_LabelMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(410, 410, 410)
                .addComponent(Page_Label)
                .addComponent(Page_1_Label)
                .addComponent(Page_Line)
                .addGap(0, 0, 0)
                .addComponent(Page_2_Label)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Page_Label)
                    .addComponent(Page_1_Label)
                    .addComponent(Page_Line)
                    .addComponent(Page_2_Label))
                .addGap(0, 218, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel12);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Close_ButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Close_ButtonMouseReleased
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_Close_ButtonMouseReleased

    private void Menu_IconMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Menu_IconMouseReleased
        // TODO add your handling code here:
        LocalTime time1 = LocalTime.now();
        DateTimeFormatter time1Formatter = DateTimeFormatter.ofPattern("HH:mm");
        LocalDateTime time2 = LocalDateTime.now();
        DateTimeFormatter DayMonthFormatter = DateTimeFormatter.ofPattern("E, MMM dd yyyy");
        String a = String.valueOf(time1);
        String b = time1.format(time1Formatter);
        jLabel1.setText(b);
        String d = String.valueOf(time2);
        String e = time2.format(DayMonthFormatter);
        Time.setText(e);
        Page_Label.setForeground(new java.awt.Color(255,255,255));
        Page_Line.setForeground(new java.awt.Color(255,255,255));
        Page_1_Label.setForeground(new java.awt.Color(255,255,255));
        Page_2_Label.setForeground(new java.awt.Color(255,255,255));
        c+=1;
        if (c % 2 == 1) {
            jPanel3.setBackground(new java.awt.Color(0, 153, 0));
            Public_Transportation_Panel.setBackground(new java.awt.Color(0, 153, 0));
            Map_Panel.setBackground(new java.awt.Color(0, 153, 0));
            Recreation_Panel.setBackground(new java.awt.Color(0, 153, 0));
            Food_Panel.setBackground(new java.awt.Color(0, 153, 0));
            Shopping_Panel.setBackground(new java.awt.Color(0, 153, 0));
            Calendar_Panel.setBackground(new java.awt.Color(0, 153, 0));
            Weather_Panel.setBackground(new java.awt.Color(0,153,0));
            About_Panel.setBackground(new java.awt.Color(0,153,0));
            Schools_Panel.setBackground(new java.awt.Color(0,153,0));
            Menu_Icon.setIcon(new javax.swing.ImageIcon("C:\\Users\\Aayush\\Desktop\\TSA App Icons\\icons8_pull_down_32px.png"));
        } else if (c % 2 ==0) {
            jPanel3.setBackground(new java.awt.Color(255,255,255));
            Public_Transportation_Panel.setBackground(new java.awt.Color(255,255,255));
            Map_Panel.setBackground(new java.awt.Color(255,255,255));
            Recreation_Panel.setBackground(new java.awt.Color(255,255,255));
            Food_Panel.setBackground(new java.awt.Color(255,255,255));
            Shopping_Panel.setBackground(new java.awt.Color(255,255,255));
            Calendar_Panel.setBackground(new java.awt.Color(255,255,255));
            Weather_Panel.setBackground(new java.awt.Color(255,255,255));
            About_Panel.setBackground(new java.awt.Color(255,255,255));
            Schools_Panel.setBackground(new java.awt.Color(255,255,255));
            Menu_Icon.setIcon(new javax.swing.ImageIcon("C:\\Users\\Aayush\\Desktop\\TSA App Icons\\icons8_menu_32px_1.png"));
        } else {
            
        }
    }//GEN-LAST:event_Menu_IconMouseReleased

    private void Public_Transportation_PanelMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Public_Transportation_PanelMouseReleased
        // TODO add your handling code here:
        jScrollPane1.getVerticalScrollBar().setValue(0);
        Add_Chat.setIcon(null);
        LocalTime time1 = LocalTime.now();
        DateTimeFormatter time1Formatter = DateTimeFormatter.ofPattern("HH:mm");
        LocalDateTime time2 = LocalDateTime.now();
        DateTimeFormatter DayMonthFormatter = DateTimeFormatter.ofPattern("E, MMM dd yyyy");
        String a = String.valueOf(time1);
        String b = time1.format(time1Formatter);
        jLabel1.setText(b);
        String d = String.valueOf(time2);
        String e = time2.format(DayMonthFormatter);
        Time.setText(e);
        Public_Transportation_Panel.setBackground(new java.awt.Color(0,102,0));
        Map_Panel.setBackground(new java.awt.Color(0, 153, 0));
        Recreation_Panel.setBackground(new java.awt.Color(0, 153, 0));
        Food_Panel.setBackground(new java.awt.Color(0, 153, 0));
        Shopping_Panel.setBackground(new java.awt.Color(0, 153, 0));
        Calendar_Panel.setBackground(new java.awt.Color(0, 153, 0));
        About_Panel.setBackground(new java.awt.Color(0,153,0));
        Schools_Panel.setBackground(new java.awt.Color(0,153,0));
        jLabel18.setText("Transportation");
        jLabel19.setIcon(null);
        jLabel19.setForeground(new java.awt.Color(0,0,0));
        jLabel19.setText("Metuchen Train Station");
        jLabel20.setText("NJ transit station available to citizens at a low cost.");
        Step2.setText("");
        Step3.setText("");
        Step4.setText("");
        Step5.setText("");
        Step6.setText("");
        Step7.setText("");
        jLabel21.setText("NJ Transit Bus");
        jLabel22.setText("Buses allowing citizens to travel the city for a small fee.");
        jLabel23.setText("LimeBikes");
        jLabel24.setText("A 24/7 service where passengers can rent bikes to ride.");
        jLabel25.setText("");
        jLabel26.setText("");
        jLabel27.setText("");
        When1.setText("");
        When2.setText("");
        When3.setText("");
        Where1.setText("Woodbridge Avenue & Main Street, Metuchen, NJ");
        Where2.setText("");
        Where3.setText("");
        Cost1.setText("");
        Cost2.setText("");
        Cost3.setText("");
        Directions1.setText("Directions");
        Directions2.setText("Stops");
        Directions3.setText("Locations");
        Transportation1.setText("");
        Transportation2.setText("");
        Transportation3.setText("");
        Hours1.setForeground(new java.awt.Color(255,255,255));
        Hours2.setForeground(new java.awt.Color(255,255,255));
        Hours3.setForeground(new java.awt.Color(255,255,255));
        jLabel25.setIcon(new javax.swing.ImageIcon("C:\\Users\\Aayush\\Desktop\\TSA App Icons\\Train_Station2.jpg"));
        jLabel26.setIcon(new javax.swing.ImageIcon("C:\\Users\\Aayush\\Desktop\\TSA App Icons\\Transit_Bus.jpg"));
        jLabel27.setIcon(new javax.swing.ImageIcon("C:\\Users\\Aayush\\Desktop\\TSA App Icons\\LimeBike2.jpg"));
        Page_1_Label.setForeground(new java.awt.Color(255,255,255));
        Page_2_Label.setForeground(new java.awt.Color(255,255,255));
        Page_Label.setForeground(new java.awt.Color(255,255,255));
        Page_Line.setForeground(new java.awt.Color(255,255,255));
    }//GEN-LAST:event_Public_Transportation_PanelMouseReleased

    private void Map_PanelMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Map_PanelMouseReleased
        // TODO add your handling code here
        jScrollPane1.getVerticalScrollBar().setValue(0);
        LocalTime time1 = LocalTime.now();
        DateTimeFormatter time1Formatter = DateTimeFormatter.ofPattern("HH:mm");
        LocalDateTime time2 = LocalDateTime.now();
        DateTimeFormatter DayMonthFormatter = DateTimeFormatter.ofPattern("E, MMM dd yyyy");
        String a = String.valueOf(time1);
        String b = time1.format(time1Formatter);
        jLabel1.setText(b);
        String d = String.valueOf(time2);
        String e = time2.format(DayMonthFormatter);
        Time.setText(e);
        Map_Panel.setBackground(new java.awt.Color(0,102,0));
        Public_Transportation_Panel.setBackground(new java.awt.Color(0, 153, 0));
        Recreation_Panel.setBackground(new java.awt.Color(0, 153, 0));
        Food_Panel.setBackground(new java.awt.Color(0, 153, 0));
        Shopping_Panel.setBackground(new java.awt.Color(0, 153, 0));
        Calendar_Panel.setBackground(new java.awt.Color(0, 153, 0));
        About_Panel.setBackground(new java.awt.Color(0,153,0));
        Schools_Panel.setBackground(new java.awt.Color(0,153,0));
        jLabel18.setText("Map of Metuchen");
        jLabel19.setText("");
        jLabel19.setIcon(new javax.swing.ImageIcon("C:\\Users\\Aayush\\Desktop\\TSA App Icons\\MapofMetuchen3.jpg"));
        jLabel20.setText("");
        Step2.setText("");
        Step3.setText("");
        Step4.setText("");
        Step5.setText("");
        Step6.setText("");
        Step7.setText("");
        jLabel21.setText("");
        jLabel22.setText("");
        jLabel23.setText("");
        jLabel24.setText("");
        jLabel25.setText("");
        jLabel26.setText("");
        jLabel27.setText("");
        When1.setText("");
        Cost1.setText("");
        Cost2.setText("");
        Cost3.setText("");
        When2.setText("");
        When3.setText("");
        Where1.setText("");
        Where2.setText("");
        Where3.setText("");
        Directions1.setText("");
        Directions2.setText("");
        Directions3.setText("");
        Transportation1.setText("");
        Transportation2.setText("");
        Transportation3.setText("");
        jLabel25.setIcon(new javax.swing.ImageIcon());
        jLabel26.setIcon(new javax.swing.ImageIcon());
        jLabel27.setIcon(new javax.swing.ImageIcon());
        Hours1.setForeground(new java.awt.Color(255,255,255));
        Hours2.setForeground(new java.awt.Color(255,255,255));
        Hours3.setForeground(new java.awt.Color(255,255,255));
        Page_1_Label.setForeground(new java.awt.Color(255,255,255));
        Page_1_Label.setText("");
        Page_2_Label.setForeground(new java.awt.Color(255,255,255));
        Page_Label.setForeground(new java.awt.Color(255,255,255));
        Page_Line.setForeground(new java.awt.Color(255,255,255));
    }//GEN-LAST:event_Map_PanelMouseReleased

    private void Map_WordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Map_WordKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_Map_WordKeyReleased

    private void Map_IconMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Map_IconMouseReleased
        // TODO add your handling code here:
        jScrollPane1.getVerticalScrollBar().setValue(0);
        LocalTime time1 = LocalTime.now();
        DateTimeFormatter time1Formatter = DateTimeFormatter.ofPattern("HH:mm");
        LocalDateTime time2 = LocalDateTime.now();
        DateTimeFormatter DayMonthFormatter = DateTimeFormatter.ofPattern("E, MMM dd yyyy");
        String a = String.valueOf(time1);
        String b = time1.format(time1Formatter);
        jLabel1.setText(b);
        String d = String.valueOf(time2);
        String e = time2.format(DayMonthFormatter);
        Time.setText(e);
        Map_Panel.setBackground(new java.awt.Color(0,102,0));
        Public_Transportation_Panel.setBackground(new java.awt.Color(0, 153, 0));
        Recreation_Panel.setBackground(new java.awt.Color(0, 153, 0));
        Food_Panel.setBackground(new java.awt.Color(0, 153, 0));
        Shopping_Panel.setBackground(new java.awt.Color(0, 153, 0));
        Calendar_Panel.setBackground(new java.awt.Color(0, 153, 0));
        About_Panel.setBackground(new java.awt.Color(0,153,0));
        Schools_Panel.setBackground(new java.awt.Color(0,153,0));
        jLabel18.setText("Map of Metuchen");
        jLabel19.setText("");
        jLabel19.setIcon(new javax.swing.ImageIcon("C:\\Users\\Aayush\\Desktop\\TSA App Icons\\MapofMetuchen3.jpg"));
        jLabel20.setText("");
        Step2.setText("");
        Step3.setText("");
        Step4.setText("");
        Step5.setText("");
        Step6.setText("");
        Step7.setText("");
        jLabel21.setText("");
        jLabel22.setText("");
        jLabel23.setText("");
        jLabel24.setText("");
        jLabel25.setText("");
        jLabel26.setText("");
        jLabel27.setText("");
        When1.setText("");
        Cost1.setText("");
        Cost2.setText("");
        Cost3.setText("");
        When2.setText("");
        When3.setText("");
        Where1.setText("");
        Where2.setText("");
        Where3.setText("");
        Directions1.setText("");
        Directions2.setText("");
        Directions3.setText("");
        Transportation1.setText("");
        Transportation2.setText("");
        Transportation3.setText("");
        Hours1.setForeground(new java.awt.Color(255,255,255));
        Hours2.setForeground(new java.awt.Color(255,255,255));
        Hours3.setForeground(new java.awt.Color(255,255,255));
        jLabel25.setIcon(new javax.swing.ImageIcon());
        jLabel26.setIcon(new javax.swing.ImageIcon());
        jLabel27.setIcon(new javax.swing.ImageIcon());
        Page_1_Label.setForeground(new java.awt.Color(255,255,255));
        Page_1_Label.setText("");
        Page_2_Label.setForeground(new java.awt.Color(255,255,255));
        Page_Label.setForeground(new java.awt.Color(255,255,255));
        Page_Line.setForeground(new java.awt.Color(255,255,255));
    }//GEN-LAST:event_Map_IconMouseReleased

    private void Public_Tansportation_IconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Public_Tansportation_IconMouseClicked
        // TODO add your handling code here:
        jScrollPane1.getVerticalScrollBar().setValue(0);
        Add_Chat.setIcon(null);
        LocalTime time1 = LocalTime.now();
        DateTimeFormatter time1Formatter = DateTimeFormatter.ofPattern("HH:mm");
        LocalDateTime time2 = LocalDateTime.now();
        DateTimeFormatter DayMonthFormatter = DateTimeFormatter.ofPattern("E, MMM dd yyyy");
        String a = String.valueOf(time1);
        String b = time1.format(time1Formatter);
        jLabel1.setText(b);
        String d = String.valueOf(time2);
        String e = time2.format(DayMonthFormatter);
        Time.setText(e);
        Public_Transportation_Panel.setBackground(new java.awt.Color(0,102,0));
        Map_Panel.setBackground(new java.awt.Color(0, 153, 0));
        Recreation_Panel.setBackground(new java.awt.Color(0, 153, 0));
        Food_Panel.setBackground(new java.awt.Color(0, 153, 0));
        Shopping_Panel.setBackground(new java.awt.Color(0, 153, 0));
        Calendar_Panel.setBackground(new java.awt.Color(0, 153, 0));
        About_Panel.setBackground(new java.awt.Color(0,153,0));
        Schools_Panel.setBackground(new java.awt.Color(0,153,0));
        jLabel18.setText("Transportation");
        jLabel19.setIcon(null);
        jLabel19.setForeground(new java.awt.Color(0,0,0));
        jLabel19.setText("Metuchen Train Station");
        jLabel20.setText("NJ transit station available to citizens at a low cost.");
        Step2.setText("");
        Step3.setText("");
        Step4.setText("");
        Step5.setText("");
        Step6.setText("");
        Step7.setText("");
        jLabel21.setText("NJ Transit Bus");
        jLabel22.setText("Buses allowing citizens to travel the city for a small fee.");
        jLabel23.setText("LimeBikes");
        jLabel24.setText("A 24/7 service where passengers can rent bikes to ride.");
        jLabel25.setText("");
        jLabel26.setText("");
        jLabel27.setText("");
        When1.setText("");
        When2.setText("");
        When3.setText("");
        Where1.setText("Woodbridge Avenue & Main Street, Metuchen, NJ");
        Where2.setText("");
        Where3.setText("");
        Cost1.setText("");
        Cost2.setText("");
        Cost3.setText("");
        Directions1.setText("Directions");
        Directions2.setText("Stops");
        Directions3.setText("Locations");
        Transportation1.setText("");
        Transportation2.setText("");
        Transportation3.setText("");
        Hours1.setForeground(new java.awt.Color(255,255,255));
        Hours2.setForeground(new java.awt.Color(255,255,255));
        Hours3.setForeground(new java.awt.Color(255,255,255));
        jLabel25.setIcon(new javax.swing.ImageIcon("C:\\Users\\Aayush\\Desktop\\TSA App Icons\\Train_Station2.jpg"));
        jLabel26.setIcon(new javax.swing.ImageIcon("C:\\Users\\Aayush\\Desktop\\TSA App Icons\\Transit_Bus.jpg"));
        jLabel27.setIcon(new javax.swing.ImageIcon("C:\\Users\\Aayush\\Desktop\\TSA App Icons\\LimeBike2.jpg"));
        Page_1_Label.setForeground(new java.awt.Color(255,255,255));
        Page_2_Label.setForeground(new java.awt.Color(255,255,255));
        Page_Label.setForeground(new java.awt.Color(255,255,255));
        Page_Line.setForeground(new java.awt.Color(255,255,255));
    }//GEN-LAST:event_Public_Tansportation_IconMouseClicked

    private void Public_Transportation_WordMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Public_Transportation_WordMouseReleased
        // TODO add your handling code here:
        jScrollPane1.getVerticalScrollBar().setValue(0);
        Add_Chat.setIcon(null);
        LocalTime time1 = LocalTime.now();
        DateTimeFormatter time1Formatter = DateTimeFormatter.ofPattern("HH:mm");
        LocalDateTime time2 = LocalDateTime.now();
        DateTimeFormatter DayMonthFormatter = DateTimeFormatter.ofPattern("E, MMM dd yyyy");
        String a = String.valueOf(time1);
        String b = time1.format(time1Formatter);
        jLabel1.setText(b);
        String d = String.valueOf(time2);
        String e = time2.format(DayMonthFormatter);
        Time.setText(e);
        Public_Transportation_Panel.setBackground(new java.awt.Color(0,102,0));
        Map_Panel.setBackground(new java.awt.Color(0, 153, 0));
        Recreation_Panel.setBackground(new java.awt.Color(0, 153, 0));
        Food_Panel.setBackground(new java.awt.Color(0, 153, 0));
        Shopping_Panel.setBackground(new java.awt.Color(0, 153, 0));
        Calendar_Panel.setBackground(new java.awt.Color(0, 153, 0));
        About_Panel.setBackground(new java.awt.Color(0,153,0));
        Schools_Panel.setBackground(new java.awt.Color(0,153,0));
        jLabel18.setText("Transportation");
        jLabel19.setIcon(null);
        jLabel19.setForeground(new java.awt.Color(0,0,0));
        jLabel19.setText("Metuchen Train Station");
        jLabel20.setText("NJ transit station available to citizens at a low cost.");
        Step2.setText("");
        Step3.setText("");
        Step4.setText("");
        Step5.setText("");
        Step6.setText("");
        Step7.setText("");
        jLabel21.setText("NJ Transit Bus");
        jLabel22.setText("Buses allowing citizens to travel the city for a small fee.");
        jLabel23.setText("LimeBikes");
        jLabel24.setText("A 24/7 service where passengers can rent bikes to ride.");
        jLabel25.setText("");
        jLabel26.setText("");
        jLabel27.setText("");
        When1.setText("Woodbridge Avenue & Main Street, Metuchen, NJ");
        When2.setText("");
        When3.setText("");
        Where1.setText("");
        Where2.setText("");
        Where3.setText("");
        Cost1.setText("");
        Cost2.setText("");
        Cost3.setText("");
        Directions1.setText("Directions");
        Directions2.setText("Stops");
        Directions3.setText("Locations");
        Transportation1.setText("");
        Transportation2.setText("");
        Transportation3.setText("");
        Hours1.setForeground(new java.awt.Color(255,255,255));
        Hours2.setForeground(new java.awt.Color(255,255,255));
        Hours3.setForeground(new java.awt.Color(255,255,255));
        jLabel25.setIcon(new javax.swing.ImageIcon("C:\\Users\\Aayush\\Desktop\\TSA App Icons\\Train_Station2.jpg"));
        jLabel26.setIcon(new javax.swing.ImageIcon("C:\\Users\\Aayush\\Desktop\\TSA App Icons\\Transit_Bus.jpg"));
        jLabel27.setIcon(new javax.swing.ImageIcon("C:\\Users\\Aayush\\Desktop\\TSA App Icons\\LimeBike2.jpg"));
        Page_1_Label.setForeground(new java.awt.Color(255,255,255));
        Page_2_Label.setForeground(new java.awt.Color(255,255,255));
        Page_Label.setForeground(new java.awt.Color(255,255,255));
        Page_Line.setForeground(new java.awt.Color(255,255,255));
    }//GEN-LAST:event_Public_Transportation_WordMouseReleased

    private void Recreation_WordMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Recreation_WordMouseReleased
        // TODO add your handling code here:
        jScrollPane1.getVerticalScrollBar().setValue(0);
        LocalTime time1 = LocalTime.now();
        DateTimeFormatter time1Formatter = DateTimeFormatter.ofPattern("HH:mm");
        LocalDateTime time2 = LocalDateTime.now();
        DateTimeFormatter DayMonthFormatter = DateTimeFormatter.ofPattern("E, MMM dd yyyy");
        String a = String.valueOf(time1);
        String b = time1.format(time1Formatter);
        jLabel1.setText(b);
        String d = String.valueOf(time2);
        String e = time2.format(DayMonthFormatter);
        Time.setText(e);
        Recreation_Panel.setBackground(new java.awt.Color(0,102,0));
        Map_Panel.setBackground(new java.awt.Color(0, 153, 0));
        Public_Transportation_Panel.setBackground(new java.awt.Color(0, 153, 0));
        Food_Panel.setBackground(new java.awt.Color(0, 153, 0));
        Shopping_Panel.setBackground(new java.awt.Color(0, 153, 0));
        Calendar_Panel.setBackground(new java.awt.Color(0, 153, 0));
        About_Panel.setBackground(new java.awt.Color(0,153,0));
        Schools_Panel.setBackground(new java.awt.Color(0,153,0));
        jLabel18.setText("Recreation");
        jLabel19.setText("Metuchen Sports Plex");
        jLabel19.setIcon(null);
        jLabel20.setText("Sports facility offering many different activities.");
        jLabel21.setText("Metuchen YMCA");
        jLabel22.setText("Shared building used for sports and activities.");
        jLabel23.setText("Metuchen Country Club");
        jLabel24.setText("A club with dining and sporting facilities.");
        jLabel25.setText("");
        jLabel26.setText("");
        jLabel27.setText("");
        When1.setText("215 Durham Ave, Metuchen, NJ");
        Cost1.setText("");
        Cost2.setText("");
        Cost3.setText("");
        When2.setText("65 High St, Metuchen, NJ");
        When3.setText("244 Plainfield Rd, Edison, NJ");
        Where1.setText("");
        Where2.setText("");
        Where3.setText("");
        Directions1.setText("Directions");
        Directions2.setText("Directions");
        Directions3.setText("Directions");
        Step2.setText("");
        Step3.setText("");
        Step4.setText("");
        Step5.setText("");
        Step6.setText("");
        Step7.setText("");
        Transportation1.setText("Transportation");
        Transportation2.setText("Transportation");
        Transportation3.setText("Transportation");
        Hours1.setForeground(new java.awt.Color(0,102,255));
        Hours2.setForeground(new java.awt.Color(0,102,255));
        Hours3.setForeground(new java.awt.Color(0,102,255));
        jLabel25.setIcon(new javax.swing.ImageIcon("C:\\Users\\Aayush\\Desktop\\TSA App Icons\\Sportsplex2.jpg"));
        jLabel26.setIcon(new javax.swing.ImageIcon("C:\\Users\\Aayush\\Desktop\\TSA App Icons\\YMCA2.jpg"));
        jLabel27.setIcon(new javax.swing.ImageIcon("C:\\Users\\Aayush\\Desktop\\TSA App Icons\\Club2.gif"));
        Page_Label.setForeground(new java.awt.Color(0,0,0));
        Page_Line.setForeground(new java.awt.Color(0,0,0));
        Page_Label.setText("Page");
        Page_Line.setText("|");
        Page_1_Label.setForeground(new java.awt.Color(0,0,0));
        Page_2_Label.setForeground(new java.awt.Color(0,102,255));
        Page_1_Label.setText(" 1 ");
        Page_2_Label.setText(" 2 ");

    }//GEN-LAST:event_Recreation_WordMouseReleased

    private void Recreation_IconKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Recreation_IconKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_Recreation_IconKeyReleased

    private void Map_WordMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Map_WordMouseReleased
        jScrollPane1.getVerticalScrollBar().setValue(0);
        LocalTime time1 = LocalTime.now();
        DateTimeFormatter time1Formatter = DateTimeFormatter.ofPattern("HH:mm");
        LocalDateTime time2 = LocalDateTime.now();
        DateTimeFormatter DayMonthFormatter = DateTimeFormatter.ofPattern("E, MMM dd yyyy");
        String a = String.valueOf(time1);
        String b = time1.format(time1Formatter);
        jLabel1.setText(b);
        String d = String.valueOf(time2);
        String e = time2.format(DayMonthFormatter);
        Time.setText(e);
        Map_Panel.setBackground(new java.awt.Color(0,102,0));
        Public_Transportation_Panel.setBackground(new java.awt.Color(0, 153, 0));
        Recreation_Panel.setBackground(new java.awt.Color(0, 153, 0));
        Food_Panel.setBackground(new java.awt.Color(0, 153, 0));
        Shopping_Panel.setBackground(new java.awt.Color(0, 153, 0));
        Calendar_Panel.setBackground(new java.awt.Color(0, 153, 0));
        About_Panel.setBackground(new java.awt.Color(0,153,0));
        Schools_Panel.setBackground(new java.awt.Color(0,153,0));
        jLabel18.setText("Map of Metuchen");
        jLabel19.setText("");
        jLabel19.setIcon(new javax.swing.ImageIcon("C:\\Users\\Aayush\\Desktop\\TSA App Icons\\MapofMetuchen3.jpg"));
        jLabel20.setText("");
        Step2.setText("");
        Step3.setText("");
        Step4.setText("");
        Step5.setText("");
        Step6.setText("");
        Step7.setText("");
        jLabel21.setText("");
        jLabel22.setText("");
        jLabel23.setText("");
        jLabel24.setText("");
        jLabel25.setText("");
        jLabel26.setText("");
        jLabel27.setText("");
        When1.setText("");
        Cost1.setText("");
        Cost2.setText("");
        Cost3.setText("");
        When2.setText("");
        When3.setText("");
        Where1.setText("");
        Where2.setText("");
        Where3.setText("");
        Directions1.setText("");
        Directions2.setText("");
        Directions3.setText("");
        Transportation1.setText("");
        Transportation2.setText("");
        Transportation3.setText("");
        Hours1.setForeground(new java.awt.Color(255,255,255));
        Hours2.setForeground(new java.awt.Color(255,255,255));
        Hours3.setForeground(new java.awt.Color(255,255,255));
        jLabel25.setIcon(new javax.swing.ImageIcon());
        jLabel26.setIcon(new javax.swing.ImageIcon());
        jLabel27.setIcon(new javax.swing.ImageIcon());
        Page_Label.setForeground(new java.awt.Color(255,255,255));
        Page_Line.setForeground(new java.awt.Color(255,255,255));
        Page_1_Label.setForeground(new java.awt.Color(255,255,255));
        Page_1_Label.setText("");
        Page_2_Label.setForeground(new java.awt.Color(255,255,255));
        // TODO add your handling code here:
    }//GEN-LAST:event_Map_WordMouseReleased

    private void Recreation_IconMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Recreation_IconMouseReleased
        // TODO add your handling code here:
        jScrollPane1.getVerticalScrollBar().setValue(0);
        LocalTime time1 = LocalTime.now();
        DateTimeFormatter time1Formatter = DateTimeFormatter.ofPattern("HH:mm");
        LocalDateTime time2 = LocalDateTime.now();
        DateTimeFormatter DayMonthFormatter = DateTimeFormatter.ofPattern("E, MMM dd yyyy");
        String a = String.valueOf(time1);
        String b = time1.format(time1Formatter);
        jLabel1.setText(b);
        String d = String.valueOf(time2);
        String e = time2.format(DayMonthFormatter);
        Time.setText(e);
        Recreation_Panel.setBackground(new java.awt.Color(0,102,0));
        Map_Panel.setBackground(new java.awt.Color(0, 153, 0));
        Public_Transportation_Panel.setBackground(new java.awt.Color(0, 153, 0));
        Food_Panel.setBackground(new java.awt.Color(0, 153, 0));
        Shopping_Panel.setBackground(new java.awt.Color(0, 153, 0));
        Calendar_Panel.setBackground(new java.awt.Color(0, 153, 0));
        About_Panel.setBackground(new java.awt.Color(0,153,0));
        Schools_Panel.setBackground(new java.awt.Color(0,153,0));
        jLabel18.setText("Recreation");
        jLabel19.setText("Metuchen Sports Plex");
        jLabel19.setIcon(null);
        jLabel20.setText("Sports facility offering many different activities.");
        jLabel21.setText("Metuchen YMCA");
        jLabel22.setText("Shared building used for sports and activities.");
        jLabel23.setText("Metuchen Country Club");
        jLabel24.setText("A club with dining and sporting facilities.");
        jLabel25.setText("");
        jLabel26.setText("");
        jLabel27.setText("");
        When1.setText("215 Durham Ave, Metuchen, NJ");
        Cost1.setText("");
        Cost2.setText("");
        Cost3.setText("");
        When2.setText("65 High St, Metuchen, NJ");
        When3.setText("244 Plainfield Rd, Edison, NJ");
        Where1.setText("");
        Where2.setText("");
        Where3.setText("");
        Directions1.setText("Directions");
        Directions2.setText("Directions");
        Directions3.setText("Directions");
        Step2.setText("");
        Step3.setText("");
        Step4.setText("");
        Step5.setText("");
        Step6.setText("");
        Step7.setText("");
        Transportation1.setText("Transportation");
        Transportation2.setText("Transportation");
        Transportation3.setText("Transportation");
        Hours1.setForeground(new java.awt.Color(0,102,255));
        Hours2.setForeground(new java.awt.Color(0,102,255));
        Hours3.setForeground(new java.awt.Color(0,102,255));
        jLabel25.setIcon(new javax.swing.ImageIcon("C:\\Users\\Aayush\\Desktop\\TSA App Icons\\Sportsplex2.jpg"));
        jLabel26.setIcon(new javax.swing.ImageIcon("C:\\Users\\Aayush\\Desktop\\TSA App Icons\\YMCA2.jpg"));
        jLabel27.setIcon(new javax.swing.ImageIcon("C:\\Users\\Aayush\\Desktop\\TSA App Icons\\Club2.gif"));
        Page_Label.setForeground(new java.awt.Color(0,0,0));
        Page_Line.setForeground(new java.awt.Color(0,0,0));
        Page_Label.setText("Page");
        Page_Line.setText("|");
        Page_1_Label.setForeground(new java.awt.Color(0,0,0));
        Page_2_Label.setForeground(new java.awt.Color(0,102,255));
        Page_1_Label.setText(" 1 ");
        Page_2_Label.setText(" 2 ");
    }//GEN-LAST:event_Recreation_IconMouseReleased

    private void Recreation_PanelMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Recreation_PanelMouseReleased
        // TODO add your handling code here:
        jScrollPane1.getVerticalScrollBar().setValue(0);
        LocalTime time1 = LocalTime.now();
        DateTimeFormatter time1Formatter = DateTimeFormatter.ofPattern("HH:mm");
        LocalDateTime time2 = LocalDateTime.now();
        DateTimeFormatter DayMonthFormatter = DateTimeFormatter.ofPattern("E, MMM dd yyyy");
        String a = String.valueOf(time1);
        String b = time1.format(time1Formatter);
        jLabel1.setText(b);
        String d = String.valueOf(time2);
        String e = time2.format(DayMonthFormatter);
        Time.setText(e);
        Recreation_Panel.setBackground(new java.awt.Color(0,102,0));
        Map_Panel.setBackground(new java.awt.Color(0, 153, 0));
        Public_Transportation_Panel.setBackground(new java.awt.Color(0, 153, 0));
        Food_Panel.setBackground(new java.awt.Color(0, 153, 0));
        Shopping_Panel.setBackground(new java.awt.Color(0, 153, 0));
        Calendar_Panel.setBackground(new java.awt.Color(0, 153, 0));
        About_Panel.setBackground(new java.awt.Color(0,153,0));
        Schools_Panel.setBackground(new java.awt.Color(0,153,0));
        jLabel18.setText("Recreation");
        jLabel19.setText("Metuchen Sports Plex");
        jLabel19.setIcon(null);
        jLabel20.setText("Sports facility offering many different activities.");
        jLabel21.setText("Metuchen YMCA");
        jLabel22.setText("Shared building used for sports and activities.");
        jLabel23.setText("Metuchen Country Club");
        jLabel24.setText("A club with dining and sporting facilities.");
        jLabel25.setText("");
        jLabel26.setText("");
        jLabel27.setText("");
        When1.setText("215 Durham Ave, Metuchen, NJ");
        Cost1.setText("");
        Cost2.setText("");
        Cost3.setText("");
        When2.setText("65 High St, Metuchen, NJ");
        When3.setText("244 Plainfield Rd, Edison, NJ");
        Where1.setText("");
        Where2.setText("");
        Where3.setText("");
        Directions1.setText("Directions");
        Directions2.setText("Directions");
        Directions3.setText("Directions");
        Step2.setText("");
        Step3.setText("");
        Step4.setText("");
        Step5.setText("");
        Step6.setText("");
        Step7.setText("");
        Transportation1.setText("Transportation");
        Transportation2.setText("Transportation");
        Transportation3.setText("Transportation");
        Hours1.setForeground(new java.awt.Color(0,102,255));
        Hours2.setForeground(new java.awt.Color(0,102,255));
        Hours3.setForeground(new java.awt.Color(0,102,255));
        jLabel25.setIcon(new javax.swing.ImageIcon("C:\\Users\\Aayush\\Desktop\\TSA App Icons\\Sportsplex2.jpg"));
        jLabel26.setIcon(new javax.swing.ImageIcon("C:\\Users\\Aayush\\Desktop\\TSA App Icons\\YMCA2.jpg"));
        jLabel27.setIcon(new javax.swing.ImageIcon("C:\\Users\\Aayush\\Desktop\\TSA App Icons\\Club2.gif"));
        Page_Label.setForeground(new java.awt.Color(0,0,0));
        Page_Line.setForeground(new java.awt.Color(0,0,0));
        Page_Label.setText("Page");
        Page_Line.setText("|");
        Page_1_Label.setForeground(new java.awt.Color(0,0,0));
        Page_2_Label.setForeground(new java.awt.Color(0,102,255));
        Page_1_Label.setText(" 1 ");
        Page_2_Label.setText(" 2 ");
    }//GEN-LAST:event_Recreation_PanelMouseReleased

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void Food_PanelMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Food_PanelMouseReleased
        // TODO add your handling code here:
        jScrollPane1.getVerticalScrollBar().setValue(0);
        LocalTime time1 = LocalTime.now();
        DateTimeFormatter time1Formatter = DateTimeFormatter.ofPattern("HH:mm");
        LocalDateTime time2 = LocalDateTime.now();
        DateTimeFormatter DayMonthFormatter = DateTimeFormatter.ofPattern("E, MMM dd yyyy");
        String a = String.valueOf(time1);
        String b = time1.format(time1Formatter);
        jLabel1.setText(b);
        String d = String.valueOf(time2);
        String e = time2.format(DayMonthFormatter);
        Time.setText(e);
        Food_Panel.setBackground(new java.awt.Color(0,102,0));
        Recreation_Panel.setBackground(new java.awt.Color(0, 153, 0));
        Public_Transportation_Panel.setBackground(new java.awt.Color(0, 153, 0));
        Map_Panel.setBackground(new java.awt.Color(0, 153, 0));
        Shopping_Panel.setBackground(new java.awt.Color(0, 153, 0));
        Calendar_Panel.setBackground(new java.awt.Color(0, 153, 0));
        About_Panel.setBackground(new java.awt.Color(0,153,0));
        Schools_Panel.setBackground(new java.awt.Color(0,153,0));
        jLabel18.setText("Restaurants");
        jLabel19.setText("Cai's Cafe");
        jLabel19.setIcon(null);
        jLabel20.setText("A resturant selling coffee and light meals.");
        jLabel21.setText("Tastee Sub Shop");
        jLabel22.setText("Serves a variety of submarine sandwiches.");
        jLabel23.setText("Joey D's Pizza");
        jLabel24.setText("Serves many different types of pizza or pastas.");
        jLabel25.setText("");
        jLabel26.setText("");
        jLabel27.setText("");
        When1.setText("420 Main St, Metuchen, NJ");
        Cost1.setText("");
        Cost2.setText("");
        Cost3.setText("");
        When2.setText("267 Plainfield Ave, Edison, NJ");
        When3.setText("279 Co Rd 669, Metuchen, NJ");
        Where1.setText("");
        Where2.setText("");
        Where3.setText("");
        Directions1.setText("Directions");
        Directions2.setText("Directions");
        Directions3.setText("Directions");
        Step2.setText("");
        Step3.setText("");
        Step4.setText("");
        Step5.setText("");
        Step6.setText("");
        Step7.setText("");
        Transportation1.setText("Transportation");
        Transportation2.setText("Transportation");
        Transportation3.setText("Transportation");
        Hours1.setForeground(new java.awt.Color(0,102,255));
        Hours2.setForeground(new java.awt.Color(0,102,255));
        Hours3.setForeground(new java.awt.Color(0,102,255));
        jLabel25.setIcon(new javax.swing.ImageIcon("C:\\Users\\Aayush\\Desktop\\TSA App Icons\\Cafe2.jpg"));
        jLabel26.setIcon(new javax.swing.ImageIcon("C:\\Users\\Aayush\\Desktop\\TSA App Icons\\Sub2.jpg"));
        jLabel27.setIcon(new javax.swing.ImageIcon("C:\\Users\\Aayush\\Desktop\\TSA App Icons\\Joey2.jpg"));
        Page_Label.setForeground(new java.awt.Color(0,0,0));
        Page_Line.setForeground(new java.awt.Color(0,0,0));
        Page_Label.setText("Page");
        Page_Line.setText("|");
        Page_1_Label.setForeground(new java.awt.Color(0,0,0));
        Page_2_Label.setForeground(new java.awt.Color(0,102,255));
        Page_1_Label.setText(" 1 ");
        Page_2_Label.setText(" 2 ");
    }//GEN-LAST:event_Food_PanelMouseReleased

    private void Food_IconMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Food_IconMouseReleased
        // TODO add your handling code here:
        jScrollPane1.getVerticalScrollBar().setValue(0);
        LocalTime time1 = LocalTime.now();
        DateTimeFormatter time1Formatter = DateTimeFormatter.ofPattern("HH:mm");
        LocalDateTime time2 = LocalDateTime.now();
        DateTimeFormatter DayMonthFormatter = DateTimeFormatter.ofPattern("E, MMM dd yyyy");
        String a = String.valueOf(time1);
        String b = time1.format(time1Formatter);
        jLabel1.setText(b);
        String d = String.valueOf(time2);
        String e = time2.format(DayMonthFormatter);
        Time.setText(e);
        Food_Panel.setBackground(new java.awt.Color(0,102,0));
        Recreation_Panel.setBackground(new java.awt.Color(0, 153, 0));
        Public_Transportation_Panel.setBackground(new java.awt.Color(0, 153, 0));
        Map_Panel.setBackground(new java.awt.Color(0, 153, 0));
        Shopping_Panel.setBackground(new java.awt.Color(0, 153, 0));
        Calendar_Panel.setBackground(new java.awt.Color(0, 153, 0));
        About_Panel.setBackground(new java.awt.Color(0,153,0));
        Schools_Panel.setBackground(new java.awt.Color(0,153,0));
        jLabel18.setText("Restaurants");
        jLabel19.setText("Cai's Cafe");
        jLabel19.setIcon(null);
        jLabel20.setText("A resturant selling coffee and light meals.");
        jLabel21.setText("Tastee Sub Shop");
        jLabel22.setText("Serves a variety of submarine sandwiches.");
        jLabel23.setText("Joey D's Pizza");
        jLabel24.setText("Serves many different types of pizza or pastas.");
        jLabel25.setText("");
        jLabel26.setText("");
        jLabel27.setText("");
        When1.setText("420 Main St, Metuchen, NJ");
        Cost1.setText("");
        Cost2.setText("");
        Cost3.setText("");
        When2.setText("267 Plainfield Ave, Edison, NJ");
        When3.setText("279 Co Rd 669, Metuchen, NJ");
        Where1.setText("");
        Where2.setText("");
        Where3.setText("");
        Directions1.setText("Directions");
        Directions2.setText("Directions");
        Directions3.setText("Directions");
        Step2.setText("");
        Step3.setText("");
        Step4.setText("");
        Step5.setText("");
        Step6.setText("");
        Step7.setText("");
        Transportation1.setText("Transportation");
        Transportation2.setText("Transportation");
        Transportation3.setText("Transportation");
        Hours1.setForeground(new java.awt.Color(0,102,255));
        Hours2.setForeground(new java.awt.Color(0,102,255));
        Hours3.setForeground(new java.awt.Color(0,102,255));
        jLabel25.setIcon(new javax.swing.ImageIcon("C:\\Users\\Aayush\\Desktop\\TSA App Icons\\Cafe2.jpg"));
        jLabel26.setIcon(new javax.swing.ImageIcon("C:\\Users\\Aayush\\Desktop\\TSA App Icons\\Sub2.jpg"));
        jLabel27.setIcon(new javax.swing.ImageIcon("C:\\Users\\Aayush\\Desktop\\TSA App Icons\\Joey2.jpg"));
        Page_Label.setForeground(new java.awt.Color(0,0,0));
        Page_Line.setForeground(new java.awt.Color(0,0,0));
        Page_Label.setText("Page");
        Page_Line.setText("|");
        Page_1_Label.setForeground(new java.awt.Color(0,0,0));
        Page_2_Label.setForeground(new java.awt.Color(0,102,255));
        Page_1_Label.setText(" 1 ");
        Page_2_Label.setText(" 2 ");
    }//GEN-LAST:event_Food_IconMouseReleased

    private void Food_WordMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Food_WordMouseReleased
        // TODO add your handling code here:
        jScrollPane1.getVerticalScrollBar().setValue(0);
        LocalTime time1 = LocalTime.now();
        DateTimeFormatter time1Formatter = DateTimeFormatter.ofPattern("HH:mm");
        LocalDateTime time2 = LocalDateTime.now();
        DateTimeFormatter DayMonthFormatter = DateTimeFormatter.ofPattern("E, MMM dd yyyy");
        String a = String.valueOf(time1);
        String b = time1.format(time1Formatter);
        jLabel1.setText(b);
        String d = String.valueOf(time2);
        String e = time2.format(DayMonthFormatter);
        Time.setText(e);
        Food_Panel.setBackground(new java.awt.Color(0,102,0));
        Recreation_Panel.setBackground(new java.awt.Color(0, 153, 0));
        Public_Transportation_Panel.setBackground(new java.awt.Color(0, 153, 0));
        Map_Panel.setBackground(new java.awt.Color(0, 153, 0));
        Shopping_Panel.setBackground(new java.awt.Color(0, 153, 0));
        Calendar_Panel.setBackground(new java.awt.Color(0, 153, 0));
        About_Panel.setBackground(new java.awt.Color(0,153,0));
        Schools_Panel.setBackground(new java.awt.Color(0,153,0));
        jLabel18.setText("Restaurants");
        jLabel19.setText("Cai's Cafe");
        jLabel19.setIcon(null);
        jLabel20.setText("A resturant selling coffee and light meals.");
        jLabel21.setText("Tastee Sub Shop");
        jLabel22.setText("Serves a variety of submarine sandwiches.");
        jLabel23.setText("Joey D's Pizza");
        jLabel24.setText("Serves many different types of pizza or pastas.");
        jLabel25.setText("");
        jLabel26.setText("");
        jLabel27.setText("");
        When1.setText("420 Main St, Metuchen, NJ");
        Cost1.setText("");
        Cost2.setText("");
        Cost3.setText("");
        When2.setText("267 Plainfield Ave, Edison, NJ");
        When3.setText("279 Co Rd 669, Metuchen, NJ");
        Where1.setText("");
        Where2.setText("");
        Where3.setText("");
        Directions1.setText("Directions");
        Directions2.setText("Directions");
        Directions3.setText("Directions");
        Step2.setText("");
        Step3.setText("");
        Step4.setText("");
        Step5.setText("");
        Step6.setText("");
        Step7.setText("");
        Transportation1.setText("Transportation");
        Transportation2.setText("Transportation");
        Transportation3.setText("Transportation");
        Hours1.setForeground(new java.awt.Color(0,102,255));
        Hours2.setForeground(new java.awt.Color(0,102,255));
        Hours3.setForeground(new java.awt.Color(0,102,255));
        jLabel25.setIcon(new javax.swing.ImageIcon("C:\\Users\\Aayush\\Desktop\\TSA App Icons\\Cafe2.jpg"));
        jLabel26.setIcon(new javax.swing.ImageIcon("C:\\Users\\Aayush\\Desktop\\TSA App Icons\\Sub2.jpg"));
        jLabel27.setIcon(new javax.swing.ImageIcon("C:\\Users\\Aayush\\Desktop\\TSA App Icons\\Joey2.jpg"));
        Page_Label.setForeground(new java.awt.Color(0,0,0));
        Page_Line.setForeground(new java.awt.Color(0,0,0));
        Page_Label.setText("Page");
        Page_Line.setText("|");
        Page_1_Label.setForeground(new java.awt.Color(0,0,0));
        Page_2_Label.setForeground(new java.awt.Color(0,102,255));
        Page_1_Label.setText(" 1 ");
        Page_2_Label.setText(" 2 ");
    }//GEN-LAST:event_Food_WordMouseReleased

    private void Shopping_PanelMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shopping_PanelMouseReleased
        // TODO add your handling code here:
        jScrollPane1.getVerticalScrollBar().setValue(0);
        LocalTime time1 = LocalTime.now();
        DateTimeFormatter time1Formatter = DateTimeFormatter.ofPattern("HH:mm");
        LocalDateTime time2 = LocalDateTime.now();
        DateTimeFormatter DayMonthFormatter = DateTimeFormatter.ofPattern("E, MMM dd yyyy");
        String a = String.valueOf(time1);
        String b = time1.format(time1Formatter);
        jLabel1.setText(b);
        String d = String.valueOf(time2);
        String e = time2.format(DayMonthFormatter);
        Time.setText(e);
        Shopping_Panel.setBackground(new java.awt.Color(0,102,0));
        Food_Panel.setBackground(new java.awt.Color(0, 153, 0));
        Recreation_Panel.setBackground(new java.awt.Color(0, 153, 0));
        Public_Transportation_Panel.setBackground(new java.awt.Color(0, 153, 0));
        Map_Panel.setBackground(new java.awt.Color(0, 153, 0));
        Calendar_Panel.setBackground(new java.awt.Color(0, 153, 0));
        About_Panel.setBackground(new java.awt.Color(0,153,0));
        Schools_Panel.setBackground(new java.awt.Color(0,153,0));
        jLabel18.setText("Shopping Centers");
        jLabel19.setText("Menlo Park Mall");
        jLabel19.setIcon(null);
        jLabel20.setText("Regional shopping mall encompassing many stores.");
        jLabel21.setText("Hadley Center");
        jLabel22.setText("Strip mall featuring a movie theater.");
        jLabel23.setText("Woodbridge Mall");
        jLabel24.setText("Two floor super shopping center.");
        jLabel25.setText("");
        jLabel26.setText("");
        jLabel27.setText("");
        When1.setText("55 Parsonage Rd, Edison, NJ");
        Cost1.setText("");
        Cost2.setText("");
        Cost3.setText("");
        When2.setText("4911 Stelton Rd, South Plainfield, NJ");
        When3.setText("250 Woodbridge Center Dr, Woodbridge Township, NJ");
        Where1.setText("");
        Where2.setText("");
        Where3.setText("");
        Directions1.setText("Directions");
        Directions2.setText("Directions");
        Directions3.setText("Directions");
        Step2.setText("");
        Step3.setText("");
        Step4.setText("");
        Step5.setText("");
        Step6.setText("");
        Step7.setText("");
        Transportation1.setText("Transportation");
        Transportation2.setText("Transportation");
        Transportation3.setText("Transportation");
        Hours1.setForeground(new java.awt.Color(0,102,255));
        Hours2.setForeground(new java.awt.Color(0,102,255));
        Hours3.setForeground(new java.awt.Color(0,102,255));
        jLabel25.setIcon(new javax.swing.ImageIcon("C:\\Users\\Aayush\\Desktop\\TSA App Icons\\Menlo2.jpg"));
        jLabel26.setIcon(new javax.swing.ImageIcon("C:\\Users\\Aayush\\Desktop\\TSA App Icons\\Hadley2.jpg"));
        jLabel27.setIcon(new javax.swing.ImageIcon("C:\\Users\\Aayush\\Desktop\\TSA App Icons\\Woodbridge2.jpg"));
        Page_Label.setForeground(new java.awt.Color(255,255,255));
        Page_Line.setForeground(new java.awt.Color(255,255,255));
        Page_1_Label.setForeground(new java.awt.Color(255,255,255));
        Page_2_Label.setForeground(new java.awt.Color(255,255,255));
    }//GEN-LAST:event_Shopping_PanelMouseReleased

    private void Shopping_IconMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shopping_IconMouseReleased
        // TODO add your handling code here:
        jScrollPane1.getVerticalScrollBar().setValue(0);
        LocalTime time1 = LocalTime.now();
        DateTimeFormatter time1Formatter = DateTimeFormatter.ofPattern("HH:mm");
        LocalDateTime time2 = LocalDateTime.now();
        DateTimeFormatter DayMonthFormatter = DateTimeFormatter.ofPattern("E, MMM dd yyyy");
        String a = String.valueOf(time1);
        String b = time1.format(time1Formatter);
        jLabel1.setText(b);
        String d = String.valueOf(time2);
        String e = time2.format(DayMonthFormatter);
        Time.setText(e);
        Shopping_Panel.setBackground(new java.awt.Color(0,102,0));
        Food_Panel.setBackground(new java.awt.Color(0, 153, 0));
        Recreation_Panel.setBackground(new java.awt.Color(0, 153, 0));
        Public_Transportation_Panel.setBackground(new java.awt.Color(0, 153, 0));
        Map_Panel.setBackground(new java.awt.Color(0, 153, 0));
        Calendar_Panel.setBackground(new java.awt.Color(0, 153, 0));
        About_Panel.setBackground(new java.awt.Color(0,153,0));
        Schools_Panel.setBackground(new java.awt.Color(0,153,0));
        jLabel18.setText("Shopping Centers");
        jLabel19.setText("Menlo Park Mall");
        jLabel19.setIcon(null);
        jLabel20.setText("Regional shopping mall encompassing many stores.");
        jLabel21.setText("Hadley Center");
        jLabel22.setText("Strip mall featuring a movie theater.");
        jLabel23.setText("Woodbridge Mall");
        jLabel24.setText("Two floor super shopping center.");
        jLabel25.setText("");
        jLabel26.setText("");
        jLabel27.setText("");
        When1.setText("55 Parsonage Rd, Edison, NJ");
        Cost1.setText("");
        Cost2.setText("");
        Cost3.setText("");
        When2.setText("4911 Stelton Rd, South Plainfield, NJ");
        When3.setText("250 Woodbridge Center Dr, Woodbridge Township, NJ");
        Where1.setText("");
        Where2.setText("");
        Where3.setText("");
        Directions1.setText("Directions");
        Directions2.setText("Directions");
        Directions3.setText("Directions");
        Step2.setText("");
        Step3.setText("");
        Step4.setText("");
        Step5.setText("");
        Step6.setText("");
        Step7.setText("");
        Transportation1.setText("Transportation");
        Transportation2.setText("Transportation");
        Transportation3.setText("Transportation");
        Hours1.setForeground(new java.awt.Color(0,102,255));
        Hours2.setForeground(new java.awt.Color(0,102,255));
        Hours3.setForeground(new java.awt.Color(0,102,255));
        jLabel25.setIcon(new javax.swing.ImageIcon("C:\\Users\\Aayush\\Desktop\\TSA App Icons\\Menlo2.jpg"));
        jLabel26.setIcon(new javax.swing.ImageIcon("C:\\Users\\Aayush\\Desktop\\TSA App Icons\\Hadley2.jpg"));
        jLabel27.setIcon(new javax.swing.ImageIcon("C:\\Users\\Aayush\\Desktop\\TSA App Icons\\Woodbridge2.jpg"));
        Page_Label.setForeground(new java.awt.Color(255,255,255));
        Page_Line.setForeground(new java.awt.Color(255,255,255));
        Page_1_Label.setForeground(new java.awt.Color(255,255,255));
        Page_2_Label.setForeground(new java.awt.Color(255,255,255));
    }//GEN-LAST:event_Shopping_IconMouseReleased

    private void Shopping_WordMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shopping_WordMouseReleased
        // TODO add your handling code here:
        jScrollPane1.getVerticalScrollBar().setValue(0);
        LocalTime time1 = LocalTime.now();
        DateTimeFormatter time1Formatter = DateTimeFormatter.ofPattern("HH:mm");
        LocalDateTime time2 = LocalDateTime.now();
        DateTimeFormatter DayMonthFormatter = DateTimeFormatter.ofPattern("E, MMM dd yyyy");
        String a = String.valueOf(time1);
        String b = time1.format(time1Formatter);
        jLabel1.setText(b);
        String d = String.valueOf(time2);
        String e = time2.format(DayMonthFormatter);
        Time.setText(e);
        Shopping_Panel.setBackground(new java.awt.Color(0,102,0));
        Food_Panel.setBackground(new java.awt.Color(0, 153, 0));
        Recreation_Panel.setBackground(new java.awt.Color(0, 153, 0));
        Public_Transportation_Panel.setBackground(new java.awt.Color(0, 153, 0));
        Map_Panel.setBackground(new java.awt.Color(0, 153, 0));
        Calendar_Panel.setBackground(new java.awt.Color(0, 153, 0));
        About_Panel.setBackground(new java.awt.Color(0,153,0));
        Schools_Panel.setBackground(new java.awt.Color(0,153,0));
        jLabel18.setText("Shopping Centers");
        jLabel19.setText("Menlo Park Mall");
        jLabel19.setIcon(null);
        jLabel20.setText("Regional shopping mall encompassing many stores.");
        jLabel21.setText("Hadley Center");
        jLabel22.setText("Strip mall featuring a movie theater.");
        jLabel23.setText("Woodbridge Mall");
        jLabel24.setText("Two floor super shopping center.");
        jLabel25.setText("");
        jLabel26.setText("");
        jLabel27.setText("");
        When1.setText("55 Parsonage Rd, Edison, NJ");
        Cost1.setText("");
        Cost2.setText("");
        Cost3.setText("");
        When2.setText("4911 Stelton Rd, South Plainfield, NJ");
        When3.setText("250 Woodbridge Center Dr, Woodbridge Township, NJ");
        Where1.setText("");
        Where2.setText("");
        Where3.setText("");
        Directions1.setText("Directions");
        Directions2.setText("Directions");
        Directions3.setText("Directions");
        Step2.setText("");
        Step3.setText("");
        Step4.setText("");
        Step5.setText("");
        Step6.setText("");
        Step7.setText("");
        Transportation1.setText("Transportation");
        Transportation2.setText("Transportation");
        Transportation3.setText("Transportation");
        Hours1.setForeground(new java.awt.Color(0,102,255));
        Hours2.setForeground(new java.awt.Color(0,102,255));
        Hours3.setForeground(new java.awt.Color(0,102,255));
        jLabel25.setIcon(new javax.swing.ImageIcon("C:\\Users\\Aayush\\Desktop\\TSA App Icons\\Menlo2.jpg"));
        jLabel26.setIcon(new javax.swing.ImageIcon("C:\\Users\\Aayush\\Desktop\\TSA App Icons\\Hadley2.jpg"));
        jLabel27.setIcon(new javax.swing.ImageIcon("C:\\Users\\Aayush\\Desktop\\TSA App Icons\\Woodbridge2.jpg"));
        Page_Label.setForeground(new java.awt.Color(255,255,255));
        Page_Line.setForeground(new java.awt.Color(255,255,255));
        Page_1_Label.setForeground(new java.awt.Color(255,255,255));
        Page_2_Label.setForeground(new java.awt.Color(255,255,255));
    }//GEN-LAST:event_Shopping_WordMouseReleased

    private void Calendar_PanelMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Calendar_PanelMouseReleased
        // TODO add your handling code here:
        jScrollPane1.getVerticalScrollBar().setValue(0);
        LocalTime time1 = LocalTime.now();
        DateTimeFormatter time1Formatter = DateTimeFormatter.ofPattern("HH:mm");
        LocalDateTime time2 = LocalDateTime.now();
        DateTimeFormatter DayMonthFormatter = DateTimeFormatter.ofPattern("E, MMM dd yyyy");
        String a = String.valueOf(time1);
        String b = time1.format(time1Formatter);
        jLabel1.setText(b);
        String d = String.valueOf(time2);
        String e = time2.format(DayMonthFormatter);
        Time.setText(e);
        Calendar_Panel.setBackground(new java.awt.Color(0,102,0));
        Shopping_Panel.setBackground(new java.awt.Color(0, 153, 0));
        Food_Panel.setBackground(new java.awt.Color(0, 153, 0));
        Recreation_Panel.setBackground(new java.awt.Color(0, 153, 0));
        Public_Transportation_Panel.setBackground(new java.awt.Color(0, 153, 0));
        Map_Panel.setBackground(new java.awt.Color(0, 153, 0));
        About_Panel.setBackground(new java.awt.Color(0,153,0));
        Schools_Panel.setBackground(new java.awt.Color(0,153,0));
        jLabel18.setText("Calendar");
        jLabel19.setText("");
        jLabel19.setIcon(new javax.swing.ImageIcon("C:\\Users\\Aayush\\Desktop\\TSA App Icons\\Calendar4.png"));
        jLabel20.setText("");
        Step2.setText("");
        Step3.setText("");
        Step4.setText("");
        Step5.setText("");
        Step6.setText("");
        Step7.setText("");
        jLabel21.setText("");
        jLabel22.setText("");
        jLabel23.setText("");
        jLabel24.setText("");
        jLabel25.setText("");
        jLabel26.setText("");
        jLabel27.setText("");
        When1.setText("");
        Cost1.setText("");
        Cost2.setText("");
        Cost3.setText("");
        When2.setText("");
        When3.setText("");
        Where1.setText("");
        Where2.setText("");
        Where3.setText("");
        Directions1.setText("Edit");
        Directions2.setText("");
        Directions3.setText("");
        Transportation1.setText("");
        Transportation2.setText("");
        Transportation3.setText("");
        Hours1.setForeground(new java.awt.Color(255,255,255));
        Hours2.setForeground(new java.awt.Color(255,255,255));
        Hours3.setForeground(new java.awt.Color(255,255,255));
        jLabel25.setIcon(new javax.swing.ImageIcon());
        jLabel26.setIcon(new javax.swing.ImageIcon());
        jLabel27.setIcon(new javax.swing.ImageIcon());
        Page_Label.setForeground(new java.awt.Color(255,255,255));
        Page_Line.setForeground(new java.awt.Color(255,255,255));
        Page_1_Label.setForeground(new java.awt.Color(255,255,255));
        Page_2_Label.setForeground(new java.awt.Color(255,255,255));
    }//GEN-LAST:event_Calendar_PanelMouseReleased

    private void Calendar_IconMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Calendar_IconMouseReleased
        // TODO add your handling code here:
        jScrollPane1.getVerticalScrollBar().setValue(0);
        LocalTime time1 = LocalTime.now();
        DateTimeFormatter time1Formatter = DateTimeFormatter.ofPattern("HH:mm");
        LocalDateTime time2 = LocalDateTime.now();
        DateTimeFormatter DayMonthFormatter = DateTimeFormatter.ofPattern("E, MMM dd yyyy");
        String a = String.valueOf(time1);
        String b = time1.format(time1Formatter);
        jLabel1.setText(b);
        String d = String.valueOf(time2);
        String e = time2.format(DayMonthFormatter);
        Time.setText(e);
        Calendar_Panel.setBackground(new java.awt.Color(0,102,0));
        Shopping_Panel.setBackground(new java.awt.Color(0, 153, 0));
        Food_Panel.setBackground(new java.awt.Color(0, 153, 0));
        Recreation_Panel.setBackground(new java.awt.Color(0, 153, 0));
        Public_Transportation_Panel.setBackground(new java.awt.Color(0, 153, 0));
        Map_Panel.setBackground(new java.awt.Color(0, 153, 0));
        About_Panel.setBackground(new java.awt.Color(0,153,0));
        Schools_Panel.setBackground(new java.awt.Color(0,153,0));
        jLabel18.setText("Calendar");
        jLabel19.setText("");
        jLabel19.setIcon(new javax.swing.ImageIcon("C:\\Users\\Aayush\\Desktop\\TSA App Icons\\Calendar4.png"));
        jLabel20.setText("");
        Step2.setText("");
        Step3.setText("");
        Step4.setText("");
        Step5.setText("");
        Step6.setText("");
        Step7.setText("");
        jLabel21.setText("");
        jLabel22.setText("");
        jLabel23.setText("");
        jLabel24.setText("");
        jLabel25.setText("");
        jLabel26.setText("");
        jLabel27.setText("");
        When1.setText("");
        Cost1.setText("");
        Cost2.setText("");
        Cost3.setText("");
        When2.setText("");
        When3.setText("");
        Where1.setText("");
        Where2.setText("");
        Where3.setText("");
        Directions1.setText("Edit");
        Directions2.setText("");
        Directions3.setText("");
        Transportation1.setText("");
        Transportation2.setText("");
        Transportation3.setText("");
        Hours1.setForeground(new java.awt.Color(255,255,255));
        Hours2.setForeground(new java.awt.Color(255,255,255));
        Hours3.setForeground(new java.awt.Color(255,255,255));
        jLabel25.setIcon(new javax.swing.ImageIcon());
        jLabel26.setIcon(new javax.swing.ImageIcon());
        jLabel27.setIcon(new javax.swing.ImageIcon());
        Page_Label.setForeground(new java.awt.Color(255,255,255));
        Page_Line.setForeground(new java.awt.Color(255,255,255));
        Page_1_Label.setForeground(new java.awt.Color(255,255,255));
        Page_2_Label.setForeground(new java.awt.Color(255,255,255));
    }//GEN-LAST:event_Calendar_IconMouseReleased

    private void Calendar_WordMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Calendar_WordMouseReleased
        // TODO add your handling code here:
        jScrollPane1.getVerticalScrollBar().setValue(0);
        LocalTime time1 = LocalTime.now();
        DateTimeFormatter time1Formatter = DateTimeFormatter.ofPattern("HH:mm");
        LocalDateTime time2 = LocalDateTime.now();
        DateTimeFormatter DayMonthFormatter = DateTimeFormatter.ofPattern("E, MMM dd yyyy");
        String a = String.valueOf(time1);
        String b = time1.format(time1Formatter);
        jLabel1.setText(b);
        String d = String.valueOf(time2);
        String e = time2.format(DayMonthFormatter);
        Time.setText(e);
        Calendar_Panel.setBackground(new java.awt.Color(0,102,0));
        Shopping_Panel.setBackground(new java.awt.Color(0, 153, 0));
        Food_Panel.setBackground(new java.awt.Color(0, 153, 0));
        Recreation_Panel.setBackground(new java.awt.Color(0, 153, 0));
        Public_Transportation_Panel.setBackground(new java.awt.Color(0, 153, 0));
        Map_Panel.setBackground(new java.awt.Color(0, 153, 0));
        About_Panel.setBackground(new java.awt.Color(0,153,0));
        Schools_Panel.setBackground(new java.awt.Color(0,153,0));
        jLabel18.setText("Calendar");
        jLabel19.setText("");
        jLabel19.setIcon(new javax.swing.ImageIcon("C:\\Users\\Aayush\\Desktop\\TSA App Icons\\Calendar4.png"));
        jLabel20.setText("");
        Step2.setText("");
        Step3.setText("");
        Step4.setText("");
        Step5.setText("");
        Step6.setText("");
        Step7.setText("");
        jLabel21.setText("");
        jLabel22.setText("");
        jLabel23.setText("");
        jLabel24.setText("");
        jLabel25.setText("");
        jLabel26.setText("");
        jLabel27.setText("");
        When1.setText("");
        Cost1.setText("");
        Cost2.setText("");
        Cost3.setText("");
        When2.setText("");
        When3.setText("");
        Where1.setText("");
        Where2.setText("");
        Where3.setText("");
        Directions1.setText("Edit");
        Directions2.setText("");
        Directions3.setText("");
        Transportation1.setText("");
        Transportation2.setText("");
        Transportation3.setText("");
        Hours1.setForeground(new java.awt.Color(255,255,255));
        Hours2.setForeground(new java.awt.Color(255,255,255));
        Hours3.setForeground(new java.awt.Color(255,255,255));
        jLabel25.setIcon(new javax.swing.ImageIcon());
        jLabel26.setIcon(new javax.swing.ImageIcon());
        jLabel27.setIcon(new javax.swing.ImageIcon());
        Page_Label.setForeground(new java.awt.Color(255,255,255));
        Page_Line.setForeground(new java.awt.Color(255,255,255));
        Page_1_Label.setForeground(new java.awt.Color(255,255,255));
        Page_2_Label.setForeground(new java.awt.Color(255,255,255));
    }//GEN-LAST:event_Calendar_WordMouseReleased

    private void App_NameMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_App_NameMouseReleased
        // TODO add your handling code here:
        jScrollPane1.getVerticalScrollBar().setValue(0);
        Add_Chat.setIcon(null);
        AboutPic1.setIcon(null);
        AboutPic4.setIcon(null);
        jLabel19.setForeground(new java.awt.Color(0,0,0));
        Transportation1.setText("Transportation");
        Transportation2.setText("Transportation");
        Transportation3.setText("Transportation");
        LocalTime time1 = LocalTime.now();
        DateTimeFormatter time1Formatter = DateTimeFormatter.ofPattern("HH:mm");
        LocalDateTime time2 = LocalDateTime.now();
        DateTimeFormatter DayMonthFormatter = DateTimeFormatter.ofPattern("E, MMM dd yyyy");
        String a = String.valueOf(time1);
        String b = time1.format(time1Formatter);
        jLabel1.setText(b);
        String d = String.valueOf(time2);
        String e = time2.format(DayMonthFormatter);
        Time.setText(e);
        String Easter_Description1 = "Children find plastic eggs containing chocolate.";
        String Easter_Description2 = "When: April 8, 2020";
        String Easter_Description3 = "Where: Roosevelt Park, Edison NJ";

        String Car_Description1 = "Cars of the late 1900s are showed off.";
        String Car_Description2 = "When: April 9, 2020";
        String Car_Description3 = "Where: Main Street, Metuchen NJ";

        String Blood_Description1 = "A donation blood drive.";
        String Blood_Description2 = "When: April 10, 2020";
        String Blood_Description3 = "Where: Cathedral of Saint Francis, Metuchen NJ";
        Calendar_Panel.setBackground(new java.awt.Color(0, 153, 0));
        Shopping_Panel.setBackground(new java.awt.Color(0, 153, 0));
        Food_Panel.setBackground(new java.awt.Color(0, 153, 0));
        Recreation_Panel.setBackground(new java.awt.Color(0, 153, 0));
        Public_Transportation_Panel.setBackground(new java.awt.Color(0, 153, 0));
        Map_Panel.setBackground(new java.awt.Color(0, 153, 0));
        Weather_Panel.setBackground(new java.awt.Color(0,153,0));
        About_Panel.setBackground(new java.awt.Color(0,153,0));
        Schools_Panel.setBackground(new java.awt.Color(0,153,0));
        jLabel18.setText("What's Happening");
        jLabel19.setText("Easter Egg Hunt");
        jLabel19.setIcon(null);
        jLabel20.setText(Easter_Description1);
        jLabel21.setText("Vintage Car Show");
        jLabel22.setText(Car_Description1);
        jLabel23.setText("Metuchen Blood Drive");
        jLabel24.setText(Blood_Description1);
        When1.setText(Easter_Description2 + " from 12 pm to 3 pm");
        When2.setText(Car_Description2 + " from 4 pm to 7 pm");
        When3.setText(Blood_Description2 + " from 12 pm to 8 pm");
        Where1.setText(Easter_Description3);
        Where2.setText(Car_Description3);
        Where3.setText(Blood_Description3);
        Cost1.setText("Cost: Free");
        Cost2.setText("Cost: Free");
        Cost3.setText("Cost: Free");
        Directions1.setText("Directions");
        Directions2.setText("Directions");
        Directions3.setText("Directions");
        Step2.setText("");
        Step3.setText("");
        Step4.setText("");
        Step5.setText("");
        Step6.setText("");
        Step7.setText("");
        About2.setText("");
        About3.setText("");
        About4.setText("");
        Hours1.setForeground(new java.awt.Color(255,255,255));
        Hours2.setForeground(new java.awt.Color(255,255,255));
        Hours3.setForeground(new java.awt.Color(255,255,255));
        jLabel25.setText("");
        jLabel25.setIcon(new javax.swing.ImageIcon("C:\\Users\\Aayush\\Desktop\\TSA App Icons\\EasterEggHunt2.jpg"));
        jLabel26.setText("");
        jLabel26.setIcon(new javax.swing.ImageIcon("C:\\Users\\Aayush\\Desktop\\TSA App Icons\\Car-Show2.jpg"));
        jLabel27.setText("");
        jLabel27.setIcon(new javax.swing.ImageIcon("C:\\Users\\Aayush\\Desktop\\TSA App Icons\\blood_drive_thumbnail.png"));
        Page_Label.setForeground(new java.awt.Color(255,255,255));
        Page_Line.setForeground(new java.awt.Color(255,255,255));
        Page_1_Label.setForeground(new java.awt.Color(255,255,255));
        Page_2_Label.setForeground(new java.awt.Color(255,255,255));
            jPanel3.setBackground(new java.awt.Color(0, 153, 0));
            Public_Transportation_Panel.setBackground(new java.awt.Color(0, 153, 0));
            Map_Panel.setBackground(new java.awt.Color(0, 153, 0));
            Recreation_Panel.setBackground(new java.awt.Color(0, 153, 0));
            Food_Panel.setBackground(new java.awt.Color(0, 153, 0));
            Shopping_Panel.setBackground(new java.awt.Color(0, 153, 0));
            Calendar_Panel.setBackground(new java.awt.Color(0, 153, 0));
            
            Weather_Panel.setBackground(new java.awt.Color(0,153,0));
            About_Panel.setBackground(new java.awt.Color(0,153,0));
            Schools_Panel.setBackground(new java.awt.Color(0,153,0));
            Menu_Icon.setIcon(new javax.swing.ImageIcon("C:\\Users\\Aayush\\Desktop\\TSA App Icons\\icons8_pull_down_32px.png"));

    }//GEN-LAST:event_App_NameMouseReleased

    private void Schools_WordMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Schools_WordMouseReleased
        // TODO add your handling code here:
        jScrollPane1.getVerticalScrollBar().setValue(0);
        LocalTime time1 = LocalTime.now();
        DateTimeFormatter time1Formatter = DateTimeFormatter.ofPattern("HH:mm");
        LocalDateTime time2 = LocalDateTime.now();
        DateTimeFormatter DayMonthFormatter = DateTimeFormatter.ofPattern("E, MMM dd yyyy");
        String a = String.valueOf(time1);
        String b = time1.format(time1Formatter);
        jLabel1.setText(b);
        String d = String.valueOf(time2);
        String e = time2.format(DayMonthFormatter);
        Time.setText(e);
        Schools_Panel.setBackground(new java.awt.Color(0,102,0));
        Shopping_Panel.setBackground(new java.awt.Color(0, 153, 0));
        Food_Panel.setBackground(new java.awt.Color(0, 153, 0));
        Recreation_Panel.setBackground(new java.awt.Color(0, 153, 0));
        Public_Transportation_Panel.setBackground(new java.awt.Color(0, 153, 0));
        Map_Panel.setBackground(new java.awt.Color(0, 153, 0));
        About_Panel.setBackground(new java.awt.Color(0,153,0));
        Calendar_Panel.setBackground(new java.awt.Color(0,153,0));
        jLabel18.setText("Grade Schools");
        jLabel19.setText("Saint Joseph High School");
        jLabel19.setIcon(null);
        jLabel20.setText("An all boys, Roman catholic, college preparatory private school.");
        jLabel21.setText("Metuchen High School");
        jLabel22.setText("A public four-year high school.");
        jLabel23.setText("Saint Francis Cathedral School");
        jLabel24.setText("A private, catholic school for children.");
        jLabel25.setText("");
        jLabel26.setText("");
        jLabel27.setText("");
        When1.setText("Grades: 9-12");
        Cost1.setText("");
        Cost2.setText("");
        Cost3.setText("");
        When2.setText("Grades: 9-12");
        When3.setText("Grades: Kindergarten-8");
        Where1.setText("145 Plainfield Ave, Metuchen, NJ");
        Where2.setText("400 Grove Ave, Metuchen, NJ");
        Where3.setText("528 Main St, Metuchen, NJ");
        Directions1.setText("Directions");
        Directions2.setText("Directions");
        Directions3.setText("Directions");
        Step2.setText("");
        Step3.setText("");
        Step4.setText("");
        Step5.setText("");
        Step6.setText("");
        Step7.setText("");
        Hours1.setForeground(new java.awt.Color(255,255,255));
        Hours2.setForeground(new java.awt.Color(255,255,255));
        Hours3.setForeground(new java.awt.Color(255,255,255));
        jLabel25.setIcon(new javax.swing.ImageIcon("C:\\Users\\Aayush\\Desktop\\TSA App Icons\\Joseph2.jpg"));
        jLabel26.setIcon(new javax.swing.ImageIcon("C:\\Users\\Aayush\\Desktop\\TSA App Icons\\MHS2.jpg"));
        jLabel27.setIcon(new javax.swing.ImageIcon("C:\\Users\\Aayush\\Desktop\\TSA App Icons\\Francis2.jpg"));
        Page_Label.setForeground(new java.awt.Color(255,255,255));
        Page_Label.setText("");
        Page_Line.setText("");
        Page_Line.setForeground(new java.awt.Color(255,255,255));
        Page_1_Label.setForeground(new java.awt.Color(0,0,0));
        Page_2_Label.setForeground(new java.awt.Color(0,102,255));
        Page_1_Label.setText("Grade Schools");
        Page_2_Label.setText("   Colleges");
    }//GEN-LAST:event_Schools_WordMouseReleased

    private void Schools_PanelMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Schools_PanelMouseReleased
        // TODO add your handling code here:
        jScrollPane1.getVerticalScrollBar().setValue(0);
        LocalTime time1 = LocalTime.now();
        DateTimeFormatter time1Formatter = DateTimeFormatter.ofPattern("HH:mm");
        LocalDateTime time2 = LocalDateTime.now();
        DateTimeFormatter DayMonthFormatter = DateTimeFormatter.ofPattern("E, MMM dd yyyy");
        String a = String.valueOf(time1);
        String b = time1.format(time1Formatter);
        jLabel1.setText(b);
        String d = String.valueOf(time2);
        String e = time2.format(DayMonthFormatter);
        Time.setText(e);
        Schools_Panel.setBackground(new java.awt.Color(0,102,0));
        Shopping_Panel.setBackground(new java.awt.Color(0, 153, 0));
        Food_Panel.setBackground(new java.awt.Color(0, 153, 0));
        Recreation_Panel.setBackground(new java.awt.Color(0, 153, 0));
        Public_Transportation_Panel.setBackground(new java.awt.Color(0, 153, 0));
        Map_Panel.setBackground(new java.awt.Color(0, 153, 0));
        About_Panel.setBackground(new java.awt.Color(0,153,0));
        Calendar_Panel.setBackground(new java.awt.Color(0,153,0));
        jLabel18.setText("Grade Schools");
        jLabel19.setText("Saint Joseph High School");
        jLabel19.setIcon(null);
        jLabel20.setText("An all boys, Roman catholic, college preparatory private school.");
        jLabel21.setText("Metuchen High School");
        jLabel22.setText("A public four-year high school.");
        jLabel23.setText("Saint Francis Cathedral School");
        jLabel24.setText("A private, catholic school for children.");
        jLabel25.setText("");
        jLabel26.setText("");
        jLabel27.setText("");
        When1.setText("Grades: 9-12");
        Cost1.setText("");
        Cost2.setText("");
        Cost3.setText("");
        When2.setText("Grades: 9-12");
        When3.setText("Grades: Kindergarten-8");
        Where1.setText("145 Plainfield Ave, Metuchen, NJ");
        Where2.setText("400 Grove Ave, Metuchen, NJ");
        Where3.setText("528 Main St, Metuchen, NJ");
        Directions1.setText("Directions");
        Directions2.setText("Directions");
        Directions3.setText("Directions");
        Step2.setText("");
        Step3.setText("");
        Step4.setText("");
        Step5.setText("");
        Step6.setText("");
        Step7.setText("");
        Hours1.setForeground(new java.awt.Color(255,255,255));
        Hours2.setForeground(new java.awt.Color(255,255,255));
        Hours3.setForeground(new java.awt.Color(255,255,255));
        jLabel25.setIcon(new javax.swing.ImageIcon("C:\\Users\\Aayush\\Desktop\\TSA App Icons\\Joseph2.jpg"));
        jLabel26.setIcon(new javax.swing.ImageIcon("C:\\Users\\Aayush\\Desktop\\TSA App Icons\\MHS2.jpg"));
        jLabel27.setIcon(new javax.swing.ImageIcon("C:\\Users\\Aayush\\Desktop\\TSA App Icons\\Francis2.jpg"));
        Page_Label.setForeground(new java.awt.Color(255,255,255));
        Page_Label.setText("");
        Page_Line.setText("");
        Page_Line.setForeground(new java.awt.Color(255,255,255));
        Page_1_Label.setForeground(new java.awt.Color(0,0,0));
        Page_2_Label.setForeground(new java.awt.Color(0,102,255));
        Page_1_Label.setText("Grade Schools");
        Page_2_Label.setText("   Colleges");
    }//GEN-LAST:event_Schools_PanelMouseReleased

    private void Schools_IconMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Schools_IconMouseReleased
        // TODO add your handling code here:
        jScrollPane1.getVerticalScrollBar().setValue(0);
        LocalTime time1 = LocalTime.now();
        DateTimeFormatter time1Formatter = DateTimeFormatter.ofPattern("HH:mm");
        LocalDateTime time2 = LocalDateTime.now();
        DateTimeFormatter DayMonthFormatter = DateTimeFormatter.ofPattern("E, MMM dd yyyy");
        String a = String.valueOf(time1);
        String b = time1.format(time1Formatter);
        jLabel1.setText(b);
        String d = String.valueOf(time2);
        String e = time2.format(DayMonthFormatter);
        Time.setText(e);
        Schools_Panel.setBackground(new java.awt.Color(0,102,0));
        Shopping_Panel.setBackground(new java.awt.Color(0, 153, 0));
        Food_Panel.setBackground(new java.awt.Color(0, 153, 0));
        Recreation_Panel.setBackground(new java.awt.Color(0, 153, 0));
        Public_Transportation_Panel.setBackground(new java.awt.Color(0, 153, 0));
        Map_Panel.setBackground(new java.awt.Color(0, 153, 0));
        About_Panel.setBackground(new java.awt.Color(0,153,0));
        Calendar_Panel.setBackground(new java.awt.Color(0,153,0));
        jLabel18.setText("Grade Schools");
        jLabel19.setText("Saint Joseph High School");
        jLabel19.setIcon(null);
        jLabel20.setText("An all boys, Roman catholic, college preparatory private school.");
        jLabel21.setText("Metuchen High School");
        jLabel22.setText("A public four-year high school.");
        jLabel23.setText("Saint Francis Cathedral School");
        jLabel24.setText("A private, catholic school for children.");
        jLabel25.setText("");
        jLabel26.setText("");
        jLabel27.setText("");
        When1.setText("Grades: 9-12");
        Cost1.setText("");
        Cost2.setText("");
        Cost3.setText("");
        When2.setText("Grades: 9-12");
        When3.setText("Grades: Kindergarten-8");
        Where1.setText("145 Plainfield Ave, Metuchen, NJ");
        Where2.setText("400 Grove Ave, Metuchen, NJ");
        Where3.setText("528 Main St, Metuchen, NJ");
        Directions1.setText("Directions");
        Directions2.setText("Directions");
        Directions3.setText("Directions");
        Step2.setText("");
        Step3.setText("");
        Step4.setText("");
        Step5.setText("");
        Step6.setText("");
        Step7.setText("");
        Hours1.setForeground(new java.awt.Color(255,255,255));
        Hours2.setForeground(new java.awt.Color(255,255,255));
        Hours3.setForeground(new java.awt.Color(255,255,255));
        jLabel25.setIcon(new javax.swing.ImageIcon("C:\\Users\\Aayush\\Desktop\\TSA App Icons\\Joseph2.jpg"));
        jLabel26.setIcon(new javax.swing.ImageIcon("C:\\Users\\Aayush\\Desktop\\TSA App Icons\\MHS2.jpg"));
        jLabel27.setIcon(new javax.swing.ImageIcon("C:\\Users\\Aayush\\Desktop\\TSA App Icons\\Francis2.jpg"));
        Page_Label.setForeground(new java.awt.Color(255,255,255));
        Page_Label.setText("");
        Page_Line.setText("");
        Page_Line.setForeground(new java.awt.Color(255,255,255));
        Page_1_Label.setForeground(new java.awt.Color(0,0,0));
        Page_2_Label.setForeground(new java.awt.Color(0,102,255));
        Page_1_Label.setText("Grade Schools");
        Page_2_Label.setText("   Colleges");
    }//GEN-LAST:event_Schools_IconMouseReleased

    private void About_PanelMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_About_PanelMouseReleased
        // TODO add your handling code here:
        jScrollPane1.getVerticalScrollBar().setValue(0);
        LocalTime time1 = LocalTime.now();
        DateTimeFormatter time1Formatter = DateTimeFormatter.ofPattern("HH:mm");
        LocalDateTime time2 = LocalDateTime.now();
        DateTimeFormatter DayMonthFormatter = DateTimeFormatter.ofPattern("E, MMM dd yyyy");
        String a = String.valueOf(time1);
        String b = time1.format(time1Formatter);
        jLabel1.setText(b);
        String d = String.valueOf(time2);
        String e = time2.format(DayMonthFormatter);
        Time.setText(e);
        About_Panel.setBackground(new java.awt.Color(0,102,0));
        Shopping_Panel.setBackground(new java.awt.Color(0, 153, 0));
        Food_Panel.setBackground(new java.awt.Color(0, 153, 0));
        Recreation_Panel.setBackground(new java.awt.Color(0, 153, 0));
        Public_Transportation_Panel.setBackground(new java.awt.Color(0, 153, 0));
        Map_Panel.setBackground(new java.awt.Color(0, 153, 0));
        Schools_Panel.setBackground(new java.awt.Color(0,153,0));
        Calendar_Panel.setBackground(new java.awt.Color(0,153,0));
        jLabel18.setText("About the App");
        jLabel19.setText("Desktop App");
        jLabel19.setIcon(null);
        jLabel20.setText("In order to create the TownMate Desktop App, we utilized the Java Development Kit 8");
        Step2.setText("and Java Swing in the IntelliJ IDEA Integrated Development Environment. We imported");
        Step3.setText("many classes and files to build the app, including java.time and java.awt. Java was");
        Step4.setText("used to handle the in-app events and mouse clicks. We used Github to share our source");
        Step5.setText("code with each other and edit the app so everyone has the same version.");
        Step6.setText("");
        Step7.setText("");
        jLabel21.setText("Mobile App");
        jLabel22.setText("In order to create the TownMate Mobile App, we utilized Thunkable, the online mobile");
        About2.setText("app creating platform, in conjuction with Airtable, an online spreadsheet database");
        About3.setText("service. The database allowed us to easily update and change the information displayed");
        About4.setText("in the app.");
        AboutPic1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Aayush\\Desktop\\TSA App Icons\\About_1_Pics4.jpg"));
        AboutPic4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Aayush\\Desktop\\TSA App Icons\\About_2_Pics7.jpg"));
        jLabel23.setText("");
        jLabel24.setText("");
        jLabel25.setText("");
        jLabel26.setText("");
        jLabel27.setText("");
        When1.setText("");
        Cost1.setText("");
        Cost2.setText("");
        Cost3.setText("");
        When2.setText("");
        When3.setText("");
        Where1.setText("");
        Where2.setText("");
        Where3.setText("");
        Directions1.setText("");
        Directions2.setText("");
        Directions3.setText("");
        Transportation1.setText("");
        Transportation2.setText("");
        Transportation3.setText("");
        Hours1.setForeground(new java.awt.Color(255,255,255));
        Hours2.setForeground(new java.awt.Color(255,255,255));
        Hours3.setForeground(new java.awt.Color(255,255,255));
        jLabel25.setIcon(new javax.swing.ImageIcon());
        jLabel26.setIcon(new javax.swing.ImageIcon());
        jLabel27.setIcon(new javax.swing.ImageIcon());
        Page_Label.setForeground(new java.awt.Color(255,255,255));
        Page_Line.setForeground(new java.awt.Color(255,255,255));
        Page_1_Label.setForeground(new java.awt.Color(255,255,255));
        Page_2_Label.setForeground(new java.awt.Color(255,255,255));
    }//GEN-LAST:event_About_PanelMouseReleased

    private void About_WordMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_About_WordMouseReleased
        // TODO add your handling code here:
        jScrollPane1.getVerticalScrollBar().setValue(0);
        LocalTime time1 = LocalTime.now();
        DateTimeFormatter time1Formatter = DateTimeFormatter.ofPattern("HH:mm");
        LocalDateTime time2 = LocalDateTime.now();
        DateTimeFormatter DayMonthFormatter = DateTimeFormatter.ofPattern("E, MMM dd yyyy");
        String a = String.valueOf(time1);
        String b = time1.format(time1Formatter);
        jLabel1.setText(b);
        String d = String.valueOf(time2);
        String e = time2.format(DayMonthFormatter);
        Time.setText(e);
        About_Panel.setBackground(new java.awt.Color(0,102,0));
        Shopping_Panel.setBackground(new java.awt.Color(0, 153, 0));
        Food_Panel.setBackground(new java.awt.Color(0, 153, 0));
        Recreation_Panel.setBackground(new java.awt.Color(0, 153, 0));
        Public_Transportation_Panel.setBackground(new java.awt.Color(0, 153, 0));
        Map_Panel.setBackground(new java.awt.Color(0, 153, 0));
        Schools_Panel.setBackground(new java.awt.Color(0,153,0));
        Calendar_Panel.setBackground(new java.awt.Color(0,153,0));
        jLabel18.setText("About the App");
        jLabel19.setText("Desktop App");
        jLabel19.setIcon(null);
        jLabel20.setText("In order to create the TownMate Desktop App, we utilized the Java Development Kit 8");
        Step2.setText("and Java Swing in the IntelliJ IDEA Integrated Development Environment. We imported");
        Step3.setText("many classes and files to build the app, including java.time and java.awt. Java was");
        Step4.setText("used to handle the in-app events and mouse clicks. We used Github to share our source");
        Step5.setText("code with each other and edit the app so everyone has the same version.");
        Step6.setText("");
        Step7.setText("");
        jLabel21.setText("Mobile App");
        jLabel22.setText("In order to create the TownMate Mobile App, we utilized Thunkable, the online mobile");
        About2.setText("app creating platform, in conjuction with Airtable, an online spreadsheet database");
        About3.setText("service. The database allowed us to easily update and change the information displayed");
        About4.setText("in the app.");
        AboutPic1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Aayush\\Desktop\\TSA App Icons\\About_1_Pics4.jpg"));
        AboutPic4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Aayush\\Desktop\\TSA App Icons\\About_2_Pics7.jpg"));
        jLabel23.setText("");
        jLabel24.setText("");
        jLabel25.setText("");
        jLabel26.setText("");
        jLabel27.setText("");
        When1.setText("");
        Cost1.setText("");
        Cost2.setText("");
        Cost3.setText("");
        When2.setText("");
        When3.setText("");
        Where1.setText("");
        Where2.setText("");
        Where3.setText("");
        Directions1.setText("");
        Directions2.setText("");
        Directions3.setText("");
        Transportation1.setText("");
        Transportation2.setText("");
        Transportation3.setText("");
        Hours1.setForeground(new java.awt.Color(255,255,255));
        Hours2.setForeground(new java.awt.Color(255,255,255));
        Hours3.setForeground(new java.awt.Color(255,255,255));
        jLabel25.setIcon(new javax.swing.ImageIcon());
        jLabel26.setIcon(new javax.swing.ImageIcon());
        jLabel27.setIcon(new javax.swing.ImageIcon());
        Page_Label.setForeground(new java.awt.Color(255,255,255));
        Page_Line.setForeground(new java.awt.Color(255,255,255));
        Page_1_Label.setForeground(new java.awt.Color(255,255,255));
        Page_2_Label.setForeground(new java.awt.Color(255,255,255));
    }//GEN-LAST:event_About_WordMouseReleased

    private void About_IconMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_About_IconMouseReleased
        // TODO add your handling code here:
        jScrollPane1.getVerticalScrollBar().setValue(0);
        LocalTime time1 = LocalTime.now();
        DateTimeFormatter time1Formatter = DateTimeFormatter.ofPattern("HH:mm");
        LocalDateTime time2 = LocalDateTime.now();
        DateTimeFormatter DayMonthFormatter = DateTimeFormatter.ofPattern("E, MMM dd yyyy");
        String a = String.valueOf(time1);
        String b = time1.format(time1Formatter);
        jLabel1.setText(b);
        String d = String.valueOf(time2);
        String e = time2.format(DayMonthFormatter);
        Time.setText(e);
        About_Panel.setBackground(new java.awt.Color(0,102,0));
        Shopping_Panel.setBackground(new java.awt.Color(0, 153, 0));
        Food_Panel.setBackground(new java.awt.Color(0, 153, 0));
        Recreation_Panel.setBackground(new java.awt.Color(0, 153, 0));
        Public_Transportation_Panel.setBackground(new java.awt.Color(0, 153, 0));
        Map_Panel.setBackground(new java.awt.Color(0, 153, 0));
        Schools_Panel.setBackground(new java.awt.Color(0,153,0));
        Calendar_Panel.setBackground(new java.awt.Color(0,153,0));
        jLabel18.setText("About the App");
        jLabel19.setText("Desktop App");
        jLabel19.setIcon(null);
        jLabel20.setText("In order to create the TownMate Desktop App, we utilized the Java Development Kit 8");
        Step2.setText("and Java Swing in the IntelliJ IDEA Integrated Development Environment. We imported");
        Step3.setText("many classes and files to build the app, including java.time and java.awt. Java was");
        Step4.setText("used to handle the in-app events and mouse clicks. We used Github to share our source");
        Step5.setText("code with each other and edit the app so everyone has the same version.");
        Step6.setText("");
        Step7.setText("");
        jLabel21.setText("Mobile App");
        jLabel22.setText("In order to create the TownMate Mobile App, we utilized Thunkable, the online mobile");
        About2.setText("app creating platform, in conjuction with Airtable, an online spreadsheet database");
        About3.setText("service. The database allowed us to easily update and change the information displayed");
        About4.setText("in the app.");
        jLabel23.setText("");
        AboutPic1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Aayush\\Desktop\\TSA App Icons\\About_1_Pics4.jpg"));
        AboutPic4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Aayush\\Desktop\\TSA App Icons\\About_2_Pics7.jpg"));
        jLabel24.setText("");
        jLabel25.setText("");
        jLabel26.setText("");
        jLabel27.setText("");
        When1.setText("");
        Cost1.setText("");
        Cost2.setText("");
        Cost3.setText("");
        When2.setText("");
        When3.setText("");
        Where1.setText("");
        Where2.setText("");
        Where3.setText("");
        Directions1.setText("");
        Directions2.setText("");
        Directions3.setText("");
        Transportation1.setText("");
        Transportation2.setText("");
        Transportation3.setText("");
        Hours1.setForeground(new java.awt.Color(255,255,255));
        Hours2.setForeground(new java.awt.Color(255,255,255));
        Hours3.setForeground(new java.awt.Color(255,255,255));
        jLabel25.setIcon(new javax.swing.ImageIcon());
        jLabel26.setIcon(new javax.swing.ImageIcon());
        jLabel27.setIcon(new javax.swing.ImageIcon());
        Page_Label.setForeground(new java.awt.Color(255,255,255));
        Page_Line.setForeground(new java.awt.Color(255,255,255));
        Page_1_Label.setForeground(new java.awt.Color(255,255,255));
        Page_2_Label.setForeground(new java.awt.Color(255,255,255));
    }//GEN-LAST:event_About_IconMouseReleased

    private void Page_1_LabelMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Page_1_LabelMouseReleased
        // TODO add your handling code here:
        jScrollPane1.getVerticalScrollBar().setValue(0);
        page1click++;
        Page_Label.setForeground(new java.awt.Color(0,0,0));
        Page_Line.setForeground(new java.awt.Color(0,0,0));
        Page_1_Label.setForeground(new java.awt.Color(0,0,0));
        Page_2_Label.setForeground(new java.awt.Color(0,102,255));
        if (jLabel18.getText() == "Recreation") {
            jScrollPane1.getVerticalScrollBar().setValue(0);
            LocalTime time1 = LocalTime.now();
            DateTimeFormatter time1Formatter = DateTimeFormatter.ofPattern("HH:mm");
            LocalDateTime time2 = LocalDateTime.now();
            DateTimeFormatter DayMonthFormatter = DateTimeFormatter.ofPattern("E, MMM dd yyyy");
            String a = String.valueOf(time1);
            String b = time1.format(time1Formatter);
            jLabel1.setText(b);
            String d = String.valueOf(time2);
            String e = time2.format(DayMonthFormatter);
            Time.setText(e);
            Recreation_Panel.setBackground(new java.awt.Color(0,102,0));
            Map_Panel.setBackground(new java.awt.Color(0, 153, 0));
            Public_Transportation_Panel.setBackground(new java.awt.Color(0, 153, 0));
            Food_Panel.setBackground(new java.awt.Color(0, 153, 0));
            Shopping_Panel.setBackground(new java.awt.Color(0, 153, 0));
            Calendar_Panel.setBackground(new java.awt.Color(0, 153, 0));
            About_Panel.setBackground(new java.awt.Color(0,153,0));
            Schools_Panel.setBackground(new java.awt.Color(0,153,0));
            jLabel18.setText("Recreation");
            jLabel19.setText("Metuchen Sports Plex");
            jLabel19.setIcon(null);
            jLabel20.setText("Sports facility offering many different activities.");
            jLabel21.setText("Metuchen YMCA");
            jLabel22.setText("Shared building used for sports and activities.");
            jLabel23.setText("Metuchen Country Club");
            jLabel24.setText("A club with dining and sporting facilities.");
            jLabel25.setText("");
            jLabel26.setText("");
            jLabel27.setText("");
            When1.setText("215 Durham Ave, Metuchen, NJ");
            Cost1.setText("");
            Cost2.setText("");
            Cost3.setText("");
            When2.setText("65 High St, Metuchen, NJ");
            When3.setText("244 Plainfield Rd, Edison, NJ");
            Where1.setText("");
            Where2.setText("");
            Where3.setText("");
            Directions1.setText("Directions");
            Directions2.setText("Directions");
            Directions3.setText("Directions");
            Step2.setText("");
            Step3.setText("");
            Step4.setText("");
            Step5.setText("");
            Step6.setText("");
            Step7.setText("");
            Transportation1.setText("Transportation");
            Transportation2.setText("Transportation");
            Transportation3.setText("Transportation");
            jLabel25.setIcon(new javax.swing.ImageIcon("C:\\Users\\Aayush\\Desktop\\TSA App Icons\\Sportsplex2.jpg"));
            jLabel26.setIcon(new javax.swing.ImageIcon("C:\\Users\\Aayush\\Desktop\\TSA App Icons\\YMCA2.jpg"));
            jLabel27.setIcon(new javax.swing.ImageIcon("C:\\Users\\Aayush\\Desktop\\TSA App Icons\\Club2.gif"));
            Page_Label.setForeground(new java.awt.Color(0,0,0));
            Page_Line.setForeground(new java.awt.Color(0,0,0));
            Page_Label.setText("Page");
            Page_Line.setText("|");
            Page_1_Label.setForeground(new java.awt.Color(0,0,0));
            Page_2_Label.setForeground(new java.awt.Color(0,102,255));
            Page_1_Label.setText(" 1 ");
            Page_2_Label.setText(" 2 ");
        }
        if (jLabel18.getText() == "Restaurants") {
            jScrollPane1.getVerticalScrollBar().setValue(0);
            LocalTime time1 = LocalTime.now();
            DateTimeFormatter time1Formatter = DateTimeFormatter.ofPattern("HH:mm");
            LocalDateTime time2 = LocalDateTime.now();
            DateTimeFormatter DayMonthFormatter = DateTimeFormatter.ofPattern("E, MMM dd yyyy");
            String a = String.valueOf(time1);
            String b = time1.format(time1Formatter);
            jLabel1.setText(b);
            String d = String.valueOf(time2);
            String e = time2.format(DayMonthFormatter);
            Time.setText(e);
            Food_Panel.setBackground(new java.awt.Color(0,102,0));
            Recreation_Panel.setBackground(new java.awt.Color(0, 153, 0));
            Public_Transportation_Panel.setBackground(new java.awt.Color(0, 153, 0));
            Map_Panel.setBackground(new java.awt.Color(0, 153, 0));
            Shopping_Panel.setBackground(new java.awt.Color(0, 153, 0));
            Calendar_Panel.setBackground(new java.awt.Color(0, 153, 0));
            About_Panel.setBackground(new java.awt.Color(0,153,0));
            Schools_Panel.setBackground(new java.awt.Color(0,153,0));
            jLabel18.setText("Restaurants");
            jLabel19.setText("Cai's Cafe");
            jLabel19.setIcon(null);
            jLabel20.setText("A resturant selling coffee and light meals.");
            jLabel21.setText("Tastee Sub Shop");
            jLabel22.setText("Serves a variety of submarine sandwiches.");
            jLabel23.setText("Joey D's Pizza");
            jLabel24.setText("Serves many different types of pizza or pastas.");
            jLabel25.setText("");
            jLabel26.setText("");
            jLabel27.setText("");
            When1.setText("420 Main St, Metuchen, NJ");
            Cost1.setText("");
            Cost2.setText("");
            Cost3.setText("");
            When2.setText("267 Plainfield Ave, Edison, NJ");
            When3.setText("279 Co Rd 669, Metuchen, NJ");
            Where1.setText("");
            Where2.setText("");
            Where3.setText("");
            Directions1.setText("Directions");
            Directions2.setText("Directions");
            Directions3.setText("Directions");
            Step2.setText("");
            Step3.setText("");
            Step4.setText("");
            Step5.setText("");
            Step6.setText("");
            Step7.setText("");
            Transportation1.setText("Transportation");
            Transportation2.setText("Transportation");
            Transportation3.setText("Transportation");
            jLabel25.setIcon(new javax.swing.ImageIcon("C:\\Users\\Aayush\\Desktop\\TSA App Icons\\Cafe2.jpg"));
            jLabel26.setIcon(new javax.swing.ImageIcon("C:\\Users\\Aayush\\Desktop\\TSA App Icons\\Sub2.jpg"));
            jLabel27.setIcon(new javax.swing.ImageIcon("C:\\Users\\Aayush\\Desktop\\TSA App Icons\\Joey2.jpg"));
            Page_Label.setForeground(new java.awt.Color(0,0,0));
            Page_Line.setForeground(new java.awt.Color(0,0,0));
            Page_Label.setText("Page");
            Page_Line.setText("|");
            Page_1_Label.setForeground(new java.awt.Color(0,0,0));
            Page_2_Label.setForeground(new java.awt.Color(0,102,255));
            Page_1_Label.setText(" 1 ");
            Page_2_Label.setText(" 2 ");
        }
        if (jLabel18.getText() == "Grade Schools" || jLabel18.getText() == "Colleges") {
            jScrollPane1.getVerticalScrollBar().setValue(0);
            LocalTime time1 = LocalTime.now();
            DateTimeFormatter time1Formatter = DateTimeFormatter.ofPattern("HH:mm");
            LocalDateTime time2 = LocalDateTime.now();
            DateTimeFormatter DayMonthFormatter = DateTimeFormatter.ofPattern("E, MMM dd yyyy");
            String a = String.valueOf(time1);
            String b = time1.format(time1Formatter);
            jLabel1.setText(b);
            String d = String.valueOf(time2);
            String e = time2.format(DayMonthFormatter);
            Time.setText(e);
            Schools_Panel.setBackground(new java.awt.Color(0,102,0));
            Shopping_Panel.setBackground(new java.awt.Color(0, 153, 0));
            Food_Panel.setBackground(new java.awt.Color(0, 153, 0));
            Recreation_Panel.setBackground(new java.awt.Color(0, 153, 0));
            Public_Transportation_Panel.setBackground(new java.awt.Color(0, 153, 0));
            Map_Panel.setBackground(new java.awt.Color(0, 153, 0));
            About_Panel.setBackground(new java.awt.Color(0,153,0));
            Calendar_Panel.setBackground(new java.awt.Color(0,153,0));
            jLabel18.setText("Grade Schools");
            jLabel19.setText("Saint Joseph High School");
            jLabel19.setIcon(null);
            jLabel20.setText("An all boys, Roman catholic, college preparatory private school.");
            jLabel21.setText("Metuchen High School");
            jLabel22.setText("A public four-year high school.");
            jLabel23.setText("Saint Francis Cathedral School");
            jLabel24.setText("A private, catholic school for children.");
            jLabel25.setText("");
            jLabel26.setText("");
            jLabel27.setText("");
            When1.setText("Grades: 9-12");
            Cost1.setText("");
            Cost2.setText("");
            Cost3.setText("");
            When2.setText("Grades: 9-12");
            When3.setText("Grades: Kindergarten-8");
            Where1.setText("145 Plainfield Ave, Metuchen, NJ");
            Where2.setText("400 Grove Ave, Metuchen, NJ");
            Where3.setText("528 Main St, Metuchen, NJ");
            Directions1.setText("Directions");
            Directions2.setText("Directions");
            Directions3.setText("Directions");
            Step2.setText("");
            Step3.setText("");
            Step4.setText("");
            Step5.setText("");
            Step6.setText("");
            Step7.setText("");
            jLabel25.setIcon(new javax.swing.ImageIcon("C:\\Users\\Aayush\\Desktop\\TSA App Icons\\Joseph2.jpg"));
            jLabel26.setIcon(new javax.swing.ImageIcon("C:\\Users\\Aayush\\Desktop\\TSA App Icons\\MHS2.jpg"));
            jLabel27.setIcon(new javax.swing.ImageIcon("C:\\Users\\Aayush\\Desktop\\TSA App Icons\\Francis2.jpg"));
            Page_Label.setForeground(new java.awt.Color(255,255,255));
            Page_Label.setText("");
            Page_Line.setText("");
            Page_Line.setForeground(new java.awt.Color(255,255,255));
            Page_1_Label.setForeground(new java.awt.Color(0,0,0));
            Page_2_Label.setForeground(new java.awt.Color(0,102,255));
            Page_1_Label.setText("Grade Schools");
            Page_2_Label.setText("   Colleges");
        }
        if (jLabel18.getText() == "Directions to Roosevelt Park") {
            jScrollPane1.getVerticalScrollBar().setValue(0);
            LocalTime time1 = LocalTime.now();
            DateTimeFormatter time1Formatter = DateTimeFormatter.ofPattern("HH:mm");
            LocalDateTime time2 = LocalDateTime.now();
            DateTimeFormatter DayMonthFormatter = DateTimeFormatter.ofPattern("E, MMM dd yyyy");
            String a = String.valueOf(time1);
            String b = time1.format(time1Formatter);
            jLabel1.setText(b);
            String d = String.valueOf(time2);
            String e = time2.format(DayMonthFormatter);
            Time.setText(e);
            Public_Transportation_Panel.setBackground(new java.awt.Color(0,102,0));
            Map_Panel.setBackground(new java.awt.Color(0, 153, 0));
            Recreation_Panel.setBackground(new java.awt.Color(0, 153, 0));
            Food_Panel.setBackground(new java.awt.Color(0, 153, 0));
            Shopping_Panel.setBackground(new java.awt.Color(0, 153, 0));
            Calendar_Panel.setBackground(new java.awt.Color(0, 153, 0));
            About_Panel.setBackground(new java.awt.Color(0,153,0));
            Schools_Panel.setBackground(new java.awt.Color(0,153,0));
            jLabel18.setText("Transportation");
            jLabel19.setIcon(null);
            jLabel19.setText("Metuchen Train Station");
            jLabel20.setText("NJ transit station available to citizens at a low cost.");
            Step2.setText("");
            Step3.setText("");
            Step4.setText("");
            Step5.setText("");
            Step6.setText("");
            Step7.setText("");
            jLabel21.setText("NJ Transit Bus");
            jLabel22.setText("Buses allowing citizens to travel the city for a small fee.");
            jLabel23.setText("LimeBikes");
            jLabel24.setText("A 24/7 service where passengers can rent bikes to ride.");
            jLabel25.setText("");
            jLabel26.setText("");
            jLabel27.setText("");
            When1.setText("Woodbridge Avenue & Main Street, Metuchen, NJ");
            When2.setText("");
            When3.setText("");
            Where1.setText("");
            Where2.setText("");
            Where3.setText("");
            Cost1.setText("");
            Cost2.setText("");
            Cost3.setText("");
            Directions1.setText("Directions");
            Directions2.setText("Stops");
            Directions3.setText("Locations");
            Transportation1.setText("");
            Transportation2.setText("");
            Transportation3.setText("");
            jLabel25.setIcon(new javax.swing.ImageIcon("C:\\Users\\Aayush\\Desktop\\TSA App Icons\\Train_Station2.jpg"));
            jLabel26.setIcon(new javax.swing.ImageIcon("C:\\Users\\Aayush\\Desktop\\TSA App Icons\\Transit_Bus.jpg"));
            jLabel27.setIcon(new javax.swing.ImageIcon("C:\\Users\\Aayush\\Desktop\\TSA App Icons\\LimeBike2.jpg"));
            Page_1_Label.setForeground(new java.awt.Color(255,255,255));
            Page_2_Label.setForeground(new java.awt.Color(255,255,255));
            Page_Label.setForeground(new java.awt.Color(255,255,255));
            Page_Line.setForeground(new java.awt.Color(255,255,255));
        }
    }//GEN-LAST:event_Page_1_LabelMouseReleased

    private void Page_2_LabelMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Page_2_LabelMouseReleased
        // TODO add your handling code here:
        jScrollPane1.getVerticalScrollBar().setValue(0);
        page2click++;
        Page_Label.setForeground(new java.awt.Color(0,0,0));
        Page_Line.setForeground(new java.awt.Color(0,0,0));
        Page_2_Label.setForeground(new java.awt.Color(0,0,0));
        Page_1_Label.setForeground(new java.awt.Color(0,102,255));
        if (jLabel18.getText() == "Recreation"){
            jLabel19.setText("Roosevelt Park");
            jLabel19.setIcon(null);
            jLabel20.setText("Public park featuring sports facilities and a lake.");
            jLabel21.setText("Stelton Lanes");
            jLabel22.setText("Bowling alley with an American food restaurant.");
            jLabel23.setText("Metuchen Hiking Trails");
            jLabel24.setText("Hiking trails that display the beautiful Metuchen scenery.");
            jLabel25.setText("");
            jLabel26.setText("");
            jLabel27.setText("");
            When1.setText("151 Parsonage Rd, Edison, NJ");
            Cost1.setText("");
            Cost2.setText("");
            Cost3.setText("");
            When2.setText("1665 Stelton Rd #1, Piscataway, NJ");
            When3.setText("Grove Ave & Oakland Ave, Metuchen, NJ");
            Where1.setText("");
            Where2.setText("");
            Where3.setText("");
            Directions1.setText("Directions");
            Directions2.setText("Directions");
            Directions3.setText("Directions");
            Step2.setText("");
            Step3.setText("");
            Step4.setText("");
            Step5.setText("");
            Step6.setText("");
            Step7.setText("");
            jLabel25.setIcon(new javax.swing.ImageIcon("C:\\Users\\Aayush\\Desktop\\TSA App Icons\\Park2.jpg"));
            jLabel26.setIcon(new javax.swing.ImageIcon("C:\\Users\\Aayush\\Desktop\\TSA App Icons\\Stelton2.jpg"));
            jLabel27.setIcon(new javax.swing.ImageIcon("C:\\Users\\Aayush\\Desktop\\TSA App Icons\\Trails2.jpg"));
            Page_Label.setForeground(new java.awt.Color(0,0,0));
            Page_Line.setForeground(new java.awt.Color(0,0,0));
            Page_2_Label.setForeground(new java.awt.Color(0,0,0));
            Page_1_Label.setForeground(new java.awt.Color(0,102,255));
        }
        if (jLabel18.getText() == "Restaurants") {
            jLabel18.setText("Restaurants");
            jLabel19.setText("Haisch's Bakery");
            jLabel19.setIcon(null);
            jLabel20.setText("Sells cakes and bread products.");
            jLabel21.setText("Fusha Asian Bistro & Sushi");
            jLabel22.setText("Serves sushi, soups, and salads.");
            jLabel23.setText("Adyar Ananda Bhavan");
            jLabel24.setText("Serves Indian food, with a store for sweets.");
            jLabel25.setText("");
            jLabel26.setText("");
            jLabel27.setText("");
            When1.setText("116 Sampton Ave, South Plainfield, NJ");
            Cost1.setText("");
            Cost2.setText("");
            Cost3.setText("");
            When2.setText("452 Main St, Metuchen, NJ");
            When3.setText("6400 Hadley Rd, South Plainfield, NJ");
            Where1.setText("");
            Where2.setText("");
            Where3.setText("");
            Directions1.setText("Directions");
            Directions2.setText("Directions");
            Directions3.setText("Directions");
            Step2.setText("");
            Step3.setText("");
            Step4.setText("");
            Step5.setText("");
            Step6.setText("");
            Step7.setText("");
            jLabel25.setIcon(new javax.swing.ImageIcon("C:\\Users\\Aayush\\Desktop\\TSA App Icons\\Bakery2.jpg"));
            jLabel26.setIcon(new javax.swing.ImageIcon("C:\\Users\\Aayush\\Desktop\\TSA App Icons\\Sushi2.jpg"));
            jLabel27.setIcon(new javax.swing.ImageIcon("C:\\Users\\Aayush\\Desktop\\TSA App Icons\\Bhavan2.jpg"));
            Page_Label.setForeground(new java.awt.Color(0,0,0));
            Page_Line.setForeground(new java.awt.Color(0,0,0));
            Page_2_Label.setForeground(new java.awt.Color(0,0,0));
            Page_1_Label.setForeground(new java.awt.Color(0,102,255));
            Page_1_Label.setText(" 1 ");
            Page_2_Label.setText(" 2 ");
        }
        if (jLabel18.getText() == "Grade Schools") {
            jLabel18.setText("Colleges");
            jLabel19.setText("Rutgers University");
            jLabel19.setIcon(null);
            jLabel20.setText("The state university of NJ");
            jLabel21.setText("Middlesex County College");
            jLabel22.setText("A two-year public community college");
            jLabel23.setText("Princeton University");
            jLabel24.setText("Private ivy league university");
            jLabel25.setText("");
            jLabel26.setText("");
            jLabel27.setText("");
            When1.setText("Graduate and undergraduate programs");
            Cost1.setText("");
            Cost2.setText("");
            Cost3.setText("");
            When2.setText("Graduate and undergraduate programs");
            When3.setText("Graduate and undergraduate programs");
            Where1.setText("New Brunswick, NJ");
            Where2.setText("Edison, NJ");
            Where3.setText("Princeton, NJ");
            Directions1.setText("Directions");
            Directions2.setText("Directions");
            Directions3.setText("Directions");
            Step2.setText("");
            Step3.setText("");
            Step4.setText("");
            Step5.setText("");
            Step6.setText("");
            Step7.setText("");
            jLabel25.setIcon(new javax.swing.ImageIcon("C:\\Users\\Aayush\\Desktop\\TSA App Icons\\Rutgers2.jpg"));
            jLabel26.setIcon(new javax.swing.ImageIcon("C:\\Users\\Aayush\\Desktop\\TSA App Icons\\MCC2.jpg"));
            jLabel27.setIcon(new javax.swing.ImageIcon("C:\\Users\\Aayush\\Desktop\\TSA App Icons\\Princeton2.jpg"));
            Page_Label.setForeground(new java.awt.Color(255,255,255));
            Page_Line.setForeground(new java.awt.Color(255,255,255));
            Page_Label.setText("");
            Page_Line.setText("");
            Page_2_Label.setForeground(new java.awt.Color(0,0,0));
            Page_1_Label.setForeground(new java.awt.Color(0,102,255));
            Page_1_Label.setText("Grade Schools");
            Page_2_Label.setText("   Colleges");
        }
    }//GEN-LAST:event_Page_2_LabelMouseReleased

    private void Directions1MouseReleased(java.awt.event.MouseEvent evt) {
        if (Directions1.getText() == "Directions") {
            jScrollPane1.getVerticalScrollBar().setValue(0);
            Transportation1.setText("");
            Transportation2.setText("");
            Transportation3.setText("");
            LocalTime time1 = LocalTime.now();
            DateTimeFormatter time1Formatter = DateTimeFormatter.ofPattern("HH:mm");
            LocalDateTime time2 = LocalDateTime.now();
            DateTimeFormatter DayMonthFormatter = DateTimeFormatter.ofPattern("E, MMM dd yyyy");
            String a = String.valueOf(time1);
            String b = time1.format(time1Formatter);
            jLabel1.setText(b);
            String d = String.valueOf(time2);
            String e = time2.format(DayMonthFormatter);
            Time.setText(e);
            Map_Panel.setBackground(new java.awt.Color(0,102,0));
            Public_Transportation_Panel.setBackground(new java.awt.Color(0, 153, 0));
            Recreation_Panel.setBackground(new java.awt.Color(0, 153, 0));
            Food_Panel.setBackground(new java.awt.Color(0, 153, 0));
            Shopping_Panel.setBackground(new java.awt.Color(0, 153, 0));
            Calendar_Panel.setBackground(new java.awt.Color(0, 153, 0));
            About_Panel.setBackground(new java.awt.Color(0,153,0));
            Schools_Panel.setBackground(new java.awt.Color(0,153,0));
            Weather_Panel.setBackground(new java.awt.Color(0,153,0));
            jPanel3.setBackground(new java.awt.Color(0, 153, 0));
            jLabel18.setText("Directions to Roosevelt Park");
            jLabel19.setText("");
            jLabel19.setIcon(new javax.swing.ImageIcon("C:\\Users\\Aayush\\Desktop\\TSA App Icons\\StJoesToRoosevelt3.png"));
            jLabel20.setText("Step 1: Start on Liberty Street and turn right onto Central Avenue.");
            Step2.setText("Step 2: Turn left onto Midland Avenue.");
            Step3.setText("Step 3: Continue straight and turn right onto Harvard Avenue.");
            Step4.setText("Step 4: Turn left onto Christol Street.");
            Step5.setText("Step 5: Turn right onto Columbia Avenue.");
            Step6.setText("Step 6: Continue straight and the destination will be on your right: Roosevelt Park, Edison New Jersey");
            Step7.setText("Step 7: You made it!");
            jLabel21.setText("");
            jLabel22.setText("");
            jLabel23.setText("");
            jLabel24.setText("");
            jLabel25.setText("");
            jLabel26.setText("");
            jLabel27.setText("");
            When1.setText("");
            Cost1.setText("");
            Cost2.setText("");
            Cost3.setText("");
            When2.setText("");
            When3.setText("");
            Where1.setText("");
            Where2.setText("");
            Where3.setText("");
            Directions1.setText("");
            Directions2.setText("");
            Directions3.setText("");
            Transportation1.setText("");
            Transportation2.setText("");
            Transportation3.setText("");
            jLabel25.setIcon(new javax.swing.ImageIcon());
            jLabel26.setIcon(new javax.swing.ImageIcon());
            jLabel27.setIcon(new javax.swing.ImageIcon());
            Page_Label.setForeground(new java.awt.Color(255,255,255));
            Page_Line.setForeground(new java.awt.Color(255,255,255));
            Page_1_Label.setForeground(new java.awt.Color(0,102,255));
            Page_1_Label.setFont(new java.awt.Font("Tahoma", 1, 24));
            Page_1_Label.setText("");
            Page_2_Label.setForeground(new java.awt.Color(255,255,255));
        }

        if (Directions1.getText() == "Edit") {
            jScrollPane1.getVerticalScrollBar().setValue(0);
            jLabel19.setIcon(new javax.swing.ImageIcon("C:\\Users\\Aayush\\Desktop\\TSA App Icons\\Calendar1-2.png"));
            Directions1.setText("Cancel");
        }
    }

    private void Directions3MouseReleased(java.awt.event.MouseEvent evt) {
        jScrollPane1.getVerticalScrollBar().setValue(0);
        LocalTime time1 = LocalTime.now();
        DateTimeFormatter time1Formatter = DateTimeFormatter.ofPattern("HH:mm");
        LocalDateTime time2 = LocalDateTime.now();
        DateTimeFormatter DayMonthFormatter = DateTimeFormatter.ofPattern("E, MMM dd yyyy");
        String a = String.valueOf(time1);
        String b = time1.format(time1Formatter);
        jLabel1.setText(b);
        String d = String.valueOf(time2);
        String e = time2.format(DayMonthFormatter);
        Time.setText(e);
        Map_Panel.setBackground(new java.awt.Color(0,102,0));
        Public_Transportation_Panel.setBackground(new java.awt.Color(0, 153, 0));
        Recreation_Panel.setBackground(new java.awt.Color(0, 153, 0));
        Food_Panel.setBackground(new java.awt.Color(0, 153, 0));
        Shopping_Panel.setBackground(new java.awt.Color(0, 153, 0));
        Calendar_Panel.setBackground(new java.awt.Color(0, 153, 0));
        About_Panel.setBackground(new java.awt.Color(0,153,0));
        Schools_Panel.setBackground(new java.awt.Color(0,153,0));
        Weather_Panel.setBackground(new java.awt.Color(0,153,0));
        jPanel3.setBackground(new java.awt.Color(0, 153, 0));
        jLabel18.setText("LimeBike Locations");
        jLabel19.setText("");
        jLabel19.setIcon(new javax.swing.ImageIcon("C:\\Users\\Aayush\\Desktop\\TSA App Icons\\LimeBike_Locations2.png"));
        jLabel20.setText("");
        Step2.setText("");
        Step3.setText("");
        Step4.setText("");
        Step5.setText("");
        Step6.setText("");
        Step7.setText("");
        jLabel21.setText("");
        jLabel22.setText("");
        jLabel23.setText("");
        jLabel24.setText("");
        jLabel25.setText("");
        jLabel26.setText("");
        jLabel27.setText("");
        When1.setText("");
        Cost1.setText("");
        Cost2.setText("");
        Cost3.setText("");
        When2.setText("");
        When3.setText("");
        Where1.setText("");
        Where2.setText("");
        Where3.setText("");
        Directions1.setText("");
        Directions2.setText("");
        Directions3.setText("");
        Transportation1.setText("");
        Transportation2.setText("");
        Transportation3.setText("");
        jLabel25.setIcon(new javax.swing.ImageIcon());
        jLabel26.setIcon(new javax.swing.ImageIcon());
        jLabel27.setIcon(new javax.swing.ImageIcon());
        Page_Label.setForeground(new java.awt.Color(255,255,255));
        Page_Line.setForeground(new java.awt.Color(255,255,255));
        Page_1_Label.setForeground(new java.awt.Color(255,255,255));
        Page_1_Label.setText("");
        Page_2_Label.setForeground(new java.awt.Color(255,255,255));
        jScrollPane1.getVerticalScrollBar().setValue(0);
    }

    private void Transportation1MouseReleased(java.awt.event.MouseEvent evt) {
        if (Transportation1.getText() == "Transportation") {
            Transportation1.setText("");
            Transportation2.setText("");
            Transportation3.setText("");
            jScrollPane1.getVerticalScrollBar().setValue(310);
            LocalTime time1 = LocalTime.now();
            DateTimeFormatter time1Formatter = DateTimeFormatter.ofPattern("HH:mm");
            LocalDateTime time2 = LocalDateTime.now();
            DateTimeFormatter DayMonthFormatter = DateTimeFormatter.ofPattern("E, MMM dd yyyy");
            String a = String.valueOf(time1);
            String b = time1.format(time1Formatter);
            jLabel1.setText(b);
            String d = String.valueOf(time2);
            String e = time2.format(DayMonthFormatter);
            Time.setText(e);
            Public_Transportation_Panel.setBackground(new java.awt.Color(0,102,0));
            Map_Panel.setBackground(new java.awt.Color(0, 153, 0));
            Recreation_Panel.setBackground(new java.awt.Color(0, 153, 0));
            Food_Panel.setBackground(new java.awt.Color(0, 153, 0));
            Shopping_Panel.setBackground(new java.awt.Color(0, 153, 0));
            Calendar_Panel.setBackground(new java.awt.Color(0, 153, 0));
            About_Panel.setBackground(new java.awt.Color(0,153,0));
            Schools_Panel.setBackground(new java.awt.Color(0,153,0));
            Weather_Panel.setBackground(new java.awt.Color(0,153,0));
            jPanel3.setBackground(new java.awt.Color(0,153,0));
            jLabel18.setText("Transportation");
            jLabel19.setIcon(null);
            jLabel19.setText("Metuchen Train Station");
            jLabel20.setText("NJ transit station available to citizens at a low cost.");
            Step2.setText("");
            Step3.setText("");
            Step4.setText("");
            Step5.setText("");
            Step6.setText("");
            Step7.setText("");
            jLabel21.setText("NJ Transit Bus");
            jLabel22.setText("Buses allowing citizens to travel the city for a small fee.");
            jLabel23.setText("LimeBikes");
            jLabel24.setText("A 24/7 service where passengers can rent bikes to ride.");
            jLabel25.setText("");
            jLabel26.setText("");
            jLabel27.setText("");
            When1.setText("Woodbridge Avenue & Main Street, Metuchen, NJ");
            When2.setText("");
            When3.setText("");
            Where1.setText("");
            Where2.setText("");
            Where3.setText("");
            Cost1.setText("");
            Cost2.setText("");
            Cost3.setText("");
            Directions1.setText("Directions");
            Directions2.setText("Stops");
            Directions3.setText("Locations");
            Transportation1.setText("");
            Transportation2.setText("");
            Transportation3.setText("");
            jLabel25.setIcon(new javax.swing.ImageIcon("C:\\Users\\Aayush\\Desktop\\TSA App Icons\\Train_Station2.jpg"));
            jLabel26.setIcon(new javax.swing.ImageIcon("C:\\Users\\Aayush\\Desktop\\TSA App Icons\\Transit_Bus.jpg"));
            jLabel27.setIcon(new javax.swing.ImageIcon("C:\\Users\\Aayush\\Desktop\\TSA App Icons\\LimeBike2.jpg"));
            Page_1_Label.setForeground(new java.awt.Color(255,255,255));
            Page_2_Label.setForeground(new java.awt.Color(255,255,255));
            Page_Label.setForeground(new java.awt.Color(255,255,255));
            Page_Line.setForeground(new java.awt.Color(255,255,255));
        }
        if (Transportation1.getText() == "Create") {
            jScrollPane1.getVerticalScrollBar().setValue(0);
            jLabel19.setIcon(new javax.swing.ImageIcon("C:\\Users\\Aayush\\Desktop\\TSA App Icons\\Calendar2-2.png"));
            Calendar1.setVisible(false);
            Calendar2.setVisible(false);
            Calendar3.setVisible(false);
            Directions1.setText("Edit");
            Transportation1.setText("");
            Step2.setText("");
            Step3.setText("");
            Step4.setText("");
        }

    }

    private void Chat_RoomMouseReleased(java.awt.event.MouseEvent evt) {
        jScrollPane1.getVerticalScrollBar().setValue(0);
        LocalTime time1 = LocalTime.now();
        DateTimeFormatter time1Formatter = DateTimeFormatter.ofPattern("HH:mm");
        LocalDateTime time2 = LocalDateTime.now();
        DateTimeFormatter DayMonthFormatter = DateTimeFormatter.ofPattern("E, MMM dd yyyy");
        String a = String.valueOf(time1);
        String b = time1.format(time1Formatter);
        jLabel1.setText(b);
        String d = String.valueOf(time2);
        String e = time2.format(DayMonthFormatter);
        Time.setText(e);
        jLabel18.setText("Chat Room");
        jLabel19.setIcon(null);
        jLabel19.setForeground(new java.awt.Color(0,102,255));
        jLabel19.setText("John Doe");
        jLabel20.setText("JD: Hey how have you been?");
        Step2.setText("");
        Step3.setText("");
        Step4.setText("");
        Step5.setText("");
        Step6.setText("");
        Step7.setText("");
        jLabel21.setText("Mary Smith");
        jLabel22.setText("You: Wanna catch up later?");
        jLabel23.setText("");
        jLabel24.setText("");
        jLabel25.setText("");
        jLabel26.setText("");
        jLabel27.setText("");
        When1.setText("");
        When2.setText("");
        When3.setText("");
        Where1.setText("");
        Where2.setText("");
        Where3.setText("");
        Cost1.setText("");
        Cost2.setText("");
        Cost3.setText("");
        Directions1.setText("");
        Directions2.setText("");
        Directions3.setText("");
        Transportation1.setText("");
        Transportation2.setText("");
        Transportation3.setText("");
        Hours1.setForeground(new java.awt.Color(255,255,255));
        Hours2.setForeground(new java.awt.Color(255,255,255));
        Hours3.setForeground(new java.awt.Color(255,255,255));
        Add_Chat.setIcon(new javax.swing.ImageIcon("C:\\Users\\Aayush\\Desktop\\TSA App Icons\\icons8_plus_30px_1.png"));
        jLabel25.setText("12:05 AM");
        jLabel26.setText("Yesterday");
        jLabel25.setIcon(new javax.swing.ImageIcon("C:\\Users\\Aayush\\Desktop\\TSA App Icons\\icons8_collapse_arrow_30px.png"));
        jLabel26.setIcon(new javax.swing.ImageIcon("C:\\Users\\Aayush\\Desktop\\TSA App Icons\\icons8_collapse_arrow_30px.png"));
        jLabel27.setIcon(null);
        Page_Label.setForeground(new java.awt.Color(255,255,255));
        Page_Line.setForeground(new java.awt.Color(255,255,255));
        Page_1_Label.setForeground(new java.awt.Color(255,255,255));
        Page_2_Label.setForeground(new java.awt.Color(255,255,255));
            jPanel3.setBackground(new java.awt.Color(0, 153, 0));
            Public_Transportation_Panel.setBackground(new java.awt.Color(0, 153, 0));
            Map_Panel.setBackground(new java.awt.Color(0, 153, 0));
            Recreation_Panel.setBackground(new java.awt.Color(0, 153, 0));
            Food_Panel.setBackground(new java.awt.Color(0, 153, 0));
            Shopping_Panel.setBackground(new java.awt.Color(0, 153, 0));
            Calendar_Panel.setBackground(new java.awt.Color(0, 153, 0));
            Weather_Panel.setBackground(new java.awt.Color(0,153,0));
            About_Panel.setBackground(new java.awt.Color(0,153,0));
            Schools_Panel.setBackground(new java.awt.Color(0,153,0));
    }

    private void jLabel19MouseReleased(java.awt.event.MouseEvent evt) {
        jScrollPane1.getVerticalScrollBar().setValue(325);
        Transportation1.setText("Create");
        Step2.setText("Event");
        Step2.setForeground(new java.awt.Color(0,0,0));
        Step3.setText("When?");
        Step4.setText("Where?");
        Calendar1.setVisible(true);
        Calendar2.setVisible(true);
        Calendar3.setVisible(true);
    }

    //Main Method
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(App_Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(App_Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(App_Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(App_Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new App_Home().setVisible(true);
            }
        });
    }

    //Variables declaration
    private javax.swing.JLabel About_Icon;
    private javax.swing.JPanel About_Panel;
    private javax.swing.JLabel About_Word;
    private javax.swing.JLabel App_Name;
    private javax.swing.JLabel Calendar_Icon;
    private javax.swing.JPanel Calendar_Panel;
    private javax.swing.JLabel Calendar_Word;
    private javax.swing.JLabel Close_Button;
    private javax.swing.JLabel Chat_Room;
    private javax.swing.JLabel Food_Icon;
    private javax.swing.JPanel Food_Panel;
    private javax.swing.JLabel Food_Word;
    private javax.swing.JLabel Map_Icon;
    private javax.swing.JPanel Map_Panel;
    private javax.swing.JLabel Map_Word;
    private javax.swing.JLabel Menu_Icon;
    private javax.swing.JLabel Page_Label;
    private javax.swing.JLabel Page_1_Label;
    private javax.swing.JLabel Page_2_Label;
    private javax.swing.JLabel Page_Line;
    private javax.swing.JLabel Hours1;
    private javax.swing.JLabel Hours2;
    private javax.swing.JLabel Hours3;
    private javax.swing.JLabel Public_Tansportation_Icon;
    private javax.swing.JPanel Public_Transportation_Panel;
    private javax.swing.JLabel Public_Transportation_Word;
    private javax.swing.JLabel Recreation_Icon;
    private javax.swing.JPanel Recreation_Panel;
    private javax.swing.JLabel Recreation_Word;
    private javax.swing.JLabel Schools_Icon;
    private javax.swing.JPanel Schools_Panel;
    private javax.swing.JLabel Schools_Word;
    private javax.swing.JLabel Shopping_Icon;
    private javax.swing.JPanel Shopping_Panel;
    private javax.swing.JLabel Shopping_Word;
    private javax.swing.JLabel Time;
    private javax.swing.JLabel Weather_Icon;
    private javax.swing.JPanel Weather_Panel;
    private javax.swing.JLabel Weather_Temperature;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel Add_Chat;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel When1;
    private javax.swing.JLabel When2;
    private javax.swing.JLabel When3;
    private javax.swing.JLabel Where1;
    private javax.swing.JLabel Where2;
    private javax.swing.JLabel Where3;
    private javax.swing.JLabel Cost1;
    private javax.swing.JLabel Cost2;
    private javax.swing.JLabel Cost3;
    private javax.swing.JLabel Directions1;
    private javax.swing.JLabel Directions2;
    private javax.swing.JLabel Directions3;
    private javax.swing.JLabel Transportation1;
    private javax.swing.JLabel Transportation2;
    private javax.swing.JLabel Transportation3;
    private javax.swing.JLabel Step2;
    private javax.swing.JLabel Step3;
    private javax.swing.JLabel Step4;
    private javax.swing.JLabel Step5;
    private javax.swing.JLabel Step6;
    private javax.swing.JLabel Step7;
    private javax.swing.JLabel About2;
    private javax.swing.JLabel About3;
    private javax.swing.JLabel About4;
    private javax.swing.JLabel AboutPic1;
    private javax.swing.JLabel AboutPic2;
    private javax.swing.JLabel AboutPic3;
    private javax.swing.JLabel AboutPic4;
    private javax.swing.JLabel AboutPic5;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField Calendar1;
    private javax.swing.JTextField Calendar2;
    private javax.swing.JTextField Calendar3;
    // End of variables declaration
}
