import java.util.Arrays;

public abstract class Developer {

    public void drinkCoffee(){
        System.out.println(name()+" Drink a nice cup of coffee");
    }
    public void attendMeeting(){
        System.out.println(name()+" Go to boring meeting");
    }


    public void goHome(){
        System.out.println(name()+" Goes on train home");
    }

    private void action(Action action){
        switch (action) {
            case WRITE_CODE -> writeCode();
            case DRINK_COFFEE -> drinkCoffee();
            case ATTEND_MEETING -> attendMeeting();
            case PUSH_TO_GITHUB -> pushToGithub();
            case GO_HOME -> goHome();
        }
    }

    public void action(Action... actions){
        Arrays.stream(actions).forEach(this::action);
    }

    public abstract void writeCode();
    public abstract void pushToGithub();
    public abstract String name();

    enum Action {
        WRITE_CODE, DRINK_COFFEE, ATTEND_MEETING, PUSH_TO_GITHUB
        , GO_HOME
    }
}
