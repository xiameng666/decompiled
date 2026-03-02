import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.CompoundButton;

public final class bdgb implements CompoundButton.OnCheckedChangeListener {
    public final bdho a;

    public bdgb(bdho bdho0) {
        this.a = bdho0;
    }

    @Override  // android.widget.CompoundButton$OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton0, boolean z) {
        ibuq.f(compoundButton0, "buttonView");
        heqn heqn0 = bedt.c(z);
        besy besy0 = this.a.z();
        ibuq.c(heqn0);
        besy0.a(heqn0);
        this.a.A().a((z ? gqsm.MO : gqsm.MN));
    }
}

