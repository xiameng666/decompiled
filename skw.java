import android.view.View.OnClickListener;
import android.view.View;
import com.android.settingslib.widget.SliderPreference;

public final class skw implements View.OnClickListener {
    public final SliderPreference a;

    public skw(SliderPreference sliderPreference0) {
        this.a = sliderPreference0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        SliderPreference sliderPreference0 = this.a;
        int v = sliderPreference0.b;
        if(v > 0) {
            sliderPreference0.l(v - sliderPreference0.e);
        }
    }
}

