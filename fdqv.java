import android.util.Log;
import j..util.Objects;

final class fdqv extends fdrc {
    final String a;
    final feye b;
    final feyi c;
    final fdri d;

    public fdqv(fdri fdri0, String s, feye feye0, feyi feyi0) {
        this.a = s;
        this.b = feye0;
        this.c = feyi0;
        Objects.requireNonNull(fdri0);
        this.d = fdri0;
        super(fdri0);
    }

    @Override  // fdrc
    public final void a() {
        if(Log.isLoggable("ChannelManager", 2)) {
            Log.v("ChannelManager", String.format("Running onChannelOpenRequest(%s, request)", this.a));
        }
        fdri fdri0 = this.d;
        feye feye0 = this.b;
        fdpl fdpl0 = fdpl.a(feye0.f, feye0.g);
        fdpl fdpl1 = fdri0.e.a(this.a, fdpl0);
        fdrq fdrq0 = new fdrq(this.a, fdpl1, feye0.d, false);
        fdrk fdrk0 = fdri0.d;
        fdro fdro0 = (fdro)fdrk0.a(fdrq0);
        if(fdro0 == null) {
            fdro0 = fdri0.a(this.c, fdrq0, feye0.j);
            fdrk0.e(fdrq0, fdro0);
        }
        this.g = fdro0;
        int v = fdro0.e;
        if(v != 0) {
            boolean z = true;
            switch(v) {
                case 1: {
                    Log.w("ChannelStateMachine", "Received onChannelOpenRequest while in CONNECTION_STATE_OPEN_SENT");
                    throw new fdrn();
                }
                case 2: {
                    if(fdro0.h == null) {
                        z = false;
                    }
                    batl.m(z, "connection established but no path");
                    if(fdro0.h.equals(feye0.h)) {
                        fdro0.i();
                        return;
                    }
                    Log.w("ChannelStateMachine", String.format("Two onChannelOpenRequest with same token but different paths: <%s>, <%s>", fdro0.h, feye0.h));
                    throw new fdrn();
                }
                default: {
                    if(v != 3) {
                        Log.w("ChannelStateMachine", "Received onChannelOpenRequest while in CONNECTION_STATE_CLOSED");
                        throw new fdrn();
                    }
                    Log.w("ChannelStateMachine", "Received onChannelOpenRequest while in CONNECTION_STATE_CLOSING");
                    throw new fdrn();
                }
            }
        }
        fdro0.h = feye0.h;
        fdro0.j(2);
        fdro0.i();
        ffep ffep0 = fdro0.s;
        fdrq fdrq1 = fdro0.a;
        String s = fdro0.h;
        boolean z1 = Log.isLoggable("WearableService", 2);
        fdpl fdpl2 = fdrq1.b;
        String s1 = fdrq1.a;
        if(z1) {
            Log.v("WearableService", String.format("onChannelOpened(%s, %s, %s, %s)", fdpl2, fdrq1, s, s1));
        }
        ffep0.a(fdpl2, fdrq1, s, s1, 0, 0, 1, ffeo.a);
    }
}

