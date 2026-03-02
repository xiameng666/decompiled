import android.util.ArrayMap;
import android.view.FrameMetrics;
import android.view.Window.OnFrameMetricsAvailableListener;
import android.view.Window;

final class fowy implements Window.OnFrameMetricsAvailableListener {
    public static final int a;
    private boolean b;
    private long c;
    private final ArrayMap d;
    private final gful_cronetEngineProvider e;
    private final ibnf f;

    public fowy(ArrayMap arrayMap0, ibnf ibnf0) {
        this.e = gfus.a(((gful_cronetEngineProvider)new fowx()));
        this.d = arrayMap0;
        this.f = ibnf0;
    }

    @Override  // android.view.Window$OnFrameMetricsAvailableListener
    public final void onFrameMetricsAvailable(Window window0, FrameMetrics frameMetrics0, int v) {
        int v10;
        int v9;
        int v7;
        if(!this.b) {
            this.b = true;
            this.c = this.f.get() != null && ((Boolean)this.f.get()).booleanValue() ? ((long)(1000000000.0f / window0.getWindowManager().getDefaultDisplay().getRefreshRate())) : ((long)(((Long)this.e.mr())));
        }
        if(frameMetrics0.getMetric(9) == 1L) {
            return;
        }
        long v1 = frameMetrics0.getMetric(8);
        long v2 = this.c;
        long v3 = frameMetrics0.getMetric(13);
        ArrayMap arrayMap0 = this.d;
        synchronized(arrayMap0) {
            int v5 = arrayMap0.size();
            int v6 = 0;
            while(v6 < v5) {
                foxb foxb0 = (foxb)arrayMap0.valueAt(v6);
                if(((long)(((int)(v1 / 1000000L)))) < 0L) {
                    ++foxb0.j;
                }
                else {
                    ++foxb0.i;
                    if(foxb0.p) {
                        foxb0.s = v2;
                        foxb0.r.add(Long.valueOf(v1));
                        foxb0.q.add(Long.valueOf(v3));
                    }
                    if(Long.compare(v3, 0L) > 0) {
                        v7 = (int)(v1 / 1000000L);
                        int v8 = (int)((v1 - v3) / 1000000L);
                        if(foxb0.o < v8) {
                            foxb0.o = v8;
                        }
                        int[] arr_v = foxb0.f;
                        if(v8 < 20) {
                            if(v8 >= -20) {
                                v9 = (v8 + 20 >> 1) + 12;
                            }
                            else if(v8 >= -30) {
                                v9 = (v8 + 30) / 5 + 10;
                            }
                            else if(v8 >= -100) {
                                v9 = (v8 + 100) / 10 + 3;
                            }
                            else if(v8 >= -200) {
                                v9 = (v8 + 200) / 50 + 1;
                            }
                            else {
                                v9 = 0;
                            }
                        }
                        else if(v8 < 30) {
                            v9 = (v8 - 20) / 5 + 0x20;
                        }
                        else if(v8 < 100) {
                            v9 = (v8 - 30) / 10 + 34;
                        }
                        else if(v8 < 200) {
                            v9 = (v8 - 50) / 100 + 41;
                        }
                        else {
                            v9 = v8 >= 1000 ? 51 : (v8 - 200) / 100 + 43;
                        }
                        ++arr_v[v9];
                        if(v1 > v3) {
                            ++foxb0.g;
                            foxb0.l += v7;
                        }
                        if(v1 > v2) {
                            ++foxb0.h;
                            foxb0.m += v7;
                        }
                    }
                    else {
                        v7 = (int)(v1 / 1000000L);
                        if(v1 > v2) {
                            ++foxb0.g;
                            foxb0.l += v7;
                        }
                    }
                    int[] arr_v1 = foxb0.e;
                    if(v7 <= 20) {
                        v10 = v7 >= 8 ? (v7 >> 1) - 2 : v7 / 4;
                    }
                    else if(v7 <= 30) {
                        v10 = v7 / 5 + 4;
                    }
                    else if(v7 <= 100) {
                        v10 = v7 / 10 + 7;
                    }
                    else if(v7 <= 200) {
                        v10 = v7 / 50 + 15;
                    }
                    else if(v7 <= 1000) {
                        v10 = v7 / 100 + 17;
                    }
                    else {
                        v10 = v7 >= 5000 ? 28 : 27;
                    }
                    ++arr_v1[v10];
                    foxb0.j += v;
                    if(foxb0.k < v7) {
                        foxb0.k = v7;
                    }
                    foxb0.n += v7;
                }
                ++v6;
                v1 = v1;
            }
        }
    }
}

