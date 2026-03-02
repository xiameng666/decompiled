import android.widget.SectionIndexer;
import com.google.android.gms.appinvite.model.ContactPerson;

public abstract class accz extends tk implements SectionIndexer {
    protected boolean a;
    protected int e;

    public CharSequence G() {
        return null;
    }

    public void H() {
    }

    public abstract void I(ContactPerson arg1);

    public abstract void J(ContactPerson arg1);

    public abstract void K(ContactPerson arg1, int arg2);

    protected void L() {
    }

    protected abstract void M(boolean arg1);

    public void N(boolean z) {
    }

    public void O(boolean z) {
    }

    public void P(boolean z) {
    }

    public final void Q(int v) {
        this.e = v;
        this.L();
    }

    public void R(CharSequence charSequence0) {
    }

    public void S(CharSequence charSequence0) {
    }

    public final void T(boolean z) {
        if(z != this.a) {
            this.a = z;
            this.M(z);
        }
    }

    public void U(CharSequence charSequence0) {
    }

    public abstract void V(boolean arg1);

    public abstract int f();

    public abstract int n(int arg1);
}

