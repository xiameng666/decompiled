import android.content.Context;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;
import com.google.android.gms.credential.manager.util.FadeInImageView;

public class bgmw extends AppCompatImageView implements ejbp {
    private ejas a;
    private boolean b;

    public bgmw(Context context0) {
        super(context0);
        if(!this.isInEditMode()) {
            this.c();
        }
    }

    public bgmw(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        if(!this.isInEditMode()) {
            this.c();
        }
    }

    public bgmw(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        if(!this.isInEditMode()) {
            this.c();
        }
    }

    public final ejas b() {
        if(this.a == null) {
            this.a = new ejas(this);
        }
        return this.a;
    }

    protected final void c() {
        if(!this.b) {
            this.b = true;
            ((bgmh)this.h()).a(((FadeInImageView)this));
        }
    }

    @Override  // ejbp
    public final ejbo g() {
        return this.b();
    }

    @Override  // ejbo
    public final Object h() {
        return this.b().h();
    }
}

