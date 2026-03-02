import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

public final class acj {
    public static final void a(boolean z, ibtw ibtw0, goz goz0, int v) {
        goz goz1 = goz0.ao(-642000585);
        int v1 = 1;
        int v2 = (v & 6) == 0 ? (goz1.Y(z) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v2 |= (goz1.Z(ibtw0) ? 0x20 : 16);
        }
        if(goz1.ad((v2 & 19) != 18, v2 & 1)) {
            gui gui0 = guf.a(ibtw0, goz1);
            Object object0 = goz1.j();
            Object object1 = gop.a;
            if(object0 == object1) {
                object0 = gqe.a(ibru.a, goz1);
                goz1.P(object0);
            }
            Object object2 = goz1.j();
            if(object2 == object1) {
                object2 = new ace(z, ((icck)object0), acj.b(gui0));
                goz1.P(object2);
            }
            if((goz1.X(acj.b(gui0)) | goz1.X(((icck)object0))) != 0 || goz1.j() == object1) {
                ((ace)object2).d = acj.b(gui0);
                ((ace)object2).a = (icck)object0;
                goz1.P(ibom.a);
            }
            Boolean boolean0 = Boolean.valueOf(z);
            int v3 = goz1.Z(((ace)object2));
            if((v2 & 14) != 4) {
                v1 = 0;
            }
            Object object3 = goz1.j();
            if((v3 | v1) != 0 || object3 == object1) {
                object3 = new ach(((ace)object2), z, null);
                goz1.P(object3);
            }
            gqe.f(boolean0, ((ibtw)object3), goz1);
            abf abf0 = abz.a(goz1);
            if(abf0 == null) {
                throw new IllegalStateException("No OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner");
            }
            abc abc0 = abf0.getOnBackPressedDispatcher();
            lps lps0 = (lps)goz1.h(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
            int v4 = goz1.Z(abc0) | goz1.Z(lps0) | goz1.Z(((ace)object2));
            Object object4 = goz1.j();
            if(v4 != 0 || object4 == object1) {
                object4 = new acf(abc0, lps0, ((ace)object2));
                goz1.P(object4);
            }
            gqe.b(lps0, abc0, ((ibts)object4), goz1);
        }
        else {
            goz1.G();
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new acg(z, ibtw0, v);
        }
    }

    private static final ibtw b(gui gui0) {
        return (ibtw)gui0.a();
    }
}

