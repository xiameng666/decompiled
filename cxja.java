public final class cxja implements kar {
    @Override  // kar
    public final void accept(Object object0) {
        cycj cycj0 = (cycj)object0;
        int v = (int)(((Number)cycj0.h.a()).longValue() - cycj0.j);
        cycj0.f.e(v, false);
        cycj0.f.f(v, false);
        cycj0.p.d().P("%s: onTempBondFailed, latency=%sms", "LeAudioSharingManager", v);
        ibuq.e(cyjh.a, "log");
        cycj0.p = cyjh.a;
    }
}

