import com.google.android.libraries.tapandpay.pay.pass.valuable.model.Valuable;

public final class dvum implements evqf {
    public final Valuable a;
    public final boolean b;
    public final fshh c;

    public dvum(Valuable valuable0, boolean z, fshh fshh0) {
        this.a = valuable0;
        this.b = z;
        this.c = fshh0;
    }

    @Override  // evqf
    public final void gw(Object object0) {
        byte[] arr_b = (byte[])object0;
        this.a.M = this.b;
        this.c.f(this.b);
    }
}

