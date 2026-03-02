import android.net.TrafficStats;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.URI;
import java.nio.channels.Channels;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;

public final class bnhe implements Runnable {
    public final bnhh a;

    public bnhe(bnhh bnhh0) {
        this.a = bnhh0;
    }

    @Override
    public final void run() {
        Socket socket0;
        ((ggtj)bnhh.a.h()).x("runReader()");
        bnhh bnhh0 = this.a;
        try {
            TrafficStats.setThreadStatsTag(0x10000);
            socket0 = bnhh0.a();
            __monitor_enter(bnhh0);
        }
        catch(bnhj bnhj0) {
            goto label_138;
        }
        catch(IOException iOException0) {
            goto label_143;
        }
        catch(Throwable throwable0) {
            bnhh0.b();
            throw throwable0;
        }
        try {
            if(bnhh0.c == bnhg.e) {
                try {
                    bmzx.c("HYBRID_WEBSOCKET_CLOSED", null);
                    socket0.close();
                }
                catch(IOException iOException1) {
                    a.ae(bnhh.a.i(), "Socket failed to close", iOException1);
                }
                goto label_15;
            }
            else {
                bnhh0.d = socket0;
                goto label_23;
            }
            goto label_146;
        }
        catch(Throwable throwable1) {
            try {
                TrafficStats.clearThreadStatsTag();
                throw throwable1;
            label_15:
                TrafficStats.clearThreadStatsTag();
            }
            catch(Throwable throwable2) {
                goto label_21;
            }
        }
        try {
            __monitor_exit(bnhh0);
            goto label_146;
        }
        catch(bnhj bnhj0) {
            goto label_138;
        }
        catch(IOException iOException0) {
            goto label_143;
        }
        catch(Throwable throwable0) {
            bnhh0.b();
            throw throwable0;
        }
        try {
            bnhh0.d = socket0;
            goto label_23;
        }
        catch(Throwable throwable2) {
            try {
                try {
                label_21:
                    __monitor_exit(bnhh0);
                    throw throwable2;
                label_23:
                    __monitor_exit(bnhh0);
                    DataInputStream dataInputStream0 = new DataInputStream(socket0.getInputStream());
                    OutputStream outputStream0 = socket0.getOutputStream();
                    bboh bboh0 = bnhh.a;
                    ((ggtj)bboh0.h()).x("doHandShake()");
                    bnhk bnhk0 = bnhh0.h;
                    URI uRI0 = bnhk0.b;
                    String s = uRI0.getPath();
                    String s1 = uRI0.getHost();
                    if(s1 == null) {
                        bmzx.c("UNKNOWN", "WEBSOCKET_INVALID_HOST");
                        throw new bnhj("null host");
                    }
                    if(uRI0.getPort() != -1) {
                        s1 = s1 + ":" + uRI0.getPort();
                    }
                    LinkedHashMap linkedHashMap0 = new LinkedHashMap();
                    linkedHashMap0.put("Host", s1);
                    linkedHashMap0.put("Upgrade", "websocket");
                    linkedHashMap0.put("Connection", "Upgrade");
                    linkedHashMap0.put("Sec-WebSocket-Version", "13");
                    linkedHashMap0.put("Sec-WebSocket-Key", bnhk0.d);
                    Map map0 = bnhk0.e;
                    for(Object object0: map0.keySet()) {
                        String s2 = (String)object0;
                        if(!linkedHashMap0.containsKey(s2)) {
                            linkedHashMap0.put(s2, ((String)map0.get(s2)));
                        }
                    }
                    linkedHashMap0.put("Sec-WebSocket-Protocol", bnhk0.c);
                    StringBuilder stringBuilder0 = new StringBuilder("GET ");
                    stringBuilder0.append(s);
                    stringBuilder0.append(" HTTP/1.1\r\n");
                    StringBuilder stringBuilder1 = new StringBuilder();
                    for(Object object1: linkedHashMap0.keySet()) {
                        stringBuilder1.append(((String)object1));
                        stringBuilder1.append(": ");
                        stringBuilder1.append(((String)linkedHashMap0.get(((String)object1))));
                        stringBuilder1.append("\r\n");
                    }
                    stringBuilder0.append(stringBuilder1.toString());
                    stringBuilder0.append("\r\n");
                    bboh bboh1 = bnhk.a;
                    ((ggtj)bboh1.h()).B("handshakeString: %s", stringBuilder0);
                    outputStream0.write(((byte[])stringBuilder0.toString().getBytes().clone()));
                    byte[] arr_b = new byte[1000];
                    ArrayList arrayList0 = new ArrayList();
                    int v = 0;
                    boolean z = false;
                    while(!z) {
                        int v1 = dataInputStream0.read();
                        if(v1 == -1) {
                            bmzx.c("UNKNOWN", "WEBSOCKET_CONNECTION_CLOSED");
                            throw new bnhj("Connection closed before handshake was complete");
                        }
                        arr_b[v] = (byte)v1;
                        if(v + 1 >= 2 && arr_b[v] == 10 && arr_b[v - 1] == 13) {
                            String s3 = new String(arr_b, bnhh.b);
                            if(s3.trim().isEmpty()) {
                                z = true;
                            }
                            else {
                                arrayList0.add(s3.trim());
                            }
                            arr_b = new byte[1000];
                            v = 0;
                        }
                        else {
                            if(v + 1 == 1000) {
                                bmzx.c("UNKNOWN", "WEBSOCKET_INVALID_HANDSHAKE");
                                throw new bnhj("Unexpected long line in handshake: " + new String(arr_b, bnhh.b));
                            }
                            ++v;
                        }
                    }
                    String s4 = (String)arrayList0.get(0);
                    ((ggtj)bboh1.h()).B("verifyServerStatusLine: %s", s4);
                    int v2 = Integer.parseInt(s4.substring(9, 12));
                    switch(v2) {
                        case 101: {
                            goto label_99;
                        }
                        case 404: {
                            bmzx.c("UNKNOWN", String.format("%s_[%s]", "WEBSOCKET_SERVER_STATUS", "STATUS_NOT_FOUND"));
                            throw new bnhj("connection failed: 404: not found");
                        }
                        case 407: {
                            bmzx.c("UNKNOWN", String.format("%s_[%s]", "WEBSOCKET_SERVER_STATUS", "STATUS_AUTH_NOT_SUPPORTED"));
                            throw new bnhj("connection failed: proxy authentication not supported");
                        }
                        case 410: {
                            bmzx.c("UNKNOWN", String.format("%s_[%s]", "WEBSOCKET_SERVER_STATUS", "STATUS_GONE"));
                            throw new bnhj();
                        }
                    }
                    bmzx.c("UNKNOWN", String.format("%s_[%s]", "WEBSOCKET_SERVER_STATUS", "UNKNOWN_CODE"));
                    throw new bnhj("connection failed: unknown status code " + v2);
                label_99:
                    arrayList0.remove(0);
                    TreeMap treeMap0 = new TreeMap(String.CASE_INSENSITIVE_ORDER);
                    int v3 = arrayList0.size();
                    boolean z1 = false;
                    for(int v4 = 0; v4 < v3; ++v4) {
                        String s5 = (String)arrayList0.get(v4);
                        String[] arr_s = s5.split(": ", 2);
                        if(arr_s.length == 2) {
                            treeMap0.put(arr_s[0], arr_s[1]);
                        }
                        else {
                            ((ggtj)bboh0.i()).B("Invalid header line in WebSocket handshake: %s", s5);
                            z1 = true;
                        }
                    }
                    if(z1) {
                        ((ggtj)bboh0.i()).B("Possible invalid headers in WebSocket handshake: %s", treeMap0);
                    }
                    bnhi bnhi0 = bnhh0.e;
                    bnhi0.e(treeMap0);
                    ((ggtj)bboh1.h()).B("verifyServerHandshakeHeaders: %s", treeMap0);
                    if(treeMap0.get("Upgrade") == null || !((String)treeMap0.get("Upgrade")).toLowerCase(Locale.US).equals("websocket")) {
                        bmzx.c("UNKNOWN", "WEBSOCKET_INVALID_HEADER");
                        throw new bnhj("connection failed: missing header field in server handshake: Upgrade");
                    }
                    if(treeMap0.get("Connection") == null || !((String)treeMap0.get("Connection")).toLowerCase(Locale.US).equals("upgrade")) {
                        bmzx.c("UNKNOWN", "WEBSOCKET_INVALID_HEADER");
                        throw new bnhj("connection failed: missing header field in server handshake: Connection");
                    }
                    bnhh0.g.a = Channels.newChannel(outputStream0);
                    bnhh0.f.a = dataInputStream0;
                    bnhh0.c = bnhg.c;
                    bnhi0.b();
                    bnhh0.f.a();
                }
                catch(bnhj bnhj0) {
                label_138:
                    a.ae(bnhh.a.i(), "Exception during running reader", bnhj0);
                    bmzx.c("UNKNOWN", "WEBSOCKET_RECEIVER_ERROR");
                    bnhh0.e.d(bnhj0);
                }
                catch(IOException iOException0) {
                label_143:
                    a.ae(bnhh.a.i(), "Exception while connecting", iOException0);
                    bmzx.c("UNKNOWN", "WEBSOCKET_RECEIVER_ERROR");
                    bnhh0.e.d(new bnhj(a.ac(iOException0, "error while connecting: "), iOException0));
                }
            }
            catch(Throwable throwable0) {
                bnhh0.b();
                throw throwable0;
            }
        }
    label_146:
        bnhh0.b();
    }
}

