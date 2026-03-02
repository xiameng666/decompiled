import android.accounts.Account;
import com.google.android.gms.auth.api.identity.ChromeOptions;

public final class blqe implements glzm {
    public final blqm a;
    public final gmcd b;
    public final gmcd c;
    public final ggeo d;

    public blqe(blqm blqm0, gmcd gmcd0, gmcd gmcd1, ggeo ggeo0) {
        this.a = blqm0;
        this.b = gmcd0;
        this.c = gmcd1;
        this.d = ggeo0;
    }

    @Override  // glzm
    public final gmcd a() {
        gged_interceptors gged0 = (gged_interceptors)gmbu.r(this.b);
        gfsx gfsx0 = (gfsx)gmbu.r(this.c);
        if(gged0.isEmpty()) {
            return gmbu.i(ggna.a);
        }
        ggdy ggdy0 = new ggdy();
        int v = gged0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            ggeo ggeo0 = this.d;
            String s = ((foec)gged0.get(v1)).a;
            if(ggeo0.containsKey(s)) {
                ggdy0.i(((Account)ggeo0.get(s)));
            }
        }
        blqm blqm0 = this.a;
        gged_interceptors gged1 = ggdy0.h();
        if(gfsx0.i()) {
            String s1 = ((ChromeOptions)gfsx0.d()).c;
            return fhra.b(blqm0.i.h(gged1, s1));
        }
        return fhra.b(blqm0.i.h(gged1, null));
    }
}

