import android.util.Pair;

public final class egkw {
    public static Pair a(gdmq gdmq0) {
        if(gdmq0 != null) {
            if(gdmq0.f.size() > 0) {
                gdmg gdmg0 = (gdmg)gdmq0.f.get(0);
                String s = gdmg0.f;
                String s1 = gdmg0.g;
                int v = gdmg0.b;
                if((v & 2) != 0) {
                    return Pair.create(gdmg0.d, Integer.valueOf(40));
                }
                if((v & 0x40) != 0) {
                    return (v & 0x80) == 0 ? Pair.create(s, Integer.valueOf(40)) : Pair.create(a.r(s1, s, " "), Integer.valueOf(40));
                }
                return Pair.create(s1, Integer.valueOf(40));
            }
            if(gdmq0.h.size() > 0) {
                gdlt gdlt0 = (gdlt)gdmq0.h.get(0);
                if((gdlt0.b & 16) != 0) {
                    return Pair.create(gdlt0.f, Integer.valueOf(10));
                }
            }
            if(gdmq0.i.size() > 0) {
                gdmy gdmy0 = (gdmy)gdmq0.i.get(0);
                return (gdmy0.b & 2) == 0 ? null : Pair.create(gdmy0.d, Integer.valueOf(20));
            }
        }
        return null;
    }

    public static String b(gdmq gdmq0, String s) {
        if(!gdmq0.f.isEmpty()) {
            gdmg gdmg0 = (gdmg)gdmq0.f.get(0);
            String s1 = gdmg0.f;
            String s2 = gdmg0.g;
            if(!s1.isEmpty() && !s2.isEmpty()) {
                return a.r(s1, s2, " ");
            }
            return s2.isEmpty() ? s : s2;
        }
        return s;
    }
}

