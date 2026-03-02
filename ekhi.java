import android.content.Context;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;
import java.util.HashSet;
import java.util.Set;

public final class ekhi extends cjtm {
    private static final Set a;
    private final ekfh b;
    private final String c;
    private final String d;
    private final String e;
    private final String[] f;

    static {
        bboh.b("CBR_RestoreGmsOp", bbcu.bN);
        ekhi.a = new HashSet();
    }

    public ekhi(ekfh ekfh0, String s, String s1, String s2, String[] arr_s, azug azug0) {
        super(0x87, "RestoreContacts", azug0);
        this.b = ekfh0;
        this.c = s;
        this.d = s1;
        this.e = s2;
        this.f = arr_s;
    }

    @Override  // cjtm
    public final void f(Context context0) {
        int v;
        boolean z1;
        String s;
        ekgz ekgz0 = ekgz.a(context0);
        Set set0 = ekhi.a;
        synchronized(set0) {
            s = this.e;
            if(set0.contains(s)) {
                ekhh.e(6, ekgz0);
                this.b.g(Status.f, ApiMetadata.b);
                return;
            }
            goto label_9;
        }
        return;
    label_9:
        set0.add(s);
        ekhb ekhb0 = ekgz0.b() ? ekhc.b().a(context0) : null;
        String s1 = this.d;
        String s2 = this.e;
        gfsx gfsx0 = ekgy.a.a(s1, s2, this.f);
        boolean z = false;
        if(gfsx0.i()) {
            z1 = ekhh.b(ekhb0, context0, ((gsug)gfsx0.d()), this.c, s1, s2);
        }
        else {
            ekhh.e(7, ekgz0);
            z1 = false;
        }
        if(ekhb0 != null) {
            if(z1) {
                ekhb0.a();
            }
            else {
                ekhb0.d();
            }
        }
        ekfh ekfh0 = this.b;
        if(z1) {
            v = 3;
            z = true;
        }
        else {
            v = 4;
        }
        ekhh.e(v, ekgz0);
        ekfh0.g((z ? Status.b : Status.d), ApiMetadata.b);
        synchronized(set0) {
            set0.remove(s2);
        }
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.b.g(status0, ApiMetadata.b);
    }
}

