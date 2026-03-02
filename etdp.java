import com.google.android.gms.tapandpay.firstparty.CheckContactlessEligibilityRequest;

public final class etdp implements azys {
    public final etgl a;
    public final String b;

    public etdp(etgl etgl0, String s) {
        this.a = etgl0;
        this.b = s;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        etau etau0 = (etau)object0;
        eszv eszv0 = (eszv)etau0.H();
        CheckContactlessEligibilityRequest checkContactlessEligibilityRequest0 = new CheckContactlessEligibilityRequest();
        checkContactlessEligibilityRequest0.a = this.b;
        eszv0.e(checkContactlessEligibilityRequest0, new etfp(this.a, ((evqp)object1)), cclr.a(etau0.r));
    }
}

