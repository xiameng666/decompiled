import java.net.InetSocketAddress;
import java.net.URI;
import java.util.Collection;
import java.util.Collections;

public final class iaxq extends iaov {
    private static final boolean a;

    static {
        iaxq.a = iapg.b(iaxq.class.getClassLoader());
    }

    @Override  // iaop
    public final iaou a(URI uRI0, iaon iaon0) {
        if("dns".equals(uRI0.getScheme())) {
            String s = uRI0.getPath();
            gftb.z(s, "targetPath");
            gftb.m(s.startsWith("/"), "the path component (%s) of the target (%s) must start with \'/\'", s, uRI0);
            uRI0.getAuthority();
            gfug gfug0 = new gfug();
            return new iaxp(s.substring(1), iaon0, iayh.m, gfug0, iaxq.a);
        }
        return null;
    }

    @Override  // iaop
    public final String b() {
        return "dns";
    }

    @Override  // iaov
    public final int c() {
        return 5;
    }

    @Override  // iaov
    public final Collection d() {
        return Collections.singleton(InetSocketAddress.class);
    }

    @Override  // iaov
    protected final void e() {
    }
}

