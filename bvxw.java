import com.google.android.gms.growth.uiflow.ui.widget.media.ScaledLottieAnimationView;

public final class bvxw implements Runnable {
    public final ScaledLottieAnimationView a;
    public final qkb b;
    public final hgnh c;

    public bvxw(ScaledLottieAnimationView scaledLottieAnimationView0, qkb qkb0, hgnh hgnh0) {
        this.a = scaledLottieAnimationView0;
        this.b = qkb0;
        this.c = hgnh0;
    }

    @Override
    public final void run() {
        ScaledLottieAnimationView scaledLottieAnimationView0 = this.a;
        scaledLottieAnimationView0.o(this.b);
        hgnh hgnh0 = this.c;
        if(hgnh0.d) {
            scaledLottieAnimationView0.i();
        }
        if(hgnh0.e) {
            scaledLottieAnimationView0.t(-1);
            return;
        }
        scaledLottieAnimationView0.t(0);
    }
}

