import com.google.android.gms.tapandpay.firstparty.PassInfo;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public final class dvom {
    public final easy a;
    private final dvin b;
    private final clht c;
    private final Set d;
    private final etgl e;

    public dvom(etgl etgl0, dvin dvin0, easy easy0, clht clht0) {
        this.d = new HashSet();
        this.e = etgl0;
        this.b = dvin0;
        this.a = easy0;
        this.c = clht0;
    }

    public final void a(Collection collection0) {
        synchronized(this) {
            this.d.addAll(collection0);
        }
    }

    public final void b() {
        synchronized(this) {
            Set set0 = this.d;
            PassInfo[] arr_passInfo = new PassInfo[set0.size()];
            String[] arr_s = new String[set0.size()];
            int v1 = 0;
            for(Object object0: set0) {
                arr_passInfo[v1] = ((dvoj)object0).c;
                arr_s[v1] = ((dvoj)object0).a;
                ++v1;
            }
            if(this.b.a().i()) {
                this.d(arr_passInfo, true);
            }
            else {
                this.d(arr_passInfo, false);
            }
            set0.clear();
            dvol dvol0 = new dvol(this, arr_s);
            this.c.postDelayed(dvol0, 1000L);
        }
    }

    public final boolean c() {
        synchronized(this) {
        }
        return !this.d.isEmpty();
    }

    private final void d(PassInfo[] arr_passInfo, boolean z) {
        esnd esnd0 = new esnd();
        esnd0.a(8);
        esnd0.g(arr_passInfo);
        esnd0.b(z);
        this.e.cP(esnd0.a);
    }
}

