import java.util.List;

public final class jpc extends ibur implements ibts {
    final List a;

    public jpc(List list0) {
        this.a = list0;
        super(1);
    }

    @Override  // ibts
    public final Object a(Object object0) {
        List list0 = this.a;
        int v = ibpo.d(list0);
        if(v >= 0) {
            for(int v1 = 0; true; ++v1) {
                ibp.A(((ibp)object0), ((ibq)list0.get(v1)), 0, 0);
                if(v1 == v) {
                    break;
                }
            }
        }
        return ibom.a;
    }
}

