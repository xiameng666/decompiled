import android.app.Application;
import com.google.android.chimera.Service;

public final class eizi implements ejbo {
    private final Service a;
    private Object b;

    public eizi(Service service0) {
        this.a = service0;
    }

    @Override  // ejbo
    public final Object h() {
        if(this.b == null) {
            Application application0 = eixx.a(this.a);
            ejbq.a(application0 instanceof ejbo, "Chimera Service must be attached to a ModuleApplication. Found: %s", new Object[]{application0.getClass()});
            eiyd eiyd0 = (eiyd)((ejal)eixh.a(application0, ejal.class)).b().d();
            eiyd0.c(this.a);
            this.b = eiyd0.a();
        }
        return this.b;
    }
}

