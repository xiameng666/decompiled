import android.content.Context;
import android.widget.Toast;

public final class dvwg implements evqc {
    public final dvxj a;
    public final gged_interceptors b;

    public dvwg(dvxj dvxj0, gged_interceptors gged0) {
        this.a = dvxj0;
        this.b = gged0;
    }

    @Override  // evqc
    public final void gv(Exception exception0) {
        ((ggtj)((ggtj)dvxj.a.i()).s(exception0)).B("Failed to delete the following valuable IDs: %s", this.b);
        dvxj dvxj0 = this.a;
        Context context0 = dvxj0.getContext();
        if(context0 == null) {
            return;
        }
        dvxj0.az.setVisibility(8);
        dvxj0.aA.setVisibility(0);
        Toast.makeText(context0, 0x7F15233C, 1).show();  // string:pay_valuable_remove_failed "This item couldn\'t be removed. Please try again."
    }
}

