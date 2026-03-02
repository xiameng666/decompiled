import android.content.Context;
import android.util.Base64;
import java.io.IOException;
import java.io.InputStream;
import java.security.GeneralSecurityException;

public final class crjc extends crnn {
    gmmn a;

    public crjc(crqq crqq0) {
        super(crqq0);
    }

    @Override  // crnn
    protected final void aM() {
        Context context0 = this.m.e();
        batl.t(context0, "Context passed for initialization is null");
        try(InputStream inputStream0 = context0.getAssets().open("public_keys/public-keyset-prod.json")) {
            this.c(inputStream0);
        }
        catch(IOException unused_ex) {
            this.aJ().j.a("Failed to read public key for encryption");
        }
    }

    @Override  // crnn
    public final String b(String s, String s1) {
        batl.s(s);
        gmmn gmmn0 = this.a;
        if(gmmn0 != null) {
            try {
                byte[] arr_b = s.getBytes("UTF-8");
                if(s1 == null) {
                    s1 = "";
                }
                return Base64.encodeToString(gmmn0.a(arr_b, s1.getBytes("UTF-8")), 0);
            }
            catch(Exception exception0) {
                this.aJ().j.b("Error during encryption of value", exception0.getMessage());
                throw new SecurityException("Failed to encrypt data.", exception0);
            }
        }
        throw new SecurityException("Failed to get encryption primitive.");
    }

    final void c(InputStream inputStream0) {
        batl.s(inputStream0);
        try {
            gmwj.a();
            this.a = (gmmn)gmnb.j(new gmmo(inputStream0)).o(gmwv.a(), gmmn.class);
        }
        catch(GeneralSecurityException | IOException exception0) {
            this.aJ().j.b("Failed to initialize encryption primitives", exception0.getMessage());
            this.a = null;
        }
    }
}

