import com.google.android.gms.tapandpay.firstparty.RegisterServiceListenerRequest;

public final class etdn implements azys {
    public final etgl a;
    public final String b;
    public final byte[] c;
    public final azyf d;

    public etdn(etgl etgl0, String s, byte[] arr_b, azyf azyf0) {
        this.a = etgl0;
        this.b = s;
        this.c = arr_b;
        this.d = azyf0;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        etau etau0 = (etau)object0;
        eszv eszv0 = (eszv)etau0.H();
        RegisterServiceListenerRequest registerServiceListenerRequest0 = new RegisterServiceListenerRequest();
        registerServiceListenerRequest0.a = this.b;
        registerServiceListenerRequest0.b = this.c;
        eszv0.c(registerServiceListenerRequest0, new etff(this.a, this.d), cclr.a(etau0.r));
        ((evqp)object1).b(null);
    }
}

