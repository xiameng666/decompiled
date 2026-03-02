import android.graphics.Bitmap;
import android.widget.ImageView.ScaleType;

public final class fmnb implements Runnable {
    public final fmnc a;
    public final Bitmap b;
    public final String c;

    public fmnb(fmnc fmnc0, Bitmap bitmap0, String s) {
        this.a = fmnc0;
        this.b = bitmap0;
        this.c = s;
    }

    @Override
    public final void run() {
        fmnc fmnc0 = this.a;
        Bitmap bitmap0 = this.b;
        if(bitmap0 != null && (this.c != null && !this.c.isEmpty())) {
            fmnc0.setImageBitmap(bitmap0);
            if(iaea.r()) {
                fmnc0.setScaleType(ImageView.ScaleType.FIT_CENTER);
                fmnc0.setBackgroundColor(-1);
                return;
            }
            fmnc0.setScaleType(ImageView.ScaleType.CENTER_CROP);
            return;
        }
        if(!fmnc0.b) {
            fmnc0.setImageResource(0x7F080B0C);
            fmnc0.setScaleType(ImageView.ScaleType.CENTER);
            if(iaea.r()) {
                fmnc0.setBackgroundColor(fmnc0.c);
            }
        }
    }
}

