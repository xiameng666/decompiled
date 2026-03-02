import android.accounts.Account;
import android.content.Context;
import android.os.Process;

public final class egjx {
    public static final String[] a;

    static {
        egjx.a = new String[]{"https://www.googleapis.com/auth/plus.circles.read", "https://www.googleapis.com/auth/plus.circles.write", "https://www.googleapis.com/auth/plus.media.upload", "https://www.googleapis.com/auth/plus.pages.manage", "https://www.googleapis.com/auth/plus.me", "https://www.googleapis.com/auth/plus.profiles.read", "https://www.googleapis.com/auth/plus.profiles.write", "https://www.googleapis.com/auth/plus.stream.read", "https://www.googleapis.com/auth/peopleapi.legacy.readwrite", "https://www.googleapis.com/auth/plus.applications.manage", "https://www.googleapis.com/auth/plus.settings"};
    }

    public static baqr a(Context context0, Account account0) {
        baqr baqr0;
        egiv.R();
        hwzc hwzc0 = hwzc.a;
        boolean z = hwzc0.c().bj();
        Boolean.valueOf(z).getClass();
        if(z) {
            baqr0 = new baqr(Process.myUid(), account0.name, account0.name, "com.google.android.gms", "com.google.android.gms");
        }
        else {
            baqr0 = new baqr();
            baqr0.a = Process.myUid();
            baqr0.c = account0;
            baqr0.b = account0;
            baqr0.d = "com.google.android.gms";
            baqr0.e = "com.google.android.gms";
        }
        egiv.R();
        String[] arr_s = egjx.c(hwzc0.c().T());
        if(arr_s.length > 0) {
            baqr0.n(arr_s);
        }
        baqr0.m("social_client_app_id", "80");
        return baqr0;
    }

    @Deprecated
    public static baqr b(Context context0, String s, String s1) {
        baqr baqr0 = new baqr(Process.myUid(), s, s, "com.google.android.gms", "com.google.android.gms");
        baqr0.n(egjx.a);
        baqr0.m("social_client_app_id", s1);
        return baqr0;
    }

    public static String[] c(String s) {
        return (String[])gggq.A(gfud.e(',').i().d().l(s), String.class);
    }
}

