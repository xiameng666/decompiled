import android.content.Context;
import com.google.android.gms.carrierauth.EAPAKARequest;
import com.google.android.gms.carrierauth.EapInfoRequest;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;

public final class atqy extends atqw implements cjug {
    private static final baun a;
    private final String b;
    private final String c;
    private final Context d;
    private final cjts e;
    private final atqq f;

    static {
        atqy.a = bcrh.a("carrier-auth-api-stub");
    }

    public atqy(Context context0, cjts cjts0, atqq atqq0, String s, String s1) {
        this.b = s;
        this.c = s1;
        this.d = context0;
        this.e = cjts0;
        this.f = atqq0;
    }

    @Override  // atqx
    public final void a(atqu atqu0, EapInfoRequest eapInfoRequest0, ApiMetadata apiMetadata0) {
        if(!this.c()) {
            atqu0.b(new Status(33002), null, ApiMetadata.b);
            return;
        }
        azuf azuf0 = azug.b(apiMetadata0);
        azuf0.f(azud.a);
        azuf0.e(bbdp.aK);
        azuf0.g(bbdq.G);
        azuf0.d(this.b);
        azuf0.c(this.c);
        azug azug0 = azuf0.a();
        atra atra0 = new atra(this.d, this.f, atqu0, eapInfoRequest0, azug0);
        this.e.b(atra0);
    }

    @Override  // atqx
    public final void b(atqu atqu0, EAPAKARequest eAPAKARequest0, ApiMetadata apiMetadata0) {
        if(!this.c()) {
            atqu0.a(new Status(33002), null, ApiMetadata.b);
            return;
        }
        azuf azuf0 = azug.b(apiMetadata0);
        azuf0.f(azud.a);
        azuf0.e(bbdp.aK);
        azuf0.g(bbdq.G);
        azuf0.d(this.b);
        azuf0.c(this.c);
        azug azug0 = azuf0.a();
        atqz atqz0 = new atqz(this.d, this.f, atqu0, eAPAKARequest0, azug0);
        this.e.b(atqz0);
    }

    private final boolean c() {
        Context context0 = this.d;
        if(!bbmq.Y(context0)) {
            azql azql0 = azql.c(context0.getApplicationContext());
            String s = this.b;
            if(!azql0.g(s)) {
                atqy.a.d("%s is not a 1P app.", new Object[]{s});
                return false;
            }
            for(Object object0: gfud.e(',').n(hrde.c())) {
                if(!((String)object0).equals(s)) {
                    continue;
                }
                return true;
            }
            atqy.a.d("%s is not allowed to call this API.", new Object[]{s});
            return false;
        }
        return true;
    }
}

