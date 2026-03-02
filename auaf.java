import android.content.Context;
import android.net.Network;
import android.os.SystemClock;
import android.os.WorkSource;
import j..util.Objects;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.nio.channels.ClosedChannelException;
import java.nio.channels.SelectionKey;
import java.nio.channels.SocketChannel;
import java.security.KeyManagementException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLEngineResult.HandshakeStatus;
import javax.net.ssl.SSLEngineResult;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;
import jeb.synthetic.FIN;

public final class auaf {
    private final auaq A;
    private final int B;
    private final long C;
    private auax D;
    private auar E;
    private hfsl F;
    private auas G;
    private auar H;
    private CodedOutputStream I;
    private long J;
    private long K;
    private long L;
    private boolean M;
    private boolean N;
    private String O;
    private boolean P;
    private byte[] Q;
    private boolean R;
    private final SSLContext S;
    private boolean T;
    private SSLEngine U;
    private SSLEngineResult.HandshakeStatus V;
    private ByteBuffer W;
    private ByteBuffer X;
    private boolean Y;
    public final auad a;
    public final String b;
    public final WorkSource c;
    public final boolean d;
    protected int e;
    public InetAddress f;
    public String g;
    public int h;
    public String i;
    public Network j;
    private static final bboh k;
    private static final ByteBuffer[] l;
    private static SSLContext m;
    private static SSLContext n;
    private final gful_cronetEngineProvider o;
    private final gful_cronetEngineProvider p;
    private final gful_cronetEngineProvider q;
    private final gful_cronetEngineProvider r;
    private final gful_cronetEngineProvider s;
    private final gful_cronetEngineProvider t;
    private final gful_cronetEngineProvider u;
    private final Context v;
    private final int w;
    private final Executor x;
    private final atxp y;
    private final avjh z;

    static {
        auaf.k = bboh.b("CastSocket", bbcu.cn);
        auaf.l = new ByteBuffer[]{ByteBuffer.allocate(0)};
    }

    public auaf(Context context0, auad auad0, ScheduledExecutorService scheduledExecutorService0, String s, String s1, int v, boolean z, boolean z1, atxp atxp0) {
        SSLContext sSLContext0;
        this.o = gfus.a(((gful_cronetEngineProvider)new atzu()));
        this.p = gfus.a(((gful_cronetEngineProvider)new atzv()));
        this.q = gfus.a(((gful_cronetEngineProvider)new atzw()));
        this.r = gfus.a(((gful_cronetEngineProvider)new atzx()));
        this.s = gfus.a(((gful_cronetEngineProvider)new atzy()));
        this.t = gfus.a(((gful_cronetEngineProvider)new atzz()));
        this.u = gfus.a(((gful_cronetEngineProvider)new auaa()));
        if(context0 == null) {
            throw new IllegalArgumentException("context cannot be null");
        }
        if(auad0 == null) {
            throw new IllegalArgumentException("listener cannot be null");
        }
        this.v = context0;
        if(z1) {
            auaf.y(context0);
            sSLContext0 = auaf.n;
        }
        else {
            auaf.x(context0);
            sSLContext0 = auaf.m;
        }
        this.S = sSLContext0;
        this.z = new avjh("CastSocket", s1);
        this.c = bbrd.b(context0, s);
        this.b = s1;
        this.a = auad0;
        this.x = scheduledExecutorService0;
        this.w = v;
        this.d = z;
        this.y = atxp0;
        this.B = v - 4;
        if(auaq.a == null) {
            auaq.a = new auaq(context0, atxp0, scheduledExecutorService0);
        }
        this.A = auaq.a;
        this.C = 2000L;
        this.B();
    }

    private final void A() {
        Objects.requireNonNull(this.a);
        auab auab0 = new auab(this.a);
        this.x.execute(auab0);
    }

    private final void B() {
        auar auar0 = this.E;
        if(auar0 != null) {
            auar0.f();
        }
        auar auar1 = this.H;
        if(auar1 != null) {
            auar1.f();
        }
        this.e = 0;
        this.F = null;
        this.G = null;
        this.I = null;
        this.Y = false;
        this.M = false;
        if(this.U != null && ((Boolean)this.s.mr()).booleanValue()) {
            try {
                SSLEngine sSLEngine0 = this.U;
                batl.s(sSLEngine0);
                sSLEngine0.closeInbound();
            }
            catch(SSLException unused_ex) {
            }
            SSLEngine sSLEngine1 = this.U;
            batl.s(sSLEngine1);
            sSLEngine1.closeOutbound();
        }
        this.U = null;
        this.T = false;
        this.N = false;
        this.P = false;
        this.f = null;
        this.h = 0;
        this.g = null;
        this.i = null;
    }

    private final boolean C() {
        if(this.e != 3) {
            return false;
        }
        try {
            SSLEngine sSLEngine0 = this.U;
            if(sSLEngine0 != null) {
                sSLEngine0.closeInbound();
            }
            return true;
        }
        catch(SSLException sSLException0) {
            this.z.g("Error calling SSLEngine.closeInbound(): %s", new Object[]{sSLException0.getMessage()});
            return false;
        }
    }

