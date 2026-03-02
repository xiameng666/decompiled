import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.util.Log;

public final class ekiq implements lqj {
    public final ekjl a;

    public ekiq(ekjl ekjl0) {
        this.a = ekjl0;
    }

    @Override  // lqj
    public final void jS(Object object0) {
        ekjl ekjl0 = this.a;
        if(((Bitmap)object0) == null) {
            Log.w("CRBAdapter", String.format("Loading owner avatar failed; Using a default instead. "));
            String s = ekjl0.a.h();
            ekjl0.i = ekmu.a(ekjl0.f.getResources(), s);
        }
        else {
            ekjl0.i = new BitmapDrawable(ekjl0.e.getContext().getResources(), egid.a(((Bitmap)object0)));
        }
        ekjl0.q();
    }
}

