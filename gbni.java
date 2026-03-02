import android.view.View;
import java.util.List;

public abstract class gbni {
    public final gaym a;
    public boolean b;
    public final gbnm c;
    private final ibnn d;

    public gbni(gbnm gbnm0, gaym gaym0) {
        ibuq.f(gaym0, "eventLogger");
        super();
        this.c = gbnm0;
        this.a = gaym0;
        this.d = new ibnz(new gbnh());
    }

    public abstract Object a(View arg1, Object arg2);

    public abstract void b(View arg1);

    public abstract void c(View arg1);

    public final Object d(View view0, Object object0) {
        ibuq.f(view0, "view");
        if(this.b) {
            gbng gbng0 = new gbng();
            gavv.b("BW_VLD_01", this.a, gbng0, 4);
            return null;
        }
        return this.a(view0, object0);
    }

    protected final List e() {
        return (List)this.d.a();
    }

    public final void f(Object object0, boolean z) {
        ibuq.f(object0, "listener");
        if(z) {
            this.e().add(0, object0);
        }
        else {
            this.e().add(object0);
        }
        if(this.e().size() == 1) {
            this.c.h(this);
        }
    }

    public final void g(Object object0) {
        if(this.e().remove(object0) && this.e().isEmpty()) {
            this.c.h(this);
        }
    }

    public final void h(View view0) {
        ibuq.f(view0, "view");
        if(this.e().isEmpty()) {
            this.c(view0);
            return;
        }
        this.b(view0);
    }

    public static void i(gbni gbni0, Object object0) {
        gbni0.f(object0, false);
    }
}

