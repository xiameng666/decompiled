import java.util.ArrayList;
import java.util.ServiceLoader;

public class ggvu extends gguv {
    private final ggvs a;
    private final ggvy b;
    private final ggvt c;
    private final gguu d;

    public ggvu() {
        ggvs ggvs0 = (ggvs)ggvu.p(ggvs.class, "flogger.backend_factory");
        if(ggvs0 == null) {
            ggvs0 = ggvv.a;
        }
        this.a = ggvs0;
        ggvy ggvy0 = (ggvy)ggvu.p(ggvy.class, "flogger.logging_context");
        if(ggvy0 == null) {
            ggvy0 = ggwa.a;
        }
        this.b = ggvy0;
        ggvt ggvt0 = (ggvt)ggvu.p(ggvt.class, "flogger.clock");
        if(ggvt0 == null) {
            ggvt0 = ggvx.a;
        }
        this.c = ggvt0;
        this.d = ggvw.a;
    }

    @Override  // gguv
    protected final long c() {
        return this.c.a();
    }

    @Override  // gguv
    protected final ggtx e(String s) {
        return this.a.a(s);
    }

    @Override  // gguv
    protected final gguu h() {
        return this.d;
    }

    @Override  // gguv
    protected final ggvy j() {
        return this.b;
    }

    @Override  // gguv
    protected final String m() {
        return "Platform: " + this.getClass().getName() + "\nBackendFactory: " + this.a.toString() + "\nClock: " + this.c.toString() + "\nContextDataProvider: " + this.b + "\nLogCallerFinder: Default stack-based caller finder\n";
    }

    private static Object p(Class class0, String s) {
        Object object0;
        String s4;
        String s1;
        try {
            s1 = System.getProperty(s, null);
        }
        catch(SecurityException securityException0) {
            ggwz.a("cannot read property name %s: %s", new Object[]{s, securityException0});
            s1 = null;
        }
        if(s1 == null) {
        label_29:
            object0 = null;
        }
        else {
            try {
                int v = s1.indexOf(35);
                String s2 = v == -1 ? s1 : s1.substring(0, v);
                String s3 = v == -1 ? "getInstance" : s1.substring(v + 1);
                s4 = a.V(s3, s2, "#", "()");
                Class class1 = Class.forName(s2);
                try {
                    object0 = class0.cast(class1.getMethod(s3, null).invoke(null, null));
                }
                catch(NoSuchMethodException noSuchMethodException0) {
                    if(v == -1) {
                        ggwz.a("method \'%s\' does not exist: %s\n", new Object[]{s1, noSuchMethodException0});
                        goto label_29;
                    }
                    else if(s3.equals("getInstance")) {
                        s4 = a.a(s2, "new ", "()");
                        object0 = class0.cast(class1.getConstructor(null).newInstance(null));
                    }
                    else {
                        ggwz.a("method \'%s\' does not exist: %s\n", new Object[]{s1, noSuchMethodException0});
                        goto label_29;
                    }
                }
                goto label_30;
            }
            catch(ClassNotFoundException unused_ex) {
                goto label_29;
            }
            catch(ClassCastException classCastException0) {
            }
            catch(Exception exception0) {
                ggwz.a("cannot call expected no-argument constructor or static method \'%s\': %s\n", new Object[]{s4, exception0});
                goto label_29;
            }
            ggwz.a("cannot cast result of calling \'%s\' to \'%s\': %s\n", new Object[]{s4, class0.getName(), classCastException0});
            goto label_29;
        }
    label_30:
        if(object0 != null) {
            return object0;
        }
        ArrayList arrayList0 = new ArrayList();
        for(Object object1: ServiceLoader.load(class0)) {
            arrayList0.add(object1);
        }
        switch(arrayList0.size()) {
            case 0: {
                return null;
            }
            case 1: {
                return arrayList0.get(0);
            }
            default: {
                System.err.printf("Multiple implementations of service %s found on the classpath: %s%nEnsure only the service implementation you want to use is included on the classpath or else specify the service class at startup with the \'%s\' system property. The default implementation will be used instead.%n", new Object[]{class0.getName(), arrayList0, s});
                return null;
            }
        }
    }
}

