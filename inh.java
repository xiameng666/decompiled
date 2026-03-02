import android.view.Choreographer.FrameCallback;
import java.util.List;

public final class inh implements Choreographer.FrameCallback, Runnable {
    final ini a;

    public inh(ini ini0) {
        this.a = ini0;
        super();
    }

    @Override  // android.view.Choreographer$FrameCallback
    public final void doFrame(long v) {
        List list0;
        ini ini0 = this.a;
        ini0.d.removeCallbacks(this);
        ini0.b();
        synchronized(ini0.e) {
            if(!ini0.h) {
                return;
            }
            ini0.h = false;
            list0 = ini0.f;
            ini0.f = ini0.g;
            ini0.g = list0;
        }
        int v2 = list0.size();
        for(int v1 = 0; v1 < v2; ++v1) {
            ((Choreographer.FrameCallback)list0.get(v1)).doFrame(v);
        }
        list0.clear();
    }

    @Override
    public final void run() {
        ini ini0 = this.a;
        ini0.b();
        synchronized(ini0.e) {
            if(ini0.f.isEmpty()) {
                ini0.c.removeFrameCallback(this);
                ini0.h = false;
            }
        }
    }
}

