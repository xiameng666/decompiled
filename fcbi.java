import android.widget.ImageView;

public final class fcbi {
    public final ImageView[] a;
    public final boolean b;
    public boolean c;
    public final int[] d;

    public fcbi(ImageView[] arr_imageView, boolean z) {
        this.c = false;
        this.a = arr_imageView;
        this.b = z;
        this.d = new int[arr_imageView.length];
    }

    public final void a(int v, boolean z) {
        ImageView imageView0 = this.a[v];
        if(gdcb.S(imageView0.getContext())) {
            if(z == this.d[v] >= 0 && !this.c) {
                return;
            }
            imageView0.animate().alpha((z ? 1.0f : 0.0f));
            return;
        }
        imageView0.clearAnimation();
        imageView0.setAlpha(((int)z));
    }
}