    private final boolean D() {
        return this.U != null && !this.U.isInboundDone() && !this.U.isOutboundDone();
    }

    private final boolean E() {
        return this.U != null && !this.U.isOutboundDone() && !this.U.isInboundDone();
    }

    private final boolean F() {
        if(this.D != null) {
            this.X.flip();
            auax auax0 = this.D;
            batl.s(auax0);
            if(auax0.a(this.X) >= 0) {
                this.X.compact();
                return true;
            }
        }
        return false;
    }

    private final void G(int v) {
        if(((Boolean)this.p.mr()).booleanValue()) {
            return;
        }
        throw new IOException("failed to read from socket with error: " + v);
    }

    public final int a() {
        synchronized(this) {
        }
        return this.e;
    }

    final int b() {
        synchronized(this) {
            this.z.c("onConnectable", new Object[0]);
            auax auax0 = this.D;
            if(auax0 != null && this.e == 1) {
                try {
                    auax0.a.finishConnect();
                    if(this.O == null) {
                        SSLEngine sSLEngine0 = this.U;
                        if(sSLEngine0 == null) {
                            this.e = 2;
                            this.A();
                        }
                        else if(!this.T) {
                            sSLEngine0.beginHandshake();
                            this.V = this.U.getHandshakeStatus();
                            this.T = true;
                        }
                    }
                    else {
                        this.w();
                    }
                }
                catch(SSLException unused_ex) {
                    this.z.j("exception in onConnectable", new Object[0]);
                    return 4;
                }
                catch(atzq unused_ex) {
                    this.z.j("exception in onConnectable", new Object[0]);
                    return 5;
                }
                catch(IOException unused_ex) {
                    this.z.j("exception in onConnectable", new Object[0]);
                    return 2;
                }
                return -1;
            }
        }
        return 0;
    }

