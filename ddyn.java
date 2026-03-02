import android.nfc.NfcAdapter;
import android.os.Bundle;
import com.google.android.chimera.android.Activity;

public final class ddyn {
    public static final Bundle a;

    static {
        Bundle bundle0 = new Bundle();
        bundle0.putInt("presence", 100);
        ddyn.a = bundle0;
    }

    public static final void a(goz goz0, int v) {
        int v1 = 0;
        goz goz1 = goz0.ao(0x2942A43C);
        if(v != 0) {
        label_8:
            Activity activity0 = (Activity)goz1.h(ddyi.a);
            if(activity0 != null) {
                goz1.M(0x99F9572C);
                goz1.M(0x6E3C21FE);
                Object object0 = goz1.j();
                Object object1 = gop.a;
                if(object0 == object1) {
                    boolean z = activity0.getPackageManager().hasSystemFeature("android.hardware.nfc");
                    int v2 = jwe.a(activity0, "android.permission.NFC");
                    NfcAdapter nfcAdapter0 = NfcAdapter.getDefaultAdapter(activity0);
                    object0 = z && v2 == 0 && nfcAdapter0 != null && nfcAdapter0.isEnabled() ? nfcAdapter0 : null;
                    goz1.P(object0);
                }
                goz1.x();
                goz1.x();
                goz1.M(0xE32A9392);
                if(((NfcAdapter)object0) != null) {
                    ibom ibom0 = ibom.a;
                    goz1.M(-1633490746);
                    int v3 = goz1.Z(((NfcAdapter)object0)) | goz1.Z(activity0);
                    Object object2 = goz1.j();
                    if(v3 != 0 || object2 == object1) {
                        object2 = new ddyk(((NfcAdapter)object0), activity0);
                        goz1.P(object2);
                    }
                    goz1.x();
                    gqe.c(ibom0, ((ibts)object2), goz1);
                }
                goz1.x();
            }
            v1 = v;
        }
        else if(!goz1.ac()) {
            v = 0;
            goto label_8;
        }
        else {
            goz1.G();
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new ddyl(v1);
        }
    }
}

