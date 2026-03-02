import com.google.android.gms.nearby.presence.PresenceDevice;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Map;

public final class ctux extends cvxe {
    final ctuy a;
    final icmn b;

    public ctux(ctuy ctuy0, icmn icmn0) {
        this.a = ctuy0;
        this.b = icmn0;
        super();
    }

    @Override  // cvxe
    public final void a(cuwd cuwd0, cuuz cuuz0) {
        ibuq.f(((PresenceDevice)cuwd0), "device");
    }

    @Override  // cvxe
    public final void b(cuwd cuwd0, cuvf cuvf0) {
        ibuq.f(((PresenceDevice)cuwd0), "device");
        String s = ((PresenceDevice)cuwd0).f;
        ctuy ctuy0 = this.a;
        Map map0 = ctuy0.e;
        if(map0.containsKey(s)) {
            throw new IllegalStateException("Check failed.");
        }
        icck icck0 = ctuy0.c;
        if(icck0 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        map0.put(s, icbb.b(icck0, null, null, new ctuw(ctuy0, ((PresenceDevice)cuwd0), this.b, null), 3));
    }

    @Override  // cvxe
    public final void c(cuwd cuwd0, cuvl cuvl0) {
        ibuq.f(((PresenceDevice)cuwd0), "device");
        ctuy ctuy0 = this.a;
        bboh bboh0 = ctuy0.b;
        if(cuvl0.a.e()) {
            ((ggtj)bboh0.h()).x("Connection successful");
            return;
        }
        ((ggtj)bboh0.j()).x("Connection failed");
        iced iced0 = (iced)ctuy0.e.remove(((PresenceDevice)cuwd0).f);
        if(iced0 != null) {
            iceb.a(iced0);
        }
    }

    @Override  // cvxe
    public final void d(cuwd cuwd0) {
        ibuq.f(((PresenceDevice)cuwd0), "device");
        String s = ((PresenceDevice)cuwd0).f;
        ctuy ctuy0 = this.a;
        iced iced0 = (iced)ctuy0.e.remove(s);
        if(iced0 != null) {
            iceb.a(iced0);
        }
        ibuq.e(s, "getEndpointId(...)");
        ibuq.f(s, "deviceId");
        LinkedHashMap linkedHashMap0 = new LinkedHashMap();
        for(Object object0: ctuy0.f.a.entrySet()) {
            Map.Entry map$Entry0 = (Map.Entry)object0;
            if(ibuq.m(((yke)map$Entry0.getKey()).a, s)) {
                linkedHashMap0.put(map$Entry0.getKey(), map$Entry0.getValue());
            }
        }
        for(Object object1: linkedHashMap0.entrySet()) {
            iccl.i(((icck)((Map.Entry)object1).getValue()));
        }
    }
}

