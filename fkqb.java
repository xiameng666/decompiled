import android.content.Context;

public final class fkqb {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public fkqb() {
        throw null;
    }

    public fkqb(String s, String s1, String s2, String s3) {
        if(s == null) {
            throw new NullPointerException("Null packageName");
        }
        this.a = s;
        this.b = s1;
        this.c = s2;
        this.d = s3;
    }

    public static fkqb a(Context context0, String s, String s1) {
        return new fkqb("com.google.android.gms", null, s, s1);
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if((object0 instanceof fkqb) && this.a.equals(((fkqb)object0).a)) {
            String s = this.b;
            if(s != null) {
                if(s.equals(((fkqb)object0).b)) {
                label_8:
                    String s1 = this.c;
                    if(s1 == null) {
                        if(((fkqb)object0).c == null) {
                            return this.d == null ? ((fkqb)object0).d == null : this.d.equals(((fkqb)object0).d);
                        }
                    }
                    else if(s1.equals(((fkqb)object0).c)) {
                        return this.d == null ? ((fkqb)object0).d == null : this.d.equals(((fkqb)object0).d);
                    }
                }
            }
            else if(((fkqb)object0).b == null) {
                goto label_8;
            }
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int v = this.a.hashCode() ^ 1000003;
        int v1 = 0;
        int v2 = this.b == null ? 0 : this.b.hashCode();
        int v3 = this.c == null ? 0 : this.c.hashCode();
        String s = this.d;
        if(s != null) {
            v1 = s.hashCode();
        }
        return ((v * 1000003 ^ v2) * 1000003 ^ v3) * 1000003 ^ v1;
    }

    @Override
    public final String toString() {
        return "ApplicationId{packageName=" + this.a + ", attributionTag=" + this.b + ", moduleName=" + this.c + ", instanceId=" + this.d + "}";
    }
}

