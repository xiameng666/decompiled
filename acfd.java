import android.content.Context;
import android.telephony.PhoneNumberUtils;
import android.text.TextUtils;
import com.google.android.gms.appinvite.model.ContactPerson.ContactMethod;
import com.google.android.gms.appinvite.model.ContactPerson;
import com.google.android.gms.people.model.AvatarReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class acfd {
    private static String[] a;

    public static String a(Context context0, ContactPerson contactPerson0) {
        String s = acfd.b(contactPerson0);
        return TextUtils.isEmpty(s) ? "(No Name)" : s;
    }

    public static String b(ContactPerson contactPerson0) {
        if(!TextUtils.isEmpty(contactPerson0.a)) {
            return contactPerson0.a;
        }
        ContactPerson.ContactMethod contactPerson$ContactMethod0 = contactPerson0.a();
        if(contactPerson$ContactMethod0 == null) {
            return "";
        }
        return contactPerson$ContactMethod0.a == 1 || contactPerson$ContactMethod0.a == 2 ? contactPerson$ContactMethod0.b : "";
    }

    public static void c(List list0, List list1, List list2, List list3) {
        Iterator iterator0 = list0.iterator();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            if(acfd.f(((ContactPerson)object0), list1, list2, list3)) {
                iterator0.remove();
            }
        }
    }

    public static void d(ContactPerson contactPerson0, ContactPerson contactPerson1) {
        contactPerson0.a = (String)acfd.j(contactPerson0.a, contactPerson1.a);
        contactPerson0.b = (String)acfd.j(contactPerson0.b, contactPerson1.b);
        contactPerson0.c = (Long)acfd.j(contactPerson0.c, contactPerson1.c);
        contactPerson0.d = (AvatarReference)acfd.j(contactPerson0.d, contactPerson1.d);
        ArrayList arrayList0 = new ArrayList(contactPerson1.e);
        arrayList0.removeAll(contactPerson0.e);
        contactPerson0.e.addAll(arrayList0);
    }

    public static void e(ContactPerson contactPerson0, ContactPerson contactPerson1) {
        if(contactPerson0 == contactPerson1) {
            return;
        }
        contactPerson0.a = contactPerson1.a;
        contactPerson0.b = contactPerson1.b;
        contactPerson0.c = contactPerson1.c;
        contactPerson0.d = contactPerson1.d;
        contactPerson0.e.clear();
        contactPerson0.e.addAll(contactPerson1.e);
        contactPerson0.b(contactPerson1.a());
    }

    public static boolean f(ContactPerson contactPerson0, List list0, List list1, List list2) {
        if(contactPerson0 != null && (list0 != null || list1 != null || list2 != null)) {
            if(list0 != null && (contactPerson0.b != null && list0.contains(contactPerson0.b))) {
                return true;
            }
            ArrayList arrayList0 = contactPerson0.e;
            for(int v = 0; v < arrayList0.size(); ++v) {
                ContactPerson.ContactMethod contactPerson$ContactMethod0 = (ContactPerson.ContactMethod)arrayList0.get(v);
                String s = contactPerson$ContactMethod0.b;
                if(s != null) {
                    int v1 = contactPerson$ContactMethod0.a;
                    if(v1 == 1) {
                        if(list1 != null && list1.contains(s.toLowerCase())) {
                            return true;
                        }
                    }
                    else if(v1 == 2 && list2 != null && list2.contains(PhoneNumberUtils.stripSeparators(s))) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static boolean g(ContactPerson contactPerson0, ContactPerson contactPerson1) {
        if(!bata.b(contactPerson0, contactPerson1)) {
            return TextUtils.isEmpty(contactPerson0.b) || !contactPerson0.b.equals(contactPerson1.b) ? contactPerson0.c != null && contactPerson0.c.equals(contactPerson1.c) : true;
        }
        return true;
    }

    public static boolean h(ContactPerson contactPerson0, ContactPerson contactPerson1) {
        ArrayList arrayList0 = contactPerson0.e;
        if(!arrayList0.isEmpty()) {
            ArrayList arrayList1 = contactPerson1.e;
            if(!arrayList1.isEmpty()) {
                boolean z = arrayList0.containsAll(arrayList1);
                boolean z1 = arrayList1.containsAll(arrayList0);
                if(z) {
                    if(z1) {
                        AvatarReference avatarReference0 = contactPerson0.d;
                        if(!acfd.l(avatarReference0, contactPerson1.d)) {
                            String s = contactPerson0.b;
                            if(acfd.l(s, contactPerson1.b)) {
                                if(s == null) {
                                    acfd.e(contactPerson0, contactPerson1);
                                    return true;
                                }
                            }
                            else if(acfd.l(contactPerson0.c, contactPerson1.c) && contactPerson0.c == null) {
                                acfd.e(contactPerson0, contactPerson1);
                            }
                        }
                        else if(avatarReference0 == null) {
                            acfd.e(contactPerson0, contactPerson1);
                            return true;
                        }
                        return true;
                    }
                    z1 = false;
                }
                if(z) {
                    return true;
                }
                if(z1) {
                    acfd.e(contactPerson0, contactPerson1);
                    return true;
                }
                ArrayList arrayList2 = new ArrayList(arrayList0);
                ArrayList arrayList3 = new ArrayList(arrayList1);
                arrayList2.removeAll(arrayList1);
                arrayList3.removeAll(arrayList0);
                return acfd.k(arrayList2) && acfd.k(arrayList3);
            }
        }
        return false;
    }

    public static String[] i(String[] arr_s) {
        synchronized(acfd.class) {
            if(arr_s != null && arr_s.length > 0) {
                return arr_s;
            }
            if(acfd.a == null) {
                acfd.a = houq.a.b().g().split(";");
            }
        }
        return acfd.a;
    }

    private static Object j(Object object0, Object object1) {
        return object0 == null ? object1 : object0;
    }

    private static boolean k(List list0) {
        for(Object object0: list0) {
            if(((ContactPerson.ContactMethod)object0).a != 0) {
                return false;
            }
        }
        return true;
    }

    private static boolean l(Object object0, Object object1) {
        return (object0 == null ? 1 : 0) != (object1 == null ? 1 : 0);
    }
}

