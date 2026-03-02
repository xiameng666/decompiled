import android.content.Context;
import com.google.android.gms.cast.LaunchOptions;
import j..util.Objects;

final class aubw extends audq {
    final aucd a;

    public aubw(aucd aucd0, Context context0, String s, String s1) {
        Objects.requireNonNull(aucd0);
        this.a = aucd0;
        super(context0, s, s1);
    }

    @Override  // audq
    public final void a() {
        aucd aucd0 = this.a;
        aucd.aa(aucd0);
        LaunchOptions launchOptions0 = aucd0.D;
        if(launchOptions0 != null) {
            String s = aucd0.C;
            if(s != null) {
                aucd0.O(s, launchOptions0);
            }
        }
    }

    @Override  // audq
    public final void b() {
        this.a.M(0x809, this.a.C, null);
    }

    @Override  // audq
    protected final void c() {
        this.a.M(0x808, this.a.C, null);
    }
}

