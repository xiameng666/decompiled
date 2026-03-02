import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.nearby.fastpair.internal.IsPeripheralApiEnabledParams;

public final class cyty extends cjtm {
    private final IsPeripheralApiEnabledParams a;
    private final String b;

    public cyty(IsPeripheralApiEnabledParams isPeripheralApiEnabledParams0, String s) {
        super(0x109, "IsPeripheralEnabled");
        this.a = isPeripheralApiEnabledParams0;
        this.b = s;
    }

    @Override  // cjtm
    protected final void f(Context context0) {
        String s = this.b;
        if(!cygn.b(context0, s) && (!azql.c(context0).g(s) || !hvpg.a.aY().fm().b.contains(s))) {
            cygn.c(s);
            cxzx.m(context0, 4, 3, 0);
            throw new cjuh(40500, "Only allow for allowlisted 1P and oem home app");
        }
        cxzx.m(context0, 4, 2, 0);
        this.a.a.a(new Status(0), hvpp.aH());
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.a.a.a(status0, false);
    }
}

