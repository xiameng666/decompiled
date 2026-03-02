import android.os.Handler;
import android.widget.TextView;

final class amn implements lqj {
    final amo a;

    public amn(amo amo0) {
        this.a = amo0;
        super();
    }

    @Override  // lqj
    public final void jS(Object object0) {
        Handler handler0 = this.a.ag;
        Runnable runnable0 = this.a.ah;
        handler0.removeCallbacks(runnable0);
        TextView textView0 = this.a.am;
        if(textView0 != null) {
            textView0.setText(((CharSequence)object0));
        }
        handler0.postDelayed(runnable0, 2000L);
    }
}

