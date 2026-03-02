import android.graphics.Typeface;
import android.widget.TextView;
import java.lang.ref.WeakReference;

final class qb extends jxh {
    final int a;
    final int b;
    final WeakReference c;
    final qg d;

    public qb(qg qg0, int v, int v1, WeakReference weakReference0) {
        this.d = qg0;
        this.a = v;
        this.b = v1;
        this.c = weakReference0;
        super();
    }

    @Override  // jxh
    public final void a(int v) {
    }

    @Override  // jxh
    public final void b(Typeface typeface0) {
        int v = this.a;
        if(v != -1) {
            typeface0 = Typeface.create(typeface0, v, (this.b & 2) != 0);
        }
        qg qg0 = this.d;
        WeakReference weakReference0 = this.c;
        if(qg0.c) {
            qg0.b = typeface0;
            TextView textView0 = (TextView)weakReference0.get();
            if(textView0 != null) {
                if(textView0.isAttachedToWindow()) {
                    textView0.post(new qc(textView0, typeface0, qg0.a));
                    return;
                }
                qg.b(textView0, typeface0, qg0.a);
            }
        }
    }
}

