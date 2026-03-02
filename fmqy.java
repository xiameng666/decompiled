import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.CompoundButton;

public final class fmqy implements CompoundButton.OnCheckedChangeListener {
    public final fmqz a;

    public fmqy(fmqz fmqz0) {
        this.a = fmqz0;
    }

    @Override  // android.widget.CompoundButton$OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton0, boolean z) {
        this.a.c.d = z;
    }
}

