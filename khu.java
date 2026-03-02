import java.util.ArrayList;
import java.util.List;

public final class khu {
    public final ArrayList a;
    public final kia b;
    public jxn c;
    public int d;
    public boolean e;
    private jxn f;

    public khu(kia kia0, List list0) {
        this.a = new ArrayList();
        this.f = jxn.a;
        this.c = jxn.a;
        this.f(list0, false);
        this.f(list0, true);
        if(!kia0.b.contains(this)) {
            kia0.b.add(this);
            this.d(kia0.c, kia0.d);
            this.c(kia0.e);
        }
        this.b = kia0;
    }

    public final int a() {
        return this.a.size();
    }

    public final kht b(int v) {
        return (kht)this.a.get(v);
    }

    public final void c(int v) {
        ArrayList arrayList0 = this.a;
        int v1 = arrayList0.size();
        while(true) {
            --v1;
            if(v1 < 0) {
                break;
            }
            ((kht)arrayList0.get(v1)).b();
        }
    }

    public final void d(jxn jxn0, jxn jxn1) {
        this.f = jxn0;
        this.c = jxn1;
        this.e();
    }

    public final void e() {
        ArrayList arrayList0 = this.a;
        jxn jxn0 = jxn.a;
        int v = arrayList0.size() - 1;
        jxn jxn1 = jxn0;
        while(v >= 0) {
            kht kht0 = (kht)arrayList0.get(v);
            kht0.b = this.f;
            kht0.c = this.c;
            khs khs0 = kht0.a;
            if(!khs0.b.equals(jxn1)) {
                khs0.b = jxn1;
                khv khv0 = khs0.g;
                if(khv0 != null) {
                    khv0.a.leftMargin = jxn1.b;
                    khv0.a.topMargin = jxn1.c;
                    khv0.a.rightMargin = jxn1.d;
                    khv0.a.bottomMargin = jxn1.e;
                    khv0.b.setLayoutParams(khv0.a);
                }
            }
            int v1 = kht0.b.c;
            int v2 = kht0.a(kht0.c.c);
            if(khs0.a != v2) {
                khs0.a = v2;
                khv khv1 = khs0.g;
                if(khv1 != null) {
                    khv1.a.height = v2;
                    khv1.b.setLayoutParams(khv1.a);
                }
            }
            kht0.f(v1 > 0);
            float f = v1 <= 0 ? 0.0f : 1.0f;
            kht0.d(f);
            kht0.e(f);
            jxn1 = jxn.c(jxn1, jxn0);
            --v;
        }
    }

    private final void f(List list0, boolean z) {
        int v = list0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            kht kht0 = (kht)list0.get(v1);
            if(!z) {
                Object object0 = kht0.d;
                if(object0 != null) {
                    throw new IllegalStateException(kht0 + " (" + (v1 + 1) + "/" + v + ") is already controlled by " + object0 + " but is still added to " + this + " at tid=" + Thread.currentThread().getId(), kht0.e);
                }
                kht0.c(this);
                this.a.add(kht0);
                continue;
            }
        }
    }
}

