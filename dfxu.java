import com.google.android.gms.nearby.sharing.ShareTarget;
import com.google.android.gms.nearby.sharing.TransferMetadata;
import java.util.ArrayList;

public final class dfxu implements Runnable {
    public final dfzz a;
    public final int b;
    public final gmcu c;

    public dfxu(dfzz dfzz0, int v, gmcu gmcu0) {
        this.a = dfzz0;
        this.b = v;
        this.c = gmcu0;
    }

    @Override
    public final void run() {
        bxd bxd0 = new bxd();
        if(this.b == 1) {
            dfzz dfzz0 = this.a;
            ArrayList arrayList0 = new ArrayList();
            arrayList0.addAll(dfzz0.O);
            arrayList0.addAll(dfzz0.M);
            arrayList0.addAll(dfzz0.L);
            arrayList0.addAll(dfzz0.N);
            for(int v = 0; v < arrayList0.size(); ++v) {
                ShareTarget shareTarget0 = (ShareTarget)arrayList0.get(v);
                if(bxd0.containsKey(shareTarget0)) {
                    TransferMetadata transferMetadata0 = (TransferMetadata)bxd0.get(shareTarget0);
                    TransferMetadata transferMetadata1 = dfzz0.X(shareTarget0);
                    dcvz.a.e().j("GetShareTargets encountered duplicated %s, with existing status %s, next status %s", shareTarget0, transferMetadata0, transferMetadata1);
                    if(hvqs.be()) {
                        throw new IllegalArgumentException("Multiple entries with same key when executing GetShareTargets.");
                    }
                }
                dcnn dcnn0 = dfzz0.X(shareTarget0).a();
                dcnn0.f = v;
                bxd0.put(shareTarget0, dcnn0.a());
            }
        }
        this.c.q(bxd0);
    }
}

