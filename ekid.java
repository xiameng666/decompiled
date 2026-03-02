import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.CompoundButton;

public final class ekid implements CompoundButton.OnCheckedChangeListener {
    public final ekih a;
    public final ejyy b;

    public ekid(ekih ekih0, ejyy ejyy0) {
        this.a = ekih0;
        this.b = ejyy0;
    }

    @Override  // android.widget.CompoundButton$OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton0, boolean z) {
        if(compoundButton0.isEnabled()) {
            ejyy ejyy0 = this.b;
            ekih ekih0 = this.a;
            if(z) {
                ekih0.g.add(Long.toString(ejyy0.b.longValue()));
            }
            else {
                ekih0.g.remove(Long.toString(ejyy0.b.longValue()));
            }
            ekih0.a.s(ekih0.g);
            ekih0.I(((boolean)(ekih0.g.isEmpty() ^ 1)));
        }
    }
}

