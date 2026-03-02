import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.CompoundButton;

public final class bdgg implements CompoundButton.OnCheckedChangeListener {
    public final bdho a;

    public bdgg(bdho bdho0) {
        this.a = bdho0;
    }

    @Override  // android.widget.CompoundButton$OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton0, boolean z) {
        ibuq.f(compoundButton0, "buttonView");
        besy besy0 = this.a.z();
        heqn heqn0 = bedt.b(z, "credentials_enable_passwordalerts");
        ibuq.e(heqn0, "buildPasswordAlertsPreference(...)");
        besy0.a(heqn0);
        bejg bejg0 = this.a.A().a;
        if(compoundButton0.isPressed()) {
            bejg0.c((z ? gqsm.MS : gqsm.MR));
        }
    }
}

