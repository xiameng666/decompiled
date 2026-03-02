import android.net.Uri;
import com.google.android.libraries.messaging.lighter.model.AccountContext;
import java.io.IOException;
import java.io.InputStream;

public final class fmis implements glzn {
    public final fmiv a;
    public final fmjo b;
    public final AccountContext c;
    public final fmga d;
    public final String e;

    public fmis(fmiv fmiv0, fmjo fmjo0, AccountContext accountContext0, fmga fmga0, String s) {
        this.a = fmiv0;
        this.b = fmjo0;
        this.c = accountContext0;
        this.d = fmga0;
        this.e = s;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        Void void0 = (Void)object0;
        fmjo fmjo0 = this.b;
        String s = fmjo0.b;
        fmiv fmiv0 = this.a;
        if(s != null) {
            Uri uri0 = Uri.parse(s);
            try {
                InputStream inputStream0 = fmiv0.e(uri0);
                if(inputStream0 != null) {
                    inputStream0.close();
                }
            }
            catch(IOException unused_ex) {
                goto label_12;
            }
            fmiw fmiw0 = new fmiw();
            fmiw0.b(fmjo0.b);
            return gmbu.i(fmiw0.a());
        }
    label_12:
        flqv flqv0 = flqw.a();
        flqv0.a = "LighterPhotoScottyDownload";
        flqv0.b(flra.c);
        flqw flqw0 = flqv0.a();
        return fmiv0.c.a(this.c, fmjo0.a, this.d, this.e, flqw0, 18);
    }
}

