import android.util.Log;
import com.google.android.gms.chimera.modules.clearcut.AppContextProvider;
import j..nio.channels.DesugarChannels;
import j..util.Objects;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel.MapMode;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.List;
import jeb.synthetic.FIN;
import jeb.synthetic.TWR;

public final class azbj {
    protected azbn a;
    private final aywt b;
    private long c;
    private boolean d;
    private int e;
    private azbo f;

    public azbj() {
        this.a = null;
        this.e = 2;
        this.c = hqzy.b();
        this.f = null;
        this.d = false;
        this.b = azbc.ah;
    }

    public final azbh a() {
        azbh azbh3;
        azbs azbs0;
        int v5;
        synchronized(this) {
            azbn azbn0 = this.a;
            int v1 = this.e;
            String s = null;
            if(v1 != 2 && this.d) {
                if(v1 == 3) {
                    return new azbh(azbj.p(4), null);
                }
                if(azbn0 != null) {
                    try {
                        azbn0.j();
                        azbo azbo0 = azbn0.h.a;
                        int v2 = azbo0.b(80);
                        if(v2 != -1 && v2 != 0) {
                            if(v2 < -1 || v2 + v2 + 4 > 4180) {
                                throw new ayyr("invalid length");
                            }
                            StringBuilder stringBuilder0 = new StringBuilder(v2);
                            int v3 = 84;
                            for(int v4 = 0; v4 < v2; ++v4) {
                                try {
                                    v5 = azbo0.a.getChar(v3);
                                }
                                catch(RuntimeException runtimeException0) {
                                    throw new IOException("Exception reading from buffer", runtimeException0);
                                }
                                stringBuilder0.append(((char)v5));
                                v3 += 2;
                            }
                            s = stringBuilder0.toString();
                        }
                        int v6 = azbn0.i;
                        if(v6 == 3) {
                            return new azbh(azbj.p(5), s);
                        }
                        if(v6 == 4) {
                            return new azbh(azbj.p(6), s);
                        }
                        if(!azbn0.i()) {
                            throw new AssertionError("store has no snapshot");
                        }
                        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hlox.a).v_newBuilder();
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        ((hlox)hftp0.b_message).c = 1;
                        ((hlox)hftp0.b_message).b |= 1;
                        azbn0.j();
                        azbo azbo1 = azbn0.j;
                        ByteBuffer byteBuffer0 = ByteBuffer.allocate(16);
                        byteBuffer0.putLong(0, azbo1.d(12));
                        byteBuffer0.putLong(8, azbo1.d(20));
                        ByteString hfsf0 = ByteString.copyFrom(byteBuffer0.array());
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        hlox hlox0 = (hlox)hftp0.b_message;
                        hlox0.b |= 2;
                        hlox0.d = hfsf0;
                        Objects.requireNonNull(hftp0);
                        azbj.h(new azbd(hftp0), azbn0.c());
                        azbn0.j();
                        long v7 = azbo1.d(0x20);
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        hlox hlox1 = (hlox)hftp0.b_message;
                        hlox1.b |= 8;
                        hlox1.f = v7;
                        azbn0.j();
                        long v8 = azbo1.d(40);
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        hlox hlox2 = (hlox)hftp0.b_message;
                        hlox2.b |= 16;
                        hlox2.g = v8;
                        this.q(azbn0, hftp0);
                        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hlpc.a).v_newBuilder();
                        if(!hftp1.b_message.isImmutable()) {
                            hftp1.ensureMutable();
                        }
                        hlpc hlpc0 = (hlpc)hftp1.b_message;
                        hlpc0.b |= 8;
                        hlpc0.e = true;
                        int v9 = (int)hqzy.d();
                        if(!hftp1.b_message.isImmutable()) {
                            hftp1.ensureMutable();
                        }
                        hlpc hlpc1 = (hlpc)hftp1.b_message;
                        hlpc1.b |= 16;
                        hlpc1.f = v9;
                        int v10 = (int)hqzy.c();
                        if(!hftp1.b_message.isImmutable()) {
                            hftp1.ensureMutable();
                        }
                        hlpc hlpc2 = (hlpc)hftp1.b_message;
                        hlpc2.b |= 0x20;
                        hlpc2.g = v10;
                        long v11 = azbn0.d();
                        if(!hftp1.b_message.isImmutable()) {
                            hftp1.ensureMutable();
                        }
                        hlpc hlpc3 = (hlpc)hftp1.b_message;
                        hlpc3.b |= 4;
                        hlpc3.d = v11;
                        azbn0.j();
                        if(azbn0.h.a.b(80) < 0) {
                            if(!hftp1.b_message.isImmutable()) {
                                hftp1.ensureMutable();
                            }
                            hlpc hlpc4 = (hlpc)hftp1.b_message;
                            hlpc4.b |= 2;
                            hlpc4.c = true;
                        }
                        hlpc hlpc5 = (hlpc)hftp1.N_build();
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        hlox hlox3 = (hlox)hftp0.b_message;
                        hlpc5.getClass();
                        hlox3.k = hlpc5;
                        hlox3.b |= 0x80;
                        ArrayList arrayList0 = new ArrayList();
                        int v12 = azbo1.a(4180);
                        if(v12 < 0 || v12 >= azbs.values().length) {
                            arrayList0.add(azbs.e);
                        }
                        else {
                            for(int v13 = 0; v13 < v12; v13 = (byte)(v13 + 1)) {
                                int v14 = azbo1.a(v13 + 0x1055);
                                switch(v14) {
                                    case 0: {
                                        azbs0 = azbs.a;
                                        break;
                                    }
                                    case 1: {
                                        azbs0 = azbs.b;
                                        break;
                                    }
                                    case 2: {
                                        azbs0 = azbs.c;
                                        break;
                                    }
                                    default: {
                                        azbs0 = v14 == 3 ? azbs.d : azbs.e;
                                    }
                                }
                                arrayList0.add(azbs0);
                            }
                        }
                        List list0 = azbt.a(((hlox)hftp0.N_build()));
                        azbt.b(arrayList0, 1, hftp1);
                        azbt.b(list0, 2, hftp1);
                        hlpc hlpc6 = (hlpc)hftp1.N_build();
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        hlox hlox4 = (hlox)hftp0.b_message;
                        hlpc6.getClass();
                        hlox4.k = hlpc6;
                        hlox4.b |= 0x80;
                        azbh3 = new azbh(((hlox)hftp0.N_build()), s);
                    }
                    catch(IOException unused_ex) {
                        return new azbh(azbj.p(5), s);
                    }
                    catch(ayyr unused_ex) {
                        return new azbh(azbj.p(6), s);
                    }
                    catch(IllegalStateException unused_ex) {
                        return new azbh(azbj.p(3), s);
                    }
                    return azbh3;
                }
                return null;
            }
        }
        return null;
    }

    public final void b() {
        synchronized(this) {
            this.d = false;
            if(this.e == 1) {
                azbn azbn0 = this.a;
                if(azbn0 != null) {
                    azbn0.e();
                }
            }
        }
    }

    public final void c() {
        __monitor_enter(this);
        int v = FIN.finallyOpen$NT();
        switch(this.e) {
            case 2: {
            label_13:
                FIN.finallyExec$NT(v);
                return;
            }
            case 3: {
                this.o(1);
                FIN.finallyExec$NT(v);
                return;
            }
            default: {
                if(this.a != null && this.a.i != 1) {
                    this.o(1);
                    FIN.finallyExec$NT(v);
                    return;
                }
                if(this.n()) {
                    this.o(1);
                    FIN.finallyCodeBegin$NT(v);
                    return;
                }
                goto label_13;
            }
        }
    }

    public final void d(aywt aywt0, int v) {
        int v4;
        int v3;
        int v2;
        boolean z;
        synchronized(this) {
            if(this.e == 1) {
                azbn azbn0 = this.a;
                if(azbn0 != null) {
                    z = aywt0 != null;
                    batl.b(z);
                    if(azbn0.i == 1) {
                        try {
                            boolean z1 = azbm.b(azbn0.k());
                            v2 = z1 ? 0x1074 : azbn.a;
                            v3 = z1 ? 0x1064 : 4204;
                            if(v > 0) {
                                v4 = z1 ? azbn0.b : azbn0.c;
                                azbn0.f(v3, v4, aywt0, v);
                            }
                            else {
                                azbn0.f(v3, v2, azbl.c, 1);
                            }
                        }
                        catch(IOException unused_ex) {
                            azbn0.i = 3;
                        }
                        catch(ayyr unused_ex) {
                            azbn0.i = 4;
                        }
                    }
                }
            }
        }
    }

    public final void e(String s, aywt aywt0) {
        this.f(s, aywt0, 1);
    }

    public final void f(String s, aywt aywt0, int v) {
        azbp azbp1;
        azbp azbp0;
        int v9;
        synchronized(this) {
            if(this.e == 1) {
                azbn azbn0 = this.a;
                if(azbn0 != null) {
                    batl.b(aywt0 != null);
                    if(azbn0.i == 1) {
                        try {
                            boolean z = azbm.b(azbn0.k());
                            int v2 = z ? 0x1064 : 4204;
                            int v3 = z ? 0x1074 : azbn.a;
                            if(v <= 0) {
                                azbn0.f(v2, v3, azbl.c, 1);
                                return;
                            }
                            azbn0.f(v2, (z ? azbn0.d : azbn0.e), aywt0, v);
                            if(!azbr.a(s)) {
                                azbn0.f(v2, v3, azbl.a, v);
                                return;
                            }
                            azbq azbq0 = z ? azbn0.f : azbn0.g;
                            if(azbq0.e == null || !azbq0.e.c.equals(s)) {
                                batl.b(azbr.a(s));
                                int v4 = azbq0.a();
                                int v5 = azbq0.b;
                                int v6 = 0;
                                while(v6 < v4) {
                                    int v7 = azbq0.b(v5);
                                    int v8 = aywq.a(v5 + 1 + v7);
                                    if(v7 != s.length()) {
                                        v9 = v4;
                                        v5 = v8 + azbq0.d;
                                        ++v6;
                                        v4 = v9;
                                        continue;
                                    }
                                    int v10 = 0;
                                label_32:
                                    if(v10 < v7) {
                                        v9 = v4;
                                        if(s.charAt(v10) != ((char)azbq0.f.a(v5 + 1 + v10))) {
                                            v5 = v8 + azbq0.d;
                                            ++v6;
                                            v4 = v9;
                                            continue;
                                        }
                                        ++v10;
                                        v4 = v9;
                                        goto label_32;
                                    }
                                    azbq0.e = new azbp(azbq0, v6, v5, v8, s);
                                    azbp0 = azbq0.e;
                                    goto label_70;
                                }
                                int v11 = v6;
                                batl.b(v5 >= 0);
                                batl.b(s != null);
                                int v12 = aywq.a(s.length() + (v5 + 1));
                                int v13 = azbq0.d;
                                if(v12 + v13 <= azbq0.c) {
                                    azbo azbo0 = azbq0.f;
                                    azbo0.f(v5, ((byte)s.length()));
                                    int v14 = v5 + 1;
                                    int v15 = 0;
                                    while(v15 < s.length()) {
                                        azbo0.f(v14, ((byte)s.charAt(v15)));
                                        ++v15;
                                        ++v14;
                                        v11 = v11;
                                    }
                                    aywr.a(azbo0, v12, v13);
                                    aywr.b(azbo0, azbq0.a, 1);
                                    azbp1 = new azbp(azbq0, v11, v5, v12, s);
                                }
                                else {
                                    azbp1 = null;
                                }
                                azbq0.e = azbp1;
                            }
                            azbp0 = azbq0.e;
                        label_70:
                            if(azbp0 != null) {
                                azbn0.f(v2, azbp0.d, aywt0, v);
                                return;
                            }
                            azbn0.f(v2, v3, azbl.b, v);
                        }
                        catch(IOException unused_ex) {
                            azbn0.i = 3;
                        }
                        catch(ayyr unused_ex) {
                            azbn0.i = 4;
                        }
                    }
                }
            }
        }
    }

    public final void g() {
        synchronized(this) {
            this.o(2);
        }
    }

    protected static void h(azbg azbg0, int v) {
        if(v != 0) {
            azbg0.a(v);
        }
    }

    final void i() {
        synchronized(this) {
            azbn azbn0 = this.a;
            if(azbn0 != null) {
                try {
                    azbn0.i = 2;
                    azbn0.j.e();
                }
                catch(IOException iOException0) {
                    Log.w("CCTFunnel", "failed to sync store on shutdown.", iOException0);
                }
            }
            this.e = 2;
            this.f = null;
            this.a = null;
            this.c = hqzy.b();
            this.d = false;
        }
    }

    public final void j() {
        synchronized(this) {
            if(this.e != 2) {
                azbo azbo0 = this.f;
                this.i();
                if(azbo0 != null) {
                    try {
                        aywr.a(azbo0, 0, azbo0.c());
                        azbo0.e();
                    }
                    catch(IOException unused_ex) {
                        Log.e("CCTFunnel", "Failed to clear the buffer.");
                    }
                }
                if(!new File(new File(AppContextProvider.a().getFilesDir(), "clearcut"), "funnel").delete()) {
                    Log.e("CCTFunnel", "Failed to delete the buffer file.");
                }
            }
        }
    }

    public final void k(String s) {
        synchronized(this) {
            azbn azbn0 = this.a;
            boolean z = true;
            this.d = true;
            if(this.e == 1 && azbn0 != null) {
                try {
                    if(azbn0.i() && ((long)azbn0.c()) >= hqzy.a.e().c()) {
                        Log.w("CCTFunnel", "Exceeded max retries, clearing snapshot.");
                        azbn0.e();
                    }
                    azbn0.h(s);
                }
                catch(IOException | ayyr exception0) {
                    Log.w("CCTFunnel", "Exception while snapshotting.", exception0);
                }
                try {
                    ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hlox.a).v_newBuilder();
                    this.q(azbn0, hftp0);
                    ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hlpc.a).v_newBuilder();
                    long v1 = azbn0.d();
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    hlpc hlpc0 = (hlpc)hftp1.b_message;
                    hlpc0.b |= 4;
                    hlpc0.d = v1;
                    hlpc hlpc1 = (hlpc)hftp1.N_build();
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    hlox hlox0 = (hlox)hftp0.b_message;
                    hlpc1.getClass();
                    hlox0.k = hlpc1;
                    hlox0.b |= 0x80;
                    hlox hlox1 = (hlox)hftp0.N_build();
                    if(hlox1.e == 0) {
                        List list0 = azbt.a(hlox1);
                        if(!list0.isEmpty()) {
                            if(list0.size() > 15) {
                                z = false;
                            }
                            batl.b(z);
                            azbo azbo0 = azbn0.j;
                            azbo0.f(4180, ((byte)list0.size()));
                            for(int v2 = 0; v2 < list0.size(); ++v2) {
                                azbo0.f(v2 + 0x1055, ((byte)((azbs)list0.get(v2)).ordinal()));
                            }
                        }
                    }
                }
                catch(IOException | ayyr exception1) {
                    Log.e("CCTFunnel", "Exception during snapshot validation", exception1);
                }
            }
        }
    }

    protected final hlpa l(azbn azbn0) {
        hlpa hlpa0;
        synchronized(this) {
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hlpa.a).v_newBuilder();
            Objects.requireNonNull(hftp0);
            azbj.h(new ayys(hftp0), azbn0.b(azbl.a));
            Objects.requireNonNull(hftp0);
            azbj.h(new ayzd(hftp0), azbn0.b(azbl.b));
            Objects.requireNonNull(hftp0);
            azbj.h(new ayzo(hftp0), azbn0.b(azbl.c));
            Objects.requireNonNull(hftp0);
            azbj.h(new ayzz(hftp0), azbn0.a(azbb.a, azbn0.b, azbn0.c));
            hlpa0 = (hlpa)hftp0.N_build();
        }
        return hlpa0;
    }

    protected final hlpd m(azbi azbi0) {
        hlpd hlpd0;
        synchronized(this) {
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hlpd.a).v_newBuilder();
            Objects.requireNonNull(hftp0);
            azbj.h(new azak(hftp0), azbi0.a(azbc.a));
            Objects.requireNonNull(hftp0);
            azbj.h(new ayyy(hftp0), azbi0.a(azbc.b));
            Objects.requireNonNull(hftp0);
            azbj.h(new ayzk(hftp0), azbi0.a(azbc.c));
            Objects.requireNonNull(hftp0);
            azbj.h(new ayzw(hftp0), azbi0.a(azbc.d));
            Objects.requireNonNull(hftp0);
            azbj.h(new azai(hftp0), azbi0.a(azbc.e));
            Objects.requireNonNull(hftp0);
            azbj.h(new azar(hftp0), azbi0.a(azbc.f));
            Objects.requireNonNull(hftp0);
            azbj.h(new azas(hftp0), azbi0.a(azbc.g));
            Objects.requireNonNull(hftp0);
            azbj.h(new azat(hftp0), azbi0.a(azbc.j));
            Objects.requireNonNull(hftp0);
            azbj.h(new azau(hftp0), azbi0.a(azbc.k));
            Objects.requireNonNull(hftp0);
            azbj.h(new azaw(hftp0), azbi0.a(azbc.l));
            Objects.requireNonNull(hftp0);
            azbj.h(new azav(hftp0), azbi0.a(azbc.m));
            Objects.requireNonNull(hftp0);
            azbj.h(new azax(hftp0), azbi0.a(azbc.n));
            Objects.requireNonNull(hftp0);
            azbj.h(new azay(hftp0), azbi0.a(azbc.o));
            Objects.requireNonNull(hftp0);
            azbj.h(new azaz(hftp0), azbi0.a(azbc.p));
            Objects.requireNonNull(hftp0);
            azbj.h(new azba(hftp0), azbi0.a(azbc.q));
            Objects.requireNonNull(hftp0);
            azbj.h(new ayyt(hftp0), azbi0.a(azbc.r));
            Objects.requireNonNull(hftp0);
            azbj.h(new ayyu(hftp0), azbi0.a(azbc.s));
            Objects.requireNonNull(hftp0);
            azbj.h(new ayyv(hftp0), azbi0.a(azbc.t));
            Objects.requireNonNull(hftp0);
            azbj.h(new ayyw(hftp0), azbi0.a(azbc.u));
            Objects.requireNonNull(hftp0);
            azbj.h(new ayyx(hftp0), azbi0.a(azbc.v));
            Objects.requireNonNull(hftp0);
            azbj.h(new ayyz(hftp0), azbi0.a(azbc.w));
            Objects.requireNonNull(hftp0);
            azbj.h(new ayza(hftp0), azbi0.a(azbc.h));
            Objects.requireNonNull(hftp0);
            azbj.h(new ayzb(hftp0), azbi0.a(azbc.i));
            Objects.requireNonNull(hftp0);
            azbj.h(new ayzc(hftp0), azbi0.a(azbc.y));
            Objects.requireNonNull(hftp0);
            azbj.h(new ayze(hftp0), azbi0.a(azbc.z));
            Objects.requireNonNull(hftp0);
            azbj.h(new ayzf(hftp0), azbi0.a(azbc.A));
            Objects.requireNonNull(hftp0);
            azbj.h(new ayzg(hftp0), azbi0.a(azbc.B));
            Objects.requireNonNull(hftp0);
            azbj.h(new ayzh(hftp0), azbi0.a(azbc.D));
            Objects.requireNonNull(hftp0);
            azbj.h(new ayzi(hftp0), azbi0.a(azbc.E));
            Objects.requireNonNull(hftp0);
            azbj.h(new ayzj(hftp0), azbi0.a(azbc.F));
            Objects.requireNonNull(hftp0);
            azbj.h(new ayzl(hftp0), azbi0.a(azbc.G));
            Objects.requireNonNull(hftp0);
            azbj.h(new ayzm(hftp0), azbi0.a(azbc.H));
            Objects.requireNonNull(hftp0);
            azbj.h(new ayzn(hftp0), azbi0.a(azbc.I));
            Objects.requireNonNull(hftp0);
            azbj.h(new ayzp(hftp0), azbi0.a(azbc.J));
            Objects.requireNonNull(hftp0);
            azbj.h(new ayzq(hftp0), azbi0.a(azbc.K));
            Objects.requireNonNull(hftp0);
            azbj.h(new ayzr(hftp0), azbi0.a(azbc.L));
            Objects.requireNonNull(hftp0);
            azbj.h(new ayzs(hftp0), azbi0.a(azbc.M));
            Objects.requireNonNull(hftp0);
            azbj.h(new ayzt(hftp0), azbi0.a(azbc.N));
            Objects.requireNonNull(hftp0);
            azbj.h(new ayzu(hftp0), azbi0.a(azbc.O));
            Objects.requireNonNull(hftp0);
            azbj.h(new ayzv(hftp0), azbi0.a(azbc.P));
            Objects.requireNonNull(hftp0);
            azbj.h(new ayzx(hftp0), azbi0.a(azbc.Q));
            Objects.requireNonNull(hftp0);
            azbj.h(new ayzy(hftp0), azbi0.a(azbc.R));
            Objects.requireNonNull(hftp0);
            azbj.h(new azaa(hftp0), azbi0.a(azbc.S));
            Objects.requireNonNull(hftp0);
            azbj.h(new azab(hftp0), azbi0.a(azbc.T));
            Objects.requireNonNull(hftp0);
            azbj.h(new azac(hftp0), azbi0.a(azbc.U));
            Objects.requireNonNull(hftp0);
            azbj.h(new azad(hftp0), azbi0.a(azbc.V));
            Objects.requireNonNull(hftp0);
            azbj.h(new azae(hftp0), azbi0.a(azbc.W));
            Objects.requireNonNull(hftp0);
            azbj.h(new azaf(hftp0), azbi0.a(azbc.X));
            Objects.requireNonNull(hftp0);
            azbj.h(new azag(hftp0), azbi0.a(azbc.Y));
            Objects.requireNonNull(hftp0);
            azbj.h(new azah(hftp0), azbi0.a(azbc.Z));
            Objects.requireNonNull(hftp0);
            azbj.h(new azaj(hftp0), azbi0.a(azbc.aa));
            Objects.requireNonNull(hftp0);
            azbj.h(new azal(hftp0), azbi0.a(azbc.ab));
            Objects.requireNonNull(hftp0);
            azbj.h(new azam(hftp0), azbi0.a(azbc.ac));
            Objects.requireNonNull(hftp0);
            azbj.h(new azan(hftp0), azbi0.a(azbc.ad));
            Objects.requireNonNull(hftp0);
            azbj.h(new azao(hftp0), azbi0.a(azbc.ae));
            Objects.requireNonNull(hftp0);
            azbj.h(new azap(hftp0), azbi0.a(azbc.af));
            Objects.requireNonNull(hftp0);
            azbj.h(new azaq(hftp0), azbi0.a(azbc.ag));
            hlpd0 = (hlpd)hftp0.N_build();
        }
        return hlpd0;
    }

    private final boolean n() {
        long v2;
        long v1;
        synchronized(this) {
            v1 = this.c;
            v2 = hqzy.b();
        }
        return Long.compare(v1, v2) != 0;
    }

    private final void o(int v) {
        azbn azbn0;
        MappedByteBuffer mappedByteBuffer0;
        __monitor_enter(this);
        int v1 = FIN.finallyOpen$NT();
        if(!hqzy.f() || v == 2 && this.e != 2) {
            FIN.finallyExec$NT(v1);
            return;
        }
        this.e = 2;
        this.f = null;
        this.a = null;
        this.c = hqzy.b();
        this.d = false;
        File file0 = new File(AppContextProvider.a().getFilesDir(), "clearcut");
        if(!file0.exists() && !file0.mkdir()) {
            Log.e("CCTFunnel", "Failed find or create clearcut directory.");
            this.e = 3;
            FIN.finallyExec$NT(v1);
            return;
        }
        File file1 = new File(file0, "funnel");
        try {
            int v2 = (int)this.c;
            if(file1.exists() && file1.length() != ((long)v2) && !file1.delete()) {
                throw new IOException("failed to delete existing file");
            }
            RandomAccessFile randomAccessFile0 = new RandomAccessFile(file1, "rw");
            try {
                FileChannel fileChannel0 = DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(randomAccessFile0.getChannel());
                TWR.declareResource(fileChannel0);
                TWR.useResource$NT(fileChannel0);
                if(randomAccessFile0.length() != 0L && randomAccessFile0.length() != ((long)v2)) {
                    TWR.useResource$NT(fileChannel0);
                    throw new IOException("unexpected file size");
                }
                TWR.useResource$NT(fileChannel0);
                mappedByteBuffer0 = fileChannel0.map(FileChannel.MapMode.READ_WRITE, 0L, ((long)v2));
            }
            catch(Throwable throwable0) {
                TWR.safeClose$NT(randomAccessFile0, throwable0);
                throw throwable0;
            }
            randomAccessFile0.close();
            azbo azbo0 = new azbo(mappedByteBuffer0);
            this.f = azbo0;
            if(v == 1) {
                aywr.a(azbo0, 0, azbo0.c());
            }
        }
        catch(IOException unused_ex) {
            Log.e("CCTFunnel", "Failed find or create funnel file.");
            this.e = 3;
            this.f = null;
            FIN.finallyExec$NT(v1);
            return;
        }
        try {
            azbn0 = new azbn(this.b, this.f);
            this.a = azbn0;
            this.e = 1;
        }
        catch(IOException | ayyr unused_ex) {
            Log.e("CCTFunnel", "Failed to initialize funnel store.");
            this.e = 3;
            this.f = null;
            this.a = null;
            FIN.finallyExec$NT(v1);
            return;
        }
        try {
            this.d = azbn0.i();
            FIN.finallyExec$NT(v1);
        }
        catch(IOException | ayyr exception0) {
            Log.e("CCTFunnel", "failed to get snapshotted state during initialization", exception0);
            this.d = true;
            FIN.finallyCodeBegin$NT(v1);
        }
    }

    private static hlox p(int v) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hlox.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((hlox)hftp0.b_message).c = v - 1;
        ((hlox)hftp0.b_message).b |= 1;
        return (hlox)hftp0.N_build();
    }

    private final void q(azbn azbn0, ProtoLiteBuilder hftp0) {
        synchronized(this) {
            hlpa hlpa0 = this.l(azbn0);
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            hlox hlox0 = (hlox)hftp0.b_message;
            hlpa0.getClass();
            hlox0.h = hlpa0;
            hlox0.b |= 0x20;
            Objects.requireNonNull(azbn0);
            hlpd hlpd0 = this.m(new azbe(azbn0));
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            hlox hlox1 = (hlox)hftp0.b_message;
            hlpd0.getClass();
            hlox1.i = hlpd0;
            hlox1.b |= 0x40;
            azbq azbq0 = azbm.b(azbn0.j()) ? azbn0.g : azbn0.f;
            azbp azbp0 = azbq0.a() == 0 ? null : new azbp(azbq0);
            while(azbp0 != null) {
                ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hloy.a).v_newBuilder();
                String s = azbp0.c;
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                hloy hloy0 = (hloy)hftp1.b_message;
                s.getClass();
                hloy0.b |= 1;
                hloy0.c = s;
                Objects.requireNonNull(azbp0);
                hlpd hlpd1 = this.m(new azbf(azbp0));
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                hloy hloy1 = (hloy)hftp1.b_message;
                hlpd1.getClass();
                hloy1.d = hlpd1;
                hloy1.b |= 2;
                hloy hloy2 = (hloy)hftp1.N_build();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                hlox hlox2 = (hlox)hftp0.b_message;
                hloy2.getClass();
                hfuo hfuo0 = hlox2.j;
                if(!hfuo0.c()) {
                    hlox2.j = ProtoLiteMessage.E(hfuo0);
                }
                hlox2.j.add(hloy2);
                int v1 = azbp0.a + 1;
                azbp0.a = v1;
                azbq azbq1 = azbp0.e;
                if(v1 < azbq1.a()) {
                    int v2 = azbp0.d + azbq1.d;
                    azbp0.b = v2;
                    azbp0.c = azbq1.c(v2);
                    azbp0.d = aywq.a(azbp0.b + azbp0.c.length() + 1);
                }
                else {
                    azbp0 = null;
                }
            }
        }
    }
}

