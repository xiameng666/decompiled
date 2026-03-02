import android.content.Context;
import com.google.android.gms.personalsafety.service.PersonalSafetyChimeraService;

public final class eihb implements Runnable {
    public final PersonalSafetyChimeraService a;
    public final Context b;

    public eihb(PersonalSafetyChimeraService personalSafetyChimeraService0, Context context0) {
        this.a = personalSafetyChimeraService0;
        this.b = context0;
    }

    @Override
    public final void run() {
        PersonalSafetyChimeraService personalSafetyChimeraService0 = this.a;
        personalSafetyChimeraService0.b = bbnk.a;
        personalSafetyChimeraService0.c = personalSafetyChimeraService0.b.a();
        personalSafetyChimeraService0.d = eilw.a();
        eice.b(personalSafetyChimeraService0.c);
        if(hrtd.ao()) {
            if(eihl.a == null) {
                eihl.a = new eihl(this.b);
            }
            eihl.a.b = personalSafetyChimeraService0;
        }
        personalSafetyChimeraService0.a();
        personalSafetyChimeraService0.g(3);
    }
}

