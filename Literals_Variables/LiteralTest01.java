public class LiteralTest01 {

    public static void main(String []args){
        String name="Kapila"; /*program එක run වීමට පෙර programmer විසින්
         direct ම source code එක තුලම kapila යන නම String name යන variable
        එකට assign කිරීමට යොදාගන්නා statement එක.*/

        System.out.println(name); /*program එක run වීමට පෙර  programmer විසින්
         direct ම source code එක තුලම ලබාදුන් නම console එක මත පෙන්වීමට
        යොදාගන්නා statement එක.*/

        Scanner scanner=new Scanner(System.in);
        //program එක run වන අතරතුරදී input ලබාදීමට යොදාගනුලබන statement එකකි

        System.out.print("Input name : ");
        // console එක මත නම ඇතුලත් කල යුතුය යන්න දැක්වීමට යොදගන්නා statement එකකි

        name=scanner.nextLine();
        /* program එක run වන අතරතුරදී අප විසින් ඇතුලත්කරනු ලබන නම String name
         යන variable එකට assign කිරීමට යොදාගන්නා statement එකකි.
        මෙය literal එකක් */

        System.out.println(name);
        /*program එක run වන අතරතුරදී ඇතුලත් කරණලද නම console එක මත පෙන්වීමට
        යොදාගන්නා statement එක.*/



    }
}