import com.google.android.gms.tapandpay.internal.firstparty.SetFelicaTosAcceptanceRequest;

public final class eteo implements azys {
    public final etgl a;
    public final String b;

    public eteo(etgl etgl0, String s) {
        this.a = etgl0;
        this.b = s;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        etau etau0 = (etau)object0;
        eszv eszv0 = (eszv)etau0.H();
        SetFelicaTosAcceptanceRequest setFelicaTosAcceptanceRequest0 = new SetFelicaTosAcceptanceRequest();
        setFelicaTosAcceptanceRequest0.b = this.b;
        setFelicaTosAcceptanceRequest0.a = true;
        eszv0.ae(setFelicaTosAcceptanceRequest0, new etfi(this.a, ((evqp)object1)), cclr.a(etau0.r));
    }
}

