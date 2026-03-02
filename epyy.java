import android.content.Context;
import com.google.android.gms.auth.folsom.SharedKey;
import com.google.android.gms.common.Feature;
import com.google.android.gms.smartdevice.d2d.BootstrapAccount;
import com.google.android.gms.smartdevice.d2d.data.FolsomDataPayload;
import com.google.android.gms.smartdevice.d2d.data.FolsomSecurityDomainAndKeys;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public final class epyy implements Callable {
    public final epza a;
    public final ArrayList b;

    public epyy(epza epza0, ArrayList arrayList0) {
        this.a = epza0;
        this.b = arrayList0;
    }

    @Override
    public final Object call() {
        Context context0 = this.a.b;
        azts azts0 = epza.e(context0, "");
        Object object0 = new ArrayList();
        baun baun0 = epza.a;
        ArrayList arrayList0 = this.b;
        baun0.d("Got %s bootstrap accounts", new Object[]{arrayList0.size()});
        int v = arrayList0.size();
        int v1 = 0;
        while(v1 < v) {
            BootstrapAccount bootstrapAccount0 = (BootstrapAccount)arrayList0.get(v1);
            ArrayList arrayList1 = new ArrayList();
            String s = bootstrapAccount0.b;
            azzc azzc0 = new azzc();
            azzc0.a = new ajvj(azts0, s);
            azzc0.c = new Feature[]{amjz.b};
            azzc0.d = 0x62F;
            List list0 = (List)epza.f(azts0.iG(azzc0.a()), "domain listing");
            if(list0 != null) {
                baun0.d("Got %s security domains.", new Object[]{list0.size()});
                for(Object object1: list0) {
                    String s1 = (String)object1;
                    List list1 = (List)epza.f(epza.e(context0, s1).jx(bootstrapAccount0.b), "shared key listing for " + s1);
                    if(list1 == null || list1.isEmpty()) {
                    }
                    else if(list1.size() == 1) {
                        byte[] arr_b = ((SharedKey)list1.get(0)).b;
                        int v2 = 0;
                        while(v2 < arr_b.length) {
                            if(arr_b[v2] == 0) {
                                ++v2;
                                continue;
                            }
                            else {
                                goto label_33;
                            }
                            break;
                        }
                    }
                    else {
                    label_33:
                        arrayList1.add(new FolsomSecurityDomainAndKeys(s1, list1));
                    }
                }
                if(!arrayList1.isEmpty()) {
                    ((ArrayList)object0).add(new FolsomDataPayload(bootstrapAccount0.b, arrayList1));
                }
            }
            ++v1;
        }
        return object0;
    }
}

