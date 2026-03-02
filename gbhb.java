import android.widget.Toast;

public final class gbhb implements Runnable {
    public final gbhd a;
    public final String b;

    public gbhb(gbhd gbhd0, String s) {
        this.a = gbhd0;
        this.b = s;
    }

    @Override
    public final void run() {
        Toast.makeText(this.a.a, String.format("Overriding MCC/MNC with %s", this.b), 0).show();
    }
}

