
package dur.ejb;

import javax.ejb.Stateless;


@Stateless
public class AnswerBean implements AnswerLocal {

    @Override
    public int answer() {
        return 42;
    }

    
    
}
