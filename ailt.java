import android.widget.Button;
import java.util.Arrays;
import java.util.List;

public abstract class ailt extends du {
    private long a;

    public ailt() {
        this.a = 0L;
    }

    public final void E() {
        this.a = 500L;
    }

    protected List gt() {
        return Arrays.asList(new Button[0]);
    }

    @Override  // du
    public final void onStart() {
        super.onStart();
        if(this.a > 0L) {
            List list0 = this.gt();
            if(!list0.isEmpty()) {
                for(Object object0: list0) {
                    ((Button)object0).setEnabled(false);
                    ((Button)object0).setAlpha(0.5f);
                }
                new clht().postDelayed(new ails(this), this.a);
            }
        }
    }

    public abstract String z();
}

