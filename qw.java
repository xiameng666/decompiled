import android.view.ViewPropertyAnimator;
import java.util.ArrayList;

final class qw implements Runnable {
    final ArrayList a;
    final re b;

    public qw(re re0, ArrayList arrayList0) {
        this.b = re0;
        this.a = arrayList0;
        super();
    }

    @Override
    public final void run() {
        ArrayList arrayList0 = this.a;
        int v = arrayList0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            uq uq0 = (uq)arrayList0.get(v1);
            ViewPropertyAnimator viewPropertyAnimator0 = uq0.a.animate();
            this.b.d.add(uq0);
            viewPropertyAnimator0.alpha(1.0f).setDuration(this.b.h).setListener(new qy(this.b, uq0, uq0.a, viewPropertyAnimator0)).start();
        }
        arrayList0.clear();
        this.b.a.remove(arrayList0);
    }
}

