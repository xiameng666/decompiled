import j..util.Collection.-EL;
import java.util.List;

public final class ahdt implements bxmw {
    public final aheo a;

    public ahdt(aheo aheo0) {
        this.a = aheo0;
    }

    @Override  // bxmw
    public final gmcd a() {
        aheo aheo0 = this.a;
        ggfp ggfp0 = (ggfp)Collection.-EL.stream(aheo0.j).map(new aheb()).collect(ggaf.b);
        boolean z = true;
        boolean z1 = ggfp0.equals(ggfp.G(((List)oqj.b(((ahcf)aheo0.b).a, true, false, new ahca()))));
        gged_interceptors gged0 = ggfp0.v();
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append("SELECT obfuscated_gaia_id as obfuscatedGaiaId, COUNT(*) as batchSize FROM VerifiableCredentialEntity WHERE obfuscated_gaia_id IN (");
        oqr.a(stringBuilder0, (gged0 == null ? 1 : gged0.size()));
        stringBuilder0.append(") GROUP BY obfuscated_gaia_id");
        ahec ahec0 = new ahec();
        if(((int)(((Integer)oqj.b(((ahcf)aheo0.b).a, true, false, new ahcb(aheo0.d.c() + hplc.a.b().c() * 3600L))))) <= 0 && z1 && !Collection.-EL.stream(((List)oqj.b(((ahcf)aheo0.b).a, true, false, new ahbx(stringBuilder0.toString(), gged0)))).anyMatch(ahec0)) {
            z = false;
        }
        aheo0.i = z;
        return z ? gmbu.i(gfsx.m(bxre.h)) : aheo0.e.c();
    }
}

