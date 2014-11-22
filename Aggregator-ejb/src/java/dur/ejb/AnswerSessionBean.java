package dur.ejb;

import javax.ejb.Stateless;

@Stateless
public class AnswerSessionBean implements AnswerSessionBeanRemote {

    @Override
    public int lifeTheUniverseAndEverything() {
        return 42;
    }

}
