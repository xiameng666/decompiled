import android.text.TextUtils;
import android.util.Patterns;
import android.widget.Filter.FilterResults;
import android.widget.Filter;
import com.google.android.gms.appinvite.model.ContactPerson.ContactMethod;
import com.google.android.gms.appinvite.model.ContactPerson;
import j..util.Objects;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;

final class acca extends Filter {
    final accc a;

    public acca(accc accc0) {
        Objects.requireNonNull(accc0);
        this.a = accc0;
        super();
    }

    @Override  // android.widget.Filter
    protected final Filter.FilterResults performFiltering(CharSequence charSequence0) {
        Filter.FilterResults filter$FilterResults0 = new Filter.FilterResults();
        if(!TextUtils.isEmpty(charSequence0)) {
            filter$FilterResults0.values = charSequence0.toString().trim();
        }
        return filter$FilterResults0;
    }

    @Override  // android.widget.Filter
    protected final void publishResults(CharSequence charSequence0, Filter.FilterResults filter$FilterResults0) {
        Iterator iterator2;
        accc accc0 = this.a;
        accc0.i = (String)filter$FilterResults0.values;
        if(TextUtils.isEmpty(accc0.i)) {
            accc0.c(accc0.k);
            return;
        }
        String s = accc0.i;
        LinkedHashSet linkedHashSet0 = new LinkedHashSet();
        String s1 = s.toString();
        String s2 = s.toString().toLowerCase(Locale.ROOT);
        String s3 = accc.a(s1);
        boolean z = false;
        boolean z1 = false;
        Iterator iterator0 = accc0.g.iterator();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            ContactPerson contactPerson0 = (ContactPerson)object0;
            if(TextUtils.isEmpty(contactPerson0.a) || !contactPerson0.a.toLowerCase(Locale.ROOT).contains(s2)) {
                ArrayList arrayList0 = contactPerson0.e;
                int v = arrayList0.size();
                int v1 = 0;
                while(v1 < v) {
                    ContactPerson.ContactMethod contactPerson$ContactMethod0 = (ContactPerson.ContactMethod)arrayList0.get(v1);
                    String s4 = contactPerson$ContactMethod0.b;
                    if(TextUtils.isEmpty(s4)) {
                        iterator2 = iterator0;
                    }
                    else {
                        iterator2 = iterator0;
                        switch(contactPerson$ContactMethod0.a) {
                            case 1: {
                                if(accc0.d && s4.toLowerCase(Locale.ROOT).contains(s2)) {
                                    linkedHashSet0.add(new accb(contactPerson0, contactPerson$ContactMethod0, 3));
                                    if(s4.equals(s1)) {
                                        z = true;
                                    }
                                }
                                break;
                            }
                            case 2: {
                                if(accc0.e && s3.length() >= accc0.j) {
                                    String s5 = accc.a(s4);
                                    if(s5.contains(s3)) {
                                        linkedHashSet0.add(new accb(contactPerson0, contactPerson$ContactMethod0, 3));
                                        if(s5.equals(s3)) {
                                            z1 = true;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    ++v1;
                    iterator0 = iterator2;
                }
            }
            else if(accc0.c) {
                linkedHashSet0.add(new accb(contactPerson0, contactPerson0.a(), 3));
            }
            else {
                for(Object object1: contactPerson0.e) {
                    linkedHashSet0.add(new accb(contactPerson0, ((ContactPerson.ContactMethod)object1), 3));
                }
            }
        }
        if(accc0.d && !z && Patterns.EMAIL_ADDRESS.matcher(s).matches()) {
            ArrayList arrayList1 = new ArrayList();
            arrayList1.add(new ContactPerson.ContactMethod(1, s1));
            linkedHashSet0.add(new accb(new ContactPerson(s1, null, null, arrayList1), null, 5));
        }
        if(accc0.e && !z1 && Patterns.PHONE.matcher(s).matches()) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(new ContactPerson.ContactMethod(2, s1));
            linkedHashSet0.add(new accb(new ContactPerson(s1, null, null, arrayList2), null, 5));
        }
        accc0.h = new ArrayList(linkedHashSet0);
        accc0.l = new aceg(accc0, accc0.h);
        accc0.c(accc0.l);
    }
}

