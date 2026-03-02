public final class cqow implements Runnable {
    public final cqoy a;
    public final cqpb b;

    public cqow(cqoy cqoy0, cqpb cqpb0) {
        this.a = cqoy0;
        this.b = cqpb0;
    }

    @Override
    public final void run() {
        cqpi cqpi0 = this.a.a;
        cqpi0.ai = Boolean.valueOf(false);
        cqpb cqpb0 = this.b;
        cqpi0.U(cqpb0, false);
        if(cqpb0.c == 7) {
            cqjh cqjh0 = cqjh.a(cqpi0.requireContext());
            cqiy cqiy0 = new cqiy(cqpb0.a);
            cqpi.P(cqjh0.a.b(cqiy0, gmap.a), "Failed to update cached verified phone numbers");
        }
    }
}

