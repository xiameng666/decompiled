import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import j..util.DesugarCollections;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

public final class azzh {
    public static final Status a;
    public final Set b;
    private final azzg c;

    static {
        azzh.a = new Status(8, "The connection to Google Play services was lost");
    }

    public azzh() {
        this.b = DesugarCollections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));
        this.c = new azzg(this);
    }

    final void a(BasePendingResult basePendingResult0) {
        this.b.add(basePendingResult0);
        basePendingResult0.q(this.c);
    }
}

