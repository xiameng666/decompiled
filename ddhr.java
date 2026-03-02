import androidx.compose.runtime.ParcelableSnapshotMutableState;

public final class ddhr {
    private static final eag a;

    static {
        ddhr.a = eah.a(50);
    }

    public static final void a(gra gra0, boolean z) {
        gra0.b(Boolean.valueOf(z));
    }

    public static final void b(fzm fzm0, goz goz0, int v) {
        ibuq.f(fzm0, "snackbarData");
        goz goz1 = goz0.ao(0xDAD1E027);
        if((((v & 6) == 0 ? (goz1.X(fzm0) ? 4 : 2) | v : v) & 3) == 2 && goz1.ac()) {
            goz1.G();
        }
        else {
            jlm jlm0 = (jlm)goz1.h(ipa.i);
            fzn fzn0 = fzm0.a;
            String s = fzn0.b;
            goz1.M(0x6E3C21FE);
            Object object0 = goz1.j();
            if(object0 == gop.a) {
                ParcelableSnapshotMutableState parcelableSnapshotMutableState0 = new ParcelableSnapshotMutableState(Boolean.valueOf(false), gul.a);
                goz1.P(parcelableSnapshotMutableState0);
                object0 = parcelableSnapshotMutableState0;
            }
            goz1.x();
            if(!hvqz.ag() && !hvod.c() || !((Boolean)((gra)object0).a()).booleanValue() && !fzn0.c) {
                goz1.M(0x4D9FE46E);
                hfc hfc0 = dla.j(hfc.e, 0.0f, 0.0f, 0.0f, 24.0f, 7);
                long v1 = fpu.a(goz1).u;
                gze gze0 = gzf.e(0xDA9FDF26, new ddhq(s, jlm0, fzm0, ((gra)object0)), goz1);
                gaq.c(hfc0, ddhr.a, v1, 0L, 0.0f, 12.0f, null, gze0, goz1, 88);
            }
            else {
                goz1.M(0x4D7B075A);
                hfc hfc1 = dla.j(hfc.e, 24.0f, 0.0f, 24.0f, 24.0f, 2);
                long v2 = fpu.a(goz1).u;
                gaq.c(hfc1, fpu.c(goz1).e, v2, 0L, 0.0f, 12.0f, null, gzf.e(-109279011, new ddhl(fzm0, s), goz1), goz1, 88);
            }
            goz1.x();
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new ddhg(fzm0, v);
        }
    }
}

