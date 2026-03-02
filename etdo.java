import com.google.android.gms.tapandpay.firstparty.RegisterServiceListenerRequest;

public final class etdo implements azys {
    public final etgl a;
    public final String b;
    public final byte[] c;

    public etdo(etgl etgl0, String s, byte[] arr_b) {
        this.a = etgl0;
        this.b = s;
        this.c = arr_b;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        etau etau0 = (etau)object0;
        eszv eszv0 = (eszv)etau0.H();
        RegisterServiceListenerRequest registerServiceListenerRequest0 = new RegisterServiceListenerRequest();
        registerServiceListenerRequest0.a = this.b;
        registerServiceListenerRequest0.b = this.c;
        eszv0.S(registerServiceListenerRequest0, new etfd(this.a, ((evqp)object1)), cclr.a(etau0.r));
    }
}

