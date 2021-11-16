public class Runner {
    public static void main(String[] args) {
        var facade = new DeveloperFacade();
        facade.startNewDay();
        facade.midDay();
        facade.endOfDay();
    }
}
