import androidx.compose.runtime.snapshots.SnapshotStateList;
import java.util.Collection;

final class cfh extends ibur implements ibth {
    final cfj a;

    public cfh(cfj cfj0) {
        this.a = cfj0;
        super(0);
    }

    @Override  // ibth
    public final Object a() {
        SnapshotStateList snapshotStateList0 = this.a.d;
        if(!(snapshotStateList0 instanceof Collection) || !snapshotStateList0.isEmpty()) {
            hcz hcz0 = new hcz(snapshotStateList0, 0);
            while(hcz0.hasNext()) {
                Object object0 = hcz0.next();
                cfk cfk0 = (cfk)object0;
                if(cfk0.l() && cfk0.m()) {
                    break;
                }
            }
        }
        return ibom.a;
    }
}

