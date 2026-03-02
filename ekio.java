import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.util.Log;

public final class ekio implements lqj {
    public final ekih a;

    public ekio(ekih ekih0) {
        this.a = ekih0;
    }

    @Override  // lqj
    public final void jS(Object object0) {
        ekih ekih0 = this.a;
        xob xob0 = (xob)ekih0.e.getContext();
        if(((Bitmap)object0) != null && xob0 != null) {
            ekih0.h = new BitmapDrawable(xob0.getResources(), egid.a(((Bitmap)object0)));
        }
        else {
            Log.w("CREBAdapter", "Loading owner avatar failed; Using a default instead. ");
            String s = ekih0.a.h();
            ekih0.h = ekmu.a(ekih0.f.getResources(), s);
        }
        ekih0.q();
    }
}

