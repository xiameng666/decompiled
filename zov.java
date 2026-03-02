import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import j..util.Objects;

final class zov implements zel {
    final zow a;

    public zov(zow zow0) {
        Objects.requireNonNull(zow0);
        this.a = zow0;
        super();
    }

    @Override  // zel
    public final void a(Bitmap bitmap0) {
        BitmapDrawable bitmapDrawable0 = new BitmapDrawable(this.a.u.i.getResources(), bitmap0);
        this.a.t.j(bitmapDrawable0);
    }
}

