import android.content.Context;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.romanesco.protomodel.RestoreInfoEntity;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

public final class ekgu extends cjtm {
    private static final bboh a;
    private final ekfh b;
    private final String c;

    static {
        ekgu.a = bboh.b("CBR_FetchRestoreInfoOps", bbcu.bN);
    }

    public ekgu(ekfh ekfh0, String s, azug azug0) {
        super(0x87, "CBR_FetchRestoreInfoOps", azug0);
        this.b = ekfh0;
        this.c = s;
    }

    @Override  // cjtm
    protected final void f(Context context0) {
        ArrayList arrayList0 = new ArrayList();
        try {
            for(Object object0: ((List)((glyq)ekar.a(context0).c()).u())) {
                ejxr ejxr0 = (ejxr)object0;
                String s = ejxr0.c;
                if(s.matches("^[A-Fa-f0-9]+$")) {
                    arrayList0.add(new RestoreInfoEntity(s, ((long)ejxr0.d)));
                }
            }
        }
        catch(InterruptedException | ExecutionException unused_ex) {
        }
        ((ggtj)((ggtj)ekgu.a.h()).ar(0x351B)).P("Number of backups info returned for account %s: %d", this.c, arrayList0.size());
        ApiMetadata apiMetadata0 = cckf.d(bbdp.ez);
        this.b.c(Status.b, arrayList0, apiMetadata0);
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.b.c(status0, null, ApiMetadata.b);
    }
}

