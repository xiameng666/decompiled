import android.view.View;
import java.util.List;

public final class gbec implements keg {
    public final List a;

    public gbec(List list0) {
        this.a = list0;
    }

    @Override  // keg
    public final kgq et(View view0, kgq kgq0) {
        ibuq.f(view0, "view");
        jxn jxn0 = kgq0.f(0x207);
        int v = view0.getPaddingLeft();
        int v1 = view0.getPaddingTop();
        int v2 = view0.getPaddingRight();
        int v3 = view0.getPaddingBottom();
        for(Object object0: this.a) {
            switch(((hdqe)object0).ordinal()) {
                case 1: {
                    v1 = jxn0.c;
                    break;
                }
                case 2: {
                    int v4 = kgq0.f(8).e;
                    v3 = Math.max(jxn0.e, v4);
                    break;
                }
                case 3: {
                    v = jxn0.b;
                    break;
                }
                case 4: {
                    v2 = jxn0.d;
                }
            }
        }
        view0.setPadding(v, v1, v2, v3);
        return kgq0;
    }
}

