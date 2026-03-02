import com.google.android.gms.chimera.modules.tapandpay.AppContextProvider;
import java.util.List;

public final class eswt {
    public final eswy a() {
        eswy eswy1;
        eswy eswy0 = eswy.c;
        if(eswy0 == null) {
            synchronized(this) {
                eswy1 = eswy.c;
                if(eswy1 == null) {
                    eswy1 = new eswy(new etmv(AppContextProvider.a(), eset.e(AppContextProvider.a())), new dyct());
                    eswy.c = eswy1;
                }
            }
            return eswy1;
        }
        return eswy0;
    }

    public static final String b(List list0) {
        ibuq.f(list0, "frames");
        return ibpo.aK(list0, "", null, null, new esws(), 30);
    }
}

