import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.database.Cursor;
import j..util.Objects;
import j..util.Optional;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutionException;

public final class fecz implements Runnable {
    public final fedp a;

    public fecz(fedp fedp0) {
        this.a = fedp0;
    }

    @Override
    public final void run() {
        fdpl fdpl0;
        fedp fedp0 = this.a;
        if(fedp0.f) {
            try {
                ggfp ggfp0 = (ggfp)((glyq)gmbu.m(new ffeu(fedp0.h), clhl.b.b(clhr.b))).u();
                fedp0.i.set(ggfp0);
            }
            catch(ExecutionException | InterruptedException exception0) {
                ffmn.c("AppCatalogService", exception0, "init - Failed to get remote trusted app keys.", new Object[0]);
            }
            Set set0 = (Set)fedp0.i.get();
            fedp0.m.lock();
            try {
                Context context0 = fedp0.b;
                List list0 = context0.getPackageManager().getInstalledPackages(0x40);
                HashSet hashSet0 = new HashSet();
                for(Object object0: list0) {
                    PackageInfo packageInfo0 = (PackageInfo)object0;
                    try {
                        fdpl0 = fdpn.b(context0, packageInfo0.packageName, packageInfo0);
                    }
                    catch(PackageManager.NameNotFoundException | IllegalArgumentException exception1) {
                        ffmn.c("AppKeyUtils", exception1, "getAppKeysForAllInstalledPackages - Could not construct AppKey for package: %s", new Object[]{packageInfo0.packageName});
                        continue;
                    }
                    hashSet0.add(fdpl0);
                }
                HashSet hashSet1 = ggog.g(ggfp.G(hashSet0));
                hashSet1.addAll(set0);
                Objects.requireNonNull(hashSet1);
                fedk fedk0 = new fedk(hashSet1);
                fedp0.e.ifPresent(fedk0);
                fedp0.j.f(fedp0.g, hashSet1);
                fedp0.d();
            }
            catch(Throwable throwable0) {
                fedp0.m.unlock();
                throw throwable0;
            }
            fedp0.m.unlock();
            fedp0.h.h.add(fedp0);
            return;
        }
        fecw fecw0 = fedp0.j;
        fecw0.d.lock();
        try {
            if(fecw0.b.isPresent()) {
                ffmn.f("AppCatalogData", "DataStore has already been initialized.", new Object[0]);
            }
            else {
                frie frie0 = frif.a();
                frie0.e(((MessageLite)fexe.a));
                frce frce0 = new frce(fecw0.a);
                frce0.d("wearable");
                frce0.e("app_catalogs.pb");
                frie0.f(frce0.a());
                frif frif0 = frie0.a();
                fecw0.b = Optional.of(cjtb.a.a(frif0));
            }
        }
        finally {
            fecw0.d.unlock();
        }
        fedp0.m.lock();
        try(Cursor cursor0 = fedp0.c.c(fedp0.d, fedq.a)) {
            cursor0.moveToFirst();
            while(true) {
                if(cursor0.isAfterLast()) {
                    break;
                }
                fduq fduq0 = fdur.f(cursor0);
                if(!fedp0.g.equals(fduq0.e)) {
                    fedp0.c(fduq0);
                }
            }
        }
        catch(Throwable throwable1) {
            fedp0.m.unlock();
            throw throwable1;
        }
        fedp0.m.unlock();
        fedp0.c.D(fedp0);
    }
}

