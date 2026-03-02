import android.net.Uri;
import com.google.android.gms.chimera.modules.tapandpay.AppContextProvider;
import j..util.Objects;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class dxye {
    final frli a;

    public dxye() {
        frce frce0 = new frce(AppContextProvider.a());
        frce0.d("tapandpay");
        frce0.e("multiproc_datastore.pb");
        Uri uri0 = frce0.a();
        frie frie0 = frif.a();
        frie0.f(uri0);
        frie0.e(((MessageLite)esea.a));
        frie0.h(new frjp(cjtd.a));
        frif frif0 = frie0.a();
        this.a = cjtb.a.a(frif0);
    }

    public final fsym a(String s, String s1, long v, long v1, TimeUnit timeUnit0) {
        esea esea0;
        try {
            esea0 = (esea)this.a.a().get(v1, timeUnit0);
        }
        catch(ExecutionException | InterruptedException | TimeoutException unused_ex) {
            return fsym.a;
        }
        fsym fsym0 = ((esdy)Objects.requireNonNull(((esdy)gggq.l(esea0.b, new dxya(s1, s, v), esdy.a)))).e;
        return fsym0 == null ? fsym.a : fsym0;
    }

    public final gmcd b(gfsi gfsi0) {
        return this.a.b(gfsi0, gmap.a);
    }

    public final gmcd c(fsym fsym0, String s, String s1, long v) {
        return this.b(new dxxz(s, s1, v, fsym0));
    }

    public final gmcd d(List list0, String s, String s1, long v) {
        batl.s(list0);
        return this.g(s1, s, v, new dxyd(list0));
    }

    public final gmcd e(fsxt fsxt0, String s, String s1, long v, long v1) {
        return this.g(s1, s, v, new dxxu(v1, new dxxw(fsxt0)));
    }

    public static final fsyk f(long v) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)fsyk.a).v_newBuilder();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gtkg.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((gtkg)hftp1.b_message).f = v;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        fsyk fsyk0 = (fsyk)hftp0.b_message;
        gtkg gtkg0 = (gtkg)hftp1.N_build();
        gtkg0.getClass();
        fsyk0.e = gtkg0;
        fsyk0.b |= 1;
        return (fsyk)hftp0.N_build();
    }

    private final gmcd g(String s, String s1, long v, gfsi gfsi0) {
        dxyb dxyb0 = new dxyb(s, s1, v, gfsi0);
        return this.a.b(dxyb0, gmap.a);
    }
}

