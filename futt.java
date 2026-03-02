import com.google.android.gms.location.ActivityRecognitionResult;

public final class futt {
    public static final int[] a;
    public ActivityRecognitionResult b;
    public ActivityRecognitionResult c;
    public long d;
    public int e;
    private boolean f;

    static {
        futt.a = new int[]{9, 15};
    }

    public futt(boolean z) {
        this.b = null;
        this.c = null;
        this.d = 0L;
        this.e = 0;
        this.f = z;
    }

    public final void a() {
        this.b = null;
        this.c = null;
        this.e = 0;
        this.f = false;
    }

    public final boolean b() {
        return this.f ? true : this.b != null && (this.c != null && this.c.c - this.b.c >= 480000L && this.e >= 3);
    }
}

