import java.util.List;

public final class iab extends ifv {
    final iag a;
    final ibtw b;

    public iab(iag iag0, ibtw ibtw0, String s) {
        this.a = iag0;
        this.b = ibtw0;
        super(s);
    }

    @Override  // iau
    public final iav e(iax iax0, List list0, long v) {
        iag iag0 = this.a;
        hzy hzy0 = iag0.f;
        hzy0.a = iax0.p();
        hzy0.b = iax0.dX();
        hzy0.c = iax0.dY();
        if(!iax0.ep() && iag0.a.i != null) {
            iag0.e = 0;
            jkp jkp0 = new jkp(v);
            iav iav0 = (iav)this.b.a(iag0.g, jkp0);
            return new hzz(iav0, iag0, iag0.e, iav0);
        }
        iag0.d = 0;
        jkp jkp1 = new jkp(v);
        iav iav1 = (iav)this.b.a(hzy0, jkp1);
        return new iaa(iav1, iag0, iag0.d, iav1);
    }
}

