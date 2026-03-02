import android.content.Intent;

public final class cafp {
    public static final void a(ibts ibts0, goz goz0, int v) {
        ibuq.f(ibts0, "onAccountChanged");
        goz goz1 = goz0.ao(0x6C0A9DDF);
        int v1 = 1;
        int v2 = (v & 6) == 0 ? (goz1.Z(ibts0) ? 4 : 2) | v : v;
        if((v2 & 3) == 2 && goz1.ac()) {
            goz1.G();
        }
        else {
            bboh bboh0 = cajd.a("AccountPickerButton");
            azor azor0 = new azor();
            azor0.c(ibpo.b("com.google"));
            azor0.e = "com.google.android.gms";
            azor0.e();
            azor0.d();
            azor0.c = "Choose an account";
            azor0.f = 1004;
            Intent intent0 = azou.a(azor0.a());
            adt adt0 = new adt();
            goz1.M(-1633490746);
            int v3 = goz1.Z(bboh0);
            if((v2 & 14) != 4) {
                v1 = 0;
            }
            Object object0 = goz1.j();
            if((v3 | v1) != 0 || object0 == gop.a) {
                object0 = new cafm(bboh0, ibts0);
                goz1.P(object0);
            }
            goz1.x();
            aca aca0 = abn.a(adt0, ((ibts)object0), goz1);
            goz1.M(-1633490746);
            int v4 = goz1.Z(aca0) | goz1.Z(intent0);
            Object object1 = goz1.j();
            if(v4 != 0 || object1 == gop.a) {
                object1 = new cafn(aca0, intent0);
                goz1.P(object1);
            }
            goz1.x();
            fcm.c(((ibth)object1), dla.j(hfc.e, 16.0f, 0.0f, 0.0f, 0.0f, 14), false, null, null, crl.a(1.0f, fpu.a(goz1).a), null, cafr.a, goz1, 0x30000030, 444);
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new cafo(ibts0, v);
        }
    }
}

