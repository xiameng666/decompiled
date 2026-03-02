import j..util.Objects;

final class azvu implements Runnable {
    final azvx a;

    public azvu(azvx azvx0) {
        Objects.requireNonNull(azvx0);
        this.a = azvx0;
        super();
    }

    @Override
    public final void run() {
        this.a.g.lock();
        try {
            this.a.g();
        }
        finally {
            this.a.g.unlock();
        }
    }
}

