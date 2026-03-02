import android.content.Context;
import android.content.IntentFilter;
import android.net.Uri;
import java.io.File;
import java.util.Arrays;
import java.util.List;

public final class dghz {
    public final dghp a;
    public final dgah b;
    public final fgvt c;
    public long d;
    public final icmq e;
    private final Context f;
    private dbwu g;

    public dghz(Context context0, dghp dghp0, dgah dgah0, fgvt fgvt0, icck icck0) {
        ibuq.f(context0, "context");
        ibuq.f(dghp0, "role");
        super();
        this.f = context0;
        this.a = dghp0;
        this.b = dgah0;
        this.c = fgvt0;
        this.e = icii.a(iciv.b(new dghy(dcvk.a(context0, "CertificatesDownloadReceiver", new IntentFilter("com.google.android.gms.nearby.sharing.CERTIFICATES_DOWNLOAD")))), icck0, icmy.a(0L, 3));
    }

    public final dgfi a() {
        dcpv dcpv0 = dcpw.a(new dghu(this));
        dgah dgah0 = this.b;
        dgaq dgaq0 = dgah0.e(dcpv0);
        if(this.a == dghp.b) {
            dbwu dbwu0 = dgah0.c(dcpv0);
            if(dbwu0 != null && !ibuq.m(dbwu0, this.g)) {
                this.g = dbwu0;
                this.d = this.c.c().toMillis();
            }
        }
        ibuq.e(dgaq0.a, "getEncryptedMetadataKey(...)");
        return new dgfi(ibpg.J(dgaq0.a), ibpg.J(dgaq0.b));
    }

    public final dggg b(dgfi dgfi0) {
        List list2;
        Uri uri0;
        String s1;
        byte[] arr_b = ibpo.aC(dgfi0.a);
        byte[] arr_b1 = ibpo.aC(dgfi0.b);
        dgap dgap0 = this.b.d(arr_b, arr_b1);
        String s = null;
        if(dgap0 != null) {
            dbwr dbwr0 = dgap0.b;
            if((dbwr0.b & 8) != 0) {
                s1 = String.valueOf(Arrays.hashCode(new Object[]{dbwr0.f}));
                goto label_11;
            }
            s1 = (dgap0.a.b & 1) == 0 ? null : bboy.e(dgap0.a.c.toByteArray());
            if(s1 != null) {
            label_11:
                byte[] arr_b2 = dgap0.a.e.toByteArray();
                ibuq.e(arr_b2, "toByteArray(...)");
                List list0 = ibpg.J(arr_b2);
                byte[] arr_b3 = dgap0.a.d.toByteArray();
                ibuq.e(arr_b3, "toByteArray(...)");
                List list1 = ibpg.J(arr_b3);
                String s2 = dbwr0.c;
                ibuq.e(s2, "getDeviceName(...)");
                String s3 = dbwr0.d;
                Context context0 = this.f;
                String s4 = dbwr0.e;
                ibuq.e(s4, "getIconUrl(...)");
                if(ibzk.D(s4)) {
                    uri0 = null;
                }
                else {
                    File file0 = djbw.b(context0, s4);
                    if(file0 == null) {
                        uri0 = null;
                    }
                    else {
                        try {
                            uri0 = jwg.a(context0, "com.google.android.gms.fileprovider", file0);
                        }
                        catch(IllegalArgumentException illegalArgumentException0) {
                            dcvz.a.b().f(illegalArgumentException0).h("[NS_ERROR] Failed to get content Uri for %s", file0);
                            uri0 = null;
                        }
                    }
                }
                dbwr dbwr1 = dgap0.b;
                if((dbwr1.b & 8) == 0) {
                    list2 = null;
                }
                else {
                    byte[] arr_b4 = dbwr1.f.toByteArray();
                    ibuq.e(arr_b4, "toByteArray(...)");
                    list2 = ibpg.J(arr_b4);
                }
                if((dbwr1.b & 0x20) != 0) {
                    s = dbwr1.h;
                }
                String s5 = dbwr1.i;
                ibuq.e(s5, "getModelName(...)");
                return new dggg(s1, list0, list1, new dger(s2, s3, uri0, list2, s, s5, dbwr1.j), dgap0.c);
            }
        }
        return null;
    }

    public final boolean c(List list0, List list1, dggg dggg0) {
        int v = 1;
        ibuq.f(list0, "token");
        ibuq.f(list1, "signature");
        byte[] arr_b = ibpo.aC(dggg0.b);
        switch(this.a.ordinal()) {
            case 0: {
                v = 2;
                break;
            }
            case 1: {
                break;
            }
            default: {
                throw new ibnq();
            }
        }
        byte[] arr_b1 = ibpo.aC(list1);
        return this.b.k(arr_b, ibpo.aC(ibpo.ak(ibpo.b(Byte.valueOf(((byte)v))), list0)), arr_b1);
    }
}

