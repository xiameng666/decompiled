import android.widget.Button;

public final class dwdr implements Runnable {
    public final dwef a;

    public dwdr(dwef dwef0) {
        this.a = dwef0;
    }

    @Override
    public final void run() {
        dwef dwef0 = this.a;
        Button button0 = dwef0.am;
        Button button1 = null;
        if(button0 == null) {
            ibuq.j("acceptButton");
            button0 = null;
        }
        button0.setMaxLines(1);
        Button button2 = dwef0.am;
        if(button2 == null) {
            ibuq.j("acceptButton");
        }
        else {
            button1 = button2;
        }
        button1.setMinWidth(button0.getResources().getDimensionPixelSize(0x7F070CF0));  // dimen:notice_accept_screen_min_width
    }
}

