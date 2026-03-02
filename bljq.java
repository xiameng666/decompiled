import android.content.ContentValues;
import android.content.Context;
import android.util.Base64;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.fido.credentialstore.KeyData;
import java.security.SecureRandom;

public final class bljq extends cjtm {
    public static final bboh a;
    public final bmde b;
    private final bnba c;
    private final bljz d;
    private final byte[] e;

    static {
        bljq.a = bnaa.c("GetOrGenerateDeviceBoundKeyOperation");
    }

    public bljq(bmde bmde0, byte[] arr_b, bljz bljz0, azug azug0) {
        super(0xD6, "GetOrGenerateDeviceBoundKey", azug0);
        this.b = bmde0;
        this.e = arr_b;
        this.d = bljz0;
        this.c = (bnba)bnba.e.b();
    }

    @Override  // cjtm
    protected final void f(Context context0) {
        try {
            byte[] arr_b = this.e;
            String s = Base64.encodeToString(arr_b, 0);
            bnba bnba0 = this.c;
            String s1 = (String)bnba0.c(s).g();
            if(s1 == null || !bljz.f(s1)) {
                if(s1 != null) {
                    bnba0.f(Base64.encodeToString(arr_b, 0));
                }
                byte[] arr_b1 = new byte[0x20];
                new SecureRandom().nextBytes(arr_b1);
                s1 = Base64.encodeToString(arr_b1, 0);
                this.d.b(s1, bmcs.a);
                String s2 = Base64.encodeToString(arr_b, 0);
                gftb.z(s2, "discoverableCredentialKeyHandle cannot be null");
                gftb.z(s1, "devicePublicKeyId cannot be null");
                ContentValues contentValues0 = new ContentValues();
                contentValues0.put("device_bound_key_id", s1);
                contentValues0.put("discoverable_credential_id", s2);
                if(bnba0.a().insert("device_bound_key_map", null, contentValues0) == -1L) {
                    bxly bxly0 = new bxly();
                    bxly0.a = 8;
                    bxly0.b = "Error storing key mapping information into SQLite database";
                    throw bxly0.a();
                }
            }
            byte[] arr_b2 = Base64.decode(s1, 0);
            gmbu.t(gmbu.i(KeyData.c(bmcs.a.f, arr_b2, s1, null, null, false)), new bljp(this), gmap.a);
        }
        catch(bxma bxma0) {
            Status status0 = bxma0.a();
            this.b.a(status0, null, ApiMetadata.b);
        }
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.b.a(status0, null, ApiMetadata.b);
    }
}