    final int c() {
        Long long0;
        int v6;
        synchronized(this) {
            auax auax0 = this.D;
            if(auax0 != null && this.e != 0) {
                auar auar0 = this.E;
                if(auar0 != null) {
                    try {
                        if(this.U == null) {
                            ByteBuffer[] arr_byteBuffer1 = auar0.j();
                            if(arr_byteBuffer1 != null) {
                                int v8 = 0;
                                for(int v7 = 0; v7 < arr_byteBuffer1.length; ++v7) {
                                    int v9 = auax0.read(arr_byteBuffer1[v7]);
                                    if(v9 <= 0) {
                                        break;
                                    }
                                    v8 += v9;
                                }
                                if(v8 <= 0) {
                                    throw new ClosedChannelException();
                                }
                                auar0.e(v8);
                            }
                        }
                        else {
                            if(this.D()) {
                                auax auax1 = this.D;
                                batl.s(auax1);
                                int v1 = auax1.read(this.W);
                                if(v1 == 0) {
                                label_99:
                                    v6 = -1;
                                }
                                else if(v1 >= 0) {
                                    this.W.flip();
                                    avjh avjh0 = this.z;
                                    if(this.R) {
                                        byte[] arr_b = new byte[this.W.limit()];
                                        boolean z = false;
                                        for(int v2 = 0; !z && this.W.hasRemaining() && ((long)v2) < ((long)(((Long)this.o.mr()))); ++v2) {
                                            arr_b[v2] = this.W.get();
                                            Arrays.toString(arr_b);
                                            String s = new String(arr_b);
                                            if("OK 1\n".equals(s) || "OK 2\n".equals(s)) {
                                                z = true;
                                            }
                                        }
                                        avjh0.g("OpenCast remaining bytes: %s", new Object[]{this.W.remaining()});
                                        this.W.clear();
                                        this.R = false;
                                        this.O = null;
                                        if(!z) {
                                            throw new atzq();
                                        }
                                        if(this.T) {
                                            avjh0.g("handleRead: SslEngine.beginHandshake was already called.", new Object[0]);
                                        }
                                        else {
                                            SSLEngine sSLEngine0 = this.U;
                                            batl.s(sSLEngine0);
                                            sSLEngine0.beginHandshake();
                                            SSLEngine sSLEngine1 = this.U;
                                            batl.s(sSLEngine1);
                                            this.V = sSLEngine1.getHandshakeStatus();
                                            this.T = true;
                                        }
                                    }
                                    else if(this.E != null) {
                                        boolean z1 = false;
                                        while(this.W.remaining() > 0) {
                                            int v3 = this.W.remaining();
                                            auar auar1 = this.E;
                                            batl.s(auar1);
                                            ByteBuffer[] arr_byteBuffer = auar1.j();
                                            if(arr_byteBuffer != null) {
                                                SSLEngine sSLEngine2 = this.U;
                                                batl.s(sSLEngine2);
                                                SSLEngineResult sSLEngineResult0 = sSLEngine2.unwrap(this.W, arr_byteBuffer);
                                                sSLEngineResult0.getStatus();
                                                sSLEngineResult0.getHandshakeStatus();
                                                sSLEngineResult0.bytesConsumed();
                                                sSLEngineResult0.bytesProduced();
                                                int v4 = this.u(sSLEngineResult0);
                                                if(v4 == -1) {
                                                    auar auar2 = this.E;
                                                    batl.s(auar2);
                                                    int v5 = sSLEngineResult0.bytesProduced();
                                                    if(v5 < 0 || v5 > auar2.a.length) {
                                                        throw new IllegalArgumentException();
                                                    }
                                                    if(v5 > 0) {
                                                        auar2.e(v5);
                                                    }
                                                    switch(auac.b[sSLEngineResult0.getStatus().ordinal()]) {
                                                        case 1: {
                                                            this.W.compact();
                                                            goto label_99;
                                                        }
                                                        case 2: {
                                                            v6 = 14;
                                                            this.G(14);
                                                            goto label_102;
                                                        }
                                                        case 3: {
                                                            v6 = 15;
                                                            goto label_102;
                                                        }
                                                        case 4: {
                                                            if(v3 != this.W.remaining()) {
                                                                break;
                                                            }
                                                            avjh0.d("channelReadBuffer.remaining() is %d but nothing consumed from the buffer.", new Object[]{v3});
                                                            if(!z1) {
                                                                atyb atyb0 = this.y.f.a();
                                                                atwe atwe0 = new atwe(this.y, atyb0, this.i, this.b);
                                                                this.y.e.execute(atwe0);
                                                            }
                                                            if(((Boolean)this.t.mr()).booleanValue()) {
                                                                this.G(16);
                                                                v6 = 16;
                                                                goto label_102;
                                                            }
                                                            z1 = true;
                                                        }
                                                    }
                                                    continue;
                                                }
                                                v6 = v4;
                                                goto label_102;
                                            }
                                            v6 = 17;
                                            this.G(17);
                                            goto label_102;
                                        }
                                    }
                                    this.W.clear();
                                    goto label_99;
                                }
                                else {
                                    v6 = 18;
                                }
                            }
                            else {
                                v6 = 6;
                            }
                        label_102:
                            if(v6 != -1) {
                                goto label_107;
                            }
                            if(this.e == 1 && this.Y) {
                                this.e = 2;
                                this.A();
                                goto label_125;
                            label_107:
                                boolean z2 = this.C();
                                return z2 ? 0 : v6;
                            }
                        }
                    label_125:
                        if(this.E != null && this.G != null && this.F != null) {
                            while(true) {
                                auar auar3 = this.E;
                                batl.s(auar3);
                                if(auar3.e) {
                                    goto label_189;
                                }
                                auar auar4 = this.E;
                                batl.s(auar4);
                                auar4.d = auar4.b;
                                auar auar5 = this.E;
                                batl.s(auar5);
                                if(auar5.b() < 4) {
                                    long0 = null;
                                }
                                else {
                                    int v10 = auar5.a() & 0xFF;
                                    int v11 = auar5.a() & 0xFF;
                                    long0 = (long)(((long)(auar5.a() & 0xFF)) << 8 | (((long)v10) << 24 | ((long)v11) << 16) | ((long)(auar5.a() & 0xFF)));
                                }
                                if(long0 == null) {
                                    break;
                                }
                                if(((long)long0) > ((long)this.B)) {
                                    throw new IOException(String.format(Locale.ROOT, "invalid message size (%d) received.", long0));
                                }
                                auar auar6 = this.E;
                                batl.s(auar6);
                                if(((long)auar6.b()) < ((long)long0)) {
                                    break;
                                }
                                auas auas0 = this.G;
                                batl.s(auas0);
                                auas0.a = long0.intValue();
                                hfsl hfsl0 = this.F;
                                batl.s(hfsl0);
                                hftc hftc0 = hftc.a();
                                ProtoLiteMessage hftv0 = ((ProtoLiteMessage)gehl.a).x_newMutableInstance();
                                try {
                                    hfwc hfwc0 = hfvu.a.c(hftv0);
                                    hfwc0.l(hftv0, hfsm.p(hfsl0), hftc0);
                                    hfwc0.g(hftv0);
                                }
                                catch(hfur hfur0) {
                                    if(hfur0.b) {
                                        hfur0 = new hfur(hfur0);
                                    }
                                    hfur0.a = hftv0;
                                    throw hfur0;
                                }
                                catch(hfwr hfwr0) {
                                    hfur hfur1 = hfwr0.a();
                                    hfur1.a = hftv0;
                                    throw hfur1;
                                }
                                catch(IOException iOException1) {
                                    if((iOException1.getCause() instanceof hfur)) {
                                        throw (hfur)iOException1.getCause();
                                    }
                                    hfur hfur2 = new hfur(iOException1);
                                    hfur2.a = hftv0;
                                    throw hfur2;
                                }
                                catch(RuntimeException runtimeException0) {
                                    if((runtimeException0.getCause() instanceof hfur)) {
                                        throw (hfur)runtimeException0.getCause();
                                    }
                                    throw runtimeException0;
                                }
                                ProtoLiteMessage.P_makeImmutable(hftv0);
                                atzr atzr0 = new atzr(this, ((gehl)hftv0));
                                this.x.execute(atzr0);
                            }
                            auar auar7 = this.E;
                            batl.s(auar7);
                            int v12 = auar7.d;
                            if(v12 != -1) {
                                if(auar7.b != v12) {
                                    auar7.b = v12;
                                    auar7.e = false;
                                }
                                auar7.d = -1;
                                return -1;
                            label_189:
                                auar auar8 = this.E;
                                batl.s(auar8);
                                auar8.d = -1;
                                if(auar8.e) {
                                    auar8.c = 0;
                                    auar8.b = 0;
                                }
                            }
                        }
                    }
                    catch(ClosedChannelException unused_ex) {
                        return this.C() ? 0 : 1;
                    }
                    catch(atzq atzq0) {
                        this.z.e(atzq0, "CastRelayException encountered. Tearing down the socket.", new Object[0]);
                        return 5;
                    }
                    catch(SSLException sSLException0) {
                        this.z.e(sSLException0, "SSLException encountered. Tearing down the socket.", new Object[0]);
                        return 4;
                    }
                    catch(IOException iOException0) {
                        this.z.e(iOException0, "IOException encountered. Tearing down the socket.", new Object[0]);
                        return 2;
                    }
                    return -1;
                }
            }
        }
        return 0;
    }

