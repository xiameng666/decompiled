import android.app.Activity;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;

@ibnh
public final class aauk {
    public final fhwk a;
    public String b;
    public boolean c;
    public WeakReference d;
    public final HashMap e;
    public final HashMap f;
    private final fhvw g;

    public aauk(fhwk fhwk0, fhvw fhvw0) {
        ibuq.f(fhwk0, "viewVisualElements");
        super();
        this.a = fhwk0;
        this.g = fhvw0;
        this.e = new HashMap();
        this.f = new HashMap();
    }

    public final void a(View view0, grwb grwb0) {
        int v;
        ibuq.f(grwb0, "config");
        if(this.c && (grwb0.b & 1) != 0) {
            HashMap hashMap0 = this.e;
            if(!ibuq.m(hashMap0.get(view0), grwb0)) {
                hashMap0.put(view0, grwb0);
                fhwk fhwk0 = this.a;
                fhvo fhvo0 = fhwk0.a.a(grwb0.c);
                if(((ProtoLiteMessage)grwb0).isImmutable()) {
                    v = ((ProtoLiteMessage)grwb0).s();
                }
                else {
                    v = grwb0.memoizedHashCode;
                    if(v == 0) {
                        v = ((ProtoLiteMessage)grwb0).s();
                        grwb0.memoizedHashCode = v;
                    }
                }
                fhvo0.d(fibi.a(v));
                gqxw gqxw0 = grwb0.d == null ? gqxw.a : grwb0.d;
                ibuq.e(gqxw0, "getMetadata(...)");
                fhvo0.d(aauk.g(gqxw0));
                fhwk0.f(view0, fhvo0);
            }
        }
    }

    public final void b(View view0, View view1, grwb grwb0) {
        ibuq.f(view0, "view");
        ibuq.f(grwb0, "config");
        if(this.c && (grwb0.b & 1) != 0) {
            HashMap hashMap0 = this.e;
            if(!ibuq.m(hashMap0.get(view0), grwb0)) {
                hashMap0.put(view0, grwb0);
                ggdy ggdy0 = new ggdy();
                HashMap hashMap1 = this.f;
                List list0 = (List)hashMap1.get(view1);
                if(list0 == null) {
                    list0 = ibps.a;
                }
                ggdy0.k(list0);
                ggdy0.i(view0);
                hashMap1.put(view1, ggdy0.h());
                fhvo fhvo0 = this.f(grwb0);
                this.a.f(view0, fhvo0);
            }
        }
    }

    public final void c(View view0) {
        ibuq.f(view0, "view");
        if(this.e.get(view0) != null) {
            fhvv fhvv0 = fhvv.d();
            this.g.a(fhvv0, view0);
        }
    }

    public final void d() {
        Activity activity0 = this.d == null ? null : ((Activity)this.d.get());
        if(activity0 != null && !activity0.isDestroyed()) {
            this.a.c(activity0);
        }
        this.d = null;
        this.c = false;
    }

    public final void e(View view0) {
        HashMap hashMap0 = this.e;
        if(hashMap0.get(view0) != null) {
            HashMap hashMap1 = this.f;
            List list0 = (List)hashMap1.get(view0);
            if(list0 == null) {
                list0 = ibps.a;
            }
            for(Object object0: list0) {
                View view1 = (View)object0;
                if(hashMap0.get(view1) != null) {
                    hashMap0.remove(view1);
                    this.a.d(view1);
                }
            }
            hashMap0.remove(view0);
            hashMap1.remove(view0);
            this.a.d(view0);
        }
    }

    public final fhvo f(grwb grwb0) {
        fhvo fhvo0 = this.a.a.a(grwb0.c);
        gqxw gqxw0 = grwb0.d == null ? gqxw.a : grwb0.d;
        ibuq.e(gqxw0, "getMetadata(...)");
        fhvo0.d(aauk.g(gqxw0));
        return fhvo0;
    }

    public static final fhvp g(gqxw gqxw0) {
        hfta hfta0 = aawl.a;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gqxj.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gqxj gqxj0 = (gqxj)hftp0.b_message;
        gqxw0.getClass();
        gqxj0.c = gqxw0;
        gqxj0.b |= 1;
        return new fhvp(hfta0, hftp0.N_build());
    }
}

