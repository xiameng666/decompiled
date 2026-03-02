import android.accounts.Account;
import j..util.Collection.-EL;
import j..util.Objects;
import j..util.Optional;
import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.security.SecureRandom;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.crypto.SecretKey;
import jeb.synthetic.TWR;

public final class atig {
    public static final aqql a;
    public final AtomicBoolean b;
    private static final atgx c;
    private final atgr d;
    private final SecureRandom e;
    private final String f;
    private final Account g;
    private final athz h;
    private final atnv i;
    private final aqys j;
    private final boolean k;
    private final atgx l;

    static {
        atig.a = new aqql(new String[]{"EncryptedBackupTask"});
        atig.c = atgx.a(1, false);
    }

    public atig(atgr atgr0, SecureRandom secureRandom0, String s, Account account0, athz athz0, aqys aqys0, atnv atnv0, boolean z, atgx atgx0) {
        this.d = atgr0;
        this.e = secureRandom0;
        this.f = s;
        this.g = account0;
        this.h = athz0;
        this.j = aqys0;
        this.i = atnv0;
        this.k = z;
        this.l = (atgx)Objects.requireNonNullElse(atgx0, atig.c);
        this.b = new AtomicBoolean(false);
    }

    public static String a(gmcd gmcd0, gifo gifo0, aqys aqys0) {
        try {
            return (String)((glyq)gmcd0).u();
        }
        catch(InterruptedException | ExecutionException exception0) {
            Throwable throwable0 = exception0.getCause();
            if((throwable0 instanceof aqyd)) {
                throw (aqyd)throwable0;
            }
            if((throwable0 instanceof aqyi)) {
                throw (aqyi)throwable0;
            }
            if((throwable0 instanceof aqyn)) {
                throw (aqyn)throwable0;
            }
            if((throwable0 instanceof aqyg)) {
                throw (aqyg)throwable0;
            }
            if((throwable0 instanceof aqyj)) {
                throw (aqyj)throwable0;
            }
            if((throwable0 instanceof aqyc)) {
                throw (aqyc)throwable0;
            }
            aqys0.r(16, gifo0, 4);
            throw new aqyc(String.format(Locale.US, "Failed uploading " + gifo0.name()), exception0);
        }
    }

    public final boolean b(arad arad0) {
        atgx atgx0 = this.l;
        if(atgx0 != null) {
            if(arad0.h != atgx0.a) {
                return false;
            }
            gfsx gfsx0 = atgx0.b;
            if(!gfsx0.i()) {
                return (arad0.b & 0x20) == 0;
            }
            if((arad0.b & 0x20) != 0) {
                arak arak0 = arad0.i == null ? arak.a : arad0.i;
                return (aram.b(arak0.c) == null ? aram.a : aram.b(arak0.c)) == gfsx0.d();
            }
            return false;
        }
        return true;
    }

    public final boolean c() {
        return this.l != null;
    }

