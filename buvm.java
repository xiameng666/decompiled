import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.google.android.libraries.families.FamilyActivity;

public final class buvm implements ccrn {
    private final Context a;
    private final String b;

    public buvm(Context context0, String s) {
        ibuq.f(s, "accountName");
        super();
        this.a = context0;
        this.b = s;
    }

    @Override  // ccrn
    public final Object g(ibrl ibrl0) {
        Intent intent0 = new Intent().setComponent(new ComponentName(this.a, FamilyActivity.class)).putExtra("extra.accountName", this.b).putExtra("appId", 14).putExtra("flowType", 3).putExtra("utmSource", "googlesettings").putExtra("utmMedium", "recommended").setFlags(0);
        ibuq.e(intent0, "setFlags(...)");
        ccmy ccmy0 = ccmu.b(intent0, cmeu.x);
        ibuq.e("Family group", "getString(...)");
        ibuq.e("Share Google services, storage and subscriptions with your family", "getString(...)");
        ibuq.e("Continue", "getString(...)");
        ccne ccne0 = new ccne(new ccnb("Continue", ccmy0));
        return new ccnh("Family group", "Share Google services, storage and subscriptions with your family", ccow.w, ccmy0, ccne0, null, 0x60);
    }
}

