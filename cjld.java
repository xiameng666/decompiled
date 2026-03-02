public final class cjld implements evpo {
    public final cjlv a;
    public final int b;
    public final String c;
    public final fsdx d;
    public final hakh e;

    public cjld(cjlv cjlv0, int v, String s, fsdx fsdx0, hakh hakh0) {
        this.a = cjlv0;
        this.b = v;
        this.c = s;
        this.d = fsdx0;
        this.e = hakh0;
    }

    @Override  // evpo
    public final Object a(evql evql0) {
        if(!evql0.n()) {
            return evrg.d(hama.f);
        }
        Object object0 = evql0.j();
        hama hama0 = hama.b;
        if(object0 != hama0) {
            return evrg.d(evql0.j());
        }
        if(hwnj.k()) {
            return evrg.d(hama0);
        }
        hakh hakh0 = this.e;
        fsdx fsdx0 = this.d;
        String s = this.c;
        cjlv cjlv0 = this.a;
        haet haet0 = haes.a(((ProtoLiteMessage)haki.a).v_newBuilder());
        haet0.b(hakg.b);
        haet0.h();
        haet0.f(this.b);
        if(s == null) {
            s = "";
        }
        haet0.g(s);
        haet0.e(fsdx0.c());
        haet0.d(true);
        haet0.c(hakh0);
        return cjlv0.f(haet0.a()).e(new cjlh());
    }
}

