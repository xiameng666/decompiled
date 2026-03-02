import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import com.google.android.material.card.MaterialCardView;
import kotlin.jvm.internal.DefaultConstructorMarker;

@ibni
public abstract class fttm extends MaterialCardView {
    private boolean g;

    public fttm(Context context0) {
        ibuq.f(context0, "context");
        this(context0, null, 0, 6, null);
    }

    public fttm(Context context0, AttributeSet attributeSet0) {
        ibuq.f(context0, "context");
        this(context0, attributeSet0, 0, 4, null);
    }

    public fttm(Context context0, AttributeSet attributeSet0, int v) {
        ibuq.f(context0, "context");
        super(context0, attributeSet0, v);
        this.g = true;
    }

    public fttm(Context context0, AttributeSet attributeSet0, int v, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v1 & 2) != 0) {
            attributeSet0 = null;
        }
        if((v1 & 4) != 0) {
            v = 0;
        }
        this(context0, attributeSet0, v);
    }

    @ibni
    public abstract ImageView h();

    public final void i(Drawable drawable0) {
        this.h().setVisibility(0);
        this.h().setImageDrawable(drawable0);
    }

    @Override  // android.widget.FrameLayout
    protected final void onLayout(boolean z, int v, int v1, int v2, int v3) {
        super.onLayout(z, v, v1, v2, v3);
        this.ie(((float)(v2 - v)) * 0.035714f);
        this.f((this.g ? this.getContext().getResources().getDimension(0x7F071466) : 0.0f));  // dimen:wallet_card_elevation
        this.setClipToPadding(false);
    }

    @Override  // android.view.View
    public final void setOnClickListener(View.OnClickListener view$OnClickListener0) {
        super.setOnClickListener(view$OnClickListener0);
        funy.d(this);
    }
}

