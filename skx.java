import android.view.View.OnClickListener;
import android.view.View;
import com.android.settingslib.widget.SliderPreference;

public final class skx implements View.OnClickListener {
    public final SliderPreference a;

    public skx(SliderPreference sliderPreference0) {
        this.a = sliderPreference0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        SliderPreference sliderPreference0 = this.a;
        int v = sliderPreference0.b;
        if(v < sliderPreference0.d) {
            sliderPreference0.l(v + sliderPreference0.e);
        }
    }
}

