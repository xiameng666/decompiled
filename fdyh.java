import android.util.Log;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

final class fdyh implements fdyf {
    private final ffau a;
    private final List b;
    private int c;
    private int d;
    private boolean e;

    public fdyh(int v, ffau ffau0, fdwt fdwt0, int v1) {
        ByteString hfsf0;
        this.c = 0;
        this.d = 0;
        this.e = false;
        batl.s(ffau0);
        if(fdwt0 != null) {
            if((ffau0.b & 1) == 0) {
                ffau0 = null;
            }
            else {
                try {
                    FileInputStream fileInputStream0 = new FileInputStream(fdwt0.b);
                    try {
                        hfsf0 = ByteString.C(fileInputStream0);
                    }
                    finally {
                        ghjp.a(fileInputStream0);
                    }
                    if(hfsf0 != null) {
                        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)ffau0).jf(5, null);
                        hftp0.X(((ProtoLiteMessage)ffau0));
                        ffbx ffbx0 = ffau0.c == null ? ffbx.a : ffau0.c;
                        ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)ffbx0).jf(5, null);
                        hftp1.X(((ProtoLiteMessage)ffbx0));
                        if(!hftp1.b_message.isImmutable()) {
                            hftp1.ensureMutable();
                        }
                        ffbx ffbx1 = (ffbx)hftp1.b_message;
                        ffbx1.b |= 4;
                        ffbx1.e = hfsf0;
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        ffau ffau1 = (ffau)hftp0.b_message;
                        ffbx ffbx2 = (ffbx)hftp1.N_build();
                        ffbx2.getClass();
                        ffau1.c = ffbx2;
                        ffau1.b |= 1;
                        ffau0 = (ffau)hftp0.N_build();
                    }
                }
                catch(IOException iOException0) {
                    Log.w("wearable", "Dropped outgoing message: failed to read attachment file.", iOException0);
                    ffau0 = null;
                }
            }
            if(ffau0 == null) {
                this.a = null;
                this.b = null;
                return;
            }
        }
        this.a = ffau0;
        this.b = feaa.g(ffau0, v1, v);
    }

    @Override  // fdyf
    public final int a() {
        return this.d;
    }

    @Override  // fdyf
    public final int b() {
        return this.c;
    }

    @Override  // fdyf
    public final ffau c() {
        return this.a;
    }

    @Override  // fdyf
    public final ffav d() {
        if(this.i()) {
            throw new IllegalArgumentException("Called getNextMessagePieces on a done QueuedMessage");
        }
        ++this.c;
        return (ffav)this.b.remove(0);
    }

    @Override  // fdyf
    public final gfug e() {
        return new gfug(gfqs.a);
    }

    @Override  // fdyf
    public final void f() {
    }

    @Override  // fdyf
    public final void g(int v) {
        this.d += v;
    }

    @Override  // fdyf
    public final boolean h() {
        return this.e;
    }

    @Override  // fdyf
    public final boolean i() {
        return this.b == null || this.b.isEmpty();
    }

    @Override  // fdyf
    public final void j() {
        this.e = true;
    }
}

