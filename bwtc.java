import android.content.Context;
import com.google.firebase.appindexing.internal.Thing;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public final class bwtc {
    final bwqm a;
    public final ggfp b;
    private static bwtc c;
    private static bwtc d;
    private static bwtc e;
    private static bwqm f;
    private final ggeo g;

    private bwtc(bwqm bwqm0) {
        HashMap hashMap0 = new HashMap();
        for(Object object0: bwqm0.b) {
            hashMap0.put(((bwqk)object0).b, ((bwqk)object0));
        }
        this.a = bwqm0;
        this.g = ggeo.k(hashMap0);
        this.b = ggfp.G(bwqm0.c);
    }

    public final bwqk a(String s) {
        return this.b(s, true);
    }

    public final bwqk b(String s, boolean z) {
        ggeo ggeo0 = this.g;
        bwqk bwqk0 = (bwqk)ggeo0.get(s);
        if(bwqk0 != null) {
            return bwqk0;
        }
        if(z) {
            bwne.l("Unsupported config type, fallback to Thing: %s", s);
        }
        bwqk bwqk1 = (bwqk)ggeo0.get("Thing");
        if(bwqk1 != null) {
            return bwqk1;
        }
        throw new IllegalStateException("THING type not found. TypeConfigMap must be malformed!");
    }

    static bwtb c() {
        bwtb bwtb0 = new bwtb();
        bwtb0.b(((int)huar.a.d().j()), ((int)huar.a.d().i()), Integer.parseInt(huar.a.d().A()));
        return bwtb0;
    }

    public static bwtc d(Context context0) {
        synchronized(bwtc.class) {
            if(!hubu.g()) {
                return bwtc.e();
            }
            if(bwtc.d == null) {
                try {
                    hfsl hfsl0 = hfsl.N(context0.openFileInput("icing-predefined-type-configs"));
                    ProtoLiteMessage hftv0 = ((ProtoLiteMessage)bwqm.a).x_newMutableInstance();
                    try {
                        hfwc hfwc0 = hfvu.a.c(hftv0);
                        hfwc0.l(hftv0, hfsm.p(hfsl0), hftc.a);
                        hfwc0.g(hftv0);
                    }
                    catch(hfur hfur0) {
                        if(hfur0.b) {
                            hfur0 = new hfur(hfur0);
                        }
                        hfur0.a = hftv0;
                        throw hfur0;
                    }
                    catch(hfwr hfwr0) {
                        hfur hfur1 = hfwr0.a();
                        hfur1.a = hftv0;
                        throw hfur1;
                    }
                    catch(IOException iOException0) {
                        if((iOException0.getCause() instanceof hfur)) {
                            throw (hfur)iOException0.getCause();
                        }
                        hfur hfur2 = new hfur(iOException0);
                        hfur2.a = hftv0;
                        throw hfur2;
                    }
                    catch(RuntimeException runtimeException0) {
                        if((runtimeException0.getCause() instanceof hfur)) {
                            throw (hfur)runtimeException0.getCause();
                        }
                        throw runtimeException0;
                    }
                    ProtoLiteMessage.P_makeImmutable(hftv0);
                    bwtc.d = new bwtc(((bwqm)hftv0));
                }
                catch(IOException unused_ex) {
                    bwtc.d = new bwtc(bwtc.c().a());
                }
            }
        }
        return bwtc.d;
    }

    public static bwtc e() {
        synchronized(bwtc.class) {
            bwqm bwqm0 = htzc.b();
            if(bwtc.c == null || bwvu.i() && !bata.b(bwtc.f, bwqm0)) {
                bwtc.f = bwqm0;
                bwtb bwtb0 = bwtc.c();
                bwtb0.c(bwqm0);
                bwtc.c = new bwtc(bwtb0.a());
            }
            gftb.check(bwtc.c);
        }
        return bwtc.c;
    }

    public static bwtc f() {
        bwtc bwtc1;
        synchronized(bwtc.class) {
            if(!hubu.g()) {
                return bwtc.e();
            }
            bwtb bwtb0 = bwtc.c();
            bwtb0.c(htzc.b());
            bwtc1 = new bwtc(bwtb0.a());
            bwtc.e = bwtc1;
        }
        return bwtc1;
    }

    public static List g(Thing thing0, String s) {
        int v = s.indexOf(0x5F);
        int v1 = 0;
        if(v == -1) {
            String[] arr_s = thing0.i(s);
            if(arr_s != null) {
                return Arrays.asList(arr_s);
            }
            long[] arr_v = thing0.g(s);
            if(arr_v != null) {
                String[] arr_s1 = new String[arr_v.length];
                while(v1 < arr_v.length) {
                    arr_s1[v1] = Long.toString(arr_v[v1]);
                    ++v1;
                }
                return Arrays.asList(arr_s1);
            }
            double[] arr_f = thing0.f(s);
            if(arr_f != null) {
                String[] arr_s2 = new String[arr_f.length];
                while(v1 < arr_f.length) {
                    arr_s2[v1] = Double.toString(arr_f[v1]);
                    ++v1;
                }
                return Arrays.asList(arr_s2);
            }
        }
        else {
            Thing[] arr_thing = thing0.h(s.substring(0, v));
            if(arr_thing != null) {
                ArrayList arrayList0 = new ArrayList();
                while(v1 < arr_thing.length) {
                    arrayList0.addAll(bwtc.g(arr_thing[v1], s.substring(v + 1)));
                    ++v1;
                }
                return gged_interceptors.i(arrayList0);
            }
        }
        return ggna.a;
    }

    public static void h(Context context0, bwtc bwtc0, bwts bwts0) {
        synchronized(bwtc.class) {
            if(hubu.g() && !bata.b(bwtc.d, bwtc0)) {
                try {
                    FileOutputStream fileOutputStream0 = context0.openFileOutput("icing-predefined-type-configs", 0);
                    bwtc0.a.writeToStream(fileOutputStream0);
                    fileOutputStream0.close();
                    bwtc.d = bwtc0;
                }
                catch(IOException unused_ex) {
                    bwne.f("Cannot deploy PredefinedTypeIndexingConfig to disk");
                    bwts0.p(6014);
                }
            }
        }
    }

    public final boolean i(String s) {
        return this.g.containsKey(s);
    }
}

