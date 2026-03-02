import android.view.View.OnClickListener;
import android.view.View;
import com.airbnb.lottie.LottieAnimationView;

public final class eyyr implements View.OnClickListener {
    public final eyys a;
    public final LottieAnimationView b;

    public eyyr(eyys eyys0, LottieAnimationView lottieAnimationView0) {
        this.a = eyys0;
        this.b = lottieAnimationView0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        int v = this.a.a;
        this.a.a = v ^ 1;
        LottieAnimationView lottieAnimationView0 = this.b;
        if(v == 0) {
            lottieAnimationView0.k();
            return;
        }
        lottieAnimationView0.hI();
    }
}

