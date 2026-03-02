import android.hardware.Sensor;
import android.hardware.SensorManager;
import com.google.android.wallet.bender3.framework.camera.FlashlightManager.lightSensorListener.1;
import java.util.ArrayList;
import java.util.List;

public final class gaug {
    public final ArrayList a;
    public boolean b;
    public long c;
    public boolean d;
    public hcur e;
    private final SensorManager f;
    private final Sensor g;
    private List h;
    private int i;
    private boolean j;
    private final FlashlightManager.lightSensorListener.1 k;

    public gaug(SensorManager sensorManager0, Sensor sensor0) {
        this.f = sensorManager0;
        this.g = sensor0;
        this.a = new ArrayList();
        this.h = ibps.a;
        this.b = true;
        gaxl.a();
        this.e = hcur.b;
        this.k = new FlashlightManager.lightSensorListener.1(this);
    }

    public final void a() {
        int v = this.i + 1;
        this.i = v;
        if(v == 1) {
            this.f.registerListener(this.k, this.g, 3);
            this.c = -hziq.b();
        }
    }

    public final void b() {
        int v = this.i - 1;
        this.i = v;
        if(v == 0) {
            this.f.unregisterListener(this.k);
        }
    }

    public final void c() {
        synchronized(this) {
            boolean z = true;
            switch(this.e.ordinal()) {
                case 0: 
                case 1: {
                    z = false;
                    break;
                }
                case 2: {
                    if(!this.d) {
                        z = false;
                        break;
                    }
                    break;
                }
                case 3: {
                    break;
                }
                default: {
                    throw new ibnq();
                }
            }
            if(this.j != z) {
                this.j = z;
                hcur hcur0 = z ? hcur.d : hcur.b;
                if(this.b) {
                    this.h = ggdx.a(this.a);
                    this.b = false;
                }
                for(Object object0: this.h) {
                    ((gauf)object0).j(hcur0);
                }
            }
        }
    }
}

