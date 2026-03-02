import android.content.Context;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap;
import android.os.ParcelFileDescriptor;
import j..util.Objects;
import java.io.ByteArrayOutputStream;

public final class ailc implements azuk {
    final aztw a;
    final Context b;
    final hhqx c;
    final byte[] d;
    final String e;
    final aild f;

    public ailc(aild aild0, aztw aztw0, Context context0, hhqx hhqx0, byte[] arr_b, String s) {
        this.a = aztw0;
        this.b = context0;
        this.c = hhqx0;
        this.d = arr_b;
        this.e = s;
        Objects.requireNonNull(aild0);
        this.f = aild0;
        super();
    }

    @Override  // azuk
    public final void a(azuj azuj0) {
        aiip aiip0 = this.f.c;
        aiip0.b = this.a;
        aiip0.a = this.b;
        fcez fcez0 = new fcez();
        fcez0.k("tx_request", this.c.toBytesArray());
        fcez0.k("key_handle", this.d);
        String s = this.e;
        fcez0.s("email", s);
        ParcelFileDescriptor parcelFileDescriptor0 = ((efoa)azuj0).b();
        if(parcelFileDescriptor0 == null) {
            aild.d.m("Failed to fetch the profile picture for %s", new Object[]{s});
        }
        else {
            Bitmap bitmap0 = efoo.a(parcelFileDescriptor0);
            ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
            bitmap0.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream0);
            fcez0.k("profile_picture", byteArrayOutputStream0.toByteArray());
        }
        aiip0.b("/send-tx-request", fcez0.y()).a();
    }
}

