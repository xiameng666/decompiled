import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.CompoundButton;

public final class atun implements CompoundButton.OnCheckedChangeListener {
    public final atus a;

    public atun(atus atus0) {
        this.a = atus0;
    }

    @Override  // android.widget.CompoundButton$OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton0, boolean z) {
        this.a.aj = z;
    }
}

