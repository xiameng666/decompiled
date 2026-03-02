import com.google.android.gms.tapandpay.internal.firstparty.GetFelicaTosAcceptanceRequest;

public final class etdw implements azys {
    public final etgl a;
    public final String b;

    public etdw(etgl etgl0, String s) {
        this.a = etgl0;
        this.b = s;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        etau etau0 = (etau)object0;
        eszv eszv0 = (eszv)etau0.H();
        GetFelicaTosAcceptanceRequest getFelicaTosAcceptanceRequest0 = new GetFelicaTosAcceptanceRequest();
        getFelicaTosAcceptanceRequest0.a = this.b;
        eszv0.w(getFelicaTosAcceptanceRequest0, new etfj(this.a, ((evqp)object1)), cclr.a(etau0.r));
    }
}