    public final arad d(ProtoLiteBuilder hftp0, atif atif0, arad arad0) {
        String s3;
        arad arad1;
        atid atid0;
        int v;
        athy athy0;
        byte[] arr_b = arad0.g.toByteArray();
        if(hqjb.f()) {
            gged_interceptors gged0 = atnl.a(this.l, atif0.b);
            athy0 = this.h.a(atif0.b, arr_b, arad0, gged0);
            araa araa0 = arad0.j == null ? araa.a : arad0.j;
            if((arac.b(araa0.c) == null ? arac.a : arac.b(araa0.c)) == arac.b && !(arad0.j == null ? araa.a : arad0.j).d.isEmpty() && (arad0.j == null ? araa.a : arad0.j).d.equals(athy0.b)) {
                atig.a.j("Incremental backup has no changes, updating backup timestamp.", new Object[0]);
                atgr atgr0 = this.d;
                Account account0 = this.g;
                String s = this.f;
                String s1 = arad0.f;
                ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)aqfd.a).v_newBuilder();
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ProtoLiteMessage hftv0 = hftp1.b_message;
                s.getClass();
                ((aqfd)hftv0).b |= 2;
                ((aqfd)hftv0).d = s;
                if(!hftv0.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ProtoLiteMessage hftv1 = hftp1.b_message;
                s1.getClass();
                ((aqfd)hftv1).b |= 4;
                ((aqfd)hftv1).e = s1;
                if(!hftv1.isImmutable()) {
                    hftp1.ensureMutable();
                }
                aqfd aqfd0 = (aqfd)hftp1.b_message;
                aqfd0.b |= 1;
                aqfd0.c = true;
                aqfd aqfd1 = (aqfd)hftp1.N_build();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ((aqfe)hftp0.b_message).l = hfvv.a;
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                aqfe aqfe0 = (aqfe)hftp0.b_message;
                aqfd1.getClass();
                aqfe0.r = aqfd1;
                aqfe0.b |= 0x80000;
                try {
                    v = aqfn.b(((atgt)atgr0).b.c(account0, hftp0).c);
                }
                catch(aqxy aqxy0) {
                    int v1 = aqxy0.a;
                    ((atgt)atgr0).d.s(2, gifo.l, 4, v1);
                    if(atgt.a(v1)) {
                        throw new aqyi(v1);
                    }
                    throw new aqyd(v1);
                }
                catch(IOException iOException0) {
                    ((atgt)atgr0).d.r(9, gifo.l, 4);
                    throw new aqyc(iOException0);
                }
                catch(acse acse0) {
                    ((atgt)atgr0).d.r(7, gifo.l, 4);
                    throw new aqyc(acse0);
                }
                if(v == 0) {
                    v = 1;
                }
                if(v == 1) {
                    if(hqjb.h()) {
                        this.i.g(athy0.c);
                    }
                    this.i.b();
                    return arad0;
                }
                switch(v - 1) {
                    case 6: {
                        throw new aqyn("Device not initialized");
                    }
                    case 9: {
                        throw new aqyj();
                    }
                    default: {
                        throw v - 1 == 12 ? new aqxz("Client thought backup was up to date, but server returned invalid diff token response") : new aqxz("Server returned unexpected non-successful response: " + aqfn.a(v));
                    }
                }
            }
        }
        else {
            athy0 = null;
        }
        try(PipedInputStream pipedInputStream0 = hqlt.y() ? new PipedInputStream(((int)hqlt.g())) : new PipedInputStream(0x80000); PipedOutputStream pipedOutputStream0 = new PipedOutputStream(pipedInputStream0)) {
            boolean z = this.k;
            atge atge0 = new atge(new gdjj(pipedOutputStream0, ((int)hqjb.a.d().c())), z);
            this.g();
            if(!z) {
                atid0 = null;
            }
            else if(Collection.-EL.stream(arad0.c).allMatch(new atic())) {
                atid0 = new atid(atge0);
            }
            else {
                atig.a.j("Skipping CRC32C for incremental backup: not all chunks in state have a CRC32C digest.", new Object[0]);
                atid0 = null;
            }
            String s2 = arad0.f;
            atig.a.j("Old diff token: " + s2, new Object[0]);
            atgt.b(hftp0, atif0.a, atif0.c);
            aqfe aqfe1 = (aqfe)hftp0.N_build();
            hjjj hjjj0 = new hjjj(pipedInputStream0, 0x100000);
            hjjt hjjt0 = ((atgt)this.d).c.a.a(aqfe1, s2, null, ((gful_cronetEngineProvider)atid0), hjjj0);
            gfsx gfsx0 = gfsx.m(hjjj0);
            atgu atgu0 = new atgu(atgv.a, gfsx0, this.i);
            hjjt0.d(atgu0, 10, 0);
            hjjt0.b();
            atgs atgs0 = new atgs(((atgt)this.d), gifo.h);
            gmcd gmcd0 = glzd.g(atgu0.a, atgs0, gmap.a);
            this.h(gmcd0);
            if(athy0 == null) {
                try {
                    gged_interceptors gged1 = atnl.a(this.l, atif0.b);
                    athy0 = this.h.a(atif0.b, arr_b, arad0, gged1);
                    arad1 = atig.i(new atga(atge0, new atfw(atif0.b, this.e), this.l, z), athy0, arr_b);
                    goto label_118;
                }
                catch(IOException iOException1) {
                }
            }
            else {
                arad1 = atig.i(new atga(atge0, new atfw(atif0.b, this.e), this.l, z), athy0, arr_b);
                goto label_118;
            }
            this.f(iOException1, gmcd0, gifo.h);
            throw iOException1;
        label_118:
            this.h(gmcd0);
            pipedOutputStream0.close();
            s3 = atig.a(gmcd0, gifo.h, this.j);
        }
        ProtoLiteBuilder hftp2 = (ProtoLiteBuilder)((ProtoLiteMessage)arad1).jf(5, null);
        hftp2.X(((ProtoLiteMessage)arad1));
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        arad arad2 = (arad)hftp2.b_message;
        s3.getClass();
        arad2.b |= 4;
        arad2.f = s3;
        if(hqjb.f()) {
            ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)araa.a).v_newBuilder();
            arac arac0 = arac.b;
            if(!hftp3.b_message.isImmutable()) {
                hftp3.ensureMutable();
            }
            ProtoLiteMessage hftv2 = hftp3.b_message;
            ((araa)hftv2).c = arac0.c;
            ((araa)hftv2).b |= 1;
            ByteString hfsf0 = athy0.b;
            if(!hftv2.isImmutable()) {
                hftp3.ensureMutable();
            }
            araa araa1 = (araa)hftp3.b_message;
            hfsf0.getClass();
            araa1.b |= 2;
            araa1.d = hfsf0;
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            arad arad3 = (arad)hftp2.b_message;
            araa araa2 = (araa)hftp3.N_build();
            araa2.getClass();
            arad3.j = araa2;
            arad3.b |= 0x40;
        }
        if(hqjb.h()) {
            this.i.g(athy0.c);
        }
        return (arad)hftp2.N_build();
    }

    public final arad e(ProtoLiteBuilder hftp0, atif atif0, byte[] arr_b) {
        String s;
        arad arad0;
        athy athy0;
        atie atie0;
        try(PipedInputStream pipedInputStream0 = hqlt.y() ? new PipedInputStream(((int)hqlt.g())) : new PipedInputStream(0x80000); PipedOutputStream pipedOutputStream0 = new PipedOutputStream(pipedInputStream0)) {
            boolean z = this.k;
            atgi atgi0 = new atgi(pipedOutputStream0, z);
            this.g();
            atie0 = z ? new atie(atgi0) : null;
            boolean z1 = hqiu.a.b().c();
            if(z1) {
                gged_interceptors gged0 = atnl.a(this.l, atif0.b);
                athy0 = this.h.a(atif0.b, arr_b, arad.a, gged0);
                this.g();
            }
            else {
                athy0 = null;
            }
            atgt.b(hftp0, atif0.a, atif0.c);
            aqfe aqfe0 = (aqfe)hftp0.N_build();
            hjjj hjjj0 = new hjjj(pipedInputStream0, 0x100000);
            hjjt hjjt0 = ((atgt)this.d).c.a.b(aqfe0, null, ((gful_cronetEngineProvider)atie0), hjjj0);
            atgu atgu0 = new atgu(atgv.a, gfqx.a, this.i);
            hjjt0.d(atgu0, 10, 0);
            hjjt0.b();
            atgs atgs0 = new atgs(((atgt)this.d), gifo.i);
            gmcd gmcd0 = glzd.g(atgu0.a, atgs0, gmap.a);
            this.h(gmcd0);
            try {
                SecretKey secretKey0 = atif0.b;
                atfw atfw0 = new atfw(secretKey0, this.e);
                atgx atgx0 = this.l;
                atga atga0 = new atga(atgi0, atfw0, atgx0, z);
                if(!z1) {
                    gged_interceptors gged1 = atnl.a(atgx0, secretKey0);
                    athy0 = this.h.a(secretKey0, arr_b, arad.a, gged1);
                }
                arad0 = atig.i(atga0, athy0, arr_b);
            }
            catch(IOException iOException0) {
                this.f(iOException0, gmcd0, gifo.i);
                throw iOException0;
            }
            this.h(gmcd0);
            pipedOutputStream0.close();
            s = atig.a(gmcd0, gifo.i, this.j);
        }
        ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)arad0).jf(5, null);
        hftp1.X(((ProtoLiteMessage)arad0));
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        arad arad1 = (arad)hftp1.b_message;
        s.getClass();
        arad1.b |= 4;
        arad1.f = s;
        if(hqjb.f()) {
            ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)araa.a).v_newBuilder();
            arac arac0 = arac.b;
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp2.b_message;
            ((araa)hftv0).c = arac0.c;
            ((araa)hftv0).b |= 1;
            ByteString hfsf0 = athy0.b;
            if(!hftv0.isImmutable()) {
                hftp2.ensureMutable();
            }
            araa araa0 = (araa)hftp2.b_message;
            hfsf0.getClass();
            araa0.b |= 2;
            araa0.d = hfsf0;
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            arad arad2 = (arad)hftp1.b_message;
            araa araa1 = (araa)hftp2.N_build();
            araa1.getClass();
            arad2.j = araa1;
            arad2.b |= 0x40;
        }
        if(hqjb.h()) {
            this.i.g(athy0.c);
        }
        return (arad)hftp1.N_build();
    }

    private final void f(IOException iOException0, gmcd gmcd0, gifo gifo0) {
        if(!gmcd0.isDone()) {
            gmcd0.cancel(true);
            throw iOException0;
        }
        atig.a(gmcd0, gifo0, this.j);
        throw new aqxz(iOException0);
    }

    private final void g() {
        if(!this.b.get()) {
            return;
        }
        throw new CancellationException("EncryptedBackupTask was cancelled");
    }

    private final void h(gmcd gmcd0) {
        if(this.b.get()) {
            gmcd0.cancel(true);
        }
        this.g();
    }

    private static final arad i(atga atga0, athy athy0, byte[] arr_b) {
        athe athe0;
        atkq atkq1;
        boolean z;
        int v1;
        atlc atlc0;
        atjz atjz0;
        atgb atgb0;
        athu athu0;
        atjy atjy0;
        atke atke1;
        atkr atkr0;
        atkq atkq0;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)arad.a).v_newBuilder();
        araj araj0 = araj.b;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((arad)hftp0.b_message).d = araj0.c;
        ((arad)hftp0.b_message).b |= 1;
        arag arag0 = arag.b;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((arad)hftp0.b_message).e = arag0.d;
        ((arad)hftp0.b_message).b |= 2;
        atgx atgx0 = atga0.b;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        int v = atgx0.a;
        arad arad0 = (arad)hftp0.b_message;
        arad0.b |= 16;
        arad0.h = v;
        gfsx gfsx0 = atgx0.b;
        if(gfsx0.i()) {
            arak arak0 = atga.a(((aram)gfsx0.d()));
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            arad arad1 = (arad)hftp0.b_message;
            arak0.getClass();
            arad1.i = arak0;
            arad1.b |= 0x20;
        }
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)arae.a).v_newBuilder();
        HashMap hashMap0 = new HashMap();
        atke atke0 = athy0.a;
        try {
            atkq0 = atke0.a(2);
        }
        catch(Throwable throwable0) {
            TWR.safeClose$NT(atke0, throwable0);
            throw throwable0;
        }
        try {
            atkr0 = atkq0.a();
        }
        catch(Throwable throwable1) {
            try {
                atke1 = atke0;
                atkq0.close();
                throw throwable1;
            }
            catch(Throwable throwable2) {
                try {
                    throwable1.addSuppressed(throwable2);
                    throw throwable1;
                }
                catch(Throwable throwable0) {
                    goto label_173;
                }
            }
        }
        while(true) {
            try {
            label_44:
                if(!atkr0.c()) {
                    goto label_135;
                }
                atjy0 = (atjy)atkr0.b();
                athu0 = atjy0.a;
                if(hashMap0.containsKey(athu0)) {
                    goto label_44;
                }
                atgb0 = atga0.a;
                hashMap0.put(athu0, Long.valueOf(atgb0.b()));
                atjz0 = atjy0.b;
            }
            catch(Throwable throwable3) {
                atke1 = atke0;
                goto label_65;
            }
            if((atjz0 instanceof atlc)) {
                try {
                    atke1 = atke0;
                    gftb.f(((boolean)(atgb0 instanceof atgi ^ 1)), "got reference chunk in non-incremental mode: %s", atjy0);
                    atlc0 = (atlc)atjz0;
                    v1 = atlc0.b;
                    gftb.b(v1 >= 0, "chunk must have zero or positive length");
                    z = atga0.c;
                    if(z) {
                        goto label_71;
                    }
                    else {
                        goto label_82;
                    }
                    goto label_85;
                }
                catch(Throwable throwable3) {
                    try {
                    }
                    catch(Throwable throwable3) {
                        goto label_133;
                    }
                }
                try {
                label_65:
                    atkq1 = atkq0;
                    atkr0.close();
                    throw throwable3;
                }
                catch(Throwable throwable4) {
                    try {
                        throwable3.addSuppressed(throwable4);
                        throw throwable3;
                    }
                    catch(Throwable throwable1) {
                        break;
                    }
                }
            label_71:
                Optional optional0 = atlc0.c;
                if(optional0.isPresent()) {
                    try {
                        boolean z1 = z;
                        atkq1 = atkq0;
                        int v2 = (int)(((Integer)optional0.get()));
                        atgb0.d(atlc0.a, v1, v2);
                        goto label_85;
                    label_78:
                        z1 = z;
                        atkq1 = atkq0;
                        atgb0.d(atlc0.a, v1, 0);
                        goto label_85;
                    label_82:
                        z1 = z;
                        atkq1 = atkq0;
                        atgb0.d(atlc0.a, v1, 0);
                    label_85:
                        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)arao.a).v_newBuilder();
                        ByteString hfsf0 = ByteString.copyFrom(athu0.a);
                        if(!hftp2.b_message.isImmutable()) {
                            hftp2.ensureMutable();
                        }
                        ProtoLiteMessage hftv0 = hftp2.b_message;
                        ((arao)hftv0).b |= 1;
                        ((arao)hftv0).c = hfsf0;
                        if(!hftv0.isImmutable()) {
                            hftp2.ensureMutable();
                        }
                        arao arao0 = (arao)hftp2.b_message;
                        arao0.b |= 2;
                        arao0.d = v1;
                        if(z1) {
                            Objects.requireNonNull(hftp2);
                            atfz atfz0 = new atfz(hftp2);
                            atlc0.c.ifPresent(atfz0);
                        }
                        hftp0.cQ(hftp2);
                        goto label_128;
                    label_103:
                        atke1 = atke0;
                        atkq1 = atkq0;
                        if(!(atjz0 instanceof atjv)) {
                            throw new IllegalArgumentException("unsupported ChunkContent type: " + atjz0.getClass());
                        }
                        byte[] arr_b1 = ((atjv)atjz0).a;
                        int v3 = atgb0.a(arr_b1);
                        ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)arao.a).v_newBuilder();
                        ByteString hfsf1 = ByteString.copyFrom(athu0.a);
                        if(!hftp3.b_message.isImmutable()) {
                            hftp3.ensureMutable();
                        }
                        ProtoLiteMessage hftv1 = hftp3.b_message;
                        ((arao)hftv1).b |= 1;
                        ((arao)hftv1).c = hfsf1;
                        if(!hftv1.isImmutable()) {
                            hftp3.ensureMutable();
                        }
                        ProtoLiteMessage hftv2 = hftp3.b_message;
                        ((arao)hftv2).b |= 2;
                        ((arao)hftv2).d = arr_b1.length;
                        if(atga0.c) {
                            if(!hftv2.isImmutable()) {
                                hftp3.ensureMutable();
                            }
                            arao arao1 = (arao)hftp3.b_message;
                            arao1.b |= 4;
                            arao1.e = v3;
                        }
                        hftp0.cQ(hftp3);
                    label_128:
                        gfsx0 = gfsx0;
                        atke0 = atke1;
                        atkq0 = atkq1;
                        goto label_44;
                    }
                    catch(Throwable throwable3) {
                    }
                    goto label_133;
                }
                else {
                    goto label_78;
                }
                goto label_82;
            }
            else {
                goto label_103;
            }
            goto label_128;
            try {
            label_133:
                TWR.safeClose$NT(atkr0, throwable3);
                throw throwable3;
            label_135:
                atke1 = atke0;
                atkq1 = atkq0;
                atkr0.close();
                goto label_142;
            }
            catch(Throwable throwable1) {
            }
            break;
        }
        try {
            TWR.safeClose$NT(atkq1, throwable1);
            throw throwable1;
        label_142:
            atkq1.close();
            try(atkq atkq2 = atke1.b(); atkr atkr1 = atkq2.a()) {
                while(true) {
                    if(!atkr1.c()) {
                        break;
                    }
                    int v4 = ((Long)hashMap0.get(((athu)atkr1.b()))).intValue();
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    arae arae0 = (arae)hftp1.b_message;
                    hfuf hfuf0 = arae0.c;
                    if(!hfuf0.c()) {
                        arae0.c = ProtoLiteMessage.C(hfuf0);
                    }
                    arae0.c.i(v4);
                }
            }
        }
        catch(Throwable throwable0) {
        label_173:
            TWR.safeClose$NT(atke1, throwable0);
            throw throwable0;
        }
        atke1.close();
        ByteString hfsf2 = athy0.b;
        arae arae1 = (arae)hftp1.N_build();
        atfw atfw0 = atga0.d;
        switch(v) {
            case 1: {
                athe0 = new athe(atfw0);
                break;
            }
            case 2: {
                athe0 = new athf(atfw0);
                break;
            }
            default: {
                throw new IllegalArgumentException(String.format(Locale.US, "invalid code level: %d", v));
            }
        }
        athe0.g(araj0);
        athe0.d(arac.b);
        athe0.c(hfsf2);
        athe0.f(arag0);
        athe0.e(arae1);
        if(gfsx0.i()) {
            athe0.b(atga.a(((aram)gfsx0.d())));
        }
        long v5 = atga0.a.b();
        athe0.a(atga0.a);
        byte[] arr_b2 = glxd.h(v5);
        atga0.a.a(arr_b2);
        atga0.a.c();
        arad arad2 = (arad)hftp0.N_build();
        ProtoLiteBuilder hftp4 = (ProtoLiteBuilder)((ProtoLiteMessage)arad2).jf(5, null);
        hftp4.X(((ProtoLiteMessage)arad2));
        ByteString hfsf3 = arr_b == null ? ByteString.b : ByteString.copyFrom(arr_b);
        if(!hftp4.b_message.isImmutable()) {
            hftp4.ensureMutable();
        }
        arad arad3 = (arad)hftp4.b_message;
        hfsf3.getClass();
        arad3.b |= 8;
        arad3.g = hfsf3;
        return (arad)hftp4.N_build();
    }
}

