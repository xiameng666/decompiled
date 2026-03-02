import android.util.Size;
import androidx.camera.view.PreviewView;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.LinkedHashSet;

public final class hbtk implements lps {
    public static final bart a;
    public final hbtn b;
    public final bbc c;
    public final bab d;
    public final hbtl e;
    public final hbtf f;
    public final gmcd g;
    public final lpw h;
    public Size i;
    public WeakReference j;
    private final hbqy k;
    private final hbra l;

    static {
        hbtk.a = new bart("CameraXSource", "");
    }

    public hbtk(hbtf hbtf0, PreviewView previewView0) {
        hbqy hbqy0 = hbri.b("camera");
        super();
        this.k = hbqy0;
        this.f = hbtf0;
        LinkedHashSet linkedHashSet0 = new LinkedHashSet();
        baa.a(1, linkedHashSet0);
        this.d = new bab(linkedHashSet0);
        this.e = hbtf0.b;
        if(previewView0 != null) {
            this.j = new WeakReference(previewView0.b());
        }
        this.c = new hbtg(this);
        this.b = new hbtn(evqs.a);
        this.l = new hbra(hbtf0.a);
        try {
            bvh.b(anr.a());
        }
        catch(IllegalStateException unused_ex) {
        }
        gmcd gmcd0 = bvh.a(hbtf0.a);
        this.g = gmcd0;
        lpw lpw0 = new lpw(this);
        this.h = lpw0;
        lpw0.g(lpf.b);
        lpw0.g(lpf.c);
        this.b(hbia.b);
        gmbu.t(gmcd0, new hbtj(this), this.b);
    }

    public final void a() {
        this.d();
        this.b.a.set(true);
        lpw lpw0 = this.h;
        if(lpw0.b != lpf.c) {
            return;
        }
        lpw0.g(lpf.a);
        hbtk.a.f("close");
        try {
            this.e.a.close();
        }
        catch(IOException unused_ex) {
        }
        this.b(hbia.e);
    }

    public final void b(hbia hbia0) {
        hbkp hbkp0 = new hbkp();
        hbhy hbhy0 = new hbhy();
        Integer integer0 = (int)480;
        integer0.getClass();
        hbhy0.d = integer0;
        Integer integer1 = (int)360;
        integer1.getClass();
        hbhy0.c = integer1;
        int v = 0;
        int v1 = this.i == null ? 0 : this.i.getWidth();
        Integer.valueOf(v1).getClass();
        hbhy0.f = (int)(v1 & 0x7FFFFFFF);
        Size size0 = this.i;
        if(size0 != null) {
            v = size0.getHeight();
        }
        Integer.valueOf(v).getClass();
        hbhy0.e = (int)(v & 0x7FFFFFFF);
        hbhy0.a = hbhz.c;
        hbhy0.b = hbia0;
        hbkp0.k = new hbib(hbhy0);
        hbrb hbrb0 = new hbrb(hbkp0, 1);
        this.k.e(hbrb0, hbko.bI);
    }

    final void c(hbkn hbkn0) {
        long v = System.currentTimeMillis();
        this.l.a(0x5F01, hbkn0.aH, v, v);
    }

    public final void d() {
        lpw lpw0 = this.h;
        lpf lpf0 = lpw0.b;
        lpf lpf1 = lpf.c;
        if(lpf0 == lpf1) {
            hbtk.a.f("Already in the CREATE state");
            return;
        }
        if(lpf0 != lpf.d) {
            return;
        }
        lpw0.g(lpf1);
        this.b(hbia.d);
    }

    @Override  // lps
    public final lpg getLifecycle() {
        return this.h;
    }
}

