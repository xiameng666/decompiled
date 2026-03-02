import android.app.PendingIntent;
import java.util.concurrent.atomic.AtomicBoolean;

public class berk extends lsb {
    public static final bboh a;
    public final lrf b;
    public final bfec c;
    public final AtomicBoolean d;
    public final lqi e;
    public final bxox f;
    public final bxox g;
    public final bxox h;
    public final bxox i;
    public final bxox j;
    public final bxox k;
    public final lqd l;
    public final lqd m;
    public final lqd n;
    public final lqd o;
    public final lqd p;
    public final lqd q;
    public final lqd r;
    private final beik s;
    private final bega t;
    private final beih u;
    private final begp v;
    private final beev w;
    private final beis x;

    static {
        berk.a = bboh.b("PasswordManagerStartupViewModel", bbcu.cX);
    }

    public berk(beik beik0, bega bega0, beih beih0, begp begp0, beev beev0, beis beis0, lrf lrf0, bfec bfec0, begh begh0, bdyo bdyo0) {
        ibuq.f(beik0, "pendingIntentResolutionRepository");
        ibuq.f(bega0, "errorResolutionRepository");
        ibuq.f(beih0, "passwordDataRepository");
        ibuq.f(begp0, "passkeyDataRepository");
        ibuq.f(beev0, "chromeSyncStateRepository");
        ibuq.f(beis0, "preferencesDataRepository");
        ibuq.f(lrf0, "savedStateHandle");
        ibuq.f(begh0, "localPasswordDataRepository");
        super();
        this.s = beik0;
        this.t = bega0;
        this.u = beih0;
        this.v = begp0;
        this.w = beev0;
        this.x = beis0;
        this.b = lrf0;
        this.c = bfec0;
        this.d = new AtomicBoolean(false);
        lqi lqi0 = new lqi();
        this.e = lqi0;
        bxox bxox0 = new bxox();
        this.f = bxox0;
        bxox bxox1 = new bxox();
        this.g = bxox1;
        bxox bxox2 = new bxox();
        this.h = bxox2;
        bxox bxox3 = new bxox();
        this.i = bxox3;
        bxox bxox4 = new bxox();
        this.j = bxox4;
        bxox bxox5 = new bxox();
        this.k = bxox5;
        this.l = lqi0;
        this.m = bxox0;
        this.n = bxox1;
        this.o = bxox2;
        this.p = bxox3;
        this.q = bxox4;
        this.r = bxox5;
        if(hsas.c()) {
            icbb.b(lsc.a(this), null, null, new beri(bdyo0, null), 3);
        }
    }

    // Detected as a lambda impl.
    public final void a(Throwable throwable0, bgmk bgmk0) {
        evql evql0;
        if((throwable0 instanceof azuh)) {
            PendingIntent pendingIntent0 = ((azuh)throwable0).c();
            evql0 = this.s.a(pendingIntent0);
        }
        else {
            bedj bedj0 = new bedj(null);
            bedj0.d(0x7F152767);  // string:pwm_password_manager "@com.google.android.gms:string/common_password_manager"
            bedj0.c(0x7F1508E3);  // string:common_something_went_wrong "Something went wrong"
            bedj0.b();
            bedk bedk0 = bedj0.a();
            evql0 = this.t.a(bedk0);
        }
        evql0.b(new berf(new bere(this, bgmk0)));
        evql0.a(new berg(this));
        evql0.A(new berh(this));
    }

    public final void b(bgmk bgmk0) {
        icbb.b(lsc.a(this), null, null, new berj(this, null), 3);
        this.e.l(Boolean.valueOf(true));
        evql[] arr_evql = new evql[4];
        evql evql0 = this.u.b.c();
        arr_evql[0] = this.u.e(evql0);
        arr_evql[1] = this.v.d();
        arr_evql[2] = this.w.a();
        evql evql1 = this.x.b.c();
        evql1.b(new bein(this.x));
        arr_evql[3] = evql1;
        evql evql2 = evrg.f(arr_evql);
        evql2.z(new beqz(this));
        evql2.b(new berb(new bera(this, bgmk0)));
        evql2.a(() -> {
            evql evql0;
            if((null instanceof azuh)) {
                PendingIntent pendingIntent0 = ((azuh)null).c();
                evql0 = this.s.a(pendingIntent0);
            }
            else {
                bedj bedj0 = new bedj(null);
                bedj0.d(0x7F152767);  // string:pwm_password_manager "@com.google.android.gms:string/common_password_manager"
                bedj0.c(0x7F1508E3);  // string:common_something_went_wrong "Something went wrong"
                bedj0.b();
                bedk bedk0 = bedj0.a();
                evql0 = this.t.a(bedk0);
            }
            evql0.b(new berf(new bere(this, bgmk0)));
            evql0.a(new berg(this));
            evql0.A(new berh(this));
        });
        evql2.A((/* MISSING LAMBDA PARAMETER */) -> {
            evql evql0;
            if((exception0.getCause() instanceof azuh)) {
                PendingIntent pendingIntent0 = ((azuh)exception0.getCause()).c();
                evql0 = this.s.a(pendingIntent0);
            }
            else {
                bedj bedj0 = new bedj(null);
                bedj0.d(0x7F152767);  // string:pwm_password_manager "@com.google.android.gms:string/common_password_manager"
                bedj0.c(0x7F1508E3);  // string:common_something_went_wrong "Something went wrong"
                bedj0.b();
                bedk bedk0 = bedj0.a();
                evql0 = this.t.a(bedk0);
            }
            evql0.b(new berf(new bere(this, bgmk0)));
            evql0.a(new berg(this));
            evql0.A(new berh(this));
        });
    }
}

