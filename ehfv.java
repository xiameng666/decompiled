import com.google.android.gms.people.cpg.model.GroupContactOrder;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;

public final class ehfv {
    public final egzr a;

    public ehfv(egzr egzr0) {
        this.a = egzr0;
    }

    public final ggeo a(List list0) {
        if(list0.isEmpty()) {
            return ggnf.a;
        }
        HashMap hashMap0 = new HashMap();
        try {
            HashSet hashSet0 = new HashSet();
            for(Object object0: list0) {
                hashSet0.add(((Long)object0).toString());
            }
            ggfp ggfp0 = ggfp.G(hashSet0);
            ggqj ggqj0 = ggeo.k(this.a.a(ggfp0)).v().om();
            while(ggqj0.hasNext()) {
                Object object1 = ggqj0.next();
                hashMap0.put(Long.valueOf(Long.parseLong(((String)((Map.Entry)object1).getKey()))), ((GroupContactOrder)((Map.Entry)object1).getValue()));
            }
        }
        catch(NumberFormatException numberFormatException0) {
            egig.c("FSA2_LocalCpgReader", "Invalid rawGroupId for ContactGroupOrder", numberFormatException0);
            return ggnf.a;
        }
        return ggeo.k(hashMap0);
    }
}

