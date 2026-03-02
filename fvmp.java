import android.content.Context;
import android.location.GnssMeasurementsEvent;
import android.location.GnssNavigationMessage;
import android.location.Location;
import android.location.LocationManager;
import android.net.MacAddress;
import android.net.wifi.ScanResult.InformationElement;
import android.net.wifi.ScanResult;
import android.net.wifi.rtt.RangingResult;
import android.net.wifi.rtt.ResponderLocation;
import android.os.Build.VERSION;
import android.os.SystemClock;
import android.telephony.CellIdentityGsm;
import android.telephony.CellIdentityLte;
import android.telephony.CellIdentityNr;
import android.telephony.CellIdentityWcdma;
import android.telephony.CellInfo;
import android.telephony.CellInfoGsm;
import android.telephony.CellInfoLte;
import android.telephony.CellInfoNr;
import android.telephony.CellInfoWcdma;
import android.telephony.CellSignalStrengthGsm;
import android.telephony.CellSignalStrengthLte;
import android.telephony.CellSignalStrengthNr;
import android.telephony.CellSignalStrengthWcdma;
import com.google.android.location.collectionlib.RealCollectorConfig;
import j..util.Objects;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.UUID;

public final class fvmp implements fvnn {
    private long A;
    private long B;
    private boolean C;
    private long D;
    private int E;
    private int F;
    private float G;
    private float H;
    private float I;
    private long J;
    private long K;
    private long L;
    private int M;
    private long N;
    private Float O;
    private gwub P;
    private HashSet Q;
    private String R;
    private final int S;
    private ProtoLiteBuilder T;
    private ProtoLiteBuilder U;
    gwvh a;
    gwuu b;
    ProtoLiteBuilder c;
    private final long d;
    private final gwps e;
    private final Context f;
    private final fwyd g;
    private final fvwz h;
    private final fvnq i;
    private final fvmo j;
    private final String k;
    private final fvlh l;
    private final long m;
    private final long n;
    private final boolean o;
    private final int p;
    private final fvmq q;
    private final fvms r;
    private final fvms s;
    private final fvms t;
    private final fvms u;
    private final fvms v;
    private final fvms w;
    private final fvms x;
    private final fvms y;
    private final fvms z;

