import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

public final class egwl implements ibts {
    public final egwp a;

    public egwl(egwp egwp0) {
        this.a = egwp0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        egwp egwp0 = this.a;
        if(((Bitmap)object0) != null) {
            Bitmap bitmap0 = egid.a(((Bitmap)object0));
            return new lqi(new BitmapDrawable(egwp0.a, bitmap0));
        }
        return lsa.b(egwp0.d, new egwo(egwp0));
    }
}

