import android.widget.Toast;

public final class auis implements Runnable {
    public final auiz a;
    public final int b;

    public auis(auiz auiz0, int v) {
        this.a = auiz0;
        this.b = v;
    }

    @Override
    public final void run() {
        String s = this.a.a.getResources().getString(this.b);
        Toast.makeText(this.a.a, s, 1).show();
    }
}

