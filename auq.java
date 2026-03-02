import android.graphics.SurfaceTexture;
import android.util.Size;
import android.view.Surface;
import androidx.camera.camera2.internal.compat.quirk.RepeatingStreamConstraintForVideoRecordingQuirk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

final class auq {
    public bka a;
    public bmb b;
    public final aup c;
    public final Size d;
    public final apa e;
    private final ayq f;
    private blu g;

    public auq(awp awp0, ats ats0, apa apa0) {
        Size size1;
        ayq ayq0 = new ayq();
        this.f = ayq0;
        Size size0 = null;
        this.g = null;
        this.c = new aup();
        this.e = apa0;
        Size[] arr_size = awp0.b().b(34);
        if(arr_size == null) {
            bcs.a("MeteringRepeating", "Can not get output size list.");
            size1 = new Size(0, 0);
        }
        else {
            if(ayq0.c != null && RepeatingStreamConstraintForVideoRecordingQuirk.a()) {
                ArrayList arrayList0 = new ArrayList();
                for(int v = 0; v < arr_size.length; ++v) {
                    Size size2 = arr_size[v];
                    if(ayq.b.compare(size2, ayq.a) >= 0) {
                        arrayList0.add(size2);
                    }
                }
                arr_size = (Size[])arrayList0.toArray(new Size[0]);
            }
            List list0 = Arrays.asList(arr_size);
            Collections.sort(list0, new aun());
            Size size3 = ats0.b();
            long v1 = Math.min(((long)size3.getWidth()) * ((long)size3.getHeight()), 0x4B000L);
            int v2 = 0;
            while(true) {
                if(v2 < arr_size.length) {
                    Size size4 = arr_size[v2];
                    int v3 = Long.compare(((long)size4.getWidth()) * ((long)size4.getHeight()), v1);
                    if(v3 == 0) {
                        size1 = size4;
                        break;
                    }
                    if(v3 <= 0) {
                        ++v2;
                        size0 = size4;
                        continue;
                    }
                    else if(size0 != null) {
                        size1 = size0;
                        break;
                    }
                }
                size1 = (Size)list0.get(0);
                break;
            }
        }
        this.d = size1;
        Objects.toString(size1);
        bcs.h("MeteringRepeating");
        this.b = this.a();
    }

    final bmb a() {
        SurfaceTexture surfaceTexture0 = new SurfaceTexture(0);
        surfaceTexture0.setDefaultBufferSize(this.d.getWidth(), this.d.getHeight());
        Surface surface0 = new Surface(surfaceTexture0);
        blt blt0 = blt.b(this.c, this.d);
        blt0.q(1);
        bkr bkr0 = new bkr(surface0);
        this.a = bkr0;
        bpt.j(bkr0.c(), new auo(surface0, surfaceTexture0), bol.a());
        blt0.l(this.a);
        blu blu0 = this.g;
        if(blu0 != null) {
            blu0.b();
        }
        blu blu1 = new blu(new aum(this));
        this.g = blu1;
        blt0.f = blu1;
        return blt0.a();
    }
}

