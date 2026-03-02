import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;

public final class aacm implements ibts {
    public final gra a;
    public final gfsx b;
    public final boolean c;
    public final ibth d;
    public final String e;

    public aacm(gra gra0, gfsx gfsx0, boolean z, ibth ibth0, String s) {
        this.a = gra0;
        this.b = gfsx0;
        this.c = z;
        this.d = ibth0;
        this.e = s;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        ibuq.f(((AccountParticleDisc)object0), "particleDiscView");
        aabm aabm0 = (aabm)this.a.a();
        if(aabm0 != null) {
            aabm0.a(this.b);
        }
        if(this.c) {
            ibth ibth0 = this.d;
            if(ibth0 != null) {
                ((AccountParticleDisc)object0).setOnClickListener(new aack(ibth0));
                ((AccountParticleDisc)object0).setContentDescription(this.e);
                ((AccountParticleDisc)object0).setImportantForAccessibility(1);
            }
        }
        return ibom.a;
    }
}

