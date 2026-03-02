import android.content.Intent;
import android.view.View.OnClickListener;
import android.view.View;

public final class dmdx implements View.OnClickListener {
    public final dmdz a;

    public dmdx(dmdz dmdz0) {
        this.a = dmdz0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        this.a.ag.a("CardAddedFlowSummaryHowToTapToPay", "CARD_ADDED_SUMMARY_PAGE");
        Intent intent0 = dlnf.bH(this.a.requireContext(), 3);
        this.a.startActivity(intent0);
    }
}

