import android.view.View.OnClickListener;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.appinvite.model.ContactPerson;
import j..util.Objects;

final class acdi implements View.OnClickListener {
    final acdn a;

    public acdi(acdn acdn0) {
        Objects.requireNonNull(acdn0);
        this.a = acdn0;
        super();
    }

    @Override  // android.view.View$OnClickListener
    public void onClick(View view0) {
        ContactPerson contactPerson0 = (ContactPerson)view0.getTag(0x7F0B0BD7);  // id:appinvite_chip_view_holder_tag_person
        accn accn0 = (accn)this.a.f;
        if(accn0.aD == null) {
            accn0.E();
        }
        accn0.aE.b(contactPerson0, 0);
        sn sn0 = accn0.aD;
        sn0.l = (ViewGroup)view0.getParent();
        accn0.aD.v();
    }
}

