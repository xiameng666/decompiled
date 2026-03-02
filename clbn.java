import com.google.android.gms.common.api.Status;
import j..util.Objects;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

public final class clbn extends clck {
    final brtp a;
    private final ByteBuffer b;

    public clbn(brtp brtp0, int v) {
        Objects.requireNonNull(brtp0);
        this.a = brtp0;
        super();
        this.b = ByteBuffer.allocateDirect(v + 1);
    }

    @Override  // clck
    public final void b(clcn clcn0, clcq clcq0) {
        Status status0;
        ghgg ghgg0;
        IOException iOException1;
        FileOutputStream fileOutputStream0;
        ghfz ghfz0;
        ByteBuffer byteBuffer0 = this.b;
        byteBuffer0.flip();
        brtp brtp0 = this.a;
        brub.e("FontsGmsNetworkDL", "Download finished for %s; checking size and hash", new Object[]{brtp0.a});
        if(clcq0.a() != 200) {
            brtp0.b(Status.d);
            return;
        }
        brsw brsw0 = brtp0.b;
        long v = brsw0.d;
        int v1 = 0;
        Closeable closeable0 = null;
        if(Long.compare(byteBuffer0.remaining(), v) == 0) {
            byte[] arr_b = new byte[((int)v)];
            byteBuffer0.get(arr_b);
            try {
                File file0 = brtp0.c;
                File file1 = file0.getParentFile();
                if(file1 != null && !file1.isDirectory()) {
                    brub.f("FontsGmsNetworkDL", "Restoring lost download dir %s", new Object[]{file1});
                    file1.mkdirs();
                }
                byte[] arr_b1 = brsw0.e.toByteArray();
                gftb.z(arr_b1, "hash");
                ghfz0 = ghgc.a;
                if(arr_b1.length == 20) {
                    brub.f("FontsGmsNetworkDL", "SHA1 hash detected; bad!", new Object[0]);
                    ghfz0 = ghgb.a;
                }
                fileOutputStream0 = new FileOutputStream(file0);
            }
            catch(IOException iOException0) {
                iOException1 = iOException0;
                fileOutputStream0 = null;
                goto label_43;
            }
            catch(Throwable throwable0) {
                fileOutputStream0 = null;
                bbpb.b(closeable0);
                bbpb.b(fileOutputStream0);
                throw throwable0;
            }
            try {
                ghgg0 = new ghgg(ghfz0, fileOutputStream0);
                goto label_39;
            }
            catch(IOException iOException2) {
                iOException1 = iOException2;
                goto label_43;
                try {
                label_39:
                    ghgg0.write(arr_b);
                    goto label_56;
                }
                catch(IOException iOException1) {
                }
                catch(Throwable throwable0) {
                    closeable0 = ghgg0;
                    bbpb.b(closeable0);
                    bbpb.b(fileOutputStream0);
                    throw throwable0;
                }
                closeable0 = ghgg0;
                try {
                label_43:
                    brub.g("FontsGmsNetworkDL", iOException1, "Download %s failed in an unexpected way", new Object[]{this.a.a});
                    brtp.c(this.a, iOException1);
                    goto label_48;
                }
                catch(Throwable throwable0) {
                }
                bbpb.b(closeable0);
                bbpb.b(fileOutputStream0);
                throw throwable0;
            }
            catch(Throwable throwable0) {
                bbpb.b(closeable0);
                bbpb.b(fileOutputStream0);
                throw throwable0;
            }
        label_48:
            bbpb.b(closeable0);
            bbpb.b(fileOutputStream0);
            goto label_62;
        label_56:
            bbpb.b(ghgg0);
            bbpb.b(fileOutputStream0);
            closeable0 = ghgg0;
        }
        else {
            brub.f("FontsGmsNetworkDL", "Expected %d bytes but got %d from %s", new Object[]{((long)this.a.b.d), byteBuffer0.remaining(), this.a.a});
            this.a.f = brtq.d;
        }
    label_62:
        brtp brtp1 = this.a;
        synchronized(brtp1.d) {
            if(closeable0 != null && brtp1.f.i == 23509) {
                byte[] arr_b2 = closeable0.a.s().e();
                brsw brsw1 = brtp1.b;
                if(Arrays.equals(arr_b2, brsw1.e.toByteArray())) {
                    File file2 = brtp1.c;
                    long v3 = file2.length();
                    long v4 = brsw1.d;
                    if(v3 == v4) {
                        status0 = Status.b;
                    }
                    else {
                        brub.f("FontsGmsNetworkDL", "Wrong filesize, expected %d, got %d from %s", new Object[]{v4, file2.length(), brtp1.a});
                        status0 = brtq.d;
                    }
                    brtp1.f = status0;
                }
                else {
                    brub.f("FontsGmsNetworkDL", "Wrong hash for %s", new Object[]{brtp1.a});
                    brtp1.f = brtq.c;
                }
            }
        }
        try {
            if(brtp1.f.e()) {
                brtp brtp3 = this.a;
                if(brtp3.g == brto.b) {
                    synchronized(brtp3.i.b) {
                        brtp3.i.f = 0;
                        brtp3.i.e = 0L;
                    }
                    brtp3.i.a();
                }
            }
            else {
                brtp brtp2 = this.a;
                brtp2.c.delete();
                if(brtp2.g == brto.b) {
                    brtu brtu0 = brtp2.i;
                    brub.c("FontsGmsNetworkDL", "Registering a download failure %s", new Object[]{brtu0.getClass()});
                    Object object1 = brtu0.b;
                    synchronized(object1) {
                        int v7 = brtu0.f;
                        if(v7 >= 7) {
                            brtu0.e = 0L;
                        }
                        else {
                            v1 = v7;
                        }
                        brtu0.f = v1 + 1;
                        brtu0.e = System.currentTimeMillis() + TimeUnit.MINUTES.toMillis(((long)brtu0.d[brtu0.f - 1]));
                    }
                    brtu0.a();
                }
            }
        }
        finally {
            this.a.a();
        }
    }

    @Override  // clck
    public final void c(gfsx gfsx0, clbw clbw0) {
        brub.e("FontsGmsNetworkDL", "Download failed for %s", new Object[]{this.a.a, clbw0});
        brtp.c(this.a, clbw0);
    }

    @Override  // clck
    public final void e(clcn clcn0, clcq clcq0) {
        clcn0.d(this.b);
    }

    @Override  // clck
    public final void f(gfsx gfsx0) {
        brub.e("FontsGmsNetworkDL", "Download canceled for %s", new Object[]{this.a.a});
    }

    @Override  // clck
    public final void gg(clcn clcn0, clcq clcq0, ByteBuffer byteBuffer0) {
        clcn0.d(byteBuffer0);
    }

    @Override  // clck
    public final void in(clcn clcn0, clcq clcq0, String s) {
        brub.c("FontsGmsNetworkDL", "redirect received for %s; redirect url is %s", new Object[]{this.a.a, s});
        this.a.b(brtq.g);
        throw new clcm();
    }
}

