import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.wearable.Asset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

public final class fcez {
    public final HashMap a;

    public fcez() {
        this.a = new HashMap();
    }

    public final long A(String s) {
        Object object0 = this.a.get(s);
        if(object0 == null) {
            return 0L;
        }
        try {
            return (long)(((Long)object0));
        }
        catch(ClassCastException classCastException0) {
            fcez.B(s, object0, "long", classCastException0);
            return 0L;
        }
    }

    public static final void B(String s, Object object0, String s1, ClassCastException classCastException0) {
        fcez.C(s, object0, s1, "<null>", classCastException0);
    }

    private static final void C(String s, Object object0, String s1, Object object1, ClassCastException classCastException0) {
        Log.w("DataMap", "Key " + s + " expected " + s1 + " but value was a " + object0.getClass().getName() + ".  The default value " + object1 + " was returned.");
        Log.w("DataMap", "Attempt to cast generated internal exception:", classCastException0);
    }

    public final int a() {
        return this.a.size();
    }

    public static fcez b(byte[] arr_b) {
        try {
            ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)ffnj.a), arr_b, 0, arr_b.length, hftc.a);
            ProtoLiteMessage.P_makeImmutable(hftv0);
            return ffmh.a(new ffmg(((ffnj)hftv0), new ArrayList()));
        }
        catch(hfur hfur0) {
            throw new IllegalArgumentException("Unable to convert data", hfur0);
        }
    }

    public final Object c(String s) {
        return this.a.get(s);
    }

    public final String d(String s) {
        Object object0 = this.a.get(s);
        if(object0 == null) {
            return null;
        }
        try {
            return (String)object0;
        }
        catch(ClassCastException classCastException0) {
            fcez.B(s, object0, "String", classCastException0);
            return null;
        }
    }

    public final String e(String s, String s1) {
        String s2 = this.d(s);
        return s2 == null ? s1 : s2;
    }

    @Override
    public final boolean equals(Object object0) {
        boolean z;
        if(!(object0 instanceof fcez)) {
            return false;
        }
        if(this.a() != ((fcez)object0).a()) {
            return false;
        }
        for(Object object1: this.h()) {
            Object object2 = this.c(((String)object1));
            Object object3 = ((fcez)object0).c(((String)object1));
            if((object2 instanceof Asset)) {
                if(!(object3 instanceof Asset)) {
                    return false;
                }
                if(((Asset)object2) != null && ((Asset)object3) != null) {
                    String s = ((Asset)object2).b;
                    if(TextUtils.isEmpty(s)) {
                        z = Arrays.equals(((Asset)object2).a, ((Asset)object3).a);
                    }
                    else {
                        batl.s(s);
                        z = s.equals(((Asset)object3).b);
                    }
                    if(z) {
                        continue;
                    }
                }
                else if(((Asset)object2) == ((Asset)object3)) {
                    continue;
                }
                return false;
            }
            else if((object2 instanceof String[])) {
                if(!(object3 instanceof String[])) {
                    return false;
                }
                if(Arrays.equals(((String[])object2), ((String[])object3))) {
                    continue;
                }
                return false;
            }
            else if((object2 instanceof long[])) {
                if(!(object3 instanceof long[])) {
                    return false;
                }
                if(Arrays.equals(((long[])object2), ((long[])object3))) {
                    continue;
                }
                return false;
            }
            else if((object2 instanceof float[])) {
                if(!(object3 instanceof float[])) {
                    return false;
                }
                if(Arrays.equals(((float[])object2), ((float[])object3))) {
                    continue;
                }
                return false;
            }
            else if((object2 instanceof byte[])) {
                if(!(object3 instanceof byte[])) {
                    return false;
                }
                if(Arrays.equals(((byte[])object2), ((byte[])object3))) {
                    continue;
                }
                return false;
            }
            else {
                if(!bata.b(object2, object3)) {
                    return false;
                }
                continue;
            }
            break;
        }
        return true;
    }

    public final ArrayList f(String s) {
        Object object0 = this.a.get(s);
        if(object0 == null) {
            return null;
        }
        try {
            return (ArrayList)object0;
        }
        catch(ClassCastException classCastException0) {
            fcez.B(s, object0, "ArrayList<DataMap>", classCastException0);
            return null;
        }
    }

    public final ArrayList g(String s) {
        Object object0 = this.a.get(s);
        if(object0 == null) {
            return null;
        }
        try {
            return (ArrayList)object0;
        }
        catch(ClassCastException classCastException0) {
            fcez.B(s, object0, "ArrayList<String>", classCastException0);
            return null;
        }
    }

    public final Set h() {
        return this.a.keySet();
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode() * 29;
    }

    public final void i(fcez fcez0) {
        for(Object object0: fcez0.h()) {
            Object object1 = fcez0.c(((String)object0));
            this.a.put(((String)object0), object1);
        }
    }

    public final void j(String s, boolean z) {
        this.a.put(s, Boolean.valueOf(z));
    }

    public final void k(String s, byte[] arr_b) {
        this.a.put(s, arr_b);
    }

    public final void l(String s, fcez fcez0) {
        this.a.put(s, fcez0);
    }

    public final void m(String s, ArrayList arrayList0) {
        this.a.put(s, arrayList0);
    }

    public final void n(String s, double f) {
        this.a.put(s, Double.valueOf(f));
    }

    public final void o(String s, float f) {
        this.a.put(s, Float.valueOf(f));
    }

    public final void p(String s, int v) {
        this.a.put(s, Integer.valueOf(v));
    }

    public final void q(String s, ArrayList arrayList0) {
        this.a.put(s, arrayList0);
    }

    public final void r(String s, long v) {
        this.a.put(s, Long.valueOf(v));
    }

    public final void s(String s, String s1) {
        this.a.put(s, s1);
    }

    public final void t(String s, ArrayList arrayList0) {
        this.a.put(s, arrayList0);
    }

    @Override
    public final String toString() {
        return this.a.toString();
    }

    public final boolean u(String s) {
        return this.a.containsKey(s);
    }

    public final boolean v(String s) {
        return this.w(s, false);
    }

    public final boolean w(String s, boolean z) {
        Object object0 = this.a.get(s);
        if(object0 == null) {
            return z;
        }
        try {
            return ((Boolean)object0).booleanValue();
        }
        catch(ClassCastException classCastException0) {
            fcez.C(s, object0, "Boolean", Boolean.valueOf(z), classCastException0);
            return z;
        }
    }

    public final byte[] x(String s) {
        Object object0 = this.a.get(s);
        if(object0 == null) {
            return null;
        }
        try {
            return (byte[])object0;
        }
        catch(ClassCastException classCastException0) {
            fcez.B(s, object0, "byte[]", classCastException0);
            return null;
        }
    }

    public final byte[] y() {
        return ffmh.b(this).a.toBytesArray();
    }

    public final int z(String s) {
        Object object0 = this.a.get(s);
        if(object0 == null) {
            return 0;
        }
        try {
            return (int)(((Integer)object0));
        }
        catch(ClassCastException classCastException0) {
            fcez.B(s, object0, "Integer", classCastException0);
            return 0;
        }
    }
}

