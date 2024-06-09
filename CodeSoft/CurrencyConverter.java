

import javax.swing.*;
import java.awt.event.*;

public class CurrencyConverter extends javax.swing.JFrame {
    double US_Dollar = 1.161;
    double Nigerian_Naira = 476.57;
    double Brazilian_Real = 5.47;
    double Canadian_Dollar = 1.71;
    double Kenyan_Shilling = 132.53;
    double Indonesian_Rupiah = 19554.94;
    double Indian_Rupee = 96.21;
    double Philippine_Peso = 71.17;
    double Pakistani_Rupee = 162.74;

    String[] currencyUnits = {
            "units",
            "US Dollar ($)",
            "Nigerian Naira (\u20A6)",
            "Brazilian Real (R$)",
            "Canadian Dollar (can$)",
            "Kenyan Shilling (/=)",
            "Indonesian Rupiah (Rp)",
            "Indian Rupee (\u20B9)",
            "Philippine Peso (\u20B1)",
            "Pakistani Rupee (\u20A8)"
    };

    public CurrencyConverter() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        firstCountry = new javax.swing.JComboBox<>();
        secondCountry = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        t2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        secondCurrencyUnit = new javax.swing.JLabel();
        firstCurrencyUnit = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 153, 255), 5));
        jLabel1.setFont(new java.awt.Font("Tahoma", java.awt.Font.BOLD, 18));
        jLabel1.setText("Currency Converter");

        firstCountry.setFont(new java.awt.Font("Tahoma", java.awt.Font.BOLD, 18));
        firstCountry.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Choose One...", "USA", "Nigeria", "Brazil", "Canada", "Kenyan", "Indonesia", "India", "Philippine", "Pakistan"}));
        firstCountry.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                firstCountryItemStateChanged(evt);
            }
        });

        secondCountry.setFont(new java.awt.Font("Tahoma", java.awt.Font.BOLD, 18));
        secondCountry.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Choose One...", "USA", "Nigeria", "Brazil", "Canada", "Kenyan", "Indonesia", "India", "Philippine", "Pakistan"}));
        secondCountry.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                secondCountryItemStateChanged(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", java.awt.Font.BOLD, 14));
        jLabel2.setText("From currency Of");

        jLabel3.setFont(new java.awt.Font("Tahoma", java.awt.Font.BOLD, 14));
        jLabel3.setText("To currency Of");

        t1.setFont(new java.awt.Font("Tahoma", java.awt.Font.BOLD, 14));

        t2.setFont(new java.awt.Font("Tahoma", java.awt.Font.BOLD, 14));

        jButton1.setFont(new java.awt.Font("Tahoma", java.awt.Font.BOLD, 18));
        jButton1.setText("Convert Currency");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", java.awt.Font.BOLD, 18));
        jButton2.setText("Reset");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", java.awt.Font.BOLD, 18));
        jButton3.setText("Exit");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        secondCurrencyUnit.setFont(new java.awt.Font("Tahoma", java.awt.Font.BOLD, 14));
        secondCurrencyUnit.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        secondCurrencyUnit.setText("units");

        firstCurrencyUnit.setFont(new java.awt.Font("Tahoma", java.awt.Font.BOLD, 14));
        firstCurrencyUnit.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        firstCurrencyUnit.setText("units");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addGap(93, 93, 93))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(93, 93, 93)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jButton1)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(firstCountry, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(t1))
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(firstCurrencyUnit, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(secondCountry, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(t2))
                                        .addComponent(secondCurrencyUnit, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(114, 114, 114))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(jButton2)
                                .addGap(94, 94, 94)
                                .addComponent(jButton3)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1)
                                .addGap(28, 28, 28)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(firstCountry, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(secondCountry, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(secondCurrencyUnit, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(firstCurrencyUnit, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(23, 23, 23)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButton1)
                                        .addComponent(jButton2)
                                        .addComponent(jButton3))
                                .addContainerGap(57, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(38, 38, 38))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );

        pack();
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        double amountToChange = Double.parseDouble(t1.getText());
        double amountInPounds = 0.0;
        double amountChanged = 0.0;

        switch (firstCountry.getSelectedItem().toString()) {
            case "USA":
                amountInPounds = amountToChange / US_Dollar;
                break;
            case "Nigeria":
                amountInPounds = amountToChange / Nigerian_Naira;
                break;
            case "Brazil":
                amountInPounds = amountToChange / Brazilian_Real;
                break;
            case "Canada":
                amountInPounds = amountToChange / Canadian_Dollar;
                break;
            case "Kenyan":
                amountInPounds = amountToChange / Kenyan_Shilling;
                break;
            case "Indonesia":
                amountInPounds = amountToChange / Indonesian_Rupiah;
                break;
            case "India":
                amountInPounds = amountToChange / Indian_Rupee;
                break;
            case "Philippine":
                amountInPounds = amountToChange / Philippine_Peso;
                break;
            case "Pakistan":
                amountInPounds = amountToChange / Pakistani_Rupee;
                break;
            default:
                amountInPounds = 0.0;
        }

        switch (secondCountry.getSelectedItem().toString()) {
            case "USA":
                amountChanged = amountInPounds * US_Dollar;
                break;
            case "Nigeria":
                amountChanged = amountInPounds * Nigerian_Naira;
                break;
            case "Brazil":
                amountChanged = amountInPounds * Brazilian_Real;
                break;
            case "Canada":
                amountChanged = amountInPounds * Canadian_Dollar;
                break;
            case "Kenyan":
                amountChanged = amountInPounds * Kenyan_Shilling;
                break;
            case "Indonesia":
                amountChanged = amountInPounds * Indonesian_Rupiah;
                break;
            case "India":
                amountChanged = amountInPounds * Indian_Rupee;
                break;
            case "Philippine":
                amountChanged = amountInPounds * Philippine_Peso;
                break;
            case "Pakistan":
                amountChanged = amountInPounds * Pakistani_Rupee;
                break;
            default:
                amountChanged = amountInPounds * 0.0;
        }

        String value = String.format("%.2f", amountChanged);
        t2.setText(value);
    }

    private void firstCountryItemStateChanged(java.awt.event.ItemEvent evt) {
        int position = firstCountry.getSelectedIndex();
        firstCurrencyUnit.setText(currencyUnits[position]);
    }

    private void secondCountryItemStateChanged(java.awt.event.ItemEvent evt) {
        int position = secondCountry.getSelectedIndex();
        secondCurrencyUnit.setText(currencyUnits[position]);
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        firstCountry.setSelectedIndex(0);
        secondCountry.setSelectedIndex(0);
        t1.setText("");
        t2.setText("");
    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
        System.exit(0);
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CurrencyConverter().setVisible(true);
            }
        });
    }

    private javax.swing.JComboBox<String> firstCountry;
    private javax.swing.JLabel firstCurrencyUnit;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> secondCountry;
    private javax.swing.JLabel secondCurrencyUnit;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
}
