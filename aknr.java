import android.util.Log;
import com.google.android.gms.auth.managed.ui.PhoneskyDpcInstallChimeraActivity;

public final class aknr implements lqj {
    public final PhoneskyDpcInstallChimeraActivity a;

    public aknr(PhoneskyDpcInstallChimeraActivity phoneskyDpcInstallChimeraActivity0) {
        this.a = phoneskyDpcInstallChimeraActivity0;
    }

    @Override  // lqj
    public final void jS(Object object0) {
        if(((Boolean)object0).booleanValue()) {
            PhoneskyDpcInstallChimeraActivity phoneskyDpcInstallChimeraActivity0 = this.a;
            Log.w("Auth", "Global timeout reached, finishing activity");
            if(phoneskyDpcInstallChimeraActivity0.v()) {
                phoneskyDpcInstallChimeraActivity0.o.c(akhw.d);
            }
            else if(phoneskyDpcInstallChimeraActivity0.u()) {
                aksl.b(phoneskyDpcInstallChimeraActivity0.h.g);
                akrd.a(phoneskyDpcInstallChimeraActivity0).c(aksb.a(akrz.a, phoneskyDpcInstallChimeraActivity0.j));
                phoneskyDpcInstallChimeraActivity0.i.e();
            }
            phoneskyDpcInstallChimeraActivity0.o((hpwf.a.b().m() ? 7 : 6), phoneskyDpcInstallChimeraActivity0.k());
        }
    }
}

