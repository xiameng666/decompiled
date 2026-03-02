import android.content.Context;
import com.google.android.gms.nearby.sharing.FileAttachment;
import com.google.android.gms.nearby.sharing.TextAttachment;
import com.google.android.gms.nearby.sharing.WifiCredentialsAttachment;
import java.util.List;

public final class dgis implements ibth {
    public final dgiy a;

    public dgis(dgiy dgiy0) {
        this.a = dgiy0;
    }

    @Override  // ibth
    public final Object a() {
        dgiy dgiy0 = this.a;
        dggc dggc0 = dgiy0.c;
        if(dggc0.l) {
            String s = ((TextAttachment)dggc0.d.get(0)).a;
            ibuq.e(s, "getTextBody(...)");
            return new dgjc(dgiy0.a, s, dggc0.a, dgiy0.b.b, dgiy0.b.c);
        }
        String s1 = dggc0.g;
        if(s1 != null) {
            Context context0 = dgiy0.a;
            if(!dgiz.e(context0, s1)) {
                dgiu dgiu0 = new dgiu(dgiy0, s1, null);
                icbb.b(dgiy0.d, null, null, dgiu0, 3);
                return new dgio(context0, s1);
            }
        }
        if(dggc0.m) {
            List list0 = dggc0.c;
            if(list0.size() == 1) {
                FileAttachment fileAttachment0 = (FileAttachment)list0.get(0);
                return new dgjb(dgiy0.a, fileAttachment0, dggc0.a, s1);
            }
            return new dgin(dgiy0.a, list0, dggc0.a, s1);
        }
        List list1 = dggc0.e;
        if(list1.isEmpty()) {
            return null;
        }
        WifiCredentialsAttachment wifiCredentialsAttachment0 = (WifiCredentialsAttachment)list1.get(0);
        return new dgjd(dgiy0.a, wifiCredentialsAttachment0);
    }
}

