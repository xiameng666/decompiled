import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

public final class bunn extends ConstraintLayout {
    public final TextView h;
    public final TextView i;
    private final View j;

    public bunn(Context context0) {
        ibuq.f(context0, "context");
        ibuq.f(context0, "context");
        super(context0, null);
        View view0 = LayoutInflater.from(context0).inflate(0x7F0E04F1, this, true);  // layout:ineligible_view
        ibuq.e(view0, "inflate(...)");
        this.j = view0;
        Object object0 = kfb.b(view0, 0x7F0B22B8);  // id:title
        ibuq.e(object0, "requireViewById(...)");
        this.h = (TextView)object0;
        Object object1 = kfb.b(view0, 0x7F0B2121);  // id:subtitle
        ibuq.e(object1, "requireViewById(...)");
        this.i = (TextView)object1;
    }
}

