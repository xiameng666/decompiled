import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Paint;
import android.util.Base64;
import com.google.android.gms.chimera.modules.fido.AppContextProvider;
import com.google.android.gms.fido.credentialstore.KeyMetadata;

public final class bmpm {
    public static gfsx a(blpi blpi0) {
        if(blpi0 != null) {
            blpi0.b();
            KeyMetadata keyMetadata0 = (KeyMetadata)blpi0.b().d();
            Bitmap bitmap0 = keyMetadata0.e;
            if(bitmap0 != null) {
                bitmap0 = bbrs.a(AppContextProvider.a(), bitmap0, new Paint());
            }
            else if(hsvs.j()) {
                bitmap0 = BitmapFactory.decodeResource(AppContextProvider.a().getResources(), 0x7F080A74);
            }
            String s = bmpm.b(blpi0.r());
            return bitmap0 == null ? gfsx.m(bmpf.a(keyMetadata0.c, keyMetadata0.b, 0x7F0805E6, null, s, 1)) : gfsx.m(bmpf.a(keyMetadata0.c, keyMetadata0.b, 0, bitmap0, s, 1));  // drawable:gs_passkey_fill1_vd_theme_24
        }
        return gfqx.a;
    }

    public static String b(byte[] arr_b) {
        return Base64.encodeToString(arr_b, 0);
    }
}

