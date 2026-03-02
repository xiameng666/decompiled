import android.view.View;
import java.util.ArrayList;

final class gh implements Runnable {
    final int a;
    final ArrayList b;
    final ArrayList c;
    final ArrayList d;
    final ArrayList e;

    public gh(int v, ArrayList arrayList0, ArrayList arrayList1, ArrayList arrayList2, ArrayList arrayList3) {
        this.a = v;
        this.b = arrayList0;
        this.c = arrayList1;
        this.d = arrayList2;
        this.e = arrayList3;
        super();
    }

    @Override
    public final void run() {
        for(int v = 0; v < this.a; ++v) {
            ((View)this.b.get(v)).setTransitionName(((String)this.c.get(v)));
            ((View)this.d.get(v)).setTransitionName(((String)this.e.get(v)));
        }
    }
}

