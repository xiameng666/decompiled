import android.util.Log;
import com.google.android.gms.auth.managed.ui.PhoneskyDpcInstallChimeraActivity;
import j..time.Duration;

public final class aknp implements lqj {
    public final PhoneskyDpcInstallChimeraActivity a;

    public aknp(PhoneskyDpcInstallChimeraActivity phoneskyDpcInstallChimeraActivity0) {
        this.a = phoneskyDpcInstallChimeraActivity0;
    }

    @Override  // lqj
    public final void jS(Object object0) {
        Log.i("Auth", "[AuthManaged, PhoneskyDpcInstallChimeraActivity] observed pauseState " + ((akoz)object0));
        PhoneskyDpcInstallChimeraActivity phoneskyDpcInstallChimeraActivity0 = this.a;
        switch(((akoz)object0).ordinal()) {
            case 1: 
            case 2: {
                Duration duration0 = aksl.a(phoneskyDpcInstallChimeraActivity0.h.f);
                akrd.a(phoneskyDpcInstallChimeraActivity0).c(new aksb(akru.a, (((akoz)object0) == akoz.b ? 18 : 19), null, duration0, phoneskyDpcInstallChimeraActivity0.j));
                phoneskyDpcInstallChimeraActivity0.q();
                return;
            }
            case 3: 
            case 4: {
                Duration duration1 = aksl.a(phoneskyDpcInstallChimeraActivity0.h.g);
                akrd.a(phoneskyDpcInstallChimeraActivity0).c(new aksb(akry.a, (((akoz)object0) == akoz.d ? 20 : 21), null, duration1, phoneskyDpcInstallChimeraActivity0.j));
            }
        }
    }
}

