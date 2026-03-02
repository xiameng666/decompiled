import android.os.Message;
import android.view.View.OnClickListener;
import android.view.View;

final class in implements View.OnClickListener {
    final iu a;

    public in(iu iu0) {
        this.a = iu0;
        super();
    }

    @Override  // android.view.View$OnClickListener
    public void onClick(View view0) {
        Message message1;
        iu iu0 = this.a;
        if(view0 == iu0.j) {
            Message message0 = iu0.l;
            if(message0 != null) {
                message1 = Message.obtain(message0);
                goto label_19;
            }
            goto label_6;
        }
        else {
        label_6:
            if(view0 == iu0.m) {
                Message message2 = iu0.o;
                if(message2 != null) {
                    message1 = Message.obtain(message2);
                    goto label_19;
                }
                goto label_11;
            }
            else {
            label_11:
                if(view0 == iu0.p) {
                    Message message3 = iu0.r;
                    message1 = message3 == null ? null : Message.obtain(message3);
                }
                else {
                    message1 = null;
                }
            }
        }
    label_19:
        if(message1 != null) {
            message1.sendToTarget();
        }
        iu0.I.obtainMessage(1, iu0.b).sendToTarget();
    }
}

