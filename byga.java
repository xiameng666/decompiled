import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public final class byga implements ibtw {
    public final bydr a;
    public final Drawable b;
    public final String c;
    public final List d;

    public byga(bydr bydr0, Drawable drawable0, String s, List list0) {
        this.a = bydr0;
        this.b = drawable0;
        this.c = s;
        this.d = list0;
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        ibuq.f(((String)object0), "k");
        List list0 = this.d;
        if(((bynu)object1) == null) {
            bydr bydr0 = this.a;
            HashSet hashSet0 = new HashSet();
            ArrayList arrayList0 = new ArrayList();
            for(Object object2: list0) {
                if(hashSet0.add(((bynx)object2).b)) {
                    arrayList0.add(object2);
                }
            }
            return new bynu(bydr0.a, this.b, this.c, arrayList0);
        }
        List list1 = ibpo.ak(list0, ((bynu)object1).d);
        HashSet hashSet1 = new HashSet();
        ArrayList arrayList1 = new ArrayList();
        for(Object object3: list1) {
            if(hashSet1.add(((bynx)object3).b)) {
                arrayList1.add(object3);
            }
        }
        ibuq.f(((bynu)object1).a, "id");
        ibuq.f(((bynu)object1).b, "icon");
        ibuq.f(((bynu)object1).c, "displayName");
        return new bynu(((bynu)object1).a, ((bynu)object1).b, ((bynu)object1).c, arrayList1);
    }
}

