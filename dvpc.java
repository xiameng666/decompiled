import android.graphics.Bitmap;
import android.os.Bundle;

public final class dvpc {
    public static final dvpd a(Bitmap bitmap0, String s, gucv gucv0) {
        ibuq.f(bitmap0, "bitmap");
        dvpd dvpd0 = new dvpd();
        dvpd0.ai = bitmap0;
        Bundle bundle0 = new Bundle();
        bundle0.putString("disclaimer", s);
        bundle0.putByteArray("attachments-template-info", (gucv0 == null ? null : gucv0.toBytesArray()));
        dvpd0.setArguments(bundle0);
        return dvpd0;
    }
}

