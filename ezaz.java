import com.google.android.gms.trustagent.common.framework.ModuleInitializer;
import j..util.Objects;

public final class ezaz implements gmbg {
    final String a;
    final ModuleInitializer b;

    public ezaz(ModuleInitializer moduleInitializer0, String s) {
        this.a = s;
        Objects.requireNonNull(moduleInitializer0);
        this.b = moduleInitializer0;
        super();
    }

    @Override  // gmbg
    public final void a(Throwable throwable0) {
        ((ggtj)((ggtj)((ggtj)ModuleInitializer.a.j()).s(throwable0)).ar(0x4365)).B("Failed to read shouldEnable() of component %s", this.a);
    }

    @Override  // gmbg
    public final void b(Object object0) {
        Boolean boolean0 = (Boolean)object0;
        if(boolean0 == null) {
            return;
        }
        try {
            bbmq.G(this.b, this.a, boolean0.booleanValue());
        }
        catch(IllegalArgumentException unused_ex) {
        }
    }
}

