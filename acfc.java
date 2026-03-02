import android.text.TextUtils;
import com.google.android.gms.appinvite.model.ContactPerson;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public final class acfc {
    public final ArrayList a;
    private final Map b;
    private final Map c;
    private final Map d;

    public acfc() {
        this.b = new HashMap();
        this.c = new HashMap();
        this.d = new HashMap();
        this.a = new ArrayList();
    }

    public final ContactPerson a(ContactPerson contactPerson0) {
        ContactPerson contactPerson1 = (ContactPerson)this.b.get(contactPerson0.b);
        if(contactPerson1 != null) {
            String s = contactPerson1.a;
            acfd.d(contactPerson1, contactPerson0);
            this.e(contactPerson1, s);
            return contactPerson1;
        }
        ContactPerson contactPerson2 = (ContactPerson)this.c.get(contactPerson0.c);
        if(contactPerson2 != null) {
            String s1 = contactPerson2.a;
            acfd.d(contactPerson2, contactPerson0);
            this.e(contactPerson2, s1);
            return contactPerson2;
        }
        Object object0 = this.d.get(contactPerson0.a);
        if((object0 instanceof ContactPerson)) {
            if(acfd.h(((ContactPerson)object0), contactPerson0)) {
                this.d(((ContactPerson)object0));
                return (ContactPerson)object0;
            }
        }
        else if((object0 instanceof Set)) {
            for(Object object1: ((Set)object0)) {
                ContactPerson contactPerson3 = (ContactPerson)object1;
                if(acfd.h(contactPerson3, contactPerson0)) {
                    this.d(contactPerson3);
                    return contactPerson3;
                }
            }
        }
        this.a.add(contactPerson0);
        this.d(contactPerson0);
        return contactPerson0;
    }

    public final void b(Collection collection0) {
        for(Object object0: collection0) {
            this.a(((ContactPerson)object0));
        }
    }

    public final void c() {
        Collator collator0 = Collator.getInstance();
        collator0.setStrength(1);
        acfb acfb0 = new acfb(this, collator0);
        Collections.sort(this.a, acfb0);
    }

    private final void d(ContactPerson contactPerson0) {
        if(!TextUtils.isEmpty(contactPerson0.b)) {
            this.b.put(contactPerson0.b, contactPerson0);
        }
        Long long0 = contactPerson0.c;
        if(long0 != null) {
            this.c.put(long0, contactPerson0);
        }
        Map map0 = this.d;
        Object object0 = map0.get(contactPerson0.a);
        if(object0 == null) {
            map0.put(contactPerson0.a, contactPerson0);
            return;
        }
        if((object0 instanceof ContactPerson)) {
            if(!contactPerson0.equals(object0)) {
                HashSet hashSet0 = new HashSet();
                hashSet0.add(((ContactPerson)object0));
                hashSet0.add(contactPerson0);
                map0.put(contactPerson0.a, hashSet0);
            }
        }
        else if((object0 instanceof Set)) {
            ((Set)object0).add(contactPerson0);
        }
    }

    private final void e(ContactPerson contactPerson0, String s) {
        if(!bata.b(contactPerson0.a, s)) {
            Map map0 = this.d;
            Object object0 = map0.get(s);
            if(contactPerson0.equals(object0)) {
                map0.remove(s);
            }
            else if((object0 instanceof Set)) {
                ((Set)object0).remove(contactPerson0);
            }
        }
        this.d(contactPerson0);
    }
}

