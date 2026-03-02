import android.os.UserHandle;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.GetServiceRequest;
import com.google.android.gms.libs.identity.ClientIdentity;
import java.util.List;

public final class cjar {
    public static final ClientIdentity a(String s, int v, int v1, String s1, List list0, cjba cjba0) {
        ibuq.f(s, "packageName");
        if(cjba0 != null) {
            UserHandle userHandle0 = jzh.a(v);
            ibuq.e(userHandle0, "getUserHandleForUid(...)");
            return new ClientIdentity(v, v1, s, s1, null, list0, null, cjba0.a(userHandle0));
        }
        return new ClientIdentity(v, v1, s, s1, null, list0, null, null);
    }

    public static ClientIdentity b(brvs brvs0, GetServiceRequest getServiceRequest0, int v, int v1) {
        ibuq.f(brvs0, "clientType");
        ibuq.f(getServiceRequest0, "request");
        String s = getServiceRequest0.f;
        ibuq.e(s, "getCallingPackage(...)");
        String s1 = getServiceRequest0.p;
        Integer integer0 = (int)getServiceRequest0.e;
        Feature[] arr_feature = getServiceRequest0.l;
        ibuq.e(arr_feature, "getClientApiFeatures(...)");
        gged_interceptors gged0 = ggdx.b(arr_feature);
        switch(brvs0.ordinal()) {
            case 1: {
                return new ClientIdentity(v, v1, s, s1, integer0, gged0, cjav.a, null);
            }
            case 2: 
            case 4: 
            case 5: {
                return new ClientIdentity(v, v1, s, s1, integer0, gged0, cjav.b, null);
            }
            case 0: 
            case 3: 
            case 6: {
                return new ClientIdentity(v, v1, s, s1, integer0, gged0, cjav.c, null);
            }
            default: {
                throw new ibnq();
            }
        }
    }

    public static ClientIdentity c(String s, int v, int v1, String s1, List list0, int v2) {
        if((v2 & 4) != 0) {
            v1 = -1;
        }
        String s2 = (v2 & 8) == 0 ? s1 : null;
        return (v2 & 0x20) == 0 ? cjar.a(s, v, v1, s2, list0, null) : cjar.a(s, v, v1, s2, null, null);
    }
}

