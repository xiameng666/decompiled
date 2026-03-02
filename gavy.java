import android.content.Context;
import android.net.Uri;
import android.util.SparseArray;

public final class gavy implements ifwb {
    public final Context a;
    public String b;
    public boolean c;
    public anj d;
    public ann e;
    public ifwa f;
    private final String g;
    private final int h;

    public gavy(Context context0, String s, int v) {
        this.a = context0;
        this.g = s;
        this.h = v;
    }

    @Override  // ifwb
    public final void a(anj anj0) {
        anl anl0;
        if(!this.c) {
            this.c = true;
            this.d = anj0;
            this.e = anj0.a(new gavx());
            anj0.c();
            ann ann0 = this.e;
            int v = this.h;
            gaxl.a();
            if(hzlv.p()) {
                int v1 = 2;
                ank ank0 = new ank(ann0);
                ank0.c();
                switch(v) {
                    case 1: {
                        v1 = 1;
                        break;
                    }
                    case 2: {
                        break;
                    }
                    default: {
                        v1 = 0;
                    }
                }
                ank0.a.putExtra("androidx.browser.customtabs.extra.COLOR_SCHEME", v1);
                gaxl.a();
                if(!hzlv.a.b().k() && (v == 1 || v == 3)) {
                    amw amw0 = new amw();
                    amw0.b(-1);
                    amx amx0 = amw0.a();
                    if(ank0.b == null) {
                        ank0.b = new SparseArray();
                    }
                    ank0.b.put(1, amx0.a());
                }
                anl0 = ank0.a();
            }
            else {
                ank ank1 = new ank(ann0);
                ank1.c();
                ank1.d(-1);
                anl0 = ank1.a();
            }
            ifvz.b(this.a, anl0.a);
            anl0.a.putExtra("android.support.customtabs.extra.SEND_TO_EXTERNAL_HANDLER", true);
            anl0.a.setFlags(0x10000000);
            Uri uri0 = Uri.parse(this.g);
            anl0.a(this.a, uri0);
        }
    }

    @Override  // ifwb
    public final void b() {
    }
}

