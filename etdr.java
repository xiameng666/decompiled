import com.google.android.gms.tapandpay.internal.firstparty.DisableSelectedTokenRequest;

public final class etdr implements azys {
    public final etgl a;
    public final String b;

    public etdr(etgl etgl0, String s) {
        this.a = etgl0;
        this.b = s;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        etau etau0 = (etau)object0;
        eszv eszv0 = (eszv)etau0.H();
        DisableSelectedTokenRequest disableSelectedTokenRequest0 = new DisableSelectedTokenRequest();
        disableSelectedTokenRequest0.a = this.b;
        eszv0.j(disableSelectedTokenRequest0, new etfh(this.a, ((evqp)object1)), cclr.a(etau0.r));
    }
}

