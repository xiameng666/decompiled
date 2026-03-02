import android.os.Bundle;
import com.google.android.gms.common.internal.GetServiceRequest;
import j..util.Objects;
import java.util.Map;

final class bwrl extends bwzp {
    final cjtn a;
    final String b;
    final int c;
    final int d;
    final GetServiceRequest e;
    final bwrm f;

    public bwrl(bwrm bwrm0, gltq gltq0, String s, cjtn cjtn0, String s1, int v, int v1, GetServiceRequest getServiceRequest0) {
        this.a = cjtn0;
        this.b = s1;
        this.c = v;
        this.d = v1;
        this.e = getServiceRequest0;
        Objects.requireNonNull(bwrm0);
        this.f = bwrm0;
        super(gltq0, 1, s);
    }

    @Override  // bwzp
    protected final Object a() {
        bwrt bwrt0;
        bwrm bwrm0 = this.f;
        bxav bxav0 = bwrm0.b;
        bwmx bwmx0 = bxav0.a();
        if(!bwmx0.F()) {
            try {
                bwne.s("IndexManager failed to initialize. AppIndex.API is unavailable.");
                Bundle bundle0 = new Bundle();
                this.a.b(16, null, bundle0);
                return null;
            label_8:
                bxax bxax0 = bwmx0.f;
                batl.s(bxax0);
                if(hubu.g() && bxax0.c.getBoolean("predefined-typeconfigs-update-in-progress", false)) {
                    bwmx0.r.p(6014);
                    bwne.s("Running maintenance to deploy predefined typeconfig schema changes again");
                    bwsc.c(bwmx0);
                }
                boolean z = true;
                boolean z1 = bwrm0.c && ("*".equals(bwrm0.d) || bbmt.e(bwrm0.d.split(","), this.b));
                int v = z1 ? 2 : 1;
                if(z1 || bwmx0.p != null) {
                    z = false;
                }
                String s = this.b;
                bwzn bwzn0 = bxav0.c;
                Map map0 = bwrm.a;
                synchronized(map0) {
                    bwrt0 = (bwrt)map0.get(s);
                    if(bwrt0 == null || bwrt0.g != v) {
                        bwrt0 = new bwrt(bwzn0, v, s, z);
                        map0.put(s, bwrt0);
                    }
                }
                goqq goqq0 = new goqq(this.f.b, this.b, this.c, bwrt0, this.d, z1);
                this.a.d(goqq0, null);
            }
            catch(Throwable throwable0) {
                bwne.j(throwable0, "Service broker callback failed", new Object[0]);
                bwmx0.r.d("postinit_failed");
            }
            return null;
        }
        goto label_8;
    }
}

