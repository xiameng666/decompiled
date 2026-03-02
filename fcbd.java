import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.chimera.android.Activity;
import com.google.android.gms.wallet.analytics.events.CreditCardEntryActionUpdatedEvent;
import com.google.android.gms.wallet.analytics.events.CreditCardEntryLaunchedEvent;
import com.google.android.gms.wallet.analytics.events.OrchestrationDependentEvent;
import com.google.android.wallet.analytics.CreditCardEntryAction;
import com.google.android.wallet.ui.expander.SummaryExpanderWrapper;
import java.util.ArrayList;

public final class fcbd extends gcxk {
    private final gdew aG;
    private String aH;
    private String aI;
    private gklu aJ;

    public fcbd() {
        this.aG = new gdew();
        this.aJ = gklu.a;
    }

    @Override  // gcxk
    protected final int N() {
        return 0x7F0B0E21;  // id:card_number_field_container
    }

    @Override  // gcxk
    protected final dkhl Q() {
        return fbed.a(((Activity)this.getContext()));
    }

    @Override  // gcxk
    protected final gcxx R() {
        gezu gezu0 = (gezu)this.aA;
        int v = this.bU;
        gcxx gcxx0 = new fcbe();
        fcbe.Z(gcxx0, gezu0, v, this.cM());
        return gcxx0;
    }

    @Override  // gcxk
    protected final boolean S() {
        return true;
    }

    @Override  // gcxk
    public final void T(int v, Bundle bundle0) {
        if(v != 7) {
            super.T(v, bundle0);
            return;
        }
        int v1 = bundle0.getInt("EventListener.EXTRA_BACKGROUND_EVENT_TYPE");
        if(v1 != 770) {
            throw new IllegalArgumentException("Unknown analytics background event type: " + v1);
        }
        CreditCardEntryAction creditCardEntryAction0 = (CreditCardEntryAction)bundle0.getParcelable("EventListener.EXTRA_BACKGROUND_EVENT_DATA");
        fbpb.a(this.getContext(), new CreditCardEntryActionUpdatedEvent(creditCardEntryAction0, this.aI));
    }

    @Override  // gdak
    public final ArrayList aY() {
        return null;
    }

    @Override  // gdak
    public final void lW(int v) {
    }

    @Override  // gcxk
    public final gdew mb() {
        return this.aG;
    }

    @Override  // gcxk
    public final void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        this.aH = this.getArguments().getString("buyFlowAnalyticsId");
        this.aJ = (gklu)this.getArguments().getSerializable("flowTypeArg");
        if(bundle0 != null) {
            this.aI = bundle0.getString("analyticsSessionId");
            return;
        }
        this.aI = CreditCardEntryLaunchedEvent.b(this.getContext(), fayh.a(this.getContext()), fayh.b(this.getContext()), this.aJ);
        String s = this.aH;
        String s1 = this.aI;
        OrchestrationDependentEvent.a(this.getContext(), s, s1);
    }

    @Override  // gcxk
    protected final View y(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        fcbd fcbd0;
        View view0 = super.y(layoutInflater0, viewGroup0, bundle0);
        SummaryExpanderWrapper summaryExpanderWrapper0 = (SummaryExpanderWrapper)view0.findViewById(0x7F0B0E22);  // id:card_number_field_group
        if(this.aq == null) {
            fcbd0 = this;
            summaryExpanderWrapper0.a.s(true);
        }
        else {
            summaryExpanderWrapper0.findViewById(0x7F0B16B9).setVisibility(0);  // id:icon
            summaryExpanderWrapper0.findViewById(0x7F0B218D).setVisibility(0);  // id:summary_text
            fcbd0 = this;
            fbey.c(summaryExpanderWrapper0, this.aq, fcbd0, 0x7F0B16B9, 0x7F0B218D, 0x7F0B0E23, 0x7F0B2193, this);  // id:icon
            fcbd0.ap = summaryExpanderWrapper0;
        }
        summaryExpanderWrapper0.d(fcbd0.ar);
        summaryExpanderWrapper0.h();
        fcbd0.aG.d(summaryExpanderWrapper0);
        fcbd0.aG.d(fcbd0.ao);
        return view0;
    }
}

