public final class esoy implements evqc {
    public final espb a;

    public esoy(espb espb0) {
        this.a = espb0;
    }

    @Override  // evqc
    public final void gv(Exception exception0) {
        a.ae(espb.a.i(), "Unable to fetch pay capabilities, assuming wallet is not active.", exception0);
        espb.c(this.a.b, "com.google.android.gms.tapandpay.globalactions.WalletQuickAccessWalletService");
        espb.c(this.a.b, "com.google.android.gms.tapandpay.globalactions.QuickAccessWalletService");
    }
}

