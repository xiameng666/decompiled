import android.os.Handler;
import java.util.concurrent.Executor;

public final class bjf {
    public final Executor a;
    public final Handler b;

    public bjf() {
        throw null;
    }

    public bjf(Executor executor0, Handler handler0) {
        this.a = executor0;
        if(handler0 == null) {
            throw new NullPointerException("Null schedulerHandler");
        }
        this.b = handler0;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof bjf) && this.a.equals(((bjf)object0).a) && this.b.equals(((bjf)object0).b);
    }

    @Override
    public final int hashCode() {
        return this.b.hashCode() ^ (this.a.hashCode() ^ 1000003) * 1000003;
    }

    @Override
    public final String toString() {
        return "CameraThreadConfig{cameraExecutor=" + this.a + ", schedulerHandler=" + this.b + "}";
    }
}

