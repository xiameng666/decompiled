import android.net.Uri;
import com.google.android.chimera.config.ModuleManager;
import com.google.android.gms.chimera.modules.auth.blockstore.AppContextProvider;

public final class aiqk implements aiqb {
    public static final bboh a;
    public final frli b;

    static {
        aiqk.a = aiqz.b("ClearcutEventBufferImpl");
    }

    public aiqk() {
        frce frce0 = new frce(AppContextProvider.a());
        frce0.d("blockstore");
        frce0.e("clearcutLogBuffer.pb");
        Uri uri0 = frce0.a();
        frie frie0 = frif.a();
        frie0.f(uri0);
        frie0.e(((MessageLite)ajar.a));
        frif frif0 = frie0.a();
        this.b = cjtb.a.a(frif0);
    }

    @Override  // aiqb
    public final gmcd a(wvp wvp0) {
        ((ggtj)aiqk.a.h()).x("Buffering a RetrieveBytesEvent");
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)ajaq.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((ajaq)hftv0).e = 2;
        ((ajaq)hftv0).b |= 1;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ajaq ajaq0 = (ajaq)hftp0.b_message;
        wvp0.getClass();
        ajaq0.d = wvp0;
        ajaq0.c = 6;
        int v = this.d();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ajaq ajaq1 = (ajaq)hftp0.b_message;
        ajaq1.b |= 2;
        ajaq1.f = v;
        aiqe aiqe0 = new aiqe(((ajaq)hftp0.N_build()));
        return this.b.b(aiqe0, gmap.a);
    }

    @Override  // aiqb
    public final gmcd b(wvr wvr0) {
        ((ggtj)aiqk.a.h()).x("Buffering a SetBlockstoreDataEvent");
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)ajaq.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((ajaq)hftv0).e = 3;
        ((ajaq)hftv0).b |= 1;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ajaq ajaq0 = (ajaq)hftp0.b_message;
        wvr0.getClass();
        ajaq0.d = wvr0;
        ajaq0.c = 2;
        int v = this.d();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ajaq ajaq1 = (ajaq)hftp0.b_message;
        ajaq1.b |= 2;
        ajaq1.f = v;
        aiqc aiqc0 = new aiqc(((ajaq)hftp0.N_build()));
        return this.b.b(aiqc0, gmap.a);
    }

    @Override  // aiqb
    public final gmcd c() {
        return glzd.f(this.b.a(), new aiqd(), gmap.a);
    }

    public final int d() {
        return hpsg.a.d().l() ? ModuleManager.get(AppContextProvider.a()).getCurrentModule().moduleVersion : 0;
    }
}

