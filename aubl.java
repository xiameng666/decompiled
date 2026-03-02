import android.os.SystemClock;
import java.io.IOException;

public final class aubl implements Runnable {
    public final aucd a;

    public aubl(aucd aucd0) {
        this.a = aucd0;
    }

    @Override
    public final void run() {
        aucd aucd0 = this.a;
        if(aucd0.p()) {
            long v = SystemClock.elapsedRealtime();
            audg audg0 = aucd0.t;
            if(audg0 != null) {
                if(((Boolean)audg0.g.mr()).booleanValue()) {
                    long v1 = audg0.e;
                    if(v1 == 0L) {
                        audg0.f.g("No timeout configured", new Object[0]);
                        return;
                    }
                    long v2 = SystemClock.elapsedRealtime();
                    if(!audg0.d) {
                        if(v2 >= audg0.c + v1) {
                            audg0.f.c("Starting new timeout cycle at %d", new Object[]{v2});
                            try {
                                audg0.a();
                                audg0.c = v2;
                            }
                            catch(IOException unused_ex) {
                            }
                            return;
                        }
                        audg0.f.c("At %d, waiting for timeout cycle end at %d", new Object[]{v2, ((long)(audg0.c + audg0.e))});
                        return;
                    }
                    if(v2 >= audg0.b + audg0.e) {
                        audg0.f.g("HeartbeatChannel timeout detected at %d", new Object[]{v2});
                        aucd0.k.d("Disconnecting due to heartbeat timeout", new Object[0]);
                        aucd0.F(0x8D0);
                        return;
                    }
                    audg0.f.c("HeartbeatChannel waiting for PONG at %d", new Object[]{v2});
                    return;
                }
                long v3 = audg0.e;
                if(v3 != 0L) {
                    avjh avjh0 = audg0.f;
                    avjh0.c("Checking for timeout using OLD mechanism.", new Object[0]);
                    long v4 = v - audg0.b;
                    if(v4 < v3) {
                        if(!audg0.d && v4 >= v3 / 2L) {
                            try {
                                audg0.a();
                                audg0.d = true;
                            }
                            catch(IOException unused_ex) {
                            }
                            return;
                        }
                        if(v4 <= 0L) {
                            avjh0.g("Unexpected value for delta: %d", new Object[]{v4});
                        }
                    }
                    else {
                        aucd0.k.d("Disconnecting due to heartbeat timeout", new Object[0]);
                        aucd0.F(0x8D0);
                    }
                }
            }
        }
    }
}

