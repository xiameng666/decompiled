import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.auth.proximity.ConnectionInfo;
import com.google.android.gms.auth.proximity.FileParams;
import com.google.android.gms.auth.proximity.ProximityAuthChimeraService;
import com.google.android.gms.auth.proximity.RemoteDevice;
import com.google.android.gms.auth.proximity.Role;
import com.google.android.gms.auth.proximity.WireMessageParams;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class alil extends wby implements akvr, alim, cjug {
    private final Context a;
    private final akzn b;
    private final akvs c;

    public alil() {
        super("com.google.android.gms.auth.proximity.internal.IProximityAuthService");
    }

    public alil(Context context0) {
        super("com.google.android.gms.auth.proximity.internal.IProximityAuthService");
        this.a = context0;
        this.b = akzn.c();
        this.c = akvs.a();
    }

    @Override  // alim
    public final List a(Role role0) {
        List list0;
        synchronized(this.b.c) {
            Map map0 = this.b.b;
            list0 = new ArrayList(map0.size());
            for(Object object1: map0.keySet()) {
                akzm akzm0 = (akzm)map0.get(((String)object1));
                if(akzm0.c.containsKey(role0.b)) {
                    int v1 = role0.a() == 0 ? 1 : role0.a();
                    int v2 = 0;
                    akzu akzu0 = (akzu)akzm0.d.get(v1);
                    if(akzu0 != null) {
                        v2 = akzu0.b();
                    }
                    else if(akzm0.e.get(v1, false)) {
                        v2 = 4;
                    }
                    byte[] arr_b = akzu0 == null ? null : akzu0.o();
                    bxf bxf0 = new bxf();
                    RemoteDevice remoteDevice0 = akzm0.a;
                    bxf0.add(role0);
                    list0.add(new ConnectionInfo(1, remoteDevice0, ((Role[])bxf0.toArray(new Role[bxf0.c])), v2, arr_b));
                }
            }
        }
        return list0;
    }

    @Override  // alim
    public final void b(alij alij0) {
        this.c.d(this, alij0);
    }

    @Override  // alim
    public final void c() {
        this.c.f(this);
    }

    @Override  // alim
    public final void d(RemoteDevice remoteDevice0, Role role0) {
        ProximityAuthChimeraService.a.d("Registering %s for role %s", new Object[]{remoteDevice0.toString(), role0.toString()});
        this.b.g(remoteDevice0, role0);
        akvq.b(this.a, this.b);
    }

    @Override  // alim
    public final void e(FileParams fileParams0) {
        akzn akzn0 = this.b;
        String s = fileParams0.a;
        RemoteDevice remoteDevice0 = akzn0.b(s);
        if(remoteDevice0 == null) {
            ProximityAuthChimeraService.a.m("Unable to send file (deviceId=%s): not registered", new Object[]{s});
            return;
        }
        Set set0 = akzn0.f(s);
        akzu akzu0 = gggq.v(set0, new akyp(fileParams0)) ? akzn0.d(s, 5) : null;
        if(akzu0 == null) {
            ProximityAuthChimeraService.a.m("Unable to send file to %s (deviceId=%s) for feature %s: Nearby Connections not available. Supported roles: %s", new Object[]{remoteDevice0.c, s, fileParams0.b, set0});
            return;
        }
        akzu0.l(fileParams0.c, fileParams0.d);
    }

    @Override  // alim
    public final void f(String s, Role role0) {
        ProximityAuthChimeraService.a.d("Unregistering device with ID %s for feature %s", new Object[]{akwe.a(s), role0.toString()});
        this.b.h(s, role0);
        akvq.b(this.a, this.b);
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        alij alij0;
        switch(v) {
            case 1: {
                this.c();
                parcel1.writeNoException();
                return true;
            }
            case 2: {
                IBinder iBinder0 = parcel0.readStrongBinder();
                if(iBinder0 == null) {
                    alij0 = null;
                }
                else {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.auth.proximity.internal.IProximityAuthCallbacks");
                    alij0 = (iInterface0 instanceof alij) ? ((alij)iInterface0) : new alih(iBinder0);
                }
                alil.gr(parcel0);
                this.b(alij0);
                parcel1.writeNoException();
                return true;
            }
            case 3: {
                RemoteDevice remoteDevice0 = (RemoteDevice)wbz.a(parcel0, RemoteDevice.CREATOR);
                Role role0 = (Role)wbz.a(parcel0, Role.CREATOR);
                alil.gr(parcel0);
                this.d(remoteDevice0, role0);
                parcel1.writeNoException();
                return true;
            }
            case 4: {
                String s = parcel0.readString();
                Role role1 = (Role)wbz.a(parcel0, Role.CREATOR);
                alil.gr(parcel0);
                this.f(s, role1);
                parcel1.writeNoException();
                return true;
            }
            case 5: {
                Role role2 = (Role)wbz.a(parcel0, Role.CREATOR);
                alil.gr(parcel0);
                List list0 = this.a(role2);
                parcel1.writeNoException();
                parcel1.writeTypedList(list0);
                return true;
            }
            case 6: {
                WireMessageParams wireMessageParams0 = (WireMessageParams)wbz.a(parcel0, WireMessageParams.CREATOR);
                alil.gr(parcel0);
                this.g(wireMessageParams0);
                parcel1.writeNoException();
                return true;
            }
            case 7: {
                FileParams fileParams0 = (FileParams)wbz.a(parcel0, FileParams.CREATOR);
                alil.gr(parcel0);
                this.e(fileParams0);
                parcel1.writeNoException();
                return true;
            }
            default: {
                return false;
            }
        }
    }

    @Override  // alim
    public final void g(WireMessageParams wireMessageParams0) {
        int v;
        akzn akzn0 = this.b;
        String s = wireMessageParams0.b;
        RemoteDevice remoteDevice0 = akzn0.b(s);
        if(remoteDevice0 == null) {
            ProximityAuthChimeraService.a.m("Unable to send message (deviceId=%s): not registered", new Object[]{s});
            return;
        }
        Set set0 = akzn0.f(s);
        Iterator iterator0 = set0.iterator();
        while(iterator0.hasNext()) {
            v = 5;
            Object object0 = iterator0.next();
            Role role0 = (Role)object0;
            if(!role0.b.equals(wireMessageParams0.d) || !Role.g(role0.c, 5)) {
                continue;
            }
            goto label_15;
        }
        v = 1;
    label_15:
        akzu akzu0 = akzn0.d(s, v);
        if(akzu0 == null) {
            ProximityAuthChimeraService.a.m("Unable to send message to %s (deviceId=%s) over medium %d for feature %s: not connected. Supported roles: %s", new Object[]{remoteDevice0.c, s, v, wireMessageParams0.d, set0});
            return;
        }
        akzu0.m(wireMessageParams0.c, wireMessageParams0.d);
    }
}

