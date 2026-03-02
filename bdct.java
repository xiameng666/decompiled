import com.google.android.material.button.MaterialButton;

public final class bdct implements ibts {
    public final MaterialButton a;
    public final bddc b;

    public bdct(MaterialButton materialButton0, bddc bddc0) {
        this.a = materialButton0;
        this.b = bddc0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        this.a.u((((Boolean)object0).booleanValue() ? fyrq.c(this.b.requireContext(), new fyrd(this.b.requireContext(), null, 0, 0x7F160635)) : null));  // style:Pwm.CircularProgressIndicator.ExtraSmall
        return ibom.a;
    }
}

