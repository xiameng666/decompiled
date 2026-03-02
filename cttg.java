import com.google.android.gms.nearby.presence.PresenceDevice;

final class cttg implements icih {
    final cttl a;

    public cttg(cttl cttl0) {
        this.a = cttl0;
        super();
    }

    @Override  // icih
    public final Object a(Object object0, ibrl ibrl0) {
        cttl cttl0 = this.a;
        PresenceDevice presenceDevice0 = cttl0.c;
        if(!ibuq.m(cttl0.i.b(), ctor.a)) {
            return ibom.a;
        }
        cuwu cuwu0 = cuwu.b(((byte[])object0));
        cttl0.a.j(presenceDevice0, cuwu0);
        return ibom.a;
    }
}

