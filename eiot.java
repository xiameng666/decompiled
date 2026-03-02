import android.os.RemoteException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;
import jeb.synthetic.TWR;

public final class eiot {
    public static final Object a;
    public final Map b;
    private static final bboh c;
    private static volatile eiot d;

    static {
        eiot.c = bboh.b("FlagUpdateListenerRegistry", bbcu.al);
        eiot.a = new Object();
    }

    private eiot() {
        this.b = new bxd();
    }

    public static eiot a() {
        eiot eiot1;
        eiot eiot0 = eiot.d;
        if(eiot0 == null) {
            synchronized(eiot.a) {
                eiot1 = eiot.d;
                if(eiot1 == null) {
                    eiot1 = new eiot();
                    eiot.d = eiot1;
                }
            }
            return eiot1;
        }
        return eiot0;
    }

    public static void b(String s, Set set0) {
        ggeo ggeo0;
        eiot eiot0 = eiot.a();
        synchronized(eiot.a) {
            Map map0 = (Map)eiot0.b.get(s);
            ggeo0 = map0 == null ? ggnf.a : ggeo.k(map0);
        }
        if(!ggeo0.isEmpty()) {
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)fppb.a).v_newBuilder();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            fppb fppb0 = (fppb)hftp0.b_message;
            hfuo hfuo0 = fppb0.b;
            if(!hfuo0.c()) {
                fppb0.b = ProtoLiteMessage.E(hfuo0);
            }
            hfrj.E(set0, fppb0.b);
            byte[] arr_b = ((fppb)hftp0.N_build()).toBytesArray();
            ggqj ggqj0 = ggeo0.v().om();
            while(ggqj0.hasNext()) {
                Object object0 = ggqj0.next();
                Map.Entry map$Entry0 = (Map.Entry)object0;
                try {
                    ((eiqa)map$Entry0.getValue()).a(arr_b);
                }
                catch(RemoteException remoteException0) {
                    String s1 = (String)map$Entry0.getKey();
                    ((ggtj)eiot.c.j()).X("Unable to invoke IFlagUpdateListener.onFlagUpdate. App: %s. Process: %s. Error: %s.", s, s1, remoteException0);
                    synchronized(eiot.a) {
                        Map map1 = eiot0.b;
                        if(map1.get(s) != null) {
                            if(s1 == null) {
                                s1 = "__PH_INTERNAL__NO_PROCESS__";
                            }
                            eiqa eiqa0 = (eiqa)((Map)map1.get(s)).remove(s1);
                        }
                    }
                }
            }
        }
    }

    public static void c(eiox eiox0, Set set0) {
        HashMap hashMap0 = new HashMap();
        eiop eiop0 = eiox0.a().b();
        try {
            eion eion0 = eiop0.d("ConfigPackagesToNotify", (eiop0.f() ? "CREATE TEMP TABLE ConfigPackagesToNotify(\n    config_package_id INTEGER PRIMARY KEY);\n" : "CREATE TEMP TABLE ConfigPackagesToNotify(\n    name TEXT PRIMARY KEY);\n"));
            try {
                for(Object object0: set0) {
                    eiop0.c((eiop0.f() ? "INSERT OR IGNORE INTO TEMP.ConfigPackagesToNotify\nSELECT config_package_id\nFROM config_packages\nWHERE name = ?1;\n" : "INSERT OR IGNORE INTO TEMP.ConfigPackagesToNotify\nSELECT packageName\nFROM Packages\nWHERE packageName = ?1;\n")).g(new Object[]{((String)object0)}).d();
                }
                try(eioe eioe0 = ((eioh)eiop0).g((eiop0.f() ? "SELECT android_packages.name, config_packages.name\nFROM ConfigPackagesToNotify\nINNER JOIN config_packages\n    USING (config_package_id)\nINNER JOIN android_packages\n    USING (android_package_id);\n" : "SELECT androidPackageName, packageName\nFROM ConfigPackagesToNotify\nINNER JOIN Packages\n    ON ConfigPackagesToNotify.name = Packages.packageName;\n")).e(new String[]{"ConfigPackagesToNotify"}).f()) {
                    while(true) {
                        if(!eioe0.b()) {
                            break;
                        }
                        String s = eioe0.h(0);
                        String s1 = eioe0.h(1);
                        Set set1 = (Set)hashMap0.get(s);
                        if(set1 == null) {
                            HashSet hashSet0 = new HashSet();
                            hashSet0.add(s1);
                            hashMap0.put(s, hashSet0);
                        }
                        else {
                            set1.add(s1);
                        }
                    }
                }
            }
            catch(Throwable throwable1) {
                TWR.safeClose$NT(eion0, throwable1);
                throw throwable1;
            }
            eion0.close();
            eiop0.e();
        }
        catch(Throwable throwable0) {
            TWR.safeClose$NT(eiop0, throwable0);
            throw throwable0;
        }
        eiop0.close();
        for(Object object1: hashMap0.entrySet()) {
            eiot.b(((String)((Map.Entry)object1).getKey()), ((Set)((Map.Entry)object1).getValue()));
        }
    }
}

