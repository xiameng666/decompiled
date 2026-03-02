import android.content.Context;
import android.util.Pair;
import dagger.internal.Factory;
import dagger.internal.InstanceFactory;
import dagger.internal.Provider;
import java.io.File;

public final class fksb implements Factory {
    private final Provider a;
    private final Provider b;
    private final Provider c;
    private final Provider d;
    private final Provider e;
    private final Provider f;

    public fksb(Provider provider0, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        this.a = provider0;
        this.b = provider1;
        this.c = provider2;
        this.d = provider3;
        this.e = provider4;
        this.f = provider5;
    }

    @Override  // ibnf, ibne
    public final Object get() {
        fkrr fkrr0 = (fkrr)this.a.get();
        Object object0 = this.b.get();
        hhps hhps0 = (hhps)this.c.get();
        ggtl ggtl0 = (ggtl)this.d.get();
        Context context0 = (Context)((InstanceFactory)this.e).a;
        fgvt fgvt0 = (fgvt)this.f.get();
        gfur_Suppliers gfur0 = new gfur_Suppliers(Pair.create(Long.valueOf(fkrr0.b), fkrr0.c));
        File file0 = context0.getCacheDir();
        frce frce0 = new frce(context0);
        frce0.j();
        frce0.e("cgal.mdi.sync.moonlander." + hhps0.c);
        File file1 = new File(file0, frce0.a().toString());
        if(hhps0.d) {
            froe froe0 = new froe("evict_full_cache_trigger");
            froe0.c("AFTER INSERT ON infinite_data_cache");
            fklm.i(froe0, fkrr0.a);
            frof frof0 = froe0.a();
            froe froe1 = new froe("recursive_eviction_trigger");
            froe1.c("AFTER DELETE ON infinite_data_cache");
            fklm.i(froe1, fkrr0.a);
            frof frof1 = froe1.a();
            froc froc0 = new froc();
            frob.a("recursive_triggers = 1", froc0);
            frob.a("synchronous = 0", froc0);
            froa froa0 = new froa();
            froa0.c("CREATE TABLE infinite_data_cache(key_data BLOB PRIMARY KEY, value_state_data STRING NOT NULL, value_data BLOB, write_ms INTEGER NOT NULL, access_ms INTEGER NOT NULL)");
            froa0.c("ALTER TABLE infinite_data_cache ADD COLUMN build_id LONG NOT NULL DEFAULT 0");
            froa0.c("ALTER TABLE infinite_data_cache ADD COLUMN variant_id STRING NOT NULL DEFAULT \'NA\'");
            froa0.c("CREATE INDEX access ON infinite_data_cache(access_ms)");
            froa0.c("CREATE INDEX write ON infinite_data_cache(write_ms)");
            froa0.d(frof0);
            froa0.d(frof1);
            froa0.a = froc0;
            froh froh0 = froa0.a();
            gful_cronetEngineProvider gful0 = gfus.a(((gful_cronetEngineProvider)new fkll(((frmy)object0).a(new fklk(), froh0, file1.getAbsolutePath()), file1, ggtl0)));
            gmcd gmcd0 = (gmcd)gful0.mr();
            return new fklm(gful0, fgvt0, ((gful_cronetEngineProvider)gfur0));
        }
        fkks fkks0 = new fkks();
        fkks0.a = (frmy)object0;
        fkks0.b = file1;
        fkks0.c = fgvt0;
        fkks0.d = fkrr0.a;
        fkks0.e = gfur0;
        fkks0.f = ggtl0;
        fkks0.g = false;
        fkks0.b();
        return fkks0.a();
    }
}

