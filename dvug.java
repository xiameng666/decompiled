import com.google.android.libraries.tapandpay.pay.pass.valuable.model.Valuable;

public final class dvug implements evqc {
    public final Valuable a;

    public dvug(Valuable valuable0) {
        this.a = valuable0;
    }

    @Override  // evqc
    public final void gv(Exception exception0) {
        ((ggtj)((ggtj)dvuz.a.i()).s(exception0)).B("Gift card sync failed for valuable ID: %s", this.a.b);
    }
}

