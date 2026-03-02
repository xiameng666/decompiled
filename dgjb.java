import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.android.gms.nearby.sharing.FileAttachment;
import java.util.ArrayList;

public final class dgjb implements dgja {
    private final Context a;
    private final FileAttachment b;
    private final int c;
    private final String d;

    public dgjb(Context context0, FileAttachment fileAttachment0, int v, String s) {
        ibuq.f(context0, "context");
        ibuq.f(fileAttachment0, "fileAttachment");
        super();
        this.a = context0;
        this.b = fileAttachment0;
        this.c = v;
        this.d = s;
        if(fileAttachment0.d != null) {
            return;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override  // dgja
    public final Object a() {
        ibqm ibqm0 = new ibqm(null);
        Intent intent0 = dgiz.a(this.d);
        intent0.addFlags(1);
        Uri uri0 = this.b.d;
        intent0.setDataAndType(uri0, this.b.f);
        intent0.setAction("android.intent.action.VIEW");
        Context context0 = this.a;
        if(djaj.h(context0.getPackageManager().queryIntentActivities(intent0, 0x10000)).isEmpty()) {
            intent0.setDataAndType(null, null);
            djaj.k(context0, intent0);
        }
        if(ibuq.m("android.intent.action.VIEW", intent0.getAction())) {
            ibqm0.add(dgiz.b(context0, intent0, true));
            ibqm0.add(dgiz.c(context0, false));
        }
        else {
            ibqm0.add(dgiz.c(context0, true));
        }
        if(this.c == 1) {
            String s = ddnb.b(context0, uri0);
            ibuq.e(s, "getMimeType(...)");
            if(ibzk.W(s, "image")) {
                ArrayList arrayList0 = new ArrayList();
                arrayList0.add(String.valueOf(uri0));
                ibqm0.add(dgiz.f(context0, arrayList0));
            }
        }
        return ibpo.a(ibqm0);
    }
}

