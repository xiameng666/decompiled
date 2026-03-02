import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;

public final class eizo implements ejbo {
    private volatile Object a;
    private final Object b;
    private final du c;
    private final eizv d;

    public eizo(du du0) {
        this.b = new Object();
        this.c = du0;
        this.d = new eizv(du0);
    }

    public static final Context a(Context context0) {
        while((context0 instanceof ContextWrapper) && !(context0 instanceof Activity)) {
            context0 = ((ContextWrapper)context0).getBaseContext();
        }
        return context0;
    }

    @Override  // ejbo
    public final Object h() {
        if(this.a == null) {
            Object object0 = this.b;
            synchronized(object0) {
                if(this.a == null) {
                    du du0 = this.c;
                    if(du0.getHost() == null) {
                        throw new NullPointerException("Hilt Fragments must be attached before creating the component.");
                    }
                    ejbq.a(du0.getHost() instanceof ejbo, "Hilt Fragments must be attached to an @AndroidEntryPoint Activity. Found: %s", new Object[]{du0.getHost().getClass()});
                    eiyb eiyb0 = (eiyb)((eizm)eixh.a(du0.getHost(), eizm.class)).b().d();
                    eiyb0.c(this.d.a());
                    eiyb0.b(du0);
                    this.a = eiyb0.a();
                    return this.a;
                }
            }
            return this.a;
        }
        return this.a;
    }
}

