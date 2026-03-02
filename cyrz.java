import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

final class cyrz {
    public final List a;
    public final bbng b;

    public cyrz(bbng bbng0) {
        this.a = new ArrayList();
        this.b = bbng0;
    }

    public final long a() {
        List list0 = this.a;
        long v = 0L;
        if(list0.isEmpty()) {
            return 0L;
        }
        long v1 = this.b.b() - TimeUnit.SECONDS.toMillis(hvpg.a.aY().ds());
        ArrayList arrayList0 = new ArrayList(list0);
        int v2 = arrayList0.size();
        while(true) {
            --v2;
            if(v2 < 0) {
                break;
            }
            cysa cysa0 = (cysa)arrayList0.get(v2);
            if(cysa0.b < v1) {
                break;
            }
            v += cysa0.c;
        }
        return v;
    }

    public final void b(int v, cxzo cxzo0) {
        List list0 = this.a;
        if(list0.isEmpty()) {
            return;
        }
        ((cysa)gggq.p(list0)).a(v, cxzo0);
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("ScanTimeForRateLimit: ");
        stringBuilder0.append(TimeUnit.MILLISECONDS.toSeconds(this.a()));
        stringBuilder0.append(" seconds\nScanHistory\n  ");
        ArrayList arrayList0 = new ArrayList(this.a);
        int v = arrayList0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            stringBuilder0.append(((cysa)arrayList0.get(v1)));
            stringBuilder0.append("\n  ");
        }
        return stringBuilder0.toString();
    }
}

