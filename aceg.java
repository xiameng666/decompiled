import android.content.Context;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.gms.appinvite.model.ContactPerson.ContactMethod;
import com.google.android.gms.appinvite.model.ContactPerson;
import j..util.Objects;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public final class aceg extends acef {
    final accc a;
    private final List b;

    public aceg(accc accc0, Collection collection0) {
        Objects.requireNonNull(accc0);
        this.a = accc0;
        Objects.requireNonNull(accc0);
        super(accc0);
        if(collection0 == null) {
            this.b = Collections.EMPTY_LIST;
            return;
        }
        boolean z = false;
        Integer integer0 = (int)0;
        int v = collection0.size();
        Integer integer1 = v;
        integer0.getClass();
        integer1.getClass();
        if(v <= collection0.size()) {
            z = true;
        }
        batl.c(z, "rangeEnd");
        integer1.getClass();
        integer0.getClass();
        this.b = new ArrayList(v);
        for(Object object0: collection0) {
            if(((int)integer0) > 0) {
                integer0 = (int)(((int)integer0) - 1);
            }
            else {
                this.b.add(object0);
                if(this.b.size() >= v) {
                    break;
                }
            }
        }
    }

    @Override  // acef
    public final int a() {
        return this.b.size();
    }

    @Override  // acef
    public final Object b(int v) {
        return this.b.get(v);
    }

    @Override  // acef
    public final int c() {
        return this.a.a;
    }

    @Override  // acef
    public final View d(int v, View view0, ViewGroup viewGroup0) {
        ehjb ehjb0;
        accb accb0 = (accb)this.b(v);
        if(view0 == null) {
            view0 = this.a.m.inflate(0x7F0E0096, viewGroup0, false);  // layout:appinvite_auto_complete_item
        }
        ContactPerson contactPerson0 = accb0.a;
        ContactPerson.ContactMethod contactPerson$ContactMethod0 = accb0.b == null ? contactPerson0.a() : accb0.b;
        accc accc0 = this.a;
        Context context0 = accc0.b;
        String s = acfd.a(context0, contactPerson0);
        ViewGroup viewGroup1 = (ViewGroup)view0.findViewById(0x7F0B0C35);  // id:avatar_container
        if(viewGroup1.getChildCount() == 0) {
            ehjb0 = new ehjb(viewGroup1.getContext());
            viewGroup1.addView(ehjb0, new ViewGroup.LayoutParams(-1, -1));
        }
        else {
            ehjb0 = (ehjb)viewGroup1.getChildAt(0);
        }
        String s1 = null;
        ehjb0.f();
        if(accb0.c == 5) {
            if(s != null && s.trim().length() != 0) {
                s1 = s.trim().substring(0, 1);
            }
            ehjb0.b(s1);
        }
        else {
            ehjb0.b(s);
        }
        acfa.b(ehjb0, contactPerson0, contactPerson$ContactMethod0, accc0.f);
        ((TextView)view0.findViewById(0x7F0B19AA)).setText(s);  // id:name
        ((TextView)view0.findViewById(0x7F0B0FB4)).setText(acfa.a(context0, contactPerson$ContactMethod0));  // id:contact_detail
        return view0;
    }
}

