import com.google.android.chimera.android.Activity;

public final class deag {
    public static final ibts a(gui gui0) {
        return (ibts)gui0.a();
    }

    public static final void b(gyza gyza0, ibts ibts0, goz goz0, int v) {
        ibuq.f(gyza0, "screen");
        ibuq.f(ibts0, "dispatch");
        goz goz1 = goz0.ao(0x9F3A3A20);
        int v1 = 1;
        int v2 = (v & 6) == 0 ? (goz1.V(gyza0.ordinal()) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v2 |= (goz1.Z(ibts0) ? 0x20 : 16);
        }
        if((v2 & 19) == 18 && goz1.ac()) {
            goz1.G();
        }
        else {
            gui gui0 = guf.a(ibts0, goz1);
            Activity activity0 = (Activity)goz1.h(ddyi.a);
            if(activity0 != null) {
                goz1.M(0x97EA02AA);
                int v3 = goz1.X(gui0);
                if((v2 & 14) != 4) {
                    v1 = 0;
                }
                int v4 = v3 | v1 | goz1.Z(activity0);
                Object object0 = goz1.j();
                if(v4 != 0 || object0 == gop.a) {
                    object0 = new dead(gyza0, activity0, gui0);
                    goz1.P(object0);
                }
                goz1.x();
                gqe.c(gyza0, ((ibts)object0), goz1);
            }
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new deae(gyza0, ibts0, v);
        }
    }
}