    final int d() {
        int v3;
        synchronized(this) {
            auax auax0 = this.D;
            if(auax0 != null) {
                int v1 = this.e;
                if(v1 != 0) {
                    auar auar0 = this.H;
                    if(auar0 != null) {
                        try {
                            if(this.U == null) {
                                ByteBuffer[] arr_byteBuffer1 = auar0.i();
                                if(arr_byteBuffer1 != null) {
                                    int v5 = (int)auax0.a.write(arr_byteBuffer1);
                                    if(v5 <= 0) {
                                        throw new ClosedChannelException();
                                    }
                                    auar0.d(v5);
                                }
                            }
                            else {
                                if(v1 == 1 && this.Y) {
                                    this.e = 2;
                                    this.A();
                                }
                                int v2 = 7;
                                if(this.E() && this.H != null) {
                                    if(this.X.position() <= 0) {
                                    alab1:
                                        while(true) {
                                            auar auar1 = this.H;
                                            batl.s(auar1);
                                            ByteBuffer[] arr_byteBuffer = auar1.i();
                                            if(arr_byteBuffer == null) {
                                                if(!this.M) {
                                                    arr_byteBuffer = auaf.l;
                                                    goto label_26;
                                                }
                                                SSLEngine sSLEngine0 = this.U;
                                                batl.s(sSLEngine0);
                                                sSLEngine0.closeOutbound();
                                                break;
                                            }
                                        label_26:
                                            SSLEngine sSLEngine1 = this.U;
                                            batl.s(sSLEngine1);
                                            SSLEngineResult sSLEngineResult0 = sSLEngine1.wrap(arr_byteBuffer, this.X);
                                            sSLEngineResult0.getStatus();
                                            sSLEngineResult0.getHandshakeStatus();
                                            sSLEngineResult0.bytesConsumed();
                                            sSLEngineResult0.bytesProduced();
                                            v3 = this.u(sSLEngineResult0);
                                            if(v3 != -1) {
                                                goto label_55;
                                            }
                                            auar auar2 = this.H;
                                            batl.s(auar2);
                                            int v4 = sSLEngineResult0.bytesConsumed();
                                            if(v4 < 0 || v4 > auar2.a.length) {
                                                throw new IllegalArgumentException();
                                            }
                                            if(v4 > 0) {
                                                auar2.d(v4);
                                            }
                                            switch(auac.b[sSLEngineResult0.getStatus().ordinal()]) {
                                                case 1: {
                                                    v2 = 13;
                                                    goto label_59;
                                                }
                                                case 2: {
                                                    v2 = 14;
                                                    goto label_59;
                                                }
                                                case 3: {
                                                    v2 = 15;
                                                    goto label_59;
                                                }
                                                default: {
                                                    if(this.X.position() > 0 && !this.F()) {
                                                        goto label_59;
                                                    }
                                                    auar auar3 = this.H;
                                                    batl.s(auar3);
                                                    if(!auar3.e || this.V == SSLEngineResult.HandshakeStatus.NEED_WRAP) {
                                                        break;
                                                    }
                                                    break alab1;
                                                }
                                            }
                                        }
                                        v2 = -1;
                                        goto label_59;
                                    label_55:
                                        v2 = v3;
                                    }
                                    else if(this.F()) {
                                        v2 = -1;
                                    }
                                }
                            label_59:
                                if(v2 != -1) {
                                    return v2;
                                }
                                if(this.e == 1 && this.Y) {
                                    this.e = 2;
                                    this.A();
                                }
                            }
                            auar auar4 = this.H;
                            batl.s(auar4);
                            if(auar4.e && this.e == 3) {
                                return 0;
                            }
                            auar auar5 = this.H;
                            batl.s(auar5);
                            if(!auar5.h()) {
                                this.a.a();
                            }
                        }
                        catch(ClosedChannelException unused_ex) {
                            this.z.c("ClosedChannelException when state was %d", new Object[]{((int)this.e)});
                            return 1;
                        }
                        catch(SSLException unused_ex) {
                            this.z.j("SSLException encountered. Tearing down the socket.", new Object[0]);
                            return 4;
                        }
                        catch(IOException unused_ex) {
                            this.z.j("IOException encountered. Tearing down the socket.", new Object[0]);
                            return 2;
                        }
                        return -1;
                    }
                }
            }
            this.z.g("Trying to write buffer to socket channel but it has already been shut down", new Object[0]);
        }
        return 0;
    }

