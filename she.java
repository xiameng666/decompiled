import android.os.Parcel;

public class she {
    private final int a;
    public static final she b;

    static {
        she.b = new she(0);
    }

    public she() {
        this(0);
    }

    protected she(int v) {
        this.a = v;
    }

    public void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeInt(this.a);
    }
}

