import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.fido.u2f.api.StateUpdate;

public final class bnci implements azys {
    public final bncl a;
    public final StateUpdate b;

    public bnci(bncl bncl0, StateUpdate stateUpdate0) {
        this.a = bncl0;
        this.b = stateUpdate0;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        bnfv bnfv0 = (bnfv)object0;
        bnft bnft0 = (bnft)bnfv0.H();
        bnck bnck0 = new bnck(this.a, ((evqp)object1));
        ApiMetadata apiMetadata0 = cclr.a(bnfv0.r);
        bnft0.b(bnck0, this.b, apiMetadata0);
    }
}

