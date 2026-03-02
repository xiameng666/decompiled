import android.content.Context;
import android.widget.Toast;

public final class ekgl implements Runnable {
    public final ekgm a;
    public final Context b;

    public ekgl(ekgm ekgm0, Context context0) {
        this.a = ekgm0;
        this.b = context0;
    }

    @Override
    public final void run() {
        String s = this.b.getResources().getQuantityString(0x7F130072, this.a.b, new Object[]{((int)this.a.b)});  // plurals:romanesco_restored_contacts_count_toast
        Toast.makeText(this.b, s, 1).show();
    }
}

