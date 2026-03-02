import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.CompoundButton;

public final class aqaj implements CompoundButton.OnCheckedChangeListener {
    public final aqad a;

    public aqaj(aqad aqad0) {
        this.a = aqad0;
    }

    @Override  // android.widget.CompoundButton$OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton0, boolean z) {
        this.a.b(z);
    }
}

