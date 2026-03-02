import com.google.android.gms.auth.cryptauth.DeviceFeatureStatus;
import com.google.android.gms.auth.cryptauth.DeviceMetadata;
import com.google.android.gms.auth.proximity.firstparty.SyncedCryptauthDevice;
import java.util.ArrayList;
import java.util.List;

public final class akwd {
    public static final int a;
    private static final baun b;

    static {
        akwd.b = new baun("ProximityAuth", new String[]{"DeviceConverter"});
    }

    public static SyncedCryptauthDevice a(DeviceMetadata deviceMetadata0) {
        byte[] arr_b = new byte[0];
        ArrayList arrayList0 = new ArrayList();
        ArrayList arrayList1 = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        String s = deviceMetadata0.f;
        String s1 = deviceMetadata0.d;
        List list0 = deviceMetadata0.e;
        if(list0 != null) {
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            for(Object object0: list0) {
                DeviceFeatureStatus deviceFeatureStatus0 = (DeviceFeatureStatus)object0;
                if(deviceFeatureStatus0.c) {
                    String s2 = deviceFeatureStatus0.b;
                    if(s2.endsWith("_SUPPORTED")) {
                        arrayList4.add(s2.substring(0, s2.length() - 10));
                    }
                    else {
                        arrayList3.add(s2);
                    }
                }
            }
            algt.c(arrayList4, arrayList0);
            algt.b(arrayList3, arrayList1);
        }
        byte[] arr_b1 = deviceMetadata0.c;
        if(arr_b1 != null) {
            try {
                ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)allv.a), arr_b1, 0, arr_b1.length, hftc.a);
                ProtoLiteMessage.P_makeImmutable(hftv0);
                arr_b = ((allv)hftv0).b.toByteArray();
                hfuo hfuo0 = ((allv)hftv0).d;
                algt.a((hfuo0 == null ? null : ggia.b(ggia.h(hfuo0, new aktz()))), arrayList2);
                return new SyncedCryptauthDevice(arr_b, s, s1, ((allv)hftv0).e, false, false, 0L, false, "unknown", false, false, arrayList0, arrayList1, arrayList2, null);
            }
            catch(hfur hfur0) {
                akwd.b.n("Invalid device metadata", hfur0, new Object[0]);
                return new SyncedCryptauthDevice(arr_b, s, s1, null, false, false, 0L, false, "unknown", false, false, arrayList0, arrayList1, arrayList2, null);
            }
        }
        return new SyncedCryptauthDevice(arr_b, s, s1, null, false, false, 0L, false, "unknown", false, false, arrayList0, arrayList1, arrayList2, null);
    }

    public static SyncedCryptauthDevice b(alhh alhh0, String s) {
        ArrayList arrayList0 = new ArrayList();
        ArrayList arrayList1 = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        byte[] arr_b = bbmu.f(alhh0.n());
        String s1 = alhh0.m();
        boolean z = alhh0.v();
        boolean z1 = alhh0.y();
        boolean z2 = alhh0.x();
        long v = alhh0.d();
        String s2 = alhh0.g();
        String s3 = alhh0.i();
        boolean z3 = alhh0.w();
        boolean z4 = alhh0.u();
        algt.a(alhh0.o(), arrayList2);
        if(alhh0.t()) {
            algt.c(ggia.h(alhh0.q(), (String s) -> gfrd.c.d(gfrd.e, s)), arrayList0);
        }
        if(alhh0.r()) {
            algt.b(ggia.h(alhh0.p(), (String s) -> gfrd.c.d(gfrd.e, s)), arrayList1);
        }
        return new SyncedCryptauthDevice(arr_b, s, s1, s2, z2, z1, v, z, s3, z3, z4, arrayList0, arrayList1, arrayList2, null);
    }

    // Detected as a lambda impl.
    public static String c(String s) {
        return gfrd.c.d(gfrd.e, s);
    }
}

