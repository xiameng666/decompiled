import android.view.View.OnClickListener;
import android.view.View;

public final class dwfk implements View.OnClickListener {
    public final dwfo a;

    public dwfk(dwfo dwfo0) {
        this.a = dwfo0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        dwfo dwfo0 = this.a;
        dsio dsio0 = dwfo0.ah;
        dsik dsik0 = new dsik("barcode_image_picker_dialog");
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)donh.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((donh)hftp0.b_message).c = true;
        dsio0.b(dsik0, ((donh)hftp0.N_build()));
        dwfo0.B();
    }
}

