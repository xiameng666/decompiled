import android.graphics.Rect;
import android.view.Choreographer;
import android.view.View;
import android.view.inputmethod.ExtractedText;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

@ibni
public final class jhv implements jhd {
    public final View a;
    public boolean b;
    public ibts c;
    public ibts d;
    public jhk e;
    public jgm f;
    public final List g;
    public final ibnn h;
    public final jfw i;
    public final gwq j;
    public Runnable k;
    public final jgo l;
    private final Executor m;
    private Rect n;

    public jhv(View view0, hvp hvp0) {
        jgo jgo0 = new jgo(view0);
        jhx jhx0 = new jhx(Choreographer.getInstance());
        super();
        this.a = view0;
        this.l = jgo0;
        this.m = jhx0;
        this.c = jhr.a;
        this.d = jhs.a;
        this.e = new jhk("", jbk.a, 4);
        this.f = jgm.a;
        this.g = new ArrayList();
        jhp jhp0 = new jhp(this);
        this.h = ibno.a(ibnp.c, jhp0);
        this.i = new jfw(hvp0, jgo0);
        this.j = new gwq(new jho[16]);
    }

    public final void a() {
        this.l.a().restartInput(this.l.a);
    }

    @Override  // jhd
    @ibni
    public final void b(hka hka0) {
        this.n = new Rect(ibvr.c(hka0.b), ibvr.c(hka0.c), ibvr.c(hka0.d), ibvr.c(hka0.e));
        if(this.g.isEmpty()) {
            Rect rect0 = this.n;
            if(rect0 != null) {
                Rect rect1 = new Rect(rect0);
                this.a.requestRectangleOnScreen(rect1);
            }
        }
    }

    @Override  // jhd
    public final void c() {
        this.e(jho.a);
    }

    @Override  // jhd
    public final void d(jhk jhk0, jgm jgm0, ibts ibts0, ibts ibts1) {
        this.b = true;
        this.e = jhk0;
        this.f = jgm0;
        this.c = ibts0;
        this.d = ibts1;
        this.e(jho.a);
    }

    private final void e(jho jho0) {
        this.j.n(jho0);
        if(this.k == null) {
            jhn jhn0 = new jhn(this);
            this.m.execute(jhn0);
            this.k = jhn0;
        }
    }

    @Override  // jhd
    public final void f() {
        this.b = false;
        this.c = jht.a;
        this.d = jhu.a;
        this.n = null;
        this.e(jho.b);
    }

    @Override  // jhd
    public final void g(jhk jhk0, jhk jhk1) {
        boolean z = !jbk.i(this.e.c, jhk1.c) || !ibuq.m(this.e.d, jhk1.d);
        this.e = jhk1;
        List list0 = this.g;
        int v1 = list0.size();
        for(int v2 = 0; v2 < v1; ++v2) {
            jhe jhe0 = (jhe)((WeakReference)list0.get(v2)).get();
            if(jhe0 != null) {
                jhe0.a = jhk1;
            }
        }
        synchronized(this.i.a) {
            this.i.h = null;
            this.i.j = null;
            this.i.i = null;
            this.i.k = jfu.a;
            this.i.l = null;
            this.i.m = null;
        }
        int v3 = -1;
        if(!ibuq.m(jhk0, jhk1)) {
            if(jhk0 != null && (!ibuq.m(jhk0.a(), jhk1.a()) || jbk.i(jhk0.c, jhk1.c) && !ibuq.m(jhk0.d, jhk1.d))) {
                this.a();
                return;
            }
            List list1 = this.g;
            int v7 = list1.size();
            for(int v = 0; v < v7; ++v) {
                jhe jhe1 = (jhe)((WeakReference)list1.get(v)).get();
                if(jhe1 != null) {
                    jhk jhk2 = this.e;
                    jgo jgo1 = this.l;
                    if(jhe1.d) {
                        jhe1.a = jhk2;
                        if(jhe1.c) {
                            int v8 = jhe1.b;
                            ExtractedText extractedText0 = jgp.a(jhk2);
                            jgo1.a().updateExtractedText(jgo1.a, v8, extractedText0);
                        }
                        jgo1.b(jbk.d(jhk2.c), jbk.c(jhk2.c), (jhk2.d == null ? -1 : jbk.d(jhk2.d.b)), (jhk2.d == null ? -1 : jbk.c(jhk2.d.b)));
                    }
                }
            }
        }
        else if(z) {
            jgo jgo0 = this.l;
            int v4 = jbk.d(jhk1.c);
            int v5 = jbk.c(jhk1.c);
            jbk jbk0 = this.e.d;
            int v6 = jbk0 == null ? -1 : jbk.d(jbk0.b);
            jbk jbk1 = this.e.d;
            if(jbk1 != null) {
                v3 = jbk.c(jbk1.b);
            }
            jgo0.b(v4, v5, v6, v3);
        }
    }

    @Override  // jhd
    public final void h(jhk jhk0, jgz jgz0, jbe jbe0, ibts ibts0, hka hka0, hka hka1) {
        jfw jfw0 = this.i;
        synchronized(jfw0.a) {
            jfw0.h = jhk0;
            jfw0.j = jgz0;
            jfw0.i = jbe0;
            jfw0.k = ibts0;
            jfw0.l = hka0;
            jfw0.m = hka1;
            if(jfw0.c || jfw0.b) {
                jfw0.a();
            }
        }
    }

    @Override  // jhd
    public final void i() {
        this.e(jho.d);
    }

    @Override  // jhd
    public final void j() {
        this.e(jho.c);
    }
}

