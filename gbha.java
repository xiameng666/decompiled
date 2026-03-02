import android.widget.Toast;

public final class gbha implements Runnable {
    public final gbhd a;

    public gbha(gbhd gbhd0) {
        this.a = gbhd0;
    }

    @Override
    public final void run() {
        Toast.makeText(this.a.a, String.format("Overriding client id with %s", 0), 0).show();
    }
}

