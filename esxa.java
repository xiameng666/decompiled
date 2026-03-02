import android.content.Context;
import android.os.Looper;
import com.google.android.gms.chimera.modules.tapandpay.AppContextProvider;

public final class esxa implements bbqm {
    public static final eswz a;
    public static volatile esxa b;
    private static final bboh c;
    private final clht d;
    private final Context e;
    private final bbqn f;
    private boolean g;

    static {
        esxa.a = new eswz();
        esxa.c = bboh.b("TapAndPay", bbcu.aM);
    }

    public esxa() {
        clht clht0 = new clht(Looper.getMainLooper());
        this.d = clht0;
        Context context0 = AppContextProvider.a();
        this.e = context0;
        this.f = new bbqn(context0, clht0);
    }

    @Override  // bbqm
    public final void a() {
        Context context0 = AppContextProvider.a();
        ibuq.c(context0);
        eswj eswj0 = new eswj(context0);
        if(eswj0.b() && eswj0.a() == eswi.b) {
            ibuq.c(context0);
            boolean z = eswo.d(context0, true);
            ((ggtj)esxa.c.h()).B("screen off, enabling observe mode successfully: %s", Boolean.valueOf(z));
            eswh.a.a().b();
        }
    }

    @Override  // bbqm
    public final void b() {
    }

    public final void c() {
        synchronized(this) {
            if(!this.g) {
                return;
            }
            this.f.c();
            this.g = false;
        }
    }

    public final void d() {
        synchronized(this) {
            if(this.g) {
                return;
            }
            this.f.b(this);
            this.g = true;
        }
    }
}

