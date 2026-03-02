import android.accounts.Account;
import com.google.android.gms.nearby.sharing.DeviceVisibility;

public final class ddhe {
    public static final void a(gra gra0, boolean z) {
        gra0.b(Boolean.valueOf(z));
    }

    public static final void b(hfc hfc0, ibth ibth0, goz goz0, int v, int v1) {
        int v2;
        goz goz1 = goz0.ao(0xF927BE65);
        if(v1 == 0) {
            v2 = (v & 6) == 0 ? (goz1.X(hfc0) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v & 0x30) == 0) {
            v2 |= (goz1.Z(ibth0) ? 0x20 : 16);
        }
        if((v2 & 19) == 18 && goz1.ac()) {
            goz1.G();
        }
        else {
            if(v1 != 0) {
                hfc0 = hfc.e;
            }
            cmig.f(0x40953, gzf.e(-1305314713, new ddha(hfc0, ibth0), goz1), goz1, 54);
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new ddgp(hfc0, ibth0, v, v1);
        }
    }

    public static final void c(String s, Account account0, ibth ibth0, ibth ibth1, goz goz0, int v) {
        ibuq.f(s, "deviceName");
        goz goz1 = goz0.ao(-1663003079);
        int v1 = (v & 6) == 0 ? (goz1.X(s) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (goz1.Z(account0) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v1 |= (goz1.Z(ibth0) ? 0x100 : 0x80);
        }
        if((v & 0xC00) == 0) {
            v1 |= (goz1.Z(ibth1) ? 0x800 : 0x400);
        }
        if((v1 & 0x493) == 1170 && goz1.ac()) {
            goz1.G();
        }
        else {
            cmig.f(0x4039F, gzf.e(0xCC950B77, new ddgx(ibth0, s, account0, ibth1), goz1), goz1, 54);
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new ddgo(s, account0, ibth0, ibth1, v);
        }
    }

    public static final void d(DeviceVisibility deviceVisibility0, String s, Account account0, ibth ibth0, ibth ibth1, ibts ibts0, goz goz0, int v) {
        String s1 = s;
        ibuq.f(deviceVisibility0, "deviceVisibility");
        ibuq.f(s1, "deviceName");
        goz goz1 = goz0.ao(0x7E86BD00);
        int v1 = (v & 6) == 0 ? (goz1.Z(deviceVisibility0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (goz1.X(s1) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v1 |= (goz1.Z(account0) ? 0x100 : 0x80);
        }
        if((v & 0xC00) == 0) {
            v1 |= (goz1.Z(ibth0) ? 0x800 : 0x400);
        }
        if((v & 0x6000) == 0) {
            v1 |= (goz1.Z(ibth1) ? 0x4000 : 0x2000);
        }
        if((0x30000 & v) == 0) {
            v1 |= (goz1.Z(ibts0) ? 0x20000 : 0x10000);
        }
        if((74899 & v1) == 74898 && goz1.ac()) {
            goz1.G();
        }
        else {
            goz1.M(0x6E3C21FE);
            Object object0 = goz1.j();
            Object object1 = gop.a;
            if(object0 == object1) {
                object0 = new ddgr();
                goz1.P(object0);
            }
            goz1.x();
            gra gra0 = (gra)had.c(new Object[0], ((ibth)object0), goz1, 0x30);
            iau iau0 = dii.a(dho.g(8.0f), hei.m, goz1, 6);
            long v2 = gol.c(goz1);
            gzk gzk0 = goz1.ak();
            hfc hfc0 = hew.c(goz1, hfc.e);
            ibth ibth2 = iej.a;
            goz1.O();
            if(goz1.x) {
                goz1.t(ibth2);
            }
            else {
                goz1.T();
            }
            int v3 = (int)(v2 ^ v2 >>> 0x20);
            guo.b(goz1, iau0, iej.e);
            guo.b(goz1, gzk0, iej.d);
            ibtw ibtw0 = iej.f;
            if(goz1.x || !ibuq.m(goz1.j(), Integer.valueOf(v3))) {
                Integer integer0 = v3;
                goz1.P(integer0);
                goz1.p(integer0, ibtw0);
            }
            guo.a(goz1, iej.g);
            guo.b(goz1, hfc0, iej.c);
            ddhe.e(deviceVisibility0, account0, ibth0, goz1, v1 & 14 | v1 >> 3 & 0x70 | v1 >> 3 & 0x380);
            goz1.M(5004770);
            boolean z = goz1.X(gra0);
            Object object2 = goz1.j();
            if(z || object2 == object1) {
                object2 = new ddgs(gra0);
                goz1.P(object2);
            }
            goz1.x();
            s1 = s;
            ddhe.c(s1, account0, ((ibth)object2), ibth1, goz1, v1 >> 3 & 7294);
            goz1.M(-1540195706);
            if(((Boolean)gra0.a()).booleanValue()) {
                goz1.M(5004770);
                boolean z1 = goz1.X(gra0);
                Object object3 = goz1.j();
                if(z1 || object3 == object1) {
                    object3 = new ddgm(gra0);
                    goz1.P(object3);
                }
                goz1.x();
                ddfh.d(s1, ibts0, ((ibth)object3), goz1, v1 >> 12 & 0x70 | v1 >> 3 & 14);
            }
            goz1.x();
            goz1.z();
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new ddgn(deviceVisibility0, s1, account0, ibth0, ibth1, ibts0, v);
        }
    }

    public static final void e(DeviceVisibility deviceVisibility0, Account account0, ibth ibth0, goz goz0, int v) {
        ibuq.f(deviceVisibility0, "deviceVisibility");
        goz goz1 = goz0.ao(-1190833025);
        int v1 = (v & 6) == 0 ? (goz1.Z(deviceVisibility0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (goz1.Z(account0) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v1 |= (goz1.Z(ibth0) ? 0x100 : 0x80);
        }
        if((v1 & 0x93) == 0x92 && goz1.ac()) {
            goz1.G();
        }
        else {
            cmig.f(263080, gzf.e(-390477379, new ddhd(ibth0, deviceVisibility0, account0), goz1), goz1, 54);
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new ddgq(deviceVisibility0, account0, ibth0, v);
        }
    }
}

