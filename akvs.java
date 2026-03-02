import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.auth.proximity.ConnectionInfo;
import com.google.android.gms.auth.proximity.exo.ExoChimeraService;
import com.google.android.gms.chimera.modules.auth.proximity.AppContextProvider;
import java.util.Map.Entry;
import java.util.concurrent.Executor;

public final class akvs extends akzt {
    public final akzn a;
    private static final baun b;
    private static akvs c;
    private final ggla d;

    static {
        akvs.b = new baun("ProximityAuth", new String[]{"ConnectionEventRouter"});
    }

    public akvs(akzn akzn0, Executor executor0) {
        super(executor0);
        this.a = akzn0;
        this.d = new ggdi();
    }

    public static akvs a() {
        synchronized(akvs.class) {
            if(akvs.c == null) {
                akvs.c = new akvs(akzn.c(), new bblp(1, 10));
            }
        }
        return akvs.c;
    }

    @Override  // akzt
    public final void b(akzu akzu0, int v, int v1) {
        synchronized(this) {
            String s = akzu0.c() == null ? "" : akzu0.c();
            int v3 = akzu0.a();
            if(!s.isEmpty()) {
                if(v1 == 0) {
                    akzn akzn0 = this.a;
                    akzu akzu1 = akzn0.d(s, v3);
                    if(akzu1 != null && akzu1 != akzu0) {
                        akvs.b.h("Disconnected from stale endpoint connection to device " + s, new Object[0]);
                        return;
                    }
                    Object object0 = akzn0.c;
                    synchronized(object0) {
                        akzm akzm0 = (akzm)akzn0.b.get(s);
                        if(akzm0 != null) {
                            akzm0.d.remove(v3);
                        }
                    }
                }
                else {
                    akzn akzn1 = this.a;
                    if(akzn1.d(s, v3) != akzu0) {
                        Object object1 = akzn1.c;
                        synchronized(object1) {
                            akzm akzm1 = (akzm)akzn1.b.get(s);
                            if(akzm1 == null) {
                                akzn.a.d("SecureChannel established for unregistered device. Disconnecting.", new Object[0]);
                                akzu0.g();
                            }
                            else {
                                int v6 = akzu0.a();
                                akzm1.d.put(v6, akzu0);
                                int v7 = akzu0.a();
                                akzm1.e.put(v7, false);
                                if(akzm1.d.size() == 0 && albt.c()) {
                                    Context context0 = AppContextProvider.a();
                                    context0.startService(ExoChimeraService.a(context0, "First device connected"));
                                }
                            }
                        }
                    }
                }
            }
            this.e(s, v3, v, v1);
        }
    }

    @Override  // akzt
    public final void c(akzu akzu0, String s, byte[] arr_b) {
        synchronized(this) {
            String s1 = akzu0.c();
            batl.s(s1);
            bxf bxf0 = new bxf(((gfyj)this.d).b);
            for(Object object0: ((gfyw)this.d).g()) {
                Map.Entry map$Entry0 = (Map.Entry)object0;
                alij alij0 = (alij)map$Entry0.getValue();
                try {
                    alij0.c(s1, s, arr_b);
                }
                catch(RemoteException remoteException0) {
                    akvs.b.n("Got RemoteException when invoking onMessageReceived()", remoteException0, new Object[0]);
                    bxf0.add(((akvr)map$Entry0.getKey()));
                }
            }
            bxe bxe0 = new bxe(bxf0);
            while(bxe0.hasNext()) {
                Object object1 = bxe0.next();
                ((gfyw)this.d).G(((akvr)object1));
            }
            akvs.b.h("Notifying %d callbacks for message received; %d were disconnected, feature=%s", new Object[]{((int)((gfyj)this.d).b), ((int)bxf0.c), s});
        }
    }

    public final void d(akvr akvr0, alij alij0) {
        synchronized(this) {
            this.d.v(akvr0, alij0);
        }
    }

    public final void e(String s, int v, int v1, int v2) {
        synchronized(this) {
            bxf bxf0 = new bxf(((gfyj)this.d).b);
            for(Object object0: ((gfyw)this.d).g()) {
                Map.Entry map$Entry0 = (Map.Entry)object0;
                alij alij0 = (alij)map$Entry0.getValue();
                try {
                    alij0.a(s, v, v1, v2);
                }
                catch(RemoteException remoteException0) {
                    akvs.b.n("Got RemoteException when invoking onConnectionStatusChanged()", remoteException0, new Object[0]);
                    bxf0.add(((akvr)map$Entry0.getKey()));
                }
            }
            bxe bxe0 = new bxe(bxf0);
            while(bxe0.hasNext()) {
                Object object1 = bxe0.next();
                ((gfyw)this.d).G(((akvr)object1));
            }
            akvs.b.h("Notifying %d callbacks for state change; %d were disconnected, medium=%d, old=%s, new=%s", new Object[]{((int)((gfyj)this.d).b), ((int)bxf0.c), v, ConnectionInfo.a(v1), ConnectionInfo.a(v2)});
        }
    }

    public final void f(akvr akvr0) {
        synchronized(this) {
            ((gfyw)this.d).G(akvr0);
        }
    }

    public final void g(String s) {
        synchronized(this.a.c) {
            akzm akzm0 = (akzm)this.a.b.get(s);
            if(akzm0 == null) {
                akzn.a.m("Failed to mark device ID %s as connecting: not found", new Object[]{akwe.a(s)});
                return;
            }
            akzu akzu0 = (akzu)akzm0.d.get(1);
            if(akzu0 != null && akzu0.b() != 0) {
                akzn.a.m("Failed to mark device ID %s as connecting: currently connected", new Object[]{akwe.a(s)});
                akzm0.e.put(1, false);
                return;
            }
            boolean z = akzm0.e.get(1, false);
            akzm0.e.put(1, true);
            akzn.a.d("Marked device ID %s as connecting, already_connected=%s", new Object[]{akwe.a(s), Boolean.valueOf(z)});
        }
        if(!z) {
            this.e(s, 1, 0, 4);
        }
    }
}

