import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.auth.proximity.Role;
import com.google.android.gms.auth.proximity.firstparty.FirstPartyDeviceRegistrationChimeraService;
import com.google.android.gms.common.api.Status;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public final class aldz extends cjtm {
    private final azxs a;
    private final String b;
    private final Role c;
    private final alij d;

    public aldz(azxs azxs0, String s, Role role0, alij alij0, azug azug0) {
        super(0x90, "AddChannelCallback", azug0);
        batl.s(azxs0);
        this.a = azxs0;
        this.b = s;
        this.c = role0;
        this.d = alij0;
    }

    @Override  // cjtm
    public final void f(Context context0) {
        Status status0;
        String s = this.b;
        if(s != null && !s.isEmpty()) {
            alij alij0 = this.d;
            if(alij0 != null) {
                Role role0 = this.c;
                if(algb.c(role0)) {
                    azox azox0 = new azox();
                    alfd alfd0 = FirstPartyDeviceRegistrationChimeraService.a(azox0, context0);
                    if(alfd0 == null) {
                        this.a.a(Status.d);
                        return;
                    }
                    azxs azxs0 = this.a;
                    String s1 = role0.b;
                    FirstPartyDeviceRegistrationChimeraService.a.d("Adding callback for " + s1, new Object[0]);
                    FirstPartyDeviceRegistrationChimeraService firstPartyDeviceRegistrationChimeraService0 = alfd0.a;
                    if(firstPartyDeviceRegistrationChimeraService0.b.b.i(s, role0.a())) {
                        synchronized(firstPartyDeviceRegistrationChimeraService0.d) {
                            alee alee0 = firstPartyDeviceRegistrationChimeraService0.e;
                            batl.b(((boolean)("tqcf".equals(s1) ^ 1)));
                            algz algz0 = alee0.a(s, role0.a());
                            if(algz0 != null) {
                                try {
                                    for(Object object1: algz0.a) {
                                        ((algx)object1).a(alij0, s1);
                                    }
                                }
                                catch(RemoteException unused_ex) {
                                    status0 = Status.b;
                                    azxs0.a(status0);
                                    bbic.a().b(context0, azox0);
                                    return;
                                }
                            }
                            aled aled0 = new aled(s, s1, role0.a());
                            Map map0 = alee0.a;
                            Set set0 = map0.containsKey(aled0) ? ((Set)map0.get(aled0)) : new HashSet();
                            set0.add(alij0);
                            map0.put(aled0, set0);
                            status0 = Status.b;
                        }
                    }
                    else {
                        status0 = Status.d;
                    }
                    azxs0.a(status0);
                    bbic.a().b(context0, azox0);
                    return;
                }
            }
        }
        this.a.a(Status.d);
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.a.a(status0);
    }
}

