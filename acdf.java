import android.view.View.OnClickListener;
import android.view.View;
import com.google.android.gms.appinvite.model.ContactPerson;
import j..util.Objects;

final class acdf implements View.OnClickListener {
    final acdg a;

    public acdf(acdg acdg0) {
        Objects.requireNonNull(acdg0);
        this.a = acdg0;
        super();
    }

    @Override  // android.view.View$OnClickListener
    public void onClick(View view0) {
        accn accn0 = (accn)this.a.f;
        if(accn0.ai) {
            if(accn0.aD == null) {
                accn0.E();
            }
            while(view0.getId() != 0x7F0B0FCE && view0.getParent() != null) {  // id:container
                view0 = (View)view0.getParent();
            }
            if(view0.getId() != 0x7F0B0FCE) {  // id:container
                view0 = null;
            }
            ContactPerson contactPerson0 = (ContactPerson)view0.getTag(0x7F0B0BD7);  // id:appinvite_chip_view_holder_tag_person
            accn0.aE.b(contactPerson0, 1);
            accn0.aD.l = view0;
            accn0.aD.v();
        }
    }
}

