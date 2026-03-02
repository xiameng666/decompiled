import android.hardware.camera2.CameraCaptureSession.StateCallback;
import android.hardware.camera2.CameraDevice.StateCallback;
import android.hardware.camera2.params.InputConfiguration;
import android.util.Range;
import android.util.Size;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class blt {
    public final Set a;
    public final bjm b;
    final List c;
    final List d;
    public final List e;
    public blv f;
    public InputConfiguration g;
    public int h;
    public bly i;

    public blt() {
        this.a = new LinkedHashSet();
        this.b = new bjm();
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.h = 0;
    }

    public bmb a() {
        return new bmb(new ArrayList(this.a), new ArrayList(this.c), new ArrayList(this.d), new ArrayList(this.e), this.b.b(), this.f, this.g, this.h, this.i);
    }

    public static blt b(bnc bnc0, Size size0) {
        blw blw0 = bnc0.x();
        if(blw0 == null) {
            throw new IllegalStateException("Implementation is missing option unpacker for " + bnc0.p(bnc0.toString()));
        }
        blt blt0 = new blt();
        blw0.a(size0, bnc0, blt0);
        return blt0;
    }

    public final void c(Collection collection0) {
        for(Object object0: collection0) {
            this.g(((CameraDevice.StateCallback)object0));
        }
    }

    public final void d(Collection collection0) {
        this.b.c(collection0);
    }

    public final void e(List list0) {
        for(Object object0: list0) {
            this.k(((CameraCaptureSession.StateCallback)object0));
        }
    }

    public final void f(bhl bhl0) {
        this.b.d(bhl0);
        List list0 = this.e;
        if(!list0.contains(bhl0)) {
            list0.add(bhl0);
        }
    }

    public final void g(CameraDevice.StateCallback cameraDevice$StateCallback0) {
        List list0 = this.c;
        if(list0.contains(cameraDevice$StateCallback0)) {
            return;
        }
        list0.add(cameraDevice$StateCallback0);
    }

    public final void h(bjt bjt0) {
        this.b.f(bjt0);
    }

    public final void i(bka bka0) {
        blx blx0 = bly.a(bka0);
        blx0.b(bat.b);
        bly bly0 = blx0.a();
        this.a.add(bly0);
    }

    public final void j(bhl bhl0) {
        this.b.d(bhl0);
    }

    public final void k(CameraCaptureSession.StateCallback cameraCaptureSession$StateCallback0) {
        List list0 = this.d;
        if(list0.contains(cameraCaptureSession$StateCallback0)) {
            return;
        }
        list0.add(cameraCaptureSession$StateCallback0);
    }

    public final void l(bka bka0) {
        this.r(bka0, bat.b);
    }

    public final void m(bka bka0, bat bat0, int v) {
        blx blx0 = bly.a(bka0);
        blx0.b(bat0);
        blx0.c(v);
        bly bly0 = blx0.a();
        this.a.add(bly0);
        this.b.g(bka0);
    }

    public final void n(Range range0) {
        this.b.i(range0);
    }

    public final void o(bjt bjt0) {
        this.b.j(bjt0);
    }

    public final void p(int v) {
        if(v != 0) {
            this.b.k(v);
        }
    }

    public final void q(int v) {
        this.b.b = v;
    }

    public final void r(bka bka0, bat bat0) {
        this.m(bka0, bat0, -1);
    }
}

