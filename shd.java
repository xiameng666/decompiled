import android.os.Parcel;

public class shd {
    public static final shd a;
    private final int b;

    static {
        shd.a = new shd(0);
    }

    public shd() {
        this(0);
    }

    protected shd(int v) {
        this.b = v;
    }

    public void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeInt(this.b);
    }
}

