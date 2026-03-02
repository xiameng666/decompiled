import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.CompoundButton;
import com.google.android.gms.trustagent.activeunlock.primary.ui.setup.SetupCompleteFragment;

public final class eyze implements CompoundButton.OnCheckedChangeListener {
    public final SetupCompleteFragment a;

    public eyze(SetupCompleteFragment setupCompleteFragment0) {
        this.a = setupCompleteFragment0;
    }

    @Override  // android.widget.CompoundButton$OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton0, boolean z) {
        ibuq.f(compoundButton0, "<unused var>");
        SetupCompleteFragment setupCompleteFragment0 = this.a;
        if(z) {
            setupCompleteFragment0.B().a.b();
            return;
        }
        setupCompleteFragment0.B().a.a();
    }
}

