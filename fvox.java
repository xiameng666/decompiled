import java.io.File;

public final class fvox implements Runnable {
    public final fvpk a;

    public fvox(fvpk fvpk0) {
        this.a = fvpk0;
    }

    @Override
    public final void run() {
        fyba.c(new File(this.a.i));
    }
}

