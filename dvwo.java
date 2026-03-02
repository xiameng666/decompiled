import android.view.View.OnLongClickListener;
import android.view.View;
import android.widget.Toast;

public final class dvwo implements View.OnLongClickListener {
    @Override  // android.view.View$OnLongClickListener
    public final boolean onLongClick(View view0) {
        Toast.makeText(view0.getContext(), 0x7F151C6B, 1).show();  // string:pay_close_button_a11y_toast_description "Close verification screen"
        return true;
    }
}

