import com.google.android.libraries.tapandpay.pay.pass.valuable.model.Valuable;

public final class dvtq implements evqc {
    public final dvts a;

    public dvtq(dvts dvts0) {
        this.a = dvts0;
    }

    @Override  // evqc
    public final void gv(Exception exception0) {
        ((ggtj)((ggtj)dvts.a.j()).s(exception0)).B("Failed to read image for valuable: %s", ((Valuable)this.a.am.d()).b);
        dvlr dvlr0 = this.a.al;
        String s = ((Valuable)this.a.am.d()).b;
        dvlr0.a(gjco.b, gjct.b, gjcr.c, s);
    }
}

