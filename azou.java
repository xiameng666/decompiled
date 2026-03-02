import android.accounts.Account;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;

public final class azou {
    public static Intent a(azot azot0) {
        Intent intent0 = new Intent();
        int v = 0;
        if(!azot0.k) {
            batl.c(azot0.j == null, "We only support hostedDomain filter for account chip styled account picker");
            batl.c(azot0.l == null, "Consent is only valid for account chip styled account picker");
        }
        batl.c(!azot0.b || (azot0.i == 1001 || azot0.i == 1002 || azot0.i == 1003 || azot0.i == 1004), "Making the selected account non-clickable is only supported for the THEME_DAY_NIGHT_GOOGLE_MATERIAL2, THEME_LIGHT_GOOGLE_MATERIAL3, THEME_DARK_GOOGLE_MATERIAL3 or THEME_DAY_NIGHT_GOOGLE_MATERIAL3 themes");
        intent0.setAction((azot0.k ? "com.google.android.gms.common.account.CHOOSE_ACCOUNT_USERTILE" : "com.google.android.gms.common.account.CHOOSE_ACCOUNT"));
        intent0.setPackage("com.google.android.gms");
        intent0.putExtra("allowableAccounts", azot0.c);
        ArrayList arrayList0 = azot0.d;
        if(arrayList0 != null) {
            intent0.putExtra("allowableAccountTypes", ((String[])arrayList0.toArray(new String[0])));
        }
        intent0.putExtra("addAccountOptions", null);
        intent0.putExtra("selectedAccount", azot0.a);
        intent0.putExtra("selectedAccountIsNotClickable", azot0.b);
        intent0.putExtra("alwaysPromptForAccount", azot0.e);
        intent0.putExtra("descriptionTextOverride", azot0.f);
        intent0.putExtra("setGmsCoreAccount", azot0.h);
        intent0.putExtra("realClientPackage", azot0.m);
        intent0.putExtra("overrideTheme", azot0.i);
        if(azot0.k) {
            v = 2;
        }
        intent0.putExtra("overrideCustomTheme", v);
        intent0.putExtra("hostedDomainFilter", azot0.j);
        Bundle bundle0 = new Bundle();
        if(azot0.k && !TextUtils.isEmpty(azot0.f)) {
            bundle0.putString("title", azot0.f);
        }
        azos azos0 = azot0.l;
        if(azos0 != null) {
            bundle0.putBoolean("should_show_consent", true);
            bundle0.putString("privacy_policy_url", azos0.b);
            bundle0.putString("terms_of_service_url", azos0.a);
        }
        if(azot0.n) {
            bundle0.putBoolean("exclude_add_account", true);
        }
        if(azot0.o) {
            bundle0.putBoolean("exclude_manage_accounts", true);
        }
        if(!bundle0.isEmpty()) {
            intent0.putExtra("first_party_options_bundle", bundle0);
        }
        return intent0;
    }

    @Deprecated
    public static Intent b(Account account0, ArrayList arrayList0, String[] arr_s, boolean z, boolean z1, int v) {
        return azou.c(account0, arrayList0, arr_s, z, null, z1, v, 0, null, false);
    }

    @Deprecated
    public static Intent c(Account account0, ArrayList arrayList0, String[] arr_s, boolean z, String s, boolean z1, int v, int v1, String s1, boolean z2) {
        Intent intent0 = new Intent();
        if(!z2) {
            batl.c(s1 == null, "We only support hostedDomain filter for account chip styled account picker");
        }
        intent0.setAction((z2 ? "com.google.android.gms.common.account.CHOOSE_ACCOUNT_USERTILE" : "com.google.android.gms.common.account.CHOOSE_ACCOUNT"));
        intent0.setPackage("com.google.android.gms");
        intent0.putExtra("allowableAccounts", arrayList0);
        intent0.putExtra("allowableAccountTypes", arr_s);
        intent0.putExtra("addAccountOptions", null);
        intent0.putExtra("selectedAccount", account0);
        intent0.putExtra("alwaysPromptForAccount", z);
        intent0.putExtra("descriptionTextOverride", s);
        intent0.putExtra("authTokenType", null);
        intent0.putExtra("addAccountRequiredFeatures", null);
        intent0.putExtra("setGmsCoreAccount", z1);
        intent0.putExtra("overrideTheme", v);
        intent0.putExtra("overrideCustomTheme", v1);
        intent0.putExtra("hostedDomainFilter", s1);
        return intent0;
    }
}

