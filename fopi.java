import j..util.Objects;
import java.util.Arrays;

public final class fopi {
    public final long a;
    public final String b;
    public final String c;
    public final int d;
    public final int[] e;
    public final String[] f;
    public final foph g;
    private static final int[] h;
    private static final String[] i;

    static {
        fopi.h = new int[0];
        fopi.i = new String[0];
    }

    private fopi(String s, String s1, int v, long v1, foph foph0) {
        this(s, s1, v, v1, fopi.h, fopi.i, foph0);
    }

    private fopi(String s, String s1, int v, long v1, int[] arr_v, String[] arr_s, foph foph0) {
        this.b = s;
        this.c = s1;
        this.d = v;
        this.a = v1;
        this.e = arr_v;
        this.f = arr_s;
        this.g = foph0;
    }

    public static fopi a(ggtu ggtu0) {
        foph foph0;
        Boolean boolean0 = (Boolean)ggtu0.c().d(fopg.a);
        if(boolean0 != null && boolean0.booleanValue()) {
            ggux ggux0 = ggtu0.d();
            String s = ggux0 == null ? ggtu0.e().toString() : ggux0.b;
            String s1 = ggtu0.b().e();
            if(s1 == null) {
                foph0 = null;
            }
            else {
                Long long0 = (Long)ggtu0.c().d(fopg.c);
                foph0 = long0 == null ? null : new foph(ggtu0.g(), s, s1, ((long)long0));
            }
        }
        else {
            foph0 = null;
        }
        if(ggtu0.d() == null) {
            return new fopi(ggtu0.b().b(), ggtu0.b().d(), ggtu0.b().a(), ggtu0.a(), foph0);
        }
        Object[] arr_object = ggtu0.i();
        int v2 = 0;
        for(int v1 = 0; v1 < arr_object.length; ++v1) {
            if(fopi.b(arr_object[v1])) {
                ++v2;
            }
        }
        if(v2 == 0) {
            return new fopi(ggtu0.b().b(), ggtu0.b().d(), ggtu0.b().a(), ggtu0.a(), foph0);
        }
        int[] arr_v = new int[v2];
        String[] arr_s = new String[v2];
        int v3 = 0;
        for(int v = 0; v < arr_object.length; ++v) {
            Object object0 = arr_object[v];
            if(fopi.b(object0)) {
                arr_v[v3] = v;
                arr_s[v3] = object0 == null ? "null" : ((foqh)object0).b();
                ++v3;
            }
        }
        return new fopi(ggtu0.b().b(), ggtu0.b().d(), ggtu0.b().a(), ggtu0.a(), arr_v, arr_s, foph0);
    }

    private static boolean b(Object object0) {
        return object0 == null || (object0 instanceof foqh);
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof fopi) ? Objects.equals(this.b, ((fopi)object0).b) && Objects.equals(this.c, ((fopi)object0).c) && this.d == ((fopi)object0).d && this.a == ((fopi)object0).a && Arrays.equals(this.e, ((fopi)object0).e) && Arrays.equals(this.f, ((fopi)object0).f) && Objects.equals(this.g, ((fopi)object0).g) : false;
    }

    @Override
    public final int hashCode() {
        Integer integer0 = Arrays.hashCode(this.e);
        Integer integer1 = Arrays.hashCode(this.f);
        return Objects.hash(new Object[]{this.b, this.c, ((int)this.d), ((long)this.a), integer0, integer1, this.g});
    }
}

