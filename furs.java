import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class furs {
    public static final iccd a;
    public static final icga b;
    public final List c;
    private final Matrix d;
    private final RectF e;
    private final Rect f;
    private final ibnn g;

    static {
        furs.a = new icds(new ThreadPoolExecutor(0, 0x7FFFFFFF, 2L, TimeUnit.SECONDS, new SynchronousQueue(), new furl())).g(Runtime.getRuntime().availableProcessors());
        furs.b = new icfz(new Handler(Looper.getMainLooper()), null);
    }

    public furs() {
        this(ibps.a);
    }

    public furs(List list0) {
        this.c = list0;
        this.d = new Matrix();
        this.e = new RectF();
        this.f = new Rect();
        furi furi0 = new furi();
        this.g = ibno.a(ibnp.c, furi0);
    }

    public final furm a(View view0, Map map0) {
        ViewGroup viewGroup0 = (view0 instanceof ViewGroup) ? ((ViewGroup)view0) : null;
        int v = 1;
        if(viewGroup0 != null) {
            int v1 = 1;
            Iterator iterator0 = new kfj(viewGroup0).a();
            while(iterator0.hasNext()) {
                Object object0 = iterator0.next();
                v1 = ibwt.g(v1, this.a(((View)object0), map0).a + 1);
            }
            v = v1;
        }
        furm furm0 = new furm(v);
        map0.put(view0, furm0);
        return furm0;
    }

    public final furw b(View view0, int v, int v1, Map map0) {
        furv furv0 = new furv();
        furv0.e("hierarchy_depth", v);
        furv0.e("index", v1);
        furm furm0 = (furm)map0.remove(view0);
        if(furm0 != null) {
            furv0.e("hierarchy_height", furm0.a);
        }
        furv0.b("class", view0.getClass().getName());
        furv0.b("package", "com.google.android.gms");
        furv0.e("hashcode", view0.hashCode());
        String s = fusc.a(view0.getResources(), view0.getId());
        if(s != null) {
            furv0.b("resource_id", s);
        }
        this.d.reset();
        view0.transformMatrixToGlobal(this.d);
        float f = (float)view0.getWidth();
        float f1 = (float)view0.getHeight();
        this.e.set(0.0f, 0.0f, f, f1);
        this.d.mapRect(this.e);
        int v2 = ibvr.c(this.e.left);
        int v3 = ibvr.c(this.e.top);
        int v4 = ibvr.c(this.e.right);
        int v5 = ibvr.c(this.e.bottom);
        this.f.set(v2, v3, v4, v5);
        String s1 = this.f.toShortString();
        ibuq.e(s1, "toShortString(...)");
        furv0.b("bounds", s1);
        List list0 = this.c;
        for(Object object0: list0) {
            ((furt)object0).a.a(furv0, view0);
        }
        if(ibuq.m(view0.getClass().getName(), "androidx.compose.ui.platform.ComposeView")) {
            if(!list0.isEmpty()) {
                for(Object object1: list0) {
                    if(!ibuq.m(((furt)object1).getClass().getName(), "com.google.android.libraries.view.hierarchysnapshotter.compose.ComposeExtension")) {
                        continue;
                    }
                    goto label_45;
                }
            }
            furv furv1 = new furv();
            furv1.b("class", "\uD83D\uDE80 \uD83D\uDE80 \uD83D\uDE80 See go/hsv-compose \uD83D\uDE80 \uD83D\uDE80 \uD83D\uDE80");
            furv1.b("bounds", s1);
            furv1.b("description", "HSV has support for Compose, but an extension needs to be installed to use it. See go/hsv-compose for more info.");
            furv1.b("go link", "go/hsv-compose");
            furv0.g(furv1.a());
        }
    label_45:
        if((view0 instanceof ViewGroup)) {
            Iterator iterator2 = new kfj(((ViewGroup)view0)).a();
            for(int v6 = 0; iterator2.hasNext(); ++v6) {
                Object object2 = iterator2.next();
                if(v6 < 0) {
                    ibpo.m();
                }
                furv0.g(this.b(((View)object2), v + 1, v6, map0));
            }
            ibts ibts0 = (ibts)this.g.a();
            ViewGroupOverlay viewGroupOverlay0 = ((ViewGroup)view0).getOverlay();
            ibuq.e(viewGroupOverlay0, "getOverlay(...)");
            ViewGroup viewGroup0 = (ViewGroup)ibts0.a(viewGroupOverlay0);
            if(viewGroup0 != null && viewGroup0.getChildCount() != 0) {
                furv0.g(this.b(viewGroup0, v + 1, -1, map0));
            }
        }
        return furv0.a();
    }

    public final Object c(View view0, OutputStream outputStream0, ibrt ibrt0, ibrl ibrl0) {
        ibvc ibvc15;
        ibvc ibvc14;
        ibvc ibvc13;
        ibvc ibvc12;
        long v8;
        ibvc ibvc10;
        Map map0;
        ibvc ibvc9;
        ibvc ibvc8;
        long v5;
        ibvd ibvd1;
        Object object1;
        long v4;
        View view1;
        ibvc ibvc5;
        ibvc ibvc4;
        ibvc ibvc3;
        ibrt ibrt1;
        OutputStream outputStream1;
        long v2;
        long v1;
        ibvc ibvc2;
        furn furn0;
        if((ibrl0 instanceof furn)) {
            furn0 = (furn)ibrl0;
            int v = furn0.j;
            if((v & 0x80000000) == 0) {
                furn0 = new furn(this, ibrl0);
            }
            else {
                furn0.j = v - 0x80000000;
            }
        }
        else {
            furn0 = new furn(this, ibrl0);
        }
        Object object0 = furn0.h;
        ibrx ibrx0 = ibrx.a;
        switch(furn0.j) {
            case 0: {
                ibnx.b(object0);
                ibvc ibvc0 = new ibvc();
                ibvc ibvc1 = new ibvc();
                ibvc2 = new ibvc();
                v1 = System.nanoTime();
                v2 = System.nanoTime();
                furp furp0 = new furp(this, null);
                furn0.a = view0;
                outputStream1 = outputStream0;
                furn0.b = outputStream1;
                ibrt1 = ibrt0;
                furn0.c = ibrt1;
                furn0.k = ibvc0;
                furn0.d = ibvc1;
                furn0.l = ibvc2;
                furn0.e = ibvc0;
                furn0.f = v1;
                furn0.g = v2;
                furn0.j = 1;
                if(icbd.a(furs.a, furp0, furn0) != ibrx0) {
                    ibvc3 = ibvc1;
                    ibvc4 = ibvc0;
                    ibvc5 = ibvc4;
                    view1 = view0;
                    goto label_55;
                }
                return ibrx0;
            }
            case 1: {
                long v3 = furn0.g;
                v1 = furn0.f;
                ibvc ibvc6 = (ibvc)furn0.e;
                ibvc2 = furn0.l;
                ibvc3 = (ibvc)furn0.d;
                ibvc ibvc7 = furn0.k;
                ibrt ibrt2 = (ibrt)furn0.c;
                OutputStream outputStream2 = (OutputStream)furn0.b;
                View view2 = (View)furn0.a;
                ibnx.b(object0);
                ibvc4 = ibvc6;
                ibrt1 = ibrt2;
                outputStream1 = outputStream2;
                view1 = view2;
                v2 = v3;
                ibvc5 = ibvc7;
            label_55:
                ibvc4.a = System.nanoTime() - v2;
                LinkedHashMap linkedHashMap0 = new LinkedHashMap();
                ibvd ibvd0 = new ibvd();
                v4 = System.nanoTime();
                furq furq0 = new furq(this, linkedHashMap0, view1, ibvd0, null);
                furn0.a = outputStream1;
                furn0.b = ibvc5;
                furn0.c = ibvc3;
                furn0.k = ibvc2;
                furn0.d = linkedHashMap0;
                furn0.l = ibvc3;
                furn0.e = ibvd0;
                furn0.f = v1;
                furn0.g = v4;
                furn0.j = 2;
                object1 = ibrx0;
                if(icbd.a(ibrt1, furq0, furn0) != object1) {
                    ibvd1 = ibvd0;
                    v5 = v1;
                    ibvc8 = ibvc3;
                    ibvc9 = ibvc2;
                    map0 = linkedHashMap0;
                    ibvc10 = ibvc5;
                    goto label_92;
                }
                return object1;
            }
            case 2: {
                long v6 = furn0.g;
                v5 = furn0.f;
                ibvd1 = (ibvd)furn0.e;
                ibvc ibvc11 = furn0.l;
                map0 = (Map)furn0.d;
                ibvc9 = furn0.k;
                ibvc3 = (ibvc)furn0.c;
                ibvc10 = (ibvc)furn0.b;
                outputStream1 = (OutputStream)furn0.a;
                ibnx.b(object0);
                ibvc8 = ibvc11;
                v4 = v6;
                object1 = ibrx0;
            label_92:
                ibvc8.a = System.nanoTime() - v4;
                long v7 = System.nanoTime();
                furr furr0 = new furr(ibvd1, map0, outputStream1, null);
                furn0.a = ibvc10;
                furn0.b = ibvc3;
                furn0.c = ibvc9;
                furn0.k = ibvc9;
                furn0.d = null;
                furn0.l = null;
                furn0.e = null;
                furn0.f = v5;
                furn0.g = v7;
                furn0.j = 3;
                if(icbd.a(furs.a, furr0, furn0) != object1) {
                    v8 = v7;
                    ibvc12 = ibvc9;
                    ibvc13 = ibvc12;
                    ibvc14 = ibvc3;
                    ibvc15 = ibvc10;
                    break;
                }
                return object1;
            }
            case 3: {
                v8 = furn0.g;
                v5 = furn0.f;
                ibvc12 = furn0.k;
                ibvc13 = (ibvc)furn0.c;
                ibvc14 = (ibvc)furn0.b;
                ibvc15 = (ibvc)furn0.a;
                ibnx.b(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        ibvc12.a = System.nanoTime() - v8;
        long v9 = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - v5);
        long v10 = TimeUnit.NANOSECONDS.toMillis(ibvc15.a);
        long v11 = TimeUnit.NANOSECONDS.toMillis(ibvc14.a);
        long v12 = TimeUnit.NANOSECONDS.toMillis(ibvc13.a);
        Log.i(furx.a, "export took (total, prepare, walk, serialize) ms: (" + v9 + ", " + v10 + ", " + v11 + ", " + v12 + ")");
        return ibom.a;
    }
}

