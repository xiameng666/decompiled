import android.os.Bundle;
import com.google.android.gms.wallet.analytics.events.OrchestrationViewEvent;
import com.google.android.gms.wallet.shared.BuyFlowConfig;

public final class fcbp extends gddy {
    private String ai;

    @Override  // gddy
    public final void Q() {
        this.a = true;
        if(this.b) {
            this.b = false;
            this.T(8, Bundle.EMPTY);
        }
    }

    @Override  // game
    public final void U(gami gami0) {
        String s = this.ai;
        OrchestrationViewEvent.d(this.getContext(), s, gami0.B());
    }

    @Override  // gddy
    public final void onCreate(Bundle bundle0) {
        this.ah = fbdv.a(this.getContext(), ((BuyFlowConfig)this.getArguments().getParcelable("buyFlowConfig")));
        super.onCreate(bundle0);
        this.ai = this.getArguments().getString("analyticsSessionId");
    }
}

