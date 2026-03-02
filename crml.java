import android.util.SparseArray;
import com.google.android.gms.measurement.internal.TriggerUriParcel;
import java.util.List;

public final class crml implements Runnable {
    public final crni a;
    public final List b;

    public crml(crni crni0, List list0) {
        this.a = crni0;
        this.b = list0;
    }

    @Override
    public final void run() {
        crni crni0 = this.a;
        crni0.n();
        SparseArray sparseArray0 = crni0.ap().c();
        for(Object object0: this.b) {
            TriggerUriParcel triggerUriParcel0 = (TriggerUriParcel)object0;
            if(!sparseArray0.contains(triggerUriParcel0.c) || ((long)(((Long)sparseArray0.get(triggerUriParcel0.c)))) < triggerUriParcel0.b) {
                crni0.q().add(triggerUriParcel0);
            }
        }
        crni0.y();
    }
}

