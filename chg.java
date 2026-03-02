import androidx.compose.runtime.ParcelableSnapshotMutableState;

public final class chg {
    public static final ckh a;
    private static final ckh b;

    static {
        chg.b = chm.b(0.0f, 0.0f, null, 7);
        chg.a = chm.b(0.0f, 0.0f, Integer.valueOf(1), 3);
    }

    public static final gui a(float f, chl chl0, goz goz0, int v) {
        return chg.b(new jkv(f), cmv.c, chl0, null, goz0, v & 14 | v << 3 & 0x380, 8);
    }

    public static final gui b(Object object0, cmc cmc0, chl chl0, Object object1, goz goz0, int v, int v1) {
        if((v1 & 4) != 0) {
            Object object2 = goz0.k();
            if(object2 == gop.a) {
                object2 = chm.b(0.0f, 0.0f, null, 7);
                goz0.R(object2);
            }
            chl0 = (ckh)object2;
        }
        if((v1 & 8) != 0) {
            object1 = null;
        }
        Object object3 = goz0.k();
        Object object4 = gop.a;
        if(object3 == object4) {
            ParcelableSnapshotMutableState parcelableSnapshotMutableState0 = new ParcelableSnapshotMutableState(null, gul.a);
            goz0.R(parcelableSnapshotMutableState0);
            object3 = parcelableSnapshotMutableState0;
        }
        Object object5 = goz0.k();
        if(object5 == object4) {
            object5 = new chb(object0, cmc0, object1);
            goz0.R(object5);
        }
        gui gui0 = guf.a(null, goz0);
        if(object1 != null && (chl0 instanceof ckh) && !ibuq.m(((ckh)chl0).c, object1)) {
            chl0 = new ckh(((ckh)chl0).a, ((ckh)chl0).b, object1);
        }
        gui gui1 = guf.a(chl0, goz0);
        Object object6 = goz0.k();
        int v2 = 0;
        if(object6 == object4) {
            object6 = icgx.a(-1, 0, null, 6);
            goz0.R(object6);
        }
        int v3 = goz0.Z(((icgv)object6));
        if((v & 14 ^ 6) > 4 && goz0.Z(object0) || (6 & v) == 4) {
            v2 = 1;
        }
        Object object7 = goz0.k();
        if((v3 | v2) != 0 || object7 == object4) {
            object7 = new chd(((icgv)object6), object0);
            goz0.R(object7);
        }
        gqe.h(((ibth)object7), goz0);
        int v4 = goz0.Z(((icgv)object6)) | goz0.Z(((chb)object5)) | goz0.X(gui1) | goz0.X(gui0);
        Object object8 = goz0.k();
        if(v4 != 0 || object8 == object4) {
            chf chf0 = new chf(((icgv)object6), ((chb)object5), gui1, gui0, null);
            goz0.R(chf0);
            object8 = chf0;
        }
        gqe.f(((icgv)object6), ((ibtw)object8), goz0);
        gui gui2 = (gui)((gra)object3).a();
        return gui2 == null ? ((chb)object5).a : gui2;
    }

    public static final gui c(float f, chl chl0, goz goz0, int v, int v1) {
        if((v1 & 2) != 0) {
            chl0 = chg.b;
        }
        float f1 = (v1 & 4) == 0 ? 0.0f : 0.01f;
        if(chl0 == chg.b) {
            goz0.M(0x4431B71F);
            boolean z = (v & 0x380 ^ 0x180) > 0x100 && goz0.U(f1) || (v & 0x180) == 0x100;
            Object object0 = goz0.j();
            if(z || object0 == gop.a) {
                object0 = chm.b(0.0f, 0.0f, Float.valueOf(f1), 3);
                goz0.P(object0);
            }
            goz0.x();
            return chg.b(Float.valueOf(f), cmv.a, ((ckh)object0), Float.valueOf(f1), goz0, v & 14 | v << 3 & 0x1C00 | v << 3 & 0xE000, 0);
        }
        goz0.M(0x44336485);
        goz0.x();
        return chg.b(Float.valueOf(f), cmv.a, chl0, Float.valueOf(f1), goz0, v & 14 | v << 3 & 0x1C00 | v << 3 & 0xE000, 0);
    }
}