    final int e(SelectionKey selectionKey0, long v) {
        int v1 = 0;
        synchronized(this) {
            if(!this.N) {
                auax auax0 = this.D;
                if(auax0 != null) {
                    auar auar0 = this.E;
                    if(auar0 != null) {
                        auar auar1 = this.H;
                        if(auar1 != null) {
                            int v3 = this.e;
                            if(v3 == 1) {
                                if(v - this.J >= this.K) {
                                    return 3;
                                }
                                if(!auax0.a.isConnected()) {
                                    v1 = 8;
                                }
                                else if(this.U != null) {
                                    v1 = this.t();
                                }
                            }
                            else {
                                switch(v3) {
                                    case 2: {
                                        if(this.U == null) {
                                            v1 = auar0.h() ^ 1;
                                            if(!auar1.e) {
                                                v1 |= 4;
                                            }
                                        }
                                        else {
                                            v1 = this.t();
                                        }
                                        break;
                                    }
                                    case 3: {
                                        if(v - this.L >= this.C) {
                                            return 0;
                                        }
                                        if(this.U == null) {
                                            if(!auar1.e) {
                                                v1 = 4;
                                                break;
                                            }
                                            return 0;
                                        }
                                        else {
                                            v1 = this.t();
                                        }
                                        break;
                                    }
                                    default: {
                                        return 0;
                                    }
                                }
                            }
                            selectionKey0.interestOps(v1);
                            return -1;
                        }
                    }
                }
            }
            this.z.g("Socket is no longer connected", new Object[0]);
            this.N = false;
        }
        return 0;
    }

    final auax f() {
        synchronized(this) {
        }
        return this.D;
    }

    @Override
    protected final void finalize() {
        try {
            if(((Boolean)this.q.mr()).booleanValue()) {
                this.B();
            }
        }
        finally {
            super.finalize();
        }
    }

    final auax g() {
        auax auax6;
        synchronized(this) {
            avjh avjh0 = this.z;
            avjh0.m("startConnect");
            this.J = SystemClock.elapsedRealtime();
            InetAddress inetAddress0 = this.f;
            batl.s(inetAddress0);
            InetSocketAddress inetSocketAddress0 = new InetSocketAddress(inetAddress0, this.h);
            bbfj.b(0x900);
            this.D = new auax(SocketChannel.open());
            if(((Boolean)this.u.mr()).booleanValue()) {
                Network network0 = this.j;
                if(network0 != null) {
                    auax auax0 = this.D;
                    batl.s(auax0);
                    network0.bindSocket(auax0.b());
                    avjh0.m("startConnect: bindSocketToNetwork");
                }
            }
            auax auax1 = this.D;
            batl.s(auax1);
            auax1.configureBlocking(false);
            auax auax2 = this.D;
            batl.s(auax2);
            auax2.b().setTcpNoDelay(false);
            auax auax3 = this.D;
            batl.s(auax3);
            auax3.b().setSoLinger(true, 2);
            auax auax4 = this.D;
            batl.s(auax4);
            bbfj.d(auax4.b());
            bbfj.a();
            this.E = new auar(this.w);
            auas auas0 = new auas(this.E);
            this.G = auas0;
            this.F = hfsl.N(auas0);
            this.H = new auar(this.w);
            this.I = new hfsn(new auat(this.H), 0x1000);
            SSLEngine sSLEngine0 = this.S == null ? null : this.S.createSSLEngine(inetSocketAddress0.getHostString(), inetSocketAddress0.getPort());
            this.U = sSLEngine0;
            if(sSLEngine0 != null) {
                sSLEngine0.setUseClientMode(true);
                this.T = false;
                int v1 = this.U.getSession().getPacketBufferSize();
                this.W = ByteBuffer.allocate(v1);
                this.X = ByteBuffer.allocate(v1);
                this.V = SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING;
                this.Y = false;
                this.M = false;
            }
            auax auax5 = this.D;
            batl.s(auax5);
            if(auax5.a.connect(inetSocketAddress0)) {
                if(this.O == null) {
                    SSLEngine sSLEngine1 = this.U;
                    if(sSLEngine1 == null) {
                        this.e = 2;
                        this.A();
                    }
                    else if(!this.T) {
                        sSLEngine1.beginHandshake();
                        this.V = this.U.getHandshakeStatus();
                        this.T = true;
                    }
                    else {
                        avjh0.g("startConnect: SslEngine.beginHandshake was already called.", new Object[0]);
                    }
                }
                else {
                    this.w();
                }
            }
            avjh0.m("startConnect done");
            auax6 = this.D;
            batl.s(auax6);
        }
        return auax6;
    }

