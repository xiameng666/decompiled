import android.content.Context;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

final class fxlg extends fxpd {
    private final Context a;
    private final fvvp b;
    private final Random c;
    private final Supplier d;
    private final fxiy i;
    private fxlf j;
    private long k;
    private long l;
    private ArrayList m;

    static {
        bboh.c("EAlert", bbcu.g, "RegSup");
    }

    public fxlg(Context context0, fvvp fvvp0, Random random0, Supplier supplier0, fxiy fxiy0) {
        super("RegSup");
        this.a = context0;
        this.b = fvvp0;
        this.c = random0;
        this.d = supplier0;
        this.i = fxiy0;
    }

    @Override  // fxpd
    public final void a() {
        int v = (int)huqb.a.s().C();
        int v1 = (int)huqb.m();
        boolean z = huqb.a.s().aW();
        String s = huqb.a.s().aj();
        hfuo hfuo0 = huqb.a.s().X().b;
        String s1 = huqb.a.s().ai();
        String s2 = huqb.a.s().ag();
        this.j = new fxlf(this.c, v, v1, z, s, hfuo0, s1, s2);
        this.h.l(5, 0L);
        this.h.l(3, 0L);
        this.h.i();
    }

    @Override  // fxpd
    public final void b(fxpi fxpi0) {
        if(this.i.a() != 0) {
            this.b.g(this.a);
            this.l = System.currentTimeMillis();
        }
        this.j = null;
    }

    @Override  // fxpd
    public final boolean c(fxpj fxpj0) {
        ArrayList arrayList0;
        int v = fxpj0.a;
        if(v != 2 && v != 3) {
            if(v != 5) {
                return false;
            }
            this.b.f(this.a);
            this.h.l(5, huqg.b());
            return true;
        }
        fxob fxob0 = (fxob)this.d.get();
        if(fxob0.a()) {
            fxob0.b.a.getProvider();
            fxlf fxlf0 = this.j;
            double f = fxob0.b.a.getLatitude();
            double f1 = fxob0.b.a.getLongitude();
            List list0 = fxlf0.g;
            long v1 = fhts.h(f, f1);
            int v2 = fxlf0.b;
            long v3 = fhts.m(v1, v2);
            if(v3 == fxlf0.h) {
                arrayList0 = fxlf0.i;
                if(arrayList0 == null) {
                    goto label_20;
                }
            }
            else {
            label_20:
                int v4 = fxlf0.a + 1;
                HashSet hashSet0 = new HashSet(v4);
                hashSet0.add(Long.valueOf(v3));
                while(hashSet0.size() < v4) {
                    hashSet0.add(Long.valueOf(fhts.m(fhts.h(fxlf0.a(90.0), fxlf0.a(180.0)), v2)));
                }
                ArrayList arrayList1 = new ArrayList();
                for(Object object0: hashSet0) {
                    long v5 = (long)(((Long)object0));
                    arrayList1.add("ea." + fhts.o(v5));
                    if(fxlf0.c) {
                        List list1 = fxlf0.d;
                        if(list1.isEmpty()) {
                            arrayList1.add("ea.tst." + fhts.o(v5));
                        }
                        else {
                            for(Object object1: list1) {
                                String s = (String)object1;
                                if(!s.isEmpty()) {
                                    arrayList1.add("ea.tst." + s + "." + fhts.o(v5));
                                }
                            }
                        }
                    }
                    if(!list0.isEmpty()) {
                        for(Object object2: list0) {
                            String s1 = (String)object2;
                            if(!s1.isEmpty()) {
                                arrayList1.add("ea." + s1 + "." + fhts.o(v5));
                            }
                        }
                    }
                }
                List list2 = fxlf0.e;
                if(list2 != null) {
                    for(Object object3: list2) {
                        arrayList1.add("ea.tst." + ((String)object3));
                    }
                }
                List list3 = fxlf0.f;
                if(list3 != null) {
                    for(Object object4: list3) {
                        arrayList1.add("ea.tst." + ((String)object4));
                    }
                }
                fxlf0.h = v3;
                fxlf0.i = arrayList1;
                arrayList0 = arrayList1;
            }
            try {
                this.m = arrayList0;
                this.k = System.currentTimeMillis();
                long v6 = this.j.h;
                String s2 = v6 == -1L ? null : fhts.o(v6);
                this.b.i(this.a, arrayList0, s2);
            }
            catch(fvvr unused_ex) {
            }
        }
        this.h.l(3, huqb.a.s().M());
        return true;
    }

    @Override  // fxpd
    public final void d(PrintWriter printWriter0) {
        this.i(printWriter0);
        ArrayList arrayList0 = this.m;
        if(arrayList0 == null) {
            arrayList0 = "[]";
        }
        printWriter0.println("lastReg=" + arrayList0.toString());
        printWriter0.println("lastRegT=" + cnwf.d(this.k));
        printWriter0.println("delT=" + cnwf.d(this.l));
        this.h(printWriter0);
    }
}

