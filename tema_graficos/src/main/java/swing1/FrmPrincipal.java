package swing1;

//import java.awt.BorderLayout;
//import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.*;

public class FrmPrincipal extends JFrame {
    JLabel lbl;

    public FrmPrincipal() {
        super("imagen");
        setLayout(new FlowLayout());
        lbl = new JLabel();
        lbl.setIcon(new ImageIcon(FrmPrincipal.class.getResource("/img/oso.jpg")        ));
        add(lbl);

        throw new IllegalArgumentException();


    }
}
