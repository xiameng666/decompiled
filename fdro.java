import android.os.IBinder.DeathRecipient;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import android.util.Log;
import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;

final class fdro {
    private final fffm A;
    private fdir B;
    private fdir C;
    final fdrq a;
    final boolean b;
    public final ffdl c;
    public final fdyn d;
    public int e;
    public int f;
    public int g;
    public String h;
    public long i;
    public long j;
    public ParcelFileDescriptor k;
    public ParcelFileDescriptor l;
    final IBinder.DeathRecipient m;
    public ByteBuffer n;
    public boolean o;
    public ByteBuffer p;
    public int q;
    public final fdwi r;
    public final ffep s;
    public fdwh t;
    public fdwh u;
    public ffhh v;
    private final int w;
    private final feyi x;
    private long y;
    private long z;

    public fdro(fdrq fdrq0, feyi feyi0, ffdl ffdl0, fdwi fdwi0, fdyn fdyn0, ffep ffep0, boolean z, fffm fffm0, IBinder.DeathRecipient iBinder$DeathRecipient0) {
        int v = 0;
        this.e = 0;
        this.f = 5;
        this.g = 9;
        this.a = fdrq0;
        this.x = feyi0;
        if(feyi0 != feyi.a) {
            v = Math.max(0, 1);
        }
        this.w = v;
        this.c = ffdl0;
        batl.s(fdwi0);
        this.r = fdwi0;
        this.d = fdyn0;
        batl.s(ffep0);
        this.s = ffep0;
        this.b = z;
        batl.s(fffm0);
        this.A = fffm0;
        this.m = iBinder$DeathRecipient0;
    }

    private final void A(fdir fdir0) {
        if(fdir0 == null) {
            return;
        }
        try {
            fdir0.a.linkToDeath(this.m, 0);
        }
        catch(RemoteException unused_ex) {
            this.m.binderDied();
        }
    }

    public final int a(ParcelFileDescriptor parcelFileDescriptor0, ByteBuffer byteBuffer0) {
        if(Log.isLoggable("ChannelStateMachine", 2)) {
            Log.v("ChannelStateMachine", String.format("Channel(%s): nonBlockingWrite", this.a));
        }
        try {
            byte[] arr_b = byteBuffer0.array();
            int v = ((fdre)this.c).b.b.b(parcelFileDescriptor0, arr_b, byteBuffer0.position(), byteBuffer0.remaining());
            if(v > 0) {
                byteBuffer0.position(byteBuffer0.position() + v);
            }
            return v;
        }
        catch(EOFException unused_ex) {
            return -1;
        }
    }

