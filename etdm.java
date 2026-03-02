import com.google.android.gms.tapandpay.firstparty.GetParentalConsentIntentRequest;

public final class etdm implements azys {
    public final etgl a;
    public final int b;
    public final String c;

    public etdm(etgl etgl0, int v, String s) {
        this.a = etgl0;
        this.b = v;
        this.c = s;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        etau etau0 = (etau)object0;
        eszv eszv0 = (eszv)etau0.H();
        GetParentalConsentIntentRequest getParentalConsentIntentRequest0 = new GetParentalConsentIntentRequest();
        getParentalConsentIntentRequest0.a = this.b;
        getParentalConsentIntentRequest0.b = this.c;
        eszv0.B(getParentalConsentIntentRequest0, new etgb(this.a, ((evqp)object1)), cclr.a(etau0.r));
    }
}

