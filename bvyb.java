import android.view.View.OnClickListener;
import android.view.View;
import android.widget.ImageView;
import com.google.android.gms.growth.uiflow.ui.widget.media.ScaledLottieAnimationView;

public final class bvyb implements View.OnClickListener {
    public final View a;
    public final ScaledLottieAnimationView b;

    public bvyb(View view0, ScaledLottieAnimationView scaledLottieAnimationView0) {
        this.a = view0;
        this.b = scaledLottieAnimationView0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        ImageView imageView0 = (ImageView)this.a.findViewById(0x7F0B23DB);  // id:up_play_pause
        ScaledLottieAnimationView scaledLottieAnimationView0 = this.b;
        if(scaledLottieAnimationView0.w()) {
            scaledLottieAnimationView0.hI();
            imageView0.setVisibility(0);
            return;
        }
        scaledLottieAnimationView0.k();
        imageView0.setVisibility(4);
    }
}

