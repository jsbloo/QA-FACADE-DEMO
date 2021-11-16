public class FrontEndDeveloper extends Developer {
    @Override
    public void writeCode() {
        System.out.println(name() + "Writes HTML/CSS/JavaScript");
    }

    public void pushToGithub(){
        System.out.println(name() + " Push to frontend repo");
    }

    @Override
    public String name() {
        return "Frontend Developer";
    }
}
