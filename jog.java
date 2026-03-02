import java.util.List;

final class jog extends ibur implements ibts {
    final List a;

    public jog(List list0) {
        this.a = list0;
        super(1);
    }

    @Override  // ibts
    public final Object a(Object object0) {
        List list0 = this.a;
        int v = list0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            ibp.A(((ibp)object0), ((ibq)list0.get(v1)), 0, 0);
        }
        return ibom.a;
    }
}

