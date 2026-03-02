import android.view.View;
import java.util.List;

public final class gbei implements keg {
    public final View a;
    public final List b;

    public gbei(View view0, List list0) {
        this.a = view0;
        this.b = list0;
    }

    @Override  // keg
    public final kgq et(View view0, kgq kgq0) {
        View view1 = this.a;
        int v = view1.getPaddingLeft();
        int v1 = view1.getPaddingTop();
        int v2 = view1.getPaddingRight();
        int v3 = view1.getPaddingBottom();
        for(Object object0: this.b) {
            switch(((hdqe)object0).ordinal()) {
                case 1: {
                    v1 = kgq0.f(0x207).c;
                    break;
                }
                case 2: {
                    v3 = Math.max(kgq0.f(0x207).e, kgq0.f(8).e);
                    break;
                }
                case 3: {
                    v = kgq0.f(0x207).b;
                    break;
                }
                case 4: {
                    v2 = kgq0.f(0x207).d;
                }
            }
        }
        view1.setPadding(v, v1, v2, v3);
        return kgq0;
    }
}

