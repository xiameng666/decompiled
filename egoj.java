public final class egoj implements Runnable {
    public final egoo a;

    public egoj(egoo egoo0) {
        this.a = egoo0;
    }

    @Override
    public final void run() {
        efur efur0 = efur.i(this.a.getContext());
        batl.k(null);
        efur0.a.edit().putBoolean("is_first_sync", false).commit();
        this.a.z();
    }
}