    public static String h(int v) {
        switch(v) {
            case 0: {
                return String.format(Locale.ROOT, "\"%d %s\"", ((int)0), "No error");
            }
            case 1: {
                return String.format(Locale.ROOT, "\"%d %s\"", ((int)1), "Peer disconnected");
            }
            case 2: {
                return String.format(Locale.ROOT, "\"%d %s\"", ((int)2), "IO Error");
            }
            case 3: {
                return String.format(Locale.ROOT, "\"%d %s\"", ((int)3), "Connection timed out");
            }
            case 4: {
                return String.format(Locale.ROOT, "\"%d %s\"", ((int)4), "SSL Error");
            }
            case 5: {
                return String.format(Locale.ROOT, "\"%d %s\"", ((int)5), "Relay error");
            }
            case 6: {
                return String.format(Locale.ROOT, "\"%d %s\"", ((int)6), "SSL Engine can not read");
            }
            case 7: {
                return String.format(Locale.ROOT, "\"%d %s\"", ((int)7), "SSL Engine can not write");
            }
            case 8: {
                return String.format(Locale.ROOT, "\"%d %s\"", ((int)8), "SSL peer hash does not match hash from server");
            }
            case 9: {
                return String.format(Locale.ROOT, "\"%d %s\"", ((int)9), "SSL does not have peer certificates");
            }
            case 10: {
                return String.format(Locale.ROOT, "\"%d %s\"", ((int)10), "SSL peer is not verified");
            }
            case 11: {
                return String.format(Locale.ROOT, "\"%d %s\"", ((int)11), "SSL handshake does not have such algorithm");
            }
            case 12: {
                return String.format(Locale.ROOT, "\"%d %s\"", ((int)12), "SSL handshake is failed on open cast");
            }
            case 13: {
                return String.format(Locale.ROOT, "\"%d %s\"", ((int)13), "SSL channel buffer is underflow");
            }
            case 14: {
                return String.format(Locale.ROOT, "\"%d %s\"", ((int)14), "SSL channel buffer is overflowed");
            }
            case 15: {
                return String.format(Locale.ROOT, "\"%d %s\"", ((int)15), "SSL channel is closed");
            }
            case 16: {
                return String.format(Locale.ROOT, "\"%d %s\"", ((int)16), "SSL channel buffer has nothing being consumed");
            }
            case 17: {
                return String.format(Locale.ROOT, "\"%d %s\"", ((int)17), "Cast socket writable region is null");
            }
            case 18: {
                return String.format(Locale.ROOT, "\"%d %s\"", ((int)18), "Reading socket buffer returns negative count");
            }
            case 19: {
                return String.format(Locale.ROOT, "\"%d %s\"", ((int)19), "Writing socket buffer returns negative count");
            }
            default: {
                return String.format(Locale.ROOT, "\"%d %s\"", v, "Unknown error");
            }
        }
    }

    final void i() {
        __monitor_enter(this);
        int v = FIN.finallyOpen$NT();
        this.z.m("disconnect");
        this.e = 3;
        this.L = SystemClock.elapsedRealtime();
        if(this.U != null) {
            this.M = true;
        }
        try {
            this.A.e();
            FIN.finallyExec$NT(v);
        }
        catch(IllegalStateException illegalStateException0) {
            this.z.g("Unable to wake up the muxer: %s", new Object[]{illegalStateException0.getMessage()});
            FIN.finallyCodeBegin$NT(v);
        }
    }

