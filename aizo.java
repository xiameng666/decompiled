import android.content.pm.Signature;
import android.net.Uri;
import com.google.android.gms.auth.blockstore.DeleteBytesRequest;
import com.google.android.gms.auth.blockstore.RetrieveBytesRequest;
import com.google.android.gms.auth.blockstore.StoreBytesData;
import com.google.android.gms.chimera.modules.auth.blockstore.AppContextProvider;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

public final class aizo implements aiyg {
    public static final bboh a;
    public static volatile aizo b;
    public final frli c;

    static {
        aizo.a = aiqz.b("DataStoreImpl");
    }

    public aizo() {
        frce frce0 = new frce(AppContextProvider.a());
        frce0.d("blockstore");
        frce0.e("schema.pb");
        Uri uri0 = frce0.a();
        frie frie0 = frif.a();
        frie0.f(uri0);
        frie0.e(((MessageLite)ajbz.a));
        frif frif0 = frie0.a();
        this.c = cjtb.a.a(frif0);
    }

    @Override  // aiyg
    public final gmcd a(String s, Signature[] arr_signature, DeleteBytesRequest deleteBytesRequest0) {
        gfsx gfsx0 = aizr.d(s, arr_signature, aizo.a);
        if(!gfsx0.i()) {
            aizs aizs0 = new aizs();
            aizs0.a = 4;
            aizs0.b(false);
            return gmbu.i(aizs0.a());
        }
        Object object0 = gfsx0.d();
        aizs aizs1 = new aizs();
        aizs1.a = 1;
        aizs1.b(false);
        AtomicReference atomicReference0 = new AtomicReference(aizs1.a());
        aiyy aiyy0 = new aiyy(atomicReference0, deleteBytesRequest0, ((String)object0));
        return glzd.f(this.c.b(aiyy0, gmap.a), new aiyz(atomicReference0), gmap.a);
    }

    @Override  // aiyg
    public final gmcd b(String s) {
        return glzd.f(this.c.a(), new aiyh(s), gmap.a);
    }

    @Override  // aiyg
    public final gmcd c(ajab ajab0) {
        return glzd.f(this.c.a(), new aiyq(ajab0), gmap.a);
    }

    @Override  // aiyg
    public final gmcd d() {
        return glzd.f(this.c.a(), new aiyl(), gmap.a);
    }

    @Override  // aiyg
    public final gmcd e() {
        return glzd.f(this.c.a(), new aizb(), gmap.a);
    }

    @Override  // aiyg
    public final gmcd f() {
        return glzd.f(this.c.a(), new aiyo(), gmap.a);
    }

    @Override  // aiyg
    public final gmcd g(String s, Signature[] arr_signature, RetrieveBytesRequest retrieveBytesRequest0, int v) {
        return glzd.f(this.c.a(), new aiyn(s, arr_signature, retrieveBytesRequest0, v), gmap.a);
    }

    @Override  // aiyg
    public final gmcd h(boolean z) {
        return glzd.f(this.c.a(), new aizm(z), gmap.a);
    }

    @Override  // aiyg
    public final gmcd i(List list0) {
        ((ggtj)aizo.a.h()).z("Clearing all the Blockstore Data for %s packages", list0.size());
        AtomicBoolean atomicBoolean0 = new AtomicBoolean(false);
        aizk aizk0 = new aizk(list0, atomicBoolean0);
        return glzd.f(this.c.b(aizk0, gmap.a), new aizl(atomicBoolean0), gmap.a);
    }

    @Override  // aiyg
    public final gmcd j(aizq aizq0) {
        return aiyj.a(this.c, aizq0, gfqx.a);
    }

    @Override  // aiyg
    public final gmcd k(aizq aizq0, gfsx gfsx0) {
        return aiyj.a(this.c, aizq0, gfsx0);
    }

    @Override  // aiyg
    public final gmcd l(String s, Signature[] arr_signature, StoreBytesData storeBytesData0) {
        byte[] arr_b = ajca.c(storeBytesData0);
        String s1 = ajca.a(storeBytesData0.c);
        boolean z = ajca.b(s1);
        AtomicReference atomicReference0 = new AtomicReference(new aiyf(1));
        gfsx gfsx0 = aizr.d(s, arr_signature, aizo.a);
        if(!gfsx0.i()) {
            return gmbu.i(new aiyf(4));
        }
        aiyr aiyr0 = new aiyr(atomicReference0, z, ((String)gfsx0.d()), s1, arr_b, s, storeBytesData0);
        return glzd.f(this.c.b(aiyr0, gmap.a), new aiys(atomicReference0), gmap.a);
    }

    @Override  // aiyg
    public final gmcd m(byte[] arr_b, ajak ajak0) {
        int v;
        ajbz ajbz0;
        ((ggtj)aizo.a.h()).X("Writing %d bytes of block data into block_data. RestoreType: %s. WriteOption: %s", Integer.valueOf(arr_b.length), Integer.valueOf(ajak0.a), ajak0.b);
        try {
            ajbz0 = (ajbz)((ProtoLiteBuilder)((ProtoLiteMessage)ajbz.a).v_newBuilder().A(arr_b, hftc.a())).N_build();
            v = ajbt.a(ajbz0.d);
        }
        catch(hfur hfur0) {
            return gmbu.h(hfur0);
        }
        if(v == 0) {
            v = 1;
        }
        if(v != 1) {
            return gmbu.h(new IllegalArgumentException("cannot write data with encryption type " + (v - 1)));
        }
        int v1 = aizo.q();
        int v2 = aizr.a(ajbz0);
        ajal ajal0 = ajam.a();
        ajal0.b(v2);
        ajal0.a = 2;
        aiza aiza0 = new aiza(ajak0, v1, ajbz0, ajal0);
        return glzd.f(this.c.b(aiza0, gmap.a), new aizc(ajal0), gmap.a);
    }

    public static aizo n() {
        if(aizo.b == null) {
            Class class0 = aizo.class;
            synchronized(class0) {
                if(aizo.b == null) {
                    aizo.b = new aizo();
                }
            }
            return aizo.b;
        }
        return aizo.b;
    }

    public final gmcd o(long v, boolean z) {
        aiym aiym0 = new aiym(v, z);
        return this.c.b(aiym0, gmap.a);
    }

    public static boolean p(ajbz ajbz0) {
        ajbu ajbu0 = ajbz0.j == null ? ajbu.a : ajbz0.j;
        if((ajbu0.d == null ? ajau.a : ajbu0.d).c > 0L) {
            ajbu ajbu1 = ajbz0.j == null ? ajbu.a : ajbz0.j;
            return !(ajbu1.d == null ? ajau.a : ajbu1.d).d;
        }
        return false;
    }

    static final int q() {
        return hprv.a.f().m() ? 2 : 1;
    }
}

