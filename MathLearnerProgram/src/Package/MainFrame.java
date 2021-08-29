/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Package;

/**
 *
 * @author kasmo
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
    }
    
    boolean btn1 = false;
    boolean btn2 = false;
    boolean btn3 = false;
    boolean btn4 = false;
    boolean btn5 = false;
    boolean btn6 = false;
    boolean intial_launch = false;
    int correct = 0;
    int wrong = 0;
    int min = 1;
    int max = 11;
    double curr_answer = 0;
    String response = "";
    //int rand = (int) (Math.random()*(max-min)) + min;
    
    String Q1 = "What is the Perimeter of a square with side length of 9.1 centimeters?";
    double A1 = 36.4;
    
    String Q2 = "What is the Perimeter of a rectangle with side lengths of 5.3cm and 32cm?";
    double A2 = 74.6;
    
    String Q3 = "What is the Perimeter of a triangle with side lengths of 11.3, 5.6, 1.1?";
    double A3 = 18;
    
    String Q4 = "What is the Area of a square with side length of 5 centimeters?";
    double A4 = 25;
    
    String Q5 = "What is the Area of a rectangle with side lengths of 10.3cm and 4cm?";
    double A5 = 41.2;
    
    String Q6 = "What is the Area of a triangle with a base of 4cm and height of 6cm?";
    double A6 = 24;
    
    String Q7 = "What is the Volume of a cube with side length of 8.5 centimeters?";
    double A7 = 614.125;
    
    String Q8 = "What is the Volume of a rectangular prism with side lengths of 5cm, 4cm, 7cm?";
    double A8 = 140;
    
    String Q9 = "What is the Area of a square which has a perimeter of 40?";
    double A9 = 100;
    
    String Q10 = "What is the Area of a right angle triangle where all sides are equal in length, given that the perimeter is 18cm?";
    double A10 = 18;
    
    String Intro = "Introduction to Perimeter, Area, and Volume!";
    String Intro_1 = "In this application, we will learn together what perimeter, area, and volume is! At the same time, we will learn how to find these things for squares, triangles, and rectangles.\n" +
            "\n" +
            "As you already know, we see what squares, triangles, and rectangles are. However, we will also learn cubes and rectangular prisms. Cubes are just squares with length, width, and height forming a 3D object with sides that have the same size, and same side lengths all the way around. Like cubes, rectangular prisms are cubes that are elongated or stretched on one side in comparison to a cube. Rectangular prisms must have a pair between length, height, and/or widths that are equal to each other but the alone measurement must have a different length shorter or larger.";
    String P_title_1 = "What is Perimeter?";
    String P_title_2 = "Perimeter in Depth";
    String Perimeter_1 = "At first, perimeter could be a very hard concept to understand as it seems all new. However, it is quite simple. Perimeter is essentially the “line” or “area” outside of an actual shape. Take for example you drew a shape, the line or lines that you drew to create that shape would be called the perimeter. The perimeter is then measured in any units applicable such as centimeter, meters, kilometers, and so fourth! The perimeter is essentially the sides, or the line(s) length added up.\n" +
            "\n" +
            "\n" +
            "Another example would be that if I drew a square with at least one of the sides being 4 centimeters, then the square would have a perimeter of 16 centimeters as the square has 4 sides and each side being 4 centimeters long. Thus, as there are 4 sides which are 4 centimeters each, it shows us that the perimeter is 4 sides times 4 centimeters long, which is 16 centimeters.\n" +
            "\n" +
            "In this section and the next, you will be learning how to use the formula to find the perimeter of a square, rectangle, and triangle! To make understanding easy, we will say P to denote Perimeter, and S to denote a side of a square. We will denote Side-1 and Side-2 to list the possible variants of a rectangle. Finally, we will list Side-1, Side-2, and Side-3 to list all possible lengths of a triangle. ";
    String Perimeter_2 = "Firstly, as you may have already picked up - we will learn how to find the perimeter of a square. To find the perimeter of a square, you simply have to find the side length of one side and multiply it by 4. Thus, making the formula P = 4 x S. Let’s do an example! If a square has a length of 10 centimeters then we can find the perimeter. P = 4 x S, but we know that S is 10. So, we then get, P = 4 x 10, getting P = 40 CM. Thus, the perimeter was 40 centimeters for this square.\n" +
            "\n" +
            "Secondly, we will learn how to find the perimeter of a rectangle. Like a square, a rectangle has 4 sides, with two pairs of matching lengths. So, we get a formula to find the perimeter of P = 2 x Side-1 + 2 x Side-2 as we just need to add one side twice, and the different length side twice, and add all together to get the perimeter. Let’s do an example here with a rectangle of side lengths 4 centimeters, and 2 centimeters. It doesn’t matter which length is Side-1 or Side-2, either way we get the same answer to find perimeter! Let’s set Side-1 as 4, and Side-2 as 2, so we get P = 2 x 4 + 2 x 2. Thus, we get P = 8 + 4, finally getting P = 12 CM. Getting 12 centimeters as the perimeter!\n" +
            "\n" +
            "Finally, we will learn how to find the perimeter of a triangle. Like a rectangle, a triangle can have different side lengths. But, a triangle can have up to 3 different lengths. So let’s set an example! Let’s say that Side-1 was 1 centimeter, Side-2 was 3 centimeters, and Side-3 was 5 centimeters. To find the Perimeter, we get the formula as P = Side-1 + Side-2 + Side-3 (You can set the side lengths anywhere and it will still work!). So, because we know the side-lengths, we get, P = 1 + 3 + 5, getting P = 9 centimeters as the Perimeter!";
    String A_title_1 = "What is Area?";
    String A_title_2 = "Area in Depth";
    String Area_1 = "Area is like a perimeter but expanded and a bit more harder to understand. As you know, Perimeter is like a 1D topic where we just follow and measure a line to add up and get the final result. Instead, area is the space inside a shape instead of something on a line. It is the 2D idea instead of the 1D with a line. Calculating this might seem hard, but is indeed quite easy. In addition, instead of being denoted with just centimeters or things alike at the end, it is seen to be given a ^2 at the end. For example, a square could have the area of 5 centimeter^2 (meaning squared). \n" +
            "\n" +
            "In this section and the next, you will be learning how to use the formulas to find the area of a square, rectangle, and triangle! To make understanding easy, we will say A to denote Area, and S to denote a side of a square. We will denote Side-1 and Side-2 to list the possible variants of a rectangle. Finally, we will list B, and H as base and height respectively of a triangle. We usually use length and width to find the area of these things.";
    String Area_2 = "Firstly, to find the Area of a Square, you need to see that the Formula is A = S x S. Why? This is because we know that the length of the side of the square is static. However, in order to find the area we simply spread the length out for however wide/lengthy the square is. We are essentially adding the side line for as many times the other side length is long getting the area in between. Let’s do an example: let’s say that a square has a side length of 3 centimeters, we see that the formula for area becomes A = 3 x 3, getting that A = 9 centimeters squared as the area of the square.\n" +
            "\n" +
            "Secondly, we will learn how to find the area of a rectangle. Like a square, we know that it’s instead stretched out from one side, where one side is longer/smaller than the other. However, using the logic we have used, we know that the Area formula is similar. We are just spreading a line as many times as how long another side is to find the inside, forming the area. Thus, we get the formula of A = Side-1 x Side-2. An example could be where we have a rectangle of side-length for Side-1 of 3 centimeters, and Side-2 of 5 centimeters. Thus, to find the area we get A = 3 x 5, getting A = 15 centimeters squared as the area of the rectangle.\n" +
            "\n" +
            "Finally, to find the area of a triangle is quite a strange take. Think about this, if you divide a square from 1 corner to the corner to the opposite of it, you get two triangles? Essentially, all you have to do is just get the side length of the square, get its area with A = S x S, and divide by two. However, we can do the same with a rectangle too. For the sake of this confusion, we will give the base and height. To find the formula, it would be A = (B x H) / 2 because it's just a rectangle/square cut in half from corner to corner once. Let’s do an example, let's say that the triangle we had had a base of 3 centimeters, and a height of 4 centimeters, we find that the Area of the Triangle would be A = (3 x 4) / 2, getting A = 12/2, finally achieving A = 6 centimeters squared as the area of the triangle.";
    String V_title_1 = "What is Volume?";
    String V_title_2 = "Volume in Depth";
    String Volume_1 = "Volume is easier to understand than Area because we literally see it everywhere, and sometimes accidentally talk about it. Volume is just the more complicated version of what we call space, like when we say “that room has tons of space!”, or “that bottle can fit a lot of water.” The space we are talking about is the emptiness of a 3D object, or how much space can something have in terms of the 3D world. Calculating Volume is not hard at all, and uses the same logic. Instead of spreading out a line in one direction a certain amount of times (forming a sheet), we can then spread that sheet for how tall an object is! We usually use length, width, and height to find the volumes of these things. In addition, instead of being denoted with just centimeters or things alike at the end, it is seen to be given a ^3 at the end. For example, a cube could have a volume of 5 centimeter^3 (meaning cubed). \n" +
            "\n" +
            "In this section and the next, you will be learning how to use the formulas to find the volume of a cube, and a rectangular prism. Now, to denote Volume, we will use V. To denote a side length of a cube, we will use S. To denote the lengths needed for a rectangular prism we will use length, width, and height or L, W, H respectively";
    String Volume_2 = "To find the volume for a Cube, you need to understand a few things. Again like in the area, we are stretching out a line as many times as long another side is. We now will call this a sheet. To find Volume in general, you need to find the area, and then spread it out for how tall an object might be. So, for a cube we then spread this sheet out. As we know, since the length, width, and height of a cube are all the same, we see that the formula is V = S x S x S. Let’s say we had a cube with a side length of 2 centimeters. We then see that the formula for volume is then V = 2 x 2 x 2, getting V = 8 centimeters^3 as the volume of the cube.\n" +
            "\n" +
            "To find the volume of a rectangular prism, it's almost the same as a cube but as you know it’s stretched out in one direction. We are making this sheet then spreading it out how long the height of the object is! We see now that the formula for a prism is V = L x W x H. Let’s make an example, let’s say we have a rectangular prism that has a length of 5 centimeters, width of 8 centimeters, and height of 10 centimeters. Thus, we get a formula of V = 5 x 8 x 10, getting V = 5 x 80 finally getting V = 400 centimeters^3 as the volume of the rectangular cube.";
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        IntroButton = new javax.swing.JButton();
        Perimeter1 = new javax.swing.JButton();
        Perimeter2 = new javax.swing.JButton();
        Area1 = new javax.swing.JButton();
        Area2 = new javax.swing.JButton();
        Volume1 = new javax.swing.JButton();
        Volume2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        MainArea = new javax.swing.JTextPane();
        Title = new javax.swing.JLabel();
        Question = new javax.swing.JLabel();
        Submit = new javax.swing.JButton();
        Submission = new javax.swing.JTextField();
        Correct_Text = new javax.swing.JLabel();
        Wrong_Text = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        IntroButton.setText("Introduction");
        IntroButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IntroButtonActionPerformed(evt);
            }
        });

        Perimeter1.setText("What is Perimeter?");
        Perimeter1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Perimeter1ActionPerformed(evt);
            }
        });

        Perimeter2.setText("Perimeter in Depth");
        Perimeter2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Perimeter2ActionPerformed(evt);
            }
        });

        Area1.setText("What is Area?");
        Area1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Area1ActionPerformed(evt);
            }
        });

        Area2.setText("Area in Depth");
        Area2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Area2ActionPerformed(evt);
            }
        });

        Volume1.setText("What is Volume?");
        Volume1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Volume1ActionPerformed(evt);
            }
        });

        Volume2.setText("Volume in Depth");
        Volume2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Volume2ActionPerformed(evt);
            }
        });

        MainArea.setEditable(false);
        MainArea.setText("In this application, we will learn together what perimeter, area, and volume is! At the same time, we will learn how to find these things for squares, triangles, and rectangles.\n\nAs you already know, we see what squares, triangles, and rectangles are. However, we will also learn cubes and rectangular prisms. Cubes are just squares with length, width, and height forming a 3D object with sides that have the same size, and same side lengths all the way around. Like cubes, rectangular prisms are cubes that are elongated or stretched on one side in comparison to a cube. Rectangular prisms must have a pair between length, height, and/or widths that are equal to each other but the alone measurement must have a different length shorter or larger.");
        MainArea.setAutoscrolls(false);
        jScrollPane1.setViewportView(MainArea);

        Title.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title.setText("Introduction to Perimeter, Area, and Volume!");

        Question.setText("This Will Section Here Will Test You Later After Learning Everything!");

        Submit.setText("Submit");
        Submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitActionPerformed(evt);
            }
        });
        Submit.setVisible(false);

        Submission.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmissionActionPerformed(evt);
            }
        });
        Submission.setVisible(false);

        Correct_Text.setText("Correct Answers: 0");
        Correct_Text.setVisible(false);

        Wrong_Text.setText("Wrong Answers: 0");
        Wrong_Text.setVisible(false);

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, 878, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Correct_Text)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(Volume2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Volume1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Area2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Area1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Perimeter2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Perimeter1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(IntroButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(85, 85, 85)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 521, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(68, 68, 68))))
            .addGroup(layout.createSequentialGroup()
                .addGap(241, 241, 241)
                .addComponent(Question)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(382, 382, 382)
                .addComponent(Submission, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Wrong_Text)
                .addGap(101, 101, 101))
            .addGroup(layout.createSequentialGroup()
                .addGap(395, 395, 395)
                .addComponent(Submit)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(Title)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(IntroButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Perimeter1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Perimeter2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Area1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Area2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Volume1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Volume2)))
                .addGap(32, 32, 32)
                .addComponent(Question)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Submission, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Correct_Text)
                    .addComponent(Wrong_Text))
                .addGap(18, 18, 18)
                .addComponent(Submit)
                .addContainerGap(101, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void IntroButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IntroButtonActionPerformed
        if (btn1 && btn2 && btn3 && btn4 && btn5 && btn6) {
            Submit.setVisible(true);
            Submission.setVisible(true);
            Correct_Text.setVisible(true);
            Wrong_Text.setVisible(true);
            if (!intial_launch) {
                intial_launch = true;
                int rand = (int) (Math.random()*(max-min)) + min;
                if (rand == 1) {
                    Question.setText(Q1);
                    curr_answer = A1;
                } else if (rand == 2) {
                    Question.setText(Q2);
                    curr_answer = A2;
                } else if (rand == 3) {
                    Question.setText(Q3);
                    curr_answer = A3;
                } else if (rand == 4) {
                    Question.setText(Q4);
                    curr_answer = A4;
                } else if (rand == 5) {
                    Question.setText(Q5);
                    curr_answer = A5;
                } else if (rand == 6) {
                    Question.setText(Q6);
                    curr_answer = A6;
                } else if (rand == 7) {
                    Question.setText(Q7);
                    curr_answer = A7;
                } else if (rand == 8) {
                    Question.setText(Q8);
                    curr_answer = A8;
                } else if (rand == 9) {
                    Question.setText(Q9);
                    curr_answer = A9;
                } else if (rand == 10) {
                    Question.setText(Q10);
                    curr_answer = A10;
                }
            }
        }
        MainArea.setEditable(false);
        Title.setText(Intro);
        MainArea.setText(Intro_1);
    }//GEN-LAST:event_IntroButtonActionPerformed

    private void Perimeter1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Perimeter1ActionPerformed
        if (!btn1) {
            btn1 = true;
        }
        if (btn1 && btn2 && btn3 && btn4 && btn5 && btn6) {
            Submit.setVisible(true);
            Submission.setVisible(true);
            Correct_Text.setVisible(true);
            Wrong_Text.setVisible(true);
            if (!intial_launch) {
                intial_launch = true;
                int rand = (int) (Math.random()*(max-min)) + min;
                if (rand == 1) {
                    Question.setText(Q1);
                    curr_answer = A1;
                } else if (rand == 2) {
                    Question.setText(Q2);
                    curr_answer = A2;
                } else if (rand == 3) {
                    Question.setText(Q3);
                    curr_answer = A3;
                } else if (rand == 4) {
                    Question.setText(Q4);
                    curr_answer = A4;
                } else if (rand == 5) {
                    Question.setText(Q5);
                    curr_answer = A5;
                } else if (rand == 6) {
                    Question.setText(Q6);
                    curr_answer = A6;
                } else if (rand == 7) {
                    Question.setText(Q7);
                    curr_answer = A7;
                } else if (rand == 8) {
                    Question.setText(Q8);
                    curr_answer = A8;
                } else if (rand == 9) {
                    Question.setText(Q9);
                    curr_answer = A9;
                } else if (rand == 10) {
                    Question.setText(Q10);
                    curr_answer = A10;
                }
            }
        }
        MainArea.setEditable(false);
        Title.setText(P_title_1);
        MainArea.setText(Perimeter_1);
    }//GEN-LAST:event_Perimeter1ActionPerformed

    private void Perimeter2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Perimeter2ActionPerformed
        if (!btn2) {
            btn2 = true;
        }
        if (btn1 && btn2 && btn3 && btn4 && btn5 && btn6) {
            Submit.setVisible(true);
            Submission.setVisible(true);
            Correct_Text.setVisible(true);
            Wrong_Text.setVisible(true);
            if (!intial_launch) {
                intial_launch = true;
                int rand = (int) (Math.random()*(max-min)) + min;
                if (rand == 1) {
                    Question.setText(Q1);
                    curr_answer = A1;
                } else if (rand == 2) {
                    Question.setText(Q2);
                    curr_answer = A2;
                } else if (rand == 3) {
                    Question.setText(Q3);
                    curr_answer = A3;
                } else if (rand == 4) {
                    Question.setText(Q4);
                    curr_answer = A4;
                } else if (rand == 5) {
                    Question.setText(Q5);
                    curr_answer = A5;
                } else if (rand == 6) {
                    Question.setText(Q6);
                    curr_answer = A6;
                } else if (rand == 7) {
                    Question.setText(Q7);
                    curr_answer = A7;
                } else if (rand == 8) {
                    Question.setText(Q8);
                    curr_answer = A8;
                } else if (rand == 9) {
                    Question.setText(Q9);
                    curr_answer = A9;
                } else if (rand == 10) {
                    Question.setText(Q10);
                    curr_answer = A10;
                }
            }
        }
        MainArea.setEditable(false);
        Title.setText(P_title_2);
        MainArea.setText(Perimeter_2);
    }//GEN-LAST:event_Perimeter2ActionPerformed

    private void Area1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Area1ActionPerformed
        if (!btn3) {
            btn3 = true;
        }
        if (btn1 && btn2 && btn3 && btn4 && btn5 && btn6) {
            Submit.setVisible(true);
            Submission.setVisible(true);
            Correct_Text.setVisible(true);
            Wrong_Text.setVisible(true);
            if (!intial_launch) {
                intial_launch = true;
                int rand = (int) (Math.random()*(max-min)) + min;
                if (rand == 1) {
                    Question.setText(Q1);
                    curr_answer = A1;
                } else if (rand == 2) {
                    Question.setText(Q2);
                    curr_answer = A2;
                } else if (rand == 3) {
                    Question.setText(Q3);
                    curr_answer = A3;
                } else if (rand == 4) {
                    Question.setText(Q4);
                    curr_answer = A4;
                } else if (rand == 5) {
                    Question.setText(Q5);
                    curr_answer = A5;
                } else if (rand == 6) {
                    Question.setText(Q6);
                    curr_answer = A6;
                } else if (rand == 7) {
                    Question.setText(Q7);
                    curr_answer = A7;
                } else if (rand == 8) {
                    Question.setText(Q8);
                    curr_answer = A8;
                } else if (rand == 9) {
                    Question.setText(Q9);
                    curr_answer = A9;
                } else if (rand == 10) {
                    Question.setText(Q10);
                    curr_answer = A10;
                }
            }
        }
        Title.setText(A_title_1);
        MainArea.setText(Area_1);
    }//GEN-LAST:event_Area1ActionPerformed

    private void Area2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Area2ActionPerformed
        if (!btn4) {
            btn4 = true;
        }
        if (btn1 && btn2 && btn3 && btn4 && btn5 && btn6) {
            Submit.setVisible(true);
            Submission.setVisible(true);
            Correct_Text.setVisible(true);
            Wrong_Text.setVisible(true);
            if (!intial_launch) {
                intial_launch = true;
                int rand = (int) (Math.random()*(max-min)) + min;
                if (rand == 1) {
                    Question.setText(Q1);
                    curr_answer = A1;
                } else if (rand == 2) {
                    Question.setText(Q2);
                    curr_answer = A2;
                } else if (rand == 3) {
                    Question.setText(Q3);
                    curr_answer = A3;
                } else if (rand == 4) {
                    Question.setText(Q4);
                    curr_answer = A4;
                } else if (rand == 5) {
                    Question.setText(Q5);
                    curr_answer = A5;
                } else if (rand == 6) {
                    Question.setText(Q6);
                    curr_answer = A6;
                } else if (rand == 7) {
                    Question.setText(Q7);
                    curr_answer = A7;
                } else if (rand == 8) {
                    Question.setText(Q8);
                    curr_answer = A8;
                } else if (rand == 9) {
                    Question.setText(Q9);
                    curr_answer = A9;
                } else if (rand == 10) {
                    Question.setText(Q10);
                    curr_answer = A10;
                }
            }
        }
        MainArea.setEditable(false);
        Title.setText(A_title_2);
        MainArea.setText(Area_2);
    }//GEN-LAST:event_Area2ActionPerformed

    private void Volume1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Volume1ActionPerformed
        if (!btn5) {
            btn5 = true;
        }
        if (btn1 && btn2 && btn3 && btn4 && btn5 && btn6) {
            Submit.setVisible(true);
            Submission.setVisible(true);
            Correct_Text.setVisible(true);
            Wrong_Text.setVisible(true);
            if (!intial_launch) {
                intial_launch = true;
                int rand = (int) (Math.random()*(max-min)) + min;
                if (rand == 1) {
                    Question.setText(Q1);
                    curr_answer = A1;
                } else if (rand == 2) {
                    Question.setText(Q2);
                    curr_answer = A2;
                } else if (rand == 3) {
                    Question.setText(Q3);
                    curr_answer = A3;
                } else if (rand == 4) {
                    Question.setText(Q4);
                    curr_answer = A4;
                } else if (rand == 5) {
                    Question.setText(Q5);
                    curr_answer = A5;
                } else if (rand == 6) {
                    Question.setText(Q6);
                    curr_answer = A6;
                } else if (rand == 7) {
                    Question.setText(Q7);
                    curr_answer = A7;
                } else if (rand == 8) {
                    Question.setText(Q8);
                    curr_answer = A8;
                } else if (rand == 9) {
                    Question.setText(Q9);
                    curr_answer = A9;
                } else if (rand == 10) {
                    Question.setText(Q10);
                    curr_answer = A10;
                }
            }
        }
        MainArea.setEditable(false);
        Title.setText(V_title_1);
        MainArea.setText(Volume_1);
    }//GEN-LAST:event_Volume1ActionPerformed

    private void Volume2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Volume2ActionPerformed
        if (!btn6) {
            btn6 = true;
        }
        if (btn1 && btn2 && btn3 && btn4 && btn5 && btn6) {
            Submit.setVisible(true);
            Submission.setVisible(true);
            Correct_Text.setVisible(true);
            Wrong_Text.setVisible(true);
            if (!intial_launch) {
                intial_launch = true;
                int rand = (int) (Math.random()*(max-min)) + min;
                if (rand == 1) {
                    Question.setText(Q1);
                    curr_answer = A1;
                } else if (rand == 2) {
                    Question.setText(Q2);
                    curr_answer = A2;
                } else if (rand == 3) {
                    Question.setText(Q3);
                    curr_answer = A3;
                } else if (rand == 4) {
                    Question.setText(Q4);
                    curr_answer = A4;
                } else if (rand == 5) {
                    Question.setText(Q5);
                    curr_answer = A5;
                } else if (rand == 6) {
                    Question.setText(Q6);
                    curr_answer = A6;
                } else if (rand == 7) {
                    Question.setText(Q7);
                    curr_answer = A7;
                } else if (rand == 8) {
                    Question.setText(Q8);
                    curr_answer = A8;
                } else if (rand == 9) {
                    Question.setText(Q9);
                    curr_answer = A9;
                } else if (rand == 10) {
                    Question.setText(Q10);
                    curr_answer = A10;
                }
            }
        }
        MainArea.setEditable(false);
        Title.setText(V_title_2);
        MainArea.setText(Volume_2);
    }//GEN-LAST:event_Volume2ActionPerformed

    private void SubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitActionPerformed
        response = Submission.getText();
        double response_convert = Double.parseDouble(response);
        if (response_convert == curr_answer) {
            correct++;
            int rand = (int) (Math.random()*(max-min)) + min;
                if (rand == 1) {
                    Question.setText(Q1);
                    curr_answer = A1;
                } else if (rand == 2) {
                    Question.setText(Q2);
                    curr_answer = A2;
                } else if (rand == 3) {
                    Question.setText(Q3);
                    curr_answer = A3;
                } else if (rand == 4) {
                    Question.setText(Q4);
                    curr_answer = A4;
                } else if (rand == 5) {
                    Question.setText(Q5);
                    curr_answer = A5;
                } else if (rand == 6) {
                    Question.setText(Q6);
                    curr_answer = A6;
                } else if (rand == 7) {
                    Question.setText(Q7);
                    curr_answer = A7;
                } else if (rand == 8) {
                    Question.setText(Q8);
                    curr_answer = A8;
                } else if (rand == 9) {
                    Question.setText(Q9);
                    curr_answer = A9;
                } else if (rand == 10) {
                    Question.setText(Q10);
                    curr_answer = A10;
                }
        } else {
            wrong++;
        }
        Correct_Text.setText("Correct Answers: " + correct);
        Wrong_Text.setText("Wrong Answers: " + wrong);
        Submission.setText("");
        
    }//GEN-LAST:event_SubmitActionPerformed

    private void SubmissionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmissionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SubmissionActionPerformed

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
    private javax.swing.JButton Area1;
    private javax.swing.JButton Area2;
    private javax.swing.JLabel Correct_Text;
    private javax.swing.JButton IntroButton;
    private javax.swing.JTextPane MainArea;
    private javax.swing.JButton Perimeter1;
    private javax.swing.JButton Perimeter2;
    private javax.swing.JLabel Question;
    private javax.swing.JTextField Submission;
    private javax.swing.JButton Submit;
    private javax.swing.JLabel Title;
    private javax.swing.JButton Volume1;
    private javax.swing.JButton Volume2;
    private javax.swing.JLabel Wrong_Text;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
