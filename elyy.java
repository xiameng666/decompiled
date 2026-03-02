import android.content.Context;
import com.google.android.gms.chimera.modules.semanticlocation.AppContextProvider;
import com.google.android.gms.common.Feature;

final class elyy extends gfvk {
    @Override  // gfvk
    public final Object a(Object object0) {
        if(bbqt.a()) {
            return (String)object0;
        }
        Context context0 = AppContextProvider.a();
        admk admk0 = new admk(context0);
        String s = acso.e(context0, ((String)object0));
        azzc azzc0 = new azzc();
        azzc0.c = new Feature[]{acrv.h};
        azzc0.a = new admg(admk0, s);
        azzc0.d = 0x671;
        return (String)((glyq)fhra.b(admk0.jn(azzc0.a()))).u();
    }
}

