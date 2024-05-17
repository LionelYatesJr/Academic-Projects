//Comp 360-001 Lionel Yates Jr -- JaDrian Gantt
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class Reservation extends JFrame{ // claims the information of everything typed on the GUI to here
    private JTextField tfFirstName;
    private JTextField tfLastName;
    private JButton btnOk;
    private JButton btnClear;

    private JPanel mainPanel;
    private JTextField tfCheckin;
    private JTextField tfCheckOut;
    private JTextField tfRoomType;
    private JTextField tfRoomNumber;
    private JTextField tfNightsStaying;


    public Reservation(){
        setContentPane(mainPanel); // Set up for GUI's display
        setTitle("Marriott Reservation System");
        setSize(800, 400);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        btnOk.addActionListener(new ActionListener() { //Claims all the information from the GUI into this command once the OK button has been hit
            @Override
            public void actionPerformed(ActionEvent e) {

            if(Integer.parseInt(tfRoomNumber.getText())>= 17){ //if the room number is after 17 it's going to say everything is reserved.
                JOptionPane.showMessageDialog(btnOk,tfRoomType.getText() + " room type is all reserved.");
            }

            else if(Objects.equals(tfRoomType.getText(), "Luxury")){ //if the room type is stated as Luxury it's going to say every room is reserved
                JOptionPane.showMessageDialog(btnOk, "room type is all reserved.");
            }
            else if(Objects.equals(tfRoomType.getText(), "Standard")){ //if the room type is stated as Standard it's going to state the user's information and total
                int x = Integer.parseInt(tfNightsStaying.getText());
                JOptionPane.showMessageDialog(btnOk,"Client's information: \nFull name: \n" + tfFirstName.getText() + " " + tfLastName.getText() + "\nCheck-in date: \n" + tfCheckin.getText() + "\nCheck-out date: \n" + tfCheckOut.getText() + "\nRoom Type: \n" + tfRoomType.getText() + "\nRoom Number: \n" + tfRoomNumber.getText() + "\nClient's total is: \n" + x * 150 + "$");
            }
            else if(Objects.equals(tfRoomType.getText(), "Junior")) { //if the room type is stated as Junior it's going to state the user's information and total
                int x = Integer.parseInt(tfNightsStaying.getText());
                JOptionPane.showMessageDialog(btnOk, "Client's information: \nFull name: \n" + tfFirstName.getText() + " " + tfLastName.getText() + "\nCheck-in date: \n" + tfCheckin.getText() + "\nCheck-out date: \n" + tfCheckOut.getText() + "\nRoom Type: \n" + tfRoomType.getText() + "\nRoom Number: \n" + tfRoomNumber.getText() + "\nClient's total is: \n" + x * 200 + "$");
            }
            else if(Integer.parseInt(tfRoomNumber.getText())<= 10){ // if the room number is less than or equal to 10 its going to show the user's information as well as the total for standard pricing
                int x = Integer.parseInt(tfNightsStaying.getText());
                JOptionPane.showMessageDialog(btnOk,"Client's information: \nFull name: \n" + tfFirstName.getText() + " " + tfLastName.getText() + "\nCheck-in date: \n" + tfCheckin.getText() + "\nCheck-out date: \n" + tfCheckOut.getText() + "\nRoom Type: \n" + tfRoomType.getText() + "\nRoom Number: \n" + tfRoomNumber.getText() + "\nClient's total is: \n" + x * 150 + "$");

            }
            else if(Integer.parseInt(tfRoomNumber.getText()) == 11){ //between 11 and 16 it's going to show the user's information + the total for junior pricing
                int x = Integer.parseInt(tfNightsStaying.getText());
                JOptionPane.showMessageDialog(btnOk,"Client's information: \nFull name: \n" + tfFirstName.getText() + " " + tfLastName.getText() + "\nCheck-in date: \n" + tfCheckin.getText() + "\nCheck-out date: \n" + tfCheckOut.getText() + "\nRoom Type: \n" + tfRoomType.getText() + "\nRoom Number: \n" + tfRoomNumber.getText() + "\nClient's total is: \n" + x * 200 + "$");

            }
            else if(Integer.parseInt(tfRoomNumber.getText()) == 12){
                int x = Integer.parseInt(tfNightsStaying.getText());
                JOptionPane.showMessageDialog(btnOk,"Client's information: \nFull name: \n" + tfFirstName.getText() + " " + tfLastName.getText() + "\nCheck-in date: \n" + tfCheckin.getText() + "\nCheck-out date: \n" + tfCheckOut.getText() + "\nRoom Type: \n" + tfRoomType.getText() + "\nRoom Number: \n" + tfRoomNumber.getText() + "\nClient's total is: \n" + x * 200 + "$");
            }
            else if(Integer.parseInt(tfRoomNumber.getText()) == 13){
                int x = Integer.parseInt(tfNightsStaying.getText());
                JOptionPane.showMessageDialog(btnOk,"Client's information: \nFull name: \n" + tfFirstName.getText() + " " + tfLastName.getText() + "\nCheck-in date: \n" + tfCheckin.getText() + "\nCheck-out date: \n" + tfCheckOut.getText() + "\nRoom Type: \n" + tfRoomType.getText() + "\nRoom Number: \n" + tfRoomNumber.getText() + "\nClient's total is: \n" + x * 200 + "$");

            }
            else if(Integer.parseInt(tfRoomNumber.getText()) == 14){
                int x = Integer.parseInt(tfNightsStaying.getText());
                JOptionPane.showMessageDialog(btnOk,"Client's information: \nFull name: \n" + tfFirstName.getText() + " " + tfLastName.getText() + "\nCheck-in date: \n" + tfCheckin.getText() + "\nCheck-out date: \n" + tfCheckOut.getText() + "\nRoom Type: \n" + tfRoomType.getText() + "\nRoom Number: \n" + tfRoomNumber.getText() + "\nClient's total is: \n" + x * 200 + "$");
            }
            else if(Integer.parseInt(tfRoomNumber.getText()) == 15){
                int x = Integer.parseInt(tfNightsStaying.getText());
                JOptionPane.showMessageDialog(btnOk,"Client's information: \nFull name: \n" + tfFirstName.getText() + " " + tfLastName.getText() + "\nCheck-in date: \n" + tfCheckin.getText() + "\nCheck-out date: \n" + tfCheckOut.getText() + "\nRoom Type: \n" + tfRoomType.getText() + "\nRoom Number: \n" + tfRoomNumber.getText() + "\nClient's total is: \n" + x * 200 + "$");
            }
            else if(Integer.parseInt(tfRoomNumber.getText()) == 16){
                int x = Integer.parseInt(tfNightsStaying.getText());
                JOptionPane.showMessageDialog(btnOk,"Client's information: \nFull name: \n" + tfFirstName.getText() + " " + tfLastName.getText() + "\nCheck-in date: \n" + tfCheckin.getText() + "\nCheck-out date: \n" + tfCheckOut.getText() + "\nRoom Type: \n" + tfRoomType.getText() + "\nRoom Number: \n" + tfRoomNumber.getText() + "\nClient's total is: \n" + x * 200 + "$");

            }


            }
        });
        btnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tfFirstName.setText("");
                tfLastName.setText("");
                tfCheckin.setText("");
                tfCheckOut.setText("");
                tfRoomType.setText("");
                tfRoomNumber.setText("");
                tfNightsStaying.setText("");
                JOptionPane.showMessageDialog(btnClear, "cleared.");

            }
        });
    }


    public static void main(String[] args) {

        Reservation myFrame = new Reservation();

    }
}
