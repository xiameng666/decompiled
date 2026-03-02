import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;

public final class gasf {
    public final gast a;
    final bzt b;
    private final gass c;

    public gasf(gast gast0, gass gass0) {
        this.b = new bzt(1);
        this.a = gast0;
        this.c = gass0;
    }

    public static Bitmap a(gase gase0, Bitmap bitmap0) {
        int v = gase0.c;
        if(v > 0 || gase0.d > 0) {
            int v1 = gase0.d;
            if(v <= 0) {
                v = bitmap0.getWidth() * v1 / bitmap0.getHeight();
                return v != bitmap0.getWidth() || v1 != bitmap0.getHeight() ? Bitmap.createScaledBitmap(bitmap0, v, v1, false) : bitmap0;
            }
            if(v1 <= 0) {
                v1 = bitmap0.getHeight() * v / bitmap0.getWidth();
            }
            return v != bitmap0.getWidth() || v1 != bitmap0.getHeight() ? Bitmap.createScaledBitmap(bitmap0, v, v1, false) : bitmap0;
        }
        return bitmap0;
    }

    public final void b(gase gase0, String s) {
        gatj gatj0 = this.a.a;
        if(gatj0.a.b == 24) {
            ibuq.f(s, "<this>");
            s = "http://localhost:8886/compatibility/fake-images/" + Uri.encode(s);
        }
        ibuq.f(s, "url");
        gcro gcro0 = new gcro(s, ((gcrp)gatj0.c).a, gase0, 0, 0, null);
        gcro0.o();
        gase0.e = gcro0;
    }

    public final void c(gase gase0, Bitmap bitmap0) {
        Bitmap bitmap1 = gasf.a(gase0, bitmap0);
        if(bitmap1 != null) {
            bitmap0 = bitmap1;
        }
        this.d(gase0, new BitmapDrawable(this.a.a.e.getResources(), bitmap0));
    }

    public final void d(gase gase0, Drawable drawable0) {
        drawable0.setAutoMirrored(gase0.b != null && gase0.b.g);
        gass gass0 = this.c;
        int v = gase0.a;
        if(gass0.d != 3 && !gass0.aB()) {
            gass0.T(v, drawable0);
        }
    }
}

