import android.util.Log;
import com.google.android.gms.auth.managed.ui.PhoneskyDpcInstallChimeraActivity;
import j..time.Duration;
import java.util.Locale;

public final class aknm implements lqj {
    public final PhoneskyDpcInstallChimeraActivity a;

    public aknm(PhoneskyDpcInstallChimeraActivity phoneskyDpcInstallChimeraActivity0) {
        this.a = phoneskyDpcInstallChimeraActivity0;
    }

    @Override  // lqj
    public final void jS(Object object0) {
        int v;
        PhoneskyDpcInstallChimeraActivity phoneskyDpcInstallChimeraActivity0 = this.a;
        if(((int)(((Integer)object0))) >= 0) {
            phoneskyDpcInstallChimeraActivity0.l.e(((Integer)object0).intValue());
            return;
        }
        switch(((int)(((Integer)object0)))) {
            case -6: 
            case -5: 
            case -4: {
                phoneskyDpcInstallChimeraActivity0.l.h();
                phoneskyDpcInstallChimeraActivity0.l.i();
                return;
            }
            case -7: 
            case -3: 
            case -2: 
            case -1: {
                switch(((int)(((Integer)object0)))) {
                    case -7: {
                        v = 11;
                        break;
                    }
                    case -3: {
                        v = 13;
                        break;
                    }
                    case -2: {
                        v = 12;
                        break;
                    }
                    case -1: {
                        v = 10;
                        break;
                    }
                    default: {
                        v = 1;
                    }
                }
                Duration duration0 = aksl.a(phoneskyDpcInstallChimeraActivity0.h.h);
                akrd.a(phoneskyDpcInstallChimeraActivity0).c(new aksb(akrw.a, v, null, duration0, phoneskyDpcInstallChimeraActivity0.j));
                aksl.b(phoneskyDpcInstallChimeraActivity0.h.i);
                akrd.a(phoneskyDpcInstallChimeraActivity0).c(aksb.a(akrt.a, phoneskyDpcInstallChimeraActivity0.j));
                phoneskyDpcInstallChimeraActivity0.h.b(phoneskyDpcInstallChimeraActivity0.k);
                return;
            }
            default: {
                Log.e("Auth", String.format(Locale.US, a.i(((Integer)object0), "[AuthManaged, PhoneskyDpcInstallChimeraActivity] Unknown result ", " received from the phonsekyDownloadStatus!")));
            }
        }
    }
}

