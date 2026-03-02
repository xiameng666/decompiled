import java.io.DataInputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.Map.Entry;
import java.util.Map;

public final class czwb implements Runnable {
    public final czwf a;

    public czwb(czwf czwf0) {
        this.a = czwf0;
    }

    @Override
    public final void run() {
        czlg czlg2;
        czlg czlg1;
        czwf czwf0;
        try {
            czwf0 = this.a;
            cunf cunf0 = czkq.a;
            cunf0.b().h("[%s] Reader thread starts.", "MultiplexSocket");
        alab1:
            while(true) {
            label_3:
                if(czwf0.g) {
                    return;
                }
                DataInputStream dataInputStream0 = czwf0.d;
                int v = dataInputStream0.readInt();
                if(v < 0 || ((long)v) > hvog.X()) {
                    cunf0.e().i("[%s] Failed to read because received a invalid length %d", "MultiplexSocket", Integer.valueOf(v));
                }
                else {
                    byte[] arr_b = new byte[v];
                    dataInputStream0.readFully(arr_b);
                    gyty gyty0 = czvl.a(arr_b);
                    int v1 = 1;
                    if(gyty0 == null) {
                        Collection collection0 = czwf0.f.values();
                        if(collection0.size() != 1) {
                            continue;
                        }
                        Object object0 = collection0.iterator().next();
                        czlg czlg0 = (czlg)object0;
                        if(czlg0 == null) {
                            continue;
                            try {
                            label_20:
                                czlg0.i(new byte[]{((byte)(v >> 24)), ((byte)(v >>> 16 & 0xFF)), ((byte)(v >>> 8 & 0xFF)), ((byte)(v & 0xFF))});
                                czlg0.i(arr_b);
                            }
                            catch(IOException iOException1) {
                                czkq.a.c().f(iOException1).h("[%s] Received a Offline frame but failed to feed it to the client", "MultiplexSocket");
                            }
                            continue;
                        }
                        else {
                            goto label_20;
                        }
                    }
                    if(!czwf0.o()) {
                        czkq.a.b().h("[%s] Received a multiplex frame while not enabled, enable multiplex.", "MultiplexSocket");
                        czwf0.g();
                    }
                    int v2 = gytx.a(gyty0.f);
                    if(v2 == 0) {
                        v2 = 1;
                    }
                    String s = "";
                    switch(v2 - 1) {
                        case 1: {
                            byte[] arr_b1 = (gyty0.e == null ? gytz.a : gyty0.e).c.toByteArray();
                            gytz gytz0 = gyty0.e;
                            if(((gytz0 == null ? gytz.a : gytz0).b & 2) != 0) {
                                if(gytz0 == null) {
                                    gytz0 = gytz.a;
                                }
                                s = gytz0.d;
                            }
                            gytu gytu0 = gyty0.c == 3 ? ((gytu)gyty0.d) : gytu.a;
                            switch((gytt.a(gytu0.e) == 0 ? 1 : gytt.a(gytu0.e)) - 1) {
                                case 1: {
                                    czwf0.i(new czvs(czwf0, arr_b1, s));
                                    break;
                                }
                                case 2: {
                                    czwf0.i(new czvt(czwf0, arr_b1, s, gytu0));
                                    break;
                                }
                                case 3: {
                                    czwf0.i(new czvu(czwf0, arr_b1));
                                    break;
                                }
                                default: {
                                    cunf cunf2 = czkq.a.e();
                                    int v4 = gytt.a(gytu0.e);
                                    if(v4 != 0) {
                                        v1 = v4;
                                    }
                                    cunf2.i("[%s] Received an unknown frame type %s", "MultiplexSocket", Integer.valueOf(v1 - 1));
                                }
                            }
                            break alab1;
                        }
                        case 2: {
                            byte[] arr_b2 = (gyty0.e == null ? gytz.a : gyty0.e).c.toByteArray();
                            gytz gytz1 = gyty0.e;
                            if((2 & (gytz1 == null ? gytz.a : gytz1).b) != 0) {
                                if(gytz1 == null) {
                                    gytz1 = gytz.a;
                                }
                                s = gytz1.d;
                            }
                            gytv gytv0 = gyty0.c == 4 ? ((gytv)gyty0.d) : gytv.a;
                            String s1 = bbmu.c(arr_b2);
                            if(s.isEmpty()) {
                                czlg2 = (czlg)czwf0.f.get(s1);
                            }
                            else {
                                String s2 = bbmu.c(arr_b2);
                                cunf cunf3 = czkq.a.d();
                                Map map0 = czwf0.f;
                                cunf3.k("[%s] reMapAndGetVirtualSocket with serviceIdHashSalt=%s, saltedServiceIdHashKey=%s, virtualSockets=%s.", "MultiplexSocket", s, s2, map0);
                                for(Object object1: map0.entrySet()) {
                                    Map.Entry map$Entry0 = (Map.Entry)object1;
                                    try {
                                        String s3 = (String)map$Entry0.getKey();
                                        czlg1 = (czlg)map$Entry0.getValue();
                                        czvp czvp0 = (czvp)czlg1.f();
                                        if(!czvp0.a()) {
                                            continue;
                                        }
                                        if(!s.equals("RECEIVER_CONDIMENT") && !s3.equals(s2)) {
                                            map0.remove(s3);
                                            czvp0.b = s;
                                            map0.put(s2, czlg1);
                                        }
                                    }
                                    catch(IOException iOException2) {
                                        czkq.a.c().f(iOException2).h("[%s] Failed to remap the virtualSockets.", "MultiplexSocket");
                                        goto label_93;
                                    }
                                    czlg2 = czlg1;
                                    goto label_96;
                                }
                                czkq.a.c().h("[%s] Failed to remap the virtualSockets.", "MultiplexSocket");
                            label_93:
                                czlg2 = null;
                            }
                        label_96:
                            if(czlg2 == null) {
                                czkq.a.e().i("[%s] Received a DATA frame but there\'s no alive socket for salted service ID Hash Key %s.", "MultiplexSocket", s1);
                            }
                            else {
                                try {
                                    czlg2.i(gytv0.c.toByteArray());
                                }
                                catch(IOException iOException3) {
                                    czkq.a.c().f(iOException3).i("[%s] Received a DATA frame but failed to feed it to the client for salted service ID Hash Key %s.", "MultiplexSocket", s1);
                                }
                            }
                            break alab1;
                        }
                        default: {
                            cunf cunf1 = czkq.a.e();
                            int v3 = gytx.a(gyty0.f);
                            if(v3 != 0) {
                                v1 = v3;
                            }
                            cunf1.i("[%s] Received MultiplexFrame with unknown frame type %s", "MultiplexSocket", Integer.valueOf(v1 - 1));
                        }
                    }
                }
            }
        }
        catch(IOException iOException0) {
            if(czwf0.f.isEmpty()) {
                czkq.a.b().h("[%s] The reader thread stopped because all virtual socket closed.", "MultiplexSocket");
                return;
            }
            czkq.a.c().f(iOException0).h("[%s] The reader thread stopped because unexpected IOException", "MultiplexSocket");
            czwf0.j();
            return;
        }
        goto label_3;
    }
}

