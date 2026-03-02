import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

public final class abt {
    public static final void a(boolean z, ibth ibth0, goz goz0, int v, int v1) {
        int v2;
        goz goz1 = goz0.ao(0xEA74A72A);
        boolean z1 = true;
        if(v1 == 0) {
            v2 = (v & 6) == 0 ? (goz1.Y(((boolean)(((int)z)))) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v & 0x30) == 0) {
            v2 |= (goz1.Z(ibth0) ? 0x20 : 16);
        }
        if(goz1.ad((v2 & 19) != 18, v2 & 1)) {
            z = ((int)z) | v1;
            gui gui0 = guf.a(ibth0, goz1);
            Object object0 = goz1.j();
            Object object1 = gop.a;
            if(object0 == object1) {
                object0 = new abr(1 == ((int)z), gui0);
                goz1.P(object0);
            }
            int v3 = goz1.Z(((abr)object0));
            Object object2 = goz1.j();
            if((((v2 & 14) == 4 ? 1 : 0) | v3) != 0 || object2 == object1) {
                object2 = new abo(((abr)object0), 1 == ((int)z));
                goz1.P(object2);
            }
            gqe.h(((ibth)object2), goz1);
            abf abf0 = abz.a(goz1);
            if(abf0 == null) {
                throw new IllegalStateException("No OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner");
            }
            abc abc0 = abf0.getOnBackPressedDispatcher();
            lps lps0 = (lps)goz1.h(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
            int v4 = goz1.Z(abc0) | goz1.Z(lps0) | goz1.Z(((abr)object0));
            Object object3 = goz1.j();
            if(v4 != 0 || object3 == object1) {
                object3 = new abp(abc0, lps0, ((abr)object0));
                goz1.P(object3);
            }
            gqe.b(lps0, abc0, ((ibts)object3), goz1);
        }
        else {
            goz1.G();
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            if(1 != ((int)z)) {
                z1 = false;
            }
            gsb0.d = new abq(z1, ibth0, v, v1);
        }
    }
}

