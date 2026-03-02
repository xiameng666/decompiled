import android.content.Context;
import com.google.android.gms.leveldb.LevelDb.Iterator;
import com.google.android.gms.leveldb.WriteBatch;
import java.io.File;
import java.io.IOException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.UUID;

final class bnsa {
    public static final bboh a;
    public static final ByteString b;
    public final Object c;
    public final Context d;
    private volatile File e;

    static {
        bnsa.a = bboh.b("EidStorage", bbcu.eD);
        bnsa.b = ByteString.A("ID");
    }

    public bnsa(Context context0) {
        this.c = new Object();
        this.d = context0;
    }

    public static ggeo a(LevelDb.Iterator levelDb$Iterator0, ByteString hfsf0) {
        ggek ggek0 = new ggek();
        ByteString hfsf1 = hfsf0.t(bnsa.b);
        levelDb$Iterator0.seek(hfsf1.toByteArray());
        while(levelDb$Iterator0.isValid() && ByteString.copyFrom(levelDb$Iterator0.key()).L(hfsf1)) {
            byte[] arr_b = levelDb$Iterator0.key();
            ByteBuffer byteBuffer0 = ByteBuffer.wrap(levelDb$Iterator0.value());
            try {
                Short short0 = glxf.c(arr_b[arr_b.length - 2], arr_b[arr_b.length - 1]);
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gsyz.a).v_newBuilder();
                String s = new UUID(byteBuffer0.getLong(), byteBuffer0.getLong()).toString();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gsyz gsyz0 = (gsyz)hftp0.b_message;
                s.getClass();
                gsyz0.b = s;
                ggek0.i(short0, ((gsyz)hftp0.N_build()));
            }
            catch(BufferUnderflowException bufferUnderflowException0) {
                throw new IOException("Illegal device canonic id", bufferUnderflowException0);
            }
            levelDb$Iterator0.next();
        }
        return ggek0.g();
    }

    public static ByteString b() {
        return frai.f(9);
    }

    public final File c() {
        synchronized(this.c) {
            if(this.e == null) {
                this.e = bnoz.a();
            }
        }
        return this.e;
    }

    public static final void d(WriteBatch writeBatch0, ByteString hfsf0, short v, gsyz gsyz0) {
        ByteString hfsf1 = hfsf0.t(bnsa.b);
        byte[] arr_b = frai.d(gsyz0).toByteArray();
        writeBatch0.put(hfsf1.t(ByteString.copyFrom(glxf.d(v))).toByteArray(), arr_b);
    }

    public static final int e(int v) {
        return v * 17 + 1;
    }

    public static final void f(CodedOutputStream hfsq0, List list0, short v) {
        int v1 = 0;
        for(Object object0: list0) {
            gtbs gtbs0 = (gtbs)object0;
            gfsx gfsx0 = (gtbs0.b & 4) == 0 ? gfsx.m(Integer.valueOf(0)) : fquo.b(((byte)gtbs0.e)).b(new bnrx());
            if(gfsx0.i()) {
                long v2 = (gtbs0.c == null ? hfwn.a : gtbs0.c).b << 16;
                int v3 = (int)(((Integer)gfsx0.d()));
                hfsq0.o((gtbs0.d == null ? gtag.a : gtbs0.d).b.j(0, 8));
                hfsq0.am(glxd.h((v2 | ((long)v)) << 8 | ((long)(v3 + v3)) | ((long)v1)));
                v1 = 1 - v1;
            }
            else {
                ((ggtj)((ggtj)bnsa.a.j()).p(100)).z("writePublicKeyIdForTimestampsToBuffer: Unexpected component set id %d", gtbs0.e);
            }
        }
    }
}

