import android.graphics.Bitmap;
import android.view.LayoutInflater;
import com.google.android.gms.pay.GetImagesForValuableResponse;

public final class dvos implements ibts {
    public final dvpa a;
    public final LayoutInflater b;

    public dvos(dvpa dvpa0, LayoutInflater layoutInflater0) {
        this.a = dvpa0;
        this.b = layoutInflater0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        ibuq.f(((GetImagesForValuableResponse)object0), "response");
        Bitmap[] arr_bitmap = ((GetImagesForValuableResponse)object0).a;
        ibuq.e(arr_bitmap, "getValuableImages(...)");
        if(arr_bitmap.length == 0) {
            ((ggtj)dvpa.a.j()).x("No images received for valuable");
            return ibom.a;
        }
        dvpa dvpa0 = this.a;
        if(dvpa0.d != null) {
            dvlr dvlr0 = dvpa0.ak;
            if(dvlr0 == null) {
                ibuq.j("imageLogger");
                dvlr0 = null;
            }
            String s = dvpa0.d;
            ibuq.c(s);
            dvlr.c(dvlr0, gjco.b, gjct.b, gjcr.g, s);
        }
        Bitmap[] arr_bitmap1 = ((GetImagesForValuableResponse)object0).a;
        ibuq.c(arr_bitmap1);
        dvpa0.B(ggdx.b(arr_bitmap1));
        dvpa0.D(this.b, arr_bitmap1);
        return ibom.a;
    }
}

