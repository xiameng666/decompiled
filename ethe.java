import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.gms.tapandpay.firstparty.AccountInfo;
import com.google.android.gms.tapandpay.firstparty.CardInfo;

public abstract class ethe extends etsq {
    protected CardInfo j;
    protected AccountInfo k;
    protected String l;
    protected String m;
    protected evol n;
    protected long o;
    protected eutd p;
    protected etgl q;

    protected abstract int a();

    protected abstract String m();

    protected abstract void n();

    protected abstract void o();

    @Override  // etsq
    protected void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        this.setFinishOnTouchOutside(false);
        this.setContentView(0x7F0E0B98);  // layout:tp_dialog_layout
        CardInfo cardInfo0 = (CardInfo)dydw.b(this.getIntent(), "extra_card_info", CardInfo.CREATOR);
        batl.s(cardInfo0);
        this.j = cardInfo0;
        AccountInfo accountInfo0 = (AccountInfo)dydw.b(this.getIntent(), "extra_account_info", AccountInfo.CREATOR);
        batl.s(accountInfo0);
        this.k = accountInfo0;
        String s = this.getIntent().getStringExtra("extra_calling_package");
        batl.s(s);
        this.l = s;
        this.m = this.getIntent().getStringExtra("nodeId");
        this.o = this.getIntent().getLongExtra("mse_device_id", 0L);
        ((TextView)this.findViewById(0x7F0B2330)).setText(this.m());  // id:tp_request_prompt_text
        Button button0 = (Button)this.findViewById(0x7F0B2308);  // id:tp_button_negative
        Button button1 = (Button)this.findViewById(0x7F0B2309);  // id:tp_button_positive
        button0.setText(0x7F1507F2);  // string:common_cancel "Cancel"
        button0.setOnClickListener(new ethc(this, button0, button1));
        button1.setText(this.a());
        button1.setOnClickListener(new ethd(this, button0, button1));
        if(this.q == null) {
            this.q = new etgl(this);
        }
        if(this.q() && this.n == null) {
            fcfe fcfe0 = fcfo.d(this);
            String s1 = this.m;
            batl.s(s1);
            this.n = new evol(fcfe0, s1);
        }
        if(this.p() && this.p == null) {
            this.p = new eutd(new azts(this.getContainerActivity()), null, this.k, this.o);
        }
    }

    protected final boolean p() {
        return this.o > 0L;
    }

    protected final boolean q() {
        return !TextUtils.isEmpty(this.m);
    }
}

