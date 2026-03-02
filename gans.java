import android.content.Intent;
import android.os.Looper;
import java.util.ArrayList;

public final class gans implements Runnable {
    public final ganv a;

    public gans(ganv ganv0) {
        this.a = ganv0;
    }

    @Override
    public final void run() {
        ganv ganv0 = this.a;
        if(!ganv0.g) {
            int v = 0;
            while(true) {
                ArrayList arrayList0 = ganv0.d;
                if(v >= arrayList0.size()) {
                    break;
                }
                ArrayList arrayList1 = ganv0.f;
                gang gang0 = (gang)arrayList1.get(v);
                if(arrayList1.get(v) == null) {
                    int v1 = (int)(((Integer)ganv0.c.get(v)));
                    ganv0.b.I();
                    gang0 = (gang)bzu.a(ganv0.b.ag, v1);
                    arrayList1.set(v, gang0);
                    if(gang0 != null) {
                        gang0.f = ganv0;
                    }
                }
                if(gang0 != null && gang0.e != 4) {
                    ++v;
                }
                else {
                    ArrayList arrayList2 = ganv0.e;
                    Intent intent0 = (Intent)arrayList2.get(v);
                    if(gang0 == null) {
                        gftb.check(intent0);
                        gano gano0 = new gano(((Intent)arrayList2.get(v)));
                        ganv0.b.I();
                        int v2 = ganv0.b.al;
                        gang gang1 = new gang(v2);
                        ganv0.b.al = v2 + 1;
                        gang1.c = gano0;
                        ganv0.b.ag.h(gang1.a, gang1);
                        ganv0.c.set(v, Integer.valueOf(gang1.a));
                        arrayList1.set(v, gang1);
                        arrayList2.set(v, null);
                        gang1.f = ganv0;
                        ++v;
                    }
                    else {
                        int v3 = (int)(((Integer)arrayList0.remove(v)));
                        gang gang2 = (gang)arrayList1.remove(v);
                        ganv0.c.remove(v);
                        arrayList2.remove(v);
                        ganp ganp0 = gang2.b;
                        gani gani0 = ganv0.b;
                        if(Looper.myLooper() == Looper.getMainLooper()) {
                            gani0.O(gang2);
                        }
                        else {
                            ganc ganc0 = new ganc(gani0, gang2);
                            gani0.an.post(ganc0);
                        }
                        ganv0.a.nH(v3, ganp0);
                    }
                }
            }
            ganv0.b.L();
        }
    }
}

