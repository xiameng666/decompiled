import android.content.Context;
import android.os.RemoteException;
import android.os.SystemClock;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.atomic.AtomicReference;

public final class aixw extends cjtm {
    public static final bboh a;
    private final aink b;
    private final aioz c;
    private final byte[] d;

    static {
        aixw.a = aiqz.b("SetBlockstoreDataOperation");
    }

    public aixw(aink aink0, aioz aioz0, byte[] arr_b) {
        super(0x102, "SetBlockstoreData");
        this.b = aink0;
        this.c = aioz0;
        this.d = arr_b;
    }

    public final void b(Status status0, int v) {
        try {
            this.c.a(status0, v);
        }
        catch(RemoteException remoteException0) {
            a.ae(aixw.a.i(), "Client died during setBlockstoreData()", remoteException0);
        }
    }

    @Override  // cjtm
    protected final void f(Context context0) {
        gmcd gmcd0;
        boolean z = bbod.c(hprv.d());
        byte[] arr_b = this.d;
        aink aink0 = this.b;
        Integer integer0 = (int)0;
        if(!z) {
            ((ggtj)aink.a.h()).H("Blockstore is not enabled, not storing %d bytes for %s", arr_b.length, aink0.d);
            gmcd0 = gmbu.i(integer0);
        }
        else if(bbod.c(hprv.c())) {
            String s = aink0.d;
            if(aink.c.contains(s)) {
                long v = SystemClock.elapsedRealtime();
                AtomicReference atomicReference0 = new AtomicReference(ajam.b());
                if(arr_b != null && arr_b.length != 0) {
                    ajai ajai0 = new ajai();
                    ajai0.b(0);
                    ajai0.c(ajaj.a);
                    ajak ajak0 = ajai0.a();
                    gmcd0 = glzd.g(glzd.g(glzd.g(gmbt.h(aink0.h.m(arr_b, ajak0)), new aimo(aink0, atomicReference0, arr_b, v), gmap.a), new aimp(aink0), gmap.a), new aimq(aink0, atomicReference0, v, arr_b), gmap.a);
                }
                else {
                    ((ggtj)aink.a.h()).B("Serialized input byte-array is empty, not restoring Blockstore state for %s", s);
                    gmcd0 = glzd.g(gmbt.h(aink0.h(2, v, 0, 0)), new aimn(), gmap.a);
                }
            }
            else {
                ((ggtj)aink.a.h()).B("CallingPackage %s not in access allowlist, not restoring Blockstore state", s);
                gmcd0 = gmbu.i(integer0);
            }
        }
        else {
            ((ggtj)aink.a.h()).B("Blockstore data transfer is not enabled, not restoring Blockstore state for %s", aink0.d);
            gmcd0 = gmbu.i(integer0);
        }
        gmcd gmcd1 = glzd.f(gmbt.h(gmcd0), new aixu(this), gmap.a);
        aixv aixv0 = new aixv(this);
        aixk.b(glyi.f(gmcd1, Throwable.class, aixv0, gmap.a), aixw.a, "Uncaught exception during setBlockstoreData()", new Object[0]);
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.c.a(status0, 0);
    }
}

