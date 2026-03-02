import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.DngCreator;
import androidx.camera.core.internal.compat.quirk.IncorrectJpegMetadataQuirk;
import androidx.camera.core.internal.compat.quirk.LowMemoryQuirk;
import j..util.Objects;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.Executor;
import jeb.synthetic.TWR;

public final class bgs {
    final Executor a;
    bfs b;
    public bgq c;
    public bse d;
    public bse e;
    public bse f;
    public bse g;
    public bse h;
    public bse i;
    public bse j;
    public final blp k;
    public final boolean l;
    private final CameraCharacteristics m;

    public bgs(Executor executor0, CameraCharacteristics cameraCharacteristics0) {
        blp blp0 = bqz.a;
        super();
        this.a = bqz.a(LowMemoryQuirk.class) == null ? executor0 : new boz(executor0);
        this.m = cameraCharacteristics0;
        this.k = blp0;
        this.l = blp0.c(IncorrectJpegMetadataQuirk.class);
    }

    final void a(bgr bgr0) {
        bgt bgt0;
        try {
            bgt0 = bgr0.a;
            boolean z = false;
            int v = this.c.d.size();
            bca bca0 = bgt0.b;
            if(bca0 == null && bgt0.c == null) {
                bcs.h("ProcessingNode");
                Object object0 = this.d.a(bgr0);
                List list0 = this.c.d;
                kay.a(((boolean)(list0.isEmpty() ^ 1)));
                int v1 = (int)(((Integer)list0.get(0)));
                if((((bsf)object0).c == 35 || this.l) && v1 == 0x100) {
                    Object object1 = this.e.a(new bfv(((bsf)object0), bgt0.f));
                    object0 = this.j.a(object1);
                }
                Object object2 = this.i.a(object0);
                if(list0.size() <= 1) {
                    bow.a().execute(new bgm(bgt0, ((bcn)object2)));
                    return;
                }
                ((bcn)object2).a();
                throw null;
            }
            bcs.h("ProcessingNode");
            List list1 = this.c.d;
            kay.a(((boolean)(list1.isEmpty() ^ 1)));
            Integer integer0 = (Integer)list1.get(0);
            int v2 = (int)integer0;
            kay.b(brh.b(v2) || v2 == 0x20, String.format("On-disk capture only support JPEG and JPEG/R and RAW output formats. Output format: %s", integer0));
            kay.b(bca0 != null, "OutputFileOptions cannot be empty");
            Object object3 = this.d.a(bgr0);
            if(list1.size() > 1) {
                if(bca0 == null) {
                    bca0 = null;
                }
                else if(bgt0.c != null) {
                    z = true;
                }
                kay.b(z, "The number of OutputFileOptions for simultaneous capture should be at least two");
                if(((bsf)object3).c != 0x20) {
                    this.d(((bsf)object3), ((bca)Objects.requireNonNull(bgt0.c)), bgt0.f);
                    throw null;
                }
                this.e(((bsf)object3), ((bca)Objects.requireNonNull(bca0)));
                throw null;
            }
            if(v2 == 0x20) {
                this.e(((bsf)object3), ((bca)Objects.requireNonNull(bca0)));
            }
            else {
                this.d(((bsf)object3), ((bca)Objects.requireNonNull(bca0)), bgt0.f);
            }
            if(v > 1) {
                throw null;
            }
            bow.a().execute(new bgn(bgt0));
        }
        catch(bcf bcf0) {
            bgs.c(bgt0, bcf0);
        }
        catch(OutOfMemoryError outOfMemoryError0) {
            bgs.c(bgt0, new bcf("Processing failed due to low memory.", outOfMemoryError0));
        }
        catch(RuntimeException runtimeException0) {
            bgs.c(bgt0, new bcf("Processing failed.", runtimeException0));
        }
    }

    private final bsf b(bsf bsf0, int v) {
        kay.c(brh.b(bsf0.c));
        Object object0 = this.h.a(bsf0);
        return (bsf)this.f.a(new bfa(((bsf)object0), v));
    }

    private static final void c(bgt bgt0, bcf bcf0) {
        bow.a().execute(new bgk(bgt0, bcf0));
    }

    private final void d(bsf bsf0, bca bca0, int v) {
        Object object0 = this.e.a(new bfv(bsf0, v));
        if(bok.m(((bsf)object0).e, ((bsf)object0).d)) {
            object0 = this.b(((bsf)object0), v);
        }
        bcb bcb0 = (bcb)this.g.a(new bfz(((bsf)object0), ((bca)Objects.requireNonNull(bca0))));
    }

    private final void e(bsf bsf0, bca bca0) {
        int v;
        if(this.b == null) {
            CameraCharacteristics cameraCharacteristics0 = this.m;
            if(cameraCharacteristics0 == null) {
                throw new bcf("CameraCharacteristics is null, DngCreator cannot be created", null);
            }
            bhv bhv0 = bsf0.h;
            if(bhv0.b() == null) {
                throw new bcf("CameraCaptureResult is null, DngCreator cannot be created", null);
            }
            this.b = new bfs(((CameraCharacteristics)Objects.requireNonNull(cameraCharacteristics0)), ((CaptureResult)Objects.requireNonNull(bhv0.b())));
        }
        bfs bfs0 = this.b;
        bca bca1 = (bca)Objects.requireNonNull(bca0);
        bfr bfr0 = new bfr(((bcn)bsf0.a), bsf0.f, bca1);
        bcn bcn0 = bfr0.a;
        File file0 = bft.a();
        try {
            try(FileOutputStream fileOutputStream0 = new FileOutputStream(file0)) {
                DngCreator dngCreator0 = bfs0.a;
                switch(bfr0.b) {
                    case 0: {
                        v = 1;
                        break;
                    }
                    case 90: {
                        v = 6;
                        break;
                    }
                    case 180: {
                        v = 3;
                        break;
                    }
                    case 270: {
                        v = 8;
                        break;
                    }
                    default: {
                        v = 0;
                    }
                }
                dngCreator0.setOrientation(v);
                dngCreator0.writeImage(fileOutputStream0, bcn0.d());
            }
            catch(IllegalArgumentException illegalArgumentException0) {
                throw new bcf("Image with an unsupported format was used", illegalArgumentException0);
            }
            catch(IllegalStateException illegalStateException0) {
                throw new bcf("Not enough metadata information has been set to write a well-formatted DNG file", illegalStateException0);
            }
            catch(IOException iOException0) {
                throw new bcf("Failed to write to temp file", iOException0);
            }
        }
        catch(Throwable throwable0) {
            TWR.safeClose$NT(bcn0, throwable0);
            throw throwable0;
        }
        bcn0.close();
        try {
            try {
                throw null;
            }
            catch(IOException unused_ex) {
                throw new bcf("Failed to write to OutputStream.", null);
            }
        }
        catch(Throwable throwable1) {
            file0.delete();
            throw throwable1;
        }
    }
}

