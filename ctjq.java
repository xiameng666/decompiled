import android.webkit.WebView;

final class ctjq extends ibsl implements ibtw {
    int a;
    final ibvd b;
    final WebView c;
    final String d;

    public ctjq(ibvd ibvd0, WebView webView0, String s, ibrl ibrl0) {
        this.b = ibvd0;
        this.c = webView0;
        this.d = s;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((ctjq)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new ctjq(this.b, this.c, this.d, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            icnl icnl0 = (icnl)this.b.a;
            ctjp ctjp0 = new ctjp(this.c, this.d);
            this.a = 1;
            if(icnl0.oR(ctjp0, this) == object1) {
                return object1;
            }
        }
        throw new ibnm();
    }
}

