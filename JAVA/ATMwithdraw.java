public class ATMwithdraw {
    public static void main(String[] args){
        int bal = 4500;
        int withdraw = 4400;
        if(withdraw <= bal){
            bal = bal - withdraw;
            System.out.println("withdraw is succefully");
            System.out.println("remaninaing  bal :" + bal);
        }
        else{
            System.out.println("InSufficient Blances");
        }
    }
    
}
