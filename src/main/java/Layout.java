import javax.swing.*;

public class Layout {
    JFrame Border;
    public Layout(){
        this.CreateBorder();
    }
    public JFrame CreateBorder(){
         Border = new JFrame("This is a border Frame");
        Border.setSize(1000,500);

        Border.setVisible(true);
        return Border;
    }

}
