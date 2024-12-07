public class NulPointerExceptionExample {
    public static void main(String[] args) {
        try{
            String text = null;
            int length = text.length();
        }catch(NullPointerException e){
            System.out.println("NullPointerException발생:"+e.getMessage());
        }
    }
}
