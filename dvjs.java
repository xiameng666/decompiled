import android.content.Context;

public final class dvjs {
    public static final bboh a;
    public static final String b;
    public static final String c;
    public final Context d;
    public final String e;
    public final String f;
    private final earo g;

    static {
        dvjs.a = bboh.b("Pay", bbcu.cZ);
        dvjs.b = String.format("%s=? AND %s=? AND %s=?", "account_id", "environment", "owner_id");
        dvjs.c = String.format("%s=? AND %s=? AND %s IN (%%s)", "account_id", "environment", "owner_id");
    }

    public dvjs(Context context0, String s, String s1, earo earo0) {
        this.d = context0;
        this.e = s;
        this.f = s1;
        this.g = earo0;
    }

    public final String a(byte[] arr_b) {
        return arr_b == null || arr_b.length == 0 ? null : new String(new earl(this.g.b(true)).a(arr_b));
    }

    public final byte[] b(String s) {
        return new earl(this.g.b(true)).b(s.getBytes());
    }
}

