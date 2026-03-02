import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ScrollView;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.gms.growth.uiflow.ui.widget.media.ScaledLottieAnimationView;
import java.util.List;

final class bwcx extends bwde {
    private final ViewGroup a;
    private final List b;
    private final Rect c;

    public bwcx(icck icck0, bwdm bwdm0, ViewGroup viewGroup0, List list0) {
        ibuq.f(icck0, "coroutineScope");
        ibuq.f(bwdm0, "uiFlowFlags");
        ibuq.f(list0, "lottieViews");
        super(icck0, bwdm0);
        this.a = viewGroup0;
        this.b = list0;
        Rect rect0 = new Rect();
        viewGroup0.getWindowVisibleDisplayFrame(rect0);
        this.c = rect0;
    }

    @Override  // bwde
    protected final ScrollView a() {
        ScrollView scrollView0 = (this.a instanceof ScrollView) ? ((ScrollView)this.a) : null;
        return scrollView0 == null ? ((ScrollView)ibxv.i(new ibxm(bwdz.e(this.a), true, bwcw.a))) : scrollView0;
    }

    @Override  // bwde
    protected final void b(ScrollView scrollView0) {
        ibuq.f(scrollView0, "scrollView");
        ViewGroup viewGroup0 = null;
        int v = 0;
        LottieAnimationView lottieAnimationView0 = null;
        for(Object object0: this.b) {
            ScaledLottieAnimationView scaledLottieAnimationView0 = (ScaledLottieAnimationView)object0;
            if(scaledLottieAnimationView0.isShown() && scaledLottieAnimationView0.d.e() == -1) {
                Rect rect0 = new Rect();
                scaledLottieAnimationView0.getLocalVisibleRect(rect0);
                int v1 = rect0.intersect(this.c) ? rect0.height() : 0;
                if(v1 <= v) {
                    bwcy.a(scaledLottieAnimationView0);
                }
                else {
                    bwcy.a(((ScaledLottieAnimationView)lottieAnimationView0));
                    lottieAnimationView0 = scaledLottieAnimationView0;
                    v = v1;
                }
            }
        }
        if(lottieAnimationView0 != null && !lottieAnimationView0.w()) {
            ViewParent viewParent0 = ((ScaledLottieAnimationView)lottieAnimationView0).getParent();
            if((viewParent0 instanceof ViewGroup)) {
                viewGroup0 = (ViewGroup)viewParent0;
            }
            if(viewGroup0 == null) {
                lottieAnimationView0.k();
            }
            else {
                View view0 = viewGroup0.findViewById(0x7F0B23DB);  // id:up_play_pause
                if(view0 == null || view0.getVisibility() != 0) {
                    lottieAnimationView0.k();
                }
            }
        }
    }
}

