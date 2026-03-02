import com.google.android.libraries.tapandpay.pay.pass.valuable.model.Valuable;

public final class dvur implements gfsi {
    public final dvuz a;
    public final Valuable b;

    public dvur(dvuz dvuz0, Valuable valuable0) {
        this.a = dvuz0;
        this.b = valuable0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        dvuz dvuz0 = this.a;
        if(((Boolean)object0).booleanValue()) {
            dvuz0.d.setVisibility(0);
            return null;
        }
        dvuz0.b(this.b);
        return null;
    }
}

