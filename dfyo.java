import android.net.Uri;
import com.google.android.gms.nearby.sharing.ShareTarget;
import com.google.android.gms.nearby.sharing.provider.connections.NearbySharingProvider.15;
import java.util.Map.Entry;
import java.util.Map;

public final class dfyo implements Runnable {
    public final NearbySharingProvider.15 a;

    public dfyo(NearbySharingProvider.15 nearbySharingProvider$150) {
        this.a = nearbySharingProvider$150;
    }

    @Override
    public final void run() {
        cunf cunf0 = dcvz.a.b();
        dfzz dfzz0 = this.a.a;
        Map map0 = dfzz0.a;
        cunf0.h("Reparse endpoints size: %s", Integer.valueOf(((bzs)map0).d_num));
        gged_interceptors gged0 = gged_interceptors.i(map0.keySet());
        int v = gged0.size();
        for(int v2 = 0; v2 < v; ++v2) {
            String s = (String)gged0.get(v2);
            byte[] arr_b = (byte[])map0.remove(s);
            if(arr_b != null) {
                dfzz0.aJ(s, arr_b);
            }
        }
        Map map1 = dfzz0.X;
        gged_interceptors gged1 = gged_interceptors.i(map1.entrySet());
        int v3 = gged1.size();
        for(int v1 = 0; v1 < v3; ++v1) {
            Map.Entry map$Entry0 = (Map.Entry)gged1.get(v1);
            String s1 = (String)map$Entry0.getKey();
            dfzg dfzg0 = (dfzg)map$Entry0.getValue();
            dgap dgap0 = dfzz0.t.d(dfzg0.b.d, dfzg0.b.c);
            if(dgap0 != null) {
                Uri uri0 = dfzz0.R(dgap0);
                String s2 = dfzz.an(dfzg0.b, dgap0);
                batl.s(s2);
                Map map2 = dfzz0.e;
                dfzj dfzj0 = (dfzj)map2.remove(dfzg0.a);
                if(dfzj0 != null) {
                    dcls dcls0 = dfzg0.a.b();
                    dcls0.b = s2;
                    dcls0.c = uri0;
                    dcls0.b();
                    dcls0.s = dgap0.c;
                    ShareTarget shareTarget0 = dcls0.a();
                    dfzj0.c = dgap0;
                    map2.put(shareTarget0, dfzj0);
                    dclv dclv0 = dfzz0.n;
                    if(dclv0 != null) {
                        dclv0.d(shareTarget0);
                    }
                }
                map1.remove(s1);
            }
        }
    }
}

