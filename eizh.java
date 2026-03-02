import android.app.Application;
import com.google.android.chimera.BoundService;

public final class eizh implements ejbo {
    private final BoundService a;
    private Object b;

    public eizh(BoundService boundService0) {
        this.a = boundService0;
    }

    @Override  // ejbo
    public final Object h() {
        if(this.b == null) {
            Application application0 = eixx.a(this.a);
            ejbq.a(application0 instanceof ejbo, "Chimera BoundService must be attached to a ModuleApplication. Found: %s", new Object[]{application0.getClass()});
            eiyd eiyd0 = (eiyd)((ejal)eixh.a(application0, ejal.class)).b().d();
            eiyd0.b(this.a);
            this.b = eiyd0.a();
        }
        return this.b;
    }
}

