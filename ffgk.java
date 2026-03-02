import android.content.Intent;
import com.google.android.gms.wearable.internal.MessageEventParcelable;
import j..util.Objects;

public final class ffgk extends ffgn {
    final boolean a;
    final MessageEventParcelable b;
    final byte[] c;
    final String d;
    final fdiu e;

    public ffgk(ffgl ffgl0, Intent intent0, boolean z, MessageEventParcelable messageEventParcelable0, fdiu fdiu0, byte[] arr_b, String s) {
        this.a = z;
        this.b = messageEventParcelable0;
        this.e = fdiu0;
        this.c = arr_b;
        this.d = s;
        Objects.requireNonNull(ffgl0);
        super("onMessageReceived", intent0);
    }

    @Override  // ffgn
    public final String a() {
        return "requestId=" + this.b.a + ", action=" + this.b.b + ", dataSize=" + (this.c == null ? null : ((int)this.c.length)) + ", source=" + this.d;
    }

    @Override  // ffgn
    public final void b(fffu fffu0, fdjb fdjb0) {
        if(this.a) {
            fdjb0.n(this.b, this.e);
            fdny.a(fdnw.b);
            return;
        }
        fdjb0.i(this.b);
        fdny.a(fdnw.a);
    }

    @Override  // ffgn
    public final boolean c() {
        return true;
    }
}

