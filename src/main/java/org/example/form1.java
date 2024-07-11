package org.example;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class form1 {
    private JTextField nombre;
    private JTextField apellido;
    private JTextField cedula;
    private JTextField edad;
    private JTextField email;
    private JTextField telefono;
    public JPanel mainPanel;
    private JButton ingresarDatos;


    public form1() {

        ingresarDatos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {

                    String nombreText = nombre.getText();
                    String cedulaText = cedula.getText();
                    int edadText = Integer.parseInt(edad.getText());
                    String apellidoText = apellido.getText();
                    String telefonoText = telefono.getText();
                    String correoText = email.getText();


                    Estudiante estudiante = new Estudiante(nombreText,cedulaText,edadText,apellidoText,telefonoText,correoText);

                    JOptionPane.showMessageDialog(mainPanel, estudiante.toString(), "Datos Ingresados", JOptionPane.INFORMATION_MESSAGE);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(mainPanel, "Por favor, ingrese una edad válida.", "Error", JOptionPane.ERROR_MESSAGE);
                }

            }
        });
    }
}
