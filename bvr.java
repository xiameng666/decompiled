import androidx.camera.view.PreviewView;
import java.util.Objects;

public final class bvr implements bek {
    public final bvt a;
    public final bin b;
    public final bel c;

    public bvr(bvt bvt0, bin bin0, bel bel0) {
        this.a = bvt0;
        this.b = bin0;
        this.c = bel0;
    }

    @Override  // bek
    public final void a(bej bej0) {
        Objects.toString(bej0);
        bcs.h("PreviewView");
        int v = this.b.e().a();
        Integer.valueOf(v).getClass();
        Objects.toString(bej0);
        Objects.toString(this.c.b);
        boolean z = true;
        bcs.h("PreviewTransform");
        PreviewView previewView0 = this.a.a;
        previewView0.c.b = bej0.a;
        previewView0.c.c = bej0.b;
        previewView0.c.e = bej0.c;
        previewView0.c.a = this.c.b;
        previewView0.c.f = v == 0;
        previewView0.c.g = bej0.d;
        previewView0.c.d = bej0.e;
        if(bej0.c != -1 && (previewView0.a == null || !(previewView0.a instanceof bwg))) {
            z = false;
        }
        previewView0.d = z;
        previewView0.c();
    }
}

