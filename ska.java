import android.view.View.OnClickListener;
import android.view.View;
import android.view.ViewGroup;
import com.airbnb.lottie.LottieAnimationView;
import com.android.settingslib.widget.IllustrationPreference;

public final class ska implements View.OnClickListener {
    public final IllustrationPreference a;
    public final LottieAnimationView b;
    public final ViewGroup c;

    public ska(IllustrationPreference illustrationPreference0, LottieAnimationView lottieAnimationView0, ViewGroup viewGroup0) {
        this.a = illustrationPreference0;
        this.b = lottieAnimationView0;
        this.c = viewGroup0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        IllustrationPreference illustrationPreference0 = this.a;
        int v = illustrationPreference0.b;
        illustrationPreference0.b = v ^ 1;
        LottieAnimationView lottieAnimationView0 = this.b;
        if(v == 0) {
            lottieAnimationView0.hI();
        }
        else {
            lottieAnimationView0.k();
        }
        illustrationPreference0.o(this.c);
    }
}

