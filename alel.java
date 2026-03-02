import android.accounts.Account;
import android.content.Context;
import android.text.TextUtils;
import com.android.volley.VolleyError;
import com.google.android.gms.auth.proximity.gencode.server.api.DeviceClassifierEntity;
import com.google.android.gms.auth.proximity.gencode.server.api.GetMyDevicesRequestEntity;
import com.google.android.gms.auth.proximity.gencode.server.api.GetMyDevicesResponseEntity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public final class alel {
    public static final int a;
    private static final bboh b;
    private final Context c;
    private final akwh d;

    static {
        alel.b = alis.a("CryptauthDevicesSyncUpdater");
    }

    public alel(Context context0, akwh akwh0) {
        this.c = context0;
        this.d = akwh0;
    }

    public final void a(Account account0, int v) {
        alhh alhh1;
        int v1;
        Context context0 = this.c;
        try(alvp alvp0 = alvq.a(context0)) {
            aliu aliu0 = new aliu();
            if(account0 == null) {
                aliu0.m(1);
                return;
            }
            bbey bbey0 = new bbey(context0, hpyq.a.b().b(), "cryptauth/v1/", false, null, null, 0x6301);
            batl.s(context0);
            alhg alhg0 = new alhg(bbey0);
            byte[] arr_b = alfp.b(context0);
            if(arr_b == null) {
                aliu0.m(6);
                return;
            }
            try {
                String s = account0.name;
                HashSet hashSet0 = new HashSet();
                hashSet0.add(Integer.valueOf(2));
                hashSet0.add(Integer.valueOf(5));
                hashSet0.add(Integer.valueOf(6));
                alhe alhe0 = alaf.c(context0);
                hashSet0.add(Integer.valueOf(4));
                baqr baqr0 = alaf.b(s, context0);
                GetMyDevicesRequestEntity getMyDevicesRequestEntity0 = new GetMyDevicesRequestEntity(hashSet0, true, false, ((DeviceClassifierEntity)alhe0), v, 0);
                List list0 = ((GetMyDevicesResponseEntity)alhg0.a.r(baqr0, "deviceSync/getmydevices", getMyDevicesRequestEntity0, GetMyDevicesResponseEntity.class)).b;
                if(list0 == null) {
                    ((ggtj)alel.b.j()).x("Synced list is null.");
                    aliu0.m(8);
                    throw new alek();
                }
                v1 = 0;
                while(true) {
                label_36:
                    if(v1 >= list0.size()) {
                        v1 = -1;
                        goto label_53;
                    }
                    alhh alhh0 = (alhh)list0.get(v1);
                    if(alhh0.s()) {
                        try {
                            byte[] arr_b1 = bbmu.f(alhh0.n());
                        }
                        catch(IllegalArgumentException unused_ex) {
                            ((ggtj)alel.b.j()).B("Cannot decode public key: %s", alhh0.n());
                            ++v1;
                            continue;
                        }
                        if(Arrays.equals(arr_b, arr_b1)) {
                        label_53:
                            alhh1 = v1 == -1 ? null : ((alhh)list0.remove(v1));
                            if(alhh1 == null) {
                                ((ggtj)alel.b.j()).x("Synced list missing my device metadata.");
                                aliu0.m(7);
                                return;
                            }
                            if(!alvp0.g(account0, alhh1)) {
                                aliu0.m(5);
                                ((ggtj)alel.b.j()).B("Failed to store my metadata: %s", alhh1);
                                return;
                            }
                            Collections.sort(list0, new alei());
                            if(((long)list0.size()) > hpyw.c()) {
                                list0 = list0.subList(0, ((int)hpyw.c()));
                            }
                            if(!hpyz.j()) {
                                akws akws0 = akwr.a(this.c);
                                if(hpyz.j()) {
                                    ((ggtj)akws.a.h()).x("Updating previously enabled features with a SyncedCryptauthDevice converted from ExternalDeviceInfo");
                                    akws0.c(account0, akwd.b(alhh1, account0.name));
                                }
                                else {
                                    alvr alvr0 = akws0.b;
                                    gged_interceptors gged0 = gged_interceptors.i(alvr0.b(account0, new ArrayList()));
                                    ((ggtj)akws.a.h()).R("Updating previously enabled features (%s) and with enabled features synced from Cryptauth v1 (%s)", gged0, alhh1.p());
                                    alvr0.f(account0);
                                    if(alhh1.r()) {
                                        Iterator iterator0 = alhh1.p().iterator();
                                        while(true) {
                                            if(!iterator0.hasNext()) {
                                                akws0.a(account0, gged0);
                                                break;
                                            }
                                            Object object0 = iterator0.next();
                                            String s1 = (String)object0;
                                            try {
                                                gqus gqus0 = gqus.b(akwd.c(s1));
                                                alvr0.e(account0, gqus0);
                                                if(gged0.contains(gqus0)) {
                                                    continue;
                                                }
                                                akws0.b(account0, gqus0, true);
                                            }
                                            catch(IllegalArgumentException illegalArgumentException0) {
                                                a.e(akws.a.j(), "Failed to parse enabled feature (%s) to FeatureName", s1, illegalArgumentException0);
                                            }
                                        }
                                    }
                                    else {
                                        akws0.c.f(account0);
                                        int v2 = gged0.size();
                                        for(int v3 = 0; true; ++v3) {
                                            if(v3 >= v2) {
                                                break;
                                            }
                                            akws0.b(account0, ((gqus)gged0.get(v3)), false);
                                        }
                                    }
                                }
                            }
                            if(alvp0.f(account0, list0)) {
                                aliu0.m(0);
                            }
                            else {
                                aliu0.m(4);
                                ((ggtj)alel.b.j()).B("Failed to store devices: %s", TextUtils.join(", ", list0));
                            }
                            break;
                        }
                    }
                    ++v1;
                }
            }
            catch(acse | VolleyError exception0) {
                goto label_137;
            }
            alen.a(this.c, account0);
            return;
            try {
                ++v1;
                goto label_36;
            }
            catch(acse | VolleyError exception0) {
            label_137:
                a.ae(alel.b.j(), "Failure to fetch devices.", exception0);
                if((exception0 instanceof acse)) {
                    aliu0.m(2);
                }
                else {
                    aliu0.m(3);
                }
                throw new alek(exception0);
            }
        }
    }

    public final void b(Account account0, int v) {
        if(!hpyz.j()) {
            this.a(account0, v);
            return;
        }
        if(!hpyz.g() && account0 != null) {
            try(alvp alvp0 = alvq.a(this.c)) {
                if(!alvp0.e(account0)) {
                    this.a(account0, v);
                }
            }
        }
        try {
            this.d.a(this.c, account0, v);
        }
        catch(akwg akwg0) {
            a.ae(alel.b.j(), "Error syncing devices", akwg0);
        }
    }
}

