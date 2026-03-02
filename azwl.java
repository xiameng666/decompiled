import com.google.android.gms.common.ConnectionResult;
import j..util.Objects;
import java.util.ArrayList;
import java.util.Map;

final class azwl extends azwq {
    final azwr a;
    private final Map c;

    public azwl(azwr azwr0, Map map0) {
        Objects.requireNonNull(azwr0);
        this.a = azwr0;
        super(azwr0);
        this.c = map0;
    }

    @Override  // azwq
    public final void a() {
        azwr azwr0 = this.a;
        barv barv0 = new barv(azwr0.d);
        ArrayList arrayList0 = new ArrayList();
        ArrayList arrayList1 = new ArrayList();
        Map map0 = this.c;
        for(Object object0: map0.keySet()) {
            azsz azsz0 = (azsz)object0;
            if(azsz0.C() && !((azwi)map0.get(azsz0)).a) {
                arrayList0.add(azsz0);
            }
            else {
                arrayList1.add(azsz0);
            }
        }
        int v = 0;
        int v1 = -1;
        if(arrayList0.isEmpty()) {
            int v2 = arrayList1.size();
            while(v < v2) {
                azsz azsz1 = (azsz)arrayList1.get(v);
                v1 = barv0.a(azwr0.c, azsz1);
                ++v;
                if(v1 == 0) {
                    break;
                }
            }
        }
        else {
            int v3 = arrayList0.size();
            while(v < v3) {
                azsz azsz2 = (azsz)arrayList0.get(v);
                v1 = barv0.a(azwr0.c, azsz2);
                ++v;
                if(v1 != 0) {
                    break;
                }
            }
        }
        if(v1 != 0) {
            azwj azwj0 = new azwj(this, azwr0, new ConnectionResult(v1, null));
            azwr0.a.g(azwj0);
            return;
        }
        if(azwr0.e) {
            epui epui0 = azwr0.k;
            if(epui0 != null) {
                epui0.s();
            }
        }
        for(Object object1: map0.keySet()) {
            azsz azsz3 = (azsz)object1;
            baqj baqj0 = (baqj)map0.get(azsz3);
            if(azsz3.C() && barv0.a(azwr0.c, azsz3) != 0) {
                azwk azwk0 = new azwk(this, azwr0, baqj0);
                azwr0.a.g(azwk0);
            }
            else {
                azsz3.x(baqj0);
            }
        }
    }
}

