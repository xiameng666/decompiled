import com.google.android.gms.multidevice.Setting;
import com.google.android.gms.multidevice.XdFeature;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class cszy {
    public static List a(cszz cszz0) {
        List list0 = cszz0.a;
        List list1 = new ArrayList();
        for(Object object0: list0) {
            ctac ctac0 = (ctac)object0;
            ibuq.f(ctac0, "<this>");
            List list2 = ctac0.a.c;
            if(!(list2 instanceof Collection) || !list2.isEmpty()) {
                for(Object object1: list2) {
                    if(!((Setting)object1).a()) {
                        continue;
                    }
                    int v = ctac0.a.a;
                    List list3 = ctac0.a.c;
                    ArrayList arrayList0 = new ArrayList();
                    for(Object object2: list3) {
                        if(((Setting)object2).a()) {
                            arrayList0.add(object2);
                        }
                    }
                    ctac0.a = new XdFeature(v, arrayList0);
                    goto label_25;
                }
            }
            ctac0 = null;
        label_25:
            if(ctac0 != null) {
                list1.add(ctac0);
            }
        }
        return list1;
    }
}

