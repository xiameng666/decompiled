import android.view.View;
import java.util.ArrayList;

public final class khw implements keg {
    public final kia a;

    public khw(kia kia0) {
        this.a = kia0;
    }

    @Override  // keg
    public final kgq et(View view0, kgq kgq0) {
        jxn jxn0 = kia.a(kgq0);
        jxn jxn1 = jxn.d(kgq0.g(0x207), kgq0.g(0x40));
        kia kia0 = this.a;
        if(!jxn0.equals(kia0.c) || !jxn1.equals(kia0.d)) {
            kia0.c = jxn0;
            kia0.d = jxn1;
            ArrayList arrayList0 = kia0.b;
            int v = arrayList0.size();
            while(true) {
                --v;
                if(v < 0) {
                    break;
                }
                ((khu)arrayList0.get(v)).d(jxn0, jxn1);
            }
        }
        return kgq0;
    }
}

