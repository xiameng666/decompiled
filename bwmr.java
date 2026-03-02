import android.accounts.Account;
import android.content.Intent;
import j..util.Objects;
import java.util.Set;

public final class bwmr extends bwzp {
    final bxgn a;
    final bwmx b;

    public bwmr(bwmx bwmx0, gltq gltq0, String s, bxgn bxgn0) {
        this.a = bxgn0;
        Objects.requireNonNull(bwmx0);
        this.b = bwmx0;
        super(gltq0, s);
    }

    @Override  // bwzp
    public final void w() {
        bxgn bxgn0 = this.a;
        String s = bxgn0.a();
        if(s != null) {
            Intent intent0 = bxgn0.a;
            if("android.intent.action.PACKAGE_REMOVED".equals(intent0.getAction()) && (!intent0.getBooleanExtra("android.intent.extra.REPLACING", false) || intent0.getBooleanExtra("android.intent.extra.DATA_REMOVED", false)) || "android.intent.action.PACKAGE_CHANGED".equals(intent0.getAction()) && !bxgn0.b()) {
                this.b.y(s);
            }
            else if("android.intent.action.PACKAGE_DATA_CLEARED".equals(intent0.getAction())) {
                this.b.x(s);
            }
            if(bxgn0.d()) {
                this.b.c.c(2);
                this.b.m();
                bwne.b("handlePackageUpdating %s", s);
                batl.s(this.b.l);
                this.b.l.n(s);
            }
            if(bxgn0.c()) {
                this.b.c.c(2);
                this.b.m();
                bwne.b("handlePackageAdded %s", s);
                bwuc bwuc0 = this.b.l;
                batl.s(bwuc0);
                batl.s(this.b.f);
                Set set0 = this.b.f.r();
                if(!bwuv.f(s, bwuc0, ((Account[])set0.toArray(new Account[set0.size()])), this.b.y)) {
                    bwne.g("Package %s not found", s);
                }
                if("com.google.android.googlequicksearchbox".equals(s) || "com.google.android.gms".equals(s)) {
                    bwuc0.p();
                }
                if("com.google.android.gm".equals(s)) {
                    bwuc0.o();
                }
            }
        }
    }
}

