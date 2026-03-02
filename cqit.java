import android.content.Context;

public final class cqit {
    protected final String a;

    public cqit(yzx yzx0) {
        this.a = yzx0.b;
    }

    public final String a(Context context0) {
        return cqix.a(context0).getString(this.a, "");
    }

    public final void b(Context context0, String s) {
        cqix.a(context0).edit().putString(this.a, s).commit();
    }

    public static cqit c(yzy yzy0, String s) {
        return new cqit(new yzu(yzy0, yzy0, s, ""));
    }
}

