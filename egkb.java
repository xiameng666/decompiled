import android.content.Context;
import com.google.android.gms.common.api.ApiMetadata;

public final class egkb extends efze implements cjug {
    public static final bboh a;
    public final String b;
    private final Context c;
    private final cjts d;
    private final String e;

    static {
        egkb.a = bboh.e(bbcu.f);
    }

    public egkb(Context context0, cjts cjts0, String s, String s1) {
        this.b = s;
        this.e = s1;
        this.c = context0;
        this.d = cjts0;
    }

    @Override  // efzf
    public final void a(efzc efzc0, ApiMetadata apiMetadata0) {
        if(!hxba.n()) {
            return;
        }
        azuf azuf0 = azug.b(apiMetadata0);
        azuf0.e(bbdp.dW);
        azuf0.g(bbdq.ac);
        azuf0.d(this.b);
        azuf0.c(this.e);
        azuf0.h(true);
        azug azug0 = azuf0.a();
        egob egob0 = new egob(this, this.b, efzc0, azug0);
        this.d.b(egob0);
    }

    @Override  // efzf
    public final void b(efzc efzc0, ApiMetadata apiMetadata0) {
        azuf azuf0 = azug.b(apiMetadata0);
        azuf0.e(bbdp.dW);
        azuf0.g(bbdq.ac);
        azuf0.d(this.b);
        azuf0.c(this.e);
        azuf0.h(true);
        azug azug0 = azuf0.a();
        eglk eglk0 = new eglk(efzc0, this.c, this.b, azug0);
        this.d.b(eglk0);
    }

    @Override  // efzf
    public final void c(efzc efzc0, ApiMetadata apiMetadata0) {
        if(!hxba.l()) {
            return;
        }
        azuf azuf0 = azug.b(apiMetadata0);
        azuf0.e(bbdp.dW);
        azuf0.g(bbdq.ac);
        azuf0.d(this.b);
        azuf0.c(this.e);
        azuf0.h(true);
        egka egka0 = new egka(this, azuf0.a(), efzc0);
        this.d.b(egka0);
    }

    @Override  // efzf
    public final void d(efzc efzc0, ApiMetadata apiMetadata0) {
        if(!hxba.n()) {
            return;
        }
        azuf azuf0 = azug.b(apiMetadata0);
        azuf0.e(bbdp.dW);
        azuf0.g(bbdq.ac);
        azuf0.d(this.b);
        azuf0.c(this.e);
        azuf0.h(true);
        azug azug0 = azuf0.a();
        egoc egoc0 = new egoc(this, this.b, azug0);
        this.d.b(egoc0);
    }
}

