import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.awareness.fence.FenceState;
import com.google.android.gms.contextmanager.fence.internal.FenceStateImpl;
import com.google.android.gms.contextmanager.fence.internal.FenceTriggerInfoImpl;

public final class bcua extends bcuk {
    public static final yfm a;
    private final aqcs b;
    private final Handler c;

    static {
        bcua.a = new bcty();
    }

    public bcua(aqcs aqcs0, Looper looper0) {
        this.b = aqcs0;
        batl.s(looper0);
        this.c = bcvt.r(looper0);
    }

    @Override  // bcul
    public final void a(FenceStateImpl fenceStateImpl0) {
        bctz bctz0 = new bctz(this.b, fenceStateImpl0);
        this.c.post(bctz0);
    }

    @Override  // bcul
    @Deprecated
    public final void b(FenceTriggerInfoImpl fenceTriggerInfoImpl0) {
        xti.b("ContextFenceListenerWrapper", "Unexpected call to deprecated method onFenceTriggered() with %s.", fenceTriggerInfoImpl0);
        this.c.post(new bctz(this.b, new FenceStateImpl(FenceState.a(fenceTriggerInfoImpl0.a), 0L, fenceTriggerInfoImpl0.b, 0)));
    }
}

