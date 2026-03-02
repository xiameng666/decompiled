import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

public final class egwo implements ibts {
    public final egwp a;

    public egwo(egwp egwp0) {
        this.a = egwp0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        foec foec0 = (foec)object0;
        int v = this.a.a.getDimensionPixelSize(0x7F070E6D);  // dimen:people_account_chip_size
        Bitmap bitmap0 = Bitmap.createBitmap(v, v, Bitmap.Config.ARGB_8888);
        egwm egwm0 = new egwm(foec0);
        this.a.b.c(egwm0);
        this.a.b.b(foec0.a);
        this.a.b.a(bitmap0);
        return new BitmapDrawable(this.a.a, bitmap0);
    }
}

