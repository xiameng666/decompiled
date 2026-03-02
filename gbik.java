import android.widget.Toast;
import java.util.Arrays;

public final class gbik implements Runnable {
    public final gbil a;
    public final String b;

    public gbik(gbil gbil0, String s) {
        this.a = gbil0;
        this.b = s;
    }

    @Override
    public final void run() {
        String s = String.format("Overriding MCC/MNC with %s", Arrays.copyOf(new Object[]{this.b}, 1));
        ibuq.e(s, "format(...)");
        Toast.makeText(this.a.a, s, 0).show();
    }
}

