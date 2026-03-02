import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.wallet.CreateWalletObjectsRequest;
import com.google.android.gms.wallet.LoyaltyWalletObject;
import com.google.android.gms.wallet.OfferWalletObject;
import com.google.android.gms.wallet.analytics.events.GetClientTokenEvent;
import com.google.android.gms.wallet.firstparty.WalletCustomTheme;
import com.google.android.gms.wallet.shared.ApplicationParameters;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import com.google.android.gms.wallet.wobs.CommonWalletObject;

public final class fbxe {
    public static int a(hchi hchi0) {
        for(Object object0: new hfuh(hchi0.e, hchi.a)) {
            switch(((gexw)object0).ordinal()) {
                case 3: {
                    return 1;
                }
                case 4: {
                    return 2;
                }
                case 6: {
                    return 6;
                }
                case 7: {
                    return 3;
                }
                case 8: {
                    return 4;
                }
                case 9: {
                    return 7;
                }
                case 11: {
                    return 5;
                }
            }
            continue;
        }
        return 1000;
    }

    public static BuyFlowConfig b(Bundle bundle0) {
        return fbxe.i(bundle0, "onlinewallet", null);
    }

    public static BuyFlowConfig c(Bundle bundle0, WalletCustomTheme walletCustomTheme0) {
        return fbxe.i(bundle0, "unknown", walletCustomTheme0);
    }

    static CommonWalletObject d(CreateWalletObjectsRequest createWalletObjectsRequest0) {
        LoyaltyWalletObject loyaltyWalletObject0 = createWalletObjectsRequest0.a;
        if(loyaltyWalletObject0 == null) {
            OfferWalletObject offerWalletObject0 = createWalletObjectsRequest0.b;
            if(offerWalletObject0 == null) {
                return createWalletObjectsRequest0.c == null ? null : createWalletObjectsRequest0.c.a;
            }
            return offerWalletObject0.c;
        }
        return loyaltyWalletObject0.a();
    }

    public static String e(String s) {
        StringBuilder stringBuilder0 = new StringBuilder();
        if(s != null) {
            stringBuilder0.append(s);
        }
        return stringBuilder0.toString();
    }

    public static boolean f(Bundle bundle0) {
        if(bundle0 != null && bundle0.getBoolean("com.google.android.gms.wallet.EXTRA_USING_ANDROID_PAY_BRAND", false)) {
            return true;
        }
        String s = hzhp.a.b().a();
        return TextUtils.isEmpty(s) ? false : bbmt.e(s.split(","), bundle0.getString("androidPackageName"));
    }

    public static boolean g(BuyFlowConfig buyFlowConfig0) {
        return fbxe.f(buyFlowConfig0.b.c);
    }

    public static void h(Context context0, BuyFlowConfig buyFlowConfig0, ProtoLiteBuilder hftp0, int v, long v1) {
        long v2 = SystemClock.elapsedRealtime() - v1;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gklc gklc0 = (gklc)hftp0.b_message;
        gklc0.b |= 2;
        gklc0.d = (int)v2;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gklc)hftp0.b_message).c = v - 1;
        ((gklc)hftp0.b_message).b |= 1;
        fbpb.a(context0, new GetClientTokenEvent(buyFlowConfig0, ((gklc)hftp0.N_build())));
    }

    private static BuyFlowConfig i(Bundle bundle0, String s, WalletCustomTheme walletCustomTheme0) {
        ApplicationParameters applicationParameters0;
        Bundle bundle1 = new Bundle(bundle0);
        bundle1.setClassLoader(fbxe.class.getClassLoader());
        String s1 = bundle1.getString("androidPackageName");
        bundle1.putBoolean("com.google.android.gms.wallet.EXTRA_ALLOW_ACCOUNT_SELECTION", true);
        if(walletCustomTheme0 == null) {
            applicationParameters0 = fbdp.b(bundle1).a;
        }
        else {
            fbxw fbxw0 = fbdp.b(bundle1);
            fbxw0.e(walletCustomTheme0);
            applicationParameters0 = fbxw0.a;
        }
        fbxy fbxy0 = BuyFlowConfig.a();
        fbxy0.d(s1);
        fbxy0.c(s1);
        fbxy0.b(applicationParameters0);
        fbxy0.e(s);
        return fbxy0.a();
    }
}

