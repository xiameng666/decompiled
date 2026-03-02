import android.content.Context;
import android.net.Uri;
import java.io.IOException;
import java.util.List;

public final class bwtn {
    public final frli a;

    public bwtn(Context context0) {
        frce frce0 = new frce(context0);
        frce0.d("icing");
        frce0.e("ClientCacheRecordStore.pb");
        Uri uri0 = frce0.a();
        frie frie0 = frif.a();
        frie0.f(uri0);
        frie0.e(((MessageLite)bwla.a));
        frif frif0 = frie0.a();
        this.a = cjtb.a.a(frif0);
    }

    final void a(List list0) {
        bwtm bwtm0 = new bwtm(list0);
        gmbs.b(this.a.b(bwtm0, gmap.a), IOException.class);
    }
}

