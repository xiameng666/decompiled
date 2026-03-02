import com.google.firebase.appindexing.internal.Thing;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class bwsb {
    static bwsa a(Thing thing0, String s, bwtc bwtc0) {
        int v = bwsz.a(thing0);
        return new bwsa(bwtc0.a(thing0.e), s, v);
    }

    public static Map b(Thing[] arr_thing, String s, bwtc bwtc0) {
        Map map0 = new HashMap();
        for(int v = 0; v < arr_thing.length; ++v) {
            Thing thing0 = arr_thing[v];
            bwsa bwsa0 = bwsb.a(thing0, s, bwtc0);
            List list0 = (List)map0.get(bwsa0);
            if(list0 == null) {
                list0 = new ArrayList();
                map0.put(bwsa0, list0);
            }
            list0.add(thing0);
        }
        return map0;
    }
}