    public final feyj b() {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)feyj.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((feyj)hftv0).b |= 1;
        ((feyj)hftv0).c = this.w;
        feyi feyi0 = this.x;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        feyj feyj0 = (feyj)hftp0.b_message;
        feyj0.b |= 2;
        feyj0.d = feyi0.c;
        return (feyj)hftp0.N_build();
    }

    public static String c(int v) {
        switch(v) {
            case 0: {
                return "CONNECTION_STATE_NOT_STARTED";
            }
            case 1: {
                return "CONNECTION_STATE_OPEN_SENT";
            }
            case 2: {
                return "CONNECTION_STATE_ESTABLISHED";
            }
            case 3: {
                return "CONNECTION_STATE_CLOSING";
            }
            default: {
                return "CONNECTION_STATE_CLOSED";
            }
        }
    }

    final void d() {
        this.j(4);
        fdwh fdwh0 = this.t;
        if(fdwh0 != null) {
            fdwh0.a();
            this.t = null;
        }
        fdwh fdwh1 = this.u;
        if(fdwh1 != null) {
            fdwh1.a();
            this.u = null;
        }
        ffhh ffhh0 = this.v;
        if(ffhh0 != null) {
            ffhh0.a(16, null, this.h);
            this.v = null;
        }
        this.e(1, 0);
        this.f(1, 0);
        this.n = null;
        this.p = null;
    }

    public final void e(int v, int v1) {
        if(this.k != null) {
            fdir fdir0 = this.B;
            if(fdir0 != null) {
                fdir0.a.unlinkToDeath(this.m, 0);
                if(v != 0) {
                    try {
                        this.B.a(v, v1);
                    }
                    catch(RemoteException remoteException0) {
                        Log.w("ChannelStateMachine", "Failed to notify InputStream of unexpected close", remoteException0);
                    }
                }
            }
            this.c.e(this.k);
            try {
                this.k.close();
            }
            catch(IOException iOException0) {
                Log.w("ChannelStateMachine", "Failed to close receiving FD", iOException0);
            }
            this.k = null;
            this.B = null;
            this.k(11);
            ffep ffep0 = this.s;
            fdrq fdrq0 = this.a;
            String s = this.h;
            String s1 = fdrq0.a;
            fdpl fdpl0 = fdrq0.b;
            if(Log.isLoggable("WearableService", 2)) {
                Log.v("WearableService", String.format("onChannelInputClosed(%s, %s, %s, %s, %s, %s)", fdpl0, fdrq0, s, s1, v, v1));
            }
            ffep0.a(fdpl0, fdrq0, s, s1, v, v1, 3, ffeo.c);
        }
    }

    public final void f(int v, int v1) {
        if(this.l != null) {
            this.y(v, v1);
            this.c.e(this.l);
            try {
                this.l.close();
            }
            catch(IOException iOException0) {
                Log.w("ChannelStateMachine", "Failed to close sending FD", iOException0);
            }
            this.l = null;
            this.l(8);
            ffep ffep0 = this.s;
            fdrq fdrq0 = this.a;
            String s = this.h;
            fdpl fdpl0 = fdrq0.b;
            String s1 = fdrq0.a;
            if(Log.isLoggable("WearableService", 2)) {
                Log.v("WearableService", String.format("onChannelOutputClosed(%s, %s, %s, %s, %s, %s)", fdpl0, fdrq0, s, s1, v, v1));
            }
            ffep0.a(fdpl0, fdrq0, s, s1, v, v1, 4, ffeo.d);
        }
    }

    public final void g() {
        if(this.v != null) {
            Log.w("ChannelStateMachine", "openChannel cancelled, because remote node is not reachable");
            this.v.a(13, null, this.h);
            this.v = null;
        }
        this.f(1, 0);
        this.e(1, 0);
        throw this.q(1, 0);
    }

    public final void h() {
        if(this.f == 6) {
            batl.m(this.l != null, "SENDING_STATE_WAITING_TO_READ but no FD");
            if(this.p == null) {
                int v = (int)(fffm.a() ? hzzi.a.i().i() : hzzi.a.i().h());
                if(v > 0x10000) {
                    Log.e("ChannelStateMachine", a.f(v, "Send buffer size setting ", " is too large. It can\'t be bigger than receiver\'s buffer"));
                    v = 0x10000;
                }
                else if(v < 0x80) {
                    Log.e("ChannelStateMachine", a.f(v, "Send buffer size setting ", " is very low. This is probably a mistake"));
                    v = 0x10000;
                }
                if(Log.isLoggable("ChannelStateMachine", 3)) {
                    Log.d("ChannelStateMachine", "Creating send buffer of size " + v);
                }
                this.p = ByteBuffer.allocate(v);
            }
            try {
                ByteBuffer byteBuffer0 = this.p;
                while(this.y > 0L) {
                    byteBuffer0.clear();
                    byteBuffer0.limit(((int)Math.min(byteBuffer0.capacity(), this.y)));
                    int v1 = this.v(this.l, byteBuffer0);
                    if(v1 <= 0) {
                        break;
                    }
                    this.y -= (long)v1;
                }
            }
            catch(ffdh ffdh0) {
                throw new IllegalStateException("Failed to do non-blocking read at start of file", ffdh0);
            }
            try {
                this.p.clear();
                if(this.z >= 0L && this.z < ((long)this.p.capacity())) {
                    this.p.limit(((int)this.z));
                }
                boolean z = false;
                int v2;
                while((v2 = this.v(this.l, this.p)) > 0) {
                    z = true;
                }
            }
            catch(ffdh ffdh1) {
                throw new IllegalStateException("Failed to do non-blocking read", ffdh1);
            }
            this.p.flip();
            if(z) {
                long v3 = this.z;
                if(v3 >= 0L) {
                    long v4 = v3 - ((long)this.p.remaining());
                    this.z = v4;
                    batl.n(v4 >= 0L, "Invalid mSendingMaxLength = %s", new Object[]{v4});
                }
                if(v2 != 0) {
                    goto label_54;
                }
                byte[] arr_b = new byte[this.p.remaining()];
                this.p.get(arr_b);
                this.u = this.z(arr_b, false, this.j);
                this.c.d(this.l, ffdk.a);
                this.l(7);
                return;
            }
            if(v2 == -1 || this.z == 0L) {
                goto label_54;
            }
            if(this.e == 3) {
                this.f(3, this.q);
                this.l(8);
                this.s(this.q);
                throw this.q(3, this.q);
            label_54:
                byte[] arr_b1 = new byte[this.p.remaining()];
                this.p.get(arr_b1);
                this.u = this.z(arr_b1, true, this.j);
                this.f(0, 0);
                this.l(7);
            }
        }
    }

    public final void i() {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)feye.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((feye)hftv0).c = 2;
        ((feye)hftv0).b |= 1;
        fdrq fdrq0 = this.a;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        ((feye)hftv1).b |= 2;
        ((feye)hftv1).d = fdrq0.c;
        boolean z = fdrq0.d;
        if(!hftv1.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv2 = hftp0.b_message;
        ((feye)hftv2).b |= 4;
        ((feye)hftv2).e = z;
        boolean z1 = this.b;
        if(!hftv2.isImmutable()) {
            hftp0.ensureMutable();
        }
        feye feye0 = (feye)hftp0.b_message;
        feye0.b |= 0x80;
        feye0.j = z1;
        feye feye1 = (feye)hftp0.N_build();
        feyj feyj0 = this.b();
        ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)feyj0).jf(5, null);
        hftp1.X(((ProtoLiteMessage)feyj0));
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        feyj feyj1 = (feyj)hftp1.b_message;
        feye1.getClass();
        feyj1.e = feye1;
        feyj1.b |= 4;
        feak feak0 = new feak(fdrq0, ((feyj)hftp1.N_build()));
        this.r.a(feak0);
    }

    public final void j(int v) {
        if(Log.isLoggable("ChannelStateMachine", 2)) {
            Log.v("ChannelStateMachine", String.format("Channel(%s): %s -> %s", this.a, fdro.c(this.e), fdro.c(v)));
        }
        this.e = v;
    }

    public final void k(int v) {
        if(Log.isLoggable("ChannelStateMachine", 2)) {
            String s = fdro.w(this.g);
            String s1 = fdro.w(v);
            Log.v("ChannelStateMachine", String.format("Channel(%s): Receiver %s -> %s", this.a, s, s1));
        }
        this.g = v;
    }

    public final void l(int v) {
        if(Log.isLoggable("ChannelStateMachine", 2)) {
            String s = fdro.x(this.f);
            String s1 = fdro.x(v);
            Log.v("ChannelStateMachine", String.format("Channel(%s): Sender %s -> %s", this.a, s, s1));
        }
        this.f = v;
    }

    final boolean m() {
        return this.k != null;
    }

    final boolean n() {
        return this.l != null;
    }

    final boolean o() {
        return this.g == 11;
    }

    final boolean p() {
        return this.f == 8;
    }

    public final fdrm q(int v, int v1) {
        this.j(4);
        this.s.b(this.a.b, this.a, this.h, this.a.a, v, v1);
        throw new fdrm(this.a);
    }

    final void r(int v) {
        ffhh ffhh0 = this.v;
        if(ffhh0 != null) {
            ffhh0.a(16, null, this.h);
            this.v = null;
        }
        this.y(3, v);
        this.e(3, v);
        if(this.f != 5 && this.f != 8) {
            this.j(3);
            this.q = v;
            if(this.f == 6) {
                this.h();
            }
            return;
        }
        this.s(v);
        throw this.q(3, v);
    }

    public final void s(int v) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)feye.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((feye)hftv0).c = 3;
        ((feye)hftv0).b |= 1;
        fdrq fdrq0 = this.a;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        ((feye)hftv1).b |= 2;
        ((feye)hftv1).d = fdrq0.c;
        fdpl fdpl0 = fdrq0.b;
        if(!hftv1.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv2 = hftp0.b_message;
        fdpl0.b.getClass();
        ((feye)hftv2).b |= 8;
        ((feye)hftv2).f = fdpl0.b;
        String s = fdpl0.d;
        if(!hftv2.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv3 = hftp0.b_message;
        s.getClass();
        ((feye)hftv3).b |= 16;
        ((feye)hftv3).g = s;
        boolean z = fdrq0.d;
        if(!hftv3.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv4 = hftp0.b_message;
        ((feye)hftv4).b |= 4;
        ((feye)hftv4).e = z;
        if(!hftv4.isImmutable()) {
            hftp0.ensureMutable();
        }
        feye feye0 = (feye)hftp0.b_message;
        feye0.b |= 0x40;
        feye0.i = v;
        feyj feyj0 = this.b();
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
        feak feak0 = new feak(fdrq0, ((feyj)hftp1.N_build()));
        this.r.a(feak0);
    }

    final void t(ParcelFileDescriptor parcelFileDescriptor0, fdir fdir0) {
        boolean z = true;
        batl.m(this.g != 11, "set incoming fd after closing");
        if(this.k != null) {
            z = false;
        }
        batl.m(z, "set incoming fd twice");
        batl.s(parcelFileDescriptor0);
        this.k = parcelFileDescriptor0;
        this.B = fdir0;
        ffdl ffdl0 = this.c;
        ffdl0.c(parcelFileDescriptor0);
        if(this.g == 10) {
            ffdl0.d(this.k, ffdk.c);
        }
        this.A(fdir0);
    }

    @Override
    public final String toString() {
        String s = this.h;
        String s1 = fdro.c(this.e);
        String s2 = fdro.x(this.f);
        String s3 = fdro.w(this.g);
        return "ChannelStateMachine{token=" + this.a.toString() + ", mPath=\'" + s + "\', mConnectionState=" + s1 + ", mSendingState=" + s2 + ", mReceivingState=" + s3 + "}";
    }

    final void u(ParcelFileDescriptor parcelFileDescriptor0, fdir fdir0, long v, long v1) {
        boolean z = false;
        batl.d(Long.compare(v, 0L) >= 0, "invalid startOffset %s", new Object[]{v});
        batl.d(v1 == -1L || v1 >= 0L, "invalid length %s", new Object[]{v1});
        batl.m(this.f == 5, "set outgoing fd twice");
        if(this.l == null) {
            z = true;
        }
        batl.m(z, "set outgoing fd twice");
        batl.s(parcelFileDescriptor0);
        this.l = parcelFileDescriptor0;
        this.C = fdir0;
        this.y = v;
        this.z = v1;
        this.c.c(parcelFileDescriptor0);
        this.c.d(parcelFileDescriptor0, ffdk.b);
        this.l(6);
        this.A(fdir0);
    }

    private final int v(ParcelFileDescriptor parcelFileDescriptor0, ByteBuffer byteBuffer0) {
        if(Log.isLoggable("ChannelStateMachine", 2)) {
            Log.v("ChannelStateMachine", String.format("Channel(%s): nonBlockingRead", this.a));
        }
        try {
            byte[] arr_b = byteBuffer0.array();
            int v = ((fdre)this.c).b.b.a(parcelFileDescriptor0, arr_b, byteBuffer0.position(), byteBuffer0.remaining());
            if(v > 0) {
                byteBuffer0.position(byteBuffer0.position() + v);
            }
            return v;
        }
        catch(EOFException unused_ex) {
            return -1;
        }
    }

    private static String w(int v) {
        switch(v) {
            case 9: {
                return "RECEIVING_STATE_WAITING_FOR_DATA";
            }
            case 10: {
                return "RECEIVING_STATE_WAITING_TO_WRITE";
            }
            case 11: {
                return "RECEIVING_STATE_CLOSED";
            }
            default: {
                return a.f(v, "RECEIVING_STATE_UNKNOWN (", ")");
            }
        }
    }

    private static String x(int v) {
        switch(v) {
            case 5: {
                return "SENDING_STATE_NOT_STARTED";
            }
            case 6: {
                return "SENDING_STATE_WAITING_TO_READ";
            }
            case 7: {
                return "SENDING_STATE_WAITING_FOR_ACK";
            }
            case 8: {
                return "SENDING_STATE_CLOSED";
            }
            default: {
                return a.f(v, "SENDING_STATE_UNKNOWN (", ")");
            }
        }
    }

    private final void y(int v, int v1) {
        fdir fdir0 = this.C;
        if(fdir0 != null) {
            fdir0.a.unlinkToDeath(this.m, 0);
            if(v != 0) {
                try {
                    this.C.a(v, v1);
                }
                catch(RemoteException remoteException0) {
                    Log.w("ChannelStateMachine", "Failed to notify OutputStream of unexpected close", remoteException0);
                }
            }
        }
        this.C = null;
    }

    private final fdwh z(byte[] arr_b, boolean z, long v) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)feyh.a).v_newBuilder();
        ByteString hfsf0 = ByteString.copyFrom(arr_b);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((feyh)hftv0).b |= 2;
        ((feyh)hftv0).d = hfsf0;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        feyh feyh0 = (feyh)hftp0.b_message;
        feyh0.b |= 4;
        feyh0.e = z;
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)feyg.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp1.b_message;
        ((feyg)hftv1).b |= 4;
        ((feyg)hftv1).e = v;
        fdrq fdrq0 = this.a;
        if(!hftv1.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv2 = hftp1.b_message;
        ((feyg)hftv2).b |= 1;
        ((feyg)hftv2).c = fdrq0.c;
        boolean z1 = fdrq0.d;
        if(!hftv2.isImmutable()) {
            hftp1.ensureMutable();
        }
        feyg feyg0 = (feyg)hftp1.b_message;
        feyg0.b |= 2;
        feyg0.d = z1;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        feyh feyh1 = (feyh)hftp0.b_message;
        feyg feyg1 = (feyg)hftp1.N_build();
        feyg1.getClass();
        feyh1.c = feyg1;
        feyh1.b |= 1;
        feyh feyh2 = (feyh)hftp0.N_build();
        feyj feyj0 = this.b();
        ProtoLiteBuilder hftp2 = (ProtoLiteBuilder)((ProtoLiteMessage)feyj0).jf(5, null);
        hftp2.X(((ProtoLiteMessage)feyj0));
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        feyj feyj1 = (feyj)hftp2.b_message;
        feyh2.getClass();
        feyj1.f = feyh2;
        feyj1.b |= 8;
        feyj feyj2 = (feyj)hftp2.N_build();
        fdwi fdwi0 = this.r;
        feak feak0 = new feak(fdrq0, feyj2);
        if(!this.A.a.y) {
            return fdwi0.b(feak0, ((long)(((int)hzzi.a.i().k()))), 2, this.d);
        }
        return fffm.a() ? fdwi0.b(feak0, ((long)(((int)hzzi.a.i().l()))), 2, this.d) : fdwi0.b(feak0, ((long)(((int)hzzi.a.i().j()))), 2, this.d);
    }
}

