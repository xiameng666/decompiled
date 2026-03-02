import android.app.Application;
import com.google.android.chimera.IntentOperation;

public final class eizy implements ejbo {
    private final IntentOperation a;
    private Object b;

    public eizy(IntentOperation intentOperation0) {
        this.a = intentOperation0;
    }

    @Override  // ejbo
    public final Object h() {
        if(this.b == null) {
            Application application0 = eixx.a(this.a);
            ejbq.a(application0 instanceof ejbo, "Chimera IntentOperation must be attached to a ModuleApplication. Found: %s", new Object[]{application0.getClass()});
            this.b = ((eiyd)((ejal)eixh.a(application0, ejal.class)).b().d()).a();
        }
        return this.b;
    }
}

