import android.content.Context;
import android.util.AttributeSet;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.gms.credential.manager.util.LottieView;

public class bgmx extends LottieAnimationView implements ejbp {
    private ejas f;
    private boolean g;

    public bgmx(Context context0) {
        super(context0);
        if(!this.isInEditMode()) {
            this.B();
        }
    }

    public bgmx(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        if(!this.isInEditMode()) {
            this.B();
        }
    }

    public bgmx(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        if(!this.isInEditMode()) {
            this.B();
        }
    }

    public final ejas A() {
        if(this.f == null) {
            this.f = new ejas(this);
        }
        return this.f;
    }

    protected final void B() {
        if(!this.g) {
            this.g = true;
            ((bgmr)this.h()).b(((LottieView)this));
        }
    }

    @Override  // ejbp
    public final ejbo g() {
        return this.A();
    }

    @Override  // ejbo
    public final Object h() {
        return this.A().h();
    }
}

