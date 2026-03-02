import java.util.List;

public final class goxi {
    public final int a;
    public final int b;

    public goxi(String s, int v) {
        this.a = goxi.a(s);
        this.b = v;
    }

    public static int a(String s) {
        try {
            List list0 = gfud.h("[.-]").n(s);
            if(list0.size() == 1) {
                return Integer.parseInt(s);
            }
            return list0.size() < 3 ? -1 : Integer.parseInt(((String)list0.get(0))) * 1000000 + Integer.parseInt(((String)list0.get(1))) * 1000 + Integer.parseInt(((String)list0.get(2)));
        }
        catch(IllegalArgumentException unused_ex) {
        }
        return -1;
    }
}

