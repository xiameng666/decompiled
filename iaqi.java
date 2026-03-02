import android.util.Log;
import j..util.Objects;
import java.io.IOException;
import java.util.concurrent.ExecutionException;

final class iaqi extends iaku {
    final iaku a;
    final iaqj b;

    public iaqi(iaqj iaqj0, iaku iaku0) {
        this.a = iaku0;
        Objects.requireNonNull(iaqj0);
        this.b = iaqj0;
        super();
    }

    @Override  // iaku
    public final void a(iapk iapk0, iaof_metadata iaof0) {
        iaqk iaqk0 = this.b.a;
        if(iaqk0.d && iapk.j.t == iapk0.t) {
            try {
                if(adgh.d("Oauth2ChannelInterceptor")) {
                    adfy adfy0 = new adfy(iaqk0.c.getApplicationContext());
                    try {
                        evrg.n(adfy0.b(iaqk0.b));
                    }
                    catch(ExecutionException executionException0) {
                        if((executionException0.getCause() instanceof acse)) {
                            throw (acse)executionException0.getCause();
                        }
                        Log.w("OAuth2ChannelInterceptor", "Unexpected exception while clearing token", executionException0);
                    }
                    catch(InterruptedException interruptedException0) {
                        Thread.currentThread().interrupt();
                        throw new IOException(interruptedException0);
                    }
                }
                else {
                    acso.j(this.b.a.c, this.b.a.b);
                }
            }
            catch(acse | IOException unused_ex) {
            }
        }
        this.a.a(iapk0, iaof0);
    }

    @Override  // iaku
    public final void b(iaof_metadata iaof0) {
        this.a.b(iaof0);
    }

    @Override  // iaku
    public final void c(Object object0) {
        this.a.c(object0);
    }

    @Override  // iaku
    public final void d() {
        this.a.d();
    }
}

