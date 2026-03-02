import android.accounts.Account;
import android.app.Activity;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.icu.text.RelativeDateTimeFormatter.Direction;
import android.icu.text.RelativeDateTimeFormatter.RelativeUnit;
import android.icu.text.RelativeDateTimeFormatter;
import android.os.LocaleList;
import android.telephony.PhoneNumberUtils;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import androidx.core.widget.NestedScrollView;
import com.google.android.gms.people.contactssync.model.BackupAndSyncOptInState;
import java.util.ArrayList;
import java.util.Locale;

public final class egxj {
    public static final int a;

    static {
        bboh.b("UiUtils", bbcu.f);
    }

    static Account a(String s) {
        return TextUtils.isEmpty(s) ? null : new Account(s, "com.google");
    }

    public static Activity b(du du0) {
        Context context0 = du0.requireContext();
        return (context0 instanceof Activity) ? ((Activity)context0) : ((xob)context0).getContainerActivity();
    }

    static Intent c(Account account0, String s) {
        return egxj.d(account0, s, null);
    }

    static Intent d(Account account0, String s, ArrayList arrayList0) {
        azor azor0 = new azor();
        azor0.a = account0;
        azor0.b(arrayList0);
        azor0.e();
        azor0.c(ggia.d(new String[]{"com.google"}));
        azor0.d();
        azor0.f = 1001;
        azor0.c = s;
        return azou.a(azor0.a());
    }

    public static CharSequence e(Resources resources0, String s) {
        Locale locale0 = egxj.h(resources0);
        String s1 = PhoneNumberUtils.formatNumber(s, locale0.getCountry());
        if(s1 != null) {
            s = s1;
        }
        CharSequence charSequence0 = PhoneNumberUtils.createTtsSpannable(s);
        kaj kaj0 = kaj.b(locale0);
        return kaj0.f(charSequence0, kaj0.d);
    }

    static CharSequence f(Resources resources0, long v) {
        String s;
        if(Long.compare(v, 0L) == 0) {
            return "Last sync just now";
        }
        long v1 = System.currentTimeMillis();
        if(v1 <= v) {
            return null;
        }
        long v2 = (v1 - v) / 1000L;
        if(v2 == 0L) {
            return "Last sync just now";
        }
        RelativeDateTimeFormatter relativeDateTimeFormatter0 = RelativeDateTimeFormatter.getInstance();
        if(Long.compare(v2, 60L) < 0) {
            s = relativeDateTimeFormatter0.format(((double)(((int)v2))), RelativeDateTimeFormatter.Direction.LAST, RelativeDateTimeFormatter.RelativeUnit.SECONDS);
            return TextUtils.expandTemplate(resources0.getText(0x7F152522), new CharSequence[]{s});  // string:people_contacts_sync_core_last_sync_relative_time "Last sync ^1"
        }
        if(v2 < 3600L) {
            s = relativeDateTimeFormatter0.format(((double)(((int)(v2 / 60L)))), RelativeDateTimeFormatter.Direction.LAST, RelativeDateTimeFormatter.RelativeUnit.MINUTES);
            return TextUtils.expandTemplate(resources0.getText(0x7F152522), new CharSequence[]{s});  // string:people_contacts_sync_core_last_sync_relative_time "Last sync ^1"
        }
        if(v2 < 86400L) {
            s = relativeDateTimeFormatter0.format(((double)(((int)(v2 / 3600L)))), RelativeDateTimeFormatter.Direction.LAST, RelativeDateTimeFormatter.RelativeUnit.HOURS);
            return TextUtils.expandTemplate(resources0.getText(0x7F152522), new CharSequence[]{s});  // string:people_contacts_sync_core_last_sync_relative_time "Last sync ^1"
        }
        if(v2 < 604800L) {
            s = relativeDateTimeFormatter0.format(((double)(((int)(v2 / 86400L)))), RelativeDateTimeFormatter.Direction.LAST, RelativeDateTimeFormatter.RelativeUnit.DAYS);
            return TextUtils.expandTemplate(resources0.getText(0x7F152522), new CharSequence[]{s});  // string:people_contacts_sync_core_last_sync_relative_time "Last sync ^1"
        }
        if(v2 < 31536000L) {
            s = relativeDateTimeFormatter0.format(((double)(((int)(v2 / 604800L)))), RelativeDateTimeFormatter.Direction.LAST, RelativeDateTimeFormatter.RelativeUnit.WEEKS);
            return TextUtils.expandTemplate(resources0.getText(0x7F152522), new CharSequence[]{s});  // string:people_contacts_sync_core_last_sync_relative_time "Last sync ^1"
        }
        s = relativeDateTimeFormatter0.format(((double)(((int)(v2 / 31536000L)))), RelativeDateTimeFormatter.Direction.LAST, RelativeDateTimeFormatter.RelativeUnit.YEARS);
        return TextUtils.expandTemplate(resources0.getText(0x7F152522), new CharSequence[]{s});  // string:people_contacts_sync_core_last_sync_relative_time "Last sync ^1"
    }

