import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

public final class kgw extends ClickableSpan {
    private final int a;
    private final khb b;
    private final int c;

    public kgw(int v, khb khb0, int v1) {
        this.a = v;
        this.b = khb0;
        this.c = v1;
    }

    @Override  // android.text.style.ClickableSpan
    public void onClick(View view0) {
        Bundle bundle0 = new Bundle();
        bundle0.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.a);
        this.b.a.performAction(this.c, bundle0);
    }
}

