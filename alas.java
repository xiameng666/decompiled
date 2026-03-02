import com.google.android.gms.auth.proximity.phonehub.PhoneHubChimeraService;

public final class alas implements Runnable {
    public final boolean a;

    public alas(boolean z) {
        this.a = z;
    }

    @Override
    public final void run() {
        if(albt.c()) {
            PhoneHubChimeraService phoneHubChimeraService0 = PhoneHubChimeraService.d;
            if(phoneHubChimeraService0 == null) {
                goto label_14;
            }
            if(this.a) {
                alrg alrg0 = phoneHubChimeraService0.h;
                if(alrg0.a) {
                    alrg0.a = false;
                    alrg0.a(phoneHubChimeraService0);
                }
            }
            else {
                alrg alrg1 = phoneHubChimeraService0.h;
                if(!alrg1.a) {
                    alrg1.a = true;
                    alrg1.a(phoneHubChimeraService0);
                    return;
                label_14:
                    PhoneHubChimeraService.a.m("There is no PhoneHubChimeraService instance, skip update to notification visibility.", new Object[0]);
                }
            }
        }
    }
}

