import com.google.android.gms.auth.proximity.RemoteDevice;
import com.google.android.gms.auth.proximity.Role;
import com.google.android.gms.auth.proximity.firstparty.SyncedCryptauthDevice;
import com.google.android.gms.chimera.modules.auth.proximity.AppContextProvider;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public final class alad {
    private final akzc a;
    private final Set b;
    private final String c;
    private boolean d;

    public alad(String s) {
        akzc akzc0 = new akzc(AppContextProvider.a());
        super();
        this.b = new HashSet();
        this.a = akzc0;
        this.c = s;
    }

    public final List a() {
        return gged_interceptors.i(this.b);
    }

    public final void b(akyo akyo0, List list0) {
        synchronized(alad.class) {
            for(Object object0: list0) {
                ArrayList arrayList0 = new ArrayList();
                RemoteDevice remoteDevice0 = new RemoteDevice(3, RemoteDevice.a(((SyncedCryptauthDevice)object0).a), ((SyncedCryptauthDevice)object0).c, ((SyncedCryptauthDevice)object0).b, ((SyncedCryptauthDevice)object0).a, ((SyncedCryptauthDevice)object0).d, arrayList0, ((SyncedCryptauthDevice)object0).i, ((SyncedCryptauthDevice)object0).o);
                this.b.add(remoteDevice0);
                Role role0 = this.d();
                this.a.c(remoteDevice0, role0);
            }
            if(!this.d) {
                this.d = true;
                this.a.f(akyo0);
            }
        }
    }

    public final void c(akyo akyo0) {
        synchronized(alad.class) {
            Set set0 = this.b;
            for(Object object0: set0) {
                Role role0 = this.d();
                this.a.e(((RemoteDevice)object0).b, role0);
            }
            set0.clear();
            if(this.d) {
                this.d = false;
                azyd_linstner azyd0 = azyg.a(akyo0, "akzc");
                this.a.iJ(azyd0);
            }
        }
    }

    private final Role d() {
        return new Role(this.c, 0x300);
    }
}

