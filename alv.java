import android.util.Log;

public final class alv implements lqj {
    public final amf a;

    public alv(amf amf0) {
        this.a = amf0;
    }

    @Override  // lqj
    public final void jS(Object object0) {
        if(((Boolean)object0).booleanValue()) {
            amf amf0 = this.a;
            amj amj0 = amf0.a;
            if(amj0.j) {
                amj0.h().execute(new alp(amf0));
            }
            else {
                Log.w("BiometricFragment", "Failure not sent to client. Client is not awaiting a result.");
            }
            amf0.a.j(false);
        }
    }
}

