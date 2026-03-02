import java.util.Collections;
import java.util.List;

public final class dviy {
    public static final String a;
    public static final String b;
    public static final String c;
    public final String d;
    public final String e;
    public final dvjh f;

    static {
        dviy.a = String.format("WHERE %s=? AND %s=?", "account_id", "environment");
        dviy.b = String.format("%s=?", "active");
        dviy.c = String.format("%s=?", "local_only");
    }

    public dviy(String s, String s1) {
        this.d = s;
        this.e = s1;
        gged_interceptors gged0 = gged_interceptors.m(s, s1);
        this.f = new dvjh(dviy.a, gged0);
    }

    public static gfsx a(gfsx gfsx0, String s, String[] arr_s) {
        if(arr_s != null && arr_s.length != 0) {
            String s1 = new gfss(",").b(Collections.nCopies(arr_s.length, "?"));
            String s2 = dviy.c(gfsx0);
            ggdy ggdy0 = new ggdy();
            ggdy0.j(arr_s);
            return gfsx.m(new dvjh(s2 + s + " IN (" + s1 + ")", ggdy0.h()));
        }
        return gfqx.a;
    }

    public static String b(guwf guwf0) {
        return String.valueOf(ftqn.a(guwf.class, guwf0));
    }

    public static String c(gfsx gfsx0) {
        return ((String)((gftm)gfsx0).a) + ".";
    }

    public static boolean d(StringBuilder stringBuilder0, List list0, gfsx gfsx0) {
        if(!gfsx0.i()) {
            return false;
        }
        Object object0 = gfsx0.d();
        stringBuilder0.append(" AND ");
        stringBuilder0.append(((dvjh)object0).a);
        list0.addAll(((dvjh)object0).b);
        return true;
    }
}

