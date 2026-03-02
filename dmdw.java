import android.view.View.OnClickListener;
import android.view.View;

public final class dmdw implements View.OnClickListener {
    public final dmdz a;

    public dmdw(dmdz dmdz0) {
        this.a = dmdz0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        this.a.ag.a("CardAddedFlowSummaryDismissed", "CARD_ADDED_SUMMARY_PAGE");
        this.a.at(-1, null);
        this.a.ar();
    }
}

