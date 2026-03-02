import android.content.Context;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Trace;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.gms.smartdevice.d2d.AuthenticatingUser;
import com.google.android.gms.smartdevice.setup.auth.ContinueSessionRequest;
import com.google.android.gms.smartdevice.setup.auth.ContinueSessionResponse;
import com.google.android.gms.smartdevice.setup.auth.GetChallengeRequest;
import com.google.android.gms.smartdevice.setup.auth.GetChallengeResponse;
import com.google.android.gms.smartdevice.setup.auth.SecondDeviceAuthRpcController.1;
import com.google.android.gms.smartdevice.setup.auth.StartSessionRequest;
import com.google.android.gms.smartdevice.setup.auth.StartSessionResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public final class erhr {
    public static final erqc a;
    public final Context b;
    private static final IntentFilter c;
    private final eqtq d;
    private final eqmd e;
    private bhnd f;
    private final eqrf g;
    private String h;
    private String i;
    private final Handler j;
    private gmce k;

    static {
        erhr.a = new erqc(new String[]{"setup", "SecondDeviceAuthRpcController"});
        erhr.c = new IntentFilter("com.google.android.checkin.CHECKIN_COMPLETE");
    }

    public erhr(Context context0, eqmd eqmd0) {
        eqtq eqtq0 = hyhp.j() ? new eqto(context0) : new eqtq(context0);
        gmce gmce0 = new gmce(new erhp(context0));
        eqrf eqrf0 = hyhp.k() ? new eqrf(context0) : null;
        super();
        this.b = context0;
        this.d = eqtq0;
        HandlerThread handlerThread0 = new HandlerThread("SecondDeviceAuthRpcController", 10);
        handlerThread0.start();
        clht clht0 = new clht(handlerThread0.getLooper());
        this.j = clht0;
        this.k = gmce0;
        clht0.post(gmce0);
        this.e = eqmd0;
        this.g = eqrf0;
    }

    public final GetChallengeResponse a(GetChallengeRequest getChallengeRequest0) {
        gsco gsco0;
        String s1;
        erqc erqc0 = erhr.a;
        erqc0.d("getChallenge().", new Object[0]);
        oyn.a("SecondDeviceAuthRpcController-getChallenge");
        this.i = Long.toHexString(bbmq.d(this.b));
        String s = Long.toString(System.currentTimeMillis());
        if(this.k.isDone()) {
            bhnd bhnd0 = this.e();
            this.f = bhnd0;
            if(bhnd0 != null && !bhnd0.b()) {
                this.f.close();
                erqc0.d("Initialize DroidGuardHandle in background.", new Object[0]);
                gmce gmce0 = new gmce(new erho(this));
                this.k = gmce0;
                this.j.post(gmce0);
                s1 = "emptyDroidGuardResponse";
            }
            else if(this.f == null) {
                s1 = "emptyDroidGuardResponse";
            }
            else {
                s1 = this.f(this.i, s);
                if(TextUtils.isEmpty(s1)) {
                    s1 = "emptyDroidGuardResponse";
                }
            }
        }
        else {
            s1 = "emptyDroidGuardResponse";
        }
        getChallengeRequest0.a = this.i;
        getChallengeRequest0.b = s;
        getChallengeRequest0.c = s1;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gqom.a).v_newBuilder();
        String s2 = getChallengeRequest0.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        s2.getClass();
        ((gqom)hftv0).b |= 2;
        ((gqom)hftv0).d = s2;
        String s3 = getChallengeRequest0.b;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        s3.getClass();
        ((gqom)hftv1).b |= 4;
        ((gqom)hftv1).e = s3;
        String s4 = getChallengeRequest0.c;
        if(!hftv1.isImmutable()) {
            hftp0.ensureMutable();
        }
        gqom gqom0 = (gqom)hftp0.b_message;
        s4.getClass();
        gqom0.b |= 1;
        gqom0.c = s4;
        gqom gqom1 = (gqom)hftp0.N_build();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gscn.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gscn gscn0 = (gscn)hftp1.b_message;
        gqom1.getClass();
        gscn0.c = gqom1;
        gscn0.b |= 1;
        gscn gscn1 = (gscn)hftp1.N_build();
        int v = 10750;
        int v1 = 0;
        int v2 = 0;
        int v3 = 10750;
        while(true) {
            gsco0 = null;
            if(Long.compare(v1, hyhp.d()) < 0) {
                ++v1;
                erqc0.d("execute GetChallenge(), attempt #" + v1, new Object[0]);
                try {
                    gsco0 = this.d.b(gscn1);
                }
                catch(acse acse0) {
                    erhr.a.l(acse0);
                    v = 0x2A04;
                    break;
                }
                catch(iapl iapl0) {
                    erqc erqc1 = erhr.a;
                    erqc1.n("Failed to get challenge. StatusCode=" + iapl0.a, iapl0, new Object[0]);
                    iaph iaph0 = iapl0.a.t;
                    if(iaph0 == iaph.e) {
                        v3 = 0x2A05;
                    }
                    else {
                        if(iaph0 != iaph.o) {
                            break;
                        }
                        eqsh.r(hyhp.e(), ((float)hyhp.b()), v2, erqc1);
                        v3 = 10760;
                        ++v2;
                    }
                    continue;
                }
            }
            v = v3;
            break;
        }
        Trace.endSection();
        eqmd eqmd0 = this.e;
        if(eqmd0 != null) {
            eqmd0.d(v1);
        }
        eqrf eqrf0 = this.g;
        if(eqrf0 != null) {
            erou erou0 = new erou(v1);
            eqrf0.b(eqrf0.b.a.b(erou0, gmap.a));
        }
        if(gsco0 == null) {
            throw new erhq(v);
        }
        if(((gsco0.c == null ? gqoh.a : gsco0.c).b & 1) != 0) {
            return new GetChallengeResponse((gsco0.c == null ? gqoh.a : gsco0.c).c.toByteArray());
        }
        erhr.a.f("getChallenge response does not contain any challenge data", new Object[0]);
        throw new erhq(0x29FF);
    }

    public final List b(List list0) {
        gscm gscm0;
        List list1 = new ArrayList();
        ArrayList arrayList0 = new ArrayList();
        oyn.a("SecondDeviceAuthRpcController-continueSession");
        int v = 0x2A03;
        for(Object object0: list0) {
            ContinueSessionRequest continueSessionRequest0 = (ContinueSessionRequest)object0;
            int v1 = 0;
            int v2 = 0;
            int v3 = 0;
            while(true) {
                gscm0 = null;
                if(Long.compare(v2, hyhp.d()) >= 0) {
                    break;
                }
                ++v2;
                erhr.a.d("execute continueSession(), attempt #" + v2, new Object[0]);
                try {
                    eqtq eqtq0 = this.d;
                    ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gscl.a).v_newBuilder();
                    String s = continueSessionRequest0.a;
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ProtoLiteMessage hftv0 = hftp0.b_message;
                    s.getClass();
                    ((gscl)hftv0).b = s;
                    String s1 = continueSessionRequest0.b;
                    if(!hftv0.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    gscl gscl0 = (gscl)hftp0.b_message;
                    s1.getClass();
                    gscl0.c = s1;
                    gscm0 = eqtq0.a(((gscl)hftp0.N_build()));
                }
                catch(acse acse0) {
                    erhr.a.l(acse0);
                    v = 0x2A04;
                }
                catch(iapl unused_ex) {
                    v = 0x2A03;
                    erqc erqc0 = erhr.a;
                    erqc0.l(iapl0);
                    iaph iaph0 = iapl0.a.t;
                    if(iaph0 == iaph.e) {
                        v = 0x2A07;
                        continue;
                    }
                    if(iaph0 == iaph.o) {
                        eqsh.r(hyhp.e(), ((float)hyhp.b()), v3, erqc0);
                        v = 0x2A0A;
                        ++v3;
                        continue;
                    }
                }
                break;
            }
            if(gscm0 != null) {
                int v4 = gscm0.c;
                if(gqoq.b(v4) == 2) {
                    erhr.a.m("Server returned continueSessionResponse with unknown status, session ID: " + continueSessionRequest0.a, new Object[0]);
                }
                else {
                    int v5 = gqoq.a((gqoq.b(v4) == 0 ? 1 : gqoq.b(v4)));
                    switch(gscm0.f) {
                        case 0: {
                            v1 = 2;
                            break;
                        }
                        case 1: {
                            v1 = 3;
                            break;
                        }
                        case 2: {
                            v1 = 4;
                            break;
                        }
                        case 3: {
                            v1 = 5;
                            break;
                        }
                        case 4: {
                            v1 = 6;
                            break;
                        }
                        case 5: {
                            v1 = 7;
                            break;
                        }
                        case 6: {
                            v1 = 8;
                            break;
                        }
                        case 7: {
                            v1 = 9;
                            break;
                        }
                        case 8: {
                            v1 = 10;
                            break;
                        }
                        case 9: {
                            v1 = 11;
                            break;
                        }
                        case 10: {
                            v1 = 12;
                            break;
                        }
                        case 11: {
                            v1 = 13;
                        }
                    }
                    if(v1 == 0) {
                        v1 = 1;
                    }
                    if(v1 == 1) {
                        throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
                    }
                    list1.add(new ContinueSessionResponse(v5, v1 - 2, (gscm0.d == null ? gsck.a : gscm0.d).b, gscm0.e));
                }
            }
            arrayList0.add(Integer.valueOf(v2));
        }
        Trace.endSection();
        eqmd eqmd0 = this.e;
        if(eqmd0 != null) {
            eqmd0.c(arrayList0);
        }
        eqrf eqrf0 = this.g;
        if(eqrf0 != null) {
            erov erov0 = new erov(arrayList0);
            eqrf0.b(eqrf0.b.a.b(erov0, gmap.a));
        }
        if(!list1.isEmpty()) {
            return list1;
        }
        throw new erhq(v);
    }

    public final List c(List list0) {
        gscr gscr0;
        int v9;
        gqom gqom0;
        String s5;
        ProtoLiteBuilder hftp2;
        int v8;
        gqon gqon2;
        gqon gqon0;
        int v6;
        ProtoLiteBuilder hftp1;
        gqog gqog5;
        gqog gqog3;
        ByteString hfsf2;
        int v5;
        Iterator iterator2;
        gqog gqog0;
        String s3;
        ProtoLiteBuilder hftp0;
        String s2;
        erqc erqc0 = erhr.a;
        erqc0.d("startSession().", new Object[0]);
        if(this.i == null) {
            this.i = Long.toHexString(bbmq.d(this.b));
        }
        if(((StartSessionRequest)list0.get(0)).l || erhr.g(this.b)) {
            if(this.i.equals("0")) {
                erqc0.d("blockWaitingCheckin.", new Object[0]);
                CountDownLatch countDownLatch0 = new CountDownLatch(1);
                SecondDeviceAuthRpcController.1 secondDeviceAuthRpcController$10 = new SecondDeviceAuthRpcController.1(this, countDownLatch0);
                IntentFilter intentFilter0 = new IntentFilter(erhr.c);
                jwe.c(this.b, secondDeviceAuthRpcController$10, intentFilter0, null, null, 2);
                avqq avqq0 = new avqq(this.b, this);
                avqq0.b();
                Bundle bundle0 = avqq0.a();
                avrl avrl0 = new avrl(this.b);
                int v = 0;
                long v1 = 0L;
                while(((long)v) < hyhp.a.g().i()) {
                    avrl0.d(bundle0);
                    try {
                        countDownLatch0.await((hyhp.j() ? 1L : 60L), TimeUnit.SECONDS);
                    }
                    catch(InterruptedException interruptedException0) {
                        erhr.a.l(interruptedException0);
                        ++v;
                        continue;
                    }
                    v1 = bbmq.d(this.b);
                    if(v1 != 0L) {
                        break;
                    }
                    ++v;
                }
                this.b.unregisterReceiver(secondDeviceAuthRpcController$10);
                if(v1 == 0L) {
                    throw new erhq(0x2A0B);
                }
                this.i = Long.toHexString(v1);
            }
            erhr.a.d("Fetching device data version info.", new Object[0]);
            try {
                this.h = avqz.b(this.b);
            }
            catch(IOException | azqi | azqj exception0) {
                erhr.a.l(exception0);
            }
        }
        String s = Long.toString(System.currentTimeMillis());
        bhnd bhnd0 = this.e();
        this.f = bhnd0;
        if(bhnd0 != null && !bhnd0.b()) {
            this.f.close();
            erhr.a.m("DroidGuardHandle is invalid, re-initializing it.", new Object[0]);
            this.f = bhnc.a(this.b, "smartsetup_2");
        }
        String s1 = this.f(this.i, s);
        if(TextUtils.isEmpty(s1)) {
            throw new erhq(0x2A01);
        }
        for(Object object0: list0) {
            ((StartSessionRequest)object0).j = this.i;
            ((StartSessionRequest)object0).k = s;
            ((StartSessionRequest)object0).a = s1;
        }
        List list1 = new ArrayList();
        ArrayList arrayList0 = new ArrayList();
        oyn.a("SecondDeviceAuthRpcController-startSession");
        int v2 = 0x2A00;
        Iterator iterator1 = list0.iterator();
        while(iterator1.hasNext()) {
            Object object1 = iterator1.next();
            StartSessionRequest startSessionRequest0 = (StartSessionRequest)object1;
            int v3 = 0;
            int v4 = 0;
            while(((long)v3) < hyhp.d()) {
                erqc erqc1 = erhr.a;
                erqc1.d("execute startSession(), attempt #" + (v3 + 1), new Object[0]);
                eqtq eqtq0 = this.d;
                Context context0 = this.b;
                try {
                    s2 = this.h;
                    hftp0 = ((ProtoLiteMessage)gqog.a).v_newBuilder();
                    s3 = startSessionRequest0.e;
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    gqog0 = (gqog)hftp0.b_message;
                    s3.getClass();
                }
                catch(acse acse0) {
                    iterator2 = iterator1;
                    v5 = v3 + 1;
                    goto label_341;
                }
                catch(iapl iapl0) {
                    iterator2 = iterator1;
                    v5 = v3 + 1;
                    goto label_345;
                }
                try {
                    gqog0.b |= 2;
                    gqog0.d = s3;
                    ByteString hfsf0 = ByteString.copyFrom(startSessionRequest0.f);
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    gqog gqog1 = (gqog)hftp0.b_message;
                    gqog1.b |= 4;
                    gqog1.e = hfsf0;
                    ByteString hfsf1 = ByteString.copyFrom(startSessionRequest0.g);
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    gqog gqog2 = (gqog)hftp0.b_message;
                    gqog2.b |= 8;
                    gqog2.f = hfsf1;
                    hfsf2 = ByteString.copyFrom(startSessionRequest0.h);
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ProtoLiteMessage hftv0 = hftp0.b_message;
                    gqog3 = (gqog)hftv0;
                    iterator2 = iterator1;
                }
                catch(acse acse0) {
                    iterator2 = iterator1;
                    v5 = v3 + 1;
                    goto label_341;
                }
                catch(iapl iapl0) {
                    iterator2 = iterator1;
                    v5 = v3 + 1;
                    goto label_345;
                }
                try {
                    gqog3.b |= 16;
                    gqog3.g = hfsf2;
                    String s4 = startSessionRequest0.c;
                    if(!hftv0.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    gqog gqog4 = (gqog)hftp0.b_message;
                    s4.getClass();
                    gqog4.b |= 1;
                    gqog4.c = s4;
                    gqog5 = (gqog)hftp0.N_build();
                    hftp1 = ((ProtoLiteMessage)gqon.a).v_newBuilder();
                    v6 = gqop.a(startSessionRequest0.d);
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    ProtoLiteMessage hftv1 = hftp1.b_message;
                    gqon0 = (gqon)hftv1;
                    goto label_136;
                }
                catch(acse acse0) {
                    v5 = v3 + 1;
                    goto label_341;
                }
                catch(iapl iapl0) {
                }
                v5 = v3 + 1;
                goto label_345;
            label_136:
                if(v6 == 1) {
                    try {
                        v5 = v3 + 1;
                        throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
                    }
                    catch(acse acse0) {
                        goto label_341;
                    }
                    catch(iapl iapl0) {
                        goto label_345;
                    }
                }
                try {
                    gqon0.c = v6 - 2;
                    gqon0.b |= 1;
                    if(!hftv1.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    gqon gqon1 = (gqon)hftp1.b_message;
                    gqog5.getClass();
                    gqon1.d = gqog5;
                    gqon1.b |= 2;
                    gqon2 = (gqon)hftp1.N_build();
                    int v7 = startSessionRequest0.i;
                    if(v7 == 1) {
                        v8 = 3;
                    }
                    else {
                        v8 = v7 == 2 ? 4 : 2;
                    }
                    hftp2 = ((ProtoLiteMessage)gqom.a).v_newBuilder();
                    s5 = startSessionRequest0.j;
                    if(!hftp2.b_message.isImmutable()) {
                        hftp2.ensureMutable();
                    }
                    ProtoLiteMessage hftv2 = hftp2.b_message;
                    gqom0 = (gqom)hftv2;
                    s5.getClass();
                    v5 = v3 + 1;
                    goto label_168;
                }
                catch(acse acse0) {
                }
                catch(iapl iapl0) {
                    v5 = v3 + 1;
                    goto label_345;
                }
                try {
                    v5 = v3 + 1;
                    goto label_341;
                label_168:
                    gqom0.b |= 2;
                    gqom0.d = s5;
                    String s6 = startSessionRequest0.k;
                    if(!hftv2.isImmutable()) {
                        hftp2.ensureMutable();
                    }
                    ProtoLiteMessage hftv3 = hftp2.b_message;
                    s6.getClass();
                    ((gqom)hftv3).b |= 4;
                    ((gqom)hftv3).e = s6;
                    String s7 = startSessionRequest0.a;
                    if(!hftv3.isImmutable()) {
                        hftp2.ensureMutable();
                    }
                    gqom gqom1 = (gqom)hftp2.b_message;
                    s7.getClass();
                    gqom1.b |= 1;
                    gqom1.c = s7;
                    gqom gqom2 = (gqom)hftp2.N_build();
                    ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)gscq.a).v_newBuilder();
                    if(!hftp3.b_message.isImmutable()) {
                        hftp3.ensureMutable();
                    }
                    ProtoLiteMessage hftv4 = hftp3.b_message;
                    gqom2.getClass();
                    ((gscq)hftv4).d = gqom2;
                    ((gscq)hftv4).b |= 2;
                    if(!hftv4.isImmutable()) {
                        hftp3.ensureMutable();
                    }
                    gscq gscq0 = (gscq)hftp3.b_message;
                    gqon2.getClass();
                    gscq0.c = gqon2;
                    gscq0.b |= 1;
                    ProtoLiteBuilder hftp4 = ((ProtoLiteMessage)gscp.a).v_newBuilder();
                    switch(startSessionRequest0.b) {
                        case 0: {
                            v9 = 2;
                            break;
                        }
                        case 1: {
                            v9 = 3;
                            break;
                        }
                        case 2: {
                            v9 = 4;
                            break;
                        }
                        case 3: {
                            v9 = 5;
                            break;
                        }
                        default: {
                            v9 = 0;
                        }
                    }
                    if(!hftp4.b_message.isImmutable()) {
                        hftp4.ensureMutable();
                    }
                    ((gscp)hftp4.b_message).b = v9 - 2;
                    gscp gscp0 = (gscp)hftp4.N_build();
                    if(!hftp3.b_message.isImmutable()) {
                        hftp3.ensureMutable();
                    }
                    gscq gscq1 = (gscq)hftp3.b_message;
                    gscp0.getClass();
                    gscq1.e = gscp0;
                    gscq1.b |= 4;
                    ProtoLiteBuilder hftp5 = ((ProtoLiteMessage)gqor.a).v_newBuilder();
                    if(!hftp5.b_message.isImmutable()) {
                        hftp5.ensureMutable();
                    }
                    ((gqor)hftp5.b_message).c = v8 - 2;
                    ((gqor)hftp5.b_message).b |= 1;
                    gqor gqor0 = (gqor)hftp5.N_build();
                    if(!hftp3.b_message.isImmutable()) {
                        hftp3.ensureMutable();
                    }
                    gscq gscq2 = (gscq)hftp3.b_message;
                    gqor0.getClass();
                    gscq2.f = gqor0;
                    gscq2.b |= 8;
                    ProtoLiteBuilder hftp6 = ((ProtoLiteMessage)gqos.a).v_newBuilder();
                    if(!hftp6.b_message.isImmutable()) {
                        hftp6.ensureMutable();
                    }
                    ((gqos)hftp6.b_message).e = 1;
                    ((gqos)hftp6.b_message).b |= 1;
                    int v10 = bbnp.k(context0) ? 4 : 2;
                    if(!hftp6.b_message.isImmutable()) {
                        hftp6.ensureMutable();
                    }
                    ((gqos)hftp6.b_message).f = v10 - 2;
                    ((gqos)hftp6.b_message).b |= 2;
                    ProtoLiteBuilder hftp7 = ((ProtoLiteMessage)gqof.a).v_newBuilder();
                    if(s2 != null) {
                        if(!hftp7.b_message.isImmutable()) {
                            hftp7.ensureMutable();
                        }
                        gqof gqof0 = (gqof)hftp7.b_message;
                        gqof0.b |= 1;
                        gqof0.c = s2;
                    }
                    if(bbnp.c(context0)) {
                        if(!hftp7.b_message.isImmutable()) {
                            hftp7.ensureMutable();
                        }
                        gqof gqof1 = (gqof)hftp7.b_message;
                        gqof1.b |= 2;
                        gqof1.d = 2;
                    }
                    if(eqsh.s(context0) && (startSessionRequest0.l || erhr.g(context0))) {
                        erqc1.d("Setting additional fields for Unicorn.", new Object[0]);
                        boolean z = eqwf.a(context0).c();
                        if(!hftp7.b_message.isImmutable()) {
                            hftp7.ensureMutable();
                        }
                        gqof gqof2 = (gqof)hftp7.b_message;
                        gqof2.b |= 16;
                        gqof2.g = z;
                        boolean z1 = bbmn.s(context0);
                        if(!hftp7.b_message.isImmutable()) {
                            hftp7.ensureMutable();
                        }
                        gqof gqof3 = (gqof)hftp7.b_message;
                        gqof3.b |= 4;
                        gqof3.e = z1;
                        int v11 = eqsh.w(context0) ^ 1;
                        if(!hftp7.b_message.isImmutable()) {
                            hftp7.ensureMutable();
                        }
                        gqof gqof4 = (gqof)hftp7.b_message;
                        gqof4.b |= 8;
                        gqof4.f = v11;
                        long v12 = (long)azqk.a(context0);
                        if(!hftp7.b_message.isImmutable()) {
                            hftp7.ensureMutable();
                        }
                        gqof gqof5 = (gqof)hftp7.b_message;
                        gqof5.b |= 0x20;
                        gqof5.h = v12;
                    }
                    gqof gqof6 = (gqof)hftp7.N_build();
                    if(!hftp6.b_message.isImmutable()) {
                        hftp6.ensureMutable();
                    }
                    gqos gqos0 = (gqos)hftp6.b_message;
                    gqof6.getClass();
                    gqos0.d = gqof6;
                    gqos0.c = 1;
                    gqos gqos1 = (gqos)hftp6.N_build();
                    if(!hftp3.b_message.isImmutable()) {
                        hftp3.ensureMutable();
                    }
                    gscq gscq3 = (gscq)hftp3.b_message;
                    gqos1.getClass();
                    gscq3.g = gqos1;
                    gscq3.b |= 16;
                    AuthenticatingUser authenticatingUser0 = startSessionRequest0.m;
                    if(authenticatingUser0 != null) {
                        if(authenticatingUser0.b == null) {
                            if(authenticatingUser0.c == null) {
                                throw new erhq(0x2A10);
                            }
                            erqc1.j("Setting authenticating user (email) for start session request.", new Object[0]);
                            ProtoLiteBuilder hftp8 = ((ProtoLiteMessage)gqot.a).v_newBuilder();
                            String s8 = authenticatingUser0.c;
                            if(!hftp8.b_message.isImmutable()) {
                                hftp8.ensureMutable();
                            }
                            gqot gqot0 = (gqot)hftp8.b_message;
                            s8.getClass();
                            gqot0.b = 2;
                            gqot0.c = s8;
                            if(!hftp3.b_message.isImmutable()) {
                                hftp3.ensureMutable();
                            }
                            gscq gscq4 = (gscq)hftp3.b_message;
                            gqot gqot1 = (gqot)hftp8.N_build();
                            gqot1.getClass();
                            gscq4.h = gqot1;
                            gscq4.b |= 0x20;
                        }
                        else {
                            erqc1.j("Setting authenticating user (gaia id) for start session request.", new Object[0]);
                            ProtoLiteBuilder hftp9 = ((ProtoLiteMessage)gqot.a).v_newBuilder();
                            String s9 = authenticatingUser0.b;
                            if(!hftp9.b_message.isImmutable()) {
                                hftp9.ensureMutable();
                            }
                            gqot gqot2 = (gqot)hftp9.b_message;
                            s9.getClass();
                            gqot2.b = 1;
                            gqot2.c = s9;
                            if(!hftp3.b_message.isImmutable()) {
                                hftp3.ensureMutable();
                            }
                            gscq gscq5 = (gscq)hftp3.b_message;
                            gqot gqot3 = (gqot)hftp9.N_build();
                            gqot3.getClass();
                            gscq5.h = gqot3;
                            gscq5.b |= 0x20;
                        }
                    }
                    gscr0 = eqtq0.c(((gscq)hftp3.N_build()));
                    v3 = v5;
                    goto label_363;
                }
                catch(acse acse0) {
                }
                catch(iapl iapl0) {
                    goto label_345;
                }
            label_341:
                erhr.a.l(acse0);
                v2 = 0x2A04;
                v3 = v5;
                goto label_362;
            label_345:
                erqc erqc2 = erhr.a;
                erqc2.n("Failed to start session. StatusCode=" + iapl0.a, iapl0, new Object[0]);
                iaph iaph0 = iapl0.a.t;
                if(iaph0 == iaph.e) {
                    v2 = 0x2A06;
                    iterator1 = iterator2;
                    v3 = v5;
                    continue;
                }
                if(iaph0 == iaph.o) {
                    eqsh.r(hyhp.e(), ((float)hyhp.b()), v4, erqc2);
                    v2 = 0x2A09;
                    ++v4;
                    iterator1 = iterator2;
                    v3 = v5;
                    continue;
                }
                v3 = v5;
                v2 = 0x2A00;
                goto label_362;
            }
            iterator2 = iterator1;
        label_362:
            gscr0 = null;
        label_363:
            if(gscr0 != null) {
                if(gqoq.b(gscr0.b) == 2) {
                    erhr.a.m("Server returned startSessionResponse with unknown status. SessionId: " + gscr0.e, new Object[0]);
                }
                else {
                    StartSessionResponse startSessionResponse0 = new StartSessionResponse();
                    int v13 = gqoq.a((gqoq.b(gscr0.b) == 0 ? 1 : gqoq.b(gscr0.b)));
                    startSessionResponse0.a.add(Integer.valueOf(2));
                    startSessionResponse0.b = v13;
                    startSessionResponse0.q(gscr0.e);
                    String s10 = (gscr0.c == null ? gsck.a : gscr0.c).b;
                    startSessionResponse0.a.add(Integer.valueOf(4));
                    startSessionResponse0.d = s10;
                    int v14 = gscr0.h;
                    startSessionResponse0.a.add(Integer.valueOf(3));
                    startSessionResponse0.c = v14;
                    String s11 = gscr0.d;
                    startSessionResponse0.a.add(Integer.valueOf(5));
                    startSessionResponse0.e = s11;
                    String s12 = gscr0.f;
                    startSessionResponse0.a.add(Integer.valueOf(7));
                    startSessionResponse0.g = s12;
                    startSessionResponse0.p(gscr0.g);
                    list1.add(startSessionResponse0);
                }
            }
            arrayList0.add(Integer.valueOf(v3));
            iterator1 = iterator2;
        }
        Trace.endSection();
        eqmd eqmd0 = this.e;
        if(eqmd0 != null) {
            eqmd0.e(arrayList0);
        }
        eqrf eqrf0 = this.g;
        if(eqrf0 != null) {
            erox erox0 = new erox(arrayList0);
            eqrf0.b(eqrf0.b.a.b(erox0, gmap.a));
        }
        if(!list1.isEmpty()) {
            return list1;
        }
        throw new erhq(v2);
    }

    public final void d() {
        this.d.d();
        bhnd bhnd0 = this.f;
        if(bhnd0 != null) {
            bhnd0.close();
        }
    }

    private final bhnd e() {
        bhnd bhnd0;
        erhr.a.d("Getting DroidGuard handle.", new Object[0]);
        try {
            bhnd0 = (bhnd)this.k.get();
        }
        catch(ExecutionException | InterruptedException exception0) {
            erhr.a.n("Could not get DroidGuardHandle.", exception0, new Object[0]);
            bhnd0 = null;
        }
        finally {
            Trace.endSection();
        }
        return bhnd0;
    }

    private final String f(String s, String s1) {
        byte[] arr_b = bbmq.aa(String.format("%s:%s", s, s1), "SHA-1");
        if(this.f != null && this.f.b()) {
            if(arr_b == null) {
                erhr.a.f("Failed to create hash for DroidGuard", new Object[0]);
                return null;
            }
            return this.f.a(Collections.singletonMap("dg_smartsetup_2", Base64.encodeToString(arr_b, 2)));
        }
        erhr.a.f("DroidGuardHandle is null or invalid", new Object[0]);
        return null;
    }

    private static boolean g(Context context0) {
        return hyhp.a.g().o() ? bbnp.k(context0) || bbnp.n(context0) : false;
    }
}

