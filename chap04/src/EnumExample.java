enum CardType{
    DEBIT, CREDIT, PREPAID
}

public class EnumExample {
    public static void main(String[] args) {
        CardType myCardType = CardType.DEBIT;

        switch(myCardType){
            case DEBIT:
                System.out.println("직불카드");
                break;
            case CREDIT:
                System.out.println("신용카드");
                break;
            case PREPAID:
                System.out.println("선불카드");
                break;
            default:
                System.out.println("알수없음");
                break;
        }
    }
}
