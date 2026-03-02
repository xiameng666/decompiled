import android.content.Context;
import com.google.android.gms.auth.blockstore.DeleteBytesRequest;
import com.google.android.gms.auth.blockstore.RetrieveBytesRequest;
import com.google.android.gms.auth.blockstore.StoreBytesData;
import com.google.android.gms.common.Feature;

public final class aipl extends azts implements aimj {
    public static final byte[] a;
    private static final azta_api b;
    private static final azss c;
    private static final azsy d;

    static {
        azss azss0 = new azss();
        aipl.c = azss0;
        aipl.a = new byte[0];
        aipj aipj0 = new aipj();
        aipl.d = aipj0;
        aipl.b = new azta_api("Blockstore.API", aipj0, azss0);
    }

    public aipl(Context context0) {
        super(context0, aipl.b, azsv.s, aztr_settings.a);
    }

    @Override  // aimj
    public final evql b(DeleteBytesRequest deleteBytesRequest0) {
        azzc azzc0 = new azzc();
        azzc0.c = new Feature[]{amjw.g};
        azzc0.a = new aipd(this, deleteBytesRequest0);
        azzc0.b = false;
        azzc0.d = 0x685;
        return this.jn(azzc0.a());
    }

    @Override  // aimj
    public final evql c(RetrieveBytesRequest retrieveBytesRequest0) {
        azzc azzc0 = new azzc();
        azzc0.c = new Feature[]{amjw.h};
        azzc0.a = new aipg(this, retrieveBytesRequest0);
        azzc0.b = false;
        azzc0.d = 0x684;
        return this.iG(azzc0.a());
    }

    @Override  // aimj
    public final evql d(StoreBytesData storeBytesData0) {
        azzc azzc0 = new azzc();
        azzc0.c = new Feature[]{amjw.d, amjw.f};
        azzc0.a = new aipe(this, storeBytesData0);
        azzc0.d = 0x66D;
        azzc0.b = false;
        return this.jn(azzc0.a());
    }
}

