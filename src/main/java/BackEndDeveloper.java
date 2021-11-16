public class BackEndDeveloper extends Developer{
    @Override
    public void writeCode() {
        System.out.println(name()+" Write Java code");
    }

    public void pushToGithub(){
        System.out.println(name()+" Push to backend repo");
    }

    @Override
    public String name() {
        return "Backend Developer";
    }
}
