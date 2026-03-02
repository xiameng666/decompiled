import android.view.View;
import java.util.List;

public final class jpm extends kfx {
    final jpo a;

    public jpm(jpo jpo0) {
        this.a = jpo0;
        super(1);
    }

    @Override  // kfx
    public final kfw b(kga kga0, kfw kfw0) {
        jpo jpo0 = this.a;
        if(!jpo0.c) {
            int v = 0;
            View view0 = jpo0.getChildAt(0);
            int v1 = Math.max(0, view0.getLeft());
            int v2 = Math.max(0, view0.getTop());
            int v3 = Math.max(0, jpo0.getWidth() - view0.getRight());
            int v4 = Math.max(0, jpo0.getHeight() - view0.getBottom());
            if(v1 != 0) {
                goto label_17;
            }
            if(v2 != 0) {
                goto label_18;
            }
            if(v3 != 0) {
                v2 = 0;
                goto label_18;
            }
            if(v4 != 0) {
                v2 = 0;
                v3 = 0;
                goto label_18;
            label_17:
                v = v1;
            label_18:
                jxn jxn0 = jxn.e(v, v2, v3, v4);
                return new kfw(kgq.k(kfw0.a, jxn0.b, jxn0.c, jxn0.d, jxn0.e), kgq.k(kfw0.b, jxn0.b, jxn0.c, jxn0.d, jxn0.e));
            }
        }
        return kfw0;
    }

    @Override  // kfx
    public final kgq c(kgq kgq0, List list0) {
        jpo jpo0 = this.a;
        if(!jpo0.c) {
            int v = 0;
            View view0 = jpo0.getChildAt(0);
            int v1 = Math.max(0, view0.getLeft());
            int v2 = Math.max(0, view0.getTop());
            int v3 = Math.max(0, jpo0.getWidth() - view0.getRight());
            int v4 = Math.max(0, jpo0.getHeight() - view0.getBottom());
            if(v1 != 0) {
                v = v1;
            }
            else if(v2 == 0) {
                if(v3 == 0) {
                    return v4 == 0 ? kgq0 : kgq0.p(0, 0, 0, v4);
                }
                return kgq0.p(0, 0, v3, v4);
            }
            return kgq0.p(v, v2, v3, v4);
        }
        return kgq0;
    }
}

