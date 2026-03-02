import android.util.Size;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;

public final class bmp {
    public static final bmj a;
    public static final bmm[] b;
    public static final Map c;
    public final bmo d;
    public final bmm e;
    public final bmj f;
    public final int g;
    private static final Map h;

    static {
        bmp.a = bmj.a;
        bmp.b = new bmm[]{bmm.c, bmm.e, bmm.f, bmm.h, bmm.i, bmm.b};
        Map map0 = ibpz.i(new ibns[]{new ibns(bmo.b, ((int)35)), new ibns(bmo.c, ((int)0x100)), new ibns(bmo.d, ((int)0x1005)), new ibns(bmo.e, ((int)0x20)), new ibns(bmo.a, ((int)34))});
        bmp.h = map0;
        Set set0 = map0.entrySet();
        LinkedHashMap linkedHashMap0 = new LinkedHashMap(ibwt.g(ibpz.a(ibpo.q(set0, 10)), 16));
        for(Object object0: set0) {
            linkedHashMap0.put(Integer.valueOf(((Number)((Map.Entry)object0).getValue()).intValue()), ((bmo)((Map.Entry)object0).getKey()));
        }
        bmp.c = linkedHashMap0;
    }

    public bmp(bmo bmo0, bmm bmm0, bmj bmj0) {
        ibuq.f(bmo0, "configType");
        ibuq.f(bmm0, "configSize");
        ibuq.f(bmj0, "streamUseCase");
        super();
        this.d = bmo0;
        this.e = bmm0;
        this.f = bmj0;
        Integer integer0 = (Integer)bmp.h.get(bmo0);
        this.g = integer0 == null ? 0 : ((int)integer0);
    }

    public static final bmp a(bmo bmo0, bmm bmm0) {
        ibuq.f(bmo0, "type");
        ibuq.f(bmm0, "size");
        return bml.a(bmo0, bmm0, bmp.a);
    }

    public static final bmp b(int v, Size size0, bmq bmq0, bmn bmn0, bmj bmj0) {
        return bml.c(v, size0, bmq0, bmn0, bmj0);
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof bmp)) {
            return false;
        }
        if(this.d != ((bmp)object0).d) {
            return false;
        }
        return this.e == ((bmp)object0).e ? this.f == ((bmp)object0).f : false;
    }

    @Override
    public final int hashCode() {
        return (this.d.hashCode() * 0x1F + this.e.hashCode()) * 0x1F + this.f.hashCode();
    }

    @Override
    public final String toString() {
        return "SurfaceConfig(configType=" + this.d + ", configSize=" + this.e + ", streamUseCase=" + this.f + ')';
    }
}

