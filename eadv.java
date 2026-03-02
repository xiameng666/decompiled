import android.text.SpannableStringBuilder;

public final class eadv implements icih {
    final eaee a;

    public eadv(eaee eaee0) {
        this.a = eaee0;
        super();
    }

    @Override  // icih
    public final Object a(Object object0, ibrl ibrl0) {
        SpannableStringBuilder spannableStringBuilder0;
        dygo dygo0 = ((eaef)object0).a;
        if(dygo0 != null) {
            eaee eaee0 = this.a;
            if(dygo0 == dygo.a) {
                String s = eaee0.getString(0x7F151DED);  // string:pay_felica_tos_link_label "Osaifu-Keitai Terms of Service"
                ibuq.e(s, "getString(...)");
                spannableStringBuilder0 = new SpannableStringBuilder(eaee0.getString(0x7F151FEE, new Object[]{s}));  // string:pay_onboard_tos_felica_tos_guide_non_docomo "By continuing, you accept the 
                                                                                                                     // %1$s. Google will share your Google Account with FeliCa Networks, Inc. in order 
                                                                                                                     // to obtain existing eMoney card information."
                dzdt.U(spannableStringBuilder0, s, false, new eadn(eaee0));
            }
            else {
                String s1 = eaee0.getString(0x7F151CF7);  // string:pay_docomo_tos_link_label "Osaifu-Keitai Usage Regulations"
                ibuq.e(s1, "getString(...)");
                String s2 = eaee0.getString(0x7F151DED);  // string:pay_felica_tos_link_label "Osaifu-Keitai Terms of Service"
                ibuq.e(s2, "getString(...)");
                SpannableStringBuilder spannableStringBuilder1 = new SpannableStringBuilder(eaee0.getString(0x7F151FED, new Object[]{s1, s2}));  // string:pay_onboard_tos_felica_tos_guide_docomo "By continuing, you accept the %1$s 
                                                                                                                                                 // and the %2$s. Google will share your Google Account with FeliCa Networks, Inc. in 
                                                                                                                                                 // order to obtain existing eMoney card information."
                dzdt.U(spannableStringBuilder1, s2, false, new eadq(eaee0));
                dzdt.U(spannableStringBuilder1, s1, false, new eadr(eaee0));
                spannableStringBuilder0 = spannableStringBuilder1;
            }
            eaee0.A(spannableStringBuilder0);
        }
        return ibom.a;
    }
}

