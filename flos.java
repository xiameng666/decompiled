import android.content.ContentValues;
import com.google.android.libraries.messaging.lighter.model..AutoValue_AccountContext;
import com.google.android.libraries.messaging.lighter.model.AccountContext;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.HashMap;

public final class flos {
    public static ContentValues a(AccountContext accountContext0, fmbl fmbl0) {
        ContentValues contentValues0 = new ContentValues();
        contentValues0.put("tachyon_app_name", accountContext0.h());
        contentValues0.put("server_registration_id", ((.AutoValue_AccountContext)accountContext0).c.toByteArray());
        contentValues0.put("server_registration_status", Integer.valueOf(((.AutoValue_AccountContext)accountContext0).d.c));
        contentValues0.put("tachyon_auth_token", glwl.e(fmbl0.b));
        contentValues0.put("auth_token_expire_at_timestamp_ms", Long.valueOf(glxs.a(fmbl0.c)));
        contentValues0.put("auth_token_refreshed_at_timestamp_ms", Long.valueOf(fmbl0.d.toEpochMilli()));
        if(fmbl0.c() - 1 != 1) {
            contentValues0.put("identity_key_type", Integer.valueOf(0));
            return contentValues0;
        }
        contentValues0.put("identity_key_type", Integer.valueOf(1));
        contentValues0.put("identity_key_private", fmbl0.b().getPrivate().getEncoded());
        contentValues0.put("identity_key_public", fmbl0.b().getPublic().getEncoded());
        return contentValues0;
    }

    public static gfsx b(byte[] arr_b, byte[] arr_b1) {
        if(arr_b != null && arr_b1 != null) {
            try {
                KeyFactory keyFactory0 = KeyFactory.getInstance("EC");
                return gfsx.m(new KeyPair(keyFactory0.generatePublic(new X509EncodedKeySpec(arr_b)), keyFactory0.generatePrivate(new PKCS8EncodedKeySpec(arr_b1))));
            }
            catch(NoSuchAlgorithmException | InvalidKeySpecException unused_ex) {
            }
        }
        return gfqx.a;
    }

    public static gfsx c(byte[] arr_b) {
        try {
            HashMap hashMap0 = flbm.g(arr_b);
            fmgo fmgo0 = new fmgo();
            if(hashMap0.containsKey("last_reported_capabilities")) {
                fmgo0.c(gged_interceptors.i(((ArrayList)hashMap0.get("last_reported_capabilities"))));
            }
            if(hashMap0.containsKey("last_reported_capabilities_time_ms")) {
                fmgo0.b(((Long)hashMap0.get("last_reported_capabilities_time_ms")).longValue());
            }
            return gfsx.m(fmgo0.a());
        }
        catch(Exception unused_ex) {
            flbj.c("RegCursors", "Failed to de-serialize registration properties");
            return gfqx.a;
        }
    }
}

