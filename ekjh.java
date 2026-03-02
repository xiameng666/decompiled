import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.CompoundButton;

public final class ekjh implements CompoundButton.OnCheckedChangeListener {
    public final ekjl a;
    public final ejyy b;

    public ekjh(ekjl ekjl0, ejyy ejyy0) {
        this.a = ekjl0;
        this.b = ejyy0;
    }

    @Override  // android.widget.CompoundButton$OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton0, boolean z) {
        ekjl ekjl0 = this.a;
        ejyy ejyy0 = this.b;
        if(z) {
            ekjl0.h.add(ejyy0.a);
        }
        else {
            ekjl0.h.remove(ejyy0.a);
        }
        ekjl0.a.s(ekjl0.h);
        ekjl0.n(((boolean)(ekjl0.h.isEmpty() ^ 1)));
    }
}

