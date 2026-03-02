import android.database.sqlite.SQLiteException;
import j..util.Collection.-EL;
import java.util.List;

public final class ahdx implements bxmw {
    public final aheo a;

    public ahdx(aheo aheo0) {
        this.a = aheo0;
    }

    @Override  // bxmw
    public final gmcd a() {
        try {
            ahby ahby0 = new ahby(((ahcf)this.a.b), this.a.k);
            this.a.m = gged_interceptors.i(((List)oqj.b(((ahcf)this.a.b).a, false, true, ahby0)));
            this.a.l = (gged_interceptors)Collection.-EL.stream(this.a.m).map(new aheh()).collect(ggaf.a);
            return gmbu.i(gfsx.m(bxre.g));
        }
        catch(SQLiteException sQLiteException0) {
            throw bxma.g(0x6F35, sQLiteException0);
        }
    }
}

