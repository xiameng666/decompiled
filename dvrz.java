import android.content.Context;
import android.widget.Toast;

public final class dvrz implements evqc {
    public final dvsn a;
    public final gged_interceptors b;

    public dvrz(dvsn dvsn0, gged_interceptors gged0) {
        this.a = dvsn0;
        this.b = gged0;
    }

    @Override  // evqc
    public final void gv(Exception exception0) {
        ((ggtj)((ggtj)dvsn.a.i()).s(exception0)).B("Failed to delete the following valuable IDs: %s", this.b);
        dvsn dvsn0 = this.a;
        Context context0 = dvsn0.getContext();
        if(context0 == null) {
            return;
        }
        dvsn0.aE.setVisibility(8);
        dvsn0.aI.setVisibility(0);
        Toast.makeText(context0, 0x7F15233C, 1).show();  // string:pay_valuable_remove_failed "This item couldn\'t be removed. Please try again."
    }
}

