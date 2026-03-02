import java.util.Locale;

final class igwx extends igwt {
    public igwx(igvt igvt0, String s) {
        super(igvt0, s, 4);
    }

    @Override  // igwt
    public final String toString() {
        return String.format(Locale.UK, "%1$d %2$s", ((short)this.e), new String[]{"Unspecified", "Cash", "Cheque", "Credit-Debit-card", "IEP", "CTA", "Direct-Debit-offline", "Invoicing", "Stored-Travel-Rights", "Loyalty-redemption", "Token", "Membership-benefit", "Auto-Renew", "Warrant", "Voucher", "Traveller=cheque"}[this.e]);
    }
}

