//상품 클래스
class Prod{
    int id;
    String nm;

    Prod(int i, String n){
        id = i;
        nm = n;
    }

    void info(){
        System.out.println(id+nm);
    }
}

class ExtProd extends Prod{
    int qty;

    ExtProd(int i, String n, int q){
        super(i,n);
        qty = q;
    }

    @Override
    void info(){
        super.info();
        System.out.println(qty);
    }
}

public class ProdTest {
    public static void main(String[] args) {
        Prod p = new Prod(1,"Pen");
        ExtProd ep = new ExtProd(2, "Notebook", 10);

        p.info();
        ep.info();
    }
}
