import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class NontonYuk {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Nonton_Yuk");
        frame.setSize(500, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(new BorderLayout(10, 10));

        JPanel panelForm = new JPanel(new GridLayout(3, 2, 5, 5));

        panelForm.add(new JLabel("Select Movie:"));
        JComboBox<String> cbFilm = new JComboBox<>(new String[]{
            "Angry Birds the Movie 3", "Avengers: Doomsday", "Jumanji: Open World"
        });
        panelForm.add(cbFilm);

        panelForm.add(new JLabel("Studio Type:"));
        JComboBox<String> cbTipe = new JComboBox<>(new String[]{
            "Regular (Rp40,000)", "Premiere (Rp60,000)"
        });
        panelForm.add(cbTipe);

        panelForm.add(new JLabel("Ticket Quantity:"));
        JTextField txtJumlah = new JTextField();
        panelForm.add(txtJumlah);

        JPanel panelTombol = new JPanel(new FlowLayout());
        JButton btnPesan = new JButton("Book Ticket");

        btnPesan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String film = (String) cbFilm.getSelectedItem();
                int jumlah = Integer.parseInt(txtJumlah.getText());
                int harga;
                String fasilitas;

                if (cbTipe.getSelectedIndex() == 0) {
                    harga = 40000;
                    fasilitas = "Standard Seat";
                } else {
                    harga = 60000;
                    fasilitas = "Recliner Sofa + Blanket";
                }

                int total = harga * jumlah;
                String struk = "Movie: " + film + "\n"
                             + "Facilities: " + fasilitas + "\n"
                             + "Quantity: " + jumlah + " ticket(s)\n"
                             + "Total Price: Rp" + total;

                JOptionPane.showMessageDialog(frame, struk, "Booking Receipt", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        panelTombol.add(btnPesan);
        frame.add(panelForm, BorderLayout.CENTER);
        frame.add(panelTombol, BorderLayout.SOUTH);
        frame.setVisible(true);
    }
}