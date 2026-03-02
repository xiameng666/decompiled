import android.view.View;
import j..util.Objects;

public final class fodr implements fodo {
    private final ficq a;
    private final focv b;
    private final gfsx c;
    private final gful_cronetEngineProvider d;

    public fodr(fnfm fnfm0, fnir fnir0, ficq ficq0, gfsx gfsx0, gful_cronetEngineProvider gful0) {
        this.a = ficq0;
        this.c = gfsx0;
        this.d = gful0;
        this.b = new focv(this, new fodq(this, ficq0), fnfm0, fnir0);
    }

    @Override  // fodo
    public final void a(View view0, int v) {
        frbi.c();
        focu focu0 = new focu(this.b, view0, v);
        view0.addOnAttachStateChangeListener(focu0);
        Object object0 = this.b.a.a();
        this.b.b(view0, v, object0);
        if(view0.isAttachedToWindow()) {
            focu0.onViewAttachedToWindow(view0);
        }
    }

    @Override  // fodo
    public final void b(View view0, int v) {
        frbi.c();
        this.a.b().f(view0, this.h(v));
    }

    @Override  // fodo
    public final void c(View view0, int v) {
        frbi.c();
        this.a.b().g(view0, this.h(v));
    }

    @Override  // fodo
    public final void d(View view0, int v, fhvp fhvp0) {
        frbi.c();
        fhwk fhwk0 = this.a.b();
        fhvo fhvo0 = this.h(v);
        fhvo0.d(fhvp0);
        fhwk0.f(view0, fhvo0);
    }

    @Override  // fodo
    public final void e(View view0) {
        frbi.c();
        this.a.b().d(view0);
    }

    @Override  // fodo
    public final void f(fhvt fhvt0, View view0) {
        gfsx gfsx0 = this.c;
        if(gfsx0.i()) {
            Object object0 = gfsx0.d();
            hfta hfta0 = fodi.b;
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)fodj.a).v_newBuilder();
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gjbn.a).v_newBuilder();
            String s = ((fodt)object0).a;
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            gjbn gjbn0 = (gjbn)hftp1.b_message;
            gjbn0.b |= 1;
            gjbn0.c = s;
            gjbn gjbn1 = (gjbn)hftp1.N_build();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            fodj fodj0 = (fodj)hftp0.b_message;
            gjbn1.getClass();
            fodj0.c = gjbn1;
            fodj0.b |= 1;
            fhvt0.b(new fhvu(hfta0, ((fodj)hftp0.N_build())));
        }
        fhvw fhvw0 = this.a.a();
        fhvu fhvu0 = (fhvu)view0.getTag(0x7F0B1764);  // id:interaction_info_tag
        if(fhvu0 != null) {
            fhvt0.b(fhvu0);
            view0.setTag(0x7F0B1764, null);  // id:interaction_info_tag
        }
        fhvw0.a(fhvt0.a(), view0);
    }

    public final fhvo g(int v, gfsx gfsx0) {
        fhvq fhvq1;
        fhvo fhvo0 = this.a.c().a(v);
        gfsx gfsx1 = this.c;
        if(gfsx1.i()) {
            Object object0 = gfsx1.d();
            hfta hfta0 = fodi.a;
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)fodk.a).v_newBuilder();
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gjbo.a).v_newBuilder();
            String s = ((fodt)object0).a;
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            gjbo gjbo0 = (gjbo)hftp1.b_message;
            gjbo0.b |= 1;
            gjbo0.c = s;
            gjbo gjbo1 = (gjbo)hftp1.N_build();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            fodk fodk0 = (fodk)hftp0.b_message;
            gjbo1.getClass();
            fodk0.c = gjbo1;
            fodk0.b |= 1;
            fhvo0.d(new fhvp(hfta0, ((fodk)hftp0.N_build())));
        }
        fhvq fhvq0 = (fhvq)this.d.mr();
        if(fhvq0 != null) {
            fhvo0.e(fhvq0);
            return fhvo0;
        }
        if(gfsx0.i()) {
            focr focr0 = (focr)gfsx0.d();
            switch(focr0.b - 1) {
                case 0: {
                    fhvq1 = fhwp.b(((String)Objects.requireNonNull(focr0.a)));
                    break;
                }
                case 1: {
                    fhvq1 = fhwp.a();
                    break;
                }
                default: {
                    fhvq1 = fhwp.c();
                }
            }
            fhvo0.e(fhvq1);
        }
        return fhvo0;
    }

    private final fhvo h(int v) {
        return this.g(v, gfqx.a);
    }
}

