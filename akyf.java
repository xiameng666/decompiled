import android.content.Context;
import java.util.HashMap;
import java.util.Map;

public final class akyf {
    public static final bboh a;
    public final Context b;
    public final Map c;
    public boolean d;
    public ByteString e;
    public ByteString f;
    public final akwb g;
    private static akyf h;
    private final yuv i;

    static {
        akyf.a = alis.a("NearbyMediator");
    }

    private akyf(Context context0) {
        akwz akwz0 = new akwz(context0);
        akwz0.a.b = new akvu();
        yuv yuv0 = new yuv(akwz0.a);
        super();
        this.c = new HashMap();
        this.b = context0.getApplicationContext();
        this.i = yuv0;
        this.g = new akwb(yuv0);
    }

    public final akyd a(String s) {
        Map map0 = this.c;
        akye akye0 = this.b();
        if(map0.containsKey(s)) {
            akye0 = (akye)map0.get(s);
        }
        else {
            ((ggtj)akyf.a.j()).B("Missing profile type for endpoint %s", s);
        }
        if(akye0 == akye.a) {
            return this.g.a();
        }
        ywf ywf0 = this.g.a.k().b();
        return this.g.b(ywf0);
    }

    final akye b() {
        return this.i.k().d() ? akye.b : akye.a;
    }

    public static akyf c(Context context0) {
        if(akyf.h == null) {
            akyf.h = new akyf(context0);
        }
        return akyf.h;
    }

    public final gmcd d(String s, ByteString hfsf0) {
        try {
            ((ggtj)akyf.a.h()).B("sendMessage to endpoint %s", s);
            this.e();
            return this.g.a().a(s, hfsf0);
        }
        catch(ywm ywm0) {
            a.ae(akyf.a.j(), "sendMessage error", ywm0);
            return gmbu.h(ywm0);
        }
    }

    public final void e() {
        batl.j();
        yuv yuv0 = this.i;
        if(!yuv0.j() && yuv0.i()) {
            yuv0.c();
        }
    }
}

