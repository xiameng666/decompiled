import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout.LayoutParams;
import java.util.Locale;

public final class fmnm extends RecyclerView {
    public fmnm(Context context0) {
        int v = 0;
        super(context0, null, 0);
        if(iaea.i()) {
            FrameLayout.LayoutParams frameLayout$LayoutParams0 = new FrameLayout.LayoutParams(-2, -2);
            frameLayout$LayoutParams0.gravity = 0x800005;
            this.setLayoutParams(frameLayout$LayoutParams0);
        }
        else {
            LinearLayout.LayoutParams linearLayout$LayoutParams0 = new LinearLayout.LayoutParams(-2, -2);
            linearLayout$LayoutParams0.gravity = 0x800005;
            this.setLayoutParams(linearLayout$LayoutParams0);
        }
        this.setClipToPadding(false);
        this.setNestedScrollingEnabled(false);
        if(flbb.b(this.getContext())) {
            if(TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) != 1) {
                v = 1;
            }
            this.setLayoutDirection(v);
        }
    }
}

