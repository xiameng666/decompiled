import android.graphics.Rect;
import android.util.Rational;
import androidx.camera.view.PreviewView;
import java.util.Map;
import java.util.concurrent.Executor;

public final class bvt implements bde {
    final PreviewView a;

    public bvt(PreviewView previewView0) {
        this.a = previewView0;
        super();
    }

    @Override  // bde
    public final void a(bel bel0) {
        if(!boj.d()) {
            this.a.getContext().getMainExecutor().execute(new bvq(this, bel0));
            return;
        }
        bcs.h("PreviewView");
        bin bin0 = bel0.d;
        this.a.h = bin0.e();
        bvz bvz0 = this.a.g;
        Rect rect0 = bin0.e().e();
        new Rational(rect0.width(), rect0.height());
        synchronized(bvz0) {
            bvz0.b = rect0;
        }
        PreviewView previewView0 = this.a;
        bel0.d(previewView0.getContext().getMainExecutor(), new bvr(this, bin0, bel0));
        if(!(previewView0.a instanceof bwg) || PreviewView.d(bel0, previewView0.j)) {
            bwo bwo0 = PreviewView.d(bel0, previewView0.j) ? new bwo(previewView0, previewView0.c) : new bwg(previewView0, previewView0.c);
            previewView0.a = bwo0;
        }
        bvn bvn0 = new bvn(bin0.e(), previewView0.e, previewView0.a);
        previewView0.f.set(bvn0);
        bld bld0 = bin0.f();
        Executor executor0 = previewView0.getContext().getMainExecutor();
        Map map0 = ((bkz)bld0).b;
        synchronized(map0) {
            bkx bkx0 = (bkx)map0.get(bvn0);
            if(bkx0 != null) {
                bkx0.b();
            }
            bkx bkx1 = new bkx(executor0, bvn0);
            map0.put(bvn0, bkx1);
            bow.a().execute(new bkv(((bkz)bld0), bkx0, bkx1));
        }
        previewView0.a.g(bel0, new bvs(this, bvn0, bin0));
        bwb bwb0 = previewView0.b;
        if(previewView0.indexOfChild(bwb0) == -1) {
            previewView0.addView(bwb0);
        }
    }
}

