import android.view.View.OnClickListener;
import android.view.View;
import com.google.android.gms.mdocstore.types.ProvisioningId;

public final class duqj implements View.OnClickListener {
    public final duqq a;

    public duqj(duqq duqq0) {
        this.a = duqq0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        dvfh dvfh0 = this.a.b;
        ProvisioningId provisioningId0 = this.a.ah;
        evqp evqp0 = new evqp();
        dvfh0.b(provisioningId0, evqp0);
        duqk duqk0 = new duqk(this.a);
        evqp0.a.z(duqk0);
    }
}

