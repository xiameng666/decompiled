public final class feho implements glzn {
    public final fehs a;

    public feho(fehs fehs0) {
        this.a = fehs0;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        Void void0 = (Void)object0;
        this.a.f.b("Attempting to offload socket");
        feox feox0 = new feox(ByteString.copyFrom(this.a.f.a), ByteString.copyFrom(this.a.f.a));
        ffmn.a("McuManager", "startOffloadConnection: %s", new Object[]{feox0.a()});
        feqm feqm0 = (feqm)this.a.f.d;
        feqm0.b();
        feob feob0 = new feob(((long)(((Long)feqm0.s.a()))));
        if(feqm0.j.getAndSet(feob0) != null) {
            ffmn.f("McuManager", "startOffloadConnection: old connectionId dropped", new Object[0]);
        }
        ffmn.a("McuManager", "startOffloadConnection: currentConnection:%s", new Object[]{feob0});
        fepp fepp0 = new fepp(feqm0, feob0, feox0);
        return feqm0.h.a(fepp0);
    }
}

