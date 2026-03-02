import java.lang.reflect.InvocationTargetException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class iaqh extends iakn implements iamm {
    public static final Logger a;
    final gdwp b;
    public iaof_metadata c;
    public Map d;
    private static final iaqf e;
    private static final Class f;
    private static final Class g;
    private final boolean h;
    private final boolean i;

    static {
        iaqf iaqf0;
        Class class1;
        iaqh.a = Logger.getLogger(iaqh.class.getName());
        ClassLoader classLoader0 = iaqh.class.getClassLoader();
        Class class0 = null;
        try {
            class1 = Class.forName("gdxd", false, classLoader0);
        }
        catch(ClassNotFoundException unused_ex) {
            goto label_8;
        }
        try {
            iaqf0 = new iaqf(class1, classLoader0);
            goto label_9;
        }
        catch(ClassNotFoundException | NoSuchMethodException exception0) {
            iaqh.a.logp(Level.WARNING, "io.grpc.auth.GoogleAuthLibraryCallCredentials", "createJwtHelperOrNull", "Failed to create JWT helper. This is unexpected", exception0);
        }
    label_8:
        iaqf0 = null;
    label_9:
        iaqh.e = iaqf0;
        iaqh.f = gdwt.class.asSubclass(gdwp.class);
        try {
            class0 = Class.forName("com.google.auth.appengine.AppEngineCredentials");
        }
        catch(ClassNotFoundException classNotFoundException0) {
            iaqh.a.logp(Level.FINE, "io.grpc.auth.GoogleAuthLibraryCallCredentials", "loadAppEngineCredentials", "AppEngineCredentials not available in classloader", classNotFoundException0);
        }
        iaqh.g = class0;
    }

    public iaqh(gdwp gdwp0) {
        gdwp gdwp1;
        iaqf iaqf0 = iaqh.e;
        super();
        boolean z = iaqh.f == null ? false : iaqh.f.isInstance(gdwp0);
        if(iaqf0 != null && iaqf0.a.isInstance(gdwp0)) {
            try {
                gdwp1 = gdwp0;
                gdwp1 = (gdwp)iaqf0.a.cast(gdwp0);
                goto label_10;
            }
            catch(IllegalAccessException illegalAccessException0) {
                goto label_23;
            }
            catch(InvocationTargetException invocationTargetException0) {
            }
            InvocationTargetException invocationTargetException1 = invocationTargetException0;
            goto label_25;
            try {
            label_10:
                if(((Collection)iaqf0.d.invoke(gdwp1, null)).size() == 0) {
                    Object object0 = iaqf0.b.invoke(null, null);
                    for(Object object1: iaqf0.e) {
                        Object[] arr_object = {((iaqg)object1).a.invoke(gdwp1, null)};
                        ((iaqg)object1).b.invoke(object0, arr_object);
                    }
                    gdwp0 = (gdwp)iaqf0.c.invoke(object0, null);
                }
                else {
                    gdwp0 = gdwp1;
                }
                goto label_26;
            }
            catch(IllegalAccessException | InvocationTargetException illegalAccessException0) {
            label_23:
                invocationTargetException1 = illegalAccessException0;
                gdwp0 = gdwp1;
            }
        label_25:
            iaqh.a.logp(Level.WARNING, "io.grpc.auth.GoogleAuthLibraryCallCredentials$JwtHelper", "tryServiceAccountToJwt", "Failed converting service account credential to JWT. This is unexpected", invocationTargetException1);
        }
    label_26:
        this.h = z;
        this.b = gdwp0;
        Class class0 = iaqh.g;
        if(class0 == null) {
            this.i = false;
            return;
        }
        this.i = class0.isInstance(gdwp0);
    }

    @Override  // iakn
    public final void a(iakm iakm0, Executor executor0, iakl iakl0) {
        iaul iaul0 = iakm0.c;
        iapd iapd0 = (iapd)MoreObjects.firstNonNull(((iapd)iaul0.a.r().a(iaya.a)), iapd.a);
        if(this.h && iapd0 != iapd.c) {
            iakl0.b(iapk.j.f("Credentials require channel with PRIVACY_AND_INTEGRITY security level. Observed security level: " + iapd0.toString()));
            return;
        }
        String s = (String)MoreObjects.firstNonNull(null, iaul0.b);
        try {
            iaqh.c(s, iakm0.a);
        }
        catch(iapl iapl0) {
            iakl0.b(iapl0.a);
            return;
        }
        iaqe iaqe0 = new iaqe(this, iakl0);
        this.b.a(executor0, iaqe0);
    }

    @Override  // iamm
    public final boolean b() {
        return this.i;
    }

    private static void c(String s, gRPCMethodDescriptor iaoj0) {
        URI uRI0;
        try {
            uRI0 = new URI("https", s, "/" + iaoj0.serviceName_, null, null);
        }
        catch(URISyntaxException uRISyntaxException0) {
            throw new iapl(iapk.j.f("Unable to construct service URI for auth").e(uRISyntaxException0));
        }
        if(uRI0.getPort() == 443) {
            iaqh.d(uRI0);
        }
    }

    private static void d(URI uRI0) {
        try {
            new URI(uRI0.getScheme(), uRI0.getUserInfo(), uRI0.getHost(), -1, uRI0.getPath(), uRI0.getQuery(), uRI0.getFragment());
        }
        catch(URISyntaxException uRISyntaxException0) {
            throw new iapl(iapk.j.f("Unable to construct service URI after removing port").e(uRISyntaxException0));
        }
    }
}

