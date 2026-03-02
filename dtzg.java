import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.mdocstore.types.ProvisioningId;
import com.google.android.gms.pay.ProtoSafeParcelable;
import com.google.android.gms.wallet.firstparty.WalletCustomTheme;

public final class dtzg {
    public static final ggeo a;
    public static final bboh b;
    public String c;
    public final WalletCustomTheme d;

    static {
        dtzg.a = ggeo.n("PROD", Integer.valueOf(1), "DEVELOPMENT", Integer.valueOf(3), "SANDBOX", Integer.valueOf(0));
        dtzg.b = bboh.b("Pay", bbcu.cZ);
    }

    public dtzg(String s, WalletCustomTheme walletCustomTheme0) {
        this.c = s;
        this.d = walletCustomTheme0;
    }

    public final Intent a(Context context0, String s, Account account0) {
        return this.f(context0, s, account0, gfqx.a, 1, false);
    }

    public static gfsx b(Intent intent0) {
        gfsx gfsx0 = dtzg.g(intent0);
        if(!gfsx0.i()) {
            return gfqx.a;
        }
        hbzm hbzm0 = ((hcbf)gfsx0.d()).c;
        if(hbzm0 == null) {
            hbzm0 = hbzm.a;
        }
        return gfsx.m(new ProvisioningId(hbzm0.b));
    }

    public static gtxb c(Intent intent0) {
        gfsx gfsx0 = dtzg.g(intent0);
        if(!gfsx0.i()) {
            ((ggtj)dtzg.b.h()).x("identityVerificationResponse is not present, treating as STARTED");
            return gtxb.b;
        }
        ggtj ggtj0 = (ggtj)dtzg.b.h();
        hcac hcac0 = ((hcbf)gfsx0.d()).b;
        if(hcac0 == null) {
            hcac0 = hcac.a;
        }
        ggtj0.B("identityVerificationResponse status is %s", (hcab.b(hcac0.b) == null ? hcab.a : hcab.b(hcac0.b)));
        hcac hcac1 = ((hcbf)gfsx0.d()).b;
        if(hcac1 == null) {
            hcac1 = hcac.a;
        }
        hcab hcab0 = hcab.b(hcac1.b) == null ? hcab.a : hcab.b(hcac1.b);
        return hcab0.ordinal() == 1 || hcab0.ordinal() == 2 || hcab0.ordinal() == 3 ? gtxb.c : gtxb.b;
    }

    public static boolean d(Intent intent0) {
        gfsx gfsx0 = dtzg.g(intent0);
        return gfsx0.i() && hcbe.a(((hcbf)gfsx0.d()).d) == 2;
    }

    public final Intent e(Context context0, String s, Account account0, gfsx gfsx0) {
        return this.f(context0, s, account0, gfsx0, 3, true);
    }

