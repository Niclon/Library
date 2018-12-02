package com.vis.LibraryApp;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.vis.LibraryApp.dto.jsomMappers.CustomerJsonDto;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class LibraryApp {
    private JTabbedPane tabbedPane1;
    private JButton hledejButton;
    private JTextField seachfield;
    private JLabel namefield;
    private JLabel surnamefield;
    private JLabel emailfield;
    private JLabel loginfield;
    private JButton givebackbookButton;
    private JButton orderHistoryButton;
    private JButton managingDebtsButton;
    private JButton managingAccountButton;
    private JTable table1;
    private JLabel idfield;
    private JPanel customerTab;
    private JPanel bookTab;

    //    user@gmail.com
    private static String ERROR_MESSAGE_USER_NOT_FOUND = "Email je buď zadán špatně nebo uživatel neexistuje";


    public LibraryApp() {

        hledejButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ObjectMapper mapper = new ObjectMapper();
                CustomerJsonDto customerJsonDto = null;
                boolean isEmpty =true;
                try {
                    HttpClient client = new DefaultHttpClient();
                    HttpGet get = new HttpGet("http://localhost:8090/getcustomerdetail/"+seachfield.getText());
                    HttpResponse response = client.execute(get);
                    BufferedReader rd = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
                    String line = "";
                    while ((line = rd.readLine()) != null) {
                        customerJsonDto = mapper.readValue(line,CustomerJsonDto.class);
                        isEmpty=false;
                    }

                }catch (Exception e1){
                    System.out.println(e1);
                }
                if (isEmpty){
                    showErrorMessage(ERROR_MESSAGE_USER_NOT_FOUND);
                } else {
                    setCustomerDetail(customerJsonDto);
                }
            }
        });
        managingDebtsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
    public static void main(String[] args){
        JFrame frame = new JFrame("LibraryApp");
        frame.setContentPane(new LibraryApp().tabbedPane1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public void showErrorMessage(String message){
        JOptionPane.showMessageDialog(new JFrame(), message, "Dialog",
                JOptionPane.ERROR_MESSAGE);

    }
    private void setCustomerDetail(CustomerJsonDto customer){
        namefield.setText(customer.getName());
        surnamefield.setText(customer.getSurname());
        emailfield.setText(customer.getEmail());
        loginfield.setText(customer.getLogin());
        idfield.setText(Long.toString(customer.getCid()));
    }
}
