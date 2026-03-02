import android.text.TextUtils;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.button.MaterialButton;

public final class sjm {
    public Button a;
    public TextView b;
    public LinearLayout c;
    private boolean d;

    public sjm() {
        this.d = false;
    }

    public final void a() {
        if(this.d) {
            this.b.setText(null);
            Button button0 = this.a;
            if((button0 instanceof MaterialButton)) {
                ((MaterialButton)button0).u(null);
            }
            this.a.setEnabled(true);
            this.a.setOnClickListener(null);
            this.b.setOnClickListener(null);
            this.c.setEnabled(true);
            this.c.setOnClickListener(null);
            this.c.setContentDescription(null);
        }
        else {
            this.a.setText(null);
            this.a.setCompoundDrawablesWithIntrinsicBounds(null, null, null, null);
            this.a.setOnClickListener(null);
            this.a.setEnabled(true);
        }
        if(TextUtils.isEmpty(null)) {
            this.a.setVisibility(8);
            if(this.d) {
                this.b.setVisibility(8);
                this.c.setVisibility(8);
            }
        }
        else {
            this.a.setVisibility(0);
            if(this.d) {
                this.b.setVisibility(0);
                this.c.setVisibility(0);
            }
        }
    }

    public final boolean b() {
        return this.a.getVisibility() == 0;
    }

    public static void c(sjm sjm0) {
        sjm0.d = true;
    }
}

