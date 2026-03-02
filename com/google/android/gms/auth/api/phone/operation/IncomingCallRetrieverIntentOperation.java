package com.google.android.gms.auth.api.phone.operation;

import a;
import aiau;
import aiav;
import aicv;
import aicy;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.telephony.PhoneNumberRange;
import android.telephony.TelephonyManager;
import aztk;
import bbcu;
import bblp;
import bboh;
import cclw;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.auth.api.phone.IncomingCallRetrieverRequest;
import com.google.android.gms.auth.api.phone.IncomingCallRetrieverResponse;
import com.google.android.gms.chimera.modules.auth.api.phone.AppContextProvider;
import ggtj;
import ghwm;
import ghwo;
import ghwp;
import gmcg;
import hppp;
import ibns;
import ibrt;
import ibth;
import ibuq;
import ibzw;
import ibzy;
import ibzz;
import java.util.concurrent.CountDownLatch;

public final class IncomingCallRetrieverIntentOperation extends IntentOperation {
    public static final bboh a;
    public final aicy b;
    private final TelephonyManager c;
    private final ibth d;
    private final gmcg e;

    static {
        IncomingCallRetrieverIntentOperation.a = bboh.b("IncomingCallIntentOp", bbcu.gN);
    }

    public IncomingCallRetrieverIntentOperation() {
        TelephonyManager telephonyManager0 = (TelephonyManager)AppContextProvider.a().getSystemService("phone");
        aiau aiau0 = new aiau();
        this(cclw.d, telephonyManager0, aiau0);
    }

    public IncomingCallRetrieverIntentOperation(ibrt ibrt0, TelephonyManager telephonyManager0, ibth ibth0) {
        ibuq.f(ibrt0, "coroutineContext");
        ibuq.f(ibth0, "latchProvider");
        super();
        this.e = new bblp(0x7FFFFFFF, 9);
        this.b = new aicy(ibrt0);
        this.c = telephonyManager0;
        this.d = ibth0;
    }

    public static final int a(long v) {
        return (int)ibzw.j(ibzy.i(SystemClock.elapsedRealtime() - v, ibzz.c));
    }

    public static void b(String s, int v, String s1) {
        IncomingCallRetrieverIntentOperation.c(s, v, s1, null);
    }

    private static final void c(String s, int v, String s1, String s2) {
        IncomingCallRetrieverResponse incomingCallRetrieverResponse0 = new IncomingCallRetrieverResponse(s1, aztk.m(v), s2);
        Intent intent0 = new Intent("com.google.android.gms.auth.api.phone.PHONE_VERIFICATION_STATUS_INTENT_ACTION");
        intent0.putExtra("PHONE_VERIFICATION_STATUS_INTENT_EXTRA", incomingCallRetrieverResponse0);
        intent0.setPackage(s);
        AppContextProvider.a().sendBroadcast(intent0);
    }

    @Override  // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent0) {
        ibns ibns0;
        IncomingCallRetrieverRequest incomingCallRetrieverRequest0;
        ibuq.f(intent0, "intent");
        bboh bboh0 = IncomingCallRetrieverIntentOperation.a;
        ((ggtj)bboh0.h()).x("onHandleIntent called");
        String s = intent0.getStringExtra("EXTRA_CALLING_PACKAGE");
        if(s == null) {
            ((ggtj)bboh0.i()).x("Calling package absent");
            ghwp ghwp0 = aicv.d("UNKNOWN_PACKAGE", ghwo.c, ghwm.n);
            this.b.a(ghwp0);
            return;
        }
        if(hppp.d()) {
            Bundle bundle0 = intent0.getBundleExtra("EXTRA_PHONE_NUMBER_RANGE");
            if(bundle0 == null) {
                ((ggtj)bboh0.i()).x("Phone number range not provided.");
                ghwp ghwp1 = aicv.d(s, ghwo.c, ghwm.p);
                this.b.a(ghwp1);
                IncomingCallRetrieverIntentOperation.b(s, 0xCF0E, null);
                incomingCallRetrieverRequest0 = null;
            }
            else {
                String s1 = bundle0.getString("BUNDLE_KEY_COUNTRY_CODE");
                String s2 = "";
                if(s1 == null) {
                    s1 = "";
                }
                String s3 = bundle0.getString("BUNDLE_KEY_PREFIX");
                if(s3 == null) {
                    s3 = "";
                }
                String s4 = bundle0.getString("BUNDLE_KEY_START_RANGE");
                if(s4 == null) {
                    s4 = "";
                }
                String s5 = bundle0.getString("BUNDLE_KEY_END_RANGE");
                if(s5 != null) {
                    s2 = s5;
                }
                incomingCallRetrieverRequest0 = new IncomingCallRetrieverRequest(s1, s3, s4, s2);
            }
            if(incomingCallRetrieverRequest0 == null) {
                return;
            }
            TelephonyManager telephonyManager0 = this.c;
            if(telephonyManager0 == null) {
                ((ggtj)bboh0.i()).x("TelephonyManager is not available.");
                ghwp ghwp2 = aicv.d(s, ghwo.c, ghwm.d);
                this.b.a(ghwp2);
                IncomingCallRetrieverIntentOperation.b(s, 0xCF0D, null);
                return;
            }
            CountDownLatch countDownLatch0 = (CountDownLatch)this.d.a();
            long v = hppp.a.c().e() * 1000L;
            long v1 = SystemClock.elapsedRealtime();
            try {
                PhoneNumberRange phoneNumberRange0 = new PhoneNumberRange(incomingCallRetrieverRequest0.a, incomingCallRetrieverRequest0.b, incomingCallRetrieverRequest0.c, incomingCallRetrieverRequest0.d);
                ((ggtj)bboh0.h()).x("Calling Telephony API requestNumberVerification now");
                aiav aiav0 = new aiav(this, v1, s, countDownLatch0);
                telephonyManager0.requestNumberVerification(phoneNumberRange0, v, this.e, aiav0);
                ghwp ghwp3 = aicv.c(s, ghwo.g);
                this.b.a(ghwp3);
                countDownLatch0.await();
            }
            catch(Exception exception0) {
                countDownLatch0.countDown();
                int v2 = IncomingCallRetrieverIntentOperation.a(v1);
                if((exception0 instanceof InterruptedException)) {
                    ibns0 = new ibns(((int)0xCF10), ghwm.o);
                }
                else if((exception0 instanceof UnsupportedOperationException) || (exception0 instanceof IllegalStateException)) {
                    ibns0 = new ibns(((int)0xCF0D), ghwm.d);
                }
                else if(!(exception0 instanceof NumberFormatException) && !(exception0 instanceof IllegalArgumentException)) {
                    ibns0 = new ibns(((int)0xCF10), ghwm.a);
                }
                else {
                    ibns0 = new ibns(((int)0xCF0E), ghwm.e);
                }
                int v3 = ((Number)ibns0.a).intValue();
                a.ae(IncomingCallRetrieverIntentOperation.a.i(), "Error during phone number verification", exception0);
                ghwp ghwp4 = aicv.b(s, ghwo.l, ((ghwm)ibns0.b), v2);
                this.b.a(ghwp4);
                IncomingCallRetrieverIntentOperation.c(s, v3, null, exception0.getMessage());
            }
            return;
        }
        ((ggtj)bboh0.h()).x("MissCallRetriever Feature is not enabled");
        ghwp ghwp5 = aicv.d(s, ghwo.c, ghwm.b);
        this.b.a(ghwp5);
        IncomingCallRetrieverIntentOperation.b(s, 0xCF0B, null);
    }
}

