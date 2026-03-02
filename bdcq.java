import com.google.android.material.button.MaterialButton;

public final class bdcq implements ibts {
    public final MaterialButton a;

    public bdcq(MaterialButton materialButton0) {
        this.a = materialButton0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        int v;
        ibuq.f(((bddf)object0), "text");
        switch(((bddf)object0).ordinal()) {
            case 0: {
                v = 0x7F152717;  // string:pwm_move_passwords_save_passwords "Save passwords"
                break;
            }
            case 1: {
                v = 0x7F150808;  // string:common_choose_account "Choose account"
                break;
            }
            case 2: {
                v = 0x7F152718;  // string:pwm_move_passwords_saving_passwords "Saving passwords"
                break;
            }
            default: {
                throw new ibnq();
            }
        }
        this.a.setText(v);
        return ibom.a;
    }
}

