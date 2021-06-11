package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Egg6 {

    private Needle7 needle7;
    @Autowired
    public void setNeedle7(Needle7 needle7) {
        this.needle7 = needle7;
    }
    public Needle7 getNeedle7(){
        return needle7;
    }
    @Override
    public String toString() {
        return ", в яйце иголка " + getNeedle7().toString();
    }
}
