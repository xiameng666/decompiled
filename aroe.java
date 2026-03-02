public final class aroe implements evpo {
    public final aroh a;

    public aroe(aroh aroh0) {
        this.a = aroh0;
    }

    @Override  // evpo
    public final Object a(evql evql0) {
        aroh aroh0 = this.a;
        boolean z = false;
        if(evql0.n()) {
            arot.a.h("CheckEmoneyCardPresenceTask succeeded.", new Object[0]);
            aroh0.b.d.j(true);
            byte[] arr_b = (byte[])evql0.j();
            hftc hftc0 = hftc.a();
            ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)dyfy.a), arr_b, 0, arr_b.length, hftc0);
            ProtoLiteMessage.P_makeImmutable(hftv0);
            if(((dyfy)hftv0).b == 17) {
                z = ((Boolean)((dyfy)hftv0).c).booleanValue();
            }
            return aroh0.a(z);
        }
        arot.a.h("CheckEmoneyCardPresenceTask failed.", new Object[0]);
        aroh0.b.d.j(false);
        return aroh0.a(false);
    }
}

