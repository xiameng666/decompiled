import android.os.Bundle;
import j..util.Objects;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

public final class crir {
    protected static final AtomicReference a;
    protected static final AtomicReference b;
    protected static final AtomicReference c;
    public final crmg d;

    static {
        crir.a = new AtomicReference();
        crir.b = new AtomicReference();
        crir.c = new AtomicReference();
    }

    public crir(crmg crmg0) {
        this.d = crmg0;
    }

    protected final String a(Object[] arr_object) {
        if(arr_object == null) {
            return "[]";
        }
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append("[");
        for(int v = 0; v < arr_object.length; ++v) {
            Object object0 = arr_object[v];
            String s = (object0 instanceof Bundle) ? this.b(((Bundle)object0)) : String.valueOf(object0);
            if(s != null) {
                if(stringBuilder0.length() != 1) {
                    stringBuilder0.append(", ");
                }
                stringBuilder0.append(s);
            }
        }
        stringBuilder0.append("]");
        return stringBuilder0.toString();
    }

    protected final String b(Bundle bundle0) {
        String s;
        if(bundle0 == null) {
            return null;
        }
        if(!this.d.a()) {
            return bundle0.toString();
        }
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append("Bundle[{");
        for(Object object0: bundle0.keySet()) {
            if(stringBuilder0.length() != 8) {
                stringBuilder0.append(", ");
            }
            stringBuilder0.append(this.d(((String)object0)));
            stringBuilder0.append("=");
            Object object1 = bundle0.get(((String)object0));
            if((object1 instanceof Bundle)) {
                s = this.a(new Object[]{object1});
            }
            else if((object1 instanceof Object[])) {
                s = this.a(((Object[])object1));
            }
            else {
                s = (object1 instanceof ArrayList) ? this.a(((ArrayList)object1).toArray()) : String.valueOf(object1);
            }
            stringBuilder0.append(s);
        }
        stringBuilder0.append("}]");
        return stringBuilder0.toString();
    }

    protected final String c(String s) {
        if(s == null) {
            return null;
        }
        return this.d.a() ? crir.f(s, crmc.c, crmc.a, crir.a) : s;
    }

    protected final String d(String s) {
        if(s == null) {
            return null;
        }
        return this.d.a() ? crir.f(s, crmd.b, crmd.a, crir.b) : s;
    }

    public final String e(String s) {
        if(s == null) {
            return null;
        }
        if(!this.d.a()) {
            return s;
        }
        return s.startsWith("_exp_") ? a.a(s, "experiment_id(", ")") : crir.f(s, crme.b, crme.a, crir.c);
    }

    private static final String f(String s, String[] arr_s, String[] arr_s1, AtomicReference atomicReference0) {
        String s1;
        batl.s(atomicReference0);
        batl.b(arr_s.length == arr_s1.length);
        for(int v = 0; v < arr_s.length; ++v) {
            if(Objects.equals(s, arr_s[v])) {
                synchronized(atomicReference0) {
                    String[] arr_s2 = (String[])atomicReference0.get();
                    if(arr_s2 == null) {
                        arr_s2 = new String[arr_s1.length];
                        atomicReference0.set(arr_s2);
                    }
                    s1 = arr_s2[v];
                    if(s1 == null) {
                        s1 = arr_s1[v] + "(" + arr_s[v] + ")";
                        arr_s2[v] = s1;
                    }
                }
                return s1;
            }
        }
        return s;
    }
}

