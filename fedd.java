public final class fedd implements Runnable {
    public final String a;

    public fedd(String s) {
        this.a = s;
    }

    @Override
    public final void run() {
        ffmn.e("AppCatalogService", "handlePackageAdded - packageName: %s", new Object[]{this.a});
    }
}

