import android.content.Context;
import android.os.Trace;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.List;

public final class erij extends cjtm {
    private final erhw a;
    private final List b;
    private final erhr c;

    public erij(erhw erhw0, List list0, erhr erhr0, azug azug0) {
        super(275, "ContinueSession", azug0);
        this.a = erhw0;
        this.b = list0;
        this.c = erhr0;
    }

    @Override  // cjtm
    public final void f(Context context0) {
        List list0;
        Status status0 = Status.b;
        new ArrayList();
        Trace.beginSection("ContinueSessionOperation-execute");
        try {
            list0 = this.c.b(this.b);
        }
        catch(erhq erhq0) {
            list0 = null;
            status0 = new Status(erhq0.a);
        }
        Trace.endSection();
        this.a.a(status0, list0);
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.a.a(status0, null);
    }
}

