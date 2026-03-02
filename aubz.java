import android.text.TextUtils;
import j..util.Objects;

final class aubz implements aurz {
    final aucd a;

    public aubz(aucd aucd0) {
        Objects.requireNonNull(aucd0);
        this.a = aucd0;
        super();
    }

    @Override  // aurz
    public final long a() {
        return aucd.h.incrementAndGet();
    }

    @Override  // aurz
    public final void b(String s, String s1, long v, String s2) {
        if(TextUtils.isEmpty(s2)) {
            s2 = this.a.z();
        }
        this.a.m(s, s1, v, s2);
    }

    @Override  // aurz
    public final void c(String s, byte[] arr_b, long v, String s1) {
        if(TextUtils.isEmpty(s1)) {
            s1 = this.a.z();
        }
        this.a.T(s, arr_b, v, s1);
    }

    @Override  // aurz
    public final void d(String s, String s1, long v, String s2) {
        if(TextUtils.isEmpty(s2)) {
            s2 = this.a.z();
        }
        this.a.U(s, s1, v, s2);
    }

    @Override  // aurz
    public final void e(String s, byte[] arr_b, String s1) {
        if(TextUtils.isEmpty(s1)) {
            s1 = this.a.z();
        }
        this.a.U(s, arr_b, 0L, s1);
    }
}

