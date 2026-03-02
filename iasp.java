import android.os.Parcel;
import java.io.Closeable;

final class iasp implements Closeable {
    private Parcel a;

    public iasp(Parcel parcel0) {
        this.a = parcel0;
    }

    public final Parcel a() {
        gftb.r(this.a != null, "get() after close()/release()");
        return this.a;
    }

    public final Parcel b() {
        Parcel parcel0 = this.a();
        this.a = null;
        return parcel0;
    }

    public static iasp c() {
        return new iasp(Parcel.obtain());
    }

    @Override
    public final void close() {
        Parcel parcel0 = this.a;
        if(parcel0 != null) {
            parcel0.recycle();
            this.a = null;
        }
    }
}

