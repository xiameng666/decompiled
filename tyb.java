import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import jeb.synthetic.FIN;

public final class tyb implements ComponentCallbacks2, unl {
    public static final uoy a;
    protected final txc b;
    protected final Context c;
    final unk d;
    public final CopyOnWriteArrayList e;
    private static final uoy f;
    private final unt g;
    private final uns h;
    private final uoa i;
    private final Runnable j;
    private final ung k;
    private uoy l;

    static {
        uoy uoy0 = uoy.b(Bitmap.class);
        uoy0.U();
        tyb.f = uoy0;
        uoy.b(umm.class).U();
        tyb.a = (uoy)((uoy)uoy.c(udf.c).E(txn.d)).W();
    }

    public tyb(txc txc0, unk unk0, uns uns0, Context context0) {
        unt unt0 = new unt();
        super();
        this.i = new uoa();
        txy txy0 = new txy(this);
        this.j = txy0;
        this.b = txc0;
        this.d = unk0;
        this.h = uns0;
        this.g = unt0;
        this.c = context0;
        Context context1 = context0.getApplicationContext();
        tya tya0 = new tya(this, unt0);
        unh unh0 = jwe.a(context1, "android.permission.ACCESS_NETWORK_STATE") == 0 ? new unh(context1, tya0) : new unp();
        this.k = unh0;
        List list0 = txc0.e;
        __monitor_enter(list0);
        int v = FIN.finallyOpen$NT();
        if(!txc0.e.contains(this)) {
            txc0.e.add(this);
            FIN.finallyCodeBegin$NT(v);
            if(uqq.k()) {
                uqq.i(txy0);
            }
            else {
                unk0.a(this);
            }
            unk0.a(unh0);
            this.e = new CopyOnWriteArrayList(txc0.c.c);
            this.q(txc0.c.b());
            return;
        }
        throw new IllegalStateException("Cannot register already registered manager");
    }

    public final txx a(Class class0) {
        return new txx(this.b, this, class0, this.c);
    }

    public final txx b() {
        return this.a(Bitmap.class).b(tyb.f);
    }

    public final txx c() {
        return this.a(Drawable.class);
    }

    public final txx d(Bitmap bitmap0) {
        return this.c().h(bitmap0).b(uoy.c(udf.b));
    }

    public final txx e(Drawable drawable0) {
        return this.c().h(drawable0).b(uoy.c(udf.b));
    }

    public final txx f(Uri uri0) {
        return this.c().f(uri0);
    }

    public final txx g(Object object0) {
        return this.c().h(object0);
    }

    public final txx h(String s) {
        return this.c().h(s);
    }

    final uoy i() {
        synchronized(this) {
        }
        return this.l;
    }

    public final void j(View view0) {
        this.k(new txz(view0));
    }

    public final void k(upn upn0) {
        if(upn0 != null) {
            boolean z = this.s(upn0);
            uot uot0 = upn0.d();
            if(!z) {
                List list0 = this.b.e;
                synchronized(list0) {
                    for(Object object0: list0) {
                        if(((tyb)object0).s(upn0)) {
                            return;
                        }
                    }
                }
                if(uot0 != null) {
                    upn0.i(null);
                    uot0.c();
                }
            }
        }
    }

    @Override  // unl
    public final void l() {
        __monitor_enter(this);
        int v = FIN.finallyOpen$NT();
        this.i.l();
        this.t();
        unt unt0 = this.g;
        for(Object object0: uqq.f(unt0.a)) {
            unt0.a(((uot)object0));
        }
        unt0.b.clear();
        this.d.b(this);
        this.d.b(this.k);
        uqq.e().removeCallbacks(this.j);
        List list0 = this.b.e;
        __monitor_enter(list0);
        int v1 = FIN.finallyOpen$NT();
        if(list0.contains(this)) {
            list0.remove(this);
            FIN.finallyCodeBegin$NT(v1);
            __monitor_exit(list0);
            FIN.finallyCodeEnd$NT(v1);
            FIN.finallyCodeBegin$NT(v);
            return;
        }
        throw new IllegalStateException("Cannot unregister not yet registered manager");
    }

    @Override  // unl
    public final void m() {
        synchronized(this) {
            this.p();
            this.i.m();
        }
    }

    @Override  // unl
    public final void n() {
        synchronized(this) {
            this.i.n();
            this.o();
        }
    }

    public final void o() {
        synchronized(this) {
            unt unt0 = this.g;
            unt0.c = true;
            for(Object object0: uqq.f(unt0.a)) {
                uot uot0 = (uot)object0;
                if(uot0.n()) {
                    uot0.f();
                    unt0.b.add(uot0);
                }
            }
        }
    }

    @Override  // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration0) {
    }

    @Override  // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override  // android.content.ComponentCallbacks2
    public final void onTrimMemory(int v) {
    }

    public final void p() {
        synchronized(this) {
            unt unt0 = this.g;
            unt0.c = false;
            for(Object object0: uqq.f(unt0.a)) {
                uot uot0 = (uot)object0;
                if(!uot0.l() && !uot0.n()) {
                    uot0.b();
                }
            }
            unt0.b.clear();
        }
    }

    protected final void q(uoy uoy0) {
        synchronized(this) {
            uoy uoy1 = (uoy)uoy0.j();
            uoy1.X();
            this.l = uoy1;
        }
    }

    final void r(upn upn0, uot uot0) {
        synchronized(this) {
            this.i.a.add(upn0);
            unt unt0 = this.g;
            unt0.a.add(uot0);
            if(!unt0.c) {
                uot0.b();
                return;
            }
            uot0.c();
            unt0.b.add(uot0);
        }
    }

    final boolean s(upn upn0) {
        synchronized(this) {
            uot uot0 = upn0.d();
            if(uot0 == null) {
                return true;
            }
            if(this.g.a(uot0)) {
                this.i.a.remove(upn0);
                upn0.i(null);
                return true;
            }
        }
        return false;
    }

    private final void t() {
        synchronized(this) {
            Set set0 = this.i.a;
            for(Object object0: uqq.f(set0)) {
                this.k(((upn)object0));
            }
            set0.clear();
        }
    }

    @Override
    public final String toString() {
        synchronized(this) {
        }
        return super.toString() + "{tracker=" + this.g + ", treeNode=" + this.h + "}";
    }
}

