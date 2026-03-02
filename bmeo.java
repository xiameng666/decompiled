import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.fido.fido2.api.StateUpdate;

public final class bmeo implements azys {
    public final bmfn a;
    public final StateUpdate b;

    public bmeo(bmfn bmfn0, StateUpdate stateUpdate0) {
        this.a = bmfn0;
        this.b = stateUpdate0;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        bmnu bmnu0 = (bmnu)object0;
        bmfl bmfl0 = new bmfl(this.a, ((evqp)object1));
        bmoa bmoa0 = (bmoa)bmnu0.H();
        ApiMetadata apiMetadata0 = cclr.a(bmnu0.r);
        bmoa0.j(this.a.a.toString(), bmfl0, this.b, apiMetadata0);
    }
}

