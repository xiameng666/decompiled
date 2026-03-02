import android.os.Bundle;
import android.os.Handler;
import android.widget.Button;
import androidx.core.widget.NestedScrollView;
import j..util.Objects;

final class fddr implements kij {
    public final NestedScrollView a;
    public final Button b;
    public final int c;
    public boolean d;
    final fdds e;

    public fddr(fdds fdds0, NestedScrollView nestedScrollView0, Button button0, Bundle bundle0, int v) {
        Objects.requireNonNull(fdds0);
        this.e = fdds0;
        super();
        this.a = nestedScrollView0;
        this.b = button0;
        this.c = v;
        this.d = bundle0 != null && bundle0.containsKey("has_scrolled_to_bottom") && bundle0.getBoolean("has_scrolled_to_bottom");
    }

    @Override  // kij
    public final void a(NestedScrollView nestedScrollView0, int v, int v1) {
        if(!this.a.canScrollVertically(1)) {
            this.d = true;
            Handler handler0 = this.b.getHandler();
            if(handler0 != null) {
                handler0.post(() -> this.b.setText((this.d ? 0x7F15364E : 0x7F15088C)));  // string:wearable_tos_accept_button_label "I agree"
            }
        }
    }

    // Detected as a lambda impl.
    public final void b() {
        this.b.setText((this.d ? 0x7F15364E : 0x7F15088C));  // string:wearable_tos_accept_button_label "I agree"
    }
}

