import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import com.google.android.gms.chimera.modules.trustagent.AppContextProvider;
import j..util.Collection.-EL;
import j..util.function.Predicate.-CC;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.function.Supplier;

public final class ezil {
    static final Supplier a;
    public final lqi b;
    public ezck c;
    public final ccmg d;
    public static final int e;
    private final Context f;

    static {
        ezic ezic0 = bbqa.c() ? new ezic() : new ezid();
        ezil.a = ezic0;
        bboh.b("TrustAgent", bbcu.aR);
    }

    public ezil() {
        this.f = AppContextProvider.a();
        this.b = new lqi(ggnj.a);
        this.d = new ccmp();
    }

    public final void a() {
        gged_interceptors gged0;
        ezck ezck0 = this.c;
        if(ezck0 == null) {
            return;
        }
        if(ezka.j()) {
            Set set0 = ezck0.b();
            gged0 = set0 == null ? ggna.a : ((gged_interceptors)Collection.-EL.stream(set0).filter(new ezie()).map(new ezif()).filter(new ezig()).collect(ggaf.a));
        }
        else {
            gged0 = ggna.a;
        }
        Context context0 = this.f;
        BluetoothAdapter bluetoothAdapter0 = bahu.a(context0);
        gged_interceptors gged1 = (gged_interceptors)Collection.-EL.stream(gged0).filter(Predicate.-CC.not(new ezih())).map(new ezii(bluetoothAdapter0, ezck0)).filter(new ezij()).map(new ezik()).collect(ggaf.a);
        if(bbqa.c()) {
            ((ezgj)ezil.a.get()).a(context0).z(new ezib(this, gged1));
            return;
        }
        LinkedHashSet linkedHashSet0 = new LinkedHashSet(gged1);
        this.b.l(linkedHashSet0);
    }
}

