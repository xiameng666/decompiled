import android.text.TextUtils.TruncateAt;

public final class bedb {
    private String a;
    private gfsx b;
    private gfsx c;
    private gfsx d;
    private heqb e;

    public bedb() {
        throw null;
    }

    public bedb(byte[] arr_b) {
        this.b = gfqx.a;
        this.c = gfqx.a;
        this.d = gfqx.a;
    }

    public final bedc a() {
        String s = this.a;
        if(s != null) {
            heqb heqb0 = this.e;
            if(heqb0 != null) {
                return new bedc(s, this.b, this.c, this.d, heqb0);
            }
        }
        StringBuilder stringBuilder0 = new StringBuilder();
        if(this.a == null) {
            stringBuilder0.append(" signOnRealm");
        }
        if(this.e == null) {
            stringBuilder0.append(" passwordSpecificsData");
        }
        throw new IllegalStateException("Missing required properties:" + stringBuilder0.toString());
    }

    public final void b(String s) {
        this.b = gfsx.m(s);
    }

    public final void c(String s) {
        this.c = gfsx.m(s);
    }

    public final void d(heqb heqb0) {
        if(heqb0 == null) {
            throw new NullPointerException("Null passwordSpecificsData");
        }
        this.e = heqb0;
    }

    public final void e(String s) {
        if(s == null) {
            throw new NullPointerException("Null signOnRealm");
        }
        this.a = s;
    }

    public final void f(TextUtils.TruncateAt textUtils$TruncateAt0) {
        this.d = gfsx.m(textUtils$TruncateAt0);
    }
}

