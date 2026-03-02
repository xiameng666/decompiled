import android.content.Context;
import android.os.Process;
import android.os.UserHandle;
import android.os.UserManager;

public final class akra {
    private final Object a;
    private akqz b;

    public akra() {
        this.a = new Object();
    }

    public final akqz a(Context context0) {
        akqz akqz3;
        synchronized(this.a) {
            akqz akqz0 = this.b;
            if(akqz0 != null) {
                return akqz0;
            }
            UserManager userManager0 = (UserManager)context0.getSystemService("user");
            if(userManager0 == null) {
                akqz akqz1 = new akqz(null, true);
                this.b = akqz1;
                return akqz1;
            }
            for(Object object1: userManager0.getUserProfiles()) {
                UserHandle userHandle0 = (UserHandle)object1;
                if(userManager0.isManagedProfile(userHandle0.getIdentifier())) {
                    akqz akqz2 = new akqz(userHandle0, false);
                    this.b = akqz2;
                    return akqz2;
                }
            }
            akqz3 = new akqz(null, false);
            this.b = akqz3;
        }
        return akqz3;
    }

    public final icxk b(Context context0) {
        boolean z = Process.myUserHandle().isSystem();
        akqz akqz0 = this.a(context0);
        if(akqz0.b) {
            return icxk.f;
        }
        UserHandle userHandle0 = akqz0.a;
        if(userHandle0 == null) {
            return z ? icxk.b : icxk.e;
        }
        if(z) {
            return icxk.d;
        }
        return Process.myUserHandle().equals(userHandle0) ? icxk.c : icxk.e;
    }
}

