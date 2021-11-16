import java.util.Collection;
import java.util.List;

public class DeveloperFacade {
    private final List<Developer> developers;

    public DeveloperFacade(){
        developers = List.of(
                new BackEndDeveloper(),
                new FrontEndDeveloper()
        );
    }

    public void startNewDay(){
        makeActions(developers, Developer.Action.DRINK_COFFEE, Developer.Action.ATTEND_MEETING);
    }

    public void midDay(){
        makeActions(developers, Developer.Action.WRITE_CODE);
    }

    public void endOfDay(){
        makeActions(developers, Developer.Action.PUSH_TO_GITHUB, Developer.Action.GO_HOME);
    }
    private static void makeActions(Collection<Developer> developers,
                                    Developer.Action... actions){
        developers.forEach(developer -> developer.action(actions));
    }
}
