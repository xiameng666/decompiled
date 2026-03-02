import android.content.Context;
import com.google.android.gms.smartdevice.d2d.D2DDevice;
import com.google.android.setupdesign.items.ItemGroup;
import j..util.Objects;
import java.util.List;
import java.util.Map;

final class erkq implements eqcr {
    final erky a;

    public erkq(erky erky0) {
        Objects.requireNonNull(erky0);
        this.a = erky0;
        super();
    }

    @Override  // eqcr
    public final void a(D2DDevice d2DDevice0) {
        baun baun0 = erky.a;
        baun0.d("onDeviceFound.", new Object[0]);
        erky erky0 = this.a;
        Map map0 = erky0.aj;
        if(!map0.containsKey(d2DDevice0.d)) {
            Context context0 = erky0.getContext();
            if(context0 == null) {
                baun0.m("no context", new Object[0]);
                return;
            }
            erkx erkx0 = new erkx(context0, d2DDevice0);
            erky0.ai.d(erkx0);
            map0.put(d2DDevice0.d, erkx0);
            erky0.z();
            baun0.d("onDeviceFound, add %s to the list.", new Object[]{d2DDevice0.d});
        }
    }

    @Override  // eqcr
    public final void b(D2DDevice d2DDevice0) {
        erky erky0 = this.a;
        Map map0 = erky0.aj;
        erkx erkx0 = (erkx)map0.get(d2DDevice0.d);
        if(erkx0 != null) {
            map0.remove(d2DDevice0.d);
            ItemGroup itemGroup0 = erky0.ai;
            List list0 = itemGroup0.a;
            int v = ItemGroup.h(list0, erkx0);
            int v1 = itemGroup0.g(v);
            itemGroup0.b = true;
            if(v != -1) {
                int v2 = erkx0.hd();
                list0.remove(v);
                erkx0.x(itemGroup0);
                if(v2 > 0) {
                    itemGroup0.v(v1, 1);
                }
            }
            erky.a.d("onDeviceLost, remove %s from the list.", new Object[]{d2DDevice0.d});
            if(erky0.ai.hd() == 0) {
                erky0.B();
            }
        }
    }

    @Override  // eqcr
    public final void c(int v) {
    }

    @Override  // eqcr
    public final void d() {
    }
}

