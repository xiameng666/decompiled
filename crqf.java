import j..util.Objects;

final class crqf implements Runnable {
    final crqr a;
    final crqq b;

    public crqf(crqq crqq0, crqr crqr0) {
        this.a = crqr0;
        Objects.requireNonNull(crqq0);
        this.b = crqq0;
        super();
    }

    @Override
    public final void run() {
        crqq crqq0 = this.b;
        crqq0.E();
        crqq0.h = new crka(crqq0);
        crdg crdg0 = new crdg(crqq0);
        crdg0.aB();
        crqq0.b = crdg0;
        crcu crcu0 = crqq0.n();
        batl.s(crqq0.a);
        crcu0.a = crqq0.a;
        crpb crpb0 = this.a.c(crqq0);
        crpb0.aB();
        crqq0.g = crpb0;
        crcm crcm0 = new crcm(crqq0);
        crcm0.aB();
        crqq0.e = crcm0;
        crnn crnn0 = this.a.b(crqq0);
        crnn0.aB();
        crqq0.f = crnn0;
        crpx crpx0 = this.a.d(crqq0);
        crpx0.aB();
        crqq0.d = crpx0;
        crqq0.c = new crjp(crqq0);
        if(crqq0.n != crqq0.o) {
            crqq0.aJ().c.c("Not all upload components initialized", Integer.valueOf(crqq0.n), Integer.valueOf(crqq0.o));
        }
        crqq0.j.set(true);
        crqq0.aJ().k.a("UploadController is now fully initialized");
        crqq0.E();
        crqq0.o().L();
        crdg crdg1 = crqq0.o();
        crdg1.n();
        crdg1.aA();
        if(crdg1.W()) {
            crie crie0 = crif.ao;
            if(((long)(((Long)crie0.a()))) != 0L) {
                int v = crdg1.g().delete("trigger_uris", "abs(timestamp_millis - ?) > cast(? as integer)", new String[]{String.valueOf(System.currentTimeMillis()), String.valueOf(crie0.a())});
                if(v > 0) {
                    crdg1.aJ().k.b("Deleted stale trigger uris. rowsDeleted", Integer.valueOf(v));
                }
            }
        }
        if(crqq0.g.d.a() == 0L) {
            crju crju0 = crqq0.g.d;
            crqq0.av();
            crju0.b(System.currentTimeMillis());
        }
        crqq0.ae();
    }
}

