import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

public final class gbnm {
    public final gaym a;
    public final List b;
    public final List c;
    private final ibnn d;
    private final ibnn e;
    private final ibnn f;

    public gbnm(gaym gaym0) {
        ibuq.f(gaym0, "eventLogger");
        super();
        this.a = gaym0;
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.d = new ibnz(new gbnj(this));
        this.e = new ibnz(new gbnk(this));
        this.f = new ibnz(new gbnl(this));
    }

    public final gbnn a() {
        return (gbnn)this.e.a();
    }

    public final gbno b() {
        return (gbno)this.f.a();
    }

    public final void c(View.OnFocusChangeListener view$OnFocusChangeListener0) {
        gbni.i(((gbnf)this.d.a()), view$OnFocusChangeListener0);
    }

    public final void d(View.OnClickListener view$OnClickListener0) {
        ibuq.f(view$OnClickListener0, "onClickListener");
        this.e(view$OnClickListener0, false);
    }

    public final void e(View.OnClickListener view$OnClickListener0, boolean z) {
        ibuq.f(view$OnClickListener0, "onClickListener");
        this.a().f(view$OnClickListener0, z);
    }

    public final void f(View view0) {
        ibuq.f(view0, "view");
        boolean z = true;
        gftb.f(((boolean)(view0.hasOnClickListeners() ^ 1)), "Can not add a view with click listeners to ViewObserver. View: %s", view0);
        if(view0.getOnFocusChangeListener() != null) {
            z = false;
        }
        gftb.f(z, "Can not add a view with focus listener to ViewObserver. View: %s", view0);
        for(Object object0: this.c) {
            ((gbni)object0).h(view0);
        }
        this.b.add(view0);
    }

    public final void g() {
        for(Object object0: this.c) {
            gbni gbni0 = (gbni)object0;
            if(!gbni0.e().isEmpty()) {
                gbni0.e().clear();
                gbni0.c.h(gbni0);
            }
        }
    }

    public final void h(gbni gbni0) {
        for(Object object0: this.b) {
            gbni0.h(((View)object0));
        }
    }

    public final void i(View.OnClickListener view$OnClickListener0) {
        this.a().g(view$OnClickListener0);
    }

    public final void j(View view0) {
        ibuq.f(view0, "view");
        for(Object object0: this.c) {
            ((gbni)object0).c(view0);
        }
        this.b.remove(view0);
    }
}

