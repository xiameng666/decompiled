import java.util.LinkedHashMap;
import java.util.Map;

public final class eyet {
    public final exyg a;
    public final eyfl b;
    public final eyny c;
    public final icck d;
    public final iccs e;
    public final eyez f;
    public final Map g;
    private final gfuv h;

    public eyet(exyg exyg0, eyfl eyfl0, gfuv gfuv0, eyny eyny0, icck icck0) {
        ibuq.f(eyny0, "deeplinkArguments");
        super();
        this.a = exyg0;
        this.b = eyfl0;
        this.h = gfuv0;
        this.c = eyny0;
        this.d = icck0;
        eyer eyer0 = new eyer(this, null);
        this.e = icbb.a(icck0, null, iccm.b, eyer0, 1);
        eyez eyez0 = new eyez(gfuv0, new eyen(this));
        eyez0.c();
        this.f = eyez0;
        this.g = new LinkedHashMap();
    }

    public final eyep a(eyeq eyeq0) {
        ibuq.f(eyeq0, "setupFragment");
        Map map0 = this.g;
        Object object0 = map0.get(eyeq0);
        if(object0 == null) {
            eyeo eyeo0 = new eyeo();
            object0 = new eyep(new eyez(this.h, eyeo0), this.f);
            map0.put(eyeq0, object0);
        }
        return (eyep)object0;
    }
}

