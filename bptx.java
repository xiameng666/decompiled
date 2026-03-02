import android.net.Uri;
import com.google.android.gms.wearable.PutDataRequest;
import j..time.Duration;
import java.util.Map.Entry;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

public final class bptx implements bpte {
    public static final bboh a;
    public final fcer b;
    public final fcfe c;
    public final fced d;
    public final hftc e;
    public final ScheduledExecutorService f;
    private final fcfg g;

    static {
        bptx.a = bpsv.a("WearDataLayerClientImpl");
    }

    public bptx(fcer fcer0, fcfe fcfe0, fcfg fcfg0, fced fced0, hftc hftc0, ScheduledExecutorService scheduledExecutorService0) {
        this.b = fcer0;
        this.c = fcfe0;
        this.g = fcfg0;
        this.d = fced0;
        this.e = hftc0;
        this.f = scheduledExecutorService0;
    }

    @Override  // bpte
    public final gmcd a(String s, fqzx fqzx0) {
        byte[] arr_b = fqzx0.toBytesArray();
        return gdta.g(fhra.b(this.c.h(s, "/findmydevice/wearable-device-registration", arr_b))).h(new bpto(), gmap.a);
    }

    @Override  // bpte
    public final gmcd b(Map map0) {
        if(map0.isEmpty()) {
            return this.f("/findmydevice/spot-owner-keys");
        }
        fcfh fcfh0 = fcfh.a("/findmydevice/spot-owner-keys");
        for(Object object0: map0.entrySet()) {
            String s = (String)((Map.Entry)object0).getKey();
            int v = (int)(((Integer)((Map.Entry)object0).getValue()));
            fcfh0.a.p(s, v);
        }
        PutDataRequest putDataRequest0 = fcfh0.b();
        return gdta.g(fhra.b(this.b.h(putDataRequest0))).h(new bptj(), gmap.a);
    }

    @Override  // bpte
    public final gmcd c(fqxh fqxh0) {
        PutDataRequest putDataRequest0 = PutDataRequest.a("/findmydevice/companion-provisioning-state");
        putDataRequest0.c = fqxh0.toBytesArray();
        return gdta.g(fhra.b(this.b.h(putDataRequest0))).h(new bptq(), gmap.a);
    }

    @Override  // bpte
    public final gmcd d(String s, Duration duration0) {
        AtomicReference atomicReference0 = new AtomicReference();
        bpts bpts0 = new bpts(this, atomicReference0, gdta.g(jqy.a(new bptr(this, atomicReference0, s))).j(duration0.toMillis(), TimeUnit.MILLISECONDS, this.f));
        gdrn gdrn0 = new gdrn(gdpc.c(), bpts0);
        gmad gmad0 = new gmad();
        gmdc gmdc0 = new gmdc(new glzv(gdrn0, gmad0));
        this.f.execute(gmdc0);
        return new gdsy(new gmai(gmdc0, gmad0)).g();
    }

    public final gdta e(String s) {
        Uri uri0 = bpuh.a(s, "/findmydevice/provisioning-state");
        baqc.c(uri0, "uri must not be null");
        fdgs fdgs0 = new fdgs(this.b.a, this.b.D, uri0);
        this.b.D.c(fdgs0);
        return gdta.g(fhra.b(batf.b(fdgs0, new fdgy())));
    }

    public final gmcd f(String s) {
        return gdta.g(gdta.g(fhra.b(this.g.g())).h(new bptf(), gmap.a)).i(new bptm(this, s), this.f).h(new bptn(), gmap.a);
    }
}

