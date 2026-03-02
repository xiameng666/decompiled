import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.nearby.fastpair.internal.UnregisterConnectionSwitchListenerParams;

public final class cyuk extends cjtm {
    private final cysf a;
    private final UnregisterConnectionSwitchListenerParams b;
    private final String c;

    public cyuk(UnregisterConnectionSwitchListenerParams unregisterConnectionSwitchListenerParams0, String s, cysf cysf0) {
        super(0x109, "UnregisterConnectionSwitchListener");
        this.b = unregisterConnectionSwitchListenerParams0;
        this.c = s;
        this.a = cysf0;
    }

    @Override  // cjtm
    protected final void f(Context context0) {
        if(!hvpp.al()) {
            throw new cjuh(40504, "Api is disabled");
        }
        if(!cygn.b(context0, this.c) && (!azql.c(context0).g(this.c) || !hvpg.a.aY().fM().b.contains(this.c))) {
            throw new cjuh(40500, "Only allow for 1P");
        }
        this.a.c(this.b.b);
        this.b.a.a(new Status(0));
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.b.a.a(status0);
    }
}

