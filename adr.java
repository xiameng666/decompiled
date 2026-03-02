import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public final class adr extends adc {
    @Override  // adc
    public final Intent a(Context context0, Object object0) {
        String[] arr_s = (String[])object0;
        ibuq.f(arr_s, "input");
        return adq.a(arr_s);
    }

    @Override  // adc
    public final Object b(int v, Intent intent0) {
        if(v != -1) {
            return ibpt.a;
        }
        if(intent0 == null) {
            return ibpt.a;
        }
        String[] arr_s = intent0.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
        int[] arr_v = intent0.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
        if(arr_v != null && arr_s != null) {
            ArrayList arrayList0 = new ArrayList(arr_v.length);
            for(int v1 = 0; v1 < arr_v.length; ++v1) {
                arrayList0.add(Boolean.valueOf(arr_v[v1] == 0));
            }
            return ibpz.p(ibpo.au(ibpg.H(arr_s), arrayList0));
        }
        return ibpt.a;
    }

    @Override  // adc
    public final adb c(Context context0, Object object0) {
        ibuq.f(((String[])object0), "input");
        if(((String[])object0).length == 0) {
            return new adb(ibpt.a);
        }
        int v1 = 0;
        while(v1 < ((String[])object0).length) {
            if(jwe.a(context0, ((String[])object0)[v1]) == 0) {
                ++v1;
                continue;
            }
            return null;
        }
        LinkedHashMap linkedHashMap0 = new LinkedHashMap(ibwt.g(ibpz.a(((String[])object0).length), 16));
        for(int v = 0; v < ((String[])object0).length; ++v) {
            ibns ibns0 = new ibns(((String[])object0)[v], Boolean.valueOf(true));
            linkedHashMap0.put(ibns0.a, ibns0.b);
        }
        return new adb(linkedHashMap0);
    }
}

