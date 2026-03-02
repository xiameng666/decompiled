import com.google.android.gms.trustlet.onbody.internal.ModuleInitializationIntentOperation;
import j..util.Objects;

public final class ezkt implements gmbg {
    final String a;
    final ModuleInitializationIntentOperation b;

    public ezkt(ModuleInitializationIntentOperation moduleInitializationIntentOperation0, String s) {
        this.a = s;
        Objects.requireNonNull(moduleInitializationIntentOperation0);
        this.b = moduleInitializationIntentOperation0;
        super();
    }

    @Override  // gmbg
    public final void a(Throwable throwable0) {
        ((ggtj)((ggtj)((ggtj)ModuleInitializationIntentOperation.a.j()).s(throwable0)).ar(0x43E2)).B("[ModuleInitializationIntentOperation] Failed to read shouldEnable() of component %s", this.a);
    }

    @Override  // gmbg
    public final void b(Object object0) {
        Boolean boolean0 = (Boolean)object0;
        if(boolean0 == null) {
            return;
        }
        try {
            bbmq.G(this.b.getApplicationContext(), this.a, boolean0.booleanValue());
        }
        catch(IllegalArgumentException unused_ex) {
        }
    }
}

