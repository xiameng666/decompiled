import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;

final class qv implements Runnable {
    final ArrayList a;
    final re b;

    public qv(re re0, ArrayList arrayList0) {
        this.b = re0;
        this.a = arrayList0;
        super();
    }

    @Override
    public final void run() {
        ArrayList arrayList0 = this.a;
        int v = arrayList0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            rc rc0 = (rc)arrayList0.get(v1);
            re re0 = this.b;
            View view0 = null;
            View view1 = rc0.a == null ? null : rc0.a.a;
            uq uq0 = rc0.b;
            if(uq0 != null) {
                view0 = uq0.a;
            }
            if(view1 != null) {
                ViewPropertyAnimator viewPropertyAnimator0 = view1.animate().setDuration(0xFAL);
                re0.g.add(rc0.a);
                viewPropertyAnimator0.translationX(((float)(rc0.e - rc0.c)));
                viewPropertyAnimator0.translationY(((float)(rc0.f - rc0.d)));
                viewPropertyAnimator0.alpha(0.0f).setListener(new ra(re0, rc0, viewPropertyAnimator0, view1)).start();
            }
            if(view0 != null) {
                ViewPropertyAnimator viewPropertyAnimator1 = view0.animate();
                re0.g.add(rc0.b);
                viewPropertyAnimator1.translationX(0.0f).translationY(0.0f).setDuration(0xFAL).alpha(1.0f).setListener(new rb(re0, rc0, viewPropertyAnimator1, view0)).start();
            }
        }
        arrayList0.clear();
        this.b.c.remove(arrayList0);
    }
}

