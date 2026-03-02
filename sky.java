import android.util.Log;
import android.view.KeyEvent;
import android.view.View.OnKeyListener;
import android.view.View;
import com.android.settingslib.widget.SliderPreference;
import com.google.android.material.slider.Slider;
import j..util.Objects;

public final class sky implements View.OnKeyListener {
    final SliderPreference a;

    public sky(SliderPreference sliderPreference0) {
        Objects.requireNonNull(sliderPreference0);
        this.a = sliderPreference0;
        super();
    }

    @Override  // android.view.View$OnKeyListener
    public final boolean onKey(View view0, int v, KeyEvent keyEvent0) {
        if(keyEvent0.getAction() == 0) {
            SliderPreference sliderPreference0 = this.a;
            if((sliderPreference0.f || v != 21 && v != 22) && (v != 23 && v != 66)) {
                Slider slider0 = sliderPreference0.a;
                if(slider0 == null) {
                    Log.e("SliderPreference", "Slider view is null and hence cannot be adjusted.");
                    return false;
                }
                return slider0.onKeyDown(v, keyEvent0);
            }
        }
        return false;
    }
}