    static String g(Account account0) {
        return account0 == null ? null : account0.name;
    }

    public static Locale h(Resources resources0) {
        jzd jzd0 = jyw.a(resources0.getConfiguration());
        return jzd0.h() ? jzd.e(LocaleList.getDefault()).g(0) : jzd0.g(0);
    }

    public static void i(View view0, int v) {
        view0.addOnLayoutChangeListener(new egxi(v, view0));
    }

    public static void j(NestedScrollView nestedScrollView0) {
        if(nestedScrollView0 == null) {
            return;
        }
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = nestedScrollView0.getLayoutParams();
        if(viewGroup$LayoutParams0 == null) {
            viewGroup$LayoutParams0 = new ViewGroup.LayoutParams(-1, -2);
        }
        else {
            viewGroup$LayoutParams0.height = -2;
        }
        nestedScrollView0.setLayoutParams(viewGroup$LayoutParams0);
    }

    static void k(String s, View view0) {
        view0.setClickable(true);
        view0.setImportantForAccessibility(1);
        kfe.j(view0, new egxh(s));
    }

    static boolean l(Account account0) {
        return ContentResolver.getMasterSyncAutomatically() && ContentResolver.getSyncAutomatically(account0, "com.android.contacts");
    }

    static boolean m(BackupAndSyncOptInState backupAndSyncOptInState0) {
        return backupAndSyncOptInState0 == null ? false : backupAndSyncOptInState0.c == 3 || backupAndSyncOptInState0.c == 5;
    }

    static boolean n(BackupAndSyncOptInState backupAndSyncOptInState0, boolean z) {
        return backupAndSyncOptInState0 == null ? false : backupAndSyncOptInState0.c == (z ? 5 : 3);
    }

    static boolean o(BackupAndSyncOptInState backupAndSyncOptInState0) {
        return backupAndSyncOptInState0 == null || (backupAndSyncOptInState0.c == 0 || backupAndSyncOptInState0.c == 1);
    }

    static boolean p(BackupAndSyncOptInState backupAndSyncOptInState0) {
        return !hwzg.f() || backupAndSyncOptInState0 == null ? false : backupAndSyncOptInState0.c == 2 || backupAndSyncOptInState0.c == 3 || backupAndSyncOptInState0.c == 5;
    }

    static boolean q(Account account0) {
        return ContentResolver.getIsSyncable(account0, "com.android.contacts") > 0;
    }

    static int r(Activity activity0) {
        String s;
        if(activity0.getReferrer() == null) {
            s = null;
        }
        else {
            activity0.getReferrer();
            s = activity0.getReferrer().toString();
        }
        if(s == null) {
            s = activity0.getCallingPackage();
        }
        if(TextUtils.isEmpty(s)) {
            return 1;
        }
        if(s.contains("com.google.android.contacts")) {
            return s.contains("GOOGLE_CONTACTS_APP_NOTIFICATION") ? 5 : 4;
        }
        if(s.contains("com.google.android.gms.settings")) {
            return 2;
        }
        if(s.contains("com.google.android.gms.people.notification.portal")) {
            return 7;
        }
        if(s.contains("com.google.android.gms.people.notification")) {
            return 3;
        }
        return !hwyp.a.c().D() || !s.contains("com.google.android.apps.tycho") ? 1 : 6;
    }
}

