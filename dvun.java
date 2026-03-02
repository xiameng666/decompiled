import com.google.android.libraries.tapandpay.pay.pass.valuable.model.Valuable;

public final class dvun implements evqc {
    public final Valuable a;

    public dvun(Valuable valuable0) {
        this.a = valuable0;
    }

    @Override  // evqc
    public final void gv(Exception exception0) {
        ((ggtj)((ggtj)dvuz.a.i()).s(exception0)).B("Failed to update notifications settings for valuable ID: %s", this.a.b);
    }
}

