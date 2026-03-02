import android.os.Bundle;
import com.google.android.gms.trustagent.activeunlock.primary.ui.setup.ExplanationFragment;

public final class eyyb extends eyui {
    final ExplanationFragment a;

    public eyyb(ExplanationFragment explanationFragment0, ibnn ibnn0) {
        this.a = explanationFragment0;
        super(explanationFragment0, ibnn0);
    }

    @Override  // eyui
    protected final void a() {
        ((nry)this.a.E().a(this.a)).i(0x7F0B0AD9);  // id:action_global_setup_complete_fragment
    }

    @Override  // eyui
    protected final void b() {
        Bundle bundle0 = jyu.a(new ibns[]{new ibns(this.a.getString(0x7F1500FB), this.a.D().a)});  // string:action_arg_device_to_be_set_up "deviceToBeSetUp"
        ((nry)this.a.E().a(this.a)).j(0x7F0B0AD4, bundle0);  // id:action_explanation_fragment_to_lockscreen_setup_fragment
    }
}

