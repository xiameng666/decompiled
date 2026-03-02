import android.graphics.RectF;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

final class khz extends kfx {
    final kia a;
    private final HashMap b;

    public khz(kia kia0) {
        this.a = kia0;
        super(0);
        this.b = new HashMap();
    }

    private static final boolean a(kga kga0) {
        return (kga0.c() & 0x207) != 0;
    }

    @Override  // kfx
    public final kfw b(kga kga0, kfw kfw0) {
        if(khz.a(kga0)) {
            jxn jxn0 = kfw0.b;
            jxn jxn1 = kfw0.a;
            int v = jxn0.b == jxn1.b ? 0 : 1;
            if(jxn0.c != jxn1.c) {
                v |= 2;
            }
            if(jxn0.d != jxn1.d) {
                v |= 4;
            }
            if(jxn0.e != jxn1.e) {
                v |= 8;
            }
            this.b.put(kga0, Integer.valueOf(v));
        }
        return kfw0;
    }

    @Override  // kfx
    public final kgq c(kgq kgq0, List list0) {
        RectF rectF0 = new RectF(1.0f, 1.0f, 1.0f, 1.0f);
        int v = list0.size() - 1;
        int v1 = 0;
        while(v >= 0) {
            kga kga0 = (kga)list0.get(v);
            Integer integer0 = (Integer)this.b.get(kga0);
            if(integer0 != null) {
                int v2 = (int)integer0;
                float f = kga0.a();
                if((v2 & 1) != 0) {
                    rectF0.left = f;
                }
                if((v2 & 2) != 0) {
                    rectF0.top = f;
                }
                if((v2 & 4) != 0) {
                    rectF0.right = f;
                }
                if((v2 & 8) != 0) {
                    rectF0.bottom = f;
                }
                v1 |= v2;
            }
            --v;
        }
        jxn jxn0 = kia.a(kgq0);
        ArrayList arrayList0 = this.a.b;
        int v3 = arrayList0.size();
        while(true) {
            --v3;
            if(v3 < 0) {
                break;
            }
            khu khu0 = (khu)arrayList0.get(v3);
            jxn jxn1 = khu0.c;
            ArrayList arrayList1 = khu0.a;
            int v4 = arrayList1.size();
            while(true) {
                --v4;
                if(v4 < 0) {
                    break;
                }
                kht kht0 = (kht)arrayList1.get(v4);
                if((v1 & 2) != 0) {
                    kht0.f(true);
                    int v5 = jxn1.c;
                    if(v5 > 0) {
                        kht0.e(((float)jxn0.c) / ((float)v5));
                    }
                    kht0.d(rectF0.top);
                }
            }
        }
        return kgq0;
    }

    @Override  // kfx
    public final void d(kga kga0) {
        if(khz.a(kga0)) {
            this.b.remove(kga0);
            ArrayList arrayList0 = this.a.b;
            int v = arrayList0.size();
            while(true) {
                --v;
                if(v < 0) {
                    break;
                }
                khu khu0 = (khu)arrayList0.get(v);
                int v1 = khu0.d;
                khu0.d = v1 - 1;
                if(v1 > 0 && v1 - 1 == 0) {
                    khu0.e();
                }
            }
        }
    }

    @Override  // kfx
    public final void e(kga kga0) {
        if(khz.a(kga0)) {
            ArrayList arrayList0 = this.a.b;
            int v = arrayList0.size();
            while(true) {
                --v;
                if(v < 0) {
                    break;
                }
                khu khu0 = (khu)arrayList0.get(v);
                ++khu0.d;
            }
        }
    }
}

