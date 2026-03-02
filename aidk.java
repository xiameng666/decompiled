import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.auth.api.proxy.AuthChimeraService;
import com.google.android.gms.common.api.Status;
import java.lang.ref.WeakReference;

public final class aidk extends cjtm {
    private final cjtn a;
    private final int b;
    private final Bundle c;
    private final baqr d;

    public aidk(cjtn cjtn0, int v, Bundle bundle0, baqr baqr0) {
        super(16, "ValidateAuthServiceOperation");
        this.a = cjtn0;
        this.b = v;
        this.c = bundle0;
        this.d = baqr0;
    }

    private final void b(int v, ahwx ahwx0) {
        cjtn cjtn0 = this.a;
        if(v == 0) {
            cjtn0.c(ahwx0);
            return;
        }
        cjtn0.a(v, new Bundle());
    }

    @Override  // cjtm
    public final void f(Context context0) {
        if(this.c.getString("consumerPkg") != null && !azql.c(context0).i(this.b)) {
            if(hrxa.e()) {
                throw new cjuh(10, null);
            }
            this.b(10, null);
            return;
        }
        baqr baqr0 = this.d;
        WeakReference weakReference0 = (WeakReference)AuthChimeraService.a.get(baqr0);
        ahwx ahwx0 = weakReference0 == null ? null : ((ahwx)weakReference0.get());
        if(ahwx0 == null) {
            if((context0 instanceof AuthChimeraService)) {
                ahwx0 = new ahwx(((AuthChimeraService)context0), ((AuthChimeraService)context0).l(), baqr0);
                AuthChimeraService.b(baqr0, ahwx0);
            }
            else {
                ahwx0 = null;
            }
        }
        if(ahwx0 == null) {
            if(hrxa.e()) {
                throw new cjuh(8, null);
            }
            this.b(8, null);
            return;
        }
        this.b(0, ahwx0);
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.b(status0.i, null);
    }
}

