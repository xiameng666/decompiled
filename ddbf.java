import android.accounts.Account;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.android.gms.nearby.sharing.Contact;
import com.google.android.gms.nearby.sharing.ShareTarget;
import java.util.ArrayList;

public final class ddbf {
    public static final void a(String s, Uri uri0, float f, goz goz0, int v) {
        ibuq.f(s, "displayName");
        goz goz1 = goz0.ao(0xF8E118EB);
        int v1 = (v & 6) == 0 ? (goz1.X(s) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (goz1.Z(uri0) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v1 |= (goz1.U(f) ? 0x100 : 0x80);
        }
        if((v1 & 0x93) == 0x92 && goz1.ac()) {
            goz1.G();
        }
        else {
            goz1.M(0x6E3C21FE);
            Object object0 = goz1.j();
            if(object0 == gop.a) {
                int v3 = 0;
                for(int v2 = 0; v2 < s.length(); ++v2) {
                    v3 += s.charAt(v2);
                }
                object0 = (ddbv)ddak.a.get(Math.abs(v3) % ddak.a.size());
                goz1.P(object0);
            }
            goz1.x();
            ddbf.i(uri0, gzf.e(0xAD385804, new ddbb(s, ((ddbv)object0), f), goz1), f, goz1, v1 << 3 & 0x1C00 | (v1 >> 3 & 14 | 0x1B0));
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new ddaq(s, uri0, f, v);
        }
    }

    public static final void b(int v, long v1, long v2, float f, boolean z, goz goz0, int v3, int v4) {
        int v9;
        int v7;
        long v6;
        int v5;
        goz goz1 = goz0.ao(0x6F1E53EB);
        if((v4 & 1) == 0) {
            v5 = (v3 & 6) == 0 ? (goz1.V(v) ? 4 : 2) | v3 : v3;
        }
        else {
            v5 = v3 | 6;
        }
        if((v4 & 2) == 0) {
            v6 = v1;
            if((v3 & 0x30) == 0) {
                v5 |= (goz1.W(v6) ? 0x20 : 16);
            }
        }
        else {
            v5 |= 0x30;
            v6 = v1;
        }
        if((v4 & 4) != 0) {
            v5 |= 0x180;
        }
        else if((v3 & 0x180) == 0) {
            v5 |= (goz1.W(v2) ? 0x100 : 0x80);
        }
        if((v4 & 8) != 0) {
            v5 |= 0xC00;
        }
        else if((v3 & 0xC00) == 0) {
            v5 |= (goz1.U(f) ? 0x800 : 0x400);
        }
        if((v4 & 16) != 0) {
            v5 |= 0x6000;
        }
        else if((v3 & 0x6000) == 0) {
            v5 |= (goz1.Y(z) ? 0x4000 : 0x2000);
        }
        if((v5 & 9363) == 9362 && goz1.ac()) {
            goz1.G();
            v7 = z;
        }
        else {
            int v8 = z & ((v4 & 16) == 0 ? 1 : 0);
            if(v8 != 0) {
                v9 = 0x7F08053F;  // drawable:gs_device_unknown_vd_theme_24
            }
            else if(v == 2) {
                v9 = 0x7F080656;  // drawable:gs_tablet_vd_theme_24
            }
            else {
                switch(v) {
                    case 3: {
                        v9 = 0x7F0805AE;  // drawable:gs_laptop_windows_vd_theme_24
                        break;
                    }
                    case 4: {
                        v9 = 0x7F08054A;  // drawable:gs_directions_car_vd_theme_24
                        break;
                    }
                    case 5: {
                        v9 = 0x7F08055D;  // drawable:gs_dual_screen_vd_theme_24
                        break;
                    }
                    case 6: {
                        v9 = 0x7F08058F;  // drawable:gs_head_mounted_device_vd_theme_24
                        break;
                    }
                    default: {
                        v9 = 0x7F0805F8;  // drawable:gs_phone_android_vd_theme_24
                    }
                }
            }
            hey hey0 = hfc.e;
            hfc hfc0 = cqx.c(hhi.a(dls.k(hey0, f), eah.a), v2);
            iau iau0 = dhw.a(hei.e, false);
            int v10 = ddal.a(gol.c(goz1));
            gzk gzk0 = goz1.ak();
            hfc hfc1 = hew.c(goz1, hfc0);
            ibth ibth0 = iej.a;
            goz1.O();
            if(goz1.x) {
                goz1.t(ibth0);
            }
            else {
                goz1.T();
            }
            guo.b(goz1, iau0, iej.e);
            guo.b(goz1, gzk0, iej.d);
            ibtw ibtw0 = iej.f;
            if(goz1.x || !ibuq.m(goz1.j(), Integer.valueOf(v10))) {
                Integer integer0 = v10;
                goz1.P(integer0);
                goz1.p(integer0, ibtw0);
            }
            guo.a(goz1, iej.g);
            guo.b(goz1, hfc1, iej.c);
            fiso.a(ism.a(v9, goz1, 0), null, dls.k(dla.d(hey0, 7.0f * f / 30.0f), 8.0f * f / 15.0f), v6, goz1, v5 << 6 & 0x1C00 | 56, 0);
            goz1.z();
            v7 = v8;
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new ddap(v, v1, v2, f, ((boolean)v7), v3, v4);
        }
    }

    public static final void c(float f, goz goz0, int v) {
        goz goz1 = goz0.ao(-1402245544);
        if((((v & 6) == 0 ? (goz1.U(f) ? 4 : 2) | v : v) & 3) == 2 && goz1.ac()) {
            goz1.G();
        }
        else {
            hqf hqf0 = ewl.a;
            if(hqf0 == null) {
                hqd hqd0 = new hqd("Outlined.AccountCircle", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 0x60);
                hmy hmy0 = new hmy(hll.a);
                ArrayList arrayList0 = new ArrayList(0x20);
                hqg.h(12.0f, 2.0f, arrayList0);
                hqg.b(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f, arrayList0);
                hqg.k(4.48f, 10.0f, 10.0f, 10.0f, arrayList0);
                hqg.k(10.0f, -4.48f, 10.0f, -10.0f, arrayList0);
                hqg.j(17.52f, 2.0f, 12.0f, 2.0f, arrayList0);
                hqg.a(arrayList0);
                hqg.h(7.35f, 18.5f, arrayList0);
                hqg.b(8.66f, 17.559999f, 10.26f, 17.0f, 12.0f, 17.0f, arrayList0);
                hqg.k(3.34f, 0.56f, 4.65f, 1.5f, arrayList0);
                hqg.b(15.34f, 19.440001f, 13.74f, 20.0f, 12.0f, 20.0f, arrayList0);
                hqg.j(8.66f, 19.440001f, 7.35f, 18.5f, arrayList0);
                hqg.a(arrayList0);
                hqg.h(18.139999f, 17.120001f, arrayList0);
                hqg.f(18.139999f, 17.120001f, arrayList0);
                hqg.b(16.450001f, 15.8f, 14.32f, 15.0f, 12.0f, 15.0f, arrayList0);
                hqg.k(-4.45f, 0.8f, -6.14f, 2.12f, arrayList0);
                hqg.g(0.0f, 0.0f, arrayList0);
                hqg.b(4.7f, 15.73f, 4.0f, 13.95f, 4.0f, 12.0f, arrayList0);
                hqg.c(0.0f, -4.42f, 3.58f, -8.0f, 8.0f, -8.0f, arrayList0);
                hqg.k(8.0f, 3.58f, 8.0f, 8.0f, arrayList0);
                hqg.b(20.0f, 13.95f, 19.299999f, 15.73f, 18.139999f, 17.120001f, arrayList0);
                hqg.a(arrayList0);
                hqd.e(hqd0, arrayList0, 0, "", hmy0, 1.0f, null, 1.0f, 1.0f, 2, 1.0f, 0x3800);
                hmy hmy1 = new hmy(hll.a);
                ArrayList arrayList1 = new ArrayList(0x20);
                hqg.h(12.0f, 6.0f, arrayList1);
                hqg.c(-1.93f, 0.0f, -3.5f, 1.57f, -3.5f, 3.5f, arrayList1);
                hqg.j(10.07f, 13.0f, 12.0f, 13.0f, arrayList1);
                hqg.k(3.5f, -1.57f, 3.5f, -3.5f, arrayList1);
                hqg.j(13.93f, 6.0f, 12.0f, 6.0f, arrayList1);
                hqg.a(arrayList1);
                hqg.h(12.0f, 11.0f, arrayList1);
                hqg.c(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f, arrayList1);
                hqg.j(11.17f, 8.0f, 12.0f, 8.0f, arrayList1);
                hqg.k(1.5f, 0.67f, 1.5f, 1.5f, arrayList1);
                hqg.j(12.83f, 11.0f, 12.0f, 11.0f, arrayList1);
                hqg.a(arrayList1);
                hqd.e(hqd0, arrayList1, 0, "", hmy1, 1.0f, null, 1.0f, 1.0f, 2, 1.0f, 0x3800);
                ewl.a = hqd0.a();
                hqf0 = ewl.a;
                ibuq.c(hqf0);
            }
            long v1 = fpu.a(goz1).a;
            fiso.b(hqf0, null, dls.k(hfc.e, f), v1, goz1, 0x30, 0);
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new dday(f, v);
        }
    }

    public static final void d(Account account0, float f, goz goz0, int v) {
        goz goz1 = goz0.ao(0x910A9F75);
        int v1 = (v & 6) == 0 ? (goz1.Z(account0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (goz1.U(f) ? 0x20 : 16);
        }
        if((v1 & 19) == 18 && goz1.ac()) {
            goz1.G();
        }
        else {
            if(account0 == null) {
                goz1.M(-1556901557);
                ddbf.c(f, goz1, v1 >> 3 & 14);
            }
            else {
                goz1.M(-1556850252);
                ddbf.i(ddbf.j(account0, goz1), gzf.e(0x386DB098, new ddbc(account0, f), goz1), f, goz1, v1 << 6 & 0x1C00 | 0x1B0);
            }
            goz1.x();
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new ddau(account0, f, v);
        }
    }

    public static final void e(String s, long v, long v1, float f, goz goz0, int v2) {
        goz goz2;
        int v3;
        String s1;
        goz goz1 = goz0.ao(-1049590840);
        if((v2 & 6) == 0) {
            s1 = s;
            v3 = (goz1.X(s1) ? 4 : 2) | v2;
        }
        else {
            s1 = s;
            v3 = v2;
        }
        if((v2 & 0x30) == 0) {
            v3 |= (goz1.W(v) ? 0x20 : 16);
        }
        if((v2 & 0x180) == 0) {
            v3 |= (goz1.W(v1) ? 0x100 : 0x80);
        }
        if((v2 & 0xC00) == 0) {
            v3 |= (goz1.U(f) ? 0x800 : 0x400);
        }
        if((v3 & 0x493) == 1170 && goz1.ac()) {
            goz1.G();
            goz2 = goz1;
        }
        else {
            hey hey0 = hfc.e;
            hfc hfc0 = cqx.c(hhi.a(dls.k(hey0, f), eah.a), v1);
            iau iau0 = dhw.a(hei.e, false);
            int v4 = ddal.a(gol.c(goz1));
            gzk gzk0 = goz1.ak();
            hfc hfc1 = hew.c(goz1, hfc0);
            ibth ibth0 = iej.a;
            goz1.O();
            if(goz1.x) {
                goz1.t(ibth0);
            }
            else {
                goz1.T();
            }
            guo.b(goz1, iau0, iej.e);
            guo.b(goz1, gzk0, iej.d);
            ibtw ibtw0 = iej.f;
            if(goz1.x || !ibuq.m(goz1.j(), Integer.valueOf(v4))) {
                Integer integer0 = v4;
                goz1.P(integer0);
                goz1.p(integer0, ibtw0);
            }
            guo.a(goz1, iej.g);
            guo.b(goz1, hfc1, iej.c);
            String s2 = ddhf.a(s1);
            jbn jbn0 = jbn.y(fpu.d(goz1).c, 0L, ((jks)goz1.h(ipa.d)).el(0.6f * f), null, null, null, 0L, null, 0, ((jks)goz1.h(ipa.d)).el(f), null, new jjw(jjt.b, 17), 0, 0, null, 0xEDFFFD);
            goz1.M(0x6E3C21FE);
            Object object0 = goz1.j();
            if(object0 == gop.a) {
                object0 = new ddaw();
                goz1.P(object0);
            }
            goz1.x();
            goz2 = goz1;
            fiuk.b(s2, iuc.b(hey0, ((ibts)object0)), v, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, jbn0, goz2, v3 << 3 & 0x380, 0, 0x1FFF8);
            goz2.z();
        }
        gsb gsb0 = goz2.af();
        if(gsb0 != null) {
            gsb0.d = new ddax(s, v, v1, f, v2);
        }
    }

    public static final void f(Account account0, float f, boolean z, goz goz0, int v, int v1) {
        int v2;
        goz goz1 = goz0.ao(-251582300);
        if((v1 & 1) == 0) {
            v2 = (v & 6) == 0 ? (goz1.Z(account0) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
        }
        else if((v & 0x30) == 0) {
            v2 |= (goz1.U(f) ? 0x20 : 16);
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
        }
        else if((v & 0x180) == 0) {
            v2 |= (goz1.Y(((boolean)(((int)z)))) ? 0x100 : 0x80);
        }
        if((v2 & 0x93) == 0x92 && goz1.ac()) {
            goz1.G();
        }
        else {
            z = ((int)z) & ((v1 & 4) == 0 ? 1 : 0);
            Context context0 = (Context)goz1.h(AndroidCompositionLocals_androidKt.b);
            ddbf.i(ddbf.j(account0, goz1), gzf.e(0x86AB87FD, new ddbd(f, ((boolean)(((int)z))), context0), goz1), f, goz1, v2 << 6 & 0x1C00 | 0x1B0);
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new ddav(account0, f, ((boolean)(((int)z))), v, v1);
        }
    }

    public static final void g(int v, String s, Uri uri0, boolean z, boolean z1, float f, goz goz0, int v1) {
        int v3;
        int v2;
        ibuq.f(s, "deviceName");
        goz goz1 = goz0.ao(0x63EEF320);
        if((v1 & 6) == 0) {
            v2 = v;
            v3 = (goz1.V(v2) ? 4 : 2) | v1;
        }
        else {
            v2 = v;
            v3 = v1;
        }
        if((v1 & 0x30) == 0) {
            v3 |= (goz1.X(s) ? 0x20 : 16);
        }
        if((v1 & 0x180) == 0) {
            v3 |= (goz1.Z(uri0) ? 0x100 : 0x80);
        }
        if((v1 & 0xC00) == 0) {
            v3 |= (goz1.Y(z) ? 0x800 : 0x400);
        }
        if((v1 & 0x6000) == 0) {
            v3 |= (goz1.Y(z1) ? 0x4000 : 0x2000);
        }
        if((0x30000 & v1) == 0) {
            v3 |= (goz1.U(f) ? 0x20000 : 0x10000);
        }
        if((74899 & v3) == 74898 && goz1.ac()) {
            goz1.G();
        }
        else {
            int v4 = v3 >> 6 & 0x1C00;
            if(z) {
                goz1.M(0x5BD99504);
                ddbf.b(v2, ddhw.a(goz1).b, ddhw.a(goz1).a, f, false, goz1, v3 & 14 | v4, 16);
            }
            else if(z1) {
                goz1.M(0x5BDCD1E7);
                ddbf.i(uri0, gzf.e(1804317821, new ddbe(s, f), goz1), f, goz1, v3 >> 6 & 14 | 0x1B0 | v4);
            }
            else {
                goz1.M(0x5BE23FF0);
                if(hvod.c()) {
                    goz1.M(0x5BE2AC32);
                    ddbf.b(v, ddhw.a(goz1).b, ddhw.a(goz1).a, f, false, goz1, v3 & 14 | v4, 16);
                }
                else {
                    goz1.M(1541855790);
                    ddbf.e(s, ddhw.a(goz1).g, ddhw.a(goz1).f, f, goz1, v3 >> 3 & 14 | v4);
                }
                goz1.x();
            }
            goz1.x();
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new ddas(v, s, uri0, z, z1, f, v1);
        }
    }

    public static final void h(ShareTarget shareTarget0, float f, goz goz0, int v) {
        float f1;
        ibuq.f(shareTarget0, "shareTarget");
        goz goz1 = goz0.ao(0xD4812B3C);
        int v1 = (v & 6) == 0 ? (goz1.Z(shareTarget0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (goz1.U(f) ? 0x20 : 16);
        }
        if((v1 & 19) == 18 && goz1.ac()) {
            goz1.G();
            f1 = f;
        }
        else {
            ibuq.e(shareTarget0.b, "getDeviceName(...)");
            f1 = f;
            ddbf.g(shareTarget0.d, shareTarget0.b, shareTarget0.c, shareTarget0.n, shareTarget0.h, f1, goz1, v1 << 12 & 0x70000);
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new ddat(shareTarget0, f1, v);
        }
    }

    public static final void i(Object object0, ibtw ibtw0, float f, goz goz0, int v) {
        goz goz1 = goz0.ao(0x12703999);
        int v1 = (v & 6) == 0 ? (goz1.Z(object0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (goz1.X(null) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v1 |= (goz1.Z(ibtw0) ? 0x100 : 0x80);
        }
        if((v & 0xC00) == 0) {
            v1 |= (goz1.U(f) ? 0x800 : 0x400);
        }
        if((v1 & 0x493) == 1170 && goz1.ac()) {
            goz1.G();
        }
        else {
            hfc hfc0 = hhi.a(dls.k(hfc.e, f), eah.a);
            tzl tzl0 = tzc.a(gzf.e(-432900311, new ddba(ibtw0), goz1));
            tzc.b(object0, null, hfc0, null, hys.a, 0.0f, null, null, tzl0, null, goz1, v1 & 14 | 0x6000 | v1 & 0x70, 744);
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new ddao(object0, ibtw0, f, v);
        }
    }

    public static final Bitmap j(Account account0, goz goz0) {
        goz0.M(2061653564);
        Context context0 = (Context)goz0.h(AndroidCompositionLocals_androidKt.b);
        goz0.M(0x6E3C21FE);
        Object object0 = goz0.j();
        Object object1 = gop.a;
        evql evql0 = null;
        if(object0 == object1) {
            ParcelableSnapshotMutableState parcelableSnapshotMutableState0 = new ParcelableSnapshotMutableState(null, gul.a);
            goz0.P(parcelableSnapshotMutableState0);
            object0 = parcelableSnapshotMutableState0;
        }
        goz0.x();
        goz0.M(5004770);
        boolean z = goz0.X(account0);
        Object object2 = goz0.j();
        if(z || object2 == object1) {
            if(account0 != null) {
                evql0 = dizg.c(context0, account0);
                evql0.b(new ddam(new ddaz(((gra)object0))));
                evql0.A(new ddan(((gra)object0)));
            }
            goz0.P(evql0);
            object2 = evql0;
        }
        evql evql1 = (evql)object2;
        goz0.x();
        Bitmap bitmap0 = (Bitmap)((gra)object0).a();
        goz0.x();
        return bitmap0;
    }

    public static final void k(Contact contact0, goz goz0, int v) {
        ibuq.f(contact0, "contact");
        goz goz1 = goz0.ao(120930614);
        int v1 = (v & 6) == 0 ? (goz1.Z(contact0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (goz1.U(42.0f) ? 0x20 : 16);
        }
        if((v1 & 19) == 18 && goz1.ac()) {
            goz1.G();
        }
        else {
            ibuq.e(contact0.c, "getDisplayName(...)");
            ddbf.a(contact0.c, contact0.d, 42.0f, goz1, v1 << 3 & 0x380);
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new ddar(contact0, v);
        }
    }
}

