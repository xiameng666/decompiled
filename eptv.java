import android.content.Context;
import android.text.TextUtils;

public final class eptv extends azts implements aztx {
    public eptv(Context context0, eppq eppq0) {
        super(context0, eppr.d, eppq0, aztr_settings.a);
    }

    @Override  // azts
    public final baqt iE() {
        baqt baqt0 = super.iE();
        String s = ((eppq)this.z).a.getString("com.google.android.gms.signin.internal.realClientPackageName");
        if(!TextUtils.isEmpty(s)) {
            baqt0.c = s;
        }
        return baqt0;
    }
}

