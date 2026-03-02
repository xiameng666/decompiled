import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.CompoundButton;

public final class bdgc implements CompoundButton.OnCheckedChangeListener {
    public final bdho a;

    public bdgc(bdho bdho0) {
        this.a = bdho0;
    }

    @Override  // android.widget.CompoundButton$OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton0, boolean z) {
        ibuq.f(compoundButton0, "buttonView");
        heqn heqn0 = bedt.a(z);
        besy besy0 = this.a.z();
        ibuq.c(heqn0);
        besy0.a(heqn0);
        this.a.A().a((z ? gqsm.MQ : gqsm.MP));
    }
}

