import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;

final class qu implements Runnable {
    final ArrayList a;
    final re b;

    public qu(re re0, ArrayList arrayList0) {
        this.b = re0;
        this.a = arrayList0;
        super();
    }

    @Override
    public final void run() {
        ArrayList arrayList0 = this.a;
        int v = arrayList0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            rd rd0 = (rd)arrayList0.get(v1);
            re re0 = this.b;
            uq uq0 = rd0.a;
            View view0 = uq0.a;
            int v2 = rd0.d - rd0.b;
            int v3 = rd0.e - rd0.c;
            if(v2 != 0) {
                view0.animate().translationX(0.0f);
            }
            if(v3 != 0) {
                view0.animate().translationY(0.0f);
            }
            ViewPropertyAnimator viewPropertyAnimator0 = view0.animate();
            re0.e.add(uq0);
            viewPropertyAnimator0.setDuration(0xFAL).setListener(new qz(re0, uq0, v2, view0, v3, viewPropertyAnimator0)).start();
        }
        arrayList0.clear();
        this.b.b.remove(arrayList0);
    }
}

