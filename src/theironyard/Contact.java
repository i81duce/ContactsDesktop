package theironyard;//Created by KevinBozic on 2/16/16.

import com.sun.xml.internal.ws.api.ha.StickyFeature;

public class Contact {
    String name;
    String phoneNum;
    String email;

    public Contact(String name, String phoneNum, String email) {
        this.name = name;
        this.phoneNum = phoneNum;
        this.email = email;
    }

    @Override
    public String toString() {
        return String.format("%s, %s, %s", name, phoneNum, email);
    }
}
