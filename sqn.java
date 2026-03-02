import android.graphics.Bitmap;
import com.android.volley.Request;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.ImageLoader.ImageContainer;
import java.util.ArrayList;
import java.util.List;

public final class sqn {
    public Bitmap a;
    public VolleyError b;
    public final List c;
    private final Request d;

    public sqn(Request request0, ImageLoader.ImageContainer imageLoader$ImageContainer0) {
        ArrayList arrayList0 = new ArrayList();
        this.c = arrayList0;
        this.d = request0;
        arrayList0.add(imageLoader$ImageContainer0);
    }

    public final boolean a(ImageLoader.ImageContainer imageLoader$ImageContainer0) {
        this.c.remove(imageLoader$ImageContainer0);
        if(this.c.size() == 0) {
            this.d.cancel();
            return true;
        }
        return false;
    }
}

