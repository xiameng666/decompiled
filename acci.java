import android.view.View;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView;
import com.google.android.gms.appinvite.model.ContactPerson.ContactMethod;
import com.google.android.gms.appinvite.model.ContactPerson;
import j..util.Objects;

final class acci implements AdapterView.OnItemClickListener {
    final accn a;

    public acci(accn accn0) {
        Objects.requireNonNull(accn0);
        this.a = accn0;
        super();
    }

    @Override  // android.widget.AdapterView$OnItemClickListener
    public final void onItemClick(AdapterView adapterView0, View view0, int v, long v1) {
        accn accn0 = this.a;
        ContactPerson contactPerson0 = accn0.aE.a;
        ContactPerson.ContactMethod contactPerson$ContactMethod0 = accn0.aE.a(v);
        if(contactPerson0 != null && contactPerson$ContactMethod0 != null) {
            accu accu0 = accn0.ah;
            if(accu0 != null) {
                accu0.g(contactPerson$ContactMethod0, ((boolean)(contactPerson0.a().equals(contactPerson$ContactMethod0) ^ 1)));
            }
            contactPerson0.b(contactPerson$ContactMethod0);
            accn0.au.I(contactPerson0);
            accz accz0 = accn0.av;
            if(accz0 != null) {
                accz0.I(contactPerson0);
            }
            if(accn.O(contactPerson0)) {
                accn0.K();
            }
        }
        accn0.aD.m();
    }
}

