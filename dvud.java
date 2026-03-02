import com.google.android.libraries.tapandpay.pay.pass.valuable.model.Valuable;

public final class dvud implements evqc {
    public final dvuz a;
    public final Valuable b;
    public final xob c;

    public dvud(dvuz dvuz0, Valuable valuable0, xob xob0) {
        this.a = dvuz0;
        this.b = valuable0;
        this.c = xob0;
    }

    @Override  // evqc
    public final void gv(Exception exception0) {
        ((ggtj)((ggtj)dvuz.a.j()).s(exception0)).B("Failed to fetch images for valuable %s. Hiding spinner and updating valuable.", this.b.b);
        this.a.d(this.c, this.b, ggna.a);
    }
}

