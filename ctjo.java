import android.webkit.WebView;

final class ctjo extends ibsl implements ibtw {
    int a;
    final icmn b;
    final bboh c;
    final WebView d;

    public ctjo(icmn icmn0, bboh bboh0, WebView webView0, ibrl ibrl0) {
        this.b = icmn0;
        this.c = bboh0;
        this.d = webView0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((ctjo)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new ctjo(this.b, this.c, this.d, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            ctjn ctjn0 = new ctjn(this.d);
            this.a = 1;
            if(this.b.oR(ctjn0, this) == object1) {
                return object1;
            }
        }
        throw new ibnm();
    }
}

