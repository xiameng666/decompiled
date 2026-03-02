import android.content.Context;
import android.util.DisplayMetrics;
import android.view.ContextThemeWrapper;
import j..util.DesugarCollections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map.Entry;

public final class gbdr {
    public final bzt a;
    public final gavi b;
    public final bzt c;
    public final ArrayList d;
    public final bxf e;
    private final ArrayList f;
    private final float g;
    private final float h;
    private final Context i;
    private ContextThemeWrapper j;

    public gbdr(List list0, Context context0) {
        DisplayMetrics displayMetrics0 = context0.getResources().getDisplayMetrics();
        float f = ((float)displayMetrics0.widthPixels) / displayMetrics0.density;
        gaxl.a();
        DisplayMetrics displayMetrics1 = context0.getResources().getDisplayMetrics();
        float f1 = ((float)displayMetrics1.heightPixels) / displayMetrics1.density;
        super();
        bzt bzt0 = new bzt();
        this.a = bzt0;
        this.b = new gavi(bzt0);
        this.c = new bzt();
        this.d = new ArrayList();
        this.f = new ArrayList(list0);
        this.g = f;
        this.h = f1;
        this.e = new bxf(1);
        this.i = context0;
    }

    final Context a() {
        if(this.j == null) {
            this.j = new ContextThemeWrapper(this.i, 0x7F160E31);  // style:ThemeOverlay.Material3.DynamicColors.DayNight
        }
        return this.j;
    }

    final gbdp b(int v) {
        bzt bzt0 = this.c;
        if(bzt0.i(v)) {
            gbdp gbdp0 = (gbdp)bzu.a(bzt0, v);
            gftb.check(gbdp0);
            return gbdp0;
        }
        bzt bzt1 = this.a;
        if(!bzt1.i(v)) {
            throw new IllegalArgumentException(String.format(Locale.US, "Unknown property class id: %d", v));
        }
        hdrw hdrw0 = (hdrw)bzu.a(bzt1, v);
        gftb.check(hdrw0);
        gbdp gbdp1 = gbdp.a(this, hdrw0);
        bzt0.h(v, gbdp1);
        return gbdp1;
    }

    public final void c(gbdp gbdp0) {
        gbdp0.e();
        this.d.remove(gbdp0);
    }

    public final void d(hdus hdus0) {
        gaxl.a();
        Iterator iterator0 = DesugarCollections.unmodifiableMap(hdus0.c).entrySet().iterator();
        while(true) {
            boolean z = true;
            if(!iterator0.hasNext()) {
                break;
            }
            Object object0 = iterator0.next();
            Integer integer0 = (Integer)((Map.Entry)object0).getKey();
            hduo hduo0 = (hduo)((Map.Entry)object0).getValue();
            boolean z1 = (hduo0.b & 1) != 0 && this.g < (hduo0.c == null ? hdsn.a : hduo0.c).d;
            boolean z2 = (hduo0.b & 2) != 0 && this.g > (hduo0.d == null ? hdsn.a : hduo0.d).d;
            gaxl.a();
            boolean z3 = (hduo0.b & 4) != 0 && this.h < (hduo0.e == null ? hdsn.a : hduo0.e).d;
            if((hduo0.b & 8) == 0 || this.h <= (hduo0.f == null ? hdsn.a : hduo0.f).d) {
                z = false;
            }
            if(!z1 && !z2 && !z3 && !z) {
                this.e.add(integer0);
            }
            else {
                this.e.remove(integer0);
            }
        }
        boolean z4 = false;
        for(Object object1: DesugarCollections.unmodifiableMap(hdus0.b).entrySet()) {
            int v1 = (int)(((Integer)((Map.Entry)object1).getKey()));
            hdrw hdrw0 = (hdrw)((Map.Entry)object1).getValue();
            this.a.h(v1, hdrw0);
            bzt bzt0 = this.c;
            gbdp gbdp0 = (gbdp)bzu.a(bzt0, v1);
            if(gbdp0 != null) {
                z4 = z4 || gbdp0.d != null && !gbdp0.d.isEmpty();
                gbdp0.e();
                bzu.b(bzt0, v1);
            }
        }
        if(z4) {
            ArrayList arrayList0 = this.d;
            int v2 = arrayList0.size();
            for(int v3 = 0; v3 < v2; ++v3) {
                ((gbdp)arrayList0.get(v3)).f();
            }
            bzt bzt1 = this.c;
            int v4 = bzt1.c();
            ArrayList arrayList1 = new ArrayList(v4);
            for(int v5 = 0; v5 < v4; ++v5) {
                arrayList1.add(((gbdp)bzt1.e(v5)));
            }
            int v6 = arrayList1.size();
            for(int v = 0; v < v6; ++v) {
                ((gbdp)arrayList1.get(v)).f();
            }
        }
    }

    public final boolean e(List list0) {
        for(Object object0: list0) {
            hdpp hdpp0 = (hdpp)object0;
            if((hdpo.b(hdpp0.c) == null ? hdpo.a : hdpo.b(hdpp0.c)) == hdpo.e) {
                if(this.e.contains(Integer.valueOf(hdpp0.d))) {
                    continue;
                }
                return false;
            }
            ArrayList arrayList0 = this.f;
            int v = arrayList0.size();
            int v1 = 0;
        label_10:
            if(v1 < v) {
                hdpp hdpp1 = (hdpp)arrayList0.get(v1);
                if((hdpo.b(hdpp0.c) == null ? hdpo.a : hdpo.b(hdpp0.c)) == (hdpo.b(hdpp1.c) == null ? hdpo.a : hdpo.b(hdpp1.c))) {
                    continue;
                }
                ++v1;
                goto label_10;
            }
            return false;
        }
        return true;
    }
}

