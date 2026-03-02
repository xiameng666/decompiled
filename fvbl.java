public final class fvbl implements Runnable {
    public final fvbn a;

    public fvbl(fvbn fvbn0) {
        this.a = fvbn0;
    }

    @Override
    public final void run() {
        this.a.a.t = true;
    }
}

