import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UserClickController implements ActionListener {
    View view;
    public UserClickController(View v){
        this.view = v;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        Double result = (double) 0;
        switch (e.getActionCommand()){
            case "CALCULATE":{
                String snb1 = this.view.tnb1.getText();
                String snb2 = this.view.tnb2.getText();
                String sop = (String) this.view.cop.getSelectedItem();
                try{
                 Double nb1 = Double.valueOf(snb1);
                 Double nb2 = Double.valueOf(snb2);
                 Model m = new Model(nb1,nb2,sop);
                 Service s = new Service(m);
                 switch (sop){
                     case "+":{
                         result = s.addition();
                         this.view.tresult.setText(String.valueOf(result));
                         break;
                     }
                     case "-":{
                         result = s.substraction();
                         this.view.tresult.setText(String.valueOf(result));
                         break;
                     }
                     case "*":{
                         result = s.multiplication();
                         this.view.tresult.setText(String.valueOf(result));
                         break;
                     }
                     case "/":{
                         if(m.getNb2() == 0){
                             JOptionPane jop1 = new JOptionPane();
                             jop1.showMessageDialog(view,"Division by 0 is not possible", "Error", JOptionPane.ERROR_MESSAGE);
                         }
                         else {
                             result = s.division();
                             this.view.tresult.setText(String.valueOf(result));
                         }
                         break;
                     }
                     case "%":{
                         if(m.getNb2() == 0){
                             JOptionPane jop1 = new JOptionPane();
                             jop1.showMessageDialog(view,"Division by 0 is not possible", "Error", JOptionPane.ERROR_MESSAGE);
                         }
                         else {
                             result = s.modolus();
                             this.view.tresult.setText(String.valueOf(result));
                         }
                         break;
                     }
                 }
                }
                catch (Exception ex){
                    JOptionPane jop = new JOptionPane();
                    jop.showMessageDialog (view, "the value entered must be a number", "Error", JOptionPane.ERROR_MESSAGE);
                }
                break;
            }
            case "CANCEL":{
                this.view.tnb1.setText(" ");
                this.view.tnb2.setText(" ");
                this.view.tresult.setText(" ");

                break;
            }
        }

    }
}
