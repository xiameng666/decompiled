import android.os.Trace;
import android.support.v7.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

public final class rx implements Runnable {
    public static final ThreadLocal a;
    static final Comparator b;
    public final ArrayList c;
    long d;
    public long e;
    private final ArrayList f;

    static {
        rx.a = new ThreadLocal();
        rx.b = new ru();
    }

    public rx() {
        this.c = new ArrayList();
        this.f = new ArrayList();
    }

    public final void a(RecyclerView recyclerView0, int v, int v1) {
        if(recyclerView0.q && this.d == 0L) {
            this.d = System.nanoTime();
            recyclerView0.post(this);
        }
        recyclerView0.M.a = v;
        recyclerView0.M.b = v1;
    }

    private static final uq b(RecyclerView recyclerView0, int v, long v1) {
        uq uq1;
        int v2 = recyclerView0.g.b();
        for(int v3 = 0; v3 < v2; ++v3) {
            uq uq0 = RecyclerView.p(recyclerView0.g.e(v3));
            if(uq0.c == v && !uq0.t()) {
                return null;
            }
        }
        try {
            uf uf0 = recyclerView0.d;
            if(v1 == 0x7FFFFFFFFFFFFFFFL && Trace.isEnabled()) {
                Trace.beginSection("RV Prefetch forced - needed next frame");
            }
            recyclerView0.aa();
            uq1 = uf0.q(v, v1);
            if(uq1 != null) {
                if(uq1.s() && !uq1.t()) {
                    uf0.l(uq1.a);
                }
                else {
                    uf0.d(uq1, false);
                }
            }
        }
        finally {
            recyclerView0.ac(false);
            Trace.endSection();
        }
        return uq1;
    }

    @Override
    public final void run() {
        rw rw0;
        try {
            Trace.beginSection("RV Prefetch");
            ArrayList arrayList0 = this.c;
            if(!arrayList0.isEmpty()) {
                int v1 = arrayList0.size();
                long v2 = 0L;
                for(int v3 = 0; v3 < v1; ++v3) {
                    RecyclerView recyclerView0 = (RecyclerView)arrayList0.get(v3);
                    if(recyclerView0.getWindowVisibility() == 0) {
                        v2 = Math.max(recyclerView0.getDrawingTime(), v2);
                    }
                }
                if(v2 != 0L) {
                    long v4 = TimeUnit.MILLISECONDS.toNanos(v2) + this.e;
                    int v5 = arrayList0.size();
                    int v7 = 0;
                    for(int v6 = 0; v6 < v5; ++v6) {
                        RecyclerView recyclerView1 = (RecyclerView)arrayList0.get(v6);
                        if(recyclerView1.getWindowVisibility() == 0) {
                            recyclerView1.M.c(recyclerView1, false);
                            v7 += recyclerView1.M.d;
                        }
                    }
                    ArrayList arrayList1 = this.f;
                    arrayList1.ensureCapacity(v7);
                    int v9 = 0;
                    for(int v8 = 0; v8 < v5; ++v8) {
                        RecyclerView recyclerView2 = (RecyclerView)arrayList0.get(v8);
                        if(recyclerView2.getWindowVisibility() == 0) {
                            rv rv0 = recyclerView2.M;
                            int v10 = Math.abs(rv0.a) + Math.abs(rv0.b);
                            for(int v11 = 0; v11 < rv0.d + rv0.d; v11 += 2) {
                                if(v9 >= arrayList1.size()) {
                                    rw0 = new rw();
                                    arrayList1.add(rw0);
                                }
                                else {
                                    rw0 = (rw)arrayList1.get(v9);
                                }
                                int[] arr_v = rv0.c;
                                int v12 = arr_v[v11 + 1];
                                rw0.a = v12 <= v10;
                                rw0.b = v10;
                                rw0.c = v12;
                                rw0.d = recyclerView2;
                                rw0.e = arr_v[v11];
                                ++v9;
                            }
                        }
                    }
                    Collections.sort(arrayList1, rx.b);
                    for(int v13 = 0; v13 < arrayList1.size(); ++v13) {
                        rw rw1 = (rw)arrayList1.get(v13);
                        RecyclerView recyclerView3 = rw1.d;
                        if(recyclerView3 == null) {
                            break;
                        }
                        uq uq0 = rx.b(recyclerView3, rw1.e, (rw1.a ? 0x7FFFFFFFFFFFFFFFL : v4));
                        if(uq0 != null) {
                            WeakReference weakReference0 = uq0.b;
                            if(weakReference0 != null && uq0.s() && !uq0.t()) {
                                RecyclerView recyclerView4 = (RecyclerView)weakReference0.get();
                                if(recyclerView4 != null) {
                                    if(recyclerView4.x && recyclerView4.g.b() != 0) {
                                        recyclerView4.ag();
                                    }
                                    rv rv1 = recyclerView4.M;
                                    rv1.c(recyclerView4, true);
                                    if(rv1.d != 0) {
                                        try {
                                            Trace.beginSection((v4 == 0x7FFFFFFFFFFFFFFFL ? "RV Nested Prefetch" : "RV Nested Prefetch forced - needed next frame"));
                                            recyclerView4.N.d = 1;
                                            recyclerView4.N.e = recyclerView4.m.b();
                                            recyclerView4.N.g = false;
                                            recyclerView4.N.h = false;
                                            recyclerView4.N.i = false;
                                            for(int v15 = 0; v15 < rv1.d + rv1.d; v15 += 2) {
                                                rx.b(recyclerView4, rv1.c[v15], v4);
                                            }
                                        }
                                        finally {
                                            Trace.endSection();
                                        }
                                    }
                                }
                            }
                        }
                        rw1.a = false;
                        rw1.b = 0;
                        rw1.c = 0;
                        rw1.d = null;
                        rw1.e = 0;
                    }
                }
            }
        }
        finally {
            this.d = 0L;
            Trace.endSection();
        }
    }
}

