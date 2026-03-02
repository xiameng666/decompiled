import android.content.Context;
import android.graphics.BitmapFactory.Options;
import android.graphics.BitmapFactory;
import android.util.Base64;
import java.io.IOException;
import java.io.InputStream;

final class qpf extends ibsl implements ibtw {
    final qkb a;
    final Context b;
    final String c;

    public qpf(qkb qkb0, Context context0, String s, ibrl ibrl0) {
        this.a = qkb0;
        this.b = context0;
        this.c = s;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((qpf)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new qpf(this.a, this.b, this.c, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        InputStream inputStream0;
        ibnx.b(object0);
        for(Object object1: this.a.e().values()) {
            qla qla0 = (qla)object1;
            ibuq.c(qla0);
            if(qla0.f == null) {
                String s = qla0.d;
                if(ibzk.W(s, "data:") && ibzk.N(s, "base64,", 0, false, 6) > 0) {
                    try {
                        String s1 = s.substring(ibzk.M(s, ',', 0, 6) + 1);
                        ibuq.e(s1, "substring(...)");
                        byte[] arr_b = Base64.decode(s1, 0);
                        BitmapFactory.Options bitmapFactory$Options0 = new BitmapFactory.Options();
                        bitmapFactory$Options0.inScaled = true;
                        bitmapFactory$Options0.inDensity = 0xA0;
                        qla0.f = BitmapFactory.decodeByteArray(arr_b, 0, arr_b.length, bitmapFactory$Options0);
                    }
                    catch(IllegalArgumentException illegalArgumentException0) {
                        qtq.b("data URL did not have correct base64 format.", illegalArgumentException0);
                    }
                }
            }
            Context context0 = this.b;
            String s2 = this.c;
            if(qla0.f == null && s2 != null) {
                goto label_22;
            }
            continue;
            try {
            label_22:
                inputStream0 = context0.getAssets().open(s2 + qla0.d);
            }
            catch(IOException iOException0) {
                qtq.b("Unable to open asset.", iOException0);
                continue;
            }
            ibuq.c(inputStream0);
            try {
                BitmapFactory.Options bitmapFactory$Options1 = new BitmapFactory.Options();
                bitmapFactory$Options1.inScaled = true;
                bitmapFactory$Options1.inDensity = 0xA0;
                qla0.f = qty.d(BitmapFactory.decodeStream(inputStream0, null, bitmapFactory$Options1), qla0.a, qla0.b);
            }
            catch(IllegalArgumentException illegalArgumentException1) {
                qtq.b("Unable to decode image.", illegalArgumentException1);
            }
        }
        return ibom.a;
    }
}

