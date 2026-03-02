import android.util.Log;
import com.google.android.gms.auth.managed.ui.PhoneskyDpcInstallChimeraActivity;
import j..time.Duration;
import java.util.Locale;
import java.util.Objects;

public final class aknn implements lqj {
    public final PhoneskyDpcInstallChimeraActivity a;

    public aknn(PhoneskyDpcInstallChimeraActivity phoneskyDpcInstallChimeraActivity0) {
        this.a = phoneskyDpcInstallChimeraActivity0;
    }

    @Override  // lqj
    public final void jS(Object object0) {
        PhoneskyDpcInstallChimeraActivity phoneskyDpcInstallChimeraActivity0 = this.a;
        if(((int)(((Integer)object0))) >= 0) {
            phoneskyDpcInstallChimeraActivity0.l.e(((Integer)object0).intValue());
            return;
        }
        Objects.toString(((Integer)object0));
        Log.i("Auth", "[AuthManaged, PhoneskyDpcInstallChimeraActivity] observed package download status=" + ((Integer)object0));
        switch(((int)(((Integer)object0)))) {
            case -6: 
            case -5: 
            case -4: {
                phoneskyDpcInstallChimeraActivity0.l.h();
                phoneskyDpcInstallChimeraActivity0.l.i();
                return;
            }
            case -3: {
                Duration duration1 = aksl.a(phoneskyDpcInstallChimeraActivity0.h.i);
                akrd.a(phoneskyDpcInstallChimeraActivity0).c(new aksb(akrs.a, 17, null, duration1, phoneskyDpcInstallChimeraActivity0.j));
                phoneskyDpcInstallChimeraActivity0.o(2, phoneskyDpcInstallChimeraActivity0.k());
                return;
            }
            case -7: 
            case -2: {
                Duration duration0 = aksl.a(phoneskyDpcInstallChimeraActivity0.h.i);
                akrd.a(phoneskyDpcInstallChimeraActivity0).c(new aksb(akrs.a, (((int)(((Integer)object0))) == -7 ? 15 : 16), null, duration0, phoneskyDpcInstallChimeraActivity0.j));
                phoneskyDpcInstallChimeraActivity0.o(3, phoneskyDpcInstallChimeraActivity0.k());
                return;
            }
            case -1: {
                if(!phoneskyDpcInstallChimeraActivity0.r()) {
                    phoneskyDpcInstallChimeraActivity0.n(-1);
                    return;
                }
                Duration duration2 = aksl.a(phoneskyDpcInstallChimeraActivity0.h.i);
                if(phoneskyDpcInstallChimeraActivity0.t(phoneskyDpcInstallChimeraActivity0.k)) {
                    akrd.a(phoneskyDpcInstallChimeraActivity0).c(new aksb(akrs.a, 14, null, duration2, phoneskyDpcInstallChimeraActivity0.j));
                    ccmg ccmg0 = phoneskyDpcInstallChimeraActivity0.m;
                    if(ccmg0 != null) {
                        ccmg0.a(bbdg.iD);
                    }
                    phoneskyDpcInstallChimeraActivity0.n(-1);
                    return;
                }
                Log.e("Auth", "[AuthManaged, PhoneskyDpcInstallChimeraActivity] Device policy management role holder installed but is not valid.");
                akrd.a(phoneskyDpcInstallChimeraActivity0).c(new aksb(akrs.a, 22, null, duration2, phoneskyDpcInstallChimeraActivity0.j));
                phoneskyDpcInstallChimeraActivity0.o(2, phoneskyDpcInstallChimeraActivity0.k());
                return;
            }
            default: {
                Log.e("Auth", String.format(Locale.US, a.i(((Integer)object0), "[AuthManaged, PhoneskyDpcInstallChimeraActivity] Unknown result ", " received from the packageDownloadStatus!")));
            }
        }
    }
}