    public final void j(gehl gehl0) {
        int v2;
        __monitor_enter(this);
        int v = FIN.finallyOpen$NT();
        int v1 = this.e;
        if(v1 == 2) {
            if(gehl0 != null) {
                if(this.H != null) {
                    if(this.I != null) {
                        if(((ProtoLiteMessage)gehl0).isImmutable()) {
                            v2 = ((ProtoLiteMessage)gehl0).t(null);
                            if(v2 < 0) {
                                throw new IllegalStateException("serialized size must be non-negative, was " + v2);
                            }
                        }
                        else {
                            v2 = gehl0.memoizedSerializedSize & 0x7FFFFFFF;
                            if(v2 == 0x7FFFFFFF) {
                                v2 = ((ProtoLiteMessage)gehl0).t(null);
                                if(v2 >= 0) {
                                    gehl0.memoizedSerializedSize = gehl0.memoizedSerializedSize & 0x80000000 | v2;
                                    goto label_18;
                                }
                                throw new IllegalStateException("serialized size must be non-negative, was " + v2);
                            }
                        }
                    label_18:
                        if(this.m(v2)) {
                            auar auar0 = this.H;
                            batl.s(auar0);
                            if(auar0.c() >= 4) {
                                if(((long)v2) >= 0L) {
                                    auar0.g(((byte)(((int)(((long)v2) >> 24)))));
                                    auar0.g(((byte)(((int)(((long)v2) >> 16 & 0xFFL)))));
                                    auar0.g(((byte)(((int)(((long)v2) >> 8 & 0xFFL)))));
                                    auar0.g(((byte)(((int)(((long)v2) & 0xFFL)))));
                                    goto label_29;
                                }
                                throw new IllegalArgumentException(((long)v2) + " is not a valid uint32 value");
                            }
                        label_29:
                            CodedOutputStream hfsq0 = this.I;
                            batl.s(hfsq0);
                            ((ProtoLiteMessage)gehl0).writeTo(hfsq0);
                            CodedOutputStream hfsq1 = this.I;
                            batl.s(hfsq1);
                            hfsq1.flush();
                            this.A.e();
                            FIN.finallyCodeBegin$NT(v);
                            return;
                        }
                        throw new aubf();
                    }
                    throw new IllegalArgumentException("protoOutputStream cannot be null");
                }
                throw new IllegalArgumentException("writeBuffer cannot be null");
            }
            throw new IllegalArgumentException("message cannot be null");
        }
        throw new IllegalStateException("not connected; state=" + v1);
    }

    public final void k(String s, byte[] arr_b) {
        synchronized(this) {
            this.O = s;
            this.Q = arr_b;
            this.P = true;
        }
    }

    final void l(int v) {
        boolean z;
        synchronized(this) {
            this.z.n("shutdown with reason=%d", Integer.valueOf(v));
            this.U = null;
            this.T = false;
            auax auax0 = this.D;
            if(auax0 != null) {
                Socket socket0 = auax0.b();
                bbfj.a.i(socket0);
                try {
                    socket0.shutdownOutput();
                    z = true;
                }
                catch(IOException unused_ex) {
                    this.z.n("Failed to shutdown the output stream socket with reason: %d.", Integer.valueOf(v));
                    atvk atvk0 = new atvk(this.y);
                    this.y.e.execute(atvk0);
                    z = false;
                }
                if(((Boolean)this.r.mr()).booleanValue() || z) {
                    auax auax1 = this.D;
                    if(auax1 != null) {
                        try {
                            auax1.close();
                        }
                        catch(IOException unused_ex) {
                            this.z.n("Failed to close the channel for the socket: %s", this.D);
                        }
                    }
                }
                this.D = null;
            }
            this.E = null;
            this.H = null;
            int v2 = this.e;
            this.e = 0;
            this.L = 0L;
            this.J = 0L;
            this.N = true;
            if(v2 == 1) {
                atzt atzt0 = new atzt(this, v);
                this.x.execute(atzt0);
                return;
            }
            atzs atzs0 = new atzs(this, v);
            this.x.execute(atzs0);
        }
    }

    public final boolean m(int v) {
        synchronized(this) {
            if(this.n()) {
                auar auar0 = this.H;
                if(auar0 != null) {
                    return v + 4 <= auar0.c();
                }
            }
        }
        return false;
    }

    public final boolean n() {
        synchronized(this) {
        }
        return this.e == 2;
    }

    public final boolean o() {
        synchronized(this) {
        }
        return this.e == 1;
    }

    public final boolean p() {
        synchronized(this) {
        }
        return this.e == 0;
    }

    public final boolean q() {
        synchronized(this) {
        }
        return this.e == 3;
    }

    public final byte[] r() {
        byte[] arr_b;
        synchronized(this) {
            if(this.Y) {
                try {
                    Certificate[] arr_certificate = this.U == null || this.U.getSession() == null ? null : this.U.getSession().getPeerCertificates();
                    if(arr_certificate != null && arr_certificate.length > 0) {
                        return arr_certificate[0].getEncoded();
                    }
                }
                catch(SSLPeerUnverifiedException | CertificateEncodingException exception0) {
                    this.z.g("Error getting peer cert: %s", new Object[]{exception0.getMessage()});
                }
                return null;
            }
        }
        return null;
    }

    public final void s(String s, InetAddress inetAddress0, int v, Network network0) {
        synchronized(this) {
            this.j = network0;
            this.A.d(this.v);
            String s1 = this.v();
            this.z.r("Connecting to %s via network %s %s:%d", s1, network0, inetAddress0, Integer.valueOf(v));
            this.B();
            this.h = v;
            this.f = inetAddress0;
            this.g = s;
            this.K = 5000L;
            this.e = 1;
            try {
                this.A.a(this.v, this);
            }
            catch(IllegalStateException illegalStateException0) {
                throw new IOException(illegalStateException0.getMessage(), illegalStateException0);
            }
        }
    }

