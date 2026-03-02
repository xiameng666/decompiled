import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;

final class tzf implements icih {
    final tzh a;

    public tzf(tzh tzh0) {
        this.a = tzh0;
        super();
    }

    @Override  // icih
    public final Object a(Object object0, ibrl ibrl0) {
        hpu hpu0;
        Drawable drawable0;
        if((((tzz)object0) instanceof uad)) {
            drawable0 = (Drawable)((uad)(((tzz)object0))).a;
        }
        else {
            if(!(((tzz)object0) instanceof uab)) {
                throw new ibnq();
            }
            drawable0 = ((uab)(((tzz)object0))).a;
        }
        gsw gsw0 = null;
        if(drawable0 == null) {
            hpu0 = null;
        }
        else if((drawable0 instanceof BitmapDrawable)) {
            Bitmap bitmap0 = ((BitmapDrawable)drawable0).getBitmap();
            ibuq.e(bitmap0, "getBitmap(...)");
            hpu0 = new hpu(new hkn(bitmap0));
        }
        else if((drawable0 instanceof ColorDrawable)) {
            hpu0 = new hpv(hln.c(((ColorDrawable)drawable0).getColor()));
        }
        else {
            Drawable drawable1 = drawable0.mutate();
            ibuq.e(drawable1, "mutate(...)");
            hpu0 = new vmn(drawable1);
        }
        tzh tzh0 = this.a;
        hpw hpw0 = tzh0.j();
        if(hpu0 != hpw0) {
            gsw gsw1 = (hpw0 instanceof gsw) ? ((gsw)hpw0) : null;
            if(gsw1 != null) {
                gsw1.g();
            }
            if((hpu0 instanceof gsw)) {
                gsw0 = (gsw)hpu0;
            }
            if(gsw0 != null) {
                gsw0.h();
            }
            tzh0.e.b(drawable0);
            tzh0.l(hpu0);
        }
        uaf uaf0 = ((tzz)object0).a();
        ibuq.f(uaf0, "<set-?>");
        tzh0.d.b(uaf0);
        return ibom.a;
    }
}

