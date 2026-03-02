import android.content.Intent;
import android.text.TextUtils;
import android.view.View.OnLongClickListener;
import android.view.View;
import com.google.android.gms.appinvite.model.ContactPerson.ContactMethod;
import com.google.android.gms.appinvite.model.ContactPerson;
import j..util.Objects;

final class acde implements View.OnLongClickListener {
    final acdg a;

    public acde(acdg acdg0) {
        Objects.requireNonNull(acdg0);
        this.a = acdg0;
        super();
    }

    @Override  // android.view.View$OnLongClickListener
    public final boolean onLongClick(View view0) {
        String s;
        ContactPerson contactPerson0 = (ContactPerson)view0.getTag(0x7F0B0BD7);  // id:appinvite_chip_view_holder_tag_person
        if(TextUtils.isEmpty(contactPerson0.b)) {
            Long long0 = contactPerson0.c;
            if(long0 == null) {
                ContactPerson.ContactMethod contactPerson$ContactMethod0 = contactPerson0.a();
                switch(contactPerson$ContactMethod0.a) {
                    case 1: {
                        s = ehjs.b(contactPerson$ContactMethod0.b);
                        break;
                    }
                    case 2: {
                        s = "p:" + contactPerson$ContactMethod0.b;
                        break;
                    }
                    default: {
                        s = null;
                    }
                }
            }
            else {
                s = "c:" + long0.toString();
            }
        }
        else {
            s = ehjs.c(contactPerson0.b);
        }
        if(!TextUtils.isEmpty(s)) {
            Intent intent0 = new Intent();
            intent0.setPackage("com.google.android.gms");
            intent0.setAction("com.google.android.gms.people.smart_profile.ACTION_SHOW_PROFILE");
            intent0.putExtra("com.google.android.gms.people.smart_profile.VIEWER_ACCOUNT_NAME", ((accn)this.a.f).b);
            intent0.putExtra("com.google.android.gms.people.smart_profile.QUALIFIED_ID", s);
            intent0.putExtra("com.google.android.gms.people.smart_profile.APPLICATION_ID", 80);
            intent0.putExtra("com.google.android.gms.people.smart_profile.DISPLAY_NAME", acfd.a(((accn)this.a.f).a, contactPerson0));
            ((du)this.a.f).startActivityForResult(intent0, 1);
        }
        return true;
    }
}

