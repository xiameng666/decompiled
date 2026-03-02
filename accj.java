import android.view.View.OnClickListener;
import android.view.View;
import com.google.android.gms.appinvite.model.ContactPerson;
import j..util.Objects;

final class accj implements View.OnClickListener {
    final accn a;

    public accj(accn accn0) {
        Objects.requireNonNull(accn0);
        this.a = accn0;
        super();
    }

    @Override  // android.view.View$OnClickListener
    public void onClick(View view0) {
        accn accn0 = this.a;
        ContactPerson contactPerson0 = accn0.aE.a;
        if(contactPerson0 != null) {
            accn0.F(contactPerson0, 4, accn0.z(contactPerson0));
        }
        accn0.aD.m();
    }
}

