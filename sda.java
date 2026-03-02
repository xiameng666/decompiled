import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.PersistableBundle;
import j..util.Base64;
import java.io.ByteArrayOutputStream;

public final class sda implements sdg, sdv {
    @Override  // sdg
    public final Object b(PersistableBundle persistableBundle0) {
        return sdf.a(this, persistableBundle0);
    }

    @Override  // sdg
    public final Object c(PersistableBundle persistableBundle0) {
        ibuq.f(persistableBundle0, "persistableBundle");
        String s = persistableBundle0.getString("value");
        if(s == null) {
            throw new IllegalStateException("PersistableBitmap has no value");
        }
        byte[] arr_b = Base64.getDecoder().decode(s);
        Bitmap bitmap0 = BitmapFactory.decodeByteArray(arr_b, 0, arr_b.length);
        ibuq.c(bitmap0);
        return new sdb(bitmap0);
    }

    @Override  // sdv
    public final PersistableBundle d(Object object0) {
        return sda.f(((Bitmap)object0));
    }

    public static final String e(Bitmap bitmap0) {
        ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
        bitmap0.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream0);
        byte[] arr_b = byteArrayOutputStream0.toByteArray();
        ibuq.e(arr_b, "toByteArray(...)");
        byte[] arr_b1 = Base64.getEncoder().encode(arr_b);
        ibuq.e(arr_b1, "encode(...)");
        return new String(arr_b1, ibyo.a);
    }

    public static final PersistableBundle f(Bitmap bitmap0) {
        ibuq.f(bitmap0, "value");
        PersistableBundle persistableBundle0 = new PersistableBundle();
        persistableBundle0.putString("value", sda.e(bitmap0));
        return persistableBundle0;
    }

    @Override  // rna
    public final Object fm(Object object0) {
        return sdf.b(this, object0);
    }
}

