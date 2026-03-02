import android.view.View.OnClickListener;
import android.view.View;

public final class bukq implements View.OnClickListener {
    public final bukv a;

    public bukq(bukv bukv0) {
        this.a = bukv0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        bukv bukv0 = this.a;
        bukv0.D(true);
        switch(bukv0.d.i) {
            case 0: {
                throw null;
            }
            case 2: {
                bukv0.G();
                break;
            }
            default: {
                bukv0.F();
            }
        }
        bukv0.aw.an(bukv0.d);
    }
}

