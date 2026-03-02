package com.google.android.gms.tapandpay.issuer;

import ByteString;
import MessageLite;
import ProtoLiteBuilder;
import ProtoLiteMessage;
import a;
import android.content.Intent;
import batl;
import bauc;
import bbcu;
import bboh;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.tapandpay.firstparty.AccountInfo;
import esgc;
import esge;
import esgi;
import etlr;
import etsy;
import etti;
import ettj;
import eups;
import eved;
import gfoz;
import gfpe;
import ggtj;
import gtfc;
import gtgj;
import gtgk;
import gtgn;
import gtjh;
import gtlb;
import gtnc;
import gtnq;
import hftc;
import hfur;
import hyps;
import java.io.IOException;

public class CheckEligibilityIntentOperation extends esgc {
    private static final bboh a;

    static {
        CheckEligibilityIntentOperation.a = bboh.b("TapAndPay", bbcu.aM);
    }

    @Override  // esgc
    protected final void a(Intent intent0) {
        hfur hfur1;
        gfpe gfpe0;
        try {
            byte[] arr_b = intent0.getByteArrayExtra("token_provisioning_data");
            if(arr_b != null && arr_b.length > 0) {
                hftc hftc0 = hftc.a();
                ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)gfpe.a), arr_b, 0, arr_b.length, hftc0);
                ProtoLiteMessage.P_makeImmutable(hftv0);
                gfpe0 = (gfpe)hftv0;
            }
            else {
                gfpe0 = null;
            }
        }
        catch(hfur hfur0) {
            hfur1 = hfur0;
            gfpe0 = null;
            goto label_18;
        }
        if(gfpe0 == null) {
            try {
                ((ggtj)CheckEligibilityIntentOperation.a.j()).x("TokenProvisioningData is null");
                gfpe0 = null;
                goto label_19;
            }
            catch(hfur hfur1) {
            }
        label_18:
            a.ae(CheckEligibilityIntentOperation.a.j(), "Exception while parsing tokenProvisioningData", hfur1);
        }
    label_19:
        AccountInfo accountInfo0 = (AccountInfo)bauc.b(intent0, "extra_account_info", AccountInfo.CREATOR);
        if(accountInfo0 != null) {
            esgi esgi0 = new esgi(accountInfo0, esge.d(), this);
            gtgj gtgj0 = (gtgj)((ProtoLiteMessage)gtgk.a).v_newBuilder();
            gtjh gtjh0 = eved.a(this);
            if(!gtgj0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)gtgj0).ensureMutable();
            }
            gtgk gtgk0 = (gtgk)gtgj0.b_message;
            gtjh0.getClass();
            gtgk0.d = gtjh0;
            gtgk0.b |= 2;
            gtlb gtlb0 = gtlb.d;
            if(!gtgj0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)gtgj0).ensureMutable();
            }
            gtgk gtgk1 = (gtgk)gtgj0.b_message;
            gtgk1.g = gtlb0.a();
            gtgj0.l(eups.d);
            gtgj0.k(eups.b());
            if(!gtgj0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)gtgj0).ensureMutable();
            }
            gtgk gtgk2 = (gtgk)gtgj0.b_message;
            "com.google.android.gms".getClass();
            gtgk2.j = "com.google.android.gms";
            gtgj0.a(etlr.b());
            gtnq gtnq0 = gtnq.b;
            if(!gtgj0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)gtgj0).ensureMutable();
            }
            gtgk gtgk3 = (gtgk)gtgj0.b_message;
            gtgk3.s = gtnq0.a();
            batl.s(gfpe0);
            String s = gfpe0.d;
            if(!s.isEmpty()) {
                if(!gtgj0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)gtgj0).ensureMutable();
                }
                gtgk gtgk4 = (gtgk)gtgj0.b_message;
                s.getClass();
                gtgk4.f = s;
            }
            batl.s(gfpe0);
            String s1 = gfpe0.c;
            if(!s1.isEmpty()) {
                if(!gtgj0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)gtgj0).ensureMutable();
                }
                gtgk gtgk5 = (gtgk)gtgj0.b_message;
                s1.getClass();
                gtgk5.o = s1;
            }
            int v = intent0.getIntExtra("EXTRA_TOKENIZATION_ENTRY_POINT", 0);
            if(!gtgj0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)gtgj0).ensureMutable();
            }
            ((gtgk)gtgj0.b_message).p = v;
            if(v == 30) {
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gtfc.a).v_newBuilder();
                String s2 = (gfpe0.f == null ? gfoz.a : gfpe0.f).c;
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ProtoLiteMessage hftv1 = hftp0.b_message;
                s2.getClass();
                ((gtfc)hftv1).b = s2;
                ByteString hfsf0 = (gfpe0.f == null ? gfoz.a : gfpe0.f).d;
                if(!hftv1.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gtfc gtfc0 = (gtfc)hftp0.b_message;
                hfsf0.getClass();
                gtfc0.c = hfsf0;
                gtfc gtfc1 = (gtfc)hftp0.N_build();
                if(!gtgj0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)gtgj0).ensureMutable();
                }
                gtgk gtgk6 = (gtgk)gtgj0.b_message;
                gtfc1.getClass();
                gtgk6.c = gtfc1;
                gtgk6.b |= 1;
                v = 30;
            }
            try {
                ProtoLiteMessage hftv2 = ((ProtoLiteBuilder)gtgj0).N_build();
                gtgn gtgn0 = (gtgn)etsy.b(esgi0, etti.ad, ((MessageLite)hftv2), ((MessageLite)gtgn.a));
                if(v == 30 && hyps.c()) {
                    ((ggtj)CheckEligibilityIntentOperation.a.h()).x("startService BackgroundTokenizationIntentOperation");
                    ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)gfpe0).jf(5, null);
                    hftp1.X(((ProtoLiteMessage)gfpe0));
                    ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)gfoz.a).v_newBuilder();
                    String s3 = (gtgn0.j == null ? gtfc.a : gtgn0.j).b;
                    if(!hftp2.b_message.isImmutable()) {
                        hftp2.ensureMutable();
                    }
                    ProtoLiteMessage hftv3 = hftp2.b_message;
                    s3.getClass();
                    ((gfoz)hftv3).b |= 1;
                    ((gfoz)hftv3).c = s3;
                    ByteString hfsf1 = (gtgn0.j == null ? gtfc.a : gtgn0.j).c;
                    if(!hftv3.isImmutable()) {
                        hftp2.ensureMutable();
                    }
                    gfoz gfoz0 = (gfoz)hftp2.b_message;
                    hfsf1.getClass();
                    gfoz0.b |= 2;
                    gfoz0.d = hfsf1;
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    gfpe gfpe1 = (gfpe)hftp1.b_message;
                    gfoz gfoz1 = (gfoz)hftp2.N_build();
                    gfoz1.getClass();
                    gfpe1.f = gfoz1;
                    gfpe1.b |= 8;
                    gtnc gtnc0 = gtnc.b(gtgn0.g) == null ? gtnc.G : gtnc.b(gtgn0.g);
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    gfpe gfpe2 = (gfpe)hftp1.b_message;
                    gfpe2.k = gtnc0.a();
                    gfpe2.b |= 0x100;
                    gfpe gfpe3 = (gfpe)hftp1.N_build();
                    Intent intent1 = IntentOperation.getStartIntent(esgi0.d, "com.google.android.gms.tapandpay.issuer.BackgroundTokenizeCardIntentOperation", "com.google.android.gms.tapandpay.issuer.ACTION_BACKGROUND_TOKENIZE_CARD");
                    batl.s(intent1);
                    bauc.l(esgi0.a(), intent1, "extra_account_info");
                    intent1.putExtra("EXTRA_TOKENIZATION_ENTRY_POINT", 30).putExtra("token_provisioning_data", gfpe3.toBytesArray());
                    this.startService(intent1);
                }
                return;
            }
            catch(IOException | ettj exception0) {
                goto label_132;
            }
        }
        return;
    label_132:
        a.ae(CheckEligibilityIntentOperation.a.j(), "Exception while calling check eligibility", exception0);
    }
}

