import android.view.View.OnClickListener;
import android.view.View;

public final class dmei implements View.OnClickListener {
    public final dmel a;

    public dmei(dmel dmel0) {
        this.a = dmel0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        this.a.d.a("CardAddedFlowTokenizationPromptCancelled", "CARD_ADDED_PROMPT_PAGE");
        this.a.at(0, null);
        this.a.ar();
    }
}

