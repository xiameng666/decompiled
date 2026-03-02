import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.gms.tapandpay.firstparty.RetrieveInAppPaymentCredentialResponse;
import com.google.android.gms.wallet.firstparty.WalletCustomTheme;
import com.google.android.gms.wallet.shared.ApplicationParameters;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import java.security.SecureRandom;

public final class fbvx {
    private static SecureRandom a;

    public static gers a(byte[] arr_b) {
        return arr_b == null ? null : ((gers)gciq.c(arr_b, ((Parser)((ProtoLiteMessage)gers.b).jf(7, null))));
    }

    public static gesx b(gesx gesx0) {
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)gesx0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)gesx0));
        gesx gesx1 = (gesx)((gesv)hftp0).b_message;
        gepm gepm0 = gesx1.c == 10 ? ((gepm)gesx1.d) : gepm.b;
        ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)gepm0).jf(5, null);
        hftp1.X(((ProtoLiteMessage)gepm0));
        if(!((gepa)hftp1).b_message.isImmutable()) {
            ((ProtoLiteBuilder)(((gepa)hftp1))).ensureMutable();
        }
        ((gepm)((gepa)hftp1).b_message).O = null;
        ((gepm)((gepa)hftp1).b_message).d &= -5;
        if(!((gepa)hftp1).b_message.isImmutable()) {
            ((ProtoLiteBuilder)(((gepa)hftp1))).ensureMutable();
        }
        ((gepm)((gepa)hftp1).b_message).c &= -2;
        ((gepm)((gepa)hftp1).b_message).e = 0;
        if(!((gepa)hftp1).b_message.isImmutable()) {
            ((ProtoLiteBuilder)(((gepa)hftp1))).ensureMutable();
        }
        ((gepm)((gepa)hftp1).b_message).c &= -5;
        gepm gepm1 = gepm.b;
        ((gepm)((gepa)hftp1).b_message).h = gepm1.h;
        if(!((gepa)hftp1).b_message.isImmutable()) {
            ((ProtoLiteBuilder)(((gepa)hftp1))).ensureMutable();
        }
        ((gepm)((gepa)hftp1).b_message).c &= -9;
        ((gepm)((gepa)hftp1).b_message).i = gepm1.i;
        if(!((gepa)hftp1).b_message.isImmutable()) {
            ((ProtoLiteBuilder)(((gepa)hftp1))).ensureMutable();
        }
        ((gepm)((gepa)hftp1).b_message).c &= -17;
        ((gepm)((gepa)hftp1).b_message).j = gepm1.j;
        if(!((gepa)hftp1).b_message.isImmutable()) {
            ((ProtoLiteBuilder)(((gepa)hftp1))).ensureMutable();
        }
        ((gepm)((gepa)hftp1).b_message).c &= -33;
        ((gepm)((gepa)hftp1).b_message).k = gepm1.k;
        if(!((gepa)hftp1).b_message.isImmutable()) {
            ((ProtoLiteBuilder)(((gepa)hftp1))).ensureMutable();
        }
        ((gepm)((gepa)hftp1).b_message).c &= 0xFFFFFF7F;
        ((gepm)((gepa)hftp1).b_message).m = gepm1.m;
        if(!((gepa)hftp1).b_message.isImmutable()) {
            ((ProtoLiteBuilder)(((gepa)hftp1))).ensureMutable();
        }
        ((gepm)((gepa)hftp1).b_message).c &= 0xFFFFFEFF;
        ((gepm)((gepa)hftp1).b_message).n = false;
        if(!((gepa)hftp1).b_message.isImmutable()) {
            ((ProtoLiteBuilder)(((gepa)hftp1))).ensureMutable();
        }
        ((gepm)((gepa)hftp1).b_message).c &= 0xBFFFFFFF;
        ((gepm)((gepa)hftp1).b_message).K = 0;
        if(!((gepa)hftp1).b_message.isImmutable()) {
            ((ProtoLiteBuilder)(((gepa)hftp1))).ensureMutable();
        }
        ((gepm)((gepa)hftp1).b_message).c &= -65;
        ((gepm)((gepa)hftp1).b_message).l = 0L;
        if(!((gepa)hftp1).b_message.isImmutable()) {
            ((ProtoLiteBuilder)(((gepa)hftp1))).ensureMutable();
        }
        ((gepm)((gepa)hftp1).b_message).c &= 0xFFFFBFFF;
        ((gepm)((gepa)hftp1).b_message).s = 0L;
        if(!((gepa)hftp1).b_message.isImmutable()) {
            ((ProtoLiteBuilder)(((gepa)hftp1))).ensureMutable();
        }
        ((gepm)((gepa)hftp1).b_message).c &= 0x7FFFFFFF;
        ((gepm)((gepa)hftp1).b_message).L = 0L;
        if(!((gepa)hftp1).b_message.isImmutable()) {
            ((ProtoLiteBuilder)(((gepa)hftp1))).ensureMutable();
        }
        ((gepm)((gepa)hftp1).b_message).d &= -2;
        ((gepm)((gepa)hftp1).b_message).M = 0L;
        if(!((gepa)hftp1).b_message.isImmutable()) {
            ((ProtoLiteBuilder)(((gepa)hftp1))).ensureMutable();
        }
        ((gepm)((gepa)hftp1).b_message).d &= -3;
        ((gepm)((gepa)hftp1).b_message).N = false;
        if(!((gepa)hftp1).b_message.isImmutable()) {
            ((ProtoLiteBuilder)(((gepa)hftp1))).ensureMutable();
        }
        ((gepm)((gepa)hftp1).b_message).c &= 0xDFFFFFFF;
        ((gepm)((gepa)hftp1).b_message).I = gepm1.I;
        if(!((gepa)hftp1).b_message.isImmutable()) {
            ((ProtoLiteBuilder)(((gepa)hftp1))).ensureMutable();
        }
        ((gepm)((gepa)hftp1).b_message).Q = hfvv.a;
        if(!((gepa)hftp1).b_message.isImmutable()) {
            ((ProtoLiteBuilder)(((gepa)hftp1))).ensureMutable();
        }
        ((gepm)((gepa)hftp1).b_message).d &= -9;
        ((gepm)((gepa)hftp1).b_message).R = 0;
        gepm gepm2 = (gepm)((ProtoLiteBuilder)(((gepa)hftp1))).N_build();
        if(!((gesv)hftp0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)(((gesv)hftp0))).ensureMutable();
        }
        gesx gesx2 = (gesx)((gesv)hftp0).b_message;
        gepm2.getClass();
        gesx2.d = gepm2;
        gesx2.c = 10;
        return (gesx)((ProtoLiteBuilder)(((gesv)hftp0))).N_build();
    }

    public static SecureRandom c() {
        synchronized(fbvx.class) {
            if(fbvx.a == null) {
                fbvx.a = new SecureRandom();
            }
        }
        return fbvx.a;
    }

    public static gesx d(gesx gesx0, BuyFlowConfig buyFlowConfig0, Context context0, boolean z, boolean z1, gamy gamy0) {
        if(hzmb.a.b().m()) {
            byte[] arr_b = gesx0.e.toByteArray();
            return ((gesx0.n == null ? gesu.a : gesx0.n).b & 2) == 0 ? fbvx.e(arr_b, null, gesx0.j, gesx0.l, buyFlowConfig0, context0, z, z1, gamy0) : fbvx.e(arr_b, (gesx0.n == null ? gesu.a : gesx0.n).e.toByteArray(), gesx0.j, gesx0.l, buyFlowConfig0, context0, z, z1, gamy0);
        }
        return fbvx.e(gesx0.e.toByteArray(), (gesx0.n == null ? gesu.a : gesx0.n).e.toByteArray(), gesx0.j, gesx0.l, buyFlowConfig0, context0, z, z1, gamy0);
    }

    public static gesx e(byte[] arr_b, byte[] arr_b1, String s, boolean z, BuyFlowConfig buyFlowConfig0, Context context0, boolean z1, boolean z2, gamy gamy0) {
        ProtoLiteBuilder hftp0 = gbgs.b();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        fbbw fbbw0 = (fbbw)hftp0.b_message;
        fbbw0.b |= 4;
        fbbw0.g = z;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((fbbw)hftv0).b |= 8;
        ((fbbw)hftv0).h = z1;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        fbbw fbbw1 = (fbbw)hftp0.b_message;
        fbbw1.b |= 0x80;
        fbbw1.m = z2;
        ByteString hfsf0 = ByteString.copyFrom(arr_b);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        fbbw fbbw2 = (fbbw)hftp0.b_message;
        fbbw2.b |= 1;
        fbbw2.e = hfsf0;
        if(!TextUtils.isEmpty(s)) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            fbbw fbbw3 = (fbbw)hftp0.b_message;
            s.getClass();
            fbbw3.c = 9;
            fbbw3.d = s;
        }
        if(arr_b1 != null) {
            ByteString hfsf1 = ByteString.copyFrom(arr_b1);
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            fbbw fbbw4 = (fbbw)hftp0.b_message;
            fbbw4.b |= 0x40;
            fbbw4.l = hfsf1;
        }
        fbbw fbbw5 = (fbbw)hftp0.N_build();
        WalletCustomTheme walletCustomTheme0 = null;
        if(hzqo.a.b().c()) {
            ApplicationParameters applicationParameters0 = buyFlowConfig0.b;
            if(applicationParameters0 != null) {
                walletCustomTheme0 = applicationParameters0.f;
            }
        }
        return fbox.c(gamy0, buyFlowConfig0, context0, fbbw5, walletCustomTheme0);
    }

    public static hcbr f(RetrieveInAppPaymentCredentialResponse retrieveInAppPaymentCredentialResponse0, int v) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hcbr.a).v_newBuilder();
        String s = fbhm.a(retrieveInAppPaymentCredentialResponse0.a);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hcbr hcbr0 = (hcbr)hftp0.b_message;
        hcbr0.b |= 1;
        hcbr0.c = s;
        if(retrieveInAppPaymentCredentialResponse0.a().length > 0) {
            String s1 = Base64.encodeToString(retrieveInAppPaymentCredentialResponse0.a(), 2);
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp0.b_message;
            s1.getClass();
            ((hcbr)hftv0).b |= 2;
            ((hcbr)hftv0).d = s1;
            if(!hftv0.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((hcbr)hftp0.b_message).i = v - 1;
            ((hcbr)hftp0.b_message).b |= 0x40;
        }
        int v1 = retrieveInAppPaymentCredentialResponse0.c;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        ((hcbr)hftv1).b |= 4;
        ((hcbr)hftv1).e = v1;
        int v2 = retrieveInAppPaymentCredentialResponse0.d;
        if(!hftv1.isImmutable()) {
            hftp0.ensureMutable();
        }
        hcbr hcbr1 = (hcbr)hftp0.b_message;
        hcbr1.b |= 8;
        hcbr1.f = v2;
        String s2 = retrieveInAppPaymentCredentialResponse0.e;
        if(!TextUtils.isEmpty(s2)) {
            String s3 = fbhm.a(s2);
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            hcbr hcbr2 = (hcbr)hftp0.b_message;
            hcbr2.b |= 16;
            hcbr2.g = s3;
        }
        String s4 = retrieveInAppPaymentCredentialResponse0.f;
        if(!TextUtils.isEmpty(s4)) {
            String s5 = fbhm.a(s4);
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            hcbr hcbr3 = (hcbr)hftp0.b_message;
            hcbr3.b |= 0x20;
            hcbr3.h = s5;
        }
        return (hcbr)hftp0.N_build();
    }
}

