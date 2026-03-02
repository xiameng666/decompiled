import j..nio.channels.DesugarChannels;
import j..util.Objects;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

public final class bglu implements evqk {
    public final bglw a;
    public final ScheduledExecutorService b;
    public final String c;

    public bglu(bglw bglw0, ScheduledExecutorService scheduledExecutorService0, String s) {
        this.a = bglw0;
        this.b = scheduledExecutorService0;
        this.c = s;
    }

    @Override  // evqk
    public final evql a(Object object0) {
        if(((gfsx)object0).i()) {
            return evrg.d(((gfsx)object0).d());
        }
        String s = this.c;
        ScheduledExecutorService scheduledExecutorService0 = this.b;
        bglw bglw0 = this.a;
        beuk beuk0 = new beuk(s, TimeUnit.SECONDS.toMillis(30L));
        AtomicReference atomicReference0 = new AtomicReference();
        AtomicReference atomicReference1 = new AtomicReference();
        AtomicReference atomicReference2 = new AtomicReference();
        clcf clcf0 = clcg.f(beuk0.a, ckdc.b, clbk.a, clbj.a);
        beul beul0 = new beul(beuk0.a, atomicReference0, atomicReference2);
        clcn clcn0 = bglw0.b.b.e(clcf0, beul0, scheduledExecutorService0, -1, 0x5A00).e();
        Objects.requireNonNull(clcn0);
        ((bbll)scheduledExecutorService0).g(new beui(clcn0), beuk0.b, TimeUnit.MILLISECONDS);
        try {
            File file0 = beca.a(bglw0.b.c.a);
            if(!file0.exists() && !file0.mkdirs()) {
                throw new IOException("Unable to create directories " + file0.toString());
            }
            atomicReference0.set(File.createTempFile("downloader", "", file0));
            atomicReference1.set(new FileOutputStream(((File)atomicReference0.get())));
        }
        catch(IOException iOException0) {
            return evrg.c(iOException0).h(scheduledExecutorService0, new bglv(bglw0, scheduledExecutorService0, s));
        }
        atomicReference2.set(DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(((FileOutputStream)atomicReference1.get()).getChannel()));
        clcn0.a();
        return beul0.a.a.h(scheduledExecutorService0, new bglv(bglw0, scheduledExecutorService0, s));
    }
}

