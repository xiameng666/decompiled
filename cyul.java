import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.nearby.fastpair.internal.UnregisterPeripheralChangeParams;

public final class cyul extends cyua {
    private final cysk g;

    public cyul(UnregisterPeripheralChangeParams unregisterPeripheralChangeParams0, String s, int v, int v1, cysk cysk0) {
        super("UnregisterPeripheralChange", unregisterPeripheralChangeParams0, s, v, v1, 5);
        this.g = cysk0;
    }

    @Override  // cjtm
    protected final void f(Context context0) {
        String s = this.c;
        if(!cygn.b(context0, s) && (!azql.c(context0).g(s) || !hvpg.a.aY().fN().b.contains(s))) {
            cygn.c(s);
            this.b(context0, 3);
            throw new cjuh(40500, "Only allow for allowlisted 1P and oem home app");
        }
        UnregisterPeripheralChangeParams unregisterPeripheralChangeParams0 = (UnregisterPeripheralChangeParams)this.b;
        this.g.a(unregisterPeripheralChangeParams0.b);
        this.b(context0, 2);
        unregisterPeripheralChangeParams0.a.a(new Status(0));
    }

    @Override  // cjtm
    public final void j(Status status0) {
        ((UnregisterPeripheralChangeParams)this.b).a.a(status0);
    }
}

