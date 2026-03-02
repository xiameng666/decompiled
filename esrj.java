import android.text.TextUtils;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

final class esrj implements hmhu {
    final essg a;

    public esrj(essg essg0) {
        this.a = essg0;
        super();
    }

    @Override  // hmhu
    public final byte[] a() {
        return hmgw.k(this.a.c / 10000L);
    }

    @Override  // hmhu
    public final byte[] b() {
        return hmgw.j(this.a.e);
    }

    @Override  // hmhu
    public final byte[] c() {
        return hmgw.j(this.a.b);
    }

    @Override  // hmhu
    public final byte[] d() {
        String s = this.a.f;
        return s == null ? new byte[0] : s.getBytes(StandardCharsets.UTF_8);
    }

    @Override  // hmhu
    public final byte[] e() {
        return new hmgz((TextUtils.isEmpty(this.a.d) ? new SimpleDateFormat("yyMMdd", Locale.getDefault()).format(new Date()) : this.a.d)).a;
    }

    @Override  // hmhu
    public final byte[] f() {
        return new hmgz(Long.toHexString(Math.abs(this.a.a % 0xFFFFFFFFL))).a;
    }

    @Override  // hmhu
    public final int g() {
        return this.a.g ? 4 : 2;
    }
}

