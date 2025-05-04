import org.apache.commons.pool2.Waiter;

import java.io.FilterWriter;
import java.io.IOException;
import java.io.Writer;

public class CoFilter extends FilterWriter {
    public CoFilter(Writer out){
        super(out);
    }
    public void write(String st) throws IOException {
        super.write(st.toLowerCase());
    }
}