    public fvmp(fvnq fvnq0, Context context0, String s, fvlh fvlh0, int v, fwyd fwyd0, fvwz fvwz0) {
        this.e = gwps.l(500).a();
        this.A = 0L;
        this.B = 0L;
        this.C = false;
        this.D = 0L;
        this.E = -1;
        this.F = -1;
        this.G = 3.402823E+38f;
        this.H = 3.402823E+38f;
        this.I = 3.402823E+38f;
        this.J = 0x7FFFFFFFFFFFFFFFL;
        this.K = 0x7FFFFFFFFFFFFFFFL;
        this.L = 0x7FFFFFFFFFFFFFFFL;
        this.M = 1;
        this.N = 0L;
        this.Q = new HashSet();
        this.i = fvnq0;
        this.f = context0;
        this.k = s;
        this.l = fvlh0;
        this.m = fvlh0 == null ? fvlg.a.d : ((RealCollectorConfig)fvlh0).y.d;
        this.n = fvlh0 == null ? fvlg.a.d : ((RealCollectorConfig)fvlh0).z.d;
        this.S = v;
        this.g = fwyd0;
        this.h = fvwz0;
        fvmq fvmq0 = new fvmq();
        this.q = fvmq0;
        fvmo fvmo0 = new fvmo(this);
        this.j = fvmo0;
        this.r = new fvms(fvmq0);
        this.s = new fvms(fvmq0);
        this.t = new fvms(fvmq0);
        this.u = new fvms(fvmq0);
        this.v = new fvms(fvmq0);
        this.w = new fvms(fvmq0);
        this.x = new fvms(fvmq0);
        this.y = new fvms(fvmq0);
        this.z = new fvms(fvmq0);
        icvk icvk0 = fvzp.b();
        if(icvk0 != null) {
            float f = fvzl.d(icvk0);
            if((((double)f) < huwo.b())) {
                this.O = (float)icvk0.b;
            }
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gwub.a).v_newBuilder();
            float f1 = (float)huwo.b();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp0.b_message;
            ((gwub)hftv0).b |= 4;
            ((gwub)hftv0).e = f1;
            if(!hftv0.isImmutable()) {
                hftp0.ensureMutable();
            }
            gwub gwub0 = (gwub)hftp0.b_message;
            gwub0.b |= 1;
            gwub0.c = f;
            float f2 = fvzl.c(icvk0);
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gwub gwub1 = (gwub)hftp0.b_message;
            gwub1.b |= 2;
            gwub1.d = f2;
            this.P = (gwub)hftp0.N_build();
        }
        this.J();
        this.H();
        this.d = fwyd0.c() - SystemClock.elapsedRealtime();
        fvma.a(fvwz0, 0, fvmo0.a);
        this.o = gfud.g(",").n(huwo.a.f().i()).contains("com.google.android.gms");
        this.p = (int)huwo.a.f().e();
    }

    public final void A() {
        synchronized(this) {
            if(this.C) {
                return;
            }
            this.s.b();
        }
    }

    public final void B() {
        synchronized(this) {
            if(this.C) {
                return;
            }
            this.t.b();
        }
    }

    @Override  // fvnn
    public final void C(int v, int v1, int v2) {
        if(this.U == null) {
            this.U = ((ProtoLiteMessage)gwtv.a).v_newBuilder();
        }
        ProtoLiteBuilder hftp0 = this.U;
        int v3 = gwtu.a(v);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gwtv gwtv0 = (gwtv)hftp0.b_message;
        if(v3 == 0) {
            throw null;
        }
        gwtv0.c = v3 - 1;
        gwtv0.b |= 1;
        ProtoLiteBuilder hftp1 = this.U;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gwtv gwtv1 = (gwtv)hftp1.b_message;
        gwtv1.b |= 2;
        gwtv1.d = v1;
        ProtoLiteBuilder hftp2 = this.U;
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        gwtv gwtv2 = (gwtv)hftp2.b_message;
        gwtv2.b |= 16;
        gwtv2.g = v2;
        ProtoLiteBuilder hftp3 = this.T;
        gwtv gwtv3 = (gwtv)this.U.N_build();
        if(!hftp3.b_message.isImmutable()) {
            hftp3.ensureMutable();
        }
        gwts gwts0 = (gwts)hftp3.b_message;
        gwtv3.getClass();
        gwts0.i = gwtv3;
        gwts0.b |= 0x800;
        gwvh gwvh0 = this.a;
        gwts gwts1 = (gwts)this.T.N_build();
        if(!gwvh0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gwvh0).ensureMutable();
        }
        gwvi gwvi0 = (gwvi)gwvh0.b_message;
        gwts1.getClass();
        gwvi0.c = gwts1;
        gwvi0.b |= 1;
    }

    @Override  // fvnn
    public final void D(int v, int v1) {
        if(this.U == null) {
            this.U = ((ProtoLiteMessage)gwtv.a).v_newBuilder();
        }
        ProtoLiteBuilder hftp0 = this.U;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gwtv gwtv0 = (gwtv)hftp0.b_message;
        gwtv0.b |= 4;
        gwtv0.e = v;
        ProtoLiteBuilder hftp1 = this.U;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gwtv gwtv1 = (gwtv)hftp1.b_message;
        gwtv1.b |= 8;
        gwtv1.f = v1;
        ProtoLiteBuilder hftp2 = this.T;
        gwtv gwtv2 = (gwtv)this.U.N_build();
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        gwts gwts0 = (gwts)hftp2.b_message;
        gwtv2.getClass();
        gwts0.i = gwtv2;
        gwts0.b |= 0x800;
        gwvh gwvh0 = this.a;
        gwts gwts1 = (gwts)this.T.N_build();
        if(!gwvh0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gwvh0).ensureMutable();
        }
        gwvi gwvi0 = (gwvi)gwvh0.b_message;
        gwts1.getClass();
        gwvi0.c = gwts1;
        gwvi0.b |= 1;
    }

    @Override  // fvnn
    public final void E(float f, float f1, float f2, float f3) {
        synchronized(this) {
            gwuu gwuu0 = this.b;
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gwup.a).v_newBuilder();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp0.b_message;
            ((gwup)hftv0).b |= 1;
            ((gwup)hftv0).c = f;
            if(!hftv0.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv1 = hftp0.b_message;
            ((gwup)hftv1).b |= 2;
            ((gwup)hftv1).d = f1;
            if(!hftv1.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv2 = hftp0.b_message;
            ((gwup)hftv2).b |= 4;
            ((gwup)hftv2).e = f2;
            if(!hftv2.isImmutable()) {
                hftp0.ensureMutable();
            }
            gwup gwup0 = (gwup)hftp0.b_message;
            gwup0.b |= 0x40;
            gwup0.g = f3;
            gwup gwup1 = (gwup)hftp0.N_build();
            if(!gwuu0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)gwuu0).ensureMutable();
            }
            gwuv gwuv0 = (gwuv)gwuu0.b_message;
            gwup1.getClass();
            gwuv0.k = gwup1;
            gwuv0.b |= 2;
            this.I();
        }
    }

    @Override  // fvnn
    public final void F(fwxv fwxv0, int v, long v1) {
        if(this.C) {
            return;
        }
        this.q.e(v1);
        gwuu gwuu0 = this.b;
        long v2 = v1 - this.a();
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gwue.a).v_newBuilder();
        int v3 = fwxv0.d();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gwue gwue0 = (gwue)hftp0.b_message;
        gwue0.b |= 2;
        gwue0.d = v3;
        int v4 = fwxv0.a();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((gwue)hftv0).b |= 16;
        ((gwue)hftv0).g = v4;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gwue)hftp0.b_message).j = v - 1;
        ((gwue)hftp0.b_message).b |= 0x40;
        String s = fwxv0.e();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gwue gwue1 = (gwue)hftp0.b_message;
        s.getClass();
        gwue1.b |= 0x20;
        gwue1.h = s;
        int v5 = fwxv0.b();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gwue gwue2 = (gwue)hftp0.b_message;
        gwue2.b |= 4;
        gwue2.e = v5;
        int v6 = fwxv0.c();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        ((gwue)hftv1).b |= 8;
        ((gwue)hftv1).f = v6;
        if(!hftv1.isImmutable()) {
            hftp0.ensureMutable();
        }
        gwue gwue3 = (gwue)hftp0.b_message;
        gwue3.b |= 0x80;
        gwue3.k = (int)v2;
        String s1 = fwxv0.g();
        if(s1 != null) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gwue gwue4 = (gwue)hftp0.b_message;
            gwue4.b |= 1;
            gwue4.c = s1;
        }
        String s2 = fwxv0.f();
        if(s2 != null) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gwue gwue5 = (gwue)hftp0.b_message;
            gwue5.b |= 0x100;
            gwue5.l = s2;
        }
        String[] arr_s = fwxv0.h();
        if(arr_s != null) {
            for(int v7 = 0; v7 < arr_s.length; ++v7) {
                String s3 = arr_s[v7];
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gwue gwue6 = (gwue)hftp0.b_message;
                s3.getClass();
                hfuo hfuo0 = gwue6.i;
                if(!hfuo0.c()) {
                    gwue6.i = ProtoLiteMessage.E(hfuo0);
                }
                gwue6.i.add(s3);
            }
        }
        gwue gwue7 = (gwue)hftp0.N_build();
        if(!gwuu0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gwuu0).ensureMutable();
        }
        gwuv gwuv0 = (gwuv)gwuu0.b_message;
        gwue7.getClass();
        hfuo hfuo1 = gwuv0.v;
        if(!hfuo1.c()) {
            gwuv0.v = ProtoLiteMessage.E(hfuo1);
        }
        gwuv0.v.add(gwue7);
        this.I();
    }

    private final long G() {
        long v2;
        synchronized(this) {
            long v1 = this.q.f();
            v2 = this.d + v1;
            long v3 = this.D;
            if(v2 <= v3) {
                return v3 + 1L;
            }
        }
        return v2;
    }

    private final void H() {
        synchronized(this) {
            this.c = fyau.a();
            this.b = (gwuu)((ProtoLiteMessage)gwuv.a).v_newBuilder();
            gftb.check(this.s);
            this.s.c();
            gftb.check(this.r);
            this.r.c();
            gftb.check(this.t);
            this.t.c();
            gftb.check(this.u);
            this.u.c();
            gftb.check(this.v);
            this.v.c();
            gftb.check(this.w);
            this.w.c();
            gftb.check(this.x);
            this.x.c();
            gftb.check(this.y);
            this.y.c();
            gftb.check(this.z);
            this.z.c();
            this.J = 0x7FFFFFFFFFFFFFFFL;
            this.K = 0x7FFFFFFFFFFFFFFFL;
            if(this.a != null && ((gwvi)this.a.b_message).f.size() == 0) {
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gwtk.a).v_newBuilder();
                fvlh fvlh0 = this.l;
                if(fvlh0 != null) {
                    gwuu gwuu0 = this.b;
                    int v1 = fvlh0.a(fvns.e);
                    if(!gwuu0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)gwuu0).ensureMutable();
                    }
                    gwuv gwuv0 = (gwuv)gwuu0.b_message;
                    gwuv0.b |= 4;
                    gwuv0.z = v1;
                    gwth gwth0 = ((RealCollectorConfig)fvlh0).x;
                    if(gwth0 != null) {
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        ((gwtk)hftp0.b_message).e = gwth0;
                        ((gwtk)hftp0.b_message).b |= 0x40;
                    }
                }
                gwuu gwuu1 = this.b;
                int v2 = (int)huwo.e();
                if(!gwuu1.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)gwuu1).ensureMutable();
                }
                gwuv gwuv1 = (gwuv)gwuu1.b_message;
                gwuv1.b |= 8;
                gwuv1.B = v2;
                int v3 = this.S;
                if(v3 == 0) {
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    gwtk gwtk1 = (gwtk)hftp0.b_message;
                    gwtk1.b |= 1;
                    gwtk1.c = 23;
                }
                else {
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    gwtk gwtk0 = (gwtk)hftp0.b_message;
                    gwtk0.b |= 1;
                    gwtk0.c = v3;
                }
                gwub gwub0 = this.P;
                if(gwub0 != null) {
                    gwuu gwuu2 = this.b;
                    if(!gwuu2.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)gwuu2).ensureMutable();
                    }
                    ((gwuv)gwuu2.b_message).C = gwub0;
                    ((gwuv)gwuu2.b_message).b |= 16;
                    this.P = null;
                }
                ProtoLiteBuilder hftp1 = this.c;
                gwtk gwtk2 = (gwtk)hftp0.N_build();
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                gwtl gwtl0 = (gwtl)hftp1.b_message;
                gwtk2.getClass();
                gwtl0.n = gwtk2;
                gwtl0.b |= 0x8000;
            }
        }
    }

    private final void I() {
        synchronized(this) {
            fvmo fvmo0 = this.j;
            boolean z = fvmo0.b();
            boolean z1 = false;
            if(this.o && this.N + ((long)fvmo0.a) > ((long)this.p)) {
                fvlt fvlt0 = this.i.h;
                if(fvlt0 != null) {
                    fvlt0.c();
                }
                z = true;
                z1 = true;
            }
            if(z) {
                this.N += (long)fvmo0.a;
                this.f();
                this.H();
                this.z(z1);
                this.J();
            }
        }
    }

    private final void J() {
        String s3;
        synchronized(this) {
            gftb.check(this.j);
            this.j.a();
            this.a = (gwvh)((ProtoLiteMessage)gwvi.a).v_newBuilder();
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gwts.a).v_newBuilder();
            String s = fvni.a;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gwts gwts0 = (gwts)hftp0.b_message;
            s.getClass();
            gwts0.b |= 2;
            gwts0.d = s;
            String s1 = Locale.getDefault().toString();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp0.b_message;
            s1.getClass();
            ((gwts)hftv0).b |= 16;
            ((gwts)hftv0).f = s1;
            if(!hftv0.isImmutable()) {
                hftp0.ensureMutable();
            }
            gwts gwts1 = (gwts)hftp0.b_message;
            gwts1.b |= 1;
            gwts1.c = "1.0";
            String s2 = TimeZone.getDefault().getID();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gwts gwts2 = (gwts)hftp0.b_message;
            s2.getClass();
            gwts2.b |= 0x400;
            gwts2.h = s2;
            this.T = hftp0;
            ProtoLiteBuilder hftp1 = this.U;
            if(hftp1 != null) {
                gwtv gwtv0 = (gwtv)hftp1.N_build();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gwts gwts3 = (gwts)hftp0.b_message;
                gwtv0.getClass();
                gwts3.i = gwtv0;
                gwts3.b |= 0x800;
            }
            ProtoLiteBuilder hftp2 = this.T;
            Context context0 = this.f;
            Objects.requireNonNull(context0);
            LocationManager locationManager0 = (LocationManager)context0.getSystemService("location");
            if(locationManager0 == null) {
                s3 = "unknown";
            }
            else if(jym.b(locationManager0)) {
                String s4 = locationManager0.getGnssHardwareModelName();
                s3 = s4 == null ? "unknown" : s4.substring(0, Math.min(100, s4.length()));
            }
            else {
                s3 = "no_gnss_hardware";
            }
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            gwts gwts4 = (gwts)hftp2.b_message;
            s3.getClass();
            gwts4.b |= 0x1000;
            gwts4.j = s3;
            gwvh gwvh0 = this.a;
            gwts gwts5 = (gwts)this.T.N_build();
            if(!gwvh0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)gwvh0).ensureMutable();
            }
            gwvi gwvi0 = (gwvi)gwvh0.b_message;
            gwts5.getClass();
            gwvi0.c = gwts5;
            gwvi0.b |= 1;
            gftb.check(context0);
            gftb.check("com.google.android.gms");
            gwvh gwvh1 = this.a;
            ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)gwto.a).v_newBuilder();
            String s5 = String.format("%s/%s", "sglclt", "com.google.android.gms");
            if(!hftp3.b_message.isImmutable()) {
                hftp3.ensureMutable();
            }
            gwto gwto0 = (gwto)hftp3.b_message;
            s5.getClass();
            gwto0.b |= 1;
            gwto0.c = s5;
            gwto gwto1 = (gwto)hftp3.N_build();
            if(!gwvh1.b_message.isImmutable()) {
                ((ProtoLiteBuilder)gwvh1).ensureMutable();
            }
            gwvi gwvi1 = (gwvi)gwvh1.b_message;
            gwto1.getClass();
            gwvi1.b();
            gwvi1.d.add(gwto1);
            String s6 = this.k;
            if(!fvpm.a(s6)) {
                gwvh gwvh2 = this.a;
                ProtoLiteBuilder hftp4 = ((ProtoLiteMessage)gwtw.a).v_newBuilder();
                gftb.check(s6);
                if(!hftp4.b_message.isImmutable()) {
                    hftp4.ensureMutable();
                }
                gwtw gwtw0 = (gwtw)hftp4.b_message;
                gwtw0.b |= 1;
                gwtw0.c = s6;
                gwtw gwtw1 = (gwtw)hftp4.N_build();
                if(!gwvh2.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)gwvh2).ensureMutable();
                }
                gwvi gwvi2 = (gwvi)gwvh2.b_message;
                gwtw1.getClass();
                gwvi2.e = gwtw1;
                gwvi2.b |= 2;
            }
            gftb.check(this.s);
            this.s.d();
            gftb.check(this.t);
            this.t.d();
        }
    }

    private static final int K(long v, long v1) {
        return (int)((v1 - v) / 1000L);
    }

    private static final int L(long v, long v1) {
        return (int)((v1 - v) % 1000L);
    }

    public final long a() {
        long v1;
        synchronized(this) {
            v1 = this.q.c();
        }
        return v1;
    }

    @Override  // fvnn
    public final void b(float f, float f1, float f2, int v, long v1, long v2) {
        synchronized(this) {
            if(this.C) {
                return;
            }
            if(Math.abs(v1 - this.A) >= this.m) {
                this.A = v1;
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gwua.a).v_newBuilder();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ProtoLiteMessage hftv0 = hftp0.b_message;
                ((gwua)hftv0).b |= 1;
                ((gwua)hftv0).c = f;
                if(!hftv0.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ProtoLiteMessage hftv1 = hftp0.b_message;
                ((gwua)hftv1).b |= 2;
                ((gwua)hftv1).d = f1;
                if(!hftv1.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gwua gwua0 = (gwua)hftp0.b_message;
                gwua0.b |= 4;
                gwua0.e = f2;
                gwuu gwuu0 = this.b;
                fvmj fvmj0 = new fvmj(hftp0);
                this.s.a(gwuu0, v, v1, v2, fvmj0);
                gwuu gwuu1 = this.b;
                gwua gwua1 = (gwua)hftp0.N_build();
                if(!gwuu1.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)gwuu1).ensureMutable();
                }
                gwuv gwuv0 = (gwuv)gwuu1.b_message;
                gwua1.getClass();
                gwuv0.b();
                gwuv0.e.add(gwua1);
                this.I();
                return;
            }
            this.A();
        }
    }

    @Override  // fvnn
    public final void c(int v, long[] arr_v, float[][] arr2_f) {
        throw new UnsupportedOperationException("addAllSensorSnapshot() cannot be called from GLocRequestComposer.");
    }

    @Override  // fvnn
    public final void d(float f, int v, long v1, long v2) {
        synchronized(this) {
            if(this.C) {
                return;
            }
            Float float0 = this.O;
            if(float0 != null) {
                f -= (float)float0;
            }
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gwuc.a).v_newBuilder();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gwuc gwuc0 = (gwuc)hftp0.b_message;
            gwuc0.b |= 1;
            gwuc0.c = f;
            gwuu gwuu0 = this.b;
            fvmm fvmm0 = new fvmm(hftp0);
            this.u.a(gwuu0, v, v1, v2, fvmm0);
            gwuu gwuu1 = this.b;
            gwuc gwuc1 = (gwuc)hftp0.N_build();
            if(!gwuu1.b_message.isImmutable()) {
                ((ProtoLiteBuilder)gwuu1).ensureMutable();
            }
            gwuv gwuv0 = (gwuv)gwuu1.b_message;
            gwuc1.getClass();
            hfuo hfuo0 = gwuv0.m;
            if(!hfuo0.c()) {
                gwuv0.m = ProtoLiteMessage.E(hfuo0);
            }
            gwuv0.m.add(gwuc1);
            this.I();
        }
    }

    @Override  // fvnn
    public final void e(int v, int v1, long v2) {
        if(this.C) {
            return;
        }
        this.q.e(v2);
        gwuu gwuu0 = this.b;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gwuh.a).v_newBuilder();
        long v3 = v2 - this.a();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((gwuh)hftv0).b |= 4;
        ((gwuh)hftv0).e = (int)v3;
        int v4 = gwug.a(v);
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        if(v4 == 0) {
            throw null;
        }
        ((gwuh)hftv1).c = v4 - 1;
        ((gwuh)hftv1).b |= 1;
        int v5 = gwug.a(v1);
        if(!hftv1.isImmutable()) {
            hftp0.ensureMutable();
        }
        gwuh gwuh0 = (gwuh)hftp0.b_message;
        if(v5 == 0) {
            throw null;
        }
        gwuh0.d = v5 - 1;
        gwuh0.b |= 2;
        gwuh gwuh1 = (gwuh)hftp0.N_build();
        if(!gwuu0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gwuu0).ensureMutable();
        }
        gwuv gwuv0 = (gwuv)gwuu0.b_message;
        gwuh1.getClass();
        hfuo hfuo0 = gwuv0.w;
        if(!hfuo0.c()) {
            gwuv0.w = ProtoLiteMessage.E(hfuo0);
        }
        gwuv0.w.add(gwuh1);
        this.I();
    }

    public final void f() {
        int v1;
        synchronized(this) {
            if(((gwuv)this.b.b_message).d.size() > 0 || ((gwuv)this.b.b_message).e.size() > 0 || ((gwuv)this.b.b_message).f.size() > 0 || ((gwuv)this.b.b_message).g.size() > 0 || ((gwuv)this.b.b_message).h.size() > 0 || ((gwuv)this.b.b_message).i.size() > 0 || ((gwuv)this.b.b_message).j.size() > 0 || ((gwuv)this.b.b_message).l.size() > 0 || ((gwuv)this.b.b_message).r.size() > 0 || ((gwuv)this.b.b_message).x.size() > 0 || ((gwuv)this.b.b_message).m.size() > 0 || ((gwuv)this.b.b_message).o.size() > 0 || ((gwuv)this.b.b_message).p.size() > 0 || ((gwuv)this.b.b_message).q.size() > 0 || ((gwuv)this.b.b_message).s.size() > 0 || ((gwuv)this.b.b_message).n.size() > 0 || ((gwuv)this.b.b_message).t.size() > 0 || ((gwuv)this.b.b_message).v.size() > 0 || ((gwuv)this.b.b_message).u.size() > 0 || ((gwuv)this.b.b_message).y.size() > 0 || (((gwuv)this.b.b_message).b & 16) != 0) {
                ProtoLiteBuilder hftp0 = this.c;
                gwuv gwuv0 = (gwuv)((ProtoLiteBuilder)this.b).N_build();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gwtl gwtl0 = (gwtl)hftp0.b_message;
                gwuv0.getClass();
                gwtl0.h = gwuv0;
                gwtl0.b |= 0x20;
            }
            gwtl gwtl1 = (gwtl)this.c.N_build();
            if(((ProtoLiteMessage)gwtl1).isImmutable()) {
                v1 = ((ProtoLiteMessage)gwtl1).t(null);
                if(v1 < 0) {
                    throw new IllegalStateException("serialized size must be non-negative, was " + v1);
                }
            }
            else {
                int v2 = gwtl1.memoizedSerializedSize & 0x7FFFFFFF;
                if(v2 == 0x7FFFFFFF) {
                    v2 = ((ProtoLiteMessage)gwtl1).t(null);
                    if(v2 < 0) {
                        throw new IllegalStateException("serialized size must be non-negative, was " + v2);
                    }
                    gwtl1.memoizedSerializedSize = gwtl1.memoizedSerializedSize & 0x80000000 | v2;
                }
                v1 = v2;
            }
            if(v1 > 0) {
                this.a.a(((gwtl)this.c.N_build()));
            }
        }
    }

    @Override  // fvnn
    public final void g(List list0, long v) {
        gwtf gwtf2;
        synchronized(this) {
            if(this.C) {
                return;
            }
            this.q.e(v);
            gwuu gwuu0 = this.b;
            long v2 = v - this.a();
            ArrayList arrayList0 = new ArrayList(list0.size());
            gwtf gwtf0 = null;
            for(Object object0: list0) {
                CellInfo cellInfo0 = (CellInfo)object0;
                int v3 = 0x7FFFFFFF;
                if((cellInfo0 instanceof CellInfoNr)) {
                    CellIdentityNr cellIdentityNr0 = (CellIdentityNr)fvle.b(((CellInfoNr)cellInfo0).getCellIdentity(), CellIdentityNr.class);
                    CellSignalStrengthNr cellSignalStrengthNr0 = (CellSignalStrengthNr)fvle.b(((CellInfoNr)cellInfo0).getCellSignalStrength(), CellSignalStrengthNr.class);
                    if(cellIdentityNr0 != null && cellSignalStrengthNr0 != null) {
                        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gwtf.a).v_newBuilder();
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        ((gwtf)hftp0.b_message).k = 7;
                        ((gwtf)hftp0.b_message).b |= 0x200;
                        ggfn ggfn0 = new ggfn();
                        ggfn0.k(cellIdentityNr0.getAdditionalPlmns());
                        fvle.c(hftp0, 0x7FFFFFFF, cellIdentityNr0.getMccString(), cellIdentityNr0.getMncString(), cellIdentityNr0.getNrarfcn(), cellSignalStrengthNr0.getDbm(), ggfn0.h(), ((CellInfoNr)cellInfo0));
                        if(Build.VERSION.SDK_INT >= 34) {
                            v3 = cellSignalStrengthNr0.getTimingAdvanceMicros();
                        }
                        fvle.d(hftp0, cellIdentityNr0.getPci(), cellIdentityNr0.getTac(), v3);
                        long v4 = cellIdentityNr0.getNci();
                        if(v4 != 0x7FFFFFFFFFFFFFFFL) {
                            if(!hftp0.b_message.isImmutable()) {
                                hftp0.ensureMutable();
                            }
                            gwtf gwtf1 = (gwtf)hftp0.b_message;
                            gwtf1.b |= 0x1000;
                            gwtf1.n = v4;
                        }
                        gwtf2 = (gwtf)hftp0.N_build();
                    }
                    else {
                        gwtf2 = fvle.a();
                    }
                }
                else if((cellInfo0 instanceof CellInfoLte)) {
                    CellIdentityLte cellIdentityLte0 = ((CellInfoLte)cellInfo0).getCellIdentity();
                    CellSignalStrengthLte cellSignalStrengthLte0 = ((CellInfoLte)cellInfo0).getCellSignalStrength();
                    if(cellIdentityLte0 != null && cellSignalStrengthLte0 != null) {
                        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gwtf.a).v_newBuilder();
                        if(!hftp1.b_message.isImmutable()) {
                            hftp1.ensureMutable();
                        }
                        ((gwtf)hftp1.b_message).k = 6;
                        ((gwtf)hftp1.b_message).b |= 0x200;
                        ggfn ggfn1 = new ggfn();
                        ggfn1.k(cellIdentityLte0.getAdditionalPlmns());
                        fvle.c(hftp1, cellIdentityLte0.getCi(), cellIdentityLte0.getMccString(), cellIdentityLte0.getMncString(), cellIdentityLte0.getEarfcn(), cellSignalStrengthLte0.getDbm(), ggfn1.h(), ((CellInfoLte)cellInfo0));
                        fvle.d(hftp1, cellIdentityLte0.getPci(), cellIdentityLte0.getTac(), cellSignalStrengthLte0.getTimingAdvance());
                        gwtf2 = (gwtf)hftp1.N_build();
                    }
                    else {
                        gwtf2 = fvle.a();
                    }
                }
                else if((cellInfo0 instanceof CellInfoWcdma)) {
                    CellIdentityWcdma cellIdentityWcdma0 = ((CellInfoWcdma)cellInfo0).getCellIdentity();
                    CellSignalStrengthWcdma cellSignalStrengthWcdma0 = ((CellInfoWcdma)cellInfo0).getCellSignalStrength();
                    if(cellIdentityWcdma0 != null && cellSignalStrengthWcdma0 != null) {
                        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)gwtf.a).v_newBuilder();
                        if(!hftp2.b_message.isImmutable()) {
                            hftp2.ensureMutable();
                        }
                        ((gwtf)hftp2.b_message).k = 5;
                        ((gwtf)hftp2.b_message).b |= 0x200;
                        ggfn ggfn2 = new ggfn();
                        ggfn2.k(cellIdentityWcdma0.getAdditionalPlmns());
                        fvle.c(hftp2, cellIdentityWcdma0.getCid(), cellIdentityWcdma0.getMccString(), cellIdentityWcdma0.getMncString(), cellIdentityWcdma0.getUarfcn(), cellSignalStrengthWcdma0.getDbm(), ggfn2.h(), ((CellInfoWcdma)cellInfo0));
                        int v5 = cellIdentityWcdma0.getLac();
                        if(v5 != 0x7FFFFFFF) {
                            if(!hftp2.b_message.isImmutable()) {
                                hftp2.ensureMutable();
                            }
                            gwtf gwtf3 = (gwtf)hftp2.b_message;
                            gwtf3.b |= 1;
                            gwtf3.c = v5;
                        }
                        int v6 = cellIdentityWcdma0.getPsc();
                        if(v6 != 0x7FFFFFFF) {
                            if(!hftp2.b_message.isImmutable()) {
                                hftp2.ensureMutable();
                            }
                            gwtf gwtf4 = (gwtf)hftp2.b_message;
                            gwtf4.b |= 0x80;
                            gwtf4.j = v6;
                        }
                        gwtf2 = (gwtf)hftp2.N_build();
                    }
                    else {
                        gwtf2 = fvle.a();
                    }
                }
                else if((cellInfo0 instanceof CellInfoGsm)) {
                    CellIdentityGsm cellIdentityGsm0 = ((CellInfoGsm)cellInfo0).getCellIdentity();
                    CellSignalStrengthGsm cellSignalStrengthGsm0 = ((CellInfoGsm)cellInfo0).getCellSignalStrength();
                    if(cellIdentityGsm0 != null && cellSignalStrengthGsm0 != null) {
                        ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)gwtf.a).v_newBuilder();
                        if(!hftp3.b_message.isImmutable()) {
                            hftp3.ensureMutable();
                        }
                        ((gwtf)hftp3.b_message).k = 3;
                        ((gwtf)hftp3.b_message).b |= 0x200;
                        ggfn ggfn3 = new ggfn();
                        ggfn3.k(cellIdentityGsm0.getAdditionalPlmns());
                        fvle.c(hftp3, cellIdentityGsm0.getCid(), cellIdentityGsm0.getMccString(), cellIdentityGsm0.getMncString(), cellIdentityGsm0.getArfcn(), cellSignalStrengthGsm0.getDbm(), ggfn3.h(), ((CellInfoGsm)cellInfo0));
                        if(cellIdentityGsm0.getLac() != 0x7FFFFFFF) {
                            int v7 = cellIdentityGsm0.getLac();
                            if(!hftp3.b_message.isImmutable()) {
                                hftp3.ensureMutable();
                            }
                            gwtf gwtf5 = (gwtf)hftp3.b_message;
                            gwtf5.b |= 1;
                            gwtf5.c = v7;
                        }
                        if(cellSignalStrengthGsm0.getTimingAdvance() != 0x7FFFFFFF) {
                            int v8 = cellSignalStrengthGsm0.getTimingAdvance();
                            if(!hftp3.b_message.isImmutable()) {
                                hftp3.ensureMutable();
                            }
                            gwtf gwtf6 = (gwtf)hftp3.b_message;
                            gwtf6.b |= 0x40;
                            gwtf6.i = v8;
                        }
                        gwtf2 = (gwtf)hftp3.N_build();
                    }
                    else {
                        gwtf2 = fvle.a();
                    }
                }
                else {
                    gwtf2 = fvle.a();
                }
                if(cellInfo0.isRegistered()) {
                    if(gwtf0 != null) {
                        int v9 = gwte.a(gwtf2.k);
                        int v10 = -1;
                        if(v9 == 0) {
                            v9 = -1;
                        }
                        int v11 = gwte.a(gwtf0.k);
                        if(v11 != 0) {
                            v10 = v11;
                        }
                        if(v9 != 0 && v10 != 0) {
                            if(v9 > v10) {
                                arrayList0.add(gwtf0);
                                goto label_139;
                            }
                            else {
                                arrayList0.add(gwtf2);
                                continue;
                            }
                        }
                        throw null;
                    }
                label_139:
                    gwtf0 = gwtf2;
                }
                else {
                    arrayList0.add(gwtf2);
                }
            }
            if(gwtf0 == null) {
                gwtf0 = fvle.a();
            }
            ProtoLiteBuilder hftp4 = ((ProtoLiteMessage)gwtg.a).v_newBuilder();
            if(!hftp4.b_message.isImmutable()) {
                hftp4.ensureMutable();
            }
            gwtg gwtg0 = (gwtg)hftp4.b_message;
            gwtg0.b |= 2;
            gwtg0.d = v2;
            if(!hftp4.b_message.isImmutable()) {
                hftp4.ensureMutable();
            }
            gwtg gwtg1 = (gwtg)hftp4.b_message;
            gwtg1.b();
            hfrj.E(arrayList0, gwtg1.e);
            if(!hftp4.b_message.isImmutable()) {
                hftp4.ensureMutable();
            }
            gwtg gwtg2 = (gwtg)hftp4.b_message;
            gwtf0.getClass();
            gwtg2.c = gwtf0;
            gwtg2.b |= 1;
            gwtg gwtg3 = (gwtg)hftp4.N_build();
            if(!gwuu0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)gwuu0).ensureMutable();
            }
            gwuv gwuv0 = (gwuv)gwuu0.b_message;
            gwtg3.getClass();
            hfuo hfuo0 = gwuv0.h;
            if(!hfuo0.c()) {
                gwuv0.h = ProtoLiteMessage.E(hfuo0);
            }
            gwuv0.h.add(gwtg3);
            this.I();
        }
    }

    @Override  // fvnn
    public final void h(float[] arr_f, long v, int v1) {
        gftb.check(this.U);
        gftb.checkTrue((((gwtv)this.U.b_message).b & 16) != 0);
        gftb.checkTrue((((gwtv)this.U.b_message).b & 8) != 0);
        gftb.checkTrue(arr_f.length % v1 == 0);
        if(this.C) {
            return;
        }
        ProtoLiteBuilder hftp0 = this.T;
        if((((gwts)hftp0.b_message).b & 0x800) == 0) {
            gwtv gwtv0 = (gwtv)this.U.N_build();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gwts gwts0 = (gwts)hftp0.b_message;
            gwtv0.getClass();
            gwts0.i = gwtv0;
            gwts0.b |= 0x800;
            gwvh gwvh0 = this.a;
            gwts gwts1 = (gwts)this.T.N_build();
            if(!gwvh0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)gwvh0).ensureMutable();
            }
            gwvi gwvi0 = (gwvi)gwvh0.b_message;
            gwts1.getClass();
            gwvi0.c = gwts1;
            gwvi0.b |= 1;
        }
        this.q.e(v);
        int v2 = arr_f.length / v1;
        long v3 = v - this.a();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gwut.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gwut gwut0 = (gwut)hftp1.b_message;
        gwut0.b |= 1;
        gwut0.d = (int)v3;
        for(int v4 = 0; v4 < v1; ++v4) {
            ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)gwus.a).v_newBuilder();
            for(int v5 = 0; v5 < v2; ++v5) {
                float f = arr_f[v1 * v5 + v4];
                if(!hftp2.b_message.isImmutable()) {
                    hftp2.ensureMutable();
                }
                gwus gwus0 = (gwus)hftp2.b_message;
                hfue hfue0 = gwus0.b;
                if(!hfue0.c()) {
                    gwus0.b = ProtoLiteMessage.B(hfue0);
                }
                gwus0.b.h(f);
            }
            gwus gwus1 = (gwus)hftp2.N_build();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            gwut gwut1 = (gwut)hftp1.b_message;
            gwus1.getClass();
            hfuo hfuo0 = gwut1.c;
            if(!hfuo0.c()) {
                gwut1.c = ProtoLiteMessage.E(hfuo0);
            }
            gwut1.c.add(gwus1);
        }
        gwuu gwuu0 = this.b;
        gwut gwut2 = (gwut)hftp1.N_build();
        if(!gwuu0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gwuu0).ensureMutable();
        }
        gwuv gwuv0 = (gwuv)gwuu0.b_message;
        gwut2.getClass();
        hfuo hfuo1 = gwuv0.y;
        if(!hfuo1.c()) {
            gwuv0.y = ProtoLiteMessage.E(hfuo1);
        }
        gwuv0.y.add(gwut2);
        this.I();
    }

    @Override  // fvnn
    public final void i(int v, long v1) {
        if(this.C) {
            return;
        }
        this.q.e(v1);
        gwuu gwuu0 = this.b;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gwuk.a).v_newBuilder();
        int v2 = gwuj.a(v);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        if(v2 == 0) {
            throw null;
        }
        ((gwuk)hftv0).c = v2;
        ((gwuk)hftv0).b |= 1;
        long v3 = v1 - this.a();
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        gwuk gwuk0 = (gwuk)hftp0.b_message;
        gwuk0.b |= 2;
        gwuk0.d = (int)v3;
        gwuk gwuk1 = (gwuk)hftp0.N_build();
        if(!gwuu0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gwuu0).ensureMutable();
        }
        gwuv gwuv0 = (gwuv)gwuu0.b_message;
        gwuk1.getClass();
        hfuo hfuo0 = gwuv0.t;
        if(!hfuo0.c()) {
            gwuv0.t = ProtoLiteMessage.E(hfuo0);
        }
        gwuv0.t.add(gwuk1);
        this.I();
    }

    @Override  // fvnn
    public final void j(GnssMeasurementsEvent gnssMeasurementsEvent0, long v) {
        synchronized(this) {
            if(!this.C && gnssMeasurementsEvent0 != null) {
                this.q.e(v);
                gwuu gwuu0 = this.b;
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gwse.a).v_newBuilder();
                long v2 = v - this.a();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gwse gwse0 = (gwse)hftp0.b_message;
                gwse0.b |= 1;
                gwse0.c = (int)v2;
                gwrv gwrv0 = fvmu.a(gnssMeasurementsEvent0);
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gwse gwse1 = (gwse)hftp0.b_message;
                gwrv0.getClass();
                gwse1.d = gwrv0;
                gwse1.b |= 2;
                gwse gwse2 = (gwse)hftp0.N_build();
                if(!gwuu0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)gwuu0).ensureMutable();
                }
                gwuv gwuv0 = (gwuv)gwuu0.b_message;
                gwse2.getClass();
                gwuv0.c();
                gwuv0.u.add(gwse2);
                this.I();
            }
        }
    }

    @Override  // fvnn
    public final void k(GnssNavigationMessage gnssNavigationMessage0, long v) {
        synchronized(this) {
            if(!this.C && gnssNavigationMessage0 != null) {
                this.q.e(v);
            }
        }
    }

    @Override  // fvnn
    public final void l(jyf jyf0, long v) {
        synchronized(this) {
            if(this.C) {
                return;
            }
            this.q.e(v);
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gwsf.a).v_newBuilder();
            long v2 = v - this.a();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gwsf gwsf0 = (gwsf)hftp0.b_message;
            gwsf0.b |= 1;
            gwsf0.c = (int)v2;
            for(int v3 = 0; v3 < jyf0.g(); ++v3) {
                ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gwsc.a).v_newBuilder();
                int v4 = jyf0.h(v3);
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                gwsc gwsc0 = (gwsc)hftp1.b_message;
                gwsc0.b |= 1;
                gwsc0.c = v4;
                int v5 = jyf0.f(v3);
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                gwsc gwsc1 = (gwsc)hftp1.b_message;
                gwsc1.b |= 2;
                gwsc1.d = v5;
                float f = jyf0.a(v3);
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                gwsc gwsc2 = (gwsc)hftp1.b_message;
                gwsc2.b |= 4;
                gwsc2.e = f;
                float f1 = jyf0.e(v3);
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                gwsc gwsc3 = (gwsc)hftp1.b_message;
                gwsc3.b |= 8;
                gwsc3.f = f1;
                float f2 = jyf0.d(v3);
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                gwsc gwsc4 = (gwsc)hftp1.b_message;
                gwsc4.b |= 16;
                gwsc4.g = f2;
                boolean z = jyf0.m(v3);
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                gwsc gwsc5 = (gwsc)hftp1.b_message;
                gwsc5.b |= 0x80;
                gwsc5.j = z;
                boolean z1 = jyf0.l(v3);
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                gwsc gwsc6 = (gwsc)hftp1.b_message;
                gwsc6.b |= 0x200;
                gwsc6.l = z1;
                boolean z2 = jyf0.i(v3);
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                gwsc gwsc7 = (gwsc)hftp1.b_message;
                gwsc7.b |= 0x100;
                gwsc7.k = z2;
                if(jyf0.k(v3)) {
                    float f3 = jyf0.c(v3);
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    gwsc gwsc8 = (gwsc)hftp1.b_message;
                    gwsc8.b |= 0x40;
                    gwsc8.i = f3;
                }
                if(jyf0.j(v3)) {
                    float f4 = jyf0.b(v3);
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    gwsc gwsc9 = (gwsc)hftp1.b_message;
                    gwsc9.b |= 0x20;
                    gwsc9.h = f4;
                }
                gwsc gwsc10 = (gwsc)hftp1.N_build();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gwsf gwsf1 = (gwsf)hftp0.b_message;
                gwsc10.getClass();
                hfuo hfuo0 = gwsf1.d;
                if(!hfuo0.c()) {
                    gwsf1.d = ProtoLiteMessage.E(hfuo0);
                }
                gwsf1.d.add(gwsc10);
            }
            gwuu gwuu0 = this.b;
            gwsf gwsf2 = (gwsf)hftp0.N_build();
            if(!gwuu0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)gwuu0).ensureMutable();
            }
            gwuv gwuv0 = (gwuv)gwuu0.b_message;
            gwsf2.getClass();
            hfuo hfuo1 = gwuv0.A;
            if(!hfuo1.c()) {
                gwuv0.A = ProtoLiteMessage.E(hfuo1);
            }
            gwuv0.A.add(gwsf2);
            this.I();
        }
    }

    @Override  // fvnn
    public final void m(float f, float f1, float f2, int v, long v1, long v2) {
        synchronized(this) {
            if(this.C) {
                return;
            }
            if(Math.abs(v1 - this.B) >= this.n) {
                this.B = v1;
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gwul.a).v_newBuilder();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ProtoLiteMessage hftv0 = hftp0.b_message;
                ((gwul)hftv0).b |= 1;
                ((gwul)hftv0).c = f;
                if(!hftv0.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ProtoLiteMessage hftv1 = hftp0.b_message;
                ((gwul)hftv1).b |= 2;
                ((gwul)hftv1).d = f1;
                if(!hftv1.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gwul gwul0 = (gwul)hftp0.b_message;
                gwul0.b |= 4;
                gwul0.e = f2;
                gwuu gwuu0 = this.b;
                fvml fvml0 = new fvml(hftp0);
                this.t.a(gwuu0, v, v1, v2, fvml0);
                gwuu gwuu1 = this.b;
                gwul gwul1 = (gwul)hftp0.N_build();
                if(!gwuu1.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)gwuu1).ensureMutable();
                }
                gwuv gwuv0 = (gwuv)gwuu1.b_message;
                gwul1.getClass();
                hfuo hfuo0 = gwuv0.f;
                if(!hfuo0.c()) {
                    gwuv0.f = ProtoLiteMessage.E(hfuo0);
                }
                gwuv0.f.add(gwul1);
                this.I();
                return;
            }
            this.B();
        }
    }

    @Override  // fvnn
    public final void n(float f, float f1, float f2, float f3, int v, long v1, long v2) {
        synchronized(this) {
            if(this.C) {
                return;
            }
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gwum.a).v_newBuilder();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp0.b_message;
            ((gwum)hftv0).b |= 1;
            ((gwum)hftv0).c = f;
            if(!hftv0.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv1 = hftp0.b_message;
            ((gwum)hftv1).b |= 2;
            ((gwum)hftv1).d = f1;
            if(!hftv1.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv2 = hftp0.b_message;
            ((gwum)hftv2).b |= 4;
            ((gwum)hftv2).e = f2;
            if(!hftv2.isImmutable()) {
                hftp0.ensureMutable();
            }
            gwum gwum0 = (gwum)hftp0.b_message;
            gwum0.b |= 8;
            gwum0.f = f3;
            gwuu gwuu0 = this.b;
            fvmk fvmk0 = new fvmk(hftp0);
            this.y.a(gwuu0, v, v1, v2, fvmk0);
            gwuu gwuu1 = this.b;
            gwum gwum1 = (gwum)hftp0.N_build();
            if(!gwuu1.b_message.isImmutable()) {
                ((ProtoLiteBuilder)gwuu1).ensureMutable();
            }
            gwuv gwuv0 = (gwuv)gwuu1.b_message;
            gwum1.getClass();
            hfuo hfuo0 = gwuv0.x;
            if(!hfuo0.c()) {
                gwuv0.x = ProtoLiteMessage.E(hfuo0);
            }
            gwuv0.x.add(gwum1);
            this.I();
        }
    }

    @Override  // fvnn
    public final void o(float f, int v, long v1, long v2) {
        synchronized(this) {
            if(this.C) {
                return;
            }
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gwun.a).v_newBuilder();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gwun gwun0 = (gwun)hftp0.b_message;
            gwun0.b |= 1;
            gwun0.c = f;
            gwuu gwuu0 = this.b;
            fvmg fvmg0 = new fvmg(hftp0);
            this.x.a(gwuu0, v, v1, v2, fvmg0);
            gwuu gwuu1 = this.b;
            gwun gwun1 = (gwun)hftp0.N_build();
            if(!gwuu1.b_message.isImmutable()) {
                ((ProtoLiteBuilder)gwuu1).ensureMutable();
            }
            gwuv gwuv0 = (gwuv)gwuu1.b_message;
            gwun1.getClass();
            hfuo hfuo0 = gwuv0.r;
            if(!hfuo0.c()) {
                gwuv0.r = ProtoLiteMessage.E(hfuo0);
            }
            gwuv0.r.add(gwun1);
            this.I();
        }
    }

    @Override  // fvnn
    public final void p(float f, int v, long v1, long v2) {
        synchronized(this) {
            if(this.C) {
                return;
            }
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gwuo.a).v_newBuilder();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gwuo gwuo0 = (gwuo)hftp0.b_message;
            gwuo0.b |= 1;
            gwuo0.c = f;
            gwuu gwuu0 = this.b;
            fvmi fvmi0 = new fvmi(hftp0);
            this.v.a(gwuu0, v, v1, v2, fvmi0);
            gwuu gwuu1 = this.b;
            gwuo gwuo1 = (gwuo)hftp0.N_build();
            if(!gwuu1.b_message.isImmutable()) {
                ((ProtoLiteBuilder)gwuu1).ensureMutable();
            }
            gwuv gwuv0 = (gwuv)gwuu1.b_message;
            gwuo1.getClass();
            hfuo hfuo0 = gwuv0.o;
            if(!hfuo0.c()) {
                gwuv0.o = ProtoLiteMessage.E(hfuo0);
            }
            gwuv0.o.add(gwuo1);
            this.I();
        }
    }

    @Override  // fvnn
    public final void q(Location location0, long v) {
        int v2;
        synchronized(this) {
            if(location0 != null && !this.C) {
                this.q.e(v);
                String s = location0.getProvider();
                if("fused".equals(s)) {
                    v2 = 6;
                }
                else {
                    v2 = "gps".equals(s) ? 1 : 16;
                }
                this.b.a(fvsb.c(location0, v2, v - this.a()));
                this.I();
            }
        }
    }

    @Override  // fvnn
    public final void r(float f, float f1, float f2, int v, long v1, long v2) {
        int v10;
        int v9;
        synchronized(this) {
            if(this.C) {
                return;
            }
            fvmq fvmq0 = this.q;
            fvmq0.e(v2);
            fvmq0.d(v1, v2);
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gwup.a).v_newBuilder();
            long v4 = this.L;
            if(v4 == 0x7FFFFFFFFFFFFFFFL) {
                v4 = fvmq0.b(v1, v2);
                this.L = v4;
            }
            gwuu gwuu0 = this.b;
            if((((gwuv)gwuu0.b_message).b & 1) == 0) {
                long v5 = fvmq0.a(v1, v4);
                if(!gwuu0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)gwuu0).ensureMutable();
                }
                gwuv gwuv0 = (gwuv)gwuu0.b_message;
                gwuv0.b |= 1;
                gwuv0.c = v5;
            }
            if(((gwuv)this.b.b_message).g.size() == 0) {
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ProtoLiteMessage hftv0 = hftp0.b_message;
                ((gwup)hftv0).b |= 0x200;
                ((gwup)hftv0).j = v1;
                if(!hftv0.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gwup gwup0 = (gwup)hftp0.b_message;
                gwup0.b |= 0x400;
                gwup0.k = v2 * 1000000L;
            }
            long v6 = this.J;
            if(v6 == 0x7FFFFFFFFFFFFFFFL) {
                long v7 = ((gwuv)this.b.b_message).c;
                long v8 = fvmq0.a(v1, this.L);
                v9 = fvmp.K(v7, v8);
                v10 = fvmp.L(v7, v8);
            }
            else {
                v9 = fvmp.K(v6, v1);
                v10 = fvmp.L(v6, v1);
            }
            if(v9 != 0) {
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gwup gwup1 = (gwup)hftp0.b_message;
                gwup1.b |= 0x80;
                gwup1.h = v9;
            }
            if(v10 != 0) {
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gwup gwup2 = (gwup)hftp0.b_message;
                gwup2.b |= 0x100;
                gwup2.i = v10;
            }
            this.J = v1;
            if(((gwuv)this.b.b_message).g.size() == 0 || this.E != v) {
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gwup gwup3 = (gwup)hftp0.b_message;
                gwup3.b |= 8;
                gwup3.f = v;
                this.E = v;
            }
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv1 = hftp0.b_message;
            ((gwup)hftv1).b |= 1;
            ((gwup)hftv1).c = f;
            if(!hftv1.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv2 = hftp0.b_message;
            ((gwup)hftv2).b |= 2;
            ((gwup)hftv2).d = f1;
            if(!hftv2.isImmutable()) {
                hftp0.ensureMutable();
            }
            gwup gwup4 = (gwup)hftp0.b_message;
            gwup4.b |= 4;
            gwup4.e = f2;
            gwuu gwuu1 = this.b;
            gwup gwup5 = (gwup)hftp0.N_build();
            if(!gwuu1.b_message.isImmutable()) {
                ((ProtoLiteBuilder)gwuu1).ensureMutable();
            }
            gwuv gwuv1 = (gwuv)gwuu1.b_message;
            gwup5.getClass();
            hfuo hfuo0 = gwuv1.g;
            if(!hfuo0.c()) {
                gwuv1.g = ProtoLiteMessage.E(hfuo0);
            }
            gwuv1.g.add(gwup5);
            this.I();
        }
    }

    @Override  // fvnn
    public final void s(float f, float f1, float f2, int v, long v1, long v2) {
        synchronized(this) {
            if(this.C) {
                return;
            }
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gwuq.a).v_newBuilder();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp0.b_message;
            ((gwuq)hftv0).b |= 1;
            ((gwuq)hftv0).c = f;
            if(!hftv0.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv1 = hftp0.b_message;
            ((gwuq)hftv1).b |= 4;
            ((gwuq)hftv1).e = f1;
            if(!hftv1.isImmutable()) {
                hftp0.ensureMutable();
            }
            gwuq gwuq0 = (gwuq)hftp0.b_message;
            gwuq0.b |= 2;
            gwuq0.d = f2;
            gwuu gwuu0 = this.b;
            fvmn fvmn0 = new fvmn(hftp0);
            this.r.a(gwuu0, v, v1, v2, fvmn0);
            gwuu gwuu1 = this.b;
            gwuq gwuq1 = (gwuq)hftp0.N_build();
            if(!gwuu1.b_message.isImmutable()) {
                ((ProtoLiteBuilder)gwuu1).ensureMutable();
            }
            gwuv gwuv0 = (gwuv)gwuu1.b_message;
            gwuq1.getClass();
            hfuo hfuo0 = gwuv0.d;
            if(!hfuo0.c()) {
                gwuv0.d = ProtoLiteMessage.E(hfuo0);
            }
            gwuv0.d.add(gwuq1);
            this.I();
        }
    }

    @Override  // fvnn
    public final void t(float f, int v, long v1, long v2) {
        synchronized(this) {
            if(this.C) {
                return;
            }
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gwur.a).v_newBuilder();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gwur gwur0 = (gwur)hftp0.b_message;
            gwur0.b |= 1;
            gwur0.c = f;
            gwuu gwuu0 = this.b;
            fvmf fvmf0 = new fvmf(hftp0);
            this.w.a(gwuu0, v, v1, v2, fvmf0);
            gwuu gwuu1 = this.b;
            gwur gwur1 = (gwur)hftp0.N_build();
            if(!gwuu1.b_message.isImmutable()) {
                ((ProtoLiteBuilder)gwuu1).ensureMutable();
            }
            gwuv gwuv0 = (gwuv)gwuu1.b_message;
            gwur1.getClass();
            hfuo hfuo0 = gwuv0.p;
            if(!hfuo0.c()) {
                gwuv0.p = ProtoLiteMessage.E(hfuo0);
            }
            gwuv0.p.add(gwur1);
            this.I();
        }
    }

    @Override  // fvnn
    public final void u(double[] arr_f, double[] arr_f1, double[] arr_f2, double[] arr_f3, double[] arr_f4, long v) {
        synchronized(this) {
            if(this.C) {
                return;
            }
            this.q.e(v);
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gwuw.a).v_newBuilder();
            for(int v3 = 0; v3 < 4; ++v3) {
                double f = arr_f[v3];
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gwuw gwuw0 = (gwuw)hftp0.b_message;
                hfua hfua0 = gwuw0.c;
                if(!hfua0.c()) {
                    gwuw0.c = ProtoLiteMessage.A(hfua0);
                }
                gwuw0.c.h(f);
            }
            for(int v4 = 0; v4 < 40; ++v4) {
                double f1 = arr_f1[v4];
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gwuw gwuw1 = (gwuw)hftp0.b_message;
                hfua hfua1 = gwuw1.d;
                if(!hfua1.c()) {
                    gwuw1.d = ProtoLiteMessage.A(hfua1);
                }
                gwuw1.d.h(f1);
            }
            for(int v5 = 0; v5 < arr_f2.length; ++v5) {
                double f2 = arr_f2[v5];
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gwuw gwuw2 = (gwuw)hftp0.b_message;
                hfua hfua2 = gwuw2.e;
                if(!hfua2.c()) {
                    gwuw2.e = ProtoLiteMessage.A(hfua2);
                }
                gwuw2.e.h(f2);
            }
            for(int v6 = 0; v6 < arr_f3.length; ++v6) {
                double f3 = arr_f3[v6];
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gwuw gwuw3 = (gwuw)hftp0.b_message;
                hfua hfua3 = gwuw3.f;
                if(!hfua3.c()) {
                    gwuw3.f = ProtoLiteMessage.A(hfua3);
                }
                gwuw3.f.h(f3);
            }
            for(int v2 = 0; v2 < arr_f4.length; ++v2) {
                double f4 = arr_f4[v2];
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gwuw gwuw4 = (gwuw)hftp0.b_message;
                hfua hfua4 = gwuw4.g;
                if(!hfua4.c()) {
                    gwuw4.g = ProtoLiteMessage.A(hfua4);
                }
                gwuw4.g.h(f4);
            }
            long v7 = v - this.a();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gwuw gwuw5 = (gwuw)hftp0.b_message;
            gwuw5.b |= 1;
            gwuw5.h = (int)v7;
            gwuu gwuu0 = this.b;
            gwuw gwuw6 = (gwuw)hftp0.N_build();
            if(!gwuu0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)gwuu0).ensureMutable();
            }
            gwuv gwuv0 = (gwuv)gwuu0.b_message;
            gwuw6.getClass();
            hfuo hfuo0 = gwuv0.q;
            if(!hfuo0.c()) {
                gwuv0.q = ProtoLiteMessage.E(hfuo0);
            }
            gwuv0.q.add(gwuw6);
            this.I();
        }
    }

    @Override  // fvnn
    public final void v(float f, int v, long v1, long v2) {
        synchronized(this) {
            if(this.C) {
                return;
            }
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gwux.a).v_newBuilder();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gwux gwux0 = (gwux)hftp0.b_message;
            gwux0.b |= 1;
            gwux0.c = f;
            gwuu gwuu0 = this.b;
            fvmh fvmh0 = new fvmh(hftp0);
            this.z.a(gwuu0, v, v1, v2, fvmh0);
            gwuu gwuu1 = this.b;
            gwux gwux1 = (gwux)hftp0.N_build();
            if(!gwuu1.b_message.isImmutable()) {
                ((ProtoLiteBuilder)gwuu1).ensureMutable();
            }
            gwuv gwuv0 = (gwuv)gwuu1.b_message;
            gwux1.getClass();
            hfuo hfuo0 = gwuv0.s;
            if(!hfuo0.c()) {
                gwuv0.s = ProtoLiteMessage.E(hfuo0);
            }
            gwuv0.s.add(gwux1);
            this.I();
        }
    }

    @Override  // fvnn
    public final void w(float f, float f1, float f2, float f3, float f4, float f5, int v, long v1, long v2) {
        int v10;
        int v9;
        synchronized(this) {
            if(this.C) {
                return;
            }
            fvmq fvmq0 = this.q;
            fvmq0.e(v2);
            fvmq0.d(v1, v2);
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gwup.a).v_newBuilder();
            long v4 = this.L;
            if(v4 == 0x7FFFFFFFFFFFFFFFL) {
                v4 = fvmq0.b(v1, v2);
                this.L = v4;
            }
            gwuu gwuu0 = this.b;
            if((((gwuv)gwuu0.b_message).b & 1) == 0) {
                long v5 = fvmq0.a(v1, v4);
                if(!gwuu0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)gwuu0).ensureMutable();
                }
                gwuv gwuv0 = (gwuv)gwuu0.b_message;
                gwuv0.b |= 1;
                gwuv0.c = v5;
            }
            if(((gwuv)this.b.b_message).g.size() == 0) {
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ProtoLiteMessage hftv0 = hftp0.b_message;
                ((gwup)hftv0).b |= 0x200;
                ((gwup)hftv0).j = v1;
                if(!hftv0.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gwup gwup0 = (gwup)hftp0.b_message;
                gwup0.b |= 0x400;
                gwup0.k = v2 * 1000000L;
            }
            long v6 = this.K;
            if(v6 == 0x7FFFFFFFFFFFFFFFL) {
                long v7 = ((gwuv)this.b.b_message).c;
                long v8 = fvmq0.a(v1, this.L);
                v9 = fvmp.K(v7, v8);
                v10 = fvmp.L(v7, v8);
            }
            else {
                v9 = fvmp.K(v6, v1);
                v10 = fvmp.L(v6, v1);
            }
            if(v9 != 0) {
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gwup gwup1 = (gwup)hftp0.b_message;
                gwup1.b |= 0x80;
                gwup1.h = v9;
            }
            if(v10 != 0) {
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gwup gwup2 = (gwup)hftp0.b_message;
                gwup2.b |= 0x100;
                gwup2.i = v10;
            }
            this.K = v1;
            if(((gwuv)this.b.b_message).n.size() == 0 || this.F != v) {
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gwup gwup3 = (gwup)hftp0.b_message;
                gwup3.b |= 8;
                gwup3.f = v;
                this.F = v;
            }
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv1 = hftp0.b_message;
            ((gwup)hftv1).b |= 1;
            ((gwup)hftv1).c = f;
            if(!hftv1.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv2 = hftp0.b_message;
            ((gwup)hftv2).b |= 2;
            ((gwup)hftv2).d = f1;
            if(!hftv2.isImmutable()) {
                hftp0.ensureMutable();
            }
            gwup gwup4 = (gwup)hftp0.b_message;
            gwup4.b |= 4;
            gwup4.e = f2;
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gwuy.a).v_newBuilder();
            gwup gwup5 = (gwup)hftp0.N_build();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            gwuy gwuy0 = (gwuy)hftp1.b_message;
            gwup5.getClass();
            gwuy0.c = gwup5;
            gwuy0.b |= 1;
            if((((gwuv)this.b.b_message).n.size() == 0 || Math.abs(f3 - this.G) > 0.000001f || Math.abs(f4 - this.H) > 0.000001f) || (Math.abs(f5 - this.I) > 0.000001f)) {
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ProtoLiteMessage hftv3 = hftp1.b_message;
                ((gwuy)hftv3).b |= 2;
                ((gwuy)hftv3).d = f3;
                if(!hftv3.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ProtoLiteMessage hftv4 = hftp1.b_message;
                ((gwuy)hftv4).b |= 4;
                ((gwuy)hftv4).e = f4;
                if(!hftv4.isImmutable()) {
                    hftp1.ensureMutable();
                }
                gwuy gwuy1 = (gwuy)hftp1.b_message;
                gwuy1.b |= 8;
                gwuy1.f = f5;
                this.G = f3;
                this.H = f4;
                this.I = f5;
            }
            gwuu gwuu1 = this.b;
            gwuy gwuy2 = (gwuy)hftp1.N_build();
            if(!gwuu1.b_message.isImmutable()) {
                ((ProtoLiteBuilder)gwuu1).ensureMutable();
            }
            gwuv gwuv1 = (gwuv)gwuu1.b_message;
            gwuy2.getClass();
            hfuo hfuo0 = gwuv1.n;
            if(!hfuo0.c()) {
                gwuv1.n = ProtoLiteMessage.E(hfuo0);
            }
            gwuv1.n.add(gwuy2);
            this.I();
        }
    }

    @Override  // fvnn
    public final void x(long v, List list0, long v1, List list1) {
        synchronized(this) {
            if(!this.C && !list0.isEmpty()) {
                this.q.e(v);
                gwvd gwvd0 = (gwvd)((ProtoLiteMessage)gwve.a).v_newBuilder();
                long v3 = v - this.a();
                if(!gwvd0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)gwvd0).ensureMutable();
                }
                gwve gwve0 = (gwve)gwvd0.b_message;
                gwve0.b |= 1;
                gwve0.c = v3;
                if(list1 != null) {
                    long v4 = v1 - this.a();
                    if(!gwvd0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)gwvd0).ensureMutable();
                    }
                    gwve gwve1 = (gwve)gwvd0.b_message;
                    gwve1.b |= 4;
                    gwve1.e = v4;
                }
                for(Object object0: list0) {
                    ScanResult scanResult0 = (ScanResult)object0;
                    long v5 = gxtu.d(scanResult0.BSSID);
                    if(v5 != -1L) {
                        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gwvc.a).v_newBuilder();
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        gwvc.b(((gwvc)hftp0.b_message));
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        gwvc gwvc0 = (gwvc)hftp0.b_message;
                        gwvc0.b |= 0x80;
                        gwvc0.e = v5;
                        int v6 = scanResult0.level;
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        gwvc gwvc1 = (gwvc)hftp0.b_message;
                        gwvc1.b |= 0x100;
                        gwvc1.f = v6;
                        gwps gwps0 = this.e;
                        if(!gwps0.j(v5)) {
                            int v7 = -1;
                            int v8 = -1;
                            int v9 = -1;
                            for(Object object1: scanResult0.getInformationElements()) {
                                ScanResult.InformationElement scanResult$InformationElement0 = (ScanResult.InformationElement)object1;
                                if(scanResult$InformationElement0 != null && scanResult$InformationElement0.getId() == 107) {
                                    ByteBuffer byteBuffer0 = scanResult$InformationElement0.getBytes();
                                    v7 = fvuy.a(byteBuffer0, 0);
                                    v8 = fvuy.a(byteBuffer0, 1);
                                    v9 = fvuy.a(byteBuffer0, 2);
                                }
                            }
                            gwps0.h(v5);
                            if(v7 != -1) {
                                ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gwuz.a).v_newBuilder();
                                if(!hftp1.b_message.isImmutable()) {
                                    hftp1.ensureMutable();
                                }
                                ProtoLiteMessage hftv0 = hftp1.b_message;
                                ((gwuz)hftv0).b |= 1;
                                ((gwuz)hftv0).c = v7;
                                if(v8 != -1) {
                                    if(!hftv0.isImmutable()) {
                                        hftp1.ensureMutable();
                                    }
                                    ProtoLiteMessage hftv1 = hftp1.b_message;
                                    ((gwuz)hftv1).b |= 2;
                                    ((gwuz)hftv1).d = v8;
                                    if(v9 != -1) {
                                        if(!hftv1.isImmutable()) {
                                            hftp1.ensureMutable();
                                        }
                                        gwuz gwuz0 = (gwuz)hftp1.b_message;
                                        gwuz0.b |= 4;
                                        gwuz0.e = v9;
                                    }
                                }
                                gwuz gwuz1 = (gwuz)hftp1.N_build();
                                if(!hftp0.b_message.isImmutable()) {
                                    hftp0.ensureMutable();
                                }
                                gwvc gwvc2 = (gwvc)hftp0.b_message;
                                gwuz1.getClass();
                                gwvc2.m = gwuz1;
                                gwvc2.b |= 0x80000;
                            }
                        }
                        String s = scanResult0.SSID;
                        if(s != null) {
                            int v10 = fvvf.a(s);
                            if(!hftp0.b_message.isImmutable()) {
                                hftp0.ensureMutable();
                            }
                            gwvc gwvc3 = (gwvc)hftp0.b_message;
                            gwvc3.b |= 0x8000;
                            gwvc3.j = v10;
                        }
                        int v11 = scanResult0.frequency;
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        gwvc gwvc4 = (gwvc)hftp0.b_message;
                        gwvc4.b |= 0x20000;
                        gwvc4.k = v11;
                        fvvf.b(hftp0, scanResult0.frequency);
                        String s1 = scanResult0.BSSID;
                        RangingResult rangingResult0 = null;
                        if(list1 != null && !list1.isEmpty()) {
                            for(Object object2: list1) {
                                RangingResult rangingResult1 = (RangingResult)object2;
                                MacAddress macAddress0 = rangingResult1.getMacAddress();
                                if(macAddress0 != null && gfqz.e(s1, macAddress0.toString())) {
                                    rangingResult0 = rangingResult1;
                                    break;
                                }
                            }
                        }
                        if(rangingResult0 != null && rangingResult0.getStatus() == 0) {
                            int v12 = rangingResult0.is80211mcMeasurement() ? 3 : 2;
                            ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)gwvg.a).v_newBuilder();
                            if(!hftp2.b_message.isImmutable()) {
                                hftp2.ensureMutable();
                            }
                            ProtoLiteMessage hftv2 = hftp2.b_message;
                            ((gwvg)hftv2).c = v12 - 1;
                            ((gwvg)hftv2).b |= 1;
                            if(!hftv2.isImmutable()) {
                                hftp2.ensureMutable();
                            }
                            gwvg gwvg0 = (gwvg)hftp2.b_message;
                            gwvg0.b |= 2;
                            gwvg0.d = v5;
                            long v13 = rangingResult0.getRangingTimestampMillis() - this.a();
                            if(!hftp2.b_message.isImmutable()) {
                                hftp2.ensureMutable();
                            }
                            gwvg gwvg1 = (gwvg)hftp2.b_message;
                            gwvg1.b |= 0x4000;
                            gwvg1.j = v13;
                            int v14 = (int)Math.round(((double)rangingResult0.getDistanceMm()) * 0.1);
                            if(!hftp2.b_message.isImmutable()) {
                                hftp2.ensureMutable();
                            }
                            gwvg gwvg2 = (gwvg)hftp2.b_message;
                            gwvg2.b |= 0x40;
                            gwvg2.e = v14;
                            int v15 = (int)Math.round(((double)rangingResult0.getDistanceStdDevMm()) * 0.1);
                            if(!hftp2.b_message.isImmutable()) {
                                hftp2.ensureMutable();
                            }
                            gwvg gwvg3 = (gwvg)hftp2.b_message;
                            gwvg3.b |= 0x80;
                            gwvg3.f = v15;
                            int v16 = rangingResult0.getRssi();
                            if(!hftp2.b_message.isImmutable()) {
                                hftp2.ensureMutable();
                            }
                            gwvg gwvg4 = (gwvg)hftp2.b_message;
                            gwvg4.b |= 0x200;
                            gwvg4.g = v16;
                            int v17 = rangingResult0.getNumAttemptedMeasurements();
                            if(!hftp2.b_message.isImmutable()) {
                                hftp2.ensureMutable();
                            }
                            gwvg gwvg5 = (gwvg)hftp2.b_message;
                            gwvg5.b |= 0x1000;
                            gwvg5.h = v17;
                            int v18 = rangingResult0.getNumSuccessfulMeasurements();
                            if(!hftp2.b_message.isImmutable()) {
                                hftp2.ensureMutable();
                            }
                            gwvg gwvg6 = (gwvg)hftp2.b_message;
                            gwvg6.b |= 0x2000;
                            gwvg6.i = v18;
                            gwvg gwvg7 = (gwvg)hftp2.N_build();
                            if(!hftp0.b_message.isImmutable()) {
                                hftp0.ensureMutable();
                            }
                            gwvc gwvc5 = (gwvc)hftp0.b_message;
                            gwvg7.getClass();
                            hfuo hfuo0 = gwvc5.i;
                            if(!hfuo0.c()) {
                                gwvc5.i = ProtoLiteMessage.E(hfuo0);
                            }
                            gwvc5.i.add(gwvg7);
                            if(!this.Q.contains(Long.valueOf(v5))) {
                                ResponderLocation responderLocation0 = rangingResult0.getUnverifiedResponderLocation();
                                if(responderLocation0 != null && responderLocation0.isLciSubelementValid()) {
                                    ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)gwva.a).v_newBuilder();
                                    double f = responderLocation0.getLatitude() * 10000000.0;
                                    if(!hftp3.b_message.isImmutable()) {
                                        hftp3.ensureMutable();
                                    }
                                    gwva gwva0 = (gwva)hftp3.b_message;
                                    gwva0.b |= 4;
                                    gwva0.e = (int)f;
                                    double f1 = responderLocation0.getLatitudeUncertainty() * 10000000.0;
                                    if(!hftp3.b_message.isImmutable()) {
                                        hftp3.ensureMutable();
                                    }
                                    gwva gwva1 = (gwva)hftp3.b_message;
                                    gwva1.b |= 8;
                                    gwva1.f = (int)f1;
                                    double f2 = responderLocation0.getLongitude() * 10000000.0;
                                    if(!hftp3.b_message.isImmutable()) {
                                        hftp3.ensureMutable();
                                    }
                                    gwva gwva2 = (gwva)hftp3.b_message;
                                    gwva2.b |= 16;
                                    gwva2.g = (int)f2;
                                    double f3 = responderLocation0.getLongitudeUncertainty() * 10000000.0;
                                    if(!hftp3.b_message.isImmutable()) {
                                        hftp3.ensureMutable();
                                    }
                                    gwva gwva3 = (gwva)hftp3.b_message;
                                    gwva3.b |= 0x20;
                                    gwva3.h = (int)f3;
                                    int v19 = responderLocation0.getDatum();
                                    if(!hftp3.b_message.isImmutable()) {
                                        hftp3.ensureMutable();
                                    }
                                    gwva gwva4 = (gwva)hftp3.b_message;
                                    gwva4.b |= 0x40;
                                    gwva4.i = v19;
                                    if(responderLocation0.getAltitudeType() == 1) {
                                        float f4 = (float)responderLocation0.getAltitude();
                                        if(!hftp3.b_message.isImmutable()) {
                                            hftp3.ensureMutable();
                                        }
                                        gwva gwva5 = (gwva)hftp3.b_message;
                                        gwva5.b |= 1;
                                        gwva5.c = f4;
                                        double f5 = responderLocation0.getAltitudeUncertainty() * 1000.0;
                                        if(!hftp3.b_message.isImmutable()) {
                                            hftp3.ensureMutable();
                                        }
                                        gwva gwva6 = (gwva)hftp3.b_message;
                                        gwva6.b |= 2;
                                        gwva6.d = (int)f5;
                                    }
                                    if(responderLocation0.isZaxisSubelementValid()) {
                                        int v20 = responderLocation0.getExpectedToMove();
                                        if(!hftp3.b_message.isImmutable()) {
                                            hftp3.ensureMutable();
                                        }
                                        gwva gwva7 = (gwva)hftp3.b_message;
                                        gwva7.b |= 0x80;
                                        gwva7.j = v20;
                                        float f6 = (float)responderLocation0.getFloorNumber();
                                        if(!hftp3.b_message.isImmutable()) {
                                            hftp3.ensureMutable();
                                        }
                                        gwva gwva8 = (gwva)hftp3.b_message;
                                        gwva8.b |= 0x100;
                                        gwva8.k = f6;
                                        float f7 = (float)responderLocation0.getHeightAboveFloorMeters();
                                        if(!hftp3.b_message.isImmutable()) {
                                            hftp3.ensureMutable();
                                        }
                                        gwva gwva9 = (gwva)hftp3.b_message;
                                        gwva9.b |= 0x200;
                                        gwva9.l = f7;
                                        float f8 = (float)responderLocation0.getHeightAboveFloorUncertaintyMeters();
                                        if(!hftp3.b_message.isImmutable()) {
                                            hftp3.ensureMutable();
                                        }
                                        gwva gwva10 = (gwva)hftp3.b_message;
                                        gwva10.b |= 0x400;
                                        gwva10.m = f8;
                                    }
                                    gwva gwva11 = (gwva)hftp3.N_build();
                                    if(!hftp0.b_message.isImmutable()) {
                                        hftp0.ensureMutable();
                                    }
                                    gwvc gwvc6 = (gwvc)hftp0.b_message;
                                    gwva11.getClass();
                                    gwvc6.l = gwva11;
                                    gwvc6.b |= 0x40000;
                                }
                            }
                        }
                        gwvd0.a(((gwvc)hftp0.N_build()));
                        this.Q.add(Long.valueOf(v5));
                    }
                }
                gwuu gwuu0 = this.b;
                gwve gwve2 = (gwve)((ProtoLiteBuilder)gwvd0).N_build();
                if(!gwuu0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)gwuu0).ensureMutable();
                }
                gwuv gwuv0 = (gwuv)gwuu0.b_message;
                gwve2.getClass();
                hfuo hfuo1 = gwuv0.i;
                if(!hfuo1.c()) {
                    gwuv0.i = ProtoLiteMessage.E(hfuo1);
                }
                gwuv0.i.add(gwve2);
                this.I();
            }
        }
    }

    @Override  // fvnn
    public final void y() {
        synchronized(this) {
            if(this.C) {
                return;
            }
            this.C = true;
            this.f();
            this.z(true);
            this.Q = new HashSet();
            fvma.a(this.h, 999, this.j.a);
        }
    }

    public final void z(boolean z) {
        ProtoLiteBuilder hftp1;
        synchronized(this) {
            String s = this.R;
            if(s == null) {
                String s1 = huvd.g();
                s = s1.length() <= 0 ? "@" + UUID.randomUUID() : "@" + s1 + "-" + UUID.randomUUID();
                this.R = s;
            }
            this.D = this.G();
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gwvj.a).v_newBuilder();
            long v1 = this.D;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp0.b_message;
            ((gwvj)hftv0).b |= 1;
            ((gwvj)hftv0).c = v1;
            if(!hftv0.isImmutable()) {
                hftp0.ensureMutable();
            }
            gwvj gwvj0 = (gwvj)hftp0.b_message;
            s.getClass();
            gwvj0.b |= 2;
            gwvj0.d = s;
            long v2 = this.q.g() + this.d;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv1 = hftp0.b_message;
            ((gwvj)hftv1).b |= 8;
            ((gwvj)hftv1).f = v2;
            if(z) {
                if(!hftv1.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gwvj gwvj1 = (gwvj)hftp0.b_message;
                gwvj1.b |= 4;
                gwvj1.e = 0;
                int v3 = ((gwvi)this.a.b_message).f.size();
                if(v3 > 0) {
                    gwtl gwtl0 = (gwtl)((gwvi)this.a.b_message).f.get(v3 - 1);
                    fvms fvms0 = this.s;
                    if(fvms0.a > 0) {
                        hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)gwtl0).jf(5, null);
                        hftp1.X(((ProtoLiteMessage)gwtl0));
                        int v4 = fvms0.a;
                        if(!hftp1.b_message.isImmutable()) {
                            hftp1.ensureMutable();
                        }
                        gwtl gwtl1 = (gwtl)hftp1.b_message;
                        gwtl1.b |= 0x2000;
                        gwtl1.l = v4;
                    }
                    else {
                        hftp1 = null;
                    }
                    fvms fvms1 = this.t;
                    if(fvms1.a > 0) {
                        if(hftp1 == null) {
                            hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)gwtl0).jf(5, null);
                            hftp1.X(((ProtoLiteMessage)gwtl0));
                        }
                        int v5 = fvms1.a;
                        if(!hftp1.b_message.isImmutable()) {
                            hftp1.ensureMutable();
                        }
                        gwtl gwtl2 = (gwtl)hftp1.b_message;
                        gwtl2.b |= 0x4000;
                        gwtl2.m = v5;
                    }
                    if(hftp1 != null) {
                        gwvh gwvh0 = this.a;
                        gwtl gwtl3 = (gwtl)hftp1.N_build();
                        if(!gwvh0.b_message.isImmutable()) {
                            ((ProtoLiteBuilder)gwvh0).ensureMutable();
                        }
                        gwvi gwvi0 = (gwvi)gwvh0.b_message;
                        gwtl3.getClass();
                        gwvi0.c();
                        gwvi0.f.set(v3 - 1, gwtl3);
                    }
                }
                this.N = 0L;
            }
            else {
                int v6 = this.M;
                if(!hftv1.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gwvj gwvj2 = (gwvj)hftp0.b_message;
                gwvj2.b |= 4;
                gwvj2.e = v6;
                ++this.M;
            }
            fvnq fvnq0 = this.i;
            fvnq0.f(this.a, hftp0);
            if(z) {
                fvnq0.e();
            }
        }
    }
}

