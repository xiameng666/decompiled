import android.content.Context;
import android.os.Bundle;
import android.os.UserManager;
import android.text.TextUtils;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public final class aqyq {
    private static final baun a;
    private final Context b;

    static {
        aqyq.a = aqql.a("BackupPolicyRestrictions");
    }

    public aqyq(Context context0) {
        this.b = context0;
    }

    public final Pattern a() {
        Bundle bundle0 = ((UserManager)this.b.getSystemService("user")).getApplicationRestrictions("com.google.android.gms");
        String s = bundle0 == null ? null : bundle0.getString("backup:allowed_backup_account_regex", null);
        if(TextUtils.isEmpty(s)) {
            return null;
        }
        try {
            return Pattern.compile(s);
        }
        catch(PatternSyntaxException unused_ex) {
            aqyq.a.f("Invalid allowed backup account regex.", new Object[0]);
            return null;
        }
    }
}

