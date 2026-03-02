import android.provider.MediaStore.Audio.Media;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

public final class caoh {
    public static final bboh a;
    public final gopj b;
    public final capf c;
    public final canm d;
    public final canh e;
    private final Set f;
    private final List g;
    private final Executor h;

    static {
        caoh.a = bboh.b("GmscoreIpa", bbcu.ee);
    }

    public caoh(gopj gopj0, Executor executor0, capf capf0, canh canh0) {
        this.f = new HashSet();
        this.g = new ArrayList();
        this.b = gopj0;
        this.h = executor0;
        this.c = capf0;
        this.e = canh0;
        canm canm0 = new canm(2);
        this.d = canm0;
        canm0.g();
        canh0.b(canm0);
    }

    public final gmcd a() {
        this.d();
        gmcd gmcd0 = gmbu.e(this.g);
        this.g.clear();
        return glzd.f(gmcd0, new caoe(this), this.h);
    }

    public final gmcd b(evql evql0, List list0, String[] arr_s, boolean z) {
        gmcd gmcd0 = new gmcu();
        caof caof0 = new caof(this, list0, ((gmcu)gmcd0));
        evql0.y(this.h, caof0);
        caog caog0 = new caog(this, z, arr_s, list0, ((gmcu)gmcd0));
        evql0.v(this.h, caog0);
        return gmcd0;
    }

    public final void c(canr canr0) {
        this.f.add(canr0);
        if(huhz.a.h().v() == ((long)this.f.size())) {
            this.d();
        }
    }

    private final void d() {
        ArrayList arrayList0 = new ArrayList();
        ArrayList arrayList1 = new ArrayList();
        Set set0 = this.f;
        for(Object object0: set0) {
            Integer.valueOf(2).getClass();
            arrayList0.add(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI + "/" + ((canr)object0).a);
            arrayList1.add(((canr)object0).a);
        }
        String[] arr_s = (String[])arrayList0.toArray(new String[0]);
        evql evql0 = this.b.e(arr_s);
        this.d.d(arrayList0.size());
        set0.clear();
        gmcd gmcd0 = this.b(evql0, arrayList1, arr_s, true);
        this.g.add(gmcd0);
    }
}

