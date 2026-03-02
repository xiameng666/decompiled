import android.os.Parcel;

public class sgv {
    public static final sgv a;
    private final int b;

    static {
        sgv.a = new sgv(0);
    }

    public sgv() {
        this(0);
    }

    protected sgv(int v) {
        this.b = v;
    }

    public void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeInt(this.b);
    }
}

