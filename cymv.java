final class cymv {
    public final int a;
    private final long b;

    public cymv(int v, long v1) {
        this.a = v;
        this.b = v1;
    }

    @Override
    public final String toString() {
        switch(this.a - 1) {
            case 1: {
                return "Blocking time:" + (this.b + " seconds");
            }
            case 2: {
                return "Blocking time:" + ("Full blocked " + this.b + " seconds");
            }
            default: {
                return "Blocking time:Not blocked";
            }
        }
    }
}

