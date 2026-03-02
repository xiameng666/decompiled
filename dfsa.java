import android.content.Intent;
import com.google.android.gms.nearby.sharing.WifiCredentialsAttachment;

public final class dfsa implements icih {
    final icih a;

    public dfsa(icih icih0) {
        this.a = icih0;
        super();
    }

    @Override  // icih
    public final Object a(Object object0, ibrl ibrl0) {
        dfrz dfrz0;
        if((ibrl0 instanceof dfrz)) {
            dfrz0 = (dfrz)ibrl0;
            int v = dfrz0.b;
            if((v & 0x80000000) == 0) {
                dfrz0 = new dfrz(this, ibrl0);
            }
            else {
                dfrz0.b = v - 0x80000000;
            }
        }
        else {
            dfrz0 = new dfrz(this, ibrl0);
        }
        Object object1 = dfrz0.a;
        Object object2 = ibrx.a;
        switch(dfrz0.b) {
            case 0: {
                ibnx.b(object1);
                Object object3 = jwh.a(((Intent)object0), "wifi_credentials_attachment", WifiCredentialsAttachment.class);
                dfrz0.b = 1;
                return this.a.a(object3, dfrz0) == object2 ? object2 : ibom.a;
            }
            case 1: {
                ibnx.b(object1);
                return ibom.a;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }
}

