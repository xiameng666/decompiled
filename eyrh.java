import java.util.List;

public final class eyrh implements icih {
    final eysa a;
    private int b;

    public eyrh(eysa eysa0) {
        this.a = eysa0;
        super();
    }

    @Override  // icih
    public final Object a(Object object0, ibrl ibrl0) {
        int v = this.b;
        this.b = v + 1;
        if(v < 0) {
            throw new ArithmeticException("Index overflow has happened");
        }
        eysa eysa0 = this.a;
        eysa0.g.c(eysa.a[0], ((List)object0));
        if(v == 0) {
            eysa0.o();
            Object object1 = eysa0.b(ibrl0);
            if(object1 == ibrx.a) {
                return object1;
            }
        }
        return ibom.a;
    }
}

