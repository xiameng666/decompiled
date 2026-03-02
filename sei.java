import android.content.Context;
import android.os.PersistableBundle;
import java.util.Set;

public final class sei implements scz {
    public static final seh a;
    private static final Set b;
    private final String c;
    private final ibns d;
    private boolean e;
    private String f;

    static {
        sei.a = new seh();
        sei.b = ibqg.b("com.google.android.gms");
    }

    public sei(Context context0, int v) {
        this((sei.b.contains("com.google.android.gms") ? context0.getString(v) : null), new ibns("com.google.android.gms", v));
    }

    public sei(String s) {
        ibuq.f(s, "string");
        this(s, null);
    }

    public sei(String s, ibns ibns0) {
        this.c = s;
        this.d = ibns0;
    }

    @Override  // scz
    public final PersistableBundle a() {
        PersistableBundle persistableBundle0 = new PersistableBundle();
        String s = this.c;
        if(s != null) {
            persistableBundle0.putString("value", s);
        }
        ibns ibns0 = this.d;
        if(ibns0 != null) {
            persistableBundle0.putString("packageName", ((String)ibns0.a));
            persistableBundle0.putInt("resourceId", ((Number)ibns0.b).intValue());
        }
        return persistableBundle0;
    }

    public final String b(Context context0) {
        if(!this.e) {
            String s = this.c;
            if(s == null) {
                ibuq.c(this.d);
                int v = ((Number)this.d.b).intValue();
                s = sei.c(context0, ((String)this.d.a), v);
            }
            this.f = s;
            this.e = true;
        }
        String s1 = this.c;
        if(s1 != null) {
            ibns ibns0 = this.d;
            if(ibns0 != null) {
                int v1 = ((Number)ibns0.b).intValue();
                String s2 = sei.c(context0, ((String)ibns0.a), v1);
                sct.c("StringResource", "Both value and reference are set by " + ibns0.a + ". rawValue=" + s1 + " resolvedValue=" + s2);
            }
        }
        return this.f;
    }

    private static final String c(Context context0, String s, int v) {
        String s1 = null;
        CharSequence charSequence0 = context0.getPackageManager().getText(s, v, null);
        if(charSequence0 != null) {
            s1 = charSequence0.toString();
        }
        if(s1 == null) {
            sct.e("StringResource", a.s(s, v, "Unable to load resourceId ", " from package "));
        }
        return s1;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof sei)) {
            return false;
        }
        return ibuq.m(this.c, ((sei)object0).c) ? ibuq.m(this.d, ((sei)object0).d) : false;
    }

    @Override
    public final int hashCode() {
        int v = 0;
        int v1 = this.c == null ? 0 : this.c.hashCode();
        ibns ibns0 = this.d;
        if(ibns0 != null) {
            v = ibns0.hashCode();
        }
        return v1 * 0x1F + v;
    }

    @Override
    public final String toString() {
        String s = this.c;
        if(s != null) {
            return a.a(s, "StringResource{value=", "}");
        }
        ibuq.c(this.d);
        return "StringResource{package=" + this.d.a + ", resourceId=" + this.d.b + "}";
    }
}

