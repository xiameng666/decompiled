import android.content.Context;
import com.google.android.gms.chimera.modules.auth.proximity.AppContextProvider;
import j..util.Collection.-EL;
import j..util.Comparator.-CC;
import j..util.Comparator.-EL;
import j..util.stream.Collectors;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import jeb.synthetic.TWR;

public final class aldi {
    public static final baun a;
    public final alcq b;
    public final almg c;
    public final alav d;
    private static aldi e;
    private final alnb f;

    static {
        aldi.a = new baun("ProximityAuth", new String[]{"RecentAppsMediator"});
    }

    public aldi(alcq alcq0, alnb alnb0, alav alav0, almg almg0) {
        this.d = alav0;
        this.b = alcq0;
        this.f = alnb0;
        this.c = almg0;
    }

    public static aldi a(Context context0) {
        alav alav0 = null;
        synchronized(aldi.class) {
            if(aldi.e == null) {
                alnb alnb0 = hpzm.s() ? alna.b(AppContextProvider.a()) : null;
                alcq alcq0 = new alcq(almg.a(AppContextProvider.a()), context0);
                if(alnb0 != null) {
                    alav0 = new alav(alnb0);
                }
                aldi.e = new aldi(alcq0, alnb0, alav0, almg.a(context0));
            }
        }
        return aldi.e;
    }

    public final alvg b(String s) {
        List list0;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)alvg.a).v_newBuilder();
        new ArrayList();
        try {
            list0 = this.d(s, false);
        }
        catch(ywm ywm0) {
            aldi.a.g("Profile unavailable", ywm0, new Object[0]);
            return (alvg)hftp0.N_build();
        }
        if(list0 == null) {
            aldi.a.f("Streamable app list is null", new Object[0]);
            return (alvg)hftp0.N_build();
        }
        Collection.-EL.stream(list0).sorted(aldi.c()).forEachOrdered(new aldd(hftp0));
        return (alvg)hftp0.N_build();
    }

    public static Comparator c() {
        return Comparator.-EL.thenComparing(Comparator.-EL.reversed(Comparator.-CC.comparingLong(new aldb())), new aldc());
    }

    public final List d(String s, boolean z) {
        List list0;
        HashMap hashMap0;
        if(this.f != null && this.d != null && hpzm.s() && hpzm.A()) {
            try {
                boolean z1 = ((aluq)((glyq)alol.a(s).e()).u()).b;
                aldi.a.h("XPF-Checking for cross profile recent apps populating. featureEnabledByUser=%s", new Object[]{Boolean.valueOf(z1)});
                if(z1) {
                    goto label_4;
                }
            }
            catch(ExecutionException | InterruptedException unused_ex) {
            }
            goto label_37;
        label_4:
            ywg ywg0 = alna.a(this.f);
            try {
                if(z) {
                    alcy alcy1 = this.d.b();
                    hashMap0 = new HashMap();
                    Map map1 = alcy1.a;
                    for(Object object1: map1.keySet()) {
                        ywf ywf1 = (ywf)object1;
                        alda alda1 = (alda)map1.get(ywf1);
                        try {
                            hashMap0.put(ywf1, alda1.a());
                        }
                        catch(ywm unused_ex) {
                        }
                    }
                }
                else {
                    alcy alcy0 = this.d.b();
                    hashMap0 = new HashMap();
                    Map map0 = alcy0.a;
                    for(Object object0: map0.keySet()) {
                        ywf ywf0 = (ywf)object0;
                        alda alda0 = (alda)map0.get(ywf0);
                        try {
                            hashMap0.put(ywf0, alda0.b());
                        }
                        catch(ywm unused_ex) {
                        }
                    }
                }
                Object[] arr_object = {Collection.-EL.stream(hashMap0.entrySet()).map(new aldf()).collect(Collectors.toList())};
                aldi.a.h("XPF-Recent streamable apps: %s", arr_object);
                list0 = (List)Collection.-EL.stream(hashMap0.values()).filter(new aldg()).flatMap(new aldh()).collect(Collectors.toList());
            }
            catch(Throwable throwable0) {
                TWR.safeClose$NT(ywg0, throwable0);
                throw throwable0;
            }
            if(ywg0 != null) {
                ywg0.close();
            }
            return list0;
        }
    label_37:
        return z ? this.b.a() : this.b.b();
    }

    public final boolean e() {
        return this.d != null && (this.f != null && hpzm.A() && this.f.k().c() && this.f.i());
    }
}

