import android.content.Intent;
import android.util.Log;
import j..util.Objects;
import java.util.ArrayList;

final class ffgh implements fduo {
    final ffgm a;

    public ffgh(ffgm ffgm0) {
        Objects.requireNonNull(ffgm0);
        this.a = ffgm0;
        super();
    }

    @Override  // fduo
    public final void o(ArrayList arrayList0) {
        boolean z;
        if(Log.isLoggable("WearableService", 2)) {
            Log.v("WearableService", "onDataItemChanged: " + arrayList0.size());
        }
        if(bbqa.a()) {
            hzxo.c();
            z = hzxo.a.b().a();
        }
        else {
            z = false;
        }
        String s = z ? fdxu.l().a().a : "";
        int v1 = arrayList0.size();
        for(int v = 0; v < v1; ++v) {
            fduq fduq0 = (fduq)arrayList0.get(v);
            ffmn.e("WearableService", "dataEvent:%s:%s", new Object[]{(fduq0.c ? "deleted" : "changed"), fduq0.b.c.toString()});
            if(z && fduq0.e.equals(s)) {
                ffmn.e("WearableService", "Dropping a same node data item changed event for: %s", new Object[]{fduq0});
            }
            else {
                ffdx ffdx0 = new ffdx(new Intent("com.google.android.gms.wearable.DATA_CHANGED", fduq0.b.c).setPackage(fduq0.a.c), fduq0);
                this.a.j(fduq0.a, ffdx0);
            }
        }
    }
}

