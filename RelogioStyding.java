package javaexemplos.relogio;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;


import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.Timer;

public class RelogioStyding extends JFrame {
    private JLabel timeLabel;
    private JLabel dateLabel;
    private JLabel nameLabel;
    private String name = "@J0A0-PEDR0";
    public RelogioStyding() {
        setTitle("Estudando Timer Java");
        setSize(700,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        // Cria um painel para armazenar os rótulos de hora e data Labels
        JPanel panel = new JPanel();
        panel.setBorder
          (BorderFactory.createEmptyBorder(20, 20, 20, 20));
          panel.setLayout(new BorderLayout());
          
       // Cria um display para exibir a Label hora
       timeLabel = new JLabel();
       timeLabel.setFont(new Font("Arial" , Font.PLAIN,60));
       timeLabel.setHorizontalAlignment(SwingConstants.CENTER);
       timeLabel.setVerticalAlignment(SwingConstants.CENTER);
       timeLabel.setForeground(Color.BLUE);
    //Cria um display para Label DATA
       dateLabel = new JLabel();
       dateLabel.setFont(new Font("Arial" , Font.PLAIN,20));
       dateLabel.setHorizontalAlignment(SwingConstants.CENTER);
       dateLabel.setVerticalAlignment(SwingConstants.CENTER);
       dateLabel.setForeground(Color.BLUE);
       
       nameLabel = new JLabel();
       nameLabel.setFont(new Font("Arial",Font.PLAIN,20));
       nameLabel.setHorizontalAlignment(SwingConstants.CENTER);
       nameLabel.setVerticalAlignment(SwingConstants.CENTER);
       nameLabel.setForeground(Color.BLUE);
       //Adiciona o tempo e data Labels para o painel
       panel.add(nameLabel,BorderLayout.NORTH);
       panel.add(timeLabel,BorderLayout.CENTER);
       panel.add(dateLabel,BorderLayout.SOUTH);
      
       //Cor de fundo
       panel.setBackground(Color.BLACK);

       //adicional o painel para o frame
       add(panel);

       //Atualiza os dados da data e hora
      Timer clock = new Timer(1000 , new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e){
            updateTimeAndDate();
        }
      });
       clock.start();

    }
    private void updateTimeAndDate() {
        //Corrige formato do tempo
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat timeFormatter =
        new SimpleDateFormat("HH:mm:ss");
        String time=timeFormatter.format(calendar.getTime());

        //corrige formato da data
        SimpleDateFormat dateFormatter = 
        new SimpleDateFormat("EEE,MMM dd, yyyy");
        String date =
        dateFormatter.format(calendar.getTime());

        //Atualizada o tempo e a data 
        timeLabel.setText(time);
        dateLabel.setText(date);
        nameLabel.setText(name);
    }
    public static void main(String[] args) {
        RelogioStyding clock = new RelogioStyding();
        clock.setVisible(true);
    }
}
