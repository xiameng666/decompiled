public final class fedm implements Runnable {
    public final String a;

    public fedm(String s) {
        this.a = s;
    }

    @Override
    public final void run() {
        ffmn.e("AppCatalogService", "handlePackageRemoved - packageName: %s", new Object[]{this.a});
    }
}

