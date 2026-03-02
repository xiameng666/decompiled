import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable.Callback;
import android.text.TextUtils;
import android.view.View;
import java.util.Map;

public final class qpl {
    public final Context a;
    public final String b;
    public final Map c;
    private static final Object d;

    static {
        qpl.d = new Object();
    }

    public qpl(Drawable.Callback drawable$Callback0, String s, Map map0) {
        this.b = !TextUtils.isEmpty(s) && s.charAt(s.length() - 1) != 0x2F ? s + "/" : s;
        this.c = map0;
        if(!(drawable$Callback0 instanceof View)) {
            this.a = null;
            return;
        }
        this.a = ((View)drawable$Callback0).getContext().getApplicationContext();
    }

    public final void a(String s, Bitmap bitmap0) {
        synchronized(qpl.d) {
            ((qla)this.c.get(s)).f = bitmap0;
        }
    }
}

