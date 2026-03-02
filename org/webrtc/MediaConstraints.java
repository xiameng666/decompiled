package org.webrtc;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MediaConstraints {
    public final List a;
    public final List b;

    public MediaConstraints() {
        this.a = new ArrayList();
        this.b = new ArrayList();
    }

    private static String a(List list0) {
        StringBuilder stringBuilder0 = new StringBuilder("[");
        Iterator iterator0 = list0.iterator();
        if(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            MediaConstraints.KeyValuePair mediaConstraints$KeyValuePair0 = (MediaConstraints.KeyValuePair)object0;
            if(stringBuilder0.length() > 1) {
                stringBuilder0.append(", ");
            }
            throw null;
        }
        stringBuilder0.append("]");
        return stringBuilder0.toString();
    }

    List getMandatory() {
        return this.a;
    }

    List getOptional() {
        return this.b;
    }

    @Override
    public final String toString() {
        return "mandatory: " + MediaConstraints.a(this.a) + ", optional: " + MediaConstraints.a(this.b);
    }
}

