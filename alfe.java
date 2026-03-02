import android.os.RemoteException;
import com.google.android.gms.auth.proximity.RemoteDevice;
import com.google.android.gms.auth.proximity.Role;
import com.google.android.gms.auth.proximity.firstparty.FirstPartyDeviceRegistrationChimeraService;
import com.google.android.gms.chimera.modules.auth.proximity.AppContextProvider;
import j..util.Objects;
import java.util.Collection;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;

public final class alfe extends alii {
    final FirstPartyDeviceRegistrationChimeraService a;

    public alfe(FirstPartyDeviceRegistrationChimeraService firstPartyDeviceRegistrationChimeraService0) {
        Objects.requireNonNull(firstPartyDeviceRegistrationChimeraService0);
        this.a = firstPartyDeviceRegistrationChimeraService0;
        super();
    }

    @Override  // alij
    public final void a(String s, int v, int v1, int v2) {
        if(v2 == 3) {
            gmcd gmcd0 = this.a.b.f.e(new alfh(this.a.b, s, v, this.a));
            this.a.c(gmcd0);
            v2 = 3;
        }
        hpyn hpyn0 = hpyn.a;
        if(hpyn0.d().f()) {
            String s1 = String.format(Locale.US, "id:%s|mode:%d", s, v);
            if(v2 == 0) {
                v2 = 0;
                if(v1 == 4) {
                    FirstPartyDeviceRegistrationChimeraService firstPartyDeviceRegistrationChimeraService0 = this.a;
                    int v3 = firstPartyDeviceRegistrationChimeraService0.f.containsKey(s1) ? ((int)(((Integer)firstPartyDeviceRegistrationChimeraService0.f.get(s1)))) + 1 : 1;
                    if(((long)v3) == hpyn0.d().d()) {
                        alfl alfl0 = firstPartyDeviceRegistrationChimeraService0.b;
                        int v4 = v == 1 ? 4 : -1;
                        akzn akzn0 = alfl0.b;
                        RemoteDevice remoteDevice0 = akzn0.b(s);
                        for(Object object0: akzn0.f(s)) {
                            Role role0 = (Role)object0;
                            if((role0.c & v4) > 0) {
                                akzn0.h(s, new Role(role0.b, v4));
                                akvq.b(AppContextProvider.a(), akzn0);
                            }
                        }
                        alfk alfk0 = new alfk(alfl0, remoteDevice0, v4);
                        firstPartyDeviceRegistrationChimeraService0.c(alfl0.f.e(alfk0));
                        firstPartyDeviceRegistrationChimeraService0.f.remove(s1);
                    }
                    else {
                        firstPartyDeviceRegistrationChimeraService0.f.put(s1, Integer.valueOf(v3));
                    }
                    v1 = 4;
                    goto label_34;
                }
                goto label_32;
            }
            else {
            label_32:
                if(v2 != 2 && v2 != 4) {
                    this.a.f.remove(s1);
                }
            }
        }
    label_34:
        synchronized(this.a.d) {
            for(Object object2: this.a.e.b(s, v)) {
                alij alij0 = (alij)object2;
                try {
                    alij0.a(s, v, v1, v2);
                }
                catch(RemoteException unused_ex) {
                    this.a.e.c(alij0);
                }
            }
        }
        if(v2 == 3) {
            synchronized(this.a.d) {
                alee alee0 = this.a.e;
                algz algz0 = alee0.a(s, v);
                if(algz0 == null) {
                    algz algz1 = new algz(new bbll(1, 10), new alec(alee0, s, v));
                    aled aled0 = new aled(s, "tqcf", v);
                    HashSet hashSet0 = new HashSet();
                    hashSet0.add(algz1);
                    alee0.a.put(aled0, hashSet0);
                    algz1.d();
                }
                else {
                    algz0.d();
                }
            }
        }
    }

    @Override  // alij
    public final void c(String s, String s1, byte[] arr_b) {
        Role role0 = new Role(s1, 0);
        synchronized(this.a.d) {
            alee alee0 = this.a.e;
            String s2 = role0.b;
            HashSet hashSet0 = new HashSet();
            Map map0 = alee0.a;
            for(Object object1: map0.keySet()) {
                aled aled0 = (aled)object1;
                if(s.hashCode() == aled0.a && (s2.hashCode() == aled0.b || aled0.b == 0x366FA0)) {
                    hashSet0.addAll(((Collection)map0.get(aled0)));
                }
            }
            for(Object object2: hashSet0) {
                alij alij0 = (alij)object2;
                try {
                    alij0.c(s, s1, arr_b);
                }
                catch(RemoteException unused_ex) {
                    this.a.e.c(alij0);
                }
            }
        }
    }
}

