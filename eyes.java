import android.content.Context;
import com.google.android.gms.chimera.modules.activeunlock.primary.AppContextProvider;
import j..time.Duration;

final class eyes extends ibsl implements ibtw {
    int a;
    final eyet b;
    final boolean c;
    final Duration d;

    public eyes(eyet eyet0, boolean z, Duration duration0, ibrl ibrl0) {
        this.b = eyet0;
        this.c = z;
        this.d = duration0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((eyes)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new eyes(this.b, this.c, this.d, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        gzxx gzxx0;
        gzya gzya0;
        Object object2;
        gzxs gzxs0;
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            this.a = 1;
            object0 = this.b.e.n(this);
            if(object0 == object1) {
                return object1;
            }
        }
        Duration duration0 = null;
        if(((Boolean)object0).booleanValue()) {
            return ibom.a;
        }
        if(this.c) {
            gzxs0 = gzxs.b;
        }
        else {
            eyet eyet0 = this.b;
            ibqc ibqc0 = new ibqc(((ibqd)ibpo.C(ibpg.N(eyeq.values()))), 0);
            while(ibqc0.hasNext()) {
                object2 = ibqc0.next();
                if(eyet0.g.get(((eyeq)object2)) == null) {
                    continue;
                }
                goto label_21;
            }
            object2 = null;
        label_21:
            if(((eyeq)object2) == null) {
                gzxs0 = gzxs.a;
            }
            else {
                switch(((eyeq)object2).ordinal()) {
                    case 0: {
                        gzxs0 = gzxs.h;
                        break;
                    }
                    case 1: {
                        gzxs0 = gzxs.c;
                        break;
                    }
                    case 2: {
                        gzxs0 = gzxs.i;
                        break;
                    }
                    case 3: {
                        gzxs0 = gzxs.d;
                        break;
                    }
                    case 4: {
                        gzxs0 = gzxs.e;
                        break;
                    }
                    case 5: {
                        gzxs0 = gzxs.f;
                        break;
                    }
                    case 6: {
                        gzxs0 = gzxs.g;
                        break;
                    }
                    default: {
                        throw new ibnq();
                    }
                }
            }
        }
        if(homc.m()) {
            Context context0 = AppContextProvider.a();
            ibuq.e(context0, "getApplicationContext(...)");
            eyed eyed0 = eyee.a(context0);
            ibuq.f(eyed0, "<this>");
            switch(eyed0.ordinal()) {
                case 0: {
                    gzya0 = gzya.a;
                    break;
                }
                case 1: {
                    gzya0 = gzya.d;
                    break;
                }
                case 2: {
                    gzya0 = gzya.e;
                    break;
                }
                case 3: {
                    gzya0 = gzya.f;
                    break;
                }
                case 4: {
                    gzya0 = gzya.g;
                    break;
                }
                case 5: {
                    gzya0 = gzya.h;
                    break;
                }
                case 6: {
                    gzya0 = gzya.b;
                    break;
                }
                default: {
                    throw new ibnq();
                }
            }
        }
        else {
            gzya0 = gzya.a;
        }
        eyet eyet1 = this.b;
        eynx eynx0 = eyet1.c.c;
        if(eynx0 == null) {
            gzxx0 = gzxx.b;
        }
        else {
            switch(eynx0.ordinal()) {
                case 0: {
                    gzxx0 = gzxx.b;
                    break;
                }
                case 1: {
                    gzxx0 = gzxx.c;
                    break;
                }
                case 2: {
                    gzxx0 = gzxx.d;
                    break;
                }
                case 3: {
                    gzxx0 = gzxx.e;
                    break;
                }
                case 4: {
                    gzxx0 = gzxx.f;
                    break;
                }
                case 5: {
                    gzxx0 = gzxx.g;
                    break;
                }
                case 6: {
                    gzxx0 = gzxx.h;
                    break;
                }
                case 7: {
                    gzxx0 = gzxx.i;
                    break;
                }
                case 8: {
                    gzxx0 = gzxx.j;
                    break;
                }
                default: {
                    throw new ibnq();
                }
            }
        }
        eyep eyep0 = (eyep)eyet1.g.get(eyeq.a);
        Duration duration1 = eyep0 == null ? null : eyep0.a();
        eyep eyep1 = (eyep)eyet1.g.get(eyeq.b);
        Duration duration2 = eyep1 == null ? null : eyep1.a();
        eyep eyep2 = (eyep)eyet1.g.get(eyeq.d);
        Duration duration3 = eyep2 == null ? null : eyep2.a();
        eyep eyep3 = (eyep)eyet1.g.get(eyeq.e);
        Duration duration4 = eyep3 == null ? null : eyep3.a();
        eyep eyep4 = (eyep)eyet1.g.get(eyeq.f);
        Duration duration5 = eyep4 == null ? null : eyep4.a();
        eyep eyep5 = (eyep)eyet1.g.get(eyeq.g);
        Duration duration6 = eyep5 == null ? null : eyep5.a();
        eyep eyep6 = (eyep)eyet1.g.get(eyeq.c);
        if(eyep6 != null) {
            duration0 = eyep6.a();
        }
        ibuq.f(gzxs0, "event");
        ibuq.f(gzxx0, "entryPoint");
        ibuq.f(gzya0, "featureAvailability");
        ibuq.f(this.d, "totalDuration");
        eyfi eyfi0 = new eyfi(gzxs0, gzxx0, gzya0, duration1, duration2, duration3, duration4, duration5, duration6, duration0, this.d);
        gzxd gzxd0 = gzxc.a(((ProtoLiteMessage)gzzc.a).v_newBuilder());
        eyfi0.a(gzxd0);
        gzzc gzzc0 = gzxd0.a();
        eyet1.b.a.a(gzzc0);
        return ibom.a;
    }
}

