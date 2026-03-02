import android.media.ImageWriter;

public final class awf implements Runnable {
    public final bdm a;
    public final awj b;

    public awf(bdm bdm0, awj awj0) {
        this.a = bdm0;
        this.b = awj0;
    }

    @Override
    public final void run() {
        this.a.k();
        this.b.a();
        ImageWriter imageWriter0 = this.b.a;
        if(imageWriter0 != null) {
            imageWriter0.close();
        }
    }
}

