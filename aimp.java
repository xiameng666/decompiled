import android.content.pm.PackageInfo;
import java.util.ArrayList;
import java.util.List;

public final class aimp implements glzn {
    public final aink a;

    public aimp(aink aink0) {
        this.a = aink0;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        aink aink0 = this.a;
        if(((ajbj)object0) == ajbj.b && hprv.g()) {
            ajab ajab0 = ajab.a().a();
            return glzd.g(gmbt.h(glzd.g(gmbt.h(aink0.h.c(ajab0)), new aini(aink0), gmap.a)), new aims(), gmap.a);
        }
        if(!hprv.h()) {
            ((ggtj)aink.a.h()).x("snapshotInstalledPackagesAfterRestore disabled, skipping initial snapshotting.");
            return gmbx.a;
        }
        gmcd gmcd0 = gmbx.a;
        if(!hprv.a.f().k()) {
            aiuc aiuc0 = aink0.f;
            gmcg gmcg0 = aink0.k;
            bboh bboh0 = aiun.a;
            ((ggtj)bboh0.h()).x("Checking for already-installed packages");
            List list0 = aink0.i.getPackageManager().getInstalledPackages(0);
            ArrayList arrayList0 = new ArrayList();
            for(Object object1: list0) {
                arrayList0.add(glzd.g(gmbt.h(aiuc0.c(((PackageInfo)object1).packageName)), new aiul(((PackageInfo)object1), aiuc0), gmcg0));
            }
            ((ggtj)bboh0.h()).z("Updated access level for %s already-installed packages.", list0.size());
            gmcd0 = gmbu.c(arrayList0).b(new aium(), gmcg0);
        }
        return glzd.g(gmbt.h(gmcd0), new aimy(aink0), aink0.k);
    }
}

