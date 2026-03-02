import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;
import j..util.Objects;

public final class aabm {
    private final AccountParticleDisc a;
    private final fngs b;
    private final boolean c;

    public aabm(AccountParticleDisc accountParticleDisc0, fngs fngs0, boolean z) {
        gftb.check(accountParticleDisc0);
        this.a = accountParticleDisc0;
        this.b = fngs0;
        this.c = z;
    }

    public final void a(gfsx gfsx0) {
        String s3;
        AccountParticleDisc accountParticleDisc0 = this.a;
        if(!accountParticleDisc0.t()) {
            accountParticleDisc0.m(this.c);
            fntn fntn0 = new fntn();
            accountParticleDisc0.h(this.b, fntn0);
        }
        int v = 0;
        String s = null;
        if(gfsx0.i() && !((aatc)gfsx0.d()).b.isEmpty()) {
            String s1 = ((aatc)gfsx0.d()).b;
            String s2 = ((aatc)gfsx0.d()).c;
            boolean z = ((aatc)gfsx0.d()).e;
            fntm fntm0 = (fntm)accountParticleDisc0.j;
            if(fntm0 == null) {
                s3 = null;
            }
            else {
                s3 = fntm0.b;
                s = fntm0.c;
            }
            if(s1.equals(s) && Objects.equals(s2, s3)) {
                Object object0 = accountParticleDisc0.getTag(0x7F0B0BF2);  // id:as_particle_disc_url_hash
                if((object0 instanceof Integer)) {
                    v = (int)(((Integer)object0));
                }
                if(((aatc)gfsx0.d()).d != v) {
                    aabm.b(accountParticleDisc0, this.b);
                    accountParticleDisc0.setTag(0x7F0B0BF2, Integer.valueOf(((aatc)gfsx0.d()).d));  // id:as_particle_disc_url_hash
                }
                return;
            }
            if(!gfta.c(s1)) {
                fntl fntl0 = fntm.a();
                fntl0.b(s1);
                if(!gfta.c(s2)) {
                    fntl0.a = s2;
                }
                fntl0.d(z);
                accountParticleDisc0.l(fntl0.a());
            }
            accountParticleDisc0.setTag(0x7F0B0BF2, Integer.valueOf(((aatc)gfsx0.d()).d));  // id:as_particle_disc_url_hash
            aabm.b(accountParticleDisc0, this.b);
            return;
        }
        accountParticleDisc0.l(null);
        accountParticleDisc0.setTag(0x7F0B0BF2, Integer.valueOf(0));  // id:as_particle_disc_url_hash
    }

    private static void b(AccountParticleDisc accountParticleDisc0, fngs fngs0) {
        fntm fntm0 = (fntm)accountParticleDisc0.j;
        if(fntm0 != null) {
            fngs0.c(fntm0);
        }
        gftb.r(accountParticleDisc0.t(), "initialize must be called first");
        if(accountParticleDisc0.j != null) {
            fnxn.a(new fngb(accountParticleDisc0));
        }
    }
}

