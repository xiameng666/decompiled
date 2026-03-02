import android.view.ViewGroup;
import com.airbnb.lottie.LottieAnimationView;

final class eyys extends tk {
    public boolean a;

    public eyys() {
        this.a = true;
    }

    @Override  // tk
    public final int b() {
        return eyyv.a.size();
    }

    @Override  // tk
    public final uq dz(ViewGroup viewGroup0, int v) {
        return new eyyq(eyzw.a(viewGroup0, 0x7F0E0355));  // layout:explanation_animation
    }

    @Override  // tk
    public final void h(uq uq0, int v) {
        eyyq eyyq0 = (eyyq)uq0;
        ibuq.f(eyyq0, "holder");
        int v1 = ((Number)((ibns)eyyv.a.get(v)).a).intValue();
        eyyq0.t.l(v1);
        ezaa.a(eyyq0.t);
        int v2 = ((Number)((ibns)eyyv.a.get(v)).b).intValue();
        eyyq0.u.setText(v2);
        eyyq0.a.setContentDescription(eyyq0.a.getContext().getString(((Number)((ibns)eyyv.a.get(v)).b).intValue()));
    }

    @Override  // tk
    public final void j(uq uq0) {
        if(homc.a.j().B()) {
            LottieAnimationView lottieAnimationView0 = ((eyyq)uq0).t;
            lottieAnimationView0.setOnClickListener(new eyyr(this, lottieAnimationView0));
            if(this.a) {
                lottieAnimationView0.i();
                return;
            }
            lottieAnimationView0.hI();
        }
    }
}

