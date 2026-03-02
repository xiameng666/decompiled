import android.content.Context;
import android.os.Trace;
import androidx.camera.lifecycle.LifecycleCamera;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public final class bvb {
    public final Object a;
    public bao b;
    public gmcd c;
    public gmcd d;
    public bam e;
    public bve f;
    public Context g;
    public final Map h;
    public final HashSet i;

    public bvb() {
        this.a = new Object();
        this.d = bpt.b(null);
        this.h = new HashMap();
        this.i = new HashSet();
    }

    public final void a(bam bam0, Context context0) {
        synchronized(this.a) {
            this.e = bam0;
            this.g = context0;
        }
    }

    public final void b(int v) {
        if(this.d()) {
            bam bam0 = this.e;
            ibuq.c(bam0);
            ayv ayv0 = bam0.d().c;
            Object object0 = ayv0.a;
            synchronized(object0) {
                if(v == ayv0.f) {
                    return;
                }
                ayv0.f = v;
                ArrayList arrayList0 = new ArrayList(ayv0.b);
            }
            for(Object object1: arrayList0) {
                synchronized(((bje)object1).a) {
                    ((bje)object1).b = 1;
                }
            }
        }
    }

    public final void c() {
        oyn.a("CX:unbindAll");
        try {
            boj.b();
            this.b(0);
            bve bve0 = this.f;
            ibuq.c(bve0);
            synchronized(bve0.a) {
                for(Object object1: this.i) {
                    LifecycleCamera lifecycleCamera0 = (LifecycleCamera)bve0.b.get(((bvd)object1));
                    if(lifecycleCamera0 != null) {
                        synchronized(lifecycleCamera0.a) {
                            List list0 = lifecycleCamera0.c.a();
                            lifecycleCamera0.c.f(list0);
                            lifecycleCamera0.e = null;
                        }
                        bve0.c(lifecycleCamera0.a());
                    }
                }
            }
        }
        finally {
            Trace.endSection();
        }
    }

    public final boolean d() {
        return this.e != null;
    }
}

