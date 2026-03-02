import android.os.Bundle;
import android.view.View.OnClickListener;
import android.view.View;

public final class arvg implements View.OnClickListener {
    public final arvh a;
    public final int b;

    public arvg(arvh arvh0, int v) {
        this.a = arvh0;
        this.b = v;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        this.a.b.a.d("Displaying cancel dialog fragment", new Object[0]);
        Bundle bundle0 = new Bundle();
        bundle0.putInt("download_item_position", this.b);
        arun arun0 = new arun();
        arun0.setArguments(bundle0);
        arun0.show(this.a.b.getParentFragmentManager(), "CANCEL_MMS_RESTORE_CONFIRMATION_DIALOG_TAG");
    }
}

