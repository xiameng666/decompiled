import com.google.android.gms.nearby.presence.PresenceDevice;
import com.google.android.gms.nearby.presence.RangingData;

public final class cttx extends dasi {
    final cttz a;

    public cttx(cttz cttz0) {
        this.a = cttz0;
        super();
    }

    @Override  // dasi
    public final void a(PresenceDevice presenceDevice0) {
        ibuq.f(presenceDevice0, "device");
        cttz cttz0 = this.a;
        iced iced0 = (iced)cttz0.f.remove(presenceDevice0);
        if(iced0 != null) {
            iceb.a(iced0);
        }
        cttl cttl0 = new cttl(((ctnt)cttz0.h.a.a).a(), ccmb.a(), presenceDevice0);
        icfg icfg0 = new icfg(null);
        ctoq ctoq0 = new ctoq(cttl0, cttz0.a.plus(icfg0));
        cttz0.d.put(presenceDevice0, ctoq0);
        cttz0.e.put(presenceDevice0, cttl0);
        icck icck0 = cttz0.c;
        if(icck0 != null) {
            icbb.b(icck0, null, null, new cttt(cttz0, ctoq0, null), 3);
        }
    }

    @Override  // dasi
    public final void b(PresenceDevice presenceDevice0) {
        ibuq.f(presenceDevice0, "device");
        cttz cttz0 = this.a;
        ctoq ctoq0 = (ctoq)cttz0.d.get(presenceDevice0);
        if(ctoq0 == null) {
            return;
        }
        Object object0 = cttz0.e.get(presenceDevice0);
        if(object0 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        icck icck0 = cttz0.c;
        if(icck0 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        iced iced0 = icbb.b(icck0, null, null, new cttw(((ctox)object0), cttz0, presenceDevice0, ctoq0, null), 3);
        cttz0.f.put(presenceDevice0, iced0);
    }

    @Override  // dasi
    public final void c(PresenceDevice presenceDevice0) {
        ibuq.f(presenceDevice0, "device");
    }

    @Override  // dasi
    public final void d(PresenceDevice presenceDevice0, RangingData rangingData0) {
        ibuq.f(presenceDevice0, "device");
        ibuq.f(rangingData0, "rangingData");
    }

    @Override  // dasi
    public final void e(PresenceDevice presenceDevice0) {
        ibuq.f(presenceDevice0, "device");
    }

    @Override  // dasi
    public final void f(int v) {
    }
}

