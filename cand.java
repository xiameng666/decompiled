import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Set;

public final class cand {
    public static Set a(Set set0) {
        HashMap hashMap0 = new HashMap();
        for(Object object0: set0) {
            Long long0 = ((canj)object0).a;
            Long long1 = ((canj)object0).b;
            if(!hashMap0.containsKey(long0)) {
            }
            else if(((long)long1) <= ((long)(((Long)hashMap0.get(long0))))) {
                continue;
            }
            hashMap0.put(long0, long1);
        }
        Set set1 = new HashSet();
        for(Object object1: hashMap0.entrySet()) {
            set1.add(new canj(((Long)((Map.Entry)object1).getKey()), ((Long)((Map.Entry)object1).getValue())));
        }
        return set1;
    }
}