    private final int t() {
        int v = !this.D() || this.M || this.V != SSLEngineResult.HandshakeStatus.NEED_UNWRAP && (this.E == null || this.E.h()) ? 0 : 1;
        return !this.E() || !this.M && this.V != SSLEngineResult.HandshakeStatus.NEED_WRAP && this.X.position() <= 0 && (this.H == null || this.H.e) ? v : v | 4;
    }

    @Override
    public final String toString() {
        Locale locale0 = Locale.ROOT;
        String s = this.v();
        return String.format(locale0, "CastSocket:%s Name:\"%s\" Address:%s Port:%d State:%s", this.b, s, this.f, ((int)this.h), auau.a(this.e));
    }

    private final int u(SSLEngineResult sSLEngineResult0) {
        byte[] arr_b = null;
        this.V = sSLEngineResult0.getHandshakeStatus();
        switch(auac.a[this.V.ordinal()]) {
            case 1: {
                if(this.Q != null) {
                    try {
                        Certificate[] arr_certificate = this.U == null || this.U.getSession() == null ? null : this.U.getSession().getPeerCertificates();
                        if(arr_certificate == null || arr_certificate.length <= 0) {
                            this.z.d("No peer cert available in SSL handshake", new Object[0]);
                            return 9;
                        }
                        X509Certificate x509Certificate0 = (X509Certificate)arr_certificate[0];
                        MessageDigest messageDigest0 = MessageDigest.getInstance("SHA-256");
                        byte[] arr_b1 = x509Certificate0.getPublicKey().getEncoded();
                        if(arr_b1 != null) {
                            arr_b = messageDigest0.digest(arr_b1);
                        }
                        if(arr_b == null || !MessageDigest.isEqual(arr_b, this.Q)) {
                            this.z.d("TLS peer PK hash from server does not match the hash from the TLS channel", new Object[0]);
                            return 8;
                        }
                        this.z.f("hashes match valid connection", new Object[0]);
                    }
                    catch(SSLPeerUnverifiedException sSLPeerUnverifiedException0) {
                        this.z.e(sSLPeerUnverifiedException0, "SSL Unverified exception", new Object[0]);
                        return 10;
                    }
                    catch(NoSuchAlgorithmException noSuchAlgorithmException0) {
                        this.z.e(noSuchAlgorithmException0, "No algorithm available.", new Object[0]);
                        return 11;
                    }
                }
                else if(this.P) {
                    this.z.d("No TLS peer hash for this connection", new Object[0]);
                    return 12;
                }
                this.Y = true;
                return -1;
            }
            case 2: {
                this.Y = true;
                return -1;
            }
            case 3: {
                if(this.U != null) {
                    while(true) {
                        SSLEngine sSLEngine0 = this.U;
                        batl.s(sSLEngine0);
                        Runnable runnable0 = sSLEngine0.getDelegatedTask();
                        if(runnable0 == null) {
                            break;
                        }
                        runnable0.run();
                    }
                    SSLEngine sSLEngine1 = this.U;
                    batl.s(sSLEngine1);
                    this.V = sSLEngine1.getHandshakeStatus();
                    return -1;
                }
                return -1;
            }
            default: {
                return -1;
            }
        }
    }

    private final String v() {
        return aurf.g(this.g);
    }

    private final void w() {
        auax auax0 = this.D;
        if(auax0 == null) {
            return;
        }
        try {
            this.R = true;
            auax0.a(ByteBuffer.wrap(("join\r\n" + this.O + "\r\n").getBytes(aurr.a)));
        }
        catch(IOException iOException0) {
            throw new atzq(iOException0);
        }
    }

    private static void x(Context context0) {
        synchronized(auaf.class) {
            if(auaf.m != null) {
                return;
            }
            try {
                auaf.m = auae.a();
            }
            catch(NoSuchAlgorithmException unused_ex) {
            }
            auaf.z(context0, auaf.m, atzp.a);
        }
    }

    private static void y(Context context0) {
        synchronized(auaf.class) {
            if(auaf.n != null) {
                return;
            }
            try {
                auaf.n = auae.a();
            }
            catch(NoSuchAlgorithmException unused_ex) {
            }
            auaf.z(context0, auaf.n, auaw.a);
        }
    }

    private static void z(Context context0, SSLContext sSLContext0, X509TrustManager[] arr_x509TrustManager) {
        if(sSLContext0 == null) {
            return;
        }
        try {
            ((ggtj)auaf.k.h()).x("Adding new CastClientAuthKeyManager.");
            sSLContext0.init(new KeyManager[]{aubg.a(context0)}, arr_x509TrustManager, new SecureRandom());
        }
        catch(KeyManagementException keyManagementException0) {
            a.ae(auaf.k.i(), "Failed SSLContext.init.", keyManagementException0);
        }
    }
}

