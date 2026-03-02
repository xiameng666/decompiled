public abstract class gxum implements Runnable {
    public final String m;

    public gxum(String s) {
        this.m = s;
    }

    @Override
    public final String toString() {
        return "Runnable[" + this.m + "]";
    }
}

