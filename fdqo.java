import android.util.Log;
import j..util.Objects;

public final class fdqo extends fdrc {
    final fdpl a;
    final String b;
    final String c;
    final feyi d;
    final fdri e;
    final ffhh f;

    public fdqo(fdri fdri0, fdpl fdpl0, String s, String s1, ffhh ffhh0, feyi feyi0) {
        this.a = fdpl0;
        this.b = s;
        this.c = s1;
        this.f = ffhh0;
        this.d = feyi0;
        Objects.requireNonNull(fdri0);
        this.e = fdri0;
        super(fdri0);
    }

    @Override  // fdrc
    public final void a() {
        try {
            if(Log.isLoggable("ChannelManager", 2)) {
                Log.v("ChannelManager", String.format("Running createChannel(%s, %s, %s, callbacks)", this.a.b, this.b, this.c));
            }
            fdri fdri0 = this.e;
            String s = this.b;
            if(!fdri0.f.k(s)) {
                Log.w("ChannelManager", "Tried to open channel to unreachable node: " + s);
                this.f.a(13, null, this.c);
                return;
            }
            fdrk fdrk0 = fdri0.d;
            fdpl fdpl0 = this.a;
            boolean z = false;
            int v = 0;
            while(v < 5) {
                ++v;
                long v1 = fdrk0.b.nextLong() & 0x7FFFFFFFFFFFFFFFL;
                fdrj fdrj0 = new fdrj(s, v1, true);
                if(!fdrk0.a.containsKey(fdrj0)) {
                    fdrq fdrq0 = new fdrq(s, fdpl0, v1, true);
                    fdro fdro0 = fdri0.a(this.d, fdrq0, true);
                    fdrk0.e(fdrq0, fdro0);
                    this.g = fdro0;
                    String s1 = this.c;
                    ffhh ffhh0 = this.f;
                    int v2 = fdro0.e;
                    if(v2 == 0) {
                        z = true;
                    }
                    batl.n(z, "Unexpected sendOpen. State: %s", new Object[]{fdro.c(v2)});
                    batl.s(s1);
                    fdro0.h = s1;
                    fdro0.j(1);
                    fdro0.v = ffhh0;
                    ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)feye.a).v_newBuilder();
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ProtoLiteMessage hftv0 = hftp0.b_message;
                    ((feye)hftv0).c = 1;
                    ((feye)hftv0).b |= 1;
                    fdrq fdrq1 = fdro0.a;
                    long v3 = fdrq1.c;
                    if(!hftv0.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ProtoLiteMessage hftv1 = hftp0.b_message;
                    ((feye)hftv1).b |= 2;
                    ((feye)hftv1).d = v3;
                    fdpl fdpl1 = fdrq1.b;
                    String s2 = fdpl1.b;
                    if(!hftv1.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ProtoLiteMessage hftv2 = hftp0.b_message;
                    s2.getClass();
                    ((feye)hftv2).b |= 8;
                    ((feye)hftv2).f = s2;
                    String s3 = fdpl1.d;
                    if(!hftv2.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ProtoLiteMessage hftv3 = hftp0.b_message;
                    s3.getClass();
                    ((feye)hftv3).b |= 16;
                    ((feye)hftv3).g = s3;
                    boolean z1 = fdrq1.d;
                    if(!hftv3.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ProtoLiteMessage hftv4 = hftp0.b_message;
                    ((feye)hftv4).b |= 4;
                    ((feye)hftv4).e = z1;
                    boolean z2 = fdro0.b;
                    if(!hftv4.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ProtoLiteMessage hftv5 = hftp0.b_message;
                    ((feye)hftv5).b |= 0x80;
                    ((feye)hftv5).j = z2;
                    String s4 = fdro0.h;
                    if(s4 != null) {
                        if(!hftv5.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        feye feye0 = (feye)hftp0.b_message;
                        feye0.b |= 0x20;
                        feye0.h = s4;
                    }
                    feyj feyj0 = fdro0.b();
                    ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)feyj0).jf(5, null);
                    hftp1.X(((ProtoLiteMessage)feyj0));
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    feyj feyj1 = (feyj)hftp1.b_message;
                    feye feye1 = (feye)hftp0.N_build();
                    feye1.getClass();
                    feyj1.e = feye1;
                    feyj1.b |= 4;
                    feak feak0 = new feak(fdrq1, ((feyj)hftp1.N_build()));
                    fdro0.t = fdro0.r.b(feak0, 15000L, 1, fdro0.d);
                    return;
                }
            }
            throw new IllegalStateException("Failed to generate a free channel ID. Items in map: " + fdrk0.a.size());
        }
        catch(RuntimeException runtimeException0) {
            this.f.a(8, null, this.c);
            throw runtimeException0;
        }
    }
}

