import android.text.TextUtils;
import android.util.SparseArray;
import java.util.HashSet;
import java.util.Set;

public final class ekba {
    public SparseArray a;
    public SparseArray b;

    static Set a(gsva gsva0) {
        Set set0 = new HashSet();
        if(gsva0 != null) {
            if(!gsva0.c.isEmpty()) {
                set0.add(gsva0.c);
            }
            boolean z = hxui.f();
            for(Object object0: gsva0.g) {
                set0.add(ekba.f(((gsux)object0).b, z));
                set0.add(((gsux)object0).c);
            }
            for(Object object1: gsva0.f) {
                set0.add(((gsuw)object1).b);
                set0.add(((gsuw)object1).c);
            }
            for(Object object2: gsva0.h) {
                set0.add(((gsuy)object2).b);
                set0.add(((gsuy)object2).c);
            }
        }
        return set0;
    }

    public static Set b(gsuw[] arr_gsuw) {
        Set set0 = new HashSet();
        for(int v = 0; v < arr_gsuw.length; ++v) {
            set0.add(arr_gsuw[v].b);
        }
        return set0;
    }

    public static Set c(gsux[] arr_gsux) {
        boolean z = hxui.f();
        Set set0 = new HashSet();
        for(int v = 0; v < arr_gsux.length; ++v) {
            set0.add(ekba.f(arr_gsux[v].b, z));
        }
        return set0;
    }

    public static Set d(gsuy[] arr_gsuy) {
        Set set0 = new HashSet();
        for(int v = 0; v < arr_gsuy.length; ++v) {
            set0.add(arr_gsuy[v].b);
        }
        return set0;
    }

    public static boolean e(gsva gsva0, Set set0) {
        for(Object object0: set0) {
            gsva gsva1 = (gsva)object0;
            if(bata.b(ekba.b(((gsuw[])gsva0.f.toArray(new gsuw[0]))), ekba.b(((gsuw[])gsva1.f.toArray(new gsuw[0])))) && bata.b(ekba.c(((gsux[])gsva0.g.toArray(new gsux[0]))), ekba.c(((gsux[])gsva1.g.toArray(new gsux[0])))) && bata.b(ekba.d(((gsuy[])gsva0.h.toArray(new gsuy[0]))), ekba.d(((gsuy[])gsva1.h.toArray(new gsuy[0])))) && bata.b(gsva0.c, gsva1.c)) {
                return true;
            }
        }
        return false;
    }

    private static String f(String s, boolean z) {
        if(z) {
            if(TextUtils.isEmpty(s)) {
                return gfqx.a.i() ? ((String)gfqx.a.d()) : ekbe.a(s);
            }
            StringBuilder stringBuilder0 = new StringBuilder();
            int v = (int)hxui.a.d().e();
            int v1 = s.length() - 1;
            int v2 = 0;
            while(v1 >= 0 && v2 != v) {
                int v3 = s.charAt(v1);
                Character character0 = Character.valueOf(((char)v3));
                character0.getClass();
                if(v3 >= 0x30) {
                    character0.getClass();
                    if(v3 <= 57) {
                        stringBuilder0.append(character0);
                        ++v2;
                    }
                }
                --v1;
            }
            String s1 = stringBuilder0.toString();
            if(s1.isEmpty()) {
                return gfqx.a.i() ? ((String)gfqx.a.d()) : ekbe.a(s);
            }
            gfsx gfsx0 = gfsx.m(s1);
            return gfsx0.i() ? ((String)gfsx0.d()) : ekbe.a(s);
        }
        return ekbe.a(s);
    }
}

