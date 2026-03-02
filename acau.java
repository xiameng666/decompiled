import j..util.Objects;

final class acau implements Runnable {
    final acav a;

    public acau(acav acav0) {
        Objects.requireNonNull(acav0);
        this.a = acav0;
        super();
    }

    @Override
    public final void run() {
        this.a.a.n.setSelection(this.a.a.n.getText().length());
    }
}

