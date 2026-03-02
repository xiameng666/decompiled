import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.CompoundButton;

public final class bddw implements CompoundButton.OnCheckedChangeListener {
    public final bdea a;
    public final int b;

    public bddw(bdea bdea0, int v) {
        this.a = bdea0;
        this.b = v;
    }

    @Override  // android.widget.CompoundButton$OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton0, boolean z) {
        ibuq.f(compoundButton0, "<unused var>");
        this.a.a.a(Integer.valueOf(this.b), Boolean.valueOf(z));
    }
}

