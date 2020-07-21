import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class pizzaGUI extends JFrame {

    private JPanel panel_main;
    private JTextField telephone_no;
    private JTextField tf_name;
    private JTextPane tp_address;
    private JTextField bill_name;
    private JTextPane bill_address;
    private JTextField bill_phoneNo;
    private JTextField bill_subtotal;
    private JTextField bill_tax;
    private JTextField bill_total;
    private JTextField bill_deliveryFee;
    private JRadioButton radio_small;
    private JRadioButton radio_medium;
    private JRadioButton radio_large;
    private JRadioButton radio_xlarge;
    private JCheckBox check_crust_hand;
    private JCheckBox check_crust_thin;
    private JCheckBox check_crust_deepDish;
    private JCheckBox check_topping_pepper;
    private JCheckBox check_topping_sausage ;
    private JCheckBox check_topping_onion;
    private JCheckBox check_topping_mushroom;
    private JCheckBox check_topping_anchovies;
    private JCheckBox check_topping_jalap;
    private JCheckBox check_topping_chicken;
    private JCheckBox check_topping_meatb;
    private JRadioButton rb_carryout;
    private JRadioButton rb_delivery;
    private JPanel jp_orderType;
    private JPanel jp_bill;
    private JPanel jp_custDetails;
    private JPanel jp_crust;
    private JPanel jp_toppings;
    private JPanel jp_pizzaSize;
    private JButton checkoutButton;
    private ButtonGroup bg1, bg2, bg3;

//Launch application
    public static void main(String[] args) {

                    pizzaGUI frame = new pizzaGUI();

                    frame.setVisible(true);
    }

//Create frame
    public pizzaGUI() {

        setTitle("Route Five Pizza");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setBounds(300, 300, 700, 700);

        panel_main = new JPanel();

        setContentPane(panel_main);

        panel_main.setLayout(null);

        jp_pizzaSize = new JPanel();
        jp_pizzaSize.setBounds(38, 273, 175, 210);
        panel_main.add(jp_pizzaSize);

        JLabel label = new JLabel("Choose a Pizza");
        label.setFont(new Font("Cambria", Font.BOLD, 13));
        label.setBounds(10, 9, 156, 26);
        jp_pizzaSize.add(label);

        radio_small = new JRadioButton("10 inch - $8.99");
        radio_small.setFont(new Font("Cambria", Font.ITALIC, 11));
        radio_small.setBounds(6, 44, 109, 23);
        jp_pizzaSize.add(radio_small);

        radio_medium = new JRadioButton("12 inch -$10.99");
        radio_medium.setFont(new Font("Cambria", Font.ITALIC, 11));
        radio_medium.setBounds(6, 80, 109, 23);
        jp_pizzaSize.add(radio_medium);

        radio_large = new JRadioButton("14 inch - $12.99");
        radio_large.setFont(new Font("Cambria", Font.ITALIC, 11));
        radio_large.setBounds(6, 117, 109, 23);
        jp_pizzaSize.add(radio_large);

        radio_xlarge = new JRadioButton("16 inch - $14.99");
        radio_xlarge.setFont(new Font("Cambria", Font.ITALIC, 11));
        radio_xlarge.setBounds(6, 153, 109, 23);
        jp_pizzaSize.add(radio_xlarge);

        jp_crust = new JPanel();
        jp_crust.setBounds(224, 273, 176, 183);
        panel_main.add(jp_crust);
        jp_crust.setLayout(null);

        JLabel label_1 = new JLabel("Select Pizza Crust");
        label_1.setFont(new Font("Cambria", Font.BOLD, 13));
        label_1.setBounds(10, 11, 144, 23);
        jp_crust.add(label_1);

        check_crust_hand = new JCheckBox("Hand tossed - no charge");
        check_crust_hand.setBounds(6, 48, 164, 23);
        jp_crust.add(check_crust_hand);

        check_crust_thin = new JCheckBox("Thin Crust - no charge");
        check_crust_thin.setBounds(6, 95, 164, 23);
        jp_crust.add(check_crust_thin);

        check_crust_deepDish = new JCheckBox("Deep Dish - $1.50");
        check_crust_deepDish.setBounds(6, 143, 137, 23);
        jp_crust.add(check_crust_deepDish);

        jp_toppings = new JPanel();
        jp_toppings.setBounds(412, 273, 240, 218);
        panel_main.add(jp_toppings);
        jp_toppings.setLayout(null);

        JLabel label_2 = new JLabel("Select Additional Toppings.");
        label_2.setFont(new Font("Cambria", Font.BOLD, 13));
        label_2.setBounds(48, 1, 216, 23);
        jp_toppings.add(label_2);

        check_topping_pepper = new JCheckBox("Pepperoni - $1.00");
        check_topping_pepper.setBounds(6, 161, 145, 23);
        jp_toppings.add(check_topping_pepper);

        check_topping_anchovies = new JCheckBox("Anchovies - $1.00");
        check_topping_anchovies.setBounds(6, 141, 145, 23);
        jp_toppings.add(check_topping_anchovies);

        check_topping_jalap = new JCheckBox("Jalapenos - $1.00");
        check_topping_jalap.setBounds(6, 121, 145, 23);
        jp_toppings.add(check_topping_jalap);

        check_topping_chicken = new JCheckBox("Chicken - $1.00");
        check_topping_chicken.setBounds(6, 101, 145, 23);
        jp_toppings.add(check_topping_chicken);

        check_topping_meatb = new JCheckBox("Meatballs - $1.00");
        check_topping_meatb.setBounds(6, 81, 145, 23);
        jp_toppings.add(check_topping_meatb);

        check_topping_sausage = new JCheckBox("Sausage - $1.00");
        check_topping_sausage.setBounds(6, 61, 145, 23);
        jp_toppings.add(check_topping_sausage);

        check_topping_onion = new JCheckBox("Onion - $0.75");
        check_topping_onion.setBounds(6, 41, 125, 23);
        jp_toppings.add(check_topping_onion);

        check_topping_mushroom = new JCheckBox("Mushroom - $0.50");
        check_topping_mushroom.setBounds(6, 21, 145, 23);
        jp_toppings.add(check_topping_mushroom);

        jp_orderType = new JPanel();
        jp_orderType.setBounds(32, 505, 379, 129);
        panel_main.add(jp_orderType);
        jp_orderType.setLayout(null);

        rb_carryout = new JRadioButton("Carryout");
        rb_carryout.setBounds(6, 47, 109, 23);
        jp_orderType.add(rb_carryout);

        rb_delivery = new JRadioButton("Home Delivery");
        rb_delivery.setBounds(145, 47, 109, 23);
        jp_orderType.add(rb_delivery);

        jp_custDetails = new JPanel();
        jp_custDetails.setBounds(38, 57, 614, 183);
        panel_main.add(jp_custDetails);
        jp_custDetails.setLayout(null);

        JLabel label_6 = new JLabel("Name:");
        label_6.setBounds(22, 48, 46, 14);
        jp_custDetails.add(label_6);

        JLabel label_7 = new JLabel("Address:");
        label_7.setBounds(22, 84, 58, 14);
        jp_custDetails.add(label_7);

        JLabel label_8 = new JLabel("Telephone:");
        label_8.setBounds(21, 158, 69, 14);
        jp_custDetails.add(label_8);

        tp_address = new JTextPane();
        JScrollPane sp = new JScrollPane(tp_address);
        sp.setBounds(93, 76, 281, 68);
        jp_custDetails.add(sp);

        telephone_no = new JTextField();
        telephone_no.setBounds(93, 155, 281, 20);
        jp_custDetails.add(telephone_no);
        telephone_no.setColumns(10);

        tf_name = new JTextField();
        tf_name.setBounds(90, 45, 284, 20);
        jp_custDetails.add(tf_name);
        tf_name.setColumns(10);

        JLabel label_9 = new JLabel("ROUTE FIVE PIZZA SHOP");
        label_9.setFont(new Font("Cambria", Font.BOLD, 14));
        label_9.setBounds(132, 11, 366, 22);
        panel_main.add(label_9);

        jp_bill = new JPanel();
        jp_bill.setBounds(710, 57, 289, 424);
        panel_main.add(jp_bill);
        jp_bill.setLayout(null);

        JLabel label_10 = new JLabel("Billing Information");
        label_10.setFont(new Font("Cambria", Font.BOLD, 14));
        label_10.setBounds(69, 11, 208, 23);
        jp_bill.add(label_10);

        JLabel label_11 = new JLabel("Customer's Name:");
        label_11.setBounds(10, 67, 105, 14);
        jp_bill.add(label_11);

        JLabel label_12 = new JLabel("Customer's Address:");
        label_12.setBounds(10, 124, 131, 14);
        jp_bill.add(label_12);

        JLabel label_13 = new JLabel("Telephone No:");
        label_13.setBounds(10, 195, 105, 14);
        jp_bill.add(label_13);

        JLabel label_14 = new JLabel("SubTotal:");
        label_14.setBounds(10, 232, 105, 14);
        jp_bill.add(label_14);

        JLabel label_15 = new JLabel("Tax Amount:");
        label_15.setBounds(10, 271, 105, 14);
        jp_bill.add(label_15);

        JLabel label_16 = new JLabel("Deliver Fee:");
        label_16.setBounds(10, 317, 105, 14);
        jp_bill.add(label_16);

        JLabel label_17 = new JLabel("Total:");
        label_17.setBounds(10, 363, 105, 14);
        jp_bill.add(label_17);

        bill_name = new JTextField();
        bill_name.setBounds(139, 64, 138, 20);
        jp_bill.add(bill_name);
        bill_name.setColumns(10);

        bill_address = new JTextPane();
        JScrollPane sp1 = new JScrollPane(bill_address);
        sp1.setBounds(139, 112, 138, 69);
        jp_bill.add(sp1);

        bill_phoneNo = new JTextField();
        bill_phoneNo.setBounds(139, 192, 138, 20);
        jp_bill.add(bill_phoneNo);
        bill_phoneNo.setColumns(10);

        bill_subtotal = new JTextField();
        bill_subtotal.setBounds(139, 229, 94, 20);
        jp_bill.add(bill_subtotal);
        bill_subtotal.setColumns(10);

        bill_tax = new JTextField();
        bill_tax.setColumns(10);
        bill_tax.setBounds(139, 268, 94, 20);
        jp_bill.add(bill_tax);

        bill_deliveryFee = new JTextField();
        bill_deliveryFee.setColumns(10);
        bill_deliveryFee.setBounds(139, 314, 94, 20);
        jp_bill.add(bill_deliveryFee);

        bill_total = new JTextField();
        bill_total.setColumns(10);
        bill_total.setBounds(139, 360, 94, 20);
        jp_bill.add(bill_total);

// action listener of check out button

        checkoutButton = new JButton("CHECKOUT");

        checkoutButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(validateCustomerData())
                {
                    String name = tf_name.getText();
                    String address = tp_address.getText();
                    String phone = telephone_no.getText();

                    showBill(name, address, phone);
                }
            }
        });

        checkoutButton.setFont(new Font("Cambria", Font.BOLD, 13));

        checkoutButton.setBounds(551, 502, 101, 39);

        panel_main.add(checkoutButton);

        addRadioButtonGroups();

        reset();

        editOffBillingPanel();

    }

     //Method to add radio buttons and check boxes to a single group

    private void addRadioButtonGroups()
    {

        bg1 = new ButtonGroup();
        bg1.add(radio_small);
        bg1.add(radio_medium);
        bg1.add(radio_large);
        bg1.add(radio_xlarge);

        bg2 = new ButtonGroup();
        bg2.add(check_crust_hand);
        bg2.add(check_crust_thin);
        bg2.add(check_crust_deepDish);

        bg3 = new ButtonGroup();
        bg3.add(rb_carryout);
        bg3.add(rb_delivery);

    }

     // Method to clear the inputs

    private void reset()
    {
        tf_name.setText("");
        tp_address.setText("");
        telephone_no.setText("");

        bg1.clearSelection();
        bg2.clearSelection();
        bg3.clearSelection();

        jp_bill.setVisible(false);

        radio_small.setSelected(true);
        check_crust_hand.setSelected(true);
        rb_carryout.setSelected(true);
        check_topping_mushroom.setSelected(true);
    }

    private boolean validateCustomerData()
    {
        if(tf_name.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Enter name");
            return false;
        }

        else if(tp_address.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Enter address");

            return false;
        }

        else if(telephone_no.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Enter telephone number");
            return false;
        }

        else
        {
            return true;
        }

    }

     // Method to prepare bill and display to billing panel

    public void showBill(String name, String addr, String phone) {

        double pizzaSizeCost = 0;
        double toppings = 0;
        double crust = 0;
        double subtotal = 0;
        double total = 0;
        double tax = 0;
        double deliverFee = 0;

        if(radio_small.isSelected())
            pizzaSizeCost = 8.99;

        else if(radio_medium.isSelected())
            pizzaSizeCost = 10.99;

        else if(radio_large.isSelected())
            pizzaSizeCost = 12.99;

        else
            pizzaSizeCost = 14.99;

        if(check_crust_deepDish.isSelected())
            crust = 1.50;

        if(check_topping_pepper.isSelected())
            toppings += 1.00;

        if(check_topping_sausage.isSelected())
            toppings += 1.00;

        if(check_topping_onion.isSelected())
            toppings += 0.75;

        if(check_topping_mushroom.isSelected())
            toppings += 0.50;

        if(rb_delivery.isSelected())
            deliverFee = 2.0;


        subtotal = pizzaSizeCost + crust + toppings ;

        tax = 7.75 * subtotal / 100;

        total = subtotal + tax + deliverFee;

        bill_name.setText(name);
        bill_phoneNo.setText(phone);
        bill_address.setText(addr);
        bill_subtotal.setText(String.format("$"+subtotal));
        bill_tax.setText(String.format("$"+tax));
        bill_total.setText(String.format("$"+total));
        bill_deliveryFee.setText(String.format("$"+deliverFee));

        jp_bill.setBounds(38, 57, 600, 550);
        jp_bill.setVisible(true);

        jp_custDetails.setVisible(false);
        jp_orderType.setVisible(false);
        jp_crust.setVisible(false);
        jp_toppings.setVisible(false);
        jp_pizzaSize.setVisible(false);
        checkoutButton.setVisible(false);
    }

     //Method to disable the billing panel items to be edited

    private void editOffBillingPanel()
    {
        bill_name.setEditable(false);
        bill_phoneNo.setEditable(false);
        bill_address.setEditable(false);
        bill_address.setEditable(false);
        bill_subtotal.setEditable(false);
        bill_tax.setEditable(false);
        bill_total.setEditable(false);
        bill_deliveryFee.setEditable(false);
    }
}