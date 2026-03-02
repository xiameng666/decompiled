import android.content.Context;
import android.os.Bundle;

public final class aary {
    public final Context a;
    public final aaln b;
    public final aarq c;
    public final lqi d;
    public final lqi e;
    public final lqi f;
    public final lqd g;
    public final lqd h;
    public final lqd i;
    public final lqd j;
    public final lqd k;
    public final lqd l;
    public final aaon m;
    private final lqd n;

    public aary(Context context0, Bundle bundle0, aaln aaln0, aaon aaon0) {
        ibuq.f(bundle0, "arguments");
        grut grut0;
        ibuq.f(aaln0, "accountModel");
        ibuq.f(aaon0, "navStackModel");
        super();
        this.a = context0;
        this.b = aaln0;
        this.m = aaon0;
        ibuq.f(bundle0, "bundle");
        byte[] arr_b = bundle0.getByteArray("appBarKey");
        if(arr_b == null) {
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)grut.a).v_newBuilder();
            ibuq.f(hftp0, "builder");
            ProtoLiteMessage hftv1 = hftp0.N_build();
            ibuq.e(hftv1, "build(...)");
            grut0 = (grut)hftv1;
        }
        else {
            ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)grut.a), arr_b, 0, arr_b.length, hftc.a);
            ProtoLiteMessage.P_makeImmutable(hftv0);
            grut0 = (grut)hftv0;
        }
        ibuq.c(grut0);
        aarq aarq0 = new aarq(grut0, bundle0.getBoolean("isPlaceholder"), bundle0.getBoolean("isTrampoline"), bundle0.getBoolean("animateParticleDisc"));
        this.c = aarq0;
        lqi lqi0 = new lqi(aarq0.a);
        this.d = lqi0;
        ibuq.e(aaln0.d, "getParticleDiscData(...)");
        lqd lqd0 = lsa.a(aaln0.d);
        this.n = lqd0;
        lqi lqi1 = new lqi(Boolean.valueOf(aarq0.d));
        this.e = lqi1;
        lqi lqi2 = new lqi(fhru.a);
        this.f = lqi2;
        this.g = lsa.b(lqi0, new aarr());
        this.h = lsa.b(lqi0, new aars(this));
        this.i = lsa.b(lqi1, new aart(this));
        this.j = lsa.b(lqi0, new aaru());
        this.k = new zhd(lqi0, lqd0, new aarv(this));
        this.l = lqi2;
        aarx aarx0 = new aarx(new aarw(this));
        aaon0.j.ih(aarx0);
    }

    public final void a(String s) {
        if(s != null) {
            aaln aaln0 = this.b;
            aaon aaon0 = this.m;
            aaln0.l.l(aaon0.b().c);
            if(bxic.e(cchj.b(this.a), s)) {
                aaon0.c();
                aaln0.m(s);
                aaln0.j();
                aaln0.i(aaon0.b());
            }
        }
    }
}

