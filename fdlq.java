import android.util.Pair;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.internal.GetRestoreStateResponse;
import j..util.Objects;

final class fdlq extends fdix {
    final evqp a;

    public fdlq(fdlt fdlt0, evqp evqp0) {
        this.a = evqp0;
        Objects.requireNonNull(fdlt0);
        super();
    }

    @Override  // fdix
    public final void K(GetRestoreStateResponse getRestoreStateResponse0) {
        azzf.b(new Status(getRestoreStateResponse0.a), new Pair(((int)getRestoreStateResponse0.b), getRestoreStateResponse0.c), this.a);
    }
}

