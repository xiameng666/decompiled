import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class exsy {
    public static final String a(List list0) {
        ibuq.f(list0, "value");
        return ibpo.aK(list0, ",", null, null, null, 62);
    }

    public static final String b(Map map0) {
        return ibpo.aK(map0.entrySet(), ",", null, null, new exsw(), 30);
    }

    public static final String c(Map map0) {
        ibuq.f(map0, "map");
        return ibpo.aK(map0.entrySet(), ",", null, null, new exsv(), 30);
    }

    public static final String d(Map map0) {
        ibuq.f(map0, "map");
        return ibpo.aK(map0.entrySet(), ",", null, null, new exsu(), 30);
    }

    public static final String e(Map map0) {
        ibuq.f(map0, "map");
        return ibpo.aK(map0.entrySet(), ",", null, null, new exsx(), 30);
    }

    public static final List f(String s) {
        ibuq.f(s, "value");
        if(s.length() == 0) {
            return ibps.a;
        }
        List list0 = ibzk.T(s, new String[]{","}, 0, 6);
        List list1 = new ArrayList(ibpo.q(list0, 10));
        for(Object object0: list0) {
            list1.add(eyan.a(((String)object0)));
        }
        return list1;
    }

    public static final Map g(String s) {
        ibuq.f(s, "mapAsString");
        if(s.length() == 0) {
            return ibpt.a;
        }
        List list0 = ibzk.T(s, new String[]{","}, 0, 6);
        Map map0 = new LinkedHashMap(ibwt.g(ibpz.a(ibpo.q(list0, 10)), 16));
        for(Object object0: list0) {
            List list1 = ibzk.T(((String)object0), new String[]{"="}, 0, 6);
            ibns ibns0 = new ibns(eyan.a(((String)list1.get(0))), Long.parseLong(((String)list1.get(1))));
            map0.put(ibns0.a, ibns0.b);
        }
        return map0;
    }

    public static final Map h(String s) {
        ibuq.f(s, "mapAsString");
        if(s.length() == 0) {
            return ibpt.a;
        }
        List list0 = ibzk.T(s, new String[]{","}, 0, 6);
        Map map0 = new LinkedHashMap(ibwt.g(ibpz.a(ibpo.q(list0, 10)), 16));
        for(Object object0: list0) {
            List list1 = ibzk.T(((String)object0), new String[]{"="}, 0, 6);
            String s1 = (String)list1.get(0);
            String s2 = (String)list1.get(1);
            ibns ibns0 = new ibns(exjx.c(s1), ((exjr)Enum.valueOf(exjr.class, s2)));
            map0.put(ibns0.a, ibns0.b);
        }
        return map0;
    }

    public static final Map i(String s) {
        ibuq.f(s, "mapAsString");
        if(s.length() == 0) {
            return ibpt.a;
        }
        List list0 = ibzk.T(s, new String[]{","}, 0, 6);
        Map map0 = new LinkedHashMap(ibwt.g(ibpz.a(ibpo.q(list0, 10)), 16));
        for(Object object0: list0) {
            List list1 = ibzk.T(((String)object0), new String[]{"="}, 0, 6);
            String s1 = (String)list1.get(0);
            String s2 = (String)list1.get(1);
            ibns ibns0 = new ibns(exjx.c(s1), ((exjy)Enum.valueOf(exjy.class, s2)));
            map0.put(ibns0.a, ibns0.b);
        }
        return map0;
    }

    public static final Map j(String s) {
        ibuq.f(s, "mapAsString");
        if(s.length() == 0) {
            return ibpt.a;
        }
        List list0 = ibzk.T(s, new String[]{","}, 0, 6);
        Map map0 = new LinkedHashMap(ibwt.g(ibpz.a(ibpo.q(list0, 10)), 16));
        for(Object object0: list0) {
            List list1 = ibzk.T(((String)object0), new String[]{"="}, 0, 6);
            exjx exjx0 = exjx.c(((String)list1.get(0)));
            Integer integer0 = ibzk.f(((String)list1.get(1)));
            ibns ibns0 = new ibns(exjx0, ((int)(integer0 == null ? 0 : ((int)integer0))));
            map0.put(ibns0.a, ibns0.b);
        }
        return map0;
    }
}

