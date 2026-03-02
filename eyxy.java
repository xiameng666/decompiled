import android.view.View.OnClickListener;
import android.view.View;
import com.google.android.gms.trustagent.activeunlock.primary.ui.setup.ExplanationFragment;
import j..util.Optional;

public final class eyxy implements View.OnClickListener {
    public final ExplanationFragment a;

    public eyxy(ExplanationFragment explanationFragment0) {
        this.a = explanationFragment0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        ExplanationFragment explanationFragment0 = this.a;
        Optional optional0 = explanationFragment0.C().a;
        optional0.ifPresent(new eyxj(eyxo.a));
        if(!optional0.isPresent()) {
            explanationFragment0.F();
        }
    }
}

