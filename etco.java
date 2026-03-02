import com.google.android.gms.tapandpay.internal.firstparty.SetActiveAccountRequest;

public final class etco implements azys {
    public final etgl a;
    public final String b;
    public final boolean c;

    public etco(etgl etgl0, String s, boolean z) {
        this.a = etgl0;
        this.b = s;
        this.c = z;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        etau etau0 = (etau)object0;
        ((eszv)etau0.H()).ad(new SetActiveAccountRequest(this.b, this.c), new etet(this.a, ((evqp)object1)), cclr.a(etau0.r));
    }
}

