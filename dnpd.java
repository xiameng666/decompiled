enum dnpd {
    CARD(0x7F151BDD, 0x7F080535),  // string:pay_additem_new_credit_or_debit_card "New credit or debit card"
    BANK(0x7F151B8F, 0x7F0804B3);  // string:pay_add_bank_account "Link an account"

    public final int c;
    public final int d;

    static {
        dnpd.e = arr_dnpd;
        ibsn.a(arr_dnpd);
    }

    private dnpd(int v1, int v2) {
        this.c = v1;
        this.d = v2;
    }
}

