import android.app.Notification;
import android.content.Context;
import android.text.TextUtils;
import java.util.HashSet;

public final class ehdy {
    public static Notification a(Context context0) {
        HashSet hashSet0 = new HashSet();
        hashSet0.add("android.permission-group.CONTACTS");
        juo juo0 = new juo(context0);
        juo0.D("Give contacts permission to sync");
        juo0.k("Contacts can\'t sync until you give permission");
        juo0.s(0x108008A);
        juo0.S(TextUtils.concat(new CharSequence[]{"Give contacts permission to sync", " ", "Contacts can\'t sync until you give permission"}));
        juo0.h = bazr.b.a(context0, hashSet0);
        juo0.h(true);
        if(hxao.a.b().a()) {
            juo0.J = ehdo.a();
        }
        return juo0.a();
    }
}

