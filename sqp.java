import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.ImageLoader.ImageContainer;
import com.android.volley.toolbox.ImageLoader.ImageListener;
import com.android.volley.toolbox.NetworkImageView;
import j..util.Objects;

public final class sqp implements ImageLoader.ImageListener {
    final boolean a;
    final NetworkImageView b;

    public sqp(NetworkImageView networkImageView0, boolean z) {
        this.a = z;
        Objects.requireNonNull(networkImageView0);
        this.b = networkImageView0;
        super();
    }

    @Override  // com.android.volley.Response$ErrorListener
    public final void onErrorResponse(VolleyError volleyError0) {
        NetworkImageView networkImageView0 = this.b;
        int v = networkImageView0.d;
        if(v != 0) {
            networkImageView0.setImageResource(v);
            return;
        }
        Drawable drawable0 = networkImageView0.e;
        if(drawable0 != null) {
            networkImageView0.setImageDrawable(drawable0);
            return;
        }
        Bitmap bitmap0 = networkImageView0.f;
        if(bitmap0 != null) {
            networkImageView0.setImageBitmap(bitmap0);
        }
    }

    @Override  // com.android.volley.toolbox.ImageLoader$ImageListener
    public final void onResponse(ImageLoader.ImageContainer imageLoader$ImageContainer0, boolean z) {
        if(z && this.a) {
            sqo sqo0 = new sqo(this, imageLoader$ImageContainer0);
            this.b.post(sqo0);
            return;
        }
        if(imageLoader$ImageContainer0.getBitmap() != null) {
            this.b.setImageBitmap(imageLoader$ImageContainer0.getBitmap());
            return;
        }
        NetworkImageView networkImageView0 = this.b;
        int v = networkImageView0.a;
        if(v != 0) {
            networkImageView0.setImageResource(v);
            return;
        }
        Drawable drawable0 = networkImageView0.b;
        if(drawable0 != null) {
            networkImageView0.setImageDrawable(drawable0);
            return;
        }
        Bitmap bitmap0 = networkImageView0.c;
        if(bitmap0 != null) {
            networkImageView0.setImageBitmap(bitmap0);
        }
    }
}

