import android.util.Log;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.List;

final class fdyi implements fdyf {
    private final ffau a;
    private final List b;
    private final fdwt c;
    private final String d;
    private final gfug e;
    private FileInputStream f;
    private final MessageDigest g;
    private final ByteBuffer h;
    private int i;
    private int j;
    private boolean k;

    public fdyi(int v, ffau ffau0, fdwt fdwt0, int v1, gfuv gfuv0) {
        this.i = 0;
        this.j = 0;
        this.k = false;
        batl.s(ffau0);
        this.c = fdwt0;
        this.g = fdvl.x();
        this.h = ByteBuffer.allocate(v1 - 73);
        if(fdwt0 == null) {
            this.f = null;
        }
        else {
            ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)ffau0).jf(5, null);
            hftp0.X(((ProtoLiteMessage)ffau0));
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ffau ffau1 = (ffau)hftp0.b_message;
            ffau1.b |= 0x1000;
            ffau1.o = true;
            ffau0 = (ffau)hftp0.N_build();
            try {
                this.f = new FileInputStream(fdwt0.b);
            }
            catch(FileNotFoundException fileNotFoundException0) {
                Log.w("wearable", "Failed to open attachment file to send.", fileNotFoundException0);
                this.f = null;
            }
        }
        this.a = ffau0;
        List list0 = feaa.g(ffau0, v1, v);
        this.b = list0;
        this.d = ((ffav)list0.get(0)).d;
        if(hzzc.c()) {
            this.e = gfug.c(gfuv0);
            return;
        }
        this.e = new gfug(gfuv0);
    }

    @Override  // fdyf
    public final int a() {
        return this.j;
    }

    @Override  // fdyf
    public final int b() {
        return this.i;
    }

    @Override  // fdyf
    public final ffau c() {
        return this.a;
    }

    @Override  // fdyf
    public final ffav d() {
        boolean z;
        if(this.i()) {
            throw new IllegalArgumentException("Called getNextMessagePiece on an empty array.");
        }
        ++this.i;
        List list0 = this.b;
        if(!list0.isEmpty()) {
            return (ffav)list0.remove(0);
        }
        try {
            z = false;
            ByteBuffer byteBuffer0 = this.h;
            byteBuffer0.clear();
            while(true) {
                if(!byteBuffer0.hasRemaining()) {
                    goto label_16;
                }
                int v = this.f.read(byteBuffer0.array(), byteBuffer0.position(), byteBuffer0.remaining());
                if(v < 0) {
                    break;
                }
                byteBuffer0.position(byteBuffer0.position() + v);
            }
        }
        catch(IOException iOException0) {
            Log.w("wearable", "QueuedMessage: Error when trying to read next segment in file.", iOException0);
        }
        z = true;
    label_16:
        MessageDigest messageDigest0 = this.g;
        messageDigest0.update(this.h.array(), 0, this.h.position());
        ByteString hfsf0 = ByteString.z(this.h.array(), 0, this.h.position());
        String s = this.d;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)ffau.a).v_newBuilder();
        fezo fezo0 = fezo.a;
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)fezo0).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp1.b_message;
        s.getClass();
        ((fezo)hftv0).b |= 1;
        ((fezo)hftv0).c = s;
        if(!hftv0.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp1.b_message;
        ((fezo)hftv1).b |= 4;
        ((fezo)hftv1).e = hfsf0;
        if(!hftv1.isImmutable()) {
            hftp1.ensureMutable();
        }
        fezo fezo1 = (fezo)hftp1.b_message;
        fezo1.b |= 2;
        fezo1.d = z;
        if(z) {
            String s1 = fdvl.v(messageDigest0.digest());
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            fezo fezo2 = (fezo)hftp1.b_message;
            fezo2.b |= 8;
            fezo2.f = s1;
        }
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ffau ffau0 = (ffau)hftp0.b_message;
        fezo fezo3 = (fezo)hftp1.N_build();
        fezo3.getClass();
        ffau0.n = fezo3;
        ffau0.b |= 0x800;
        ffau ffau1 = (ffau)hftp0.N_build();
        if(z) {
            if(Log.isLoggable("wearable", 3)) {
                fezo fezo4 = ffau1.n;
                if(fezo4 != null) {
                    fezo0 = fezo4;
                }
                Log.d("wearable", "Sending final file piece for file with digest: " + fezo0.f);
            }
            this.f();
        }
        return feaa.e(ffau1);
    }

    @Override  // fdyf
    public final gfug e() {
        return this.e;
    }

    @Override  // fdyf
    public final void f() {
        this.b.clear();
        FileInputStream fileInputStream0 = this.f;
        if(fileInputStream0 != null) {
            try {
                fileInputStream0.close();
            }
            catch(IOException unused_ex) {
            }
            this.f = null;
        }
    }

    @Override  // fdyf
    public final void g(int v) {
        this.j += v;
    }

    @Override  // fdyf
    public final boolean h() {
        return this.k;
    }

    @Override  // fdyf
    public final boolean i() {
        return this.b.isEmpty() && this.f == null;
    }

    @Override  // fdyf
    public final void j() {
        this.k = true;
    }
}

