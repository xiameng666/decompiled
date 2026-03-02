import j..util.Objects;

final class bmqs implements Runnable {
    final bmqw a;

    public bmqs(bmqw bmqw0) {
        Objects.requireNonNull(bmqw0);
        this.a = bmqw0;
        super();
    }

    @Override
    public final void run() {
        int v = this.a.e.getResources().getColor(0x7F0602C1, null);  // color:fido_hint_color
        this.a.e.setTextColor(v);
        this.a.e.setText("Touch sensor");
        this.a.d.setImageResource(0x7F080711);  // drawable:ic_fingerprint_googblue600_48
    }
}

