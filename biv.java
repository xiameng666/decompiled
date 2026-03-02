import android.os.SystemClock;

public final class biv {
    public final int a;
    public final long b;
    public final Throwable c;

    public biv(long v, Throwable throwable0) {
        this.b = SystemClock.elapsedRealtime() - v;
        if((throwable0 instanceof bjh)) {
            this.a = 2;
            this.c = throwable0;
            return;
        }
        if((throwable0 instanceof bcr)) {
            Throwable throwable1 = throwable0.getCause();
            if(throwable1 != null) {
                throwable0 = throwable1;
            }
            this.c = throwable0;
            if((throwable0 instanceof baf)) {
                this.a = 2;
                return;
            }
            if((throwable0 instanceof IllegalArgumentException)) {
                this.a = 1;
                return;
            }
            this.a = 0;
            return;
        }
        this.a = 0;
        this.c = throwable0;
    }
}

