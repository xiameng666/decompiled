import android.content.Context;
import com.google.android.gms.intrusiondetection.storage.database.IntrusionDetectionEventDatabase;
import java.util.List;

public final class caed {
    public final IntrusionDetectionEventDatabase a;

    static {
        cajd.a("caed");
    }

    public caed(Context context0) {
        this(context0, IntrusionDetectionEventDatabase.m.a(context0));
    }

    public caed(Context context0, IntrusionDetectionEventDatabase intrusionDetectionEventDatabase0) {
        ibuq.f(context0, "context");
        ibuq.f(intrusionDetectionEventDatabase0, "database");
        super();
        this.a = intrusionDetectionEventDatabase0;
    }

    public final String a() {
        caep caep0 = (caep)ibpo.T(((List)oqj.b(this.a.v().a, true, false, new caet())));
        return caep0 == null ? null : caep0.b;
    }
}

