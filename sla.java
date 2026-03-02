import com.android.settingslib.widget.SliderPreference;
import com.google.android.material.slider.Slider;
import j..util.Objects;

public final class sla {
    final SliderPreference a;

    public sla(SliderPreference sliderPreference0) {
        Objects.requireNonNull(sliderPreference0);
        this.a = sliderPreference0;
        super();
    }

    public final void a(Object object0, boolean z) {
        if(z) {
            SliderPreference sliderPreference0 = this.a;
            if(sliderPreference0.h || !sliderPreference0.g) {
                sliderPreference0.o(((Slider)object0));
            }
        }
    }
}

