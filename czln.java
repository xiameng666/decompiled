import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.nfc.Tag;
import android.nfc.tech.IsoDep;
import com.google.android.gms.nearby.mediums.NearFieldCommunication.1;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class czln {
    public final Map a;
    private final Context b;
    private final Set c;
    private BroadcastReceiver d;
    private final Map e;
    private final Map f;
    private final ScheduledExecutorService g;
    private final Map h;
    private final Map i;
    private final gmcg j;

    public czln(Context context0) {
        this.c = new bxf();
        this.a = new bxd();
        this.e = new bxd();
        this.f = new bxd();
        this.g = cuui.f();
        this.h = new bxd();
        this.i = new bxd();
        this.j = cuui.d();
        this.b = context0.getApplicationContext();
    }

    public final czle a(String s, czwn czwn0, cump cump0) {
        czle czle2;
        gymd gymd0;
        synchronized(this) {
            if(!cump0.d()) {
                try {
                    czwn0.d();
                    czwk czwk0 = new czwk(czwn0);
                    czwn czwn1 = czwk0.h;
                    if(czwn1 == null) {
                        throw new IOException("Failed to connect to remote NFC device, nfcDevice is not available.");
                    }
                    if(!czwn1.b(new czwg((byte)0x80, 2, 0, 0, s.getBytes(), 0)).d()) {
                        return new czle(czwk0, gyxo.b);
                    }
                    throw new IOException("Failed to connect to remote NFC device");
                }
                catch(IOException iOException0) {
                    if(iOException0.getMessage() == null) {
                        gymd0 = gymd.cn;
                    }
                    else if(iOException0.getMessage().contains("Connecting to this technology is not supported by the NFC adapter")) {
                        gymd0 = gymd.aA;
                    }
                    else if(iOException0.getMessage().contains("NFC service died")) {
                        gymd0 = gymd.aB;
                    }
                    else if(iOException0.getMessage().contains("Failed to bind to the remote NFC service")) {
                        gymd0 = gymd.aC;
                    }
                    else {
                        gymd0 = iOException0.getMessage().contains("Failed to connect to remote NFC device") ? gymd.aD : gymd.a;
                    }
                    czke.q(s, 8, gymb.j, gymd0, String.format("NFC device : %s", czwn0));
                    bbpb.b(czwn0);
                    return new czle(gyxo.cc);
                }
            }
            czke.o(s, 8, gylz.f);
            czle2 = new czle(gyxo.k);
        }
        return czle2;
    }

    public final void b(Runnable runnable0) {
        this.j.execute(runnable0);
    }

    // Detected as a lambda impl.
    public final void c(Tag tag0) {
        czwn czwn0;
        cuqg cuqg0;
        synchronized(this) {
            IsoDep isoDep0 = IsoDep.get(tag0);
            cuqg0 = isoDep0 == null ? null : new cuqg(isoDep0);
            if(cuqg0 == null) {
                czkq.a.b().p("Ignoring discovered NFC tag because it\'s not of type IsoDep.", new Object[0]);
                return;
            }
            goto label_7;
        }
        return;
    label_7:
        czwn0 = new czwn(cuqg0);
        try {
            try {
                czwn0.d();
                Map map0 = this.a;
                boolean z = false;
                Iterator iterator0 = map0.keySet().iterator();
                while(true) {
                    if(!iterator0.hasNext()) {
                        goto label_50;
                    }
                    Object object0 = iterator0.next();
                    String s = (String)object0;
                    if(((czlm)map0.get(s)).a.contains(czwn0)) {
                        czkq.a.d().i("Ignoring NFC tag %s. Already read advertisement for service %s.", czwn0, s);
                    }
                    else {
                        gyub gyub0 = (gyub)this.f.get(s);
                        if(gyub0 != null) {
                            czwh czwh0 = czwn0.b(new czwg((byte)0x80, 1, 0, 0, gyub0.toBytesArray(), 0xFF));
                            if(czwh0.d()) {
                                czke.q(s, 6, gymr.f, gymd.cn, String.format("NFC tag : %s", czwn0));
                                z = true;
                            }
                            else {
                                hftc hftc0 = hftc.a();
                                ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)gyua.a), czwh0.a, 0, czwh0.a.length, hftc0);
                                ProtoLiteMessage.P_makeImmutable(hftv0);
                                gyua gyua0 = (gyua)hftv0;
                                cunf cunf0 = czkq.a;
                                cunf0.d().i("Successfully read advertisement for service %s on NFC tag %s.", s, czwn0);
                                ((czlm)map0.get(s)).a.add(czwn0);
                                cvgx cvgx0 = (cvgx)this.e.get(s);
                                if(cvgx0 != null) {
                                    byte[] arr_b = gyua0.c.toByteArray();
                                    byte[] arr_b1 = (gyua0.b & 2) == 0 ? null : gyua0.d.toByteArray();
                                    byte[] arr_b2 = (gyua0.b & 4) == 0 ? null : gyua0.e.toByteArray();
                                    cvmk cvmk0 = new cvmk(cvgx0.a, czwn0, arr_b, arr_b2, arr_b1);
                                    cvgx0.a.f.W(cvmk0);
                                }
                                Map map1 = this.h;
                                if(map1.containsKey(s)) {
                                    continue;
                                }
                                map1.put(s, cumn.c(cunf0, new czlk(this, s), hvog.a.bk().bM(), this.g));
                            }
                        }
                    }
                }
            }
            catch(IOException iOException0) {
            }
            czkq.a.e().f(iOException0).p("Failed to connect to discovered NFC tag.", new Object[0]);
        }
        catch(Throwable throwable1) {
            bbpb.b(czwn0);
            throw throwable1;
        }
        bbpb.b(czwn0);
        goto label_52;
    label_50:
        bbpb.b(czwn0);
        if(z) {
        label_52:
            if(czwn0.c()) {
                czkq.a.b().h("Will try to read the NFC tag again in %d millis.", Long.valueOf(hvog.ai()));
                czli czli0 = new czli(this, tag0);
                long v = hvog.ai();
                ((cuuh)this.g).g(czli0, v, TimeUnit.MILLISECONDS);
                return;
            }
        }
        else {
            return;
        }
        czkq.a.b().p("NFC tag is lost. Discarding.", new Object[0]);
    }

    public final void d(String s, czwk czwk0) {
        synchronized(this) {
            cvfz cvfz0 = (cvfz)this.i.get(s);
            if(cvfz0 == null) {
                bbpb.b(czwk0);
                return;
            }
            cvlt cvlt0 = new cvlt(cvfz0.a, czwk0);
            cvfz0.a.d.W(cvlt0);
        }
    }

    public final void e(String s, czlm czlm0) {
        synchronized(this) {
            if(czlm0 == null) {
                czkq.a.d().p("Ignoring onLost timeout because we are no longer scanning", new Object[0]);
                return;
            }
            Set set0 = czlm0.a;
            bxe bxe0 = new bxe(new bxf(set0));
            while(bxe0.hasNext()) {
                Object object0 = bxe0.next();
                czwn czwn0 = (czwn)object0;
                if(!czwn0.c()) {
                    set0.remove(czwn0);
                    czkq.a.d().h("Lost sight of NfcDevice %s", czwn0);
                    cvgx cvgx0 = (cvgx)this.e.get(s);
                    if(cvgx0 != null) {
                        cvmj cvmj0 = new cvmj(cvgx0.a, czwn0);
                        cvgx0.a.f.W(cvmj0);
                    }
                }
            }
            if(set0.isEmpty()) {
                cumn cumn0 = (cumn)this.h.remove(s);
                if(cumn0 != null) {
                    cumn0.b();
                }
            }
        }
    }

    public final void f() {
        synchronized(this) {
            cuui.h(this.g, "NearFieldCommunication.onLostExecutor");
            cuui.h(this.j, "NearFieldCommunication.singleThreadOffloader");
            bxe bxe0 = new bxe(new bxf(this.c));
            while(bxe0.hasNext()) {
                Object object0 = bxe0.next();
                this.h(((String)object0));
            }
            bxe bxe1 = new bxe(new bxf(this.i.keySet()));
            while(bxe1.hasNext()) {
                Object object1 = bxe1.next();
                this.g(((String)object1));
            }
            bxe bxe2 = new bxe(new bxf(this.a.keySet()));
            while(bxe2.hasNext()) {
                Object object2 = bxe2.next();
                this.i(((String)object2));
            }
        }
    }

    public final void g(String s) {
        synchronized(this) {
            if(!this.j(s)) {
                return;
            }
            this.i.remove(s);
        }
    }

    public final void h(String s) {
        synchronized(this) {
            if(!this.k(s)) {
                czkq.a.b().p("Can\'t stop NFC advertising because it was never started.", new Object[0]);
                return;
            }
            czwl.b().e(s);
            this.c.remove(s);
            czkq.a.b().p("NFC advertising successfully stopped.", new Object[0]);
        }
    }

    public final void i(String s) {
        synchronized(this) {
            if(!this.m(s)) {
                czkq.a.b().p("Can\'t stop NFC discovery because it was never started.", new Object[0]);
                return;
            }
            cumn cumn0 = (cumn)this.h.remove(s);
            if(cumn0 != null) {
                cumn0.b();
            }
            this.a.remove(s);
            this.e.remove(s);
            this.f.remove(s);
            if(this.a.keySet().isEmpty()) {
                cutr.f(this.b, this.d);
                this.d = null;
            }
            czkq.a.b().p("NFC discovery successfully stopped.", new Object[0]);
        }
    }

    final boolean j(String s) {
        return this.i.containsKey(s);
    }

    final boolean k(String s) {
        return this.c.contains(s);
    }

    public final boolean l() {
        return hvol.aR() && this.n();
    }

    final boolean m(String s) {
        return this.a.containsKey(s);
    }

    public final boolean n() {
        return this.b.getPackageManager().hasSystemFeature("android.hardware.nfc") && this.b.getPackageManager().hasSystemFeature("android.hardware.nfc.hce");
    }

    public final czle o(String s, cvfz cvfz0) {
        synchronized(this) {
            if(this.j(s)) {
                czke.o(s, 4, gymt.a);
                return new czle(Boolean.valueOf(false), gyxo.aJ);
            }
            this.i.put(s, cvfz0);
        }
        return new czle(Boolean.valueOf(true), gyxo.b);
    }

    public final czle p(String s, byte[] arr_b, byte[] arr_b1, byte[] arr_b2, cvmn cvmn0) {
        boolean z = false;
        synchronized(this) {
            if(this.k(s)) {
                czke.o(s, 2, gymp.c);
                return new czle(Boolean.valueOf(false), gyxo.aX);
            }
            if(!this.l()) {
                gymd gymd0 = this.r();
                czke.p(s, 2, gylz.c, gymd0);
                return new czle(Boolean.valueOf(false), gyxo.T);
            }
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gyua.a).v_newBuilder();
            ByteString hfsf0 = ByteString.copyFrom(arr_b);
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gyua gyua0 = (gyua)hftp0.b_message;
            gyua0.b |= 1;
            gyua0.c = hfsf0;
            if(arr_b1 != null && arr_b1.length > 0) {
                ByteString hfsf1 = ByteString.copyFrom(arr_b1);
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gyua gyua1 = (gyua)hftp0.b_message;
                gyua1.b |= 2;
                gyua1.d = hfsf1;
            }
            if(arr_b2 != null && arr_b2.length > 0) {
                ByteString hfsf2 = ByteString.copyFrom(arr_b2);
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gyua gyua2 = (gyua)hftp0.b_message;
                gyua2.b |= 4;
                gyua2.e = hfsf2;
            }
            czwl.b().h(s, cvmn0, ((gyua)hftp0.N_build()), new czlh(this, s));
            this.c.add(s);
            cunf cunf0 = czkq.a.b();
            if(arr_b2 != null && arr_b2.length > 0) {
                z = true;
            }
            cunf0.h("NFC advertising successfully started, rxAdvertisement available = %s", Boolean.valueOf(z));
        }
        return new czle(Boolean.valueOf(true), gyxo.b);
    }

    public final czle q(String s, String s1, cvgx cvgx0, byte[] arr_b) {
        synchronized(this) {
            if(this.m(s)) {
                czke.o(s, 6, gymr.a);
                return new czle(Boolean.valueOf(false), gyxo.bc);
            }
            if(!this.l()) {
                gymd gymd0 = this.r();
                czke.p(s, 6, gylz.c, gymd0);
                return new czle(Boolean.valueOf(false), gyxo.T);
            }
            if(this.d == null) {
                NearFieldCommunication.1 nearFieldCommunication$10 = new NearFieldCommunication.1(this);
                this.d = nearFieldCommunication$10;
                IntentFilter intentFilter0 = new IntentFilter("android.nfc.action.TAG_DISCOVERED");
                jwe.b(this.b, nearFieldCommunication$10, intentFilter0, 2);
                if(this.d == null) {
                    return new czle(Boolean.valueOf(false), gyxo.dL);
                }
            }
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gyub.a).v_newBuilder();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp0.b_message;
            s.getClass();
            ((gyub)hftv0).b |= 1;
            ((gyub)hftv0).c = s;
            if(!hftv0.isImmutable()) {
                hftp0.ensureMutable();
            }
            gyub gyub0 = (gyub)hftp0.b_message;
            s1.getClass();
            gyub0.b |= 2;
            gyub0.d = s1;
            if(arr_b != null && arr_b.length > 0) {
                ByteString hfsf0 = ByteString.copyFrom(arr_b);
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gyub gyub1 = (gyub)hftp0.b_message;
                gyub1.b |= 4;
                gyub1.e = hfsf0;
            }
            gyub gyub2 = (gyub)hftp0.N_build();
            this.f.put(s, gyub2);
            czlm czlm0 = new czlm();
            this.a.put(s, czlm0);
            this.e.put(s, cvgx0);
            czkq.a.b().p("NFC discovery successfully started.", new Object[0]);
        }
        return new czle(Boolean.valueOf(true), gyxo.b);
    }

    private final gymd r() {
        Context context0 = this.b;
        if(!context0.getPackageManager().hasSystemFeature("android.hardware.nfc")) {
            return gymd.A;
        }
        if(!context0.getPackageManager().hasSystemFeature("android.hardware.nfc.hce")) {
            return gymd.B;
        }
        return hvol.aR() ? gymd.a : gymd.d;
    }
}

