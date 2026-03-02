import com.google.android.gms.nearby.sharing.Contact;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

final class deby extends ibuo implements ibtw {
    public static final deby a;

    static {
        deby.a = new deby();
    }

    public deby() {
        super(2, debp.class, "contactsReducer", "contactsReducer(Lcom/google/android/gms/nearby/sharing/main/contacts/ContactsState;Lcom/google/android/gms/nearby/sharing/main/contacts/ContactsEvent;)Lcom/google/android/gms/nearby/sharing/main/contacts/ContactsState;", 1);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        ibuq.f(((decl)object0), "p0");
        ibuq.f(((debe)object1), "p1");
        ibuq.f(((decl)object0), "state");
        ibuq.f(((debe)object1), "event");
        if((((debe)object1) instanceof debc)) {
            return decl.a(((decl)object0), ((debc)(((debe)object1))).a, null, 2);
        }
        if(!(((debe)object1) instanceof debd)) {
            throw new ibnq();
        }
        List list0 = ((debd)(((debe)object1))).a;
        if(list0.isEmpty()) {
            return decl.a(((decl)object0), null, debh.a, 1);
        }
        ArrayList arrayList0 = new ArrayList();
        for(Object object2: list0) {
            if(((Contact)object2).h) {
                arrayList0.add(object2);
            }
        }
        ArrayList arrayList1 = new ArrayList(ibpo.q(arrayList0, 10));
        for(Object object3: arrayList0) {
            arrayList1.add(debp.a(((Contact)object3)));
        }
        List list1 = ibpo.ao(arrayList1, new debn());
        ArrayList arrayList2 = new ArrayList(ibpo.q(((debd)(((debe)object1))).a, 10));
        for(Object object4: ((debd)(((debe)object1))).a) {
            arrayList2.add(debp.a(((Contact)object4)));
        }
        List list2 = ibpo.ao(arrayList2, new debo());
        LinkedHashMap linkedHashMap0 = new LinkedHashMap();
        for(Object object5: list2) {
            String s = ddhf.a(((deax)object5).a);
            Object object6 = linkedHashMap0.get(s);
            if(object6 == null) {
                object6 = new ArrayList();
                linkedHashMap0.put(s, object6);
            }
            ((List)object6).add(object5);
        }
        return decl.a(((decl)object0), null, new debf(list1, linkedHashMap0), 1);
    }
}

