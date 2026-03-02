import android.content.Context;
import android.hardware.display.DisplayManager.DisplayListener;
import android.hardware.display.DisplayManager;
import android.os.Looper;
import android.view.Display;

public final class gyft implements DisplayManager.DisplayListener {
    public final Display a;
    private final DisplayManager b;
    private final gygb c;
    private boolean d;
    private int e;

    public gyft(Context context0, gygb gygb0) {
        this.e = 0;
        DisplayManager displayManager0 = (DisplayManager)context0.getSystemService("display");
        gftb.check(displayManager0);
        this.b = displayManager0;
        this.a = displayManager0.getDisplay(0);
        this.c = gygb0;
    }

    public final void a() {
        synchronized(this) {
            if(!this.d) {
                this.d = true;
                this.e = this.a.getState();
                clht clht0 = new clht(Looper.getMainLooper());
                this.b.registerDisplayListener(this, clht0);
            }
        }
    }

    public final void b() {
        synchronized(this) {
            if(this.d) {
                this.d = false;
                this.b.unregisterDisplayListener(this);
            }
        }
    }

    public final boolean c() {
        synchronized(this) {
        }
        return this.d;
    }

    public static final boolean d(int v) {
        return v == 2;
    }

    private static String e(int v) {
        switch(v) {
            case 1: {
                return "STATE_OFF";
            }
            case 2: {
                return "STATE_ON";
            }
            case 3: {
                return "STATE_DOZE";
            }
            case 4: {
                return "STATE_DOZE_SUSPEND";
            }
            case 5: {
                return "STATE_VR";
            }
            case 6: {
                return "STATE_ON_SUSPEND";
            }
            default: {
                return "STATE_UNKNOWN_" + v;
            }
        }
    }

    @Override  // android.hardware.display.DisplayManager$DisplayListener
    public final void onDisplayAdded(int v) {
    }

    @Override  // android.hardware.display.DisplayManager$DisplayListener
    public final void onDisplayChanged(int v) {
        if(v == 0) {
            int v1 = this.a.getState();
            if(v1 != this.e) {
                ((ggtj)((ggtj)gyke.a.h()).ar(0x4F32)).R("FastPairDisplayObserver: %s -> %s", gyft.e(this.e), gyft.e(v1));
                if(v1 == 2) {
                    gyeh gyeh0 = new gyeh(((gyel)this.c));
                    ((gyel)this.c).d.f(gyeh0);
                }
                else if(v1 == 1) {
                    gyei gyei0 = new gyei(((gyel)this.c));
                    ((gyel)this.c).d.f(gyei0);
                    v1 = 1;
                }
                this.e = v1;
            }
        }
    }

    @Override  // android.hardware.display.DisplayManager$DisplayListener
    public final void onDisplayRemoved(int v) {
    }
}

