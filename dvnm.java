import android.database.Cursor;
import android.net.Uri;
import android.webkit.URLUtil;
import com.google.android.gms.pay.PassFilter;
import com.google.android.libraries.commerce.hce.common.SmartTapStatusWord;
import com.google.android.libraries.tapandpay.pay.pass.valuable.model.Valuable;
import java.security.interfaces.ECPublicKey;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class dvnm {
    public final dvnq a;
    private final dvnn b;
    private final dvnt c;
    private final dvno d;

    public dvnm(dvnn dvnn0, dvnq dvnq0, dvnt dvnt0, dvno dvno0) {
        this.b = dvnn0;
        this.a = dvnq0;
        this.c = dvnt0;
        this.d = dvno0;
    }

    public final ECPublicKey a(long v, int v1) {
        gfsx gfsx0;
        Object object0;
        dvnn dvnn0;
        try {
            dvnn0 = this.b;
            boolean z = true;
            try(Cursor cursor0 = dmhk.d(dvnn0.c.b.d).c().query("SmartTapCollector", new String[]{"auth_public_key", "customer_id_access_permitted"}, dvib.c, new String[]{dvnn0.c.b.e, dvnn0.c.b.f, Long.toString(v), Integer.toString(v1)}, null, null, null)) {
                if(cursor0.moveToNext()) {
                    if(cursor0.getInt(cursor0.getColumnIndexOrThrow("customer_id_access_permitted")) != 1) {
                        z = false;
                    }
                    ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gvau.a).v_newBuilder();
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ProtoLiteMessage hftv0 = hftp0.b_message;
                    ((gvau)hftv0).b = v;
                    if(!hftv0.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ProtoLiteMessage hftv1 = hftp0.b_message;
                    ((gvau)hftv1).c = v1;
                    if(!hftv1.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ((gvau)hftp0.b_message).e = z;
                    byte[] arr_b = cursor0.getBlob(cursor0.getColumnIndexOrThrow("auth_public_key"));
                    if(arr_b != null) {
                        ByteString hfsf0 = ByteString.copyFrom(arr_b);
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        ((gvau)hftp0.b_message).d = hfsf0;
                    }
                    object0 = (gvau)hftp0.N_build();
                }
                else {
                    ((ggtj)dvib.a.h()).J("No matching smart tap collector found. Collector ID: %s. Key version: %s.", v, v1);
                    object0 = null;
                }
                gfsx0 = gfsx.l(object0);
            }
        }
        catch(dmhl dmhl0) {
            ((ggtj)((ggtj)dvic.a.i()).s(dmhl0)).J("Failed to get collector for ID: %s. Key version: %s.", v, v1);
            gfsx0 = gfqx.a;
        }
        if(!gfsx0.i()) {
            ((ggtj)dvnn.a.i()).J("No smart tap collector found. Collector ID: %s. Key ID: %s", v, v1);
            return null;
        }
        byte[] arr_b1 = ((gvau)gfsx0.d()).d.toByteArray();
        if(arr_b1.length == 0) {
            ((ggtj)dvnn.a.i()).J("Found smart tap collector with no public authentication key. Collector ID: %s. Key ID: %s", v, v1);
            return null;
        }
        try {
            return dvnn0.d.a(arr_b1);
        }
        catch(fgzb fgzb0) {
            ((ggtj)((ggtj)dvnn.a.i()).s(fgzb0)).J("Invalid public authentication key found. Collector ID: %s. Key ID: %s", v, v1);
            dvfu dvfu0 = dvnn0.b;
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hapr.a).v_newBuilder();
            ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)haoy.a).v_newBuilder();
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            ProtoLiteMessage hftv2 = hftp2.b_message;
            ((haoy)hftv2).f = v;
            if(!hftv2.isImmutable()) {
                hftp2.ensureMutable();
            }
            ProtoLiteMessage hftv3 = hftp2.b_message;
            ((haoy)hftv3).k = v1;
            haoz haoz0 = haoz.n;
            if(!hftv3.isImmutable()) {
                hftp2.ensureMutable();
            }
            haoy haoy0 = (haoy)hftp2.b_message;
            haoy0.e = haoz0.a();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            hapr hapr0 = (hapr)hftp1.b_message;
            haoy haoy1 = (haoy)hftp2.N_build();
            haoy1.getClass();
            hapr0.m = haoy1;
            hapr0.b |= 16;
            hapr hapr1 = (hapr)hftp1.N_build();
            dvfu0.a.b(hapr1);
            return null;
        }
    }

    public final void b(fgwt fgwt0, Set set0) {
        dvnr dvnr0 = new dvnr(this.c, fgwt0, set0);
        gmbu.t(this.c.c.e(dvnr0), new dvns(this.c), this.c.c);
    }

    public final fgzl c(List list0, List list1, gfsx gfsx0) {
        gfsx gfsx2;
        gfsx gfsx1;
        dvno dvno0;
        fgzl fgzl0 = fgzl.b;
        Iterator iterator0 = list0.iterator();
        int v = 0;
        while(true) {
            dvno0 = this.d;
            if(!iterator0.hasNext()) {
                break;
            }
            Object object0 = iterator0.next();
            ++v;
            byte[] arr_b = ((fgxl)object0).b;
            if(arr_b == null) {
                ((ggtj)dvno.a.j()).x("Skipping service status with no service ID.");
            }
            else {
                try {
                    gfsx1 = gfsx.l(dvno0.d.b.a(arr_b));
                }
                catch(dmhl dmhl0) {
                    a.e(dvif.a.i(), "Failed to get smart tap event for service ID: %s", fgzu.d(arr_b), dmhl0);
                    gfsx1 = gfqx.a;
                }
                if(gfsx1.i()) {
                    String s = ((gvav)gfsx1.d()).c;
                    try {
                        PassFilter passFilter0 = new PassFilter();
                        passFilter0.c = dsih.a(new String[]{s});
                        gged_interceptors gged0 = (gged_interceptors)dvno0.c.a(passFilter0).first;
                        gfsx2 = gged0.size() == 1 ? gfsx.m(((Valuable)gged0.get(0))) : gfqx.a;
                    }
                    catch(eaqz | dmhl | earn exception0) {
                        ((ggtj)((ggtj)dvno.a.i()).s(exception0)).R("Failed to fetch valuable for valuable ID %s from service ID %s.", s, fgzu.d(arr_b));
                        continue;
                    }
                    if(gfsx2.i()) {
                        gfsx2.d();
                    }
                    else {
                        fgzu.d(arr_b);
                    }
                }
                else {
                    ((ggtj)dvno.a.j()).B("Did not find a matching service object for ID %s.", fgzu.d(arr_b));
                }
            }
        }
        int v1 = 0;
        for(Object object1: list1) {
            fgwz fgwz0 = (fgwz)object1;
            ++v1;
            Uri uri0 = fgwz0.c;
            String s1 = uri0.toString();
            if(!URLUtil.isValidUrl(s1)) {
                ((ggtj)dvno.a.j()).B("Skipping new service with invalid URL: %s", s1);
                fgzl0 = fgzl.z;
            }
            else if(!URLUtil.isHttpsUrl(s1)) {
                ((ggtj)dvno.a.j()).B("Skipping new service with non-HTTPS URL: %s", s1);
                fgzl0 = fgzl.z;
            }
            else if(fgwz0.b == fgwy.f) {
                if(hwlh.a.b().t()) {
                    if("pay.google.com".equals(uri0.getHost())) {
                        List list2 = uri0.getPathSegments();
                        if(list2.size() > 3 && "gp".equals(list2.get(0)) && "v".equals(list2.get(1))) {
                            if(list2.size() == 4 && "passsignup".equals(((String)list2.get(2)))) {
                                String s2 = (String)list2.get(3);
                            }
                            ((ggtj)dvno.a.j()).B("Found invalid sign up URL: %s.", uri0);
                        }
                        else {
                            ((ggtj)dvno.a.j()).B("Sign up URL does not contain a supported path. URL: %s.", uri0);
                        }
                    }
                    else {
                        ((ggtj)dvno.a.j()).X("Sign up URL host not equal to %s. Host: %s. Url: %s.", "pay.google.com", uri0.getHost(), uri0);
                    }
                    ((ggtj)dvno.a.j()).B("Skipping new service with unsupported URL: %s", s1);
                    fgzl0 = fgzl.z;
                }
                else {
                    ((ggtj)dvno.a.j()).B("Skipping new sign up service as feature flag is disabled. URL: %s", s1);
                }
            }
        }
        dvfu dvfu0 = dvno0.b;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hapr.a).v_newBuilder();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)haoy.a).v_newBuilder();
        long v2 = (long)(((Long)gfsx0.f(Long.valueOf(0L))));
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp1.b_message;
        ((haoy)hftv0).f = v2;
        if(!hftv0.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp1.b_message;
        ((haoy)hftv1).n = (long)v;
        if(!hftv1.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((haoy)hftp1.b_message).o = (long)v1;
        int v3 = new SmartTapStatusWord(fgzl0).a;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((haoy)hftp1.b_message).m = v3;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hapr hapr0 = (hapr)hftp0.b_message;
        haoy haoy0 = (haoy)hftp1.N_build();
        haoy0.getClass();
        hapr0.m = haoy0;
        hapr0.b |= 16;
        hapr hapr1 = (hapr)hftp0.N_build();
        dvfu0.a.b(hapr1);
        return fgzl0;
    }
}

