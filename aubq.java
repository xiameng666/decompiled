import android.widget.Toast;

public final class aubq implements Runnable {
    public final aucd a;

    public aubq(aucd aucd0) {
        this.a = aucd0;
    }

    @Override
    public final void run() {
        Toast.makeText(this.a.m, "The selected device does not support Casting from this application.", 1).show();
    }
}

