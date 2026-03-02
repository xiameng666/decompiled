import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.RemoteException;
import j..util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public final class blst implements jqv {
    public final blsy a;

    public blst(blsy blsy0) {
        this.a = blsy0;
    }

    @Override  // jqv
    public final Object a(jqt jqt0) {
        gmcd gmcd1;
        Account[] arr_account;
        gmcd gmcd0;
        gfsx gfsx0;
        String s2;
        Objects.requireNonNull(jqt0);
        blsu blsu0 = new blsu(jqt0);
        blsy blsy0 = this.a;
        Intent intent0 = blsy0.c;
        String s = intent0.getStringExtra("version");
        if(gfta.c(s)) {
            blsy0.b(blhc.ae);
            blsu0.a(gfqx.a);
            return "Execute caBLE v2 GCM message validate stage.";
        }
        if(Integer.parseInt(s) > 1) {
            blsy0.b(blhc.af);
            blsu0.a(gfqx.a);
            return "Execute caBLE v2 GCM message validate stage.";
        }
        blsy0.b(blhc.ad);
        if(gfta.c(intent0.getStringExtra("chrome_key_material"))) {
            blsy0.b(blhc.ah);
            blsu0.a(gfqx.a);
            return "Execute caBLE v2 GCM message validate stage.";
        }
        blsy0.b(blhc.ag);
        Context context0 = blsy0.a;
        String s1 = hstd.a.b().b();
        Iterator iterator0 = gfud.e(',').l(hstd.a.b().a()).iterator();
    alab2:
        while(true) {
        alab3:
            while(true) {
            alab1:
                while(true) {
                label_20:
                    if(!iterator0.hasNext()) {
                        goto label_42;
                    }
                    Object object0 = iterator0.next();
                    s2 = (String)object0;
                    try {
                        if(!s1.isEmpty()) {
                            String s3 = context0.getPackageManager().getPackageInfo(s2, 0).versionName;
                            List list0 = blsi.b.n(s3);
                            List list1 = blsi.b.n(s1);
                            if(list0.size() != list1.size()) {
                                break;
                            }
                            int v1 = 0;
                            while(v1 < list0.size() - 1) {
                                int v2 = Integer.parseInt(((String)list0.get(v1)));
                                int v3 = Integer.parseInt(((String)list1.get(v1)));
                                if(v2 == v3) {
                                    ++v1;
                                    continue;
                                }
                                if(v2 > v3) {
                                    break;
                                }
                                break alab1;
                            }
                        }
                        gfsx0 = gfsx.m(s2);
                        break alab2;
                    }
                    catch(PackageManager.NameNotFoundException | NumberFormatException exception0) {
                    }
                    break alab3;
                }
            }
            a.e(blsi.a.h(), "Unable to check %s version info.", s2, exception0);
            goto label_20;
        label_42:
            gfsx0 = gfqx.a;
            break;
        }
        if(!gfsx0.i()) {
            blsy0.b(blhc.ai);
            blsu0.a(gfqx.a);
            return "Execute caBLE v2 GCM message validate stage.";
        }
        String s4 = intent0.getStringExtra("client_eid");
        if(gfta.c(s4)) {
            gmcd0 = gmbu.i(gfqx.a);
        }
        else {
            byte[] arr_b = ghjc.d.q(s4);
            blsm blsm0 = blsy0.b;
            ((ggtj)blsm.a.h()).B("Attempting to resolve clientEid: %s", Arrays.toString(arr_b));
            try {
                arr_account = new adgg(blsm0.b).e(blsm0.b);
            }
            catch(RemoteException | azqj | azqi exception1) {
                a.ae(blsm.a.j(), "Error listing Google accounts on device.", exception1);
                gmcd1 = gmbu.i(gfqx.a);
                gmcd0 = glzd.f(gmcd1, new blsv(), gmap.a);
                gmbu.t(gmcd0, new blsw(blsy0, blsu0, gfsx0), gmap.a);
                return "Execute caBLE v2 GCM message validate stage.";
            }
            if(arr_account != null && arr_account.length != 0) {
                ArrayList arrayList0 = new ArrayList();
                for(int v = 0; v < arr_account.length; ++v) {
                    Account account0 = arr_account[v];
                    blsn blsn0 = blsm0.c;
                    gmcd gmcd2 = blsn0.a(arr_b, account0, blzo.b, "fido:android_software_key");
                    if(gmcd2 != null) {
                        arrayList0.add(gmcd2);
                    }
                    if(hstp.e()) {
                        gmcd gmcd3 = blsn0.a(arr_b, account0, blzo.c, "fido:android_strongbox_key");
                        if(gmcd3 != null) {
                            arrayList0.add(gmcd3);
                        }
                    }
                    if(hstp.c()) {
                        ((ggtj)blsm.a.h()).B("Checking corp key for account: %s", account0.name);
                        gmcd gmcd4 = blsn0.a(arr_b, account0, blzo.c, "fido:android_corp_strongbox_key");
                        if(gmcd4 != null) {
                            arrayList0.add(gmcd4);
                        }
                    }
                }
                gmcd1 = gmbu.a(arrayList0).a(new blsl(arrayList0, arr_b), gmap.a);
            }
            else {
                ((ggtj)blsm.a.h()).x("No accounts signed in.");
                gmcd1 = gmbu.i(gfqx.a);
            }
            gmcd0 = glzd.f(gmcd1, new blsv(), gmap.a);
        }
        gmbu.t(gmcd0, new blsw(blsy0, blsu0, gfsx0), gmap.a);
        return "Execute caBLE v2 GCM message validate stage.";
    }
}

