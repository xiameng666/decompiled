import com.android.volley.VolleyError;
import com.android.volley.toolbox.ImageLoader.ImageContainer;
import com.android.volley.toolbox.ImageLoader.ImageListener;
import com.android.volley.toolbox.ImageLoader;
import j..util.Objects;
import java.util.HashMap;

public final class sqm implements Runnable {
    final ImageLoader a;

    public sqm(ImageLoader imageLoader0) {
        Objects.requireNonNull(imageLoader0);
        this.a = imageLoader0;
        super();
    }

    @Override
    public final void run() {
        ImageLoader imageLoader0 = this.a;
        HashMap hashMap0 = imageLoader0.b;
        for(Object object0: hashMap0.values()) {
            sqn sqn0 = (sqn)object0;
            for(Object object1: sqn0.c) {
                ImageLoader.ImageContainer imageLoader$ImageContainer0 = (ImageLoader.ImageContainer)object1;
                ImageLoader.ImageListener imageLoader$ImageListener0 = imageLoader$ImageContainer0.b;
                if(imageLoader$ImageListener0 != null) {
                    VolleyError volleyError0 = sqn0.b;
                    if(volleyError0 == null) {
                        imageLoader$ImageContainer0.a = sqn0.a;
                        imageLoader$ImageListener0.onResponse(imageLoader$ImageContainer0, false);
                    }
                    else {
                        imageLoader$ImageListener0.onErrorResponse(volleyError0);
                    }
                }
            }
        }
        hashMap0.clear();
        imageLoader0.c = null;
    }
}

