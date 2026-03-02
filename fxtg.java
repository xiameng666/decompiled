import android.content.Intent;
import android.os.Message;
import com.google.android.gms.location.WifiScan;
import j..util.Objects;

public abstract class fxtg extends bblf {
    final fxtk a;
    private final bbpj b;
    private final String f;
    private final bblg g;
    private final esaa h;

    protected fxtg(fxtk fxtk0, bblg bblg0, String s) {
        bbpj bbpj0 = bbpj.a(fxtk0.a);
        Objects.requireNonNull(fxtk0);
        this.a = fxtk0;
        super(bblg0);
        this.h = new esaa(fxtk0.a, 1, s + "WL", null, "com.google.android.gms");
        this.b = bbpj0;
        this.g = bblg0;
        this.f = s;
    }

    protected abstract void b(Intent arg1);

    final void c(Message message0) {
        switch(message0.what) {
            case 1: {
                fxtk fxtk0 = this.a;
                String s = fxtk0.f.a().b();
                if(s != null) {
                    esaa esaa0 = this.h;
                    if(esaa0.l()) {
                        esaa0.k(bbrd.b(fxtk0.a, s));
                    }
                }
                this.b(((Intent)message0.obj));
                return;
            }
            case 5: {
                if(hzek.p()) {
                    this.a.h();
                    return;
                }
                this.d(((WifiScan)message0.obj));
                return;
            }
            default: {
                fxqw.m(30, "DispatchingService received unrecognized message: " + message0);
            }
        }
    }

    protected abstract void d(WifiScan arg1);

    public void e() {
        fxqw.c("GCoreUlr", "Stopping handler for " + this.f);
        this.g.quit();
    }

    @Override  // android.os.Handler
    public final void handleMessage(Message message0) {
        if(!this.b.e()) {
            return;
        }
        if(this.f.equals("UlrDispSvcSlow") && hzek.a.i().ap() || this.f.equals("UlrDispSvcFast")) {
            try {
                esaa esaa0 = this.h;
                esaa0.c(hzek.a.i().Q());
                if(esaa0.l()) {
                    esaa0.k(null);
                }
                this.c(message0);
            }
            catch(Throwable throwable0) {
                esaa esaa1 = this.h;
                if(esaa1.l()) {
                    esaa1.g();
                }
                throw throwable0;
            }
            esaa esaa2 = this.h;
            if(esaa2.l()) {
                esaa2.g();
            }
        }
        else {
            this.c(message0);
        }
        fxtk fxtk0 = this.a;
        if(!fxtk0.b.d().e() && message0.what == 1) {
            fxtk0.o.stopSelf(message0.arg1);
        }
    }
}

