import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;

public final class fmni implements kar {
    public final fmnk a;

    public fmni(fmnk fmnk0) {
        this.a = fmnk0;
    }

    @Override  // kar
    public final void accept(Object object0) {
        Bitmap bitmap0 = BitmapFactory.decodeByteArray(((fmfh)object0).a, 0, ((fmfh)object0).a.length);
        if(bitmap0 != null) {
            fmnk fmnk0 = this.a;
            int v = fmro.a(fmnk0.getContext(), ((float)((fmfh)object0).b));
            int v1 = fmro.a(fmnk0.getContext(), ((float)((fmfh)object0).c));
            if(v > 0 && v1 > 0) {
                BitmapDrawable bitmapDrawable0 = new BitmapDrawable(fmnk0.getResources(), Bitmap.createScaledBitmap(bitmap0, v, v1, true));
                fmnk0.b.u(bitmapDrawable0);
                fmnh fmnh0 = new fmnh(fmnk0);
                flbl.b(((fmfh)object0).d, fmnh0);
            }
        }
    }
}

