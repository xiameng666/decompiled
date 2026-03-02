import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.google.android.gms.wallet.firstparty.WalletCustomTheme;
import com.google.android.gms.wallet.firstparty.setupwizard.SetupWizardInstrumentManagerParams;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import com.google.android.wallet.shared.common.ClickSpan;

public final class fbxo {
    public static Intent a(Context context0, SetupWizardInstrumentManagerParams setupWizardInstrumentManagerParams0) {
        Account account0 = setupWizardInstrumentManagerParams0.a;
        gftb.z(account0, "must have account");
        byte[] arr_b = setupWizardInstrumentManagerParams0.b;
        gftb.z(arr_b, "must have action token");
        BuyFlowConfig buyFlowConfig0 = setupWizardInstrumentManagerParams0.c;
        gftb.z(buyFlowConfig0, "must have BuyflowConfig");
        String s = setupWizardInstrumentManagerParams0.d;
        gftb.z(s, "must have theme");
        Intent intent0 = bbmq.h("com.google.android.gms.wallet.im.SetupWizardImRootActivity");
        WalletCustomTheme walletCustomTheme0 = buyFlowConfig0.b.f;
        if(walletCustomTheme0 != null) {
            walletCustomTheme0.f(gcuj.c(s, gcuj.j(context0)));
        }
        intent0.putExtra("com.google.android.gms.wallet.account", account0);
        intent0.putExtra("com.google.android.gms.wallet.firstparty.EXTRA_INITIALIZE_TOKEN", arr_b);
        intent0.putExtra("com.google.android.gms.wallet.buyFlowConfig", buyFlowConfig0);
        intent0.putExtra("com.google.android.gms.themeResIds", fbxo.c(context0, s));
        gcuj.i(intent0, s);
        byte[] arr_b1 = setupWizardInstrumentManagerParams0.e;
        if(arr_b1 != null) {
            intent0.putExtra("com.google.android.gms.wallet.im.SetupWizardImRootChimeraActivity.EXTRA_GLIF_ICON", arr_b1);
        }
        return intent0;
    }

    public static void b(gahu gahu0, gfgr gfgr0, gcqu gcqu0) {
        String s = gfgr0 == null ? "" : gfgr0.f;
        gahu0.d((TextUtils.isEmpty(s) ? 8 : 0));
        ClickSpan.b(gahu0.a(), s, gcqu0, false);
    }

    public static int[] c(Context context0, String s) {
        int v;
        boolean z = gcuj.j(context0);
        boolean z1 = hzrg.h();
        switch(s) {
            case "glif": 
            case "glif_light": 
            case "glif_v2": 
            case "glif_v2_light": {
                v = 0x7F160EFA;  // style:Theme_Wallet_First_Party_SetupWizard_Glif.DayNight
                break;
            }
            default: {
                v = 0x7F160EFE;  // style:Theme_Wallet_First_Party_SetupWizard_Google_Material_2.DayNight
            }
        }
        switch(((int)hzrg.c())) {
            case 1: {
                return new int[]{v, 0x7F161092, gcuj.a(context0, s, z, z1), gcuj.b(context0, z)};  // style:Wallet_SetupWizard_Glif_V1
            }
            case 2: {
                return new int[]{v, 0x7F161093, gcuj.a(context0, s, z, z1), gcuj.b(context0, z)};  // style:Wallet_SetupWizard_Glif_V2
            }
            case 3: {
                return new int[]{v, 0x7F161094, gcuj.a(context0, s, z, z1), gcuj.b(context0, z)};  // style:Wallet_SetupWizard_Glif_V3
            }
            default: {
                return z ? new int[]{v, 0x7F161095, gcuj.a(context0, s, z, z1), gcuj.b(context0, z)} : new int[]{v, 0x7F161094, gcuj.a(context0, s, z, z1), gcuj.b(context0, z)};  // style:Wallet_SetupWizard_Glif_V4
            }
        }
    }
}

