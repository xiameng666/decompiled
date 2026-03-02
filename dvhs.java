import com.google.android.apps.miphone.aiai.walletsuggestions.schema.WalletLocationsDocument;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class dvhs implements glzn {
    public final dvhw a;
    public final boolean b;
    public final ggfp c;

    public dvhs(dvhw dvhw0, boolean z, ggfp ggfp0) {
        this.a = dvhw0;
        this.b = z;
        this.c = ggfp0;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        if(this.b) {
            afz afz0 = new afz();
            afz0.b();
            List list0 = Arrays.asList(new Class[]{WalletLocationsDocument.class});
            kay.i(list0);
            afz0.b();
            ArrayList arrayList0 = new ArrayList(list0.size());
            aev aev0 = aev.b();
            for(Object object1: list0) {
                arrayList0.add(aev0.a(((Class)object1)).d());
            }
            afz0.c(arrayList0);
            return ((aet)object0).i(afz0.a());
        }
        afo afo0 = new afo("default");
        afo0.b(this.c);
        return glzd.f(((aet)object0).f(afo0.a()), new dvhu(), this.a.d);
    }
}