    private final Intent f(Context context0, String s, Account account0, gfsx gfsx0, int v, boolean z) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hcbb.a).v_newBuilder();
        long v1 = bbmq.d(context0);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((hcbb)hftv0).b |= 2;
        ((hcbb)hftv0).d = v1;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        hcbb hcbb0 = (hcbb)hftp0.b_message;
        s.getClass();
        int v2 = 1;
        hcbb0.b |= 1;
        hcbb0.c = s;
        if(gfsx0.i() && !((ByteString)gfsx0.d()).isEmpty()) {
            ByteString hfsf0 = (ByteString)gfsx0.d();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            hcbb hcbb1 = (hcbb)hftp0.b_message;
            hcbb1.b |= 4;
            hcbb1.e = hfsf0;
        }
        if(z) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            hcbb hcbb2 = (hcbb)hftp0.b_message;
            hcbb2.b |= 8;
            hcbb2.f = true;
        }
        hcba hcba0 = (hcba)((ProtoLiteMessage)hcbc.a).v_newBuilder();
        if(!hcba0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hcba0).ensureMutable();
        }
        hcbc hcbc0 = (hcbc)hcba0.b_message;
        s.getClass();
        hcbc0.b |= 2;
        hcbc0.d = s;
        if(!hcba0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hcba0).ensureMutable();
        }
        hcbc hcbc1 = (hcbc)hcba0.b_message;
        hcbc1.b |= 1;
        hcbc1.c = 22;
        if(!hcba0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hcba0).ensureMutable();
        }
        hcbc hcbc2 = (hcbc)hcba0.b_message;
        hcbc2.b |= 4;
        hcbc2.e = 22;
        hcbb hcbb3 = (hcbb)hftp0.N_build();
        if(!hcba0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hcba0).ensureMutable();
        }
        hcbc hcbc3 = (hcbc)hcba0.b_message;
        hcbb3.getClass();
        hcbc3.f = hcbb3;
        hcbc3.b |= 16;
        long v3 = 0x621B9FFL;
        if(hwmp.w() && hwmp.a.l().J()) {
            hcba0.a(102873604L);
        }
        else if(hwmp.w() && hwmp.a.l().I()) {
            hcba0.a(0x621B9FFL);
        }
        if(!hwmp.w()) {
            if(hwev.c()) {
                v3 = 102873604L;
            }
            hcba0.a(v3);
        }
        hcbc hcbc4 = (hcbc)((ProtoLiteBuilder)hcba0).N_build();
        if(this.c == null) {
            ((ggtj)dtzg.b.i()).x("\'environment\' variable in IDVWidgetUtils not set. Defaulting to PRODUCTION");
            this.c = "PROD";
        }
        ggeo ggeo0 = dtzg.a;
        if(ggeo0.containsKey(this.c)) {
            v2 = (int)(((Integer)ggeo0.get(this.c)));
        }
        else {
            ((ggtj)dtzg.b.i()).B("%s value \'environment\' contains no mapping in IDVWidgetUtils. Defaulting to ENVIRONMENT_PRODUCTION", this.c);
        }
        fbjj fbjj0 = new fbjj(context0);
        fbjj0.e(v2);
        byte[] arr_b = hcbc4.toBytesArray();
        fbjj0.a.putExtra("com.google.android.gms.wallet.firstparty.EXTRA_UNENCRYPTED_PARAMS", arr_b);
        fbjj0.c(account0);
        fbjj0.f(v);
        fbjj0.g(3);
        fbjj0.d(this.d);
        return fbjj0.a();
    }

    private static gfsx g(Intent intent0) {
        byte[] arr_b = intent0.getByteArrayExtra("com.google.android.gms.wallet.firstparty.EXTRA_CLIENT_CALLBACK_DATA_TOKEN");
        byte[] arr_b1 = intent0.getByteArrayExtra("com.google.android.gms.wallet.firstparty.EXTRA_INTEGRATOR_CALLBACK_DATA_TOKEN");
        if(arr_b != null && arr_b.length > 0 && arr_b1 != null && arr_b1.length > 0) {
            try {
                hftc hftc0 = hftc.a();
                ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)hgtd.a), arr_b, 0, arr_b.length, hftc0);
                ProtoLiteMessage.P_makeImmutable(hftv0);
                ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((hgtd)hftv0))).jf(5, null);
                hftp0.X(((ProtoLiteMessage)(((hgtd)hftv0))));
                hgtd hgtd0 = (hgtd)((ProtoLiteBuilder)hftp0.A(arr_b1, hftc.a())).N_build();
                ProtoSafeParcelable protoSafeParcelable0 = new ProtoSafeParcelable();
                protoSafeParcelable0.a = hgtd0.toBytesArray();
                return gfsx.m(((hcbf)ftqe.c(protoSafeParcelable0, ((MessageLite)hcbf.a))));
            }
            catch(hfur hfur0) {
                a.ae(dtzg.b.i(), "Error parsing IDV Widget response proto.", hfur0);
                return gfqx.a;
            }
        }
        return gfqx.a;
    }
}

