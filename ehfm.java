import com.google.android.gms.people.cpg.model.GroupContactOrder;
import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;

public final class ehfm {
    public static egzx a(ggeo ggeo0, egzx egzx0) {
        GroupContactOrder groupContactOrder0 = (GroupContactOrder)ggeo0.get(egzx0.h);
        if(groupContactOrder0 == null) {
            return egzx0;
        }
        egzw egzw0 = new egzw(egzx0);
        egzw0.l = groupContactOrder0;
        return egzw0.a();
    }

    public static List b(List list0, ggeo ggeo0) {
        List list1 = new ArrayList(list0.size());
        for(Object object0: list0) {
            egzx egzx0 = (egzx)object0;
            Long long0 = egzx0.h;
            if(ggeo0.containsKey(long0)) {
                list1.add(((egzx)ggeo0.get(long0)));
            }
            else {
                list1.add(egzx0);
            }
        }
        return list1;
    }

    static void c(ggeo ggeo0, Map map0) {
        for(Object object0: map0.entrySet()) {
            Map.Entry map$Entry0 = (Map.Entry)object0;
            if(ggeo0.containsKey(((egzx)map$Entry0.getValue()).h)) {
                map$Entry0.setValue(ehfm.a(ggeo0, ((egzx)map$Entry0.getValue())));
            }
        }
    }
}

