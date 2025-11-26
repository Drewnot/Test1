import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

       //these are variables for bill to:
        String supermarket_1, colony_1, location_1, name_1, gstin_1, contact_1, email_1;
        //these are vars for ship to:
        String supermarket_2, colony_2, location_2, name_2, gstin_2, contact_2, email_2;
        String payment_date, payment_terms;
// var definitions for the product info.
        int surf_prod_code, rin_prod_code, hamam_prod_code, lux_prod_code, dove_prod_code, vim_prod_code, pep_prod_code;
        int surf_hsn, rin_hsn, hamam_hsn, lux_hsn, dove_hsn, vim_hsn, pep_hsn;
        double surf_price, rin_price, hamam_price, lux_price, dove_price, vim_price, pep_price;
        String surf_name, rin_name, hamam_name, lux_name, dove_name, vim_name, pep_name;
        int surf_qty, rin_qty, hamam_qty, lux_qty, dove_qty, vim_qty, pep_qty;
        String units= "nos";
        double tax = 0.05;
        double pep_tax= 0.18;
        double total_price;
        double discounts;
        double final_amount;

        //Inputing Bill to address
        System.out.print("Enter the supermarket name to bill to:");
        supermarket_1=input.nextLine();
        System.out.print("Enter the colony to bill to:");
        colony_1=input.nextLine();
        System.out.print("Enter the name to bill to:");
        name_1=input.nextLine();
        System.out.print("Enter the location to bill to:");
        location_1=input.nextLine();
        System.out.print("Enter the GSTIN to bill to:");
        gstin_1=input.nextLine();
        System.out.print("Enter the contact to bill to:");
        contact_1=input.nextLine();
        System.out.print("Enter the email to bill to:");
        email_1=input.nextLine();

        //Inputing ship to address
        System.out.print("Enter the supermarket name to ship to:");
        supermarket_2=input.nextLine();
        System.out.print("Enter the colony to ship to:");
        colony_2=input.nextLine();
        System.out.print("Enter the name to ship to:");
        name_2=input.nextLine();
        System.out.print("Enter the location to ship to:");
        location_2=input.nextLine();
        System.out.print("Enter the GSTIN to ship to:");
        gstin_2=input.nextLine();
        System.out.print("Enter the contact to ship to:");
        contact_2=input.nextLine();
        System.out.print("Enter the email to ship to:");
        email_2=input.nextLine();

        System.out.print("Enter the payment date:");
        payment_date=input.nextLine();
        System.out.print("Enter payment terms: ");
        payment_terms=input.nextLine();

        System.out.println("Enter the name of the first product you are buying:");
        surf_name=input.nextLine();
        System.out.println("Enter the product code of the first product you are buying:");
        surf_prod_code=input.nextInt();
        System.out.println("Enter the HSN code of the first product you are buying:");
        surf_hsn=input.nextInt();
        System.out.println("Enter the price of the first product you are buying:");
        surf_price=input.nextInt();
        System.out.println("Enter the quantity of the first product you are buying:");
        surf_qty=input.nextInt();

        double total_1=surf_price*surf_qty+(surf_price*surf_qty*tax);

        System.out.println("Enter the name of the second product you are buying:");
        rin_name=input.nextLine();
        System.out.println("Enter the product code of the second product you are buying:");
        rin_prod_code=input.nextInt();
        System.out.println("Enter the HSN code of the second product you are buying:");
        rin_hsn=input.nextInt();
        System.out.println("Enter the price of the second product you are buying:");
        rin_price=input.nextInt();
        System.out.println("Enter the quantity of the second product you are buying:");
        rin_qty=input.nextInt();

        double total_2=rin_price*rin_qty+(rin_price*rin_qty*tax);

        System.out.println("Enter the name of the third product you are buying:");
        hamam_name=input.nextLine();
        System.out.println("Enter the product code of the third product you are buying:");
        hamam_prod_code=input.nextInt();
        System.out.println("Enter the HSN code of the third product you are buying:");
        hamam_hsn=input.nextInt();
        System.out.println("Enter the price of the third product you are buying:");
        hamam_price=input.nextInt();
        System.out.println("Enter the quantity of the third product you are buying:");
        hamam_qty=input.nextInt();

        double total_3=hamam_price*hamam_qty+(hamam_price*hamam_qty*tax);

        System.out.println("Enter the name of the fourth product you are buying:");
        lux_name=input.nextLine();
        System.out.println("Enter the product code of the fourth product you are buying:");
        lux_prod_code=input.nextInt();
        System.out.println("Enter the HSN code of the fourth product you are buying:");
        lux_hsn=input.nextInt();
        System.out.println("Enter the price of the fourth product you are buying:");
        lux_price=input.nextInt();
        System.out.println("Enter the quantity of the fourth product you are buying:");
        lux_qty=input.nextInt();

        double total_4=lux_price*lux_qty+(lux_price*lux_qty*tax);

        System.out.println("Enter the name of the fifth product you are buying:");
        dove_name=input.nextLine();
        System.out.println("Enter the product code of the fifth product you are buying:");
        dove_prod_code=input.nextInt();
        System.out.println("Enter the HSN code of the fifth product you are buying:");
        dove_hsn=input.nextInt();
        System.out.println("Enter the price of the fifth product you are buying:");
        dove_price=input.nextInt();
        System.out.println("Enter the quantity of the fifth product you are buying:");
        dove_qty=input.nextInt();

        double total_5=dove_price*dove_qty+(dove_price*dove_qty*tax);

        System.out.println("Enter the name of the sixth product you are buying:");
        vim_name=input.nextLine();
        System.out.println("Enter the product code of the sixth product you are buying:");
        vim_prod_code=input.nextInt();
        System.out.println("Enter the HSN code of the sixth product you are buying:");
        vim_hsn=input.nextInt();
        System.out.println("Enter the price of the sixth product you are buying:");
        vim_price=input.nextInt();
        System.out.println("Enter the quantity of the sixth product you are buying:");
        vim_qty=input.nextInt();

        double total_6=vim_price*vim_qty+(vim_price*vim_qty*tax);

        System.out.println("Enter the name of the seventh product you are buying:");
        pep_name=input.nextLine();
        System.out.println("Enter the product code of the seventh product you are buying:");
        pep_prod_code=input.nextInt();
        System.out.println("Enter the HSN code of the seventh product you are buying:");
        pep_hsn=input.nextInt();
        System.out.println("Enter the price of the seventh product you are buying:");
        pep_price=input.nextInt();
        System.out.println("Enter the quantity of the seventh product you are buying:");
        pep_qty=input.nextInt();

        double total_7=pep_price*pep_qty+(pep_price*pep_qty*pep_tax);

       total_price=total_1+total_2+total_3+total_4+total_5+total_6+total_7;

       discounts=total_price*0.006368;

       final_amount=total_price-discounts;



        String header_form = "| %-8s | %-12s | %-28s | %-16s | %-16s | %-8s | %-16s | %-8s | %-16s | |\n";
        String data_form = "| %-8s | %-12d | %-28s | %-16d | %-16d | %-8s | %-16f | %-8f | %-16f |\n";
        String data_form1 = "%-120s %-14s | %-16f\n";
        final String separator = ("------------------------------------------------------------------------------------------------------------------------------------------------------------");
        final String separator1 = ("                                                                                                               ---------------------------------------------");
        final String bill_ship = "%-50s %-50s \n";

        System.out.printf(bill_ship, "bill to: ", "ship to: ");
        System.out.printf(separator);
        System.out.printf(bill_ship, supermarket_1, supermarket_2);
        System.out.printf(bill_ship, colony_1, colony_2);
        System.out.printf(bill_ship, name_1, name_2);
        System.out.printf(bill_ship, location_1, location_2);
        System.out.printf(bill_ship, gstin_1, gstin_2);
        System.out.printf(bill_ship, contact_1, contact_2);
        System.out.printf(bill_ship, email_1, email_2);
        System.out.printf(separator);
        System.out.printf(bill_ship, payment_date, payment_terms);
        System.out.printf(separator);
        System.out.printf(header_form, "S.No", "Product Code", "Product Name", "HSN Code", "Quantity", "Units", "Rate", "Tax", "Amount" );
        System.out.printf(separator);
        System.out.printf(data_form, "1", surf_prod_code, surf_name, surf_hsn, surf_qty, units, surf_price, tax, total_1 );
        System.out.printf(separator);
        System.out.printf(data_form, "2", rin_prod_code, rin_name, rin_hsn, rin_qty, units, rin_price, tax, total_2 );
        System.out.printf(separator);
        System.out.printf(data_form, "3", hamam_prod_code, hamam_name, hamam_hsn, hamam_qty, units, hamam_price, tax, total_3 );
        System.out.printf(separator);
        System.out.printf(data_form, "4", lux_prod_code, lux_name, lux_hsn, lux_qty, units, lux_price, tax, total_4 );
        System.out.printf(separator);
        System.out.printf(data_form, "5", dove_prod_code, dove_name, dove_hsn, dove_qty, units, dove_price, tax, total_5 );
        System.out.printf(separator);
        System.out.printf(data_form, "6", vim_prod_code, vim_name, vim_hsn, vim_qty, units, vim_price, tax, total_6 );
        System.out.printf(separator);
        System.out.printf(data_form, "7", pep_prod_code, pep_name, pep_hsn, pep_qty, units, pep_price, pep_tax, total_7);
        System.out.println(separator);
        System.out.printf(data_form1, " ", "Total", total_price);
        System.out.println(separator1);
        System.out.printf(data_form1, "", "Discounts", discounts);
        System.out.println(separator1);
        System.out.printf(data_form1, "", "Grand Total", final_amount);
        System.out.println(separator1);


    }}

















































































































































































































































































































































































































































































































