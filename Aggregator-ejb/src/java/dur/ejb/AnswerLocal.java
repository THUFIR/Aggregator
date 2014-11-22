package dur.ejb;

import javax.ejb.Local;

@Local
public interface AnswerLocal {

    int answer();
    
}
