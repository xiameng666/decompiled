import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.CompoundButton;

public final class bdge implements CompoundButton.OnCheckedChangeListener {
    public final bdho a;

    public bdge(bdho bdho0) {
        this.a = bdho0;
    }

    @Override  // android.widget.CompoundButton$OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton0, boolean z) {
        ibuq.f(compoundButton0, "buttonView");
        if(compoundButton0.isPressed()) {
            besy besy0 = this.a.z();
            heqn heqn0 = bedt.b(z, "credentials_enable_automatic_passkey_upgrades");
            ibuq.e(heqn0, "buildPasskeyAutoUpgradePreference(...)");
            besy0.a(heqn0);
            betj betj0 = this.a.A();
            boolean z1 = compoundButton0.isPressed();
            bejg bejg0 = betj0.a;
            if(z1) {
                bejg0.e((z ? gqtg.y : gqtg.z));
            }
        }
    }
}

