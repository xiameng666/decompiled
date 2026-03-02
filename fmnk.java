import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import com.google.android.material.button.MaterialButton;
import java.util.Locale;

public final class fmnk extends FrameLayout {
    public static final int[][] a;
    public final MaterialButton b;
    public boolean c;

    static {
        fmnk.a = new int[][]{new int[]{0x101009E}, new int[]{0xFEFEFF62}};
    }

    public fmnk(Context context0) {
        super(fmrf.b(context0, iaea.j()), null, 0);
        fmnk.inflate(this.getContext(), 0x7F0E08B8, this);  // layout:rich_card_button
        this.b = (MaterialButton)this.findViewById(0x7F0B0D7D);  // id:button
        this.setLayoutDirection(TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()));
    }

    @Override  // android.view.ViewGroup
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = this.getLayoutParams();
        if(viewGroup$LayoutParams0 != null && this.c) {
            viewGroup$LayoutParams0.width = -1;
            this.setLayoutParams(viewGroup$LayoutParams0);
        }
    }
}

