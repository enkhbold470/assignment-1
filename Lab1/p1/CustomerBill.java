import java.util.Scanner;

public class CustomerBill {
    public static void main(String[] args) {
        final double TV_PRICE = 400.00;
        final double VCR_PRICE = 220.00;
        final double REMOTE_CONTROLLER_PRICE = 35.20;
        final double CD_PLAYER_PRICE = 300.00;
        final double TAPE_RECORDER_PRICE = 150.00;
        final double SALES_TAX_RATE = 0.0825;

        Scanner scanner = new Scanner(System.in);
        System.out.print("How many TV's were sold? ");
        int tvQty = scanner.nextInt();
        System.out.print("How many VCR's were sold? ");
        int vcrQty = scanner.nextInt();
        System.out.print("How many Remote Controller's were sold? ");
        int remoteQty = scanner.nextInt();
        System.out.print("How many CD's were sold? ");
        int cdQty = scanner.nextInt();
        System.out.print("How many Tape Recorder's were sold? ");
        int tapeQty = scanner.nextInt();
        scanner.close();

        double tvTotal = TV_PRICE * tvQty;
        double vcrTotal = VCR_PRICE * vcrQty;
        double remoteTotal = REMOTE_CONTROLLER_PRICE * remoteQty;
        double cdTotal = CD_PLAYER_PRICE * cdQty;
        double tapeTotal = TAPE_RECORDER_PRICE * tapeQty;

        double subtotal = tvTotal + vcrTotal + remoteTotal + cdTotal + tapeTotal;

        double tax = subtotal * SALES_TAX_RATE;

        double total = subtotal + tax;

        System.out.println("QTY\tDESCRIPTION\tUNIT PRICE\tTOTAL PRICE");
        System.out.printf("%d\tTV\t\t$%.2f\t$%.2f%n", tvQty, TV_PRICE, tvTotal);
        System.out.printf("%d\tVCR\t\t$%.2f\t$%.2f%n", vcrQty, VCR_PRICE, vcrTotal);
        System.out.printf("%d\tRemote Controller\t$%.2f\t$%.2f%n", remoteQty, REMOTE_CONTROLLER_PRICE, remoteTotal);
        System.out.printf("%d\tCD Player\t$%.2f\t$%.2f%n", cdQty, CD_PLAYER_PRICE, cdTotal);
        System.out.printf("%d\tTape Recorder\t$%.2f\t$%.2f%n", tapeQty, TAPE_RECORDER_PRICE, tapeTotal);
        System.out.printf("%n\t\tSUBTOTAL\t$%.2f%n", subtotal);
        System.out.printf("\t\tTAX\t\t$%.2f%n", tax);
        System.out.printf("\t\tTOTAL\t\t$%.2f%n", total);

     /* Output:
      * How many TV's were sold? 123
How many VCR's were sold? 12543432
How many Remote Controller's were sold? 123
How many CD's were sold? 123
How many Tape Recorder's were sold? 4
QTY     DESCRIPTION     UNIT PRICE      TOTAL PRICE
123     TV              $400.00 $49200.00
12543432        VCR             $220.00 $2759555040.00
123     Remote Controller       $35.20  $4329.60
123     CD Player       $300.00 $36900.00
4       Tape Recorder   $150.00 $600.00

                SUBTOTAL        $2759646069.60
                TAX             $227670800.74
                TOTAL           $2987316870.34
      */

    }
}
