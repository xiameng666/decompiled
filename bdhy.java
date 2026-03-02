import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public final class bdhy extends wby implements bdhz {
    private final bdhs a;
    private final evqp b;

    public bdhy() {
        super("com.google.android.gms.credential.manager.common.IPasswordCheckupResultCallback");
    }

    public bdhy(bdhs bdhs0, evqp evqp0) {
        super("com.google.android.gms.credential.manager.common.IPasswordCheckupResultCallback");
        this.a = bdhs0;
        this.b = evqp0;
    }

    @Override  // bdhz
    public final void a(Status status0, Bundle bundle0, List list0, ApiMetadata apiMetadata0) {
        bdik bdik0;
        if(!status0.e()) {
            aztb aztb0 = baqb.a(status0);
            this.b.a(aztb0);
            return;
        }
        if(bundle0 != null && list0 != null) {
            graw graw0 = (graw)((ProtoLiteMessage)grbi.a).v_newBuilder();
            try {
                Parser hfvs0 = (Parser)((ProtoLiteMessage)grbh.a).jf(7, null);
                if(!bundle0.containsKey("entity")) {
                    throw new IOException(String.format("Failed to parse bundle: does not contain key %s.", "entity"));
                }
                byte[] arr_b = bundle0.getByteArray("entity");
                if(arr_b == null) {
                    throw new IOException(String.format("Failed to parse bundle: empty result for key %s.", "entity"));
                }
                Object object0 = hfvs0.parseFrom(arr_b);
                Status status1 = (Status)bxom.a(bundle0, "status", Status.class);
                if(status1 == null) {
                    throw new IOException(String.format("Failed to parse bundle: failed to get result for key %s", "status"));
                }
                bdik0 = new bdik(status1, ((MessageLite)object0));
            }
            catch(IOException unused_ex) {
                aztb aztb1 = baqb.a(Status.d);
                this.b.a(aztb1);
                return;
            }
            if(bdik0.a.e()) {
                grbh grbh0 = (grbh)bdik0.b;
                if(!graw0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)graw0).ensureMutable();
                }
                ((grbi)graw0.b_message).c = grbh0;
                ((grbi)graw0.b_message).b |= 1;
                for(Object object1: list0) {
                    DataHolder dataHolder0 = (DataHolder)object1;
                    try {
                        bdhs bdhs0 = this.a;
                        ggdy ggdy0 = new ggdy();
                        for(int v = 0; v < dataHolder0.i; ++v) {
                            int v1 = dataHolder0.a(v);
                            byte[] arr_b1 = dataHolder0.h(bdhs0.b, v, v1);
                            ggdy0.i(bdhs0.a.parseFrom(arr_b1));
                        }
                        gged_interceptors gged0 = ggdy0.h();
                        if(!gged0.isEmpty()) {
                            graw0.a(gged0);
                        }
                    }
                    catch(hfur unused_ex) {
                        aztb aztb2 = baqb.a(Status.d);
                        this.b.a(aztb2);
                        return;
                    }
                    dataHolder0.close();
                }
                grbi grbi0 = (grbi)((ProtoLiteBuilder)graw0).N_build();
                this.b.b(grbi0);
                return;
            }
            aztb aztb3 = baqb.a(bdik0.a);
            this.b.a(aztb3);
            return;
        }
        aztb aztb4 = new aztb(new Status(8, "On success the summaryResult and CheckupResultDataHolder must never be null."));
        this.b.a(aztb4);
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        if(v == 1) {
            Status status0 = (Status)wbz.a(parcel0, Status.CREATOR);
            Bundle bundle0 = (Bundle)wbz.a(parcel0, Bundle.CREATOR);
            ArrayList arrayList0 = parcel0.createTypedArrayList(DataHolder.CREATOR);
            ApiMetadata apiMetadata0 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
            bdhy.gr(parcel0);
            this.a(status0, bundle0, arrayList0, apiMetadata0);
            return true;
        }
        return false;
    }
}

