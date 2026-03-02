import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public abstract class eglh extends cjtm {
    private final boolean VH;
    private gfug VI;
    private final String VJ;
    public final basb f;
    protected final String g;
    protected final int h;
    public final String i;
    public boolean j;
    public boolean n;
    public final Set o;
    public final Set p;
    protected efpo q;

    public eglh(String s, int v, String s1, String s2, azug azug0) {
        this(s, v, s1, s2, azug0, null);
    }

    protected eglh(String s, int v, String s1, String s2, azug azug0, byte[] arr_b) {
        super(5, s2, azug0);
        boolean z = false;
        this.j = false;
        this.n = false;
        this.o = new HashSet();
        this.p = new HashSet();
        batl.q(s);
        if(v != 0) {
            z = true;
        }
        batl.b(z);
        this.g = s;
        this.h = v;
        this.VJ = s2;
        this.i = s1;
        boolean z1 = hxen.d();
        this.VH = z1;
        if(z1) {
            this.VI = gfug.c(gfqs.a);
        }
        this.f = new eglg(this);
    }

    public abstract void d(Context arg1, azug arg2);

    @Override  // cjtm
    public final void f(Context context0) {
        try {
            if(this.VH) {
                String s = this.VJ;
                if(efpo.b(s) == 1) {
                    efpo efpo0 = new efpo(s);
                    this.q = efpo0;
                    efpo0.b = this.i;
                    efpo0.c = this.g;
                    efpo0.d(1, 0);
                    this.d(context0, this.m);
                    this.q.a(efpr.p(2, this.VI.a(TimeUnit.MICROSECONDS)));
                    efpo efpo1 = this.q;
                    String s1 = efpo1.b;
                    String s2 = efpo1.c;
                    int v1 = efpo1.m;
                    int v2 = efpo1.e;
                    List list0 = efpo1.d;
                    double f = hxen.a.b().a();
                    efpo1.a.q(1, efpo1.l, s1, s2, v1, v2, 0, list0, null, null, null, f);
                    this.VI.g();
                }
                else {
                    this.d(context0, this.m);
                }
            }
            else {
                this.d(context0, this.m);
            }
        }
        finally {
            this.g(this.j);
        }
    }

    public final void g(boolean z) {
        if(z) {
            for(Object object0: this.o) {
                ((DataHolder)object0).close();
            }
            for(Object object1: this.p) {
                ((ehju)object1).close();
            }
        }
        else {
            for(Object object2: this.p) {
                egig.k("PipeCreator", "This log should only show up during unit tests.");
                ((ehju)object2).a(false);
            }
        }
        this.kp(z);
    }

    @Override  // cjtm
    public final void j(Status status0) {
    }

    protected void kp(boolean z) {
    }
}

