import android.content.ContextWrapper;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.view.View;

public final class gast {
    public final gatj a;
    public final garw b;
    public final gasy c;
    public final gasc d;
    public final gasm e;
    public final gats f;
    public final gbdr g;
    public final gaug h;
    public final gask i;
    public gasv j;

    public gast(gatj gatj0, garw garw0, gasy gasy0, gasc gasc0, gasm gasm0, gbdr gbdr0) {
        gaui gaui0;
        this.a = gatj0;
        this.b = garw0;
        this.c = gasy0;
        this.d = gasc0;
        this.e = gasm0;
        gaxl.a();
        ContextWrapper contextWrapper0 = gatj0.e;
        gaug gaug0 = null;
        if(contextWrapper0.getPackageManager().hasSystemFeature("android.hardware.camera.flash")) {
            Object object0 = contextWrapper0.getSystemService("sensor");
            if((object0 instanceof SensorManager)) {
                Sensor sensor0 = ((SensorManager)object0).getDefaultSensor(5);
                if(sensor0 != null) {
                    gaug0 = new gaug(((SensorManager)object0), sensor0);
                }
            }
        }
        this.h = gaug0;
        this.i = new gask(gatj0.e, gasy0);
        xob xob0 = gatj0.b;
        int v = gatj0.a.b;
        gati gati0 = new gati(gatj0);
        if(v == 24) {
            gaui0 = new gaui(xob0, gaug0, gati0);
        }
        else {
            gaxl.a();
            gaui0 = hziq.a.c().q() ? new gaue(xob0, gaug0, gati0) : new gatx(xob0, gaug0, gati0);
        }
        this.f = gaui0;
        this.g = gbdr0;
    }

    public final View a() {
        return this.c.a();
    }
}

