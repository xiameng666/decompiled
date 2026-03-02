import android.text.TextUtils;
import android.view.View.OnClickListener;
import android.view.View;
import com.google.android.gms.appinvite.model.ContactPerson;
import j..util.Objects;

final class acdd implements View.OnClickListener {
    final acdg a;

    public acdd(acdg acdg0) {
        Objects.requireNonNull(acdg0);
        this.a = acdg0;
        super();
    }

    @Override  // android.view.View$OnClickListener
    public void onClick(View view0) {
        ContactPerson contactPerson0 = (ContactPerson)view0.getTag(0x7F0B0BD7);  // id:appinvite_chip_view_holder_tag_person
        acdg acdg0 = this.a;
        int v = acdg0.l.indexOf(contactPerson0);
        acdh acdh0 = acdg0.f;
        if(((accn)acdh0).L(contactPerson0)) {
            String s = acfd.a(((accn)acdh0).a, contactPerson0);
            if(!TextUtils.isEmpty(((accn)acdh0).aq)) {
                View view1 = ((accn)acdh0).ar;
                if(view1 != null) {
                    acfh.b(((du)acdh0).getContext(), view1);
                }
                ((accn)acdh0).ar = acfh.a(((du)acdh0).getContext(), String.format(((accn)acdh0).aq, s), true, false);
            }
            return;
        }
        int v1 = acdg0.g;
        if(((accn)acdh0).N(contactPerson0)) {
            ((accn)acdh0).F(contactPerson0, v1, v);
            return;
        }
        ((accn)acdh0).D(contactPerson0, v1, v);
    }
}

