import android.text.TextUtils;

public final class cylf implements Runnable {
    public final cylw a;

    public cylf(cylw cylw0) {
        this.a = cylw0;
    }

    @Override
    public final void run() {
        cylw cylw0 = this.a;
        cyqx cyqx0 = cylw0.b;
        Object object0 = cyqx0.e.a();
        if(object0 != null) {
            if(cylw0.D() && ((cyfd)object0).c("com.google.android.googlequicksearchbox")) {
                ((ggtj)cylw0.n.d().ar(7841)).x("NearbyDeviceManager: isSomeoneUsingAudio - GA holds the AudioFocus now!");
                cylw0.i.c("Unknown", "Unknown", cusm.q.name(), 0.0);
                return;
            }
            if(!TextUtils.isEmpty(((cyfd)object0).a())) {
                cylw0.i.c("Unknown", "Unknown", cusm.q.name(), 0.0);
                return;
            }
        }
        else if(cylw0.c.isMusicActive()) {
            cylw0.i.c("Unknown", "Unknown", cusm.q.name(), 0.0);
            return;
        }
        Object object1 = cylw0.f.a();
        if(object1 == null || ((cwqd)object1).r(cylw0.e, 2, false) && !((cwqd)object1).s()) {
            cylw0.i.c("Unknown", "Unknown", cusm.n.name(), 0.0);
            if(cylw0.k != null) {
                cylw0.z();
            }
        }
        else if(((cwqd)object1).t()) {
            cylw0.i.c("Unknown", "Unknown", cusm.m.name(), 0.0);
            if(cylw0.k != null) {
                cylw0.z();
            }
        }
        else {
            if(((cwqd)object1).s()) {
                cylw0.i.c("Unknown", "Unknown", cusm.o.name(), 0.0);
                return;
            }
            cyna cyna0 = cylw0.m(cyfb.g).a;
            long v = cyqx0.c.a() - (cyna0 == null ? 0L : cyna0.a());
            if(cyna0 != null && v <= hvpg.q()) {
                cylw0.w(cyna0, v, false);
                return;
            }
            cylw0.i.c("Unknown", "Unknown", cusm.p.name(), 0.0);
            if(cylw0.k != null) {
                cylw0.z();
            }
        }
    }
}

